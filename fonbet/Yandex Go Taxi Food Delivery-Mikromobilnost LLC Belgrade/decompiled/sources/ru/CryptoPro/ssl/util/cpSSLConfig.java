package ru.CryptoPro.ssl.util;

import defpackage.ny61;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;
import ru.CryptoPro.ssl.SSLLogger;

/* loaded from: classes4.dex */
public class cpSSLConfig {
    public static String a;
    public static String b;
    public static final String DEFAULT_PROVIDER = "ru.CryptoPro.defaultSSLProv";
    public static final String c = GetProperty.getStringProperty(DEFAULT_PROVIDER, null);
    public static final String d = PaneDefaultProvider.getDefaultDigestSignatureProvider(null);
    public static final String e = PaneDefaultProvider.getDefaultEncryptionProvider(null);
    public static final String USE_NEW_TLS = "ru.CryptoPro.useNewTLS";
    public static final boolean f = GetProperty.getBooleanProperty(USE_NEW_TLS, true);
    public static boolean g = false;
    public static final String USE_FOREIGN_TLS = "ru.CryptoPro.useForeignTLS";
    public static final boolean h = GetProperty.getBooleanProperty(USE_FOREIGN_TLS, false);
    public static boolean i = false;

    public static void a(String str) {
        if (!TLSSettings.getTlsProhibitDisabledValidation() || str.equalsIgnoreCase("JCP") || str.equalsIgnoreCase("Crypto") || str.equalsIgnoreCase("JCSP")) {
            return;
        }
        ny61.g("Invalid provider: ".concat(str));
    }

    public static String getDefaultDigestSignatureSSLProvider() {
        String str = a;
        if (str == null && (str = c) == null && (str = d) == null) {
            str = null;
        }
        if (str == null) {
            str = "JCP";
        }
        a(str);
        return str;
    }

    public static String getDefaultEncryptionSSLProvider() {
        String str = b;
        if (str == null) {
            str = c;
            if (str == null) {
                str = e;
                if (str == null) {
                    str = null;
                }
            } else if (str.equalsIgnoreCase("JCP")) {
                str = "Crypto";
            }
        }
        String str2 = str != null ? str : "Crypto";
        a(str2);
        return str2;
    }

    public static boolean isCrypto() {
        return getDefaultEncryptionSSLProvider().equalsIgnoreCase("Crypto");
    }

    public static boolean isJCP() {
        return getDefaultDigestSignatureSSLProvider().equalsIgnoreCase("JCP");
    }

    public static boolean isUseForeignTLS() {
        return i || h;
    }

    public static boolean isUseNewTLS() {
        return g || f;
    }

    public static void setDefaultSSLProvider(String str) {
        if (str != null) {
            SSLLogger.fine("Set default digest, signature & encryption provider: ".concat(str));
            a = str;
            if (str.equalsIgnoreCase("JCP")) {
                b = "Crypto";
            } else {
                b = str;
            }
        }
    }

    public static void setUseForeignTls(boolean z) {
        SSLLogger.fine("Use foreign TLS suites: " + z);
        i = z;
    }

    public static void setUseNewTls(boolean z) {
        SSLLogger.fine("Use new TLS suites: " + z);
        g = z;
    }
}
