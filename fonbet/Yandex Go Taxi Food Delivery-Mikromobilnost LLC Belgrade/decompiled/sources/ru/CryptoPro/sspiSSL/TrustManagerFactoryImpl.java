package ru.CryptoPro.sspiSSL;

import defpackage.au61;
import defpackage.hr61;
import defpackage.kbs;
import defpackage.ny61;
import java.io.File;
import java.io.FileInputStream;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.util.Map;
import javax.net.ssl.CertPathTrustManagerParameters;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;
import javax.net.ssl.X509TrustManager;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.support.BKSTrustStore;
import ru.CryptoPro.ssl.InternalTrustManagerParameters;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.util.ParamUtil;

/* loaded from: classes4.dex */
abstract class TrustManagerFactoryImpl extends TrustManagerFactorySpi {
    public X509TrustManager a = null;
    public boolean b = false;

    public final class PKIXFactory extends TrustManagerFactoryImpl {
        @Override // ru.CryptoPro.sspiSSL.TrustManagerFactoryImpl
        public final au61 a(KeyStore keyStore) {
            return new au61("PKIX", keyStore);
        }

        @Override // ru.CryptoPro.sspiSSL.TrustManagerFactoryImpl
        public final X509TrustManager c(ManagerFactoryParameters managerFactoryParameters) {
            String str;
            SSLLogger.fine("PKIXFactory getInstance().");
            if (managerFactoryParameters instanceof InternalTrustManagerParameters) {
                return new au61("LIBSSPI", (PKIXBuilderParameters) null);
            }
            if (managerFactoryParameters instanceof CertPathTrustManagerParameters) {
                CertPathParameters parameters = ((CertPathTrustManagerParameters) managerFactoryParameters).getParameters();
                if (parameters instanceof PKIXBuilderParameters) {
                    return new au61("PKIX", (PKIXBuilderParameters) parameters);
                }
                str = "Encapsulated parameters must be PKIXBuilderParameters";
            } else {
                str = "Parameters must be CertPathTrustManagerParameters";
            }
            kbs.t(str);
            return null;
        }
    }

    public final class SimpleFactory extends TrustManagerFactoryImpl {
        @Override // ru.CryptoPro.sspiSSL.TrustManagerFactoryImpl
        public final au61 a(KeyStore keyStore) {
            SSLLogger.fine("SimpleFactory getInstance().");
            return new au61("Simple", keyStore);
        }

        @Override // ru.CryptoPro.sspiSSL.TrustManagerFactoryImpl
        public final X509TrustManager c(ManagerFactoryParameters managerFactoryParameters) {
            throw new InvalidAlgorithmParameterException("GostX509 TrustManagerFactory does not use ManagerFactoryParameters");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static KeyStore b() {
        FileInputStream fileInputStream;
        File file;
        Map load = ParamUtil.load("JCSP");
        String str = File.separator;
        FileInputStream fileInputStream2 = null;
        KeyStore keyStore = null;
        try {
            String str2 = (String) load.get("trustStore");
            if (JCP.RAW_PREFIX.equals(str2)) {
                fileInputStream = null;
            } else {
                if (str2 != null) {
                    file = new File(str2);
                    fileInputStream = (FileInputStream) AccessController.doPrivileged(new hr61(4, file));
                } else {
                    String str3 = (String) load.get("javaHome");
                    File file2 = new File(str3 + str + "lib" + str + BKSTrustStore.STORAGE_DIRECTORY + str + "jssecacerts");
                    FileInputStream fileInputStream3 = (FileInputStream) AccessController.doPrivileged(new hr61(4, file2));
                    if (fileInputStream3 == null) {
                        try {
                            File file3 = new File(str3 + str + "lib" + str + BKSTrustStore.STORAGE_DIRECTORY + str + "cacerts");
                            fileInputStream = (FileInputStream) AccessController.doPrivileged(new hr61(4, file3));
                            file = file3;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream3;
                            if (fileInputStream2 != null) {
                            }
                            throw th;
                        }
                    } else {
                        file = file2;
                        fileInputStream = fileInputStream3;
                    }
                }
                if (fileInputStream != null) {
                    try {
                        str2 = file.getPath();
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        throw th;
                    }
                } else {
                    str2 = "No File Available, using empty keystore.";
                }
            }
            String str4 = (String) load.get("trustStoreType");
            if (str4.length() == 0) {
                str4 = "CertStore";
            }
            String str5 = (String) load.get("trustStoreProvider");
            SSLLogger.info("trustStore is : ", str2);
            SSLLogger.info("trustStore type is : ", str4);
            SSLLogger.info("trustStore provider is : ", str5);
            if (str4.length() != 0) {
                SSLLogger.info("init truststore");
                KeyStore keyStore2 = str5.length() == 0 ? KeyStore.getInstance(str4) : KeyStore.getInstance(str4, str5);
                String str6 = (String) load.get("trustStorePasswd");
                char[] charArray = str6.length() != 0 ? str6.toCharArray() : null;
                keyStore2.load(fileInputStream, charArray);
                if (charArray != null) {
                    for (int i = 0; i < charArray.length; i++) {
                        charArray[i] = 0;
                    }
                }
                keyStore = keyStore2;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return keyStore;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public abstract au61 a(KeyStore keyStore);

    public abstract X509TrustManager c(ManagerFactoryParameters managerFactoryParameters);

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public final TrustManager[] engineGetTrustManagers() {
        if (this.b) {
            return new TrustManager[]{this.a};
        }
        ny61.r("TrustManagerFactoryImpl is not initialized");
        return null;
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public final void engineInit(KeyStore keyStore) {
        if (keyStore == null) {
            try {
                keyStore = b();
            } catch (Error e) {
                SSLLogger.warning("GostX509: skip default keystore:", e);
                throw e;
            } catch (SecurityException e2) {
                SSLLogger.warning("GostX509: skip default keystore:", e2);
            } catch (RuntimeException e3) {
                SSLLogger.warning("GostX509: skip default keystore:", e3);
                throw e3;
            } catch (Exception e4) {
                SSLLogger.warning("GostX509: skip default keystore:", e4);
                throw new KeyStoreException("problem accessing trust store" + e4);
            }
        }
        this.a = a(keyStore);
        this.b = true;
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public final void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        this.a = c(managerFactoryParameters);
        this.b = true;
    }
}
