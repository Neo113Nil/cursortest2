package ru.CryptoPro.JCSP.KeyStore;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import defpackage.dy31;
import defpackage.g8e;
import defpackage.w511;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.Key;
import java.security.KeyException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProviderException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.crypto.SecretKey;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostPrivateCertificateStore;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.KeyStore.InvalidPasswordException;
import ru.CryptoPro.JCP.KeyStore.JCPPrivateKeyEntry;
import ru.CryptoPro.JCP.KeyStore.NoSuchCarrierException;
import ru.CryptoPro.JCP.KeyStore.StoreInputStream;
import ru.CryptoPro.JCP.KeyStore.VoidInputStream;
import ru.CryptoPro.JCP.Util.DefaultProvider;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.JCPProtectionParameter;
import ru.CryptoPro.JCP.params.JCPProtectionParameterInfo;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCPRequest.GostCertificateRequest;
import ru.CryptoPro.JCSP.CStructReader.ContainerExtensionStructure;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.ContainerPassword;
import ru.CryptoPro.JCSP.Key.ExchPrivateKeySpec;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeySpec;
import ru.CryptoPro.JCSP.Key.JCSPSpecKey;
import ru.CryptoPro.JCSP.Key.PrivateKeySpec;
import ru.CryptoPro.JCSP.Key.cl_2;
import ru.CryptoPro.JCSP.MSCAPI.HContainer;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSKeyException;
import ru.CryptoPro.JCSP.MSCAPI.ReaderInfo;
import ru.CryptoPro.JCSP.Starter;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public abstract class CSPStore extends KeyStoreSpi {
    public static final String KEYSPEC_AT_KEYEXCHANGE = "1";
    public static final String KEYSPEC_AT_SIGNATURE = "2";
    public static final String KEYSPEC_PREFIX = "****";
    public static final String PASSWORD_PREFIX = "::::";
    public static final String PROVNAME_PREFIX = "####";
    public static final String SLASH = "/";
    public static final char UNIQUE_SEPARATOR = '\\';
    private static final String e = "X.509";
    protected ReaderInfo c;
    static final Boolean a = Boolean.valueOf(GetProperty.getBooleanProperty("keytool.compat", false));
    static final Boolean b = Boolean.valueOf(GetProperty.getBooleanProperty("use.cert.stub", false));
    public static final Boolean CSP_KEY_CACHE = Boolean.valueOf(GetProperty.getBooleanProperty("csp.cache", false));
    public static final boolean CHECK_IF_EXISTS = GetProperty.getBooleanProperty("check.if.exists", true);
    private String f = null;
    protected boolean d = false;

    public static class FailIfNotAvailableStoreParameter implements KeyStore.LoadStoreParameter {
        @Override // java.security.KeyStore.LoadStoreParameter
        public KeyStore.ProtectionParameter getProtectionParameter() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, Key key, boolean z, char[] cArr, Certificate[] certificateArr, boolean z2) throws KeyStoreException {
        String str2;
        String str3;
        byte[] bArr;
        AbstractKeySpec abstractKeySpec;
        boolean z3;
        AbstractKeySpec abstractKeySpec2;
        Throwable th;
        UnrecoverableKeyException unrecoverableKeyException;
        AccessControlException accessControlException;
        IllegalArgumentException illegalArgumentException;
        int defaultProviderType;
        AbstractKeySpec copyKey;
        AbstractKeySpec abstractKeySpec3;
        AbstractKeySpec abstractKeySpec4 = null;
        byte[] array = cArr == null ? null : CPString.getArray(new String(cArr));
        int indexOf = str.indexOf(PROVNAME_PREFIX);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            str2 = str.substring(indexOf + 4);
            str3 = substring;
        } else {
            str2 = str;
            str3 = null;
        }
        if (str3 != null) {
            checkProviderName(str3);
        }
        int indexOf2 = str2.indexOf("::::");
        if (indexOf2 >= 0) {
            bArr = CPString.getArray(str2.substring(indexOf2 + 4));
            str2 = str2.substring(0, indexOf2);
        } else {
            bArr = null;
        }
        cl_0 cl_0Var = new cl_0(str3, this.c.getReaderName(), str2, bArr);
        boolean z4 = key instanceof JCSPSpecKey;
        if (z4) {
            JCSPSpecKey jCSPSpecKey = (JCSPSpecKey) key;
            KeyInterface spec = jCSPSpecKey.getSpec();
            if (!(spec instanceof AbstractKeySpec)) {
                dy31.t("Key with such type cannot be saved.");
                return;
            } else {
                abstractKeySpec = (AbstractKeySpec) spec;
                z3 = jCSPSpecKey.isFromPfx();
            }
        } else {
            abstractKeySpec = null;
            z3 = false;
        }
        try {
            if (z4) {
                try {
                    List providerTypes = this.c.getProviderTypes(cl_0Var.a(), this.c.getProviderTypes());
                    if (providerTypes.isEmpty()) {
                        try {
                            defaultProviderType = getDefaultProviderType();
                        } catch (IllegalArgumentException e2) {
                            illegalArgumentException = e2;
                            throw new KeyStoreException(illegalArgumentException);
                        } catch (AccessControlException e3) {
                            accessControlException = e3;
                            throw new KeyStoreException(accessControlException);
                        } catch (UnrecoverableKeyException e4) {
                            unrecoverableKeyException = e4;
                            throw new KeyStoreException(unrecoverableKeyException);
                        } catch (Throwable th2) {
                            th = th2;
                            abstractKeySpec2 = abstractKeySpec;
                            if (abstractKeySpec4 == null) {
                            }
                        }
                    } else {
                        defaultProviderType = ((Integer) providerTypes.get(0)).intValue();
                    }
                    AbstractKeySpec abstractKeySpec5 = abstractKeySpec;
                    try {
                        copyKey = abstractKeySpec5.copyKey(this.c, defaultProviderType, cl_0Var, bArr, z, array, z2, z3);
                        abstractKeySpec2 = abstractKeySpec5;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        illegalArgumentException = e;
                        throw new KeyStoreException(illegalArgumentException);
                    } catch (AccessControlException e6) {
                        e = e6;
                        accessControlException = e;
                        throw new KeyStoreException(accessControlException);
                    } catch (UnrecoverableKeyException e7) {
                        e = e7;
                        unrecoverableKeyException = e;
                        throw new KeyStoreException(unrecoverableKeyException);
                    } catch (Throwable th3) {
                        th = th3;
                        abstractKeySpec2 = abstractKeySpec5;
                        th = th;
                        if (abstractKeySpec4 == null) {
                            throw th;
                        }
                        if (abstractKeySpec4 == abstractKeySpec2) {
                            throw th;
                        }
                        abstractKeySpec4.clear();
                        throw th;
                    }
                } catch (IllegalArgumentException e8) {
                    e = e8;
                } catch (AccessControlException e9) {
                    e = e9;
                } catch (UnrecoverableKeyException e10) {
                    e = e10;
                } catch (Throwable th4) {
                    th = th4;
                    abstractKeySpec2 = abstractKeySpec;
                }
            } else {
                abstractKeySpec2 = abstractKeySpec;
                try {
                    String algorithm = key.getAlgorithm();
                    c(algorithm);
                    byte[] bArr2 = array;
                    byte[] encoded = key.getEncoded();
                    if (encoded == null) {
                        throw new UnrecoverableKeyException("Key blob is null. Key blob cannot be imported.");
                    }
                    copyKey = AbstractKeySpec.copyOtherForeignKey(this.c, cl_0Var, bArr, z, bArr2, algorithm, encoded, key instanceof SecretKey, z2);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    illegalArgumentException = e;
                    throw new KeyStoreException(illegalArgumentException);
                } catch (AccessControlException e12) {
                    e = e12;
                    accessControlException = e;
                    throw new KeyStoreException(accessControlException);
                } catch (UnrecoverableKeyException e13) {
                    e = e13;
                    unrecoverableKeyException = e;
                    throw new KeyStoreException(unrecoverableKeyException);
                }
            }
            abstractKeySpec3 = copyKey;
        } catch (Throwable th5) {
            th = th5;
        }
        try {
            abstractKeySpec3.setAllCertificates(certificateArr);
            if (abstractKeySpec2 != null && abstractKeySpec2.shouldBeDeleted()) {
                a(str3, abstractKeySpec2.getContainer().getKeyName(), (ContainerPassword) null);
            }
            if (abstractKeySpec3 != abstractKeySpec2) {
                abstractKeySpec3.clear();
            }
        } catch (IllegalArgumentException e14) {
            illegalArgumentException = e14;
            throw new KeyStoreException(illegalArgumentException);
        } catch (AccessControlException e15) {
            accessControlException = e15;
            throw new KeyStoreException(accessControlException);
        } catch (UnrecoverableKeyException e16) {
            unrecoverableKeyException = e16;
            throw new KeyStoreException(unrecoverableKeyException);
        } catch (Throwable th6) {
            th = th6;
            abstractKeySpec4 = abstractKeySpec3;
            if (abstractKeySpec4 == null) {
            }
        }
    }

    private boolean b(String str, String str2) {
        AbstractKeySpec abstractKeySpec;
        if (a(str, str2) >= 0) {
            return true;
        }
        if (!a(str, str2, false)) {
            return false;
        }
        try {
            abstractKeySpec = a(str, str2, false, null, true, 0, false, false);
        } catch (Exception e2) {
            if ((e2.getCause() instanceof MSKeyException) && ((MSKeyException) e2.getCause()).isWantGraphic()) {
                return true;
            }
            JCSPLogger.subThrown(e2);
            abstractKeySpec = null;
        }
        return abstractKeySpec != null && ((abstractKeySpec instanceof ExchPrivateKeySpec) || (abstractKeySpec instanceof PrivateKeySpec) || (abstractKeySpec instanceof JCSPSecretKeySpec));
    }

    private static void c(String str) throws KeyStoreException {
        if (!AlgorithmGroups.b(str) && HContainer.getAlgorithmIdByName(str) == 0) {
            throw new KeyStoreException(g8e.o("Unsupported key algorithm: ", str));
        }
    }

    public void checkProviderName(String str) throws KeyStoreException {
        JCSPLogger.subEnter();
        if (str != null) {
            Iterator it = this.c.getProviderTypes().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (a(str, this.c.getProviderNames(intValue))) {
                    return;
                }
                if (intValue != 75) {
                    throw new KeyStoreException("Invalid provider name: ".concat(str));
                }
                boolean a2 = a(str, this.c.getProviderNames(80));
                if (!a2) {
                    a2 = a(str, this.c.getProviderNames(81));
                }
                if (!a2) {
                    throw new KeyStoreException("Invalid provider name: ".concat(str));
                }
            }
        }
        JCSPLogger.subExit();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        cl_0 a2 = a(str);
        if (a2 == null) {
            return false;
        }
        try {
            checkProviderName(a2.a());
            return a(a2.a(), a2.d(), true);
        } catch (KeyStoreException e2) {
            JCSPLogger.thrown(e2);
            return false;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        cl_0 a2 = a(str);
        if (a2 == null) {
            dy31.t("Alias not found");
        } else {
            checkProviderName(a2.a());
            a(a2.a(), a2.d(), a2.e() != null ? new ContainerPassword(a2.e()) : null);
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineEntryInstanceOf(String str, Class cls) {
        if (cls == KeyStore.TrustedCertificateEntry.class) {
            return engineIsCertificateEntry(str);
        }
        if (cls == KeyStore.SecretKeyEntry.class) {
            return engineIsKeyEntry(str) && engineGetCertificate(str) == null;
        }
        if (cls == KeyStore.PrivateKeyEntry.class) {
            return engineIsKeyEntry(str);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        cl_0 a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            checkProviderName(a2.a());
            if (a(a2.a(), a2.d(), false)) {
                return a(a2, (char[]) null, 0, (Vector) null);
            }
            return null;
        } catch (KeyStoreException e2) {
            JCSPLogger.thrown(e2);
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        cl_0 a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            checkProviderName(a2.a());
            if (a(a2.a(), a2.d(), false)) {
                return a((HKey) null, a2, (char[]) null, 0);
            }
            return null;
        } catch (KeyStoreException e2) {
            JCSPLogger.thrown(e2);
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (a(str) == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) engineGetCertificate(str);
        if (x509Certificate != null) {
            return x509Certificate.getNotBefore();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2020, 0, 0);
        gregorianCalendar.getTime();
        Date date = new Date();
        return date.before(gregorianCalendar.getTime()) ? date : gregorianCalendar.getTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyStore.Entry engineGetEntry(String str, final KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException {
        final String str2;
        boolean z;
        boolean z2;
        char[] cArr;
        char[] cArr2;
        cl_0 a2 = a(str);
        if (a2 == null) {
            return null;
        }
        checkProviderName(a2.a());
        boolean z3 = true;
        boolean z4 = a.booleanValue() || DefaultProvider.getKeytoolCompat();
        if (!z4 && protectionParameter == null) {
            Certificate engineGetCertificate = engineGetCertificate(str);
            if (engineGetCertificate != null) {
                return new KeyStore.TrustedCertificateEntry(engineGetCertificate);
            }
            throw new UnrecoverableKeyException("requested entry requires a password");
        }
        if (protectionParameter != null) {
            int keyType = protectionParameter instanceof JCPProtectionParameter ? ((JCPProtectionParameter) protectionParameter).getKeyType() : 0;
            if (b(a2.a(), a2.d())) {
                if (protectionParameter instanceof KeyStore.CallbackHandlerProtection) {
                    str2 = str;
                    try {
                        cArr2 = (char[]) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCSP.KeyStore.CSPStore.1
                            @Override // java.security.PrivilegedExceptionAction
                            public char[] run() throws Exception {
                                CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
                                PasswordCallback passwordCallback = new PasswordCallback("Password for alias " + str2, false);
                                callbackHandler.handle(new Callback[]{passwordCallback});
                                char[] password = passwordCallback.getPassword();
                                passwordCallback.clearPassword();
                                return password;
                            }
                        });
                        if (cArr2 == null) {
                            dy31.t("No password provided");
                            return null;
                        }
                    } catch (PrivilegedActionException e2) {
                        throw new KeyStoreException("KeyStore instantiation failed", e2);
                    }
                } else {
                    str2 = str;
                    if (protectionParameter instanceof KeyStore.PasswordProtection) {
                        KeyStore.PasswordProtection passwordProtection = (KeyStore.PasswordProtection) protectionParameter;
                        char[] password = passwordProtection.getPassword();
                        if (passwordProtection instanceof JCPProtectionParameter) {
                            JCPProtectionParameter jCPProtectionParameter = (JCPProtectionParameter) protectionParameter;
                            z2 = jCPProtectionParameter.isSilentMode();
                            z = jCPProtectionParameter.isAllowEmptyChain();
                            cArr = password;
                        } else {
                            cArr2 = password;
                        }
                    } else {
                        z = z4;
                        z2 = true;
                        cArr = null;
                    }
                    if (this.c.getReaderName().equalsIgnoreCase("CLOUD")) {
                        cArr = null;
                        z2 = false;
                    }
                    boolean z5 = z2;
                    List providerTypes = this.c.getProviderTypes(a2.a(), this.c.getProviderTypes());
                    int defaultProviderType = !providerTypes.isEmpty() ? getDefaultProviderType() : ((Integer) providerTypes.get(0)).intValue();
                    if (!(protectionParameter instanceof JCPProtectionParameterInfo)) {
                        HProv provider = HProv.getProvider(defaultProviderType);
                        try {
                            try {
                                try {
                                    provider.openContainer(str2, a2.a(), null, 64, true);
                                } catch (Exception e3) {
                                    JCSPLogger.ignoredException(e3);
                                }
                                provider.releaseContext(7);
                                z3 = false;
                            } catch (InvalidPasswordException e4) {
                                JCSPLogger.ignoredException(e4);
                                provider.releaseContext(7);
                            }
                            ((JCPProtectionParameterInfo) protectionParameter).needPassword(z3);
                            return null;
                        } catch (Throwable th) {
                            provider.releaseContext(7);
                            throw th;
                        }
                    }
                    char[] cArr3 = cArr;
                    Key a3 = a(a2.a(), a2.d(), true, cArr3, z2, keyType, z5);
                    if (a3 instanceof PrivateKey) {
                        return new JCPPrivateKeyEntry((PrivateKey) a3, a(((AbstractKeySpec) ((JCSPSpecKey) a3).getSpec()).getKey(), a2, cArr3, keyType), z);
                    }
                    if (a3 instanceof SecretKey) {
                        return new KeyStore.SecretKeyEntry((SecretKey) a3);
                    }
                }
                z = z4;
                cArr = cArr2;
                z2 = true;
                if (this.c.getReaderName().equalsIgnoreCase("CLOUD")) {
                }
                boolean z52 = z2;
                List providerTypes2 = this.c.getProviderTypes(a2.a(), this.c.getProviderTypes());
                if (!providerTypes2.isEmpty()) {
                }
                if (!(protectionParameter instanceof JCPProtectionParameterInfo)) {
                }
            }
        }
        throw new UnrecoverableEntryException();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        cl_0 a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            checkProviderName(a2.a());
            boolean z = a.booleanValue() || DefaultProvider.getKeytoolCompat();
            if (b(a2.a(), a2.d())) {
                return a(a2.a(), a2.d(), z, cArr, z, 0, false);
            }
            return null;
        } catch (KeyStoreException e2) {
            throw new UnrecoverableKeyException(e2.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return engineGetCertificate(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        cl_0 a2 = a(str);
        if (a2 == null) {
            return false;
        }
        try {
            checkProviderName(a2.a());
            return b(a2.a(), a2.d());
        } catch (KeyStoreException e2) {
            JCSPLogger.thrown(e2);
            return false;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        JCSPLogger.subEnter();
        Starter.check(CSPStore.class);
        if (loadStoreParameter instanceof FailIfNotAvailableStoreParameter) {
            String makePrefix = MetaCSPStore.makePrefix(this.c.getReaderName());
            ReaderInfo readerInfo = this.c;
            List providerTypes = readerInfo.getProviderTypes(null, readerInfo.getProviderTypes());
            HProv provider = HProv.getProvider(providerTypes.isEmpty() ? getDefaultProviderType() : ((Integer) providerTypes.get(0)).intValue());
            try {
                try {
                    provider.acquireContext(makePrefix, null, 192);
                } catch (Exception e2) {
                    throw new NoSuchCarrierException(e2);
                }
            } finally {
                provider.releaseContext(4);
            }
        } else {
            engineLoad(null, null);
        }
        JCSPLogger.subExit();
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        String str2;
        int i;
        int i2;
        byte[] bArr;
        int indexOf = str.indexOf(PROVNAME_PREFIX);
        byte[] bArr2 = null;
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            str = str.substring(indexOf + 4);
            str2 = substring;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            checkProviderName(str2);
        }
        int indexOf2 = str.indexOf("****");
        if (indexOf2 < 0) {
            int indexOf3 = str.indexOf("::::");
            if (indexOf3 >= 0) {
                String substring2 = str.substring(0, indexOf3);
                bArr2 = CPString.getArray(str.substring(indexOf3 + 4));
                str = substring2;
            }
            i = 0;
            bArr = bArr2;
        } else {
            String substring3 = str.substring(0, indexOf2);
            String substring4 = str.substring(indexOf2 + 4);
            int indexOf4 = substring4.indexOf("::::");
            if (indexOf4 >= 0) {
                String substring5 = substring4.substring(0, indexOf4);
                bArr2 = CPString.getArray(substring4.substring(indexOf4 + 4));
                substring4 = substring5;
            }
            if (substring4.matches("1")) {
                i2 = 1;
            } else if (substring4.matches("2")) {
                i2 = 2;
            } else {
                i = 0;
                bArr = bArr2;
                str = substring3;
            }
            i = i2;
            bArr = bArr2;
            str = substring3;
        }
        String concat = getPrefix().concat(str);
        if (a(str2, concat, false)) {
            a(str2, concat, i, certificate, bArr);
        } else {
            dy31.t("Can't store certificate without key");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetEntry(String str, KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException {
        boolean z = a.booleanValue() || DefaultProvider.getKeytoolCompat();
        if (protectionParameter != null && !(protectionParameter instanceof KeyStore.PasswordProtection)) {
            dy31.t("unsupported protection parameter");
            return;
        }
        KeyStore.PasswordProtection passwordProtection = protectionParameter != null ? (KeyStore.PasswordProtection) protectionParameter : null;
        if (entry instanceof JCPPrivateKeyEntry) {
            if (passwordProtection == null && !z) {
                dy31.t("non-null password required to create JCPPrivateKeyEntry");
                return;
            } else {
                JCPPrivateKeyEntry jCPPrivateKeyEntry = (JCPPrivateKeyEntry) entry;
                a(str, jCPPrivateKeyEntry.getPrivateKey(), true, passwordProtection != null ? passwordProtection.getPassword() : null, jCPPrivateKeyEntry.getCertificateChain(), jCPPrivateKeyEntry.isExportable());
                return;
            }
        }
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            if (passwordProtection == null && !z) {
                dy31.t("non-null password required to create PrivateKeyEntry");
                return;
            } else {
                KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
                a(str, privateKeyEntry.getPrivateKey(), true, passwordProtection != null ? passwordProtection.getPassword() : null, privateKeyEntry.getCertificateChain(), true);
                return;
            }
        }
        if (!(entry instanceof KeyStore.SecretKeyEntry)) {
            throw new KeyStoreException("unsupported entry type: ".concat(entry.getClass().getName()));
        }
        if (passwordProtection != null || z) {
            a(str, ((KeyStore.SecretKeyEntry) entry).getSecretKey(), true, passwordProtection != null ? passwordProtection.getPassword() : null, null, true);
        } else {
            dy31.t("non-null password required to create SecretKeyEntry");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        a(str, key, a.booleanValue() || DefaultProvider.getKeytoolCompat(), cArr, certificateArr, true);
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        if (this.f != null) {
            return 1;
        }
        return b().size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
    }

    public abstract int getDefaultProviderType();

    public String getName() {
        return "CSPStore";
    }

    public String getPrefix() {
        return "";
    }

    public abstract String makeContainerName(String str);

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new KeyStoreException("Can't store key from byte array!");
    }

    private Certificate b(HKey hKey, cl_0 cl_0Var, char[] cArr, int i) {
        Certificate certificate = hKey.getCertificate();
        if (certificate == null) {
            boolean z = true;
            boolean z2 = a.booleanValue() || DefaultProvider.getKeytoolCompat();
            if (!b.booleanValue() && !DefaultProvider.isUseCertStub()) {
                z = false;
            }
            if (z2 && z) {
                return a(cl_0Var, cArr != null ? CPString.getArray(String.valueOf(cArr)) : null, i);
            }
        }
        return certificate;
    }

    private Vector b() {
        JCSPLogger.subEnter();
        if (this.f != null) {
            return new Vector(Collections.singleton(new ru.CryptoPro.JCSP.MSCAPI.cl_1(this.f, "")));
        }
        Vector vector = new Vector();
        Iterator it = this.c.getProviderTypes().iterator();
        if (it.hasNext()) {
            vector.addAll(HProv.enumContainers(((Integer) it.next()).intValue(), this.c));
        }
        JCSPLogger.subExit();
        return vector;
    }

    private static String b(String str) {
        int indexOf = str.indexOf(PROVNAME_PREFIX);
        if (indexOf >= 0) {
            str = str.substring(indexOf + 4);
        }
        int indexOf2 = str.indexOf("::::");
        return indexOf2 >= 0 ? str.substring(0, indexOf2) : str;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        String makeContainerName;
        JCSPLogger.subEnter();
        Starter.check(CSPStore.class);
        if (inputStream != null) {
            if (inputStream instanceof StoreInputStream) {
                makeContainerName = ((StoreInputStream) inputStream).getContainerAlias();
            } else if (this.d && !(inputStream instanceof VoidInputStream)) {
                String readLine = new BufferedReader(new InputStreamReader(inputStream)).readLine();
                this.f = readLine;
                makeContainerName = makeContainerName(readLine);
            }
            this.f = makeContainerName;
        }
        JCSPLogger.subExit();
    }

    private Key a(String str, String str2, boolean z, char[] cArr, boolean z2, int i, boolean z3) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        try {
            AbstractKeySpec a2 = a(str, str2, z, cArr == null ? null : CPString.getArray(new String(cArr)), z2, i, i != -2147483643, z3);
            if (a2 == null) {
                return null;
            }
            return ru.CryptoPro.JCSP.Key.cl_2.a(a2);
        } catch (InvalidKeySpecException e2) {
            throw new UnrecoverableKeyException(e2.getMessage());
        }
    }

    private Certificate a(cl_0 cl_0Var, byte[] bArr, int i) {
        char[] charArray;
        JCSPLogger.subEnter();
        byte[] e2 = cl_0Var.e() != null ? cl_0Var.e() : bArr;
        X509Certificate x509Certificate = null;
        if (e2 != null) {
            try {
                charArray = new String(e2).toCharArray();
            } catch (Exception e3) {
                JCSPLogger.thrown(e3);
            }
        } else {
            charArray = null;
        }
        List providerTypes = this.c.getProviderTypes(cl_0Var.a(), this.c.getProviderTypes());
        int isKeyAvailable = AbstractKeySpec.isKeyAvailable(cl_0Var.a(), cl_0Var.d(), this.c, charArray, providerTypes.isEmpty() ? getDefaultProviderType() : ((Integer) providerTypes.get(0)).intValue());
        byte[] bArr2 = isKeyAvailable == 1 ? null : e2;
        if (isKeyAvailable == -1) {
            throw new InvalidPasswordException("Need password");
        }
        cl_2.cl_0 b2 = ru.CryptoPro.JCSP.Key.cl_2.b(a(cl_0Var.a(), cl_0Var.d(), true, bArr2, true, i, true, false));
        String str = GostCertificateRequest.DEFAULT_SIGN_ALGORITHM;
        x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream((byte[]) GostCertificateRequest.class.getDeclaredMethod("getEncodedSelfCert", KeyPair.class, String.class, String.class).invoke(GostCertificateRequest.class.getDeclaredConstructor(String.class).newInstance(b2.b), b2.a, "CN=CertStub", b2.c)));
        JCSPLogger.subExit();
        return x509Certificate;
    }

    private Certificate a(cl_0 cl_0Var, char[] cArr, int i, Vector vector) {
        HKey hKey;
        HContainer hContainer = new HContainer(cl_0Var.d());
        HKey hKey2 = null;
        try {
            hKey = a(cl_0Var.a(), cl_0Var.d(), i);
            try {
                Certificate b2 = b(hKey, cl_0Var, cArr, i);
                if (vector != null) {
                    vector.addAll(hKey.getProvHandle().enumContainerExtensions());
                }
                hContainer.clear(hKey);
                return b2;
            } catch (UnrecoverableKeyException unused) {
                hContainer.clear(hKey);
                return null;
            } catch (Throwable th) {
                th = th;
                hKey2 = hKey;
                hContainer.clear(hKey2);
                throw th;
            }
        } catch (UnrecoverableKeyException unused2) {
            hKey = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Enumeration a() {
        return b().elements();
    }

    private AbstractKeySpec a(String str, String str2, boolean z, byte[] bArr, boolean z2, int i, boolean z3, boolean z4) throws UnrecoverableKeyException, ProviderException {
        AlgIdInterface c = AlgorithmGroups.c(getDefaultProviderType());
        if (i == 1 || i == 2 || i == -2147483643) {
            return AbstractKeySpec.read(c, str2, i, str, this.c, z, bArr, z2, i != -2147483643 && z3, z4);
        }
        try {
            try {
                return AbstractKeySpec.read(c, str2, 1, str, this.c, z, bArr, z2, z3, z4);
            } catch (UnrecoverableKeyException unused) {
                return AbstractKeySpec.read(c, str2, -2147483643, str, this.c, z, bArr, z2, false, z4);
            }
        } catch (UnrecoverableKeyException unused2) {
            return AbstractKeySpec.read(c, str2, 2, str, this.c, z, bArr, z2, z3, z4);
        }
    }

    private cl_0 a(String str) {
        boolean z;
        String str2;
        byte[] bArr;
        if (str == null || str.isEmpty()) {
            String str3 = this.f;
            if (str3 == null || str3.isEmpty()) {
                return null;
            }
            str = this.f;
            z = true;
        } else {
            z = false;
        }
        int indexOf = str.indexOf(PROVNAME_PREFIX);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            str = str.substring(indexOf + 4);
        } else {
            str2 = null;
        }
        int indexOf2 = str.indexOf("::::");
        if (indexOf2 >= 0) {
            bArr = CPString.getArray(str.substring(indexOf2 + 4));
            str = str.substring(0, indexOf2);
        } else {
            bArr = null;
        }
        String concat = !z ? getPrefix().concat(str) : str;
        String str4 = this.f;
        if (str4 != null && !str4.isEmpty() && !b(this.f).equals(concat)) {
            return null;
        }
        if (DefaultCSPProvider.getNameType() == 1) {
            return new cl_0(str2, this.c.getReaderName(), concat, bArr);
        }
        return new cl_0(str2, this.c.getReaderName(), (z ? cl_0.a(concat) : new String[]{"", str})[1], bArr);
    }

    private HKey a(String str, String str2, int i) throws UnrecoverableKeyException {
        AlgIdInterface algIdSpecForeign = getDefaultProviderType() == 24 ? new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA) : new AlgIdSpec((OID) null);
        HContainer hContainer = new HContainer(str2);
        if (i == 1) {
            return hContainer.open(algIdSpecForeign, str, this.c, 1);
        }
        ReaderInfo readerInfo = this.c;
        if (i == 2) {
            return hContainer.open(algIdSpecForeign, str, readerInfo, 2);
        }
        try {
            return hContainer.open(algIdSpecForeign, str, readerInfo, 1);
        } catch (UnrecoverableKeyException unused) {
            return hContainer.open(algIdSpecForeign, str, this.c, 2);
        }
    }

    private static void a(Exception exc) throws CertificateException {
        CertificateException certificateException = new CertificateException();
        certificateException.initCause(exc);
        throw certificateException;
    }

    private void a(String str, String str2, int i, Certificate certificate, byte[] bArr) throws KeyStoreException {
        AbstractKeySpec a2;
        boolean z = bArr != null;
        AbstractKeySpec abstractKeySpec = null;
        try {
            try {
                try {
                } catch (ProviderException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (KeyException e3) {
            e = e3;
        } catch (UnrecoverableKeyException e4) {
            e = e4;
        }
        try {
            if (i != 1 && i != 2) {
                try {
                    a2 = a(str, str2, z, bArr, false, 1, false, false);
                } catch (KeyException | UnrecoverableKeyException unused) {
                }
                try {
                    try {
                        a2.setCertificate(certificate);
                    } catch (KeyException | UnrecoverableKeyException unused2) {
                        a2 = a(str, str2, z, bArr, false, 2, false, false);
                        a2.setCertificate(certificate);
                        a2.clear();
                    }
                    a2.clear();
                } catch (ProviderException e5) {
                    e = e5;
                    throw new KeyStoreException(e);
                } catch (Throwable th2) {
                    th = th2;
                    abstractKeySpec = a2;
                    if (abstractKeySpec != null) {
                        abstractKeySpec.clear();
                    }
                    throw th;
                }
            }
            a2 = a(str, str2, z, bArr, false, i, false, false);
            a2.setCertificate(certificate);
            a2.clear();
        } catch (KeyException e6) {
            e = e6;
            throw new KeyStoreException(e);
        } catch (UnrecoverableKeyException e7) {
            e = e7;
            throw new KeyStoreException(e);
        }
    }

    private void a(String str, String str2, ContainerPassword containerPassword) throws KeyStoreException {
        try {
            if (a(str, str2, false)) {
                ReaderInfo readerInfo = this.c;
                List providerTypes = readerInfo.getProviderTypes(str, readerInfo.getProviderTypes());
                HProv.deleteContainer(str, str2, this.c, containerPassword, providerTypes.isEmpty() ? getDefaultProviderType() : ((Integer) providerTypes.get(0)).intValue());
            }
        } catch (UnrecoverableKeyException e2) {
            throw new KeyStoreException(e2);
        }
    }

    private int a(String str, String str2) {
        if (!CHECK_IF_EXISTS) {
            return 1;
        }
        ReaderInfo readerInfo = this.c;
        List providerTypes = readerInfo.getProviderTypes(str, readerInfo.getProviderTypes());
        return HContainer.getKeyCount(str2, this.c, str, providerTypes.isEmpty() ? getDefaultProviderType() : ((Integer) providerTypes.get(0)).intValue());
    }

    private boolean a(String str, String str2, boolean z) {
        if (!z && !CHECK_IF_EXISTS) {
            return true;
        }
        ReaderInfo readerInfo = this.c;
        List providerTypes = readerInfo.getProviderTypes(str, readerInfo.getProviderTypes());
        return HContainer.isExist(str2, this.c, str, providerTypes.isEmpty() ? getDefaultProviderType() : ((Integer) providerTypes.get(0)).intValue());
    }

    private boolean a(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private static Certificate[] a(GostPrivateCertificateStore gostPrivateCertificateStore, GostPrivateCertificateStore gostPrivateCertificateStore2, int i) throws CertificateException {
        Certificate[] certificateArr;
        Asn1OpenType[] asn1OpenTypeArr;
        Asn1OpenType[] asn1OpenTypeArr2;
        Certificate[] certificateArr2 = new Certificate[i];
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Certificate certificate = null;
        if (gostPrivateCertificateStore == null || (asn1OpenTypeArr2 = gostPrivateCertificateStore.elements) == null) {
            certificateArr = null;
        } else {
            certificateArr = new Certificate[asn1OpenTypeArr2.length];
            for (int i2 = 0; i2 < gostPrivateCertificateStore.elements.length; i2++) {
                certificateArr[i2] = certificateFactory.generateCertificate(new ByteArrayInputStream(gostPrivateCertificateStore.elements[i2].value));
            }
        }
        if (gostPrivateCertificateStore2 != null && (asn1OpenTypeArr = gostPrivateCertificateStore2.elements) != null && asn1OpenTypeArr.length != 0) {
            if (asn1OpenTypeArr.length > 1) {
                w511.y("Only one trust certificate is supported");
                return null;
            }
            certificate = certificateFactory.generateCertificate(new ByteArrayInputStream(gostPrivateCertificateStore2.elements[0].value));
        }
        if (certificateArr == null) {
            if (certificate == null) {
                return certificateArr2;
            }
            Certificate[] certificateArr3 = new Certificate[i + 1];
            certificateArr3[i] = certificate;
            return certificateArr3;
        }
        Certificate[] certificateArr4 = new Certificate[certificateArr.length + i + (certificate == null ? 0 : 1)];
        for (int i3 = 0; i3 < certificateArr.length; i3++) {
            certificateArr4[i + i3] = certificateArr[i3];
        }
        if (certificate != null) {
            certificateArr4[i + certificateArr.length] = certificate;
        }
        return certificateArr4;
    }

    private Certificate[] a(HKey hKey, cl_0 cl_0Var, char[] cArr, int i) {
        Certificate b2;
        Vector enumContainerExtensions;
        try {
            if (hKey == null) {
                enumContainerExtensions = new Vector();
                b2 = a(cl_0Var, cArr, i, enumContainerExtensions);
            } else {
                b2 = b(hKey, cl_0Var, cArr, i);
                enumContainerExtensions = hKey.getProvHandle().enumContainerExtensions();
            }
            Certificate[] a2 = a(b2 != null, enumContainerExtensions);
            if (b2 != null) {
                a2[0] = b2;
            }
            if (a2.length == 0) {
                return null;
            }
            return a2;
        } catch (IllegalArgumentException | CertificateException unused) {
            return null;
        }
    }

    private Certificate[] a(boolean z, Vector vector) throws CertificateException {
        GostPrivateCertificateStore gostPrivateCertificateStore;
        Asn1BerDecodeBuffer asn1BerDecodeBuffer;
        GostPrivateCertificateStore gostPrivateCertificateStore2;
        GostPrivateCertificateStore gostPrivateCertificateStore3 = null;
        if (vector != null) {
            Iterator it = vector.iterator();
            GostPrivateCertificateStore gostPrivateCertificateStore4 = null;
            gostPrivateCertificateStore = null;
            while (it.hasNext()) {
                ContainerExtensionStructure containerExtensionStructure = (ContainerExtensionStructure) it.next();
                if (!containerExtensionStructure.ifInit()) {
                    w511.y("Wrong container");
                    return null;
                }
                if (new Asn1ObjectIdentifier(OID.fromByteZ(containerExtensionStructure.sOid.value).value).equals(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_intermidiate_store))) {
                    Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(containerExtensionStructure.pbExtension.value);
                    GostPrivateCertificateStore gostPrivateCertificateStore5 = new GostPrivateCertificateStore();
                    try {
                        gostPrivateCertificateStore5.decode(asn1BerDecodeBuffer2);
                    } catch (Asn1Exception | IOException e2) {
                        a(e2);
                    }
                    gostPrivateCertificateStore4 = gostPrivateCertificateStore5;
                } else {
                    if (new Asn1ObjectIdentifier(OID.fromByteZ(containerExtensionStructure.sOid.value).value).equals(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_signature_trust_store))) {
                        asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(containerExtensionStructure.pbExtension.value);
                        gostPrivateCertificateStore2 = new GostPrivateCertificateStore();
                    } else if (gostPrivateCertificateStore == null && new Asn1ObjectIdentifier(OID.fromByteZ(containerExtensionStructure.sOid.value).value).equals(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_exchange_trust_store))) {
                        asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(containerExtensionStructure.pbExtension.value);
                        gostPrivateCertificateStore2 = new GostPrivateCertificateStore();
                    }
                    try {
                        gostPrivateCertificateStore2.decode(asn1BerDecodeBuffer);
                    } catch (Asn1Exception | IOException e3) {
                        a(e3);
                    }
                    gostPrivateCertificateStore = gostPrivateCertificateStore2;
                }
            }
            gostPrivateCertificateStore3 = gostPrivateCertificateStore4;
        } else {
            gostPrivateCertificateStore = null;
        }
        return a(gostPrivateCertificateStore3, gostPrivateCertificateStore, z ? 1 : 0);
    }
}
