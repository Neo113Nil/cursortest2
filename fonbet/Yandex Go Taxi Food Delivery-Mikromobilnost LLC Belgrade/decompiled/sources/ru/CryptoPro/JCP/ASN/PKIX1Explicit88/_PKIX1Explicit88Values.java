package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.StringTokenizer;
import java.util.Vector;

/* loaded from: classes4.dex */
public class _PKIX1Explicit88Values {
    public static final String DEFAULT_CONFIG = "ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ALL_PKIX1Explicit88Values";
    public static final String KEY_PREFS = "PKIX1Explicit88Values";
    private static final String NAME_ALGORITHMS = "SupportedAlgorithms";
    private static final String NAME_ATTRIBUTES = "SupportedAttributes";
    public static final ALGORITHM_ID[] SupportedAlgorithms;
    public static final ATTRIBUTE_CLASS[] SupportedAttributes;
    public static final int[] id_aa_ets_otherSigCert = {1, 2, 840, 113549, 1, 9, 16, 2, 19};

    static {
        StringTokenizer stringTokenizer = new StringTokenizer(DEFAULT_CONFIG, ",");
        Vector vector = new Vector(100);
        Vector vector2 = new Vector(100);
        while (stringTokenizer.hasMoreElements()) {
            privelegedLoad(stringTokenizer.nextToken(), vector, vector2);
        }
        ATTRIBUTE_CLASS[] attribute_classArr = new ATTRIBUTE_CLASS[vector.size()];
        SupportedAttributes = attribute_classArr;
        ALGORITHM_ID[] algorithm_idArr = new ALGORITHM_ID[vector2.size()];
        SupportedAlgorithms = algorithm_idArr;
        vector.toArray(attribute_classArr);
        vector2.toArray(algorithm_idArr);
    }

    private _PKIX1Explicit88Values() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadClass(String str, Vector vector, Vector vector2) throws ClassNotFoundException {
        Class<?> loadClass = _PKIX1Explicit88Values.class.getClassLoader().loadClass(str);
        try {
            ATTRIBUTE_CLASS[] attribute_classArr = (ATTRIBUTE_CLASS[]) loadClass.getField(NAME_ATTRIBUTES).get(null);
            int size = vector.size();
            for (int i = 0; i < attribute_classArr.length; i++) {
                boolean z = false;
                for (int i2 = 0; i2 < size && !z; i2++) {
                    if (attribute_classArr[i].id.equals(((ATTRIBUTE_CLASS) vector.get(i2)).id)) {
                        z = true;
                    }
                }
                if (!z) {
                    vector.add(attribute_classArr[i]);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            ALGORITHM_ID[] algorithm_idArr = (ALGORITHM_ID[]) loadClass.getField(NAME_ALGORITHMS).get(null);
            for (int i3 = 0; i3 < algorithm_idArr.length; i3++) {
                int size2 = vector2.size();
                boolean z2 = false;
                for (int i4 = 0; i4 < size2 && !z2; i4++) {
                    if (algorithm_idArr[i3].id.equals(((ALGORITHM_ID) vector2.get(i4)).id)) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    vector2.add(algorithm_idArr[i3]);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void privelegedLoad(final String str, final Vector vector, final Vector vector2) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.ASN.PKIX1Explicit88._PKIX1Explicit88Values.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    _PKIX1Explicit88Values.loadClass(str, vector, vector2);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
