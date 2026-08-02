package ru.xml.tools;

import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.xml.parsers.SAXParserFactory;

/* loaded from: classes4.dex */
public class SAXParserFactoryHelper {
    private static final String XML_SAX_PARSER_FACTORY = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.xml.tools.SAXParserFactoryHelper.1
        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty("javax.xml.parsers.SAXParserFactory");
        }
    });

    private SAXParserFactoryHelper() {
    }

    public static SAXParserFactory newInstance() {
        String str = XML_SAX_PARSER_FACTORY;
        return str == null ? SAXParserFactory.newInstance() : SAXParserFactory.newInstance(str, null);
    }
}
