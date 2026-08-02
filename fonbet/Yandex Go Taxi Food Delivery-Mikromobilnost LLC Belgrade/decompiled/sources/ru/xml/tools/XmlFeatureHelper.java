package ru.xml.tools;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public class XmlFeatureHelper {
    public static final boolean XML_XXE_PROTECTED = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.xml.tools.XmlFeatureHelper.1
        @Override // java.security.PrivilegedAction
        public Boolean run() {
            String property = System.getProperty("xml_xxe_protected");
            return (property == null || !property.equalsIgnoreCase("false")) ? Boolean.TRUE : Boolean.FALSE;
        }
    })).booleanValue();
}
