package ru.CryptoPro.JCP.Util;

import defpackage.kbs;
import defpackage.oyr;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public class GetProperty {
    public static boolean getBooleanProperty(String str, boolean z, boolean z2) {
        String str2 = (String) AccessController.doPrivileged(new GetPropertyAction(str, z2));
        if (str2 == null) {
            return z;
        }
        if (str2.equalsIgnoreCase("false")) {
            return false;
        }
        if (str2.equalsIgnoreCase("true")) {
            return true;
        }
        kbs.g(oyr.p("Value of ", str, " must either be 'true' or 'false'"));
        return false;
    }

    public static int getIntegerProperty(String str, int i) {
        String str2 = (String) AccessController.doPrivileged(new GetPropertyAction(str, false));
        return str2 == null ? i : Integer.parseInt(str2);
    }

    public static String getStringProperty(String str, String str2) {
        String str3 = (String) AccessController.doPrivileged(new GetPropertyAction(str, false));
        return str3 == null ? str2 : str3;
    }

    public static void main(final String[] strArr) throws Exception {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.Util.GetProperty.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                String[] strArr2 = strArr;
                if (strArr2 != null && strArr2.length == 1 && strArr2[0].length() != 0) {
                    String str = strArr[0];
                }
                System.out.getClass();
                return null;
            }
        });
    }

    public static String getStringProperty(String str, String str2, boolean z) {
        String str3 = (String) AccessController.doPrivileged(new GetPropertyAction(str, z));
        return str3 == null ? str2 : str3;
    }

    public static boolean getBooleanProperty(String str, boolean z) {
        return getBooleanProperty(str, z, false);
    }
}
