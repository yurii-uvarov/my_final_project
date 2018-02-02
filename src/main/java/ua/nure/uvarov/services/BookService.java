package ua.nure.uvarov.services;

import ua.nure.uvarov.entity.Book;
import ua.nure.uvarov.entity.BookGroup;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface BookService {

    List<BookGroup> getGroups();
    Book getById(int id);
    BookGroup getBookByParameters(BookParams bookParams);


    int createBookGroup(BookGroup bookGroup);
    BookGroup getBookGroup(String guid);
    List<BookGroup> getBookGroups();
    boolean updateBookGroup(BookGroup bookGroup);
    BookGroup getBook (HttpServletRequest request);


}
