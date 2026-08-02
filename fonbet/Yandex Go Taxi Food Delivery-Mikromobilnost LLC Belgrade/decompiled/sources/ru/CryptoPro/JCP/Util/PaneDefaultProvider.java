package ru.CryptoPro.JCP.Util;

import defpackage.nzs;
import java.security.AccessController;
import java.security.PrivilegedAction;
import ru.CryptoPro.Install.SecurityProperties;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes4.dex */
public class PaneDefaultProvider implements DefaultProviders {
    public static final int DEFAULT_PROVIDER_CSP = 1;
    public static final int DEFAULT_PROVIDER_JCP = 0;
    private static final int DEFAULT_PROVIDER_UNKNOWN = -1;
    public static final String PREF_NAME = "PaneDefaultProvider_class_default";
    private static final String[] DEFAULT_PROVIDER_NAMES = {JCPRes.getString("panel.alg.provider.jcp", 2), JCPRes.getString("panel.alg.provider.jcsp", 2)};
    private static int defaultIndex = -1;
    private static final Object SyncObject = new Object();

    public static String getDefaultDigestSignatureProvider(String str) {
        return getDefaultProviderIndexCached(str) != 1 ? "JCP" : "JCSP";
    }

    public static String getDefaultEncryptionProvider(String str) {
        return getDefaultProviderIndexCached(str) != 1 ? "Crypto" : "JCSP";
    }

    public static int getDefaultProviderIndexCached(String str) {
        int i;
        synchronized (SyncObject) {
            try {
                if (defaultIndex == -1) {
                    defaultIndex = getDefaultProviderIndexLoad(str);
                }
                i = defaultIndex;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public static int getDefaultProviderIndexLoad(final String str) {
        int intValue;
        synchronized (SyncObject) {
            intValue = ((Integer) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.Util.PaneDefaultProvider.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    int readProviderIndex = PaneDefaultProvider.readProviderIndex(DefaultProviders.CLASS_PROVIDER_JCP, str);
                    int readProviderIndex2 = PaneDefaultProvider.readProviderIndex(DefaultProviders.CLASS_PROVIDER_CSP, str);
                    int i = 0;
                    if (readProviderIndex == -1 || readProviderIndex2 == -1 ? readProviderIndex2 != -1 : readProviderIndex > readProviderIndex2) {
                        i = 1;
                    }
                    return Integer.valueOf(i);
                }
            })).intValue();
        }
        return intValue;
    }

    public static String getDefaultProviderName(int i) {
        return DEFAULT_PROVIDER_NAMES[i];
    }

    public static String getSimpleStoreName(String str) {
        return getDefaultProviderIndexCached(str) == 0 ? "HDImageStore" : ru.CryptoPro.JCP.tools.Platform.isWindows() ? JCSP.REG_STORE_NAME : "HDIMAGE";
    }

    public static boolean ifWrite() {
        return nzs.u(PaneDefaultProvider.class);
    }

    public static void main(String[] strArr) {
        if (strArr.length == 0) {
            System.out.getClass();
            return;
        }
        int parseInt = Integer.parseInt(strArr[0]);
        if (parseInt == 0 || parseInt == 1) {
            putDefaultProvider(parseInt, null);
        } else {
            System.out.getClass();
        }
    }

    public static void putDefaultProvider(int i, String str) {
        synchronized (SyncObject) {
            try {
                if (saveProviderOrder(i, str)) {
                    defaultIndex = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readProviderIndex(String str, String str2) {
        if (ru.CryptoPro.JCP.tools.Platform.isAndroid) {
            JCPLogger.fine("Java CSP is default provider in Android OS. Return.");
            return 1;
        }
        try {
            SecurityProperties securityProperties = str2 == null ? SecurityProperties.DEFAULT_SECURITY_PROPERTIES : new SecurityProperties(str2);
            if (securityProperties.checkSecurityLinkExistsInternal(str)) {
                return securityProperties.getSecurityLinkPositionInternal(str);
            }
            return -1;
        } catch (Exception e) {
            JCPLogger.thrown(e);
            return -1;
        }
    }

    private static boolean saveProviderOrder(final int i, final String str) {
        if (!ru.CryptoPro.JCP.tools.Platform.isAndroid) {
            return ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.Util.PaneDefaultProvider.2
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        SecurityProperties securityProperties = str == null ? SecurityProperties.DEFAULT_SECURITY_PROPERTIES : new SecurityProperties(str);
                        securityProperties.delSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_JCP);
                        boolean checkSecurityLinkExistsInternal = securityProperties.checkSecurityLinkExistsInternal(DefaultProviders.CLASS_PROVIDER_CRYPTO_PROVIDER);
                        if (checkSecurityLinkExistsInternal) {
                            securityProperties.delSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CRYPTO_PROVIDER);
                        }
                        boolean checkSecurityLinkExistsInternal2 = securityProperties.checkSecurityLinkExistsInternal(DefaultProviders.CLASS_PROVIDER_CSP);
                        if (checkSecurityLinkExistsInternal2) {
                            securityProperties.delSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CSP);
                            securityProperties.delSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CSP_RSA);
                        }
                        if (i != 1) {
                            securityProperties.addSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_JCP);
                            if (checkSecurityLinkExistsInternal) {
                                securityProperties.addSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CRYPTO_PROVIDER);
                            }
                            if (checkSecurityLinkExistsInternal2) {
                                securityProperties.addSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CSP);
                                securityProperties.addSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CSP_RSA);
                            }
                        } else {
                            securityProperties.addSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CSP);
                            securityProperties.addSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CSP_RSA);
                            securityProperties.addSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_JCP);
                            if (checkSecurityLinkExistsInternal) {
                                securityProperties.addSecurityLinksInternal(DefaultProviders.CLASS_PROVIDER_CRYPTO_PROVIDER);
                            }
                        }
                        return Boolean.TRUE;
                    } catch (Exception e) {
                        JCPLogger.thrown(e);
                        return Boolean.FALSE;
                    }
                }
            })).booleanValue();
        }
        JCPLogger.fine("Java CSP is default provider in Android OS. Return.");
        return true;
    }

    public static boolean setDefaultProviderAvailable() {
        return nzs.u(PaneDefaultProvider.class);
    }
}
