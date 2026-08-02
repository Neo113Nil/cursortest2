package ru.xml.tools;

import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.xml.validation.SchemaFactory;

/* loaded from: classes4.dex */
public class SchemaFactoryHelper {
    private static final String XML_SCHEMA_FACTORY = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.xml.tools.SchemaFactoryHelper.1
        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty("javax.xml.validation.SchemaFactory");
        }
    });

    private SchemaFactoryHelper() {
    }

    public static SchemaFactory newInstance(String str) {
        String str2 = XML_SCHEMA_FACTORY;
        return str2 == null ? SchemaFactory.newInstance(str) : SchemaFactory.newInstance(str, str2, null);
    }
}
