package ru.CryptoPro.JCP.Util;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public class GetProperties {
    public static void main(String[] strArr) throws Exception {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.Util.GetProperties.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                Enumeration<?> propertyNames = System.getProperties().propertyNames();
                while (propertyNames.hasMoreElements()) {
                    propertyNames.nextElement().toString();
                    System.out.getClass();
                }
                return null;
            }
        });
    }
}
