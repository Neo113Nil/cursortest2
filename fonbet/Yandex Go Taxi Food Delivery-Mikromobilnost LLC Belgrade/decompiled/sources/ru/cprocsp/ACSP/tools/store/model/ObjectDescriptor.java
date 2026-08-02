package ru.cprocsp.ACSP.tools.store.model;

import defpackage.ryg0;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import ru.CryptoPro.JCSP.support.BKSTrustStore;
import ru.cprocsp.ACSP.tools.store.util.IUtilHelper;
import ru.cprocsp.ACSP.tools.store.util.UtilKeyStore;
import ru.cprocsp.NGate.tools.log.Logger;

/* loaded from: classes4.dex */
public class ObjectDescriptor implements Cloneable, Comparable<ObjectDescriptor> {
    private static final int DEFAULT_STORAGE_ICON = ryg0.ic_phone;
    private static final Map<String, Integer> STORAGE_PATTERNS = new HashMap<String, Integer>() { // from class: ru.cprocsp.ACSP.tools.store.model.ObjectDescriptor.1
        {
            put(".+(ECP.BT).([0-9]+)", Integer.valueOf(ryg0.ic_bluetooth));
            put(".+(ECP).([0-9]+)", Integer.valueOf(ryg0.ic_usb));
            put(".+(SD).([0-9]+)", Integer.valueOf(ryg0.ic_sd_card));
            put(".+(ECP.NFC).([0-9]+)", Integer.valueOf(ryg0.ic_nfc));
        }
    };
    private X509Certificate[] cachedCertificates;
    private PrivateKey cachedPrivateKey;
    private CertificateFields certificateFields;
    private String objectAlias;
    private IUtilHelper.StorageType storageType;
    private int storeIcon;
    private char[] storePassword;
    private String storePath;
    private String storeProvider;
    private String storeType;

