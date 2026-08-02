package ru.xml.tools;

import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.xml.transform.TransformerFactory;

/* loaded from: classes4.dex */
public class TransformerFactoryHelper {
    private static final String XML_TRANSFORM_FACTORY = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.xml.tools.TransformerFactoryHelper.1
        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty("javax.xml.transform.TransformerFactory");
        }
    });

    private TransformerFactoryHelper() {
    }

    public static TransformerFactory newInstance() {
        String str = XML_TRANSFORM_FACTORY;
        return str == null ? TransformerFactory.newInstance() : TransformerFactory.newInstance(str, null);
    }
}
