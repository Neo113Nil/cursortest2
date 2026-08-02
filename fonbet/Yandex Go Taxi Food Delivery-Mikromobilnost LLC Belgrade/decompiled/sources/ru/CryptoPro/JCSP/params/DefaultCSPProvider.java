package ru.CryptoPro.JCSP.params;

import defpackage.nzs;
import java.security.AccessController;
import java.util.Vector;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class DefaultCSPProvider {
    public static final int KEY_SET_MACHINE = 1;
    public static final int KEY_SET_USER = 0;
    public static final int NAME_TYPE_FRIENDLY = 0;
    public static final int NAME_TYPE_UNIQUE = 1;
    private static final String n = "KeySet_class_default";
    private static final String p = "NameType_class_default";
    private static final String r = "add_provider_name_class_default";
    private static final Object a = new Object();
    private static final String b = "DefaultCSPProvider_2001_class_default";
    private static String c = a(b, 75);
    private static final String d = "DefaultCSPProvider_2012_256_class_default";
    private static String e = a(d, 80);
    private static final String f = "DefaultCSPProvider_2012_512_class_default";
    private static String g = a(f, 81);
    private static final String h = "DefaultCSPProvider_RSA_class_default";
    private static String i = a(h, 24);
    private static final String j = "DefaultCSPProvider_ECDSA_class_default";
    private static String l = a(j, 16);
    private static final String k = "DefaultCSPProvider_EDDSA_class_default";
    private static String m = a(k, 32);
    private static int o = a();
    private static int q = b();
    private static boolean s = c();

    public static int a() {
        try {
            return ((Integer) AccessController.doPrivileged(new cl_1())).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i2) {
        try {
            Vector enumInstalledProviders = HProv.enumInstalledProviders(i2);
            return !enumInstalledProviders.isEmpty() ? (String) enumInstalledProviders.get(0) : "";
        } catch (Exception e2) {
            JCSPLogger.subThrown(e2);
            return "";
        }
    }

    public static boolean c() {
        try {
            return ((Boolean) AccessController.doPrivileged(new cl_3())).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getDefaultProviderNameECDSA() {
        String str;
        synchronized (a) {
            str = l;
        }
        return str;
    }

    public static String getDefaultProviderNameEDDSA() {
        String str;
        synchronized (a) {
            str = m;
        }
        return str;
    }

    public static String getDefaultProviderNameRSA() {
        String str;
        synchronized (a) {
            str = i;
        }
        return str;
    }

    public static String getDefaultProviderName_2001() {
        String str;
        synchronized (a) {
            str = c;
        }
        return str;
    }

    public static String getDefaultProviderName_2012_256() {
        String str;
        synchronized (a) {
            str = e;
        }
        return str;
    }

    public static String getDefaultProviderName_2012_512() {
        String str;
        synchronized (a) {
            str = g;
        }
        return str;
    }

    public static int getKeySetType() {
        int i2;
        synchronized (a) {
            i2 = o;
        }
        return i2;
    }

    public static int getNameType() {
        int i2;
        synchronized (a) {
            i2 = q;
        }
        return i2;
    }

    public static String getProviderNameByType(int i2) {
        String str;
        synchronized (a) {
            try {
                str = i2 != 16 ? i2 != 24 ? i2 != 32 ? i2 != 80 ? i2 != 81 ? c : g : e : m : i : l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static boolean ifWrite() {
        return nzs.u(DefaultCSPProvider.class);
    }

    public static boolean isAddProviderName() {
        boolean z;
        synchronized (a) {
            z = s;
        }
        return z;
    }

    public static void setAddProviderName(boolean z) {
        synchronized (a) {
            new JCPPref(DefaultCSPProvider.class).putBoolean(r, z);
            s = z;
        }
    }

    public static void setDefaultProviderECDSA(String str) {
        synchronized (a) {
            new JCPPref(DefaultCSPProvider.class).put(j, str);
            l = str;
        }
    }

    public static void setDefaultProviderEDDSA(String str) {
        synchronized (a) {
            new JCPPref(DefaultCSPProvider.class).put(k, str);
            m = str;
        }
    }

    public static void setDefaultProviderRSA(String str) {
        synchronized (a) {
            new JCPPref(DefaultCSPProvider.class).put(h, str);
            i = str;
        }
    }

    public static void setDefaultProvider_2001(String str) {
        synchronized (a) {
            new JCPPref(DefaultCSPProvider.class).put(b, str);
            c = str;
        }
    }

    public static void setDefaultProvider_2012_256(String str) {
        synchronized (a) {
            e = str;
            new JCPPref(DefaultCSPProvider.class).put(d, str);
        }
    }

    public static void setDefaultProvider_2012_512(String str) {
        synchronized (a) {
            g = str;
            new JCPPref(DefaultCSPProvider.class).put(f, str);
        }
    }

    public static void setKeySetType(int i2) {
        if (i2 == 0 || i2 == 1) {
            synchronized (a) {
                new JCPPref(DefaultCSPProvider.class).putInt(n, i2);
                o = i2;
            }
        }
    }

    public static void setNameType(int i2) {
        if (i2 == 0 || i2 == 1) {
            synchronized (a) {
                new JCPPref(DefaultCSPProvider.class).putInt(p, i2);
                q = i2;
            }
        }
    }

    public static String a(String str, int i2) {
        try {
            return (String) AccessController.doPrivileged(new cl_0(str, i2));
        } catch (Exception unused) {
            return "";
        }
    }

    public static int b() {
        try {
            return ((Integer) AccessController.doPrivileged(new cl_2())).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }
}
