package ru.CryptoPro.AdES;

import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class AdESConfig {
    public static final String Crypt_ProviderName = "Crypto";
    public static final String JavaCSP_ProviderName = "JCSP";
    public static final char[] DEFAULT_CACERTS_PASSWORD = {'c', 'h', 'a', 'n', 'g', 'e', 'i', 't'};
    private static String userPropDigestSignatureProvider = null;
    private static String userPropEncryptionProvider = null;
    public static final String DEFAULT_PROVIDER = "ru.CryptoPro.defaultProv";
    private static final String systemPropProvider = GetProperty.getStringProperty(DEFAULT_PROVIDER, null);
    private static final String panePropDigestSignatureProvider = PaneDefaultProvider.getDefaultDigestSignatureProvider(null);
    private static final String panePropEncryptionProvider = PaneDefaultProvider.getDefaultEncryptionProvider(null);
    public static final String DEFAULT_DESYNC_TIMEOUT = "ru.CryptoPro.defaultDesyncTimeout";
    private static final long systemPropDesyncTimeout = GetProperty.getIntegerProperty(DEFAULT_DESYNC_TIMEOUT, -1);
    private static final long adminPropDesyncTimeout = AdESConfigParameters.getDefaultDesyncTimeout();
    private static long userPropDesyncTimeout = -1;
    public static final String CACERTS_PASSWORD = "cacerts.password";
    private static final String systemCACertsPassword = GetProperty.getStringProperty(CACERTS_PASSWORD, null);
    private static char[] userCACertsPassword = null;
    public static final String USE_CSP_STORES = "ru.CryptoPro.useCspStores";
    public static boolean systemUseCspStores = GetProperty.getBooleanProperty(USE_CSP_STORES, true);

    public static char[] getCACertsPassword() {
        char[] cArr = userCACertsPassword;
        if (cArr != null) {
            return cArr;
        }
        String str = systemCACertsPassword;
        return str != null ? str.toCharArray() : DEFAULT_CACERTS_PASSWORD;
    }

    public static String getDefaultDigestSignatureProvider() {
        String str = userPropDigestSignatureProvider;
        if (str != null) {
            return str;
        }
        String str2 = systemPropProvider;
        if (str2 != null) {
            return str2;
        }
        String str3 = panePropDigestSignatureProvider;
        return str3 != null ? str3 : "JCP";
    }

    public static String getDefaultEncryptionProvider() {
        String str = userPropEncryptionProvider;
        if (str != null) {
            return str;
        }
        String str2 = systemPropProvider;
        if (str2 != null) {
            return str2.equalsIgnoreCase("JCP") ? "Crypto" : str2;
        }
        String str3 = panePropEncryptionProvider;
        return str3 != null ? str3 : "Crypto";
    }

    public static long getServiceDesyncTimeout() {
        long j = userPropDesyncTimeout;
        if (j > 0) {
            return j;
        }
        long j2 = systemPropDesyncTimeout;
        return j2 > 0 ? j2 : adminPropDesyncTimeout;
    }

    public static boolean isJCP() {
        return getDefaultDigestSignatureProvider().equalsIgnoreCase("JCP");
    }

    public static void setCACertsPassword(String str) {
        if (str != null) {
            userCACertsPassword = str.toCharArray();
        }
    }

    public static void setDefaultProvider(String str) {
        if (str != null) {
            JCPLogger.fine("Set default digest, signature & encryption provider: ", str);
            userPropDigestSignatureProvider = str;
            if (str.equalsIgnoreCase("JCP")) {
                userPropEncryptionProvider = "Crypto";
            } else {
                userPropEncryptionProvider = str;
            }
        }
    }

    public static void setServiceDesyncTimeout(long j) {
        if (j > 0) {
            JCPLogger.fine("Set default desync timeout (ms): ", Long.valueOf(j));
            userPropDesyncTimeout = j;
        }
    }

    public static boolean useCspStores() {
        return getDefaultDigestSignatureProvider().equalsIgnoreCase("JCSP") && systemUseCspStores;
    }
}
