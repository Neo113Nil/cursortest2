package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.StringTokenizer;
import java.util.Vector;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.EXTENSION_CLASS;

/* loaded from: classes4.dex */
public class _CertificateExtensionsValues {
    public static final String DEFAULT_CONFIG = "ru.CryptoPro.JCP.ASN.CertificateExtensions.ALL_CertificateExtensionsValues";
    public static final EXTENSION_CLASS[] ExtensionSet;
    public static final String KEY_PREFS = "CertificateExtensionsValues";
    private static final String NAME_EXTENSIONS = "ExtensionSet";
    private static final String NAME_POLICY = "SupportedPolicyQualifiers";
    public static final CERT_POLICY_QUALIFIER[] SupportedPolicyQualifiers;

    static {
        StringTokenizer stringTokenizer = new StringTokenizer(DEFAULT_CONFIG, ",");
        Vector vector = new Vector(100);
        Vector vector2 = new Vector(100);
        while (stringTokenizer.hasMoreElements()) {
            privelegedLoad(stringTokenizer.nextToken(), vector, vector2);
        }
        EXTENSION_CLASS[] extension_classArr = new EXTENSION_CLASS[vector.size()];
        ExtensionSet = extension_classArr;
        vector.toArray(extension_classArr);
        CERT_POLICY_QUALIFIER[] cert_policy_qualifierArr = new CERT_POLICY_QUALIFIER[vector2.size()];
        SupportedPolicyQualifiers = cert_policy_qualifierArr;
        vector2.toArray(cert_policy_qualifierArr);
    }

    private _CertificateExtensionsValues() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadClass(String str, Vector vector, Vector vector2) throws ClassNotFoundException {
        Class<?> loadClass = _CertificateExtensionsValues.class.getClassLoader().loadClass(str);
        try {
            EXTENSION_CLASS[] extension_classArr = (EXTENSION_CLASS[]) loadClass.getField(NAME_EXTENSIONS).get(null);
            for (int i = 0; i < extension_classArr.length; i++) {
                int size = vector.size();
                boolean z = false;
                for (int i2 = 0; i2 < size && !z; i2++) {
                    if (extension_classArr[i].id.equals(((EXTENSION_CLASS) vector.get(i2)).id)) {
                        z = true;
                    }
                }
                if (!z) {
                    vector.add(extension_classArr[i]);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            CERT_POLICY_QUALIFIER[] cert_policy_qualifierArr = (CERT_POLICY_QUALIFIER[]) loadClass.getField(NAME_POLICY).get(null);
            for (int i3 = 0; i3 < cert_policy_qualifierArr.length; i3++) {
                int size2 = vector2.size();
                boolean z2 = false;
                for (int i4 = 0; i4 < size2 && !z2; i4++) {
                    if (cert_policy_qualifierArr[i3].id.equals(((CERT_POLICY_QUALIFIER) vector2.get(i4)).id)) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    vector2.add(cert_policy_qualifierArr[i3]);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void privelegedLoad(final String str, final Vector vector, final Vector vector2) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.ASN.CertificateExtensions._CertificateExtensionsValues.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    _CertificateExtensionsValues.loadClass(str, vector, vector2);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
