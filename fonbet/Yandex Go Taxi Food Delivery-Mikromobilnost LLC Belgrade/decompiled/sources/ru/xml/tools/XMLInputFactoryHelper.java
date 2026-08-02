package ru.xml.tools;

import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.xml.stream.XMLInputFactory;

/* loaded from: classes4.dex */
public class XMLInputFactoryHelper {
    private static final String XML_INPUT_FACTORY = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.xml.tools.XMLInputFactoryHelper.1
        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty("javax.xml.stream.XMLInputFactory");
        }
    });

    private XMLInputFactoryHelper() {
    }

    public static XMLInputFactory newInstance() {
        String str = XML_INPUT_FACTORY;
        return str == null ? XMLInputFactory.newInstance() : XMLInputFactory.newInstance(str, (ClassLoader) null);
    }
}
