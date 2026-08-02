package ru.CryptoPro.ssl.util;

import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyr;
import java.security.AccessController;
import java.security.AlgorithmConstraints;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class AbstractAlgorithmConstraints implements AlgorithmConstraints {
    public final AlgorithmDecomposer a;

    public AbstractAlgorithmConstraints(AlgorithmDecomposer algorithmDecomposer) {
        this.a = algorithmDecomposer;
    }

    public static boolean a(String[] strArr, String str, AlgorithmDecomposer algorithmDecomposer) {
        if (str == null || str.length() == 0) {
            ny61.g("No algorithm name specified");
            return false;
        }
        Set set = null;
        for (String str2 : strArr) {
            if (str2 != null && !str2.isEmpty()) {
                if (str2.equalsIgnoreCase(str)) {
                    return false;
                }
                if (set == null) {
                    set = algorithmDecomposer.decompose(str);
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (str2.equalsIgnoreCase((String) it.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static String[] b(String str, Map map) {
        String[] strArr;
        synchronized (map) {
            try {
                if (!map.containsKey(str)) {
                    c(str, map);
                }
                strArr = (String[]) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return strArr;
    }

    public static void c(final String str, Map map) {
        String[] strArr;
        String str2 = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.ssl.util.AbstractAlgorithmConstraints.1
            @Override // java.security.PrivilegedAction
            public String run() {
                return Security.getProperty(str);
            }
        });
        if (str2 == null || str2.isEmpty()) {
            strArr = null;
        } else {
            if (str2.charAt(0) == '\"' && g8e.a(1, str2) == '\"') {
                str2 = oyr.g(1, 1, str2);
            }
            strArr = str2.split(",");
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = strArr[i].trim();
            }
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        map.put(str, strArr);
    }
}
