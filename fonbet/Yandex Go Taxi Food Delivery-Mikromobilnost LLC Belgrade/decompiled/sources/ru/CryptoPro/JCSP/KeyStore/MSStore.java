package ru.CryptoPro.JCSP.KeyStore;

import defpackage.dy31;
import defpackage.oyr;
import defpackage.w511;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.KeyStore.JCPPrivateKeyEntry;
import ru.CryptoPro.JCP.KeyStore.VoidInputStream;
import ru.CryptoPro.JCP.Util.DefaultProvider;
import ru.CryptoPro.JCP.params.JCPProtectionParameter;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCP.tools.JCPKeyPair;
import ru.CryptoPro.JCSP.CAPILogger;
import ru.CryptoPro.JCSP.CStructReader.ContainerExtensionStructure;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.ContainerPassword;
import ru.CryptoPro.JCSP.Key.ExchPrivateKeySpec;
import ru.CryptoPro.JCSP.Key.GostExchPrivateKey;
import ru.CryptoPro.JCSP.Key.GostPrivateKey;
import ru.CryptoPro.JCSP.Key.GostSecretKey;
import ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface;
import ru.CryptoPro.JCSP.Key.JCSPSpecKey;
import ru.CryptoPro.JCSP.Key.PrivateKeySpec;
import ru.CryptoPro.JCSP.Key.SecretKeyImpl;
import ru.CryptoPro.JCSP.Key.ecdsa.ECDHPrivateKey;
import ru.CryptoPro.JCSP.Key.ecdsa.ECDSAPrivateKey;
import ru.CryptoPro.JCSP.Key.eddsa.EDDSAPrivateKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAExchPrivateKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAPrivateKey;
import ru.CryptoPro.JCSP.MSCAPI.CSPProv2001;
import ru.CryptoPro.JCSP.MSCAPI.HContainer;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public abstract class MSStore extends KeyStoreSpi {
    private static final Random RND = new Random();
    private static MessageDigest SHA1;
    private boolean enableMachineKeySet;
    protected final Map entries = new HashMap();
    protected final Lock entriesR;
    protected final Lock entriesW;
    protected final boolean isSystem;
    private final ReadWriteLock rwLock;
    protected final String storeName;
    protected String storePath;
    protected final StoreType storeType;

    public static class KeyInfo {
        private String containerName;
        private HKey hKey;

        public KeyInfo(String str, HKey hKey) {
            this.containerName = str;
            this.hKey = hKey;
        }

        public boolean isCompleted(boolean z) {
            boolean z2 = MSStore.getName(this.containerName) != null;
            return z ? z2 && (this.hKey != null) : z2;
        }
    }

    public enum StoreType {
        stSystem,
        stPFX
    }

    public static class SystemStoreLoadStoreParameter implements KeyStore.LoadStoreParameter {
        protected boolean enableMachineKeySet = false;
        protected final KeyStore.ProtectionParameter protection;

        public SystemStoreLoadStoreParameter(KeyStore.ProtectionParameter protectionParameter) {
            this.protection = protectionParameter;
        }

        public void enableMachineKeySet() {
            this.enableMachineKeySet = true;
        }

        @Override // java.security.KeyStore.LoadStoreParameter
        public KeyStore.ProtectionParameter getProtectionParameter() {
            return this.protection;
        }
    }

    public MSStore(String str, StoreType storeType) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.rwLock = reentrantReadWriteLock;
        this.entriesR = reentrantReadWriteLock.readLock();
        this.entriesW = reentrantReadWriteLock.writeLock();
        this.storePath = null;
        this.enableMachineKeySet = false;
        this.storeName = str;
        this.storeType = storeType;
        this.isSystem = storeType == StoreType.stSystem;
    }

    private static String calcHashId(X509Certificate x509Certificate) throws Exception {
        if (SHA1 == null) {
            SHA1 = MessageDigest.getInstance(JCP.DIGEST_SHA1);
        }
        try {
            byte[] digest = SHA1.digest(x509Certificate.getEncoded());
            if (digest != null) {
                return new BigInteger(1, digest).toString(16);
            }
            w511.s("Invalid certificate.");
            return null;
        } finally {
            SHA1.reset();
        }
    }

    private KeyInfo createKeyInfo(String str, String str2, String str3, String str4, String str5, int i, int i2, X509Certificate[] x509CertificateArr, boolean z) throws Exception {
        StringBuilder sb;
        JCSPLogger.subEnter();
        String name = getName(str5);
        String name2 = getName(str);
        String name3 = getName(str2);
        String name4 = getName(str3);
        KeyInfo keyInfo = new KeyInfo(name, null);
        if (name == null || z) {
            KeyInfo readKeyInfo = readKeyInfo(name2, str4, i, i2);
            if (readKeyInfo == null || !readKeyInfo.isCompleted(z)) {
                if (readKeyInfo == null || (z && readKeyInfo.hKey == null)) {
                    readKeyInfo = readKeyInfo(name3, str4, i, i2);
                }
                if (readKeyInfo == null || !readKeyInfo.isCompleted(z)) {
                    if (readKeyInfo == null || (z && readKeyInfo.hKey == null)) {
                        readKeyInfo = readKeyInfo(name4, str4, i, i2);
                    }
                    if (readKeyInfo != null && readKeyInfo.isCompleted(z)) {
                        if (name != null) {
                            readKeyInfo.containerName = name;
                        }
                        sb = new StringBuilder("Created alias (based on unique name): ");
                    }
                } else {
                    if (name != null) {
                        readKeyInfo.containerName = name;
                    }
                    sb = new StringBuilder("Created alias (based on container name): ");
                }
            } else {
                if (name != null) {
                    readKeyInfo.containerName = name;
                }
                sb = new StringBuilder("Created alias (based on properties): ");
            }
            sb.append(readKeyInfo.containerName);
            JCSPLogger.fine(sb.toString());
            return readKeyInfo;
        }
        if (keyInfo.containerName == null) {
            keyInfo.containerName = name2;
        }
        if (keyInfo.containerName == null) {
            keyInfo.containerName = name3;
        }
        if (keyInfo.containerName == null) {
            keyInfo.containerName = name4;
        }
        if (keyInfo.containerName == null) {
            if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
                w511.s("Certificate can not be null.");
                return null;
            }
            JCSPLogger.fine("Trying to use the certificate for making an alias...");
            String calcHashId = calcHashId(x509CertificateArr[0]);
            if (keyInfo.containerName == null) {
                keyInfo.containerName = calcHashId;
                JCSPLogger.fine("Created alias (based on Id): " + keyInfo.containerName);
            }
        }
        JCSPLogger.subExit();
        return keyInfo;
    }

    private Key engineGetKeyInternal(String str, char[] cArr, boolean z) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        JCSPLogger.subEnter();
        this.entriesR.lock();
        try {
            for (KeyEntry keyEntry : this.entries.values()) {
                if (keyEntry.isAppropriate(str)) {
                    JCSPLogger.subExit();
                    Key key = (z && this.isSystem) ? keyEntry.getKey(cArr) : keyEntry.getKey();
                    this.entriesR.unlock();
                    return key;
                }
            }
            this.entriesR.unlock();
            JCSPLogger.subExit();
            return null;
        } catch (Throwable th) {
            this.entriesR.unlock();
            throw th;
        }
    }

    private static void freeEntries(Map map) {
        JCSPLogger.subEnter();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            freeEntry(((KeyEntry) it.next()).getKey());
        }
        JCSPLogger.subExit();
    }

    private static void freeEntry(Key key) {
        JCSPLogger.subEnter();
        if (key instanceof SpecKey) {
            ((SpecKey) key).getSpec().clear();
        }
        JCSPLogger.subExit();
    }

    private static String genId(X509Certificate[] x509CertificateArr, int i) {
        if (i == 0 && x509CertificateArr != null && x509CertificateArr.length > 0) {
            try {
                return calcHashId(x509CertificateArr[0]);
            } catch (Exception unused) {
            }
        }
        StringBuilder sb = new StringBuilder("");
        sb.append(RND.nextInt() - 1);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getName(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static boolean isAppropriate(String str, String str2) {
        return str != null && str.equals(str2);
    }

    private KeyInfo readKeyInfo(String str, String str2, int i, int i2) {
        JCSPLogger.subEnter();
        if (str == null) {
            JCSPLogger.subExit();
            return null;
        }
        if (HContainer.isExist(str, null, str2, i)) {
            KeyInfo keyInfo = new KeyInfo(null, null);
            HProv provider = HProv.getProvider(i);
            try {
                try {
                    JCSPLogger.fine("Opening container " + str + " with provider " + str2 + "...");
                    provider.openContainer(str, str2, null, 0, false);
                    keyInfo.containerName = provider.getContainerName();
                    JCSPLogger.fine("Alias " + str + " has been read.");
                    if (i2 > 0) {
                        HKey readKey = provider.readKey(i2);
                        keyInfo.hKey = readKey;
                        JCSPLogger.fine("Key has been read, key handle: " + readKey.getHandle());
                    }
                    provider.releaseContext(4);
                    return keyInfo;
                } catch (Exception e) {
                    JCSPLogger.subThrown(e);
                    provider.releaseContext(4);
                }
            } catch (Throwable th) {
                provider.releaseContext(4);
                throw th;
            }
        }
        JCSPLogger.subExit();
        return null;
    }

    public native int detachCertificateAlias(String str, byte[] bArr, int i, int i2);

    public boolean enableUUIDKeyAliasOnLoading() {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        JCSPLogger.subEnter();
        this.entriesR.lock();
        try {
            final Iterator it = new ArrayList(this.entries.values()).iterator();
            this.entriesR.unlock();
            JCSPLogger.subExit();
            return new Enumeration() { // from class: ru.CryptoPro.JCSP.KeyStore.MSStore.1
                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return it.hasNext();
                }

                @Override // java.util.Enumeration
                public String nextElement() {
                    return ((KeyEntry) it.next()).getAlias();
                }
            };
        } catch (Throwable th) {
            this.entriesR.unlock();
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        JCSPLogger.subEnter();
        Enumeration engineAliases = engineAliases();
        while (engineAliases.hasMoreElements()) {
            if (isAppropriate((String) engineAliases.nextElement(), str)) {
                JCSPLogger.subExit();
                return true;
            }
        }
        JCSPLogger.subExit();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r8.isSystem == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = r2.getCertificateChain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r1 = r1[0].getEncoded();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        ru.CryptoPro.JCSP.CAPILogger.log("removeCertificate", new java.lang.Object[]{getStoreName(), r9}, 0, new java.lang.String[0]);
        r1 = removeCertificate(getStoreName(), r9, r1, r1.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r1 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        ru.CryptoPro.JCSP.CAPILogger.error("removeCertificate", new java.lang.Object[]{getStoreName(), r9}, r1, new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        throw new java.security.KeyStoreException("Can't remove entry, error: " + java.lang.Integer.toHexString(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        throw new java.security.KeyStoreException("Cannot decode certificate: " + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r9 = r2.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (r9 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        freeEntry(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        r8.entries.remove(r2.alias);
     */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineDeleteEntry(String str) throws KeyStoreException {
        JCSPLogger.subEnter();
        if (str == null) {
            dy31.t("Alias must not be null.");
            return;
        }
        this.entriesW.lock();
        try {
            Iterator it = this.entries.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                KeyEntry keyEntry = (KeyEntry) it.next();
                if (keyEntry.isAppropriate(str)) {
                    break;
                }
            }
            this.entriesW.unlock();
            JCSPLogger.subExit();
        } catch (Throwable th) {
            this.entriesW.unlock();
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        X509Certificate[] certificateChain;
        JCSPLogger.subEnter();
        if (str == null) {
            JCSPLogger.subExit();
            return null;
        }
        this.entriesR.lock();
        try {
            for (KeyEntry keyEntry : this.entries.values()) {
                if (keyEntry.isAppropriate(str) && (certificateChain = keyEntry.getCertificateChain()) != null && certificateChain.length > 0) {
                    JCSPLogger.subExit();
                    return certificateChain[0];
                }
            }
            this.entriesR.unlock();
            JCSPLogger.subExit();
            return null;
        } finally {
            this.entriesR.unlock();
        }
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        JCSPLogger.subEnter();
        this.entriesR.lock();
        try {
            for (KeyEntry keyEntry : this.entries.values()) {
                if (keyEntry.certChain != null && keyEntry.certChain.length > 0 && keyEntry.certChain[0].equals(certificate)) {
                    JCSPLogger.subExit();
                    return keyEntry.getAlias();
                }
            }
            this.entriesR.unlock();
            JCSPLogger.subExit();
            return null;
        } finally {
            this.entriesR.unlock();
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        X509Certificate[] certificateChain;
        JCSPLogger.subEnter();
        if (str == null) {
            JCSPLogger.subExit();
            return null;
        }
        this.entriesR.lock();
        try {
            for (KeyEntry keyEntry : this.entries.values()) {
                if (keyEntry.isAppropriate(str) && (certificateChain = keyEntry.getCertificateChain()) != null) {
                    JCSPLogger.subExit();
                    return (Certificate[]) certificateChain.clone();
                }
            }
            this.entriesR.unlock();
            JCSPLogger.subExit();
            return null;
        } finally {
            this.entriesR.unlock();
        }
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) engineGetCertificate(str);
        return x509Certificate != null ? x509Certificate.getNotBefore() : new Date();
    }

    @Override // java.security.KeyStoreSpi
    public KeyStore.Entry engineGetEntry(final String str, final KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException {
        char[] cArr;
        JCSPLogger.subEnter();
        if (!engineContainsAlias(str)) {
            JCSPLogger.subExit();
            return null;
        }
        int i = 1;
        boolean z = CSPStore.a.booleanValue() || DefaultProvider.getKeytoolCompat();
        if (!z && protectionParameter == null && engineIsCertificateEntry(str)) {
            Certificate engineGetCertificate = engineGetCertificate(str);
            if (engineGetCertificate == null) {
                throw new UnrecoverableKeyException("requested entry requires a password");
            }
            JCSPLogger.subExit();
            return new KeyStore.TrustedCertificateEntry(engineGetCertificate);
        }
        if (protectionParameter != null) {
            int keyType = protectionParameter instanceof JCPProtectionParameter ? ((JCPProtectionParameter) protectionParameter).getKeyType() : 0;
            if (engineIsKeyEntry(str)) {
                if (protectionParameter instanceof KeyStore.CallbackHandlerProtection) {
                    try {
                        cArr = (char[]) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCSP.KeyStore.MSStore.2
                            @Override // java.security.PrivilegedExceptionAction
                            public char[] run() throws Exception {
                                CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
                                PasswordCallback passwordCallback = new PasswordCallback("Password for alias " + str, false);
                                callbackHandler.handle(new Callback[]{passwordCallback});
                                char[] password = passwordCallback.getPassword();
                                passwordCallback.clearPassword();
                                return password;
                            }
                        });
                        if (cArr == null) {
                            dy31.t("No password provided");
                            return null;
                        }
                    } catch (PrivilegedActionException e) {
                        throw new KeyStoreException("KeyStore instantiation failed", e);
                    }
                } else {
                    KeyStore.PasswordProtection passwordProtection = (KeyStore.PasswordProtection) protectionParameter;
                    char[] password = passwordProtection.getPassword();
                    if (passwordProtection instanceof JCPProtectionParameter) {
                        JCPProtectionParameter jCPProtectionParameter = (JCPProtectionParameter) protectionParameter;
                        jCPProtectionParameter.isSilentMode();
                        z = jCPProtectionParameter.isAllowEmptyChain();
                    }
                    cArr = password;
                }
                Key engineGetKeyInternal = engineGetKeyInternal(str, cArr, true);
                if (engineGetKeyInternal instanceof PrivateKey) {
                    if (!(engineGetKeyInternal instanceof GostExchPrivateKey) && !(engineGetKeyInternal instanceof RSAExchPrivateKey)) {
                        i = ((engineGetKeyInternal instanceof GostPrivateKey) || (engineGetKeyInternal instanceof RSAPrivateKey)) ? 2 : 0;
                    }
                    if (keyType == i || keyType == 0) {
                        Certificate[] engineGetCertificateChain = engineGetCertificateChain(str);
                        JCSPLogger.subExit();
                        return new JCPPrivateKeyEntry((PrivateKey) engineGetKeyInternal, engineGetCertificateChain, z);
                    }
                }
                if (engineGetKeyInternal instanceof SecretKey) {
                    JCSPLogger.subExit();
                    return new KeyStore.SecretKeyEntry((SecretKey) engineGetKeyInternal);
                }
            }
        }
        throw new UnrecoverableEntryException();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        JCSPLogger.subEnter();
        if (str == null) {
            JCSPLogger.subExit();
            return null;
        }
        boolean engineIsKeyEntry = engineIsKeyEntry(str);
        JCSPLogger.subExit();
        if (engineIsKeyEntry) {
            return engineGetKeyInternal(str, cArr, false);
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        KeyEntry keyEntry;
        JCSPLogger.subEnter();
        this.entriesR.lock();
        try {
            Iterator it = this.entries.values().iterator();
            do {
                if (!it.hasNext()) {
                    this.entriesR.unlock();
                    JCSPLogger.subExit();
                    return false;
                }
                keyEntry = (KeyEntry) it.next();
            } while (!keyEntry.isAppropriate(str));
            JCSPLogger.subExit();
            return keyEntry.getKey() == null;
        } finally {
            this.entriesR.unlock();
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        JCSPLogger.subEnter();
        if (str == null) {
            JCSPLogger.subExit();
            return false;
        }
        this.entriesR.lock();
        try {
            for (KeyEntry keyEntry : this.entries.values()) {
                if (keyEntry.isAppropriate(str)) {
                    JCSPLogger.subExit();
                    return keyEntry.getKey() != null;
                }
            }
            this.entriesR.unlock();
            JCSPLogger.subExit();
            return false;
        } finally {
            this.entriesR.unlock();
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        JCSPLogger.subEnter();
        this.entriesW.lock();
        try {
            try {
                if (!(inputStream instanceof VoidInputStream)) {
                    freeEntries(this.entries);
                    this.entries.clear();
                    engineLoadInternal(inputStream, cArr);
                }
                JCSPLogger.subExit();
            } catch (Exception e) {
                if (!(e instanceof IOException)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } finally {
            this.entriesW.unlock();
        }
    }

    public abstract void engineLoadInternal(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException;

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        boolean z;
        KeyEntry keyEntry;
        Map map;
        JCSPLogger.subEnter();
        if (str == null) {
            dy31.t("Alias must not be null.");
            return;
        }
        if (!(certificate instanceof X509Certificate)) {
            dy31.t("Cannot assign the certificate to the given alias.");
            return;
        }
        X509Certificate[] x509CertificateArr = {(X509Certificate) certificate};
        this.entriesW.lock();
        try {
            try {
                Iterator it = this.entries.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        keyEntry = null;
                        break;
                    } else {
                        keyEntry = (KeyEntry) it.next();
                        if (keyEntry.isAppropriate(str)) {
                            z = true;
                            break;
                        }
                    }
                }
                KeyEntry keyEntry2 = !z ? new KeyEntry(this, str, null, x509CertificateArr) : new KeyEntry(this, keyEntry.alias, keyEntry.key, keyEntry.certChain);
                if (this.isSystem) {
                    keyEntry2.setCertificateChain(x509CertificateArr, z);
                    if (z) {
                        keyEntry.saveCertificateChain(keyEntry2.certChain);
                        this.entriesW.unlock();
                        JCSPLogger.subExit();
                    } else {
                        map = this.entries;
                        map.put(keyEntry2.alias, keyEntry2);
                        this.entriesW.unlock();
                        JCSPLogger.subExit();
                    }
                }
                keyEntry2.saveCertificateChain(x509CertificateArr);
                if (z) {
                    keyEntry.saveCertificateChain(keyEntry2.certChain);
                    this.entriesW.unlock();
                    JCSPLogger.subExit();
                } else {
                    map = this.entries;
                    map.put(keyEntry2.alias, keyEntry2);
                    this.entriesW.unlock();
                    JCSPLogger.subExit();
                }
            } catch (Exception e) {
                throw new KeyStoreException(e);
            }
        } catch (Throwable th) {
            this.entriesW.unlock();
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetEntry(String str, KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException {
        JCSPLogger.subEnter();
        if (protectionParameter != null && !(protectionParameter instanceof KeyStore.PasswordProtection)) {
            dy31.t("unsupported protection parameter");
            return;
        }
        KeyStore.PasswordProtection passwordProtection = protectionParameter != null ? (KeyStore.PasswordProtection) protectionParameter : null;
        if (entry instanceof JCPPrivateKeyEntry) {
            JCPPrivateKeyEntry jCPPrivateKeyEntry = (JCPPrivateKeyEntry) entry;
            engineSetKeyEntry(str, jCPPrivateKeyEntry.getPrivateKey(), passwordProtection != null ? passwordProtection.getPassword() : null, jCPPrivateKeyEntry.getCertificateChain());
            return;
        }
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            engineSetKeyEntry(str, privateKeyEntry.getPrivateKey(), passwordProtection != null ? passwordProtection.getPassword() : null, privateKeyEntry.getCertificateChain());
        } else if (entry instanceof KeyStore.SecretKeyEntry) {
            engineSetKeyEntry(str, ((KeyStore.SecretKeyEntry) entry).getSecretKey(), passwordProtection == null ? null : passwordProtection.getPassword(), null);
        } else if (entry instanceof KeyEntry) {
            engineSetKeyEntry(str, ((KeyEntry) entry).getKey(), passwordProtection == null ? null : passwordProtection.getPassword(), null);
        } else {
            JCSPLogger.subExit();
            throw new KeyStoreException("unsupported entry type: ".concat(entry.getClass().getName()));
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        boolean z;
        KeyEntry keyEntry;
        Map map;
        JCSPLogger.subEnter();
        if (str == null) {
            dy31.t("Alias must not be null.");
            return;
        }
        if (cArr != null) {
            if (!CSPStore.a.booleanValue()) {
                dy31.t("Password must be null.");
                return;
            }
            JCSPLogger.fine("Password should be null, ignored.");
        }
        if (certificateArr == null || certificateArr.length == 0) {
            dy31.t("Certificate chain must not be null.");
            return;
        }
        if (!(key instanceof GostPrivateKey)) {
            dy31.t("Cannot assign the key to the given alias.");
            return;
        }
        this.entriesW.lock();
        try {
            try {
                Iterator it = this.entries.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        keyEntry = null;
                        break;
                    } else {
                        keyEntry = (KeyEntry) it.next();
                        if (keyEntry.isAppropriate(str)) {
                            z = true;
                            break;
                        }
                    }
                }
                KeyEntry keyEntry2 = !z ? new KeyEntry(this, str, null, certificateArr) : new KeyEntry(this, keyEntry.alias, keyEntry.key, keyEntry.certChain);
                if (this.isSystem) {
                    keyEntry2.setKey(key);
                    keyEntry2.setCertificateChain(certificateArr, z);
                    if (z) {
                        keyEntry.saveKey(keyEntry2.key);
                        keyEntry.saveCertificateChain(keyEntry2.certChain);
                        this.entriesW.unlock();
                        JCSPLogger.subExit();
                    }
                    map = this.entries;
                    map.put(keyEntry2.alias, keyEntry2);
                    this.entriesW.unlock();
                    JCSPLogger.subExit();
                }
                keyEntry2.setKey(key);
                keyEntry2.saveCertificateChain(certificateArr);
                if (z) {
                    keyEntry.saveKey(keyEntry2.key);
                    keyEntry.saveCertificateChain(keyEntry2.certChain);
                    this.entriesW.unlock();
                    JCSPLogger.subExit();
                }
                map = this.entries;
                map.put(keyEntry2.alias, keyEntry2);
                this.entriesW.unlock();
                JCSPLogger.subExit();
            } catch (Exception e) {
                throw new KeyStoreException(e);
            }
        } catch (Throwable th) {
            this.entriesW.unlock();
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        JCSPLogger.subEnter();
        this.entriesR.lock();
        try {
            int size = this.entries.size();
            this.entriesR.unlock();
            JCSPLogger.subExit();
            return size;
        } catch (Throwable th) {
            this.entriesR.unlock();
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        throw new IOException("Operation not supported");
    }

    public X509Certificate generateCertificate(byte[] bArr) {
        X509Certificate x509Certificate;
        Exception e;
        JCSPLogger.subEnter();
        JCSPLogger.fine("Generating certificate...");
        try {
            x509Certificate = (X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(bArr));
            try {
                JCSPLogger.fine("Generating has been completed.");
            } catch (Exception e2) {
                e = e2;
                JCSPLogger.subThrown(e);
                JCSPLogger.subExit();
                return x509Certificate;
            }
        } catch (Exception e3) {
            x509Certificate = null;
            e = e3;
        }
        JCSPLogger.subExit();
        return x509Certificate;
    }

    public void generateCertificateChain(String str, String str2, String str3, String str4, String str5, int i, int i2, Collection collection) {
        String str6;
        JCSPLogger.subEnter();
        JCSPLogger.fine("Adding a new certificate entry...");
        try {
            X509Certificate[] x509CertificateArr = new X509Certificate[collection.size()];
            Iterator it = collection.iterator();
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                x509CertificateArr[i4] = (X509Certificate) it.next();
                i4++;
            }
            KeyInfo createKeyInfo = createKeyInfo(str, str2, str3, str4, str5, i, i2, x509CertificateArr, false);
            JCSPLogger.fine("Certificate entry alias: " + createKeyInfo.containerName);
            if (enableUUIDKeyAliasOnLoading()) {
                str6 = "pfx-" + UUID.randomUUID();
            } else {
                str6 = createKeyInfo.containerName;
                while (this.entries.get(str6) != null) {
                    if (i3 >= 128) {
                        throw new Exception("Alias " + createKeyInfo.containerName + " is not unique. More than 128 attempts to get a unique alias failed. Something wrong with reading from this storage.");
                    }
                    str6 = createKeyInfo.containerName + "_" + genId(x509CertificateArr, i3);
                    i3++;
                }
            }
            this.entries.put(str6, new KeyEntry(str6, x509CertificateArr));
            JCSPLogger.fine("Certificate entry with alias " + createKeyInfo.containerName + " has been added.");
        } catch (Exception e) {
            JCSPLogger.subThrown(e);
        }
        JCSPLogger.subExit();
    }

    public void generateCertificates(byte[] bArr, Collection collection) {
        JCSPLogger.subEnter();
        JCSPLogger.fine("Generating certificate (2)...");
        try {
            collection.add((X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(bArr)));
            JCSPLogger.fine("Generating (2) has been completed.");
        } catch (Exception e) {
            JCSPLogger.subThrown(e);
        }
        JCSPLogger.subExit();
    }

    public void generateKeyAndCertificateChain(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, long j2, int i3, int i4, Collection collection, ContainerExtensionStructure containerExtensionStructure) throws Exception {
        String str6;
        int i5;
        int i6;
        HKey hKey;
        String str7;
        AbstractKeySpec exchPrivateKeySpec;
        JCSPLogger.subEnter();
        JCSPLogger.fine("Adding a new entry...");
        try {
            X509Certificate[] x509CertificateArr = new X509Certificate[collection.size()];
            Iterator it = collection.iterator();
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext()) {
                x509CertificateArr[i8] = (X509Certificate) it.next();
                i8++;
            }
            JCSPSpecKey jCSPSpecKey = null;
            boolean z = true;
            if (j2 != 0) {
                JCSPLogger.fine("Recognizing provider type...");
                HProv cSPProv2001 = new CSPProv2001(j);
                i5 = Array.getInt(cSPProv2001.getProvParam(16, 0), 0);
                JCSPLogger.fine("Recognized provider type: " + i5);
                if (i5 != 75) {
                    cSPProv2001 = AlgorithmGroups.a(i5, j);
                }
                HKey hKey2 = new HKey(cSPProv2001, j2, 0);
                cSPProv2001.setBeDeleted();
                if (this.isSystem && i4 == 1) {
                    cSPProv2001.releaseContext(4);
                }
                if (this.isSystem && str4 == null && i == 0 && i2 == 0) {
                    hKey = hKey2;
                    str6 = DefaultCSPProvider.getProviderNameByType(i5);
                    i6 = i3;
                } else {
                    str6 = str4;
                    i5 = i;
                    i6 = i2;
                    hKey = hKey2;
                }
            } else {
                str6 = str4;
                i5 = i;
                i6 = i2;
                hKey = null;
            }
            KeyInfo createKeyInfo = createKeyInfo(str, str2, str3, str6, str5, i5, i6, x509CertificateArr, this.isSystem && hKey != null);
            StringBuilder sb = new StringBuilder();
            sb.append(hKey != null ? "Key" : "Certificate");
            sb.append(" entry alias: ");
            sb.append(createKeyInfo.containerName);
            JCSPLogger.fine(sb.toString());
            if (hKey != null) {
                String str8 = createKeyInfo.containerName;
                JCSPLogger.fine("Reloading the private key, is system: " + this.isSystem + "...");
                if (this.isSystem && createKeyInfo.hKey != null) {
                    hKey.destroyKey();
                    hKey = createKeyInfo.hKey;
                    JCSPLogger.fine("The private key has been reloaded.");
                }
                JCSPLogger.fine("Key specification: " + i3);
                if (i3 == 1) {
                    exchPrivateKeySpec = new ExchPrivateKeySpec(hKey, str8);
                } else {
                    if (i3 != 2) {
                        throw new Exception("Unknown key spec: " + i3);
                    }
                    exchPrivateKeySpec = new PrivateKeySpec(hKey, str8);
                }
                if (!this.isSystem && containerExtensionStructure != null && containerExtensionStructure.ifInit()) {
                    int[] iArr = OID.fromByteZ(containerExtensionStructure.sOid.value).value;
                    if (containerExtensionStructure.bCritical.value == 0) {
                        z = false;
                    }
                    exchPrivateKeySpec.addExtension(new Extension(iArr, z, containerExtensionStructure.pbExtension.value));
                }
                JCSPLogger.fine("Is foreign key: " + exchPrivateKeySpec.isForeignKey());
                jCSPSpecKey = (JCSPSpecKey) ru.CryptoPro.JCSP.Key.cl_2.a(exchPrivateKeySpec);
                if (!this.isSystem) {
                    jCSPSpecKey.setFromPfx();
                }
            } else {
                JCSPLogger.fine("Adding certificate only.");
            }
            if (enableUUIDKeyAliasOnLoading()) {
                str7 = "pfx-" + UUID.randomUUID();
            } else {
                str7 = createKeyInfo.containerName;
                while (this.entries.get(str7) != null) {
                    if (i7 >= 128) {
                        throw new Exception("Alias " + createKeyInfo.containerName + " is not unique. More than 128 attempts to get a unique alias failed. Something wrong with reading from this storage.");
                    }
                    str7 = createKeyInfo.containerName + "_" + genId(x509CertificateArr, i7);
                    i7++;
                }
            }
            this.entries.put(str7, new KeyEntry(this, str7, jCSPSpecKey, x509CertificateArr));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jCSPSpecKey != null ? "Key" : "Certificate");
            sb2.append(" entry ");
            sb2.append(createKeyInfo.containerName);
            sb2.append(" has been added.");
            JCSPLogger.fine(sb2.toString());
        } catch (Exception e) {
            JCSPLogger.subThrown(e);
        }
        JCSPLogger.subExit();
    }

    public int getKeySetType() {
        return (this.enableMachineKeySet || DefaultCSPProvider.getKeySetType() == 1) ? 32 : 4096;
    }

    public String getStoreName() {
        String str = this.storePath;
        return str != null ? str : this.storeName;
    }

    public boolean isFile() {
        return this.storePath != null;
    }

    public native int readStore(String str, boolean z);

    public native int removeCertificate(String str, String str2, byte[] bArr, int i);

    public native int storeCertificate(String str, String str2, byte[] bArr, int i, long j, long j2, int i2);

    public native int storeCertificateByHandle(long j, String str, byte[] bArr, int i, long j2, long j3, int i2);

    public class KeyEntry implements KeyStore.Entry {
        private final String alias;
        private X509Certificate[] certChain;
        private long hCertStoreForExportToPfx;
        private Key key;

        public KeyEntry(String str, Certificate[] certificateArr) {
            this.key = null;
            this.certChain = null;
            this.hCertStoreForExportToPfx = 0L;
            this.alias = str;
            saveCertificateChain(certificateArr);
        }

        public boolean equals(Object obj) {
            return obj != null && (obj instanceof KeyEntry) && isAppropriate(((KeyEntry) obj).alias);
        }

        public String getAlias() {
            return this.alias;
        }

        public X509Certificate[] getCertificateChain() {
            return this.certChain;
        }

        public Key getKey(char[] cArr) throws UnrecoverableKeyException {
            JCSPLogger.subEnter();
            ContainerPassword containerPassword = new ContainerPassword(cArr == null ? null : CPString.getArray(new String(cArr)));
            Key key = this.key;
            if (key instanceof SpecKey) {
                KeyInterface spec = ((SpecKey) key).getSpec();
                if (spec instanceof AbstractKeySpec) {
                    try {
                        ((AbstractKeySpec) spec).setPassword(containerPassword);
                    } catch (Exception e) {
                        UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException(e.getMessage());
                        unrecoverableKeyException.initCause(e);
                        throw unrecoverableKeyException;
                    }
                } else if (spec instanceof SecretKeyImpl) {
                    throw new UnrecoverableKeyException("Invalid key type.");
                }
            }
            JCSPLogger.subExit();
            return this.key;
        }

        public int hashCode() {
            return this.alias.hashCode();
        }

        public boolean isAppropriate(String str) {
            return MSStore.isAppropriate(this.alias, str);
        }

        public void saveCertificateChain(Certificate[] certificateArr) {
            JCSPLogger.subEnter();
            if (certificateArr != null && certificateArr.length > 0) {
                X509Certificate[] x509CertificateArr = new X509Certificate[certificateArr.length];
                this.certChain = x509CertificateArr;
                System.arraycopy(certificateArr, 0, x509CertificateArr, 0, certificateArr.length);
            }
            JCSPLogger.subExit();
        }

        public void saveKey(Key key) {
            JCSPLogger.subEnter();
            this.key = key;
            JCSPLogger.subExit();
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void setCertificateChain(Certificate[] certificateArr, boolean z) throws CertificateException, KeyStoreException {
            String str;
            long j;
            byte[] bArr;
            int storeCertificate;
            int i;
            HKey hKey;
            HProv hProv;
            long j2;
            MSStore mSStore;
            String storeName;
            String str2;
            int length;
            int keySetType;
            long j3;
            long j4;
            String str3;
            int length2;
            long j5;
            int keySetType2;
            long j6;
            int storeCertificate2;
            X509Certificate[] x509CertificateArr;
            String str4;
            JCSPLogger.subEnter();
            if (certificateArr != null && certificateArr.length > 0) {
                for (int i2 = 0; i2 < certificateArr.length; i2++) {
                    Certificate certificate = certificateArr[i2];
                    byte[] encoded = certificate.getEncoded();
                    CAPILogger.log("storeCertificate", new Object[]{MSStore.this.getStoreName(), this.alias}, 0L, oyr.i(i2, "for #"));
                    HProv hProv2 = null;
                    HKey hKey2 = null;
                    if (i2 == 0) {
                        Key key = this.key;
                        if (key != null && (key instanceof SpecKey)) {
                            KeyInterface spec = ((SpecKey) key).getSpec();
                            if (spec instanceof AbstractKeySpec) {
                                hKey2 = ((AbstractKeySpec) spec).getKey();
                                HProv provHandle = hKey2.getProvHandle();
                                try {
                                    if (new JCPKeyPair(certificate.getPublicKey(), (PrivateKey) this.key).match()) {
                                        hProv = provHandle;
                                        if (hKey2 != null || hKey2.getHandle() == 0 || hProv == null || hProv.getHandle() == 0) {
                                            str = "storeCertificate";
                                            j = 0;
                                            bArr = encoded;
                                            j2 = this.hCertStoreForExportToPfx;
                                            mSStore = MSStore.this;
                                            if (j2 == 0) {
                                                str3 = this.alias;
                                                length2 = bArr.length;
                                                j5 = 0;
                                                keySetType2 = mSStore.getKeySetType();
                                                j6 = 0;
                                                storeCertificate2 = mSStore.storeCertificateByHandle(j2, str3, bArr, length2, j6, j5, keySetType2);
                                            } else {
                                                storeName = mSStore.getStoreName();
                                                str2 = this.alias;
                                                encoded = bArr;
                                                length = encoded.length;
                                                keySetType = MSStore.this.getKeySetType();
                                                j3 = 0;
                                                j4 = 0;
                                                storeCertificate2 = mSStore.storeCertificate(storeName, str2, encoded, length, j3, j4, keySetType);
                                                bArr = encoded;
                                            }
                                        } else {
                                            j2 = this.hCertStoreForExportToPfx;
                                            mSStore = MSStore.this;
                                            if (j2 != 0) {
                                                String str5 = this.alias;
                                                length2 = encoded.length;
                                                bArr = encoded;
                                                str3 = str5;
                                                j6 = hProv.getHandle();
                                                j = 0;
                                                j5 = hKey2.getHandle();
                                                keySetType2 = MSStore.this.getKeySetType();
                                                str = "storeCertificate";
                                                storeCertificate2 = mSStore.storeCertificateByHandle(j2, str3, bArr, length2, j6, j5, keySetType2);
                                            } else {
                                                j = 0;
                                                str = "storeCertificate";
                                                storeName = mSStore.getStoreName();
                                                str2 = this.alias;
                                                length = encoded.length;
                                                j3 = hProv.getHandle();
                                                j4 = hKey2.getHandle();
                                                keySetType = MSStore.this.getKeySetType();
                                                storeCertificate2 = mSStore.storeCertificate(storeName, str2, encoded, length, j3, j4, keySetType);
                                                bArr = encoded;
                                            }
                                        }
                                        if (z && storeCertificate2 == 0 && (x509CertificateArr = this.certChain) != null && x509CertificateArr.length > 0 && !Arrays.equals(bArr, x509CertificateArr[i2].getEncoded())) {
                                            byte[] encoded2 = this.certChain[i2].getEncoded();
                                            MSStore mSStore2 = MSStore.this;
                                            int detachCertificateAlias = mSStore2.detachCertificateAlias(mSStore2.getStoreName(), encoded2, encoded2.length, MSStore.this.getKeySetType());
                                            if (detachCertificateAlias != 0) {
                                                CAPILogger.error(str, new Object[]{MSStore.this.getStoreName()}, detachCertificateAlias, "WARNING: can not remove friendly-name of the replaced certificate.");
                                            }
                                        }
                                        HKey hKey3 = hKey2;
                                        hProv2 = hProv;
                                        i = storeCertificate2;
                                        hKey = hKey3;
                                    }
                                } catch (Exception e) {
                                    throw new KeyStoreException(e);
                                }
                            } else {
                                str4 = spec instanceof SecretKeyImpl ? "Invalid key type." : "Mismatch of the private key and the certificate.";
                            }
                            dy31.t(str4);
                            return;
                        }
                        hProv = null;
                        if (hKey2 != null) {
                        }
                        str = "storeCertificate";
                        j = 0;
                        bArr = encoded;
                        j2 = this.hCertStoreForExportToPfx;
                        mSStore = MSStore.this;
                        if (j2 == 0) {
                        }
                    } else {
                        str = "storeCertificate";
                        j = 0;
                        bArr = encoded;
                        long j7 = this.hCertStoreForExportToPfx;
                        MSStore mSStore3 = MSStore.this;
                        if (j7 != 0) {
                            storeCertificate = mSStore3.storeCertificateByHandle(j7, null, bArr, bArr.length, 0L, 0L, mSStore3.getKeySetType());
                        } else {
                            storeCertificate = mSStore3.storeCertificate(mSStore3.getStoreName(), null, bArr, bArr.length, 0L, 0L, MSStore.this.getKeySetType());
                            bArr = bArr;
                        }
                        i = storeCertificate;
                        hKey = null;
                    }
                    if (i != 0) {
                        String storeName2 = MSStore.this.getStoreName();
                        String str6 = this.alias;
                        Integer valueOf = Integer.valueOf(bArr.length);
                        Long valueOf2 = Long.valueOf(hProv2 != null ? hProv2.getHandle() : j);
                        if (hKey != null) {
                            j = hKey.getHandle();
                        }
                        CAPILogger.error(str, new Object[]{storeName2, str6, bArr, valueOf, valueOf2, Long.valueOf(j)}, i, new String[0]);
                        throw new KeyStoreException(oyr.i(i, "Can't store certificate (and key), result: "));
                    }
                }
                saveCertificateChain(certificateArr);
            }
            JCSPLogger.subExit();
        }

        public void setKey(Key key) throws Exception {
            Key gostSecretKey;
            JCSPLogger.subEnter();
            if (!(key instanceof SpecKey)) {
                w511.s("Can not store the key, invalid type.");
                return;
            }
            KeyInterface keyInterface = (KeyInterface) ((SpecKey) key).getSpec().clone();
            if (key instanceof RSAExchPrivateKey) {
                gostSecretKey = new RSAExchPrivateKey((JCSPPrivateKeyInterface) keyInterface);
            } else if (key instanceof RSAPrivateKey) {
                gostSecretKey = new RSAPrivateKey((JCSPPrivateKeyInterface) keyInterface);
            } else if (key instanceof ECDHPrivateKey) {
                gostSecretKey = new ECDHPrivateKey((JCSPPrivateKeyInterface) keyInterface);
            } else if (key instanceof ECDSAPrivateKey) {
                gostSecretKey = new ECDSAPrivateKey((JCSPPrivateKeyInterface) keyInterface);
            } else if (key instanceof EDDSAPrivateKey) {
                gostSecretKey = new ECDHPrivateKey((JCSPPrivateKeyInterface) keyInterface);
            } else if (key instanceof GostExchPrivateKey) {
                gostSecretKey = new GostExchPrivateKey((JCSPPrivateKeyInterface) keyInterface);
            } else if (key instanceof GostPrivateKey) {
                gostSecretKey = new GostPrivateKey((JCSPPrivateKeyInterface) keyInterface);
            } else {
                if (!(key instanceof GostSecretKey)) {
                    w511.s("Can not store the key, invalid type.");
                    return;
                }
                gostSecretKey = new GostSecretKey((JCSPSecretKeyInterface) keyInterface);
            }
            this.key = gostSecretKey;
            JCSPLogger.subExit();
        }

        public void sethCertStoreForExportToPfx(long j) {
            this.hCertStoreForExportToPfx = j;
        }

        public KeyEntry(MSStore mSStore, String str, Key key, Certificate[] certificateArr) {
            this(str, certificateArr);
            saveKey(key);
        }

        public Key getKey() {
            return this.key;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        JCSPLogger.subEnter();
        if (loadStoreParameter instanceof SystemStoreLoadStoreParameter) {
            this.enableMachineKeySet = ((SystemStoreLoadStoreParameter) loadStoreParameter).enableMachineKeySet;
        }
        super.engineLoad(loadStoreParameter);
        JCSPLogger.subExit();
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new KeyStoreException("Operation not supported");
    }

    public void generateCertificateChain(Collection collection) {
        JCSPLogger.subEnter();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            generateCertificateChain(null, null, null, null, null, 0, 0, Collections.singletonList((X509Certificate) it.next()));
        }
        JCSPLogger.subExit();
    }

    public void generateCertificateChain(Collection collection, Collection collection2) {
        MSStore mSStore;
        JCSPLogger.subEnter();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it.next();
            Iterator it2 = collection2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    mSStore = this;
                    break;
                }
                Collection collection3 = (Collection) it2.next();
                if (!collection3.isEmpty() && x509Certificate == ((X509Certificate) collection3.iterator().next())) {
                    mSStore = this;
                    mSStore.generateCertificateChain(null, null, null, null, null, 0, 0, collection3);
                    it.remove();
                    break;
                }
                this = this;
            }
            this = mSStore;
        }
        this.generateCertificateChain(collection);
        JCSPLogger.subExit();
    }
}
