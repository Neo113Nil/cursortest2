package ru.cprocsp.ACSPTLSProxy.store;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.JavaConfigLayer;
import ru.cprocsp.NGate.tools.Constants;
import ru.cprocsp.NGate.tools.log.Logger;

/* loaded from: classes4.dex */
public class TrustStoreDispatcher implements Constants {
    private static TrustStoreDispatcher INSTANCE;
    private final KeyStore trustStore;
    private final char[] trustStorePassword;
    private final String trustStorePath;

    private TrustStoreDispatcher() {
        KeyStore keyStore;
        FileInputStream fileInputStream;
        String bksTrustStoreType = JavaConfigLayer.getBksTrustStoreType();
        String bksTrustStoreFile = JavaConfigLayer.getBksTrustStoreFile();
        this.trustStorePath = bksTrustStoreFile;
        char[] charArray = JavaConfigLayer.getBksTrustStorePassword().toCharArray();
        this.trustStorePassword = charArray;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                Logger.d("Loading trust store " + bksTrustStoreFile);
                keyStore = KeyStore.getInstance(bksTrustStoreType);
                this.trustStore = keyStore;
                fileInputStream = new FileInputStream(bksTrustStoreFile);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            keyStore.load(fileInputStream, charArray);
            Logger.d("Loading trust store completed.");
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        } catch (Exception e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean addCertificate(String str, X509Certificate x509Certificate) {
        if (!isInitiated()) {
            Logger.e("Trust store has not been loaded.");
            return false;
        }
        try {
            INSTANCE.trustStore.setCertificateEntry(str, x509Certificate);
            return INSTANCE.save();
        } catch (Exception e) {
            Logger.e(e.getMessage(), e);
            return false;
        }
    }

    public static String getAliasByCertificate(X509Certificate x509Certificate) {
        if (!isInitiated()) {
            Logger.e("Trust store has not been loaded.");
            return null;
        }
        try {
            return INSTANCE.trustStore.getCertificateAlias(x509Certificate);
        } catch (KeyStoreException e) {
            Logger.e(e.getMessage(), e);
            return null;
        }
    }

    public static List<String> getAliases() {
        if (isInitiated()) {
            try {
                Enumeration<String> aliases = INSTANCE.trustStore.aliases();
                ArrayList arrayList = new ArrayList();
                while (aliases.hasMoreElements()) {
                    arrayList.add(aliases.nextElement());
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                Logger.e(e.getMessage(), e);
            }
        } else {
            Logger.e("Trust store has not been loaded.");
        }
        return Collections.EMPTY_LIST;
    }

    public static X509Certificate getCertificate(String str) {
        if (!isInitiated()) {
            Logger.e("Trust store has not been loaded.");
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(((X509Certificate) INSTANCE.trustStore.getCertificate(str)).getEncoded()));
        } catch (Exception e) {
            Logger.e(e.getMessage(), e);
            return null;
        }
    }

    public static synchronized void init() {
        synchronized (TrustStoreDispatcher.class) {
            if (INSTANCE == null) {
                INSTANCE = new TrustStoreDispatcher();
            }
        }
    }

    public static synchronized boolean isInitiated() {
        boolean z;
        synchronized (TrustStoreDispatcher.class) {
            z = INSTANCE != null;
        }
        return z;
    }

    public static boolean removeCertificate(String str) {
        if (!isInitiated()) {
            Logger.e("Trust store has not been loaded.");
            return false;
        }
        try {
            INSTANCE.trustStore.deleteEntry(str);
            return INSTANCE.save();
        } catch (Exception e) {
            Logger.e(e.getMessage(), e);
            return false;
        }
    }

    private boolean save() {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(this.trustStorePath);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.trustStore.store(fileOutputStream, this.trustStorePassword);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Logger.e(e.getMessage(), e);
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (IOException unused2) {
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }
}