    public ObjectDescriptor(IUtilHelper.StorageType storageType, String str, X509Certificate[] x509CertificateArr, String str2, String str3, String str4, char[] cArr) {
        this.cachedCertificates = null;
        this.objectAlias = null;
        this.storePath = null;
        this.storePassword = null;
        this.storeProvider = null;
        this.cachedPrivateKey = null;
        this.storageType = storageType;
        this.storeType = str;
        if (x509CertificateArr != null && x509CertificateArr.length > 0) {
            X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
            this.cachedCertificates = x509CertificateArr2;
            System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, x509CertificateArr.length);
        }
        this.objectAlias = str2;
        this.storeProvider = str3;
        this.storePath = str4;
        this.storePassword = cArr;
        this.storeIcon = resolveIconByStorage(this);
    }

    private static boolean compareCharArrays(char[] cArr, char[] cArr2) {
        return cArr != null ? cArr2 != null && Arrays.equals(cArr, cArr2) : cArr2 == null;
    }

    private static boolean compareStrings(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (str2 != null) {
            if (z ? str.equalsIgnoreCase(str2) : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static void copy(ObjectDescriptor objectDescriptor, ObjectDescriptor objectDescriptor2) {
        objectDescriptor2.storageType = objectDescriptor.storageType;
        objectDescriptor2.storeIcon = objectDescriptor.storeIcon;
        objectDescriptor2.storeType = objectDescriptor.storeType.substring(0);
        X509Certificate[] x509CertificateArr = objectDescriptor.cachedCertificates;
        if (x509CertificateArr != null) {
            X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
            objectDescriptor2.cachedCertificates = x509CertificateArr2;
            X509Certificate[] x509CertificateArr3 = objectDescriptor.cachedCertificates;
            System.arraycopy(x509CertificateArr3, 0, x509CertificateArr2, 0, x509CertificateArr3.length);
        }
        objectDescriptor2.objectAlias = objectDescriptor.objectAlias.substring(0);
        objectDescriptor2.storeProvider = objectDescriptor.storeProvider.substring(0);
        String str = objectDescriptor.storePath;
        if (str != null) {
            objectDescriptor2.storePath = str.substring(0);
        }
        char[] cArr = objectDescriptor.storePassword;
        if (cArr != null) {
            objectDescriptor2.storePassword = Arrays.copyOf(cArr, cArr.length);
        }
    }

    public static ObjectDescriptor createCertificateDescriptor(IUtilHelper.StorageType storageType, String str) {
        return new ObjectDescriptor(storageType, BKSTrustStore.STORAGE_TYPE, null, str, null, UtilKeyStore.getCertStorePath(storageType), IUtilHelper.STORAGE_PASSWORD);
    }

    private boolean equalsInternal(Object obj, boolean z) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectDescriptor)) {
            return false;
        }
        ObjectDescriptor objectDescriptor = (ObjectDescriptor) obj;
        if (this.storageType != objectDescriptor.storageType || !this.storeType.equalsIgnoreCase(objectDescriptor.storeType) || !this.objectAlias.equals(objectDescriptor.objectAlias)) {
            return false;
        }
        if (z) {
            X509Certificate[] x509CertificateArr = this.cachedCertificates;
            X509Certificate[] x509CertificateArr2 = objectDescriptor.cachedCertificates;
            if (x509CertificateArr != null) {
                if (x509CertificateArr2 == null || x509CertificateArr.length != x509CertificateArr2.length) {
                    return false;
                }
                int i = 0;
                while (true) {
                    try {
                        X509Certificate[] x509CertificateArr3 = this.cachedCertificates;
                        if (i >= x509CertificateArr3.length) {
                            break;
                        }
                        if (!Arrays.equals(x509CertificateArr3[i].getEncoded(), ((ObjectDescriptor) obj).cachedCertificates[i].getEncoded())) {
                            return false;
                        }
                        i++;
                    } catch (Exception unused) {
                        return false;
                    }
                }
            } else if (x509CertificateArr2 != null) {
                return false;
            }
        }
        if (compareStrings(this.storePath, objectDescriptor.storePath, false) && compareStrings(this.storeProvider, objectDescriptor.storeProvider, true)) {
            return !z || compareCharArrays(this.storePassword, objectDescriptor.storePassword);
        }
        return false;
    }

    private static int resolveIconByStorage(ObjectDescriptor objectDescriptor) {
        String storeType = objectDescriptor.getStoreType();
        for (Map.Entry<String, Integer> entry : STORAGE_PATTERNS.entrySet()) {
            if (Pattern.compile(entry.getKey()).matcher(storeType).find()) {
                return entry.getValue().intValue();
            }
        }
        return DEFAULT_STORAGE_ICON;
    }

    public Object clone() {
        return new ObjectDescriptor(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ObjectDescriptor objectDescriptor) {
        if (objectDescriptor == null) {
            return 0;
        }
        return this.storeType.compareTo(objectDescriptor.storeType) == 0 ? this.objectAlias.compareTo(objectDescriptor.objectAlias) : this.storeType.compareTo(objectDescriptor.storeType);
    }

    public boolean equals(Object obj) {
        return equalsInternal(obj, true);
    }

    public CertificateFields getCertificateFields() {
        return this.certificateFields;
    }

    public synchronized X509Certificate[] getCertificates() {
        try {
            X509Certificate[] x509CertificateArr = this.cachedCertificates;
            if (x509CertificateArr != null) {
                return x509CertificateArr;
            }
            try {
                String str = this.storeProvider;
                String str2 = this.storeType;
                KeyStore keyStore = str == null ? KeyStore.getInstance(str2) : KeyStore.getInstance(str2, str);
                keyStore.load(null, null);
                Certificate[] certificateChain = keyStore.getCertificateChain(this.objectAlias);
                if (certificateChain != null) {
                    X509Certificate[] x509CertificateArr2 = new X509Certificate[certificateChain.length];
                    this.cachedCertificates = x509CertificateArr2;
                    System.arraycopy(certificateChain, 0, x509CertificateArr2, 0, certificateChain.length);
                }
            } catch (Exception e) {
                Logger.e(e.getMessage(), e);
            }
            return this.cachedCertificates;
        } catch (Throwable th) {
            throw th;
        }
    }

    public String getObjectAlias() {
        return this.objectAlias;
    }

    public PrivateKey getPrivateKey() {
        if (this.storageType != IUtilHelper.StorageType.stPersonal) {
            return null;
        }
        PrivateKey privateKey = this.cachedPrivateKey;
        if (privateKey != null) {
            return privateKey;
        }
        try {
            String str = this.storeProvider;
            String str2 = this.storeType;
            KeyStore keyStore = str == null ? KeyStore.getInstance(str2) : KeyStore.getInstance(str2, str);
            keyStore.load(null, null);
            this.cachedPrivateKey = (PrivateKey) keyStore.getKey(this.objectAlias, this.storePassword);
        } catch (Exception e) {
            Logger.e(e.getMessage(), e);
        }
        return this.cachedPrivateKey;
    }

    public IUtilHelper.StorageType getStorageType() {
        return this.storageType;
    }

    public int getStoreIcon() {
        return this.storeIcon;
    }

    public char[] getStorePassword() {
        return this.storePassword;
    }

    public String getStorePath() {
        return this.storePath;
    }

    public String getStoreProvider() {
        return this.storeProvider;
    }

    public String getStoreType() {
        return this.storeType;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.storageType, this.storeType, this.objectAlias, Integer.valueOf(Arrays.hashCode(this.cachedCertificates)), this.storePath, this.storeProvider, this.storePassword});
    }

    public boolean isContainer() {
        return this.storePath == null;
    }

    public void setCertificateFields(CertificateFields certificateFields) {
        this.certificateFields = certificateFields;
    }

    public synchronized void setCertificates(X509Certificate[] x509CertificateArr) {
        if (x509CertificateArr != null) {
            X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
            this.cachedCertificates = x509CertificateArr2;
            System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, x509CertificateArr.length);
        }
    }

    public static boolean equals(ObjectDescriptor objectDescriptor, ObjectDescriptor objectDescriptor2, boolean z) {
        return objectDescriptor.equalsInternal(objectDescriptor2, z);
    }

    private ObjectDescriptor(ObjectDescriptor objectDescriptor) {
        this.cachedCertificates = null;
        this.objectAlias = null;
        this.storePath = null;
        this.storePassword = null;
        this.storeProvider = null;
        this.cachedPrivateKey = null;
        copy(objectDescriptor, this);
    }
}
