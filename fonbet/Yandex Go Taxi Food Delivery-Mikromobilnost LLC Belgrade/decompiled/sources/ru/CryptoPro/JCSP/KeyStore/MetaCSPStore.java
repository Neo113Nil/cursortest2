package ru.CryptoPro.JCSP.KeyStore;

import defpackage.oyr;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;
import ru.CryptoPro.JCP.KeyStore.StoreInputStream;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public abstract class MetaCSPStore extends CSPStore {
    private final String e;
    private final String f;
    private final String g;

    public MetaCSPStore() {
        b();
        this.e = makePrefix(this.c.getReaderName());
        this.f = makeUnique(this.c.getReaderName());
        this.g = makePrefix(this.c.getReaderPseudo());
    }

    private Vector c() {
        String substring;
        StringBuilder sb;
        JCSPLogger.subEnter();
        boolean z = DefaultCSPProvider.getNameType() == 0;
        Enumeration a = a();
        Vector vector = new Vector(0);
        while (a.hasMoreElements()) {
            ru.CryptoPro.JCSP.MSCAPI.cl_1 cl_1Var = (ru.CryptoPro.JCSP.MSCAPI.cl_1) a.nextElement();
            String a2 = cl_1Var.a();
            String prefix = getPrefix();
            String str = null;
            if (z) {
                int indexOf = a2.indexOf(CSPStore.PROVNAME_PREFIX);
                if (indexOf >= 0) {
                    str = a2.substring(0, indexOf);
                    a2 = a2.substring(indexOf + 4);
                }
                if (a2.startsWith(prefix)) {
                    if (str != null) {
                        StringBuilder v = oyr.v(str, CSPStore.PROVNAME_PREFIX);
                        v.append(a2.substring(prefix.length()));
                        substring = v.toString();
                    } else {
                        substring = a2.substring(prefix.length());
                    }
                    vector.add(substring);
                }
            } else {
                int indexOf2 = a2.indexOf(CSPStore.PROVNAME_PREFIX);
                if (indexOf2 >= 0) {
                    str = a2.substring(0, indexOf2);
                    a2 = a2.substring(indexOf2 + 4);
                }
                substring = cl_1Var.b();
                int indexOf3 = substring.indexOf(CSPStore.PROVNAME_PREFIX);
                if (indexOf3 >= 0) {
                    substring = substring.substring(indexOf3 + 4);
                }
                if (a2.startsWith(prefix)) {
                    if (!substring.startsWith(prefix)) {
                        if (str != null) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append(CSPStore.PROVNAME_PREFIX);
                            sb.append(substring);
                            substring = sb.toString();
                        }
                        vector.add(substring);
                    } else if (str != null) {
                        sb = oyr.v(str, CSPStore.PROVNAME_PREFIX);
                        substring = substring.substring(prefix.length());
                        sb.append(substring);
                        substring = sb.toString();
                        vector.add(substring);
                    } else {
                        substring = substring.substring(prefix.length());
                        vector.add(substring);
                    }
                }
            }
        }
        JCSPLogger.subExit();
        return vector;
    }

    public static synchronized Vector enumReaders(String str, int i) {
        Vector enumReaders;
        synchronized (MetaCSPStore.class) {
            enumReaders = HProv.enumReaders(str, i);
        }
        return enumReaders;
    }

    public static String makePrefix(String str) {
        return "\\\\.\\".concat(str).concat("\\");
    }

    public static String makeUnique(String str) {
        return str.concat("\\\\");
    }

    public void b() {
        this.c = KeyStoreConfig.getInstance().getMyWord(getClass());
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        return c().elements();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return super.engineContainsAlias(str);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        super.engineDeleteEntry(str);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        return super.engineGetCertificate(str);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration engineAliases = engineAliases();
        while (engineAliases.hasMoreElements()) {
            String str = (String) engineAliases.nextElement();
            Certificate engineGetCertificate = engineGetCertificate(str);
            if (engineGetCertificate != null && engineGetCertificate.equals(certificate)) {
                return str;
            }
        }
        return null;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        return super.engineGetCertificateChain(str);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        return super.engineGetCreationDate(str);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public KeyStore.Entry engineGetEntry(String str, KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException {
        return super.engineGetEntry(str, protectionParameter);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        return super.engineGetKey(str, cArr);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return super.engineIsCertificateEntry(str);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return super.engineIsKeyEntry(str);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        if (inputStream != null && (inputStream instanceof StoreInputStream)) {
            StoreInputStream storeInputStream = (StoreInputStream) inputStream;
            if (!storeInputStream.isFqcnName() && storeInputStream.getContainerAlias() != null) {
                storeInputStream.setContainerPrefix(getPrefix());
            }
        }
        super.engineLoad(inputStream, cArr);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        super.engineSetCertificateEntry(str, certificate);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public void engineSetEntry(String str, KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException {
        super.engineSetEntry(str, entry, protectionParameter);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        super.engineSetKeyEntry(str, key, cArr, certificateArr);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public int engineSize() {
        return c().size();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore
    public int getDefaultProviderType() {
        return 75;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore
    public String getName() {
        return this.c.getReaderPseudo();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore
    public String getPrefix() {
        return this.e;
    }

    public String getUnique() {
        return this.f;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore
    public String makeContainerName(String str) {
        return getPrefix().concat(str);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        super.engineSetKeyEntry(str, bArr, certificateArr);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.CSPStore, java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        super.engineLoad(loadStoreParameter);
    }

    public MetaCSPStore(boolean z) {
        this();
        this.d = z;
    }
}
