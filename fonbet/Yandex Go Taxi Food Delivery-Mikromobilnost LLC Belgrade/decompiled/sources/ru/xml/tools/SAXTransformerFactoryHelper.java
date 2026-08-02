package ru.xml.tools;

import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.xml.transform.TransformerFactory;

/* loaded from: classes4.dex */
public class SAXTransformerFactoryHelper {
    private static final String XML_SAX_TRANSFORM_FACTORY = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.xml.tools.SAXTransformerFactoryHelper.1
        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty("javax.xml.transform.TransformerFactory");
        }
    });

    private SAXTransformerFactoryHelper() {
    }

    public static TransformerFactory newInstance() {
        String str = XML_SAX_TRANSFORM_FACTORY;
        return str == null ? TransformerFactory.newInstance() : TransformerFactory.newInstance(str, null);
    }
}
