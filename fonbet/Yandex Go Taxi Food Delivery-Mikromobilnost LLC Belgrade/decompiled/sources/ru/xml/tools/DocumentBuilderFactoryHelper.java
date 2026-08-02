package ru.xml.tools;

import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.xml.parsers.DocumentBuilderFactory;

/* loaded from: classes4.dex */
public class DocumentBuilderFactoryHelper {
    private static final String XML_DOCUMENT_BUILDER_FACTORY = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.xml.tools.DocumentBuilderFactoryHelper.1
        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty("javax.xml.parsers.DocumentBuilderFactory");
        }
    });

    private DocumentBuilderFactoryHelper() {
    }

    public static DocumentBuilderFactory newInstance() {
        String str = XML_DOCUMENT_BUILDER_FACTORY;
        return str == null ? DocumentBuilderFactory.newInstance() : DocumentBuilderFactory.newInstance(str, null);
    }
}
