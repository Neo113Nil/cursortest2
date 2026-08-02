package ru.CryptoPro.JCP.Util;

import java.security.AccessController;
import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public class DefaultProvider {
    private static final String KEYTOOL_COMPAT_PREF_NAME = "keytool_compat_class_default";
    private static final String USE_CERT_STUB_PREF_NAME = "use_cert_stub_class_default";
    private static boolean keytoolCompat = loadKeytoolCompat();
    private static boolean useCertStub = loadUseCertStub();
    private static final Object SyncObject = new Object();

    public static boolean getKeytoolCompat() {
        boolean z;
        synchronized (SyncObject) {
            z = keytoolCompat;
        }
        return z;
    }

    public static boolean isUseCertStub() {
        boolean z;
        synchronized (SyncObject) {
            z = useCertStub;
        }
        return z;
    }

    public static boolean loadKeytoolCompat() {
        try {
            return ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.Util.DefaultProvider.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return Boolean.valueOf(new JCPPref(DefaultProvider.class).getBoolean(DefaultProvider.KEYTOOL_COMPAT_PREF_NAME, false));
                }
            })).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean loadUseCertStub() {
        try {
            return ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.Util.DefaultProvider.2
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return Boolean.valueOf(new JCPPref(DefaultProvider.class).getBoolean(DefaultProvider.USE_CERT_STUB_PREF_NAME, false));
                }
            })).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setKeytoolCompat(boolean z) {
        synchronized (SyncObject) {
            new JCPPref(DefaultProvider.class).putBoolean(KEYTOOL_COMPAT_PREF_NAME, z);
            keytoolCompat = z;
        }
    }

    public static void setUseCertStub(boolean z) {
        synchronized (SyncObject) {
            new JCPPref(DefaultProvider.class).putBoolean(USE_CERT_STUB_PREF_NAME, z);
            useCertStub = z;
        }
    }
}
