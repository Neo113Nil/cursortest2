package ru.CryptoPro.JCP.KeyStore;

import defpackage.dy31;
import defpackage.gs61;
import defpackage.gt61;
import defpackage.hq61;
import defpackage.hr61;
import defpackage.j6a1;
import defpackage.ox61;
import defpackage.pr61;
import defpackage.vbb;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.PrivateKey;
import java.security.PrivilegedActionException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.GostExchPrivateKey;
import ru.CryptoPro.JCP.Key.GostPrivateKey;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.Key.PublicKeySpec;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageReader;
import ru.CryptoPro.JCP.Util.DefaultProvider;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.params.ProviderSpec;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCPRequest.GostCertificateRequest;

/* loaded from: classes4.dex */
public final class ContainerStore extends KeyStoreSpi {
    public static final String ERROR_DIFF_ALG_CONT = "DiffAlgContainer";
    public static final String ERROR_DIFF_CIPHER_ALG_CONT = "DiffCipherAlgContainer";
    public static final String ERROR_KEY_ALREADY_EXISTS = "KeyAlreadyExists";
    public static final String ERROR_OLD_PASS_NEED = "OldPasswordNeeded";
    public static final String KEYSPEC_AT_KEYEXCHANGE = "1";
    public static final String KEYSPEC_AT_SIGNATURE = "2";
    public static final String KEYSPEC_PREFIX = "****";
    public static final String PASSWORD_PREFIX = "::::";
    public static final Boolean f = Boolean.valueOf(GetProperty.getBooleanProperty("keytool.compat", false));
    public static final Boolean g = Boolean.valueOf(GetProperty.getBooleanProperty("use.cert.stub", false));
    public final HDImageReader a;
    public final Map b;
    public final ReentrantReadWriteLock c;
    public String d = null;
    public final boolean e;

    public ContainerStore(HDImageReader hDImageReader, boolean z) {
        this.a = hDImageReader;
        this.e = z;
        this.c = hDImageReader.getLock();
        this.b = hDImageReader.getDeniedAliases();
    }

    public static X509Certificate b(ContainerReaderInterface containerReaderInterface, CPKeyContainer cPKeyContainer, vbb vbbVar, char[] cArr) {
        PrivateKeyInterface signature;
        PrivateKey gostPrivateKey;
        try {
            char[] cArr2 = (char[]) vbbVar.b;
            if (cArr2 != null) {
                cArr = cArr2;
            }
            if (containerReaderInterface.login(cArr)) {
                cArr = null;
            }
            if (cPKeyContainer.isExchangeExist()) {
                signature = cPKeyContainer.getExchange(cArr);
                gostPrivateKey = new GostExchPrivateKey(signature);
            } else {
                signature = cPKeyContainer.getSignature(cArr);
                gostPrivateKey = new GostPrivateKey(signature);
            }
            GostPublicKey gostPublicKey = new GostPublicKey((PublicKeySpec) signature.generatePublic());
            String str = GostCertificateRequest.DEFAULT_SIGN_ALGORITHM;
            return (X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream((byte[]) GostCertificateRequest.class.getDeclaredMethod("getEncodedSelfCert", KeyPair.class, String.class, String.class).invoke(GostCertificateRequest.class.getDeclaredConstructor(String.class).newInstance("JCP"), new KeyPair(gostPublicKey, gostPrivateKey), "CN=CertStub", null)));
        } catch (Exception e) {
            JCPLogger.thrown(e);
            return null;
        }
    }

    public static void f(ContainerReaderInterface containerReaderInterface, char[] cArr, char[] cArr2) {
        if (Arrays.equals(cArr, cArr2) || !(containerReaderInterface instanceof ContainerChangePassword)) {
            return;
        }
        ((ContainerChangePassword) containerReaderInterface).changePassword(cArr, cArr2);
    }

    public static ContainerReaderInterface g(String str, MediaInterface mediaInterface) {
        ox61 ox61Var = new ox61(str, mediaInterface);
        ContainerReaderInterface containerReaderInterface = null;
        while (ox61Var.hasMoreElements() && containerReaderInterface == null) {
            String str2 = ox61Var.a;
            if (((String) ox61Var.nextElement()).equalsIgnoreCase(str)) {
                try {
                    containerReaderInterface = (ContainerReaderInterface) AccessController.doPrivileged(new pr61(mediaInterface, str2, 1));
                } catch (PrivilegedActionException unused) {
                }
            }
        }
        return containerReaderInterface;
    }

    public final vbb a(String str) {
        char[] cArr;
        char[] cArr2 = null;
        if (str == null || str.isEmpty()) {
            String str2 = this.d;
            if (str2 == null || str2.isEmpty()) {
                return null;
            }
            str = this.d;
        } else {
            int indexOf = str.indexOf("::::");
            if (indexOf >= 0) {
                cArr = str.substring(indexOf + 4).toCharArray();
                str = str.substring(0, indexOf);
            } else {
                cArr = null;
            }
            String str3 = this.d;
            if (str3 != null && !str3.isEmpty()) {
                String str4 = this.d;
                int indexOf2 = str4.indexOf("::::");
                if (indexOf2 >= 0) {
                    str4 = str4.substring(0, indexOf2);
                }
                if (!str4.equalsIgnoreCase(str)) {
                    return null;
                }
            }
            cArr2 = cArr;
        }
        vbb vbbVar = new vbb();
        vbbVar.a = str;
        if (cArr2 != null) {
            char[] cArr3 = new char[cArr2.length];
            vbbVar.b = cArr3;
            System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
        }
        return vbbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GostPrivateKey c(String str, char[] cArr, int i) {
        MediaInterface mediaInterface;
        ContainerReaderInterface containerReaderInterface;
        GostPrivateKey gostPrivateKey;
        ReentrantReadWriteLock reentrantReadWriteLock = this.c;
        vbb a = a(str);
        MediaInterface mediaInterface2 = null;
        r1 = null;
        r1 = null;
        GostPrivateKey gostExchPrivateKey = null;
        r1 = null;
        mediaInterface2 = null;
        mediaInterface2 = null;
        mediaInterface2 = null;
        ContainerReaderInterface containerReaderInterface2 = null;
        if (a != null) {
            if (cArr != null && cArr.length == 0) {
                cArr = null;
            }
            boolean z = false;
            try {
                try {
                    mediaInterface = d();
                    try {
                        containerReaderInterface = g((String) a.a, mediaInterface);
                        if (containerReaderInterface != null) {
                            try {
                                boolean z2 = containerReaderInterface instanceof hq61;
                                if (z2) {
                                    reentrantReadWriteLock.writeLock().lock();
                                    try {
                                        e((String) a.a, i);
                                        z = true;
                                    } catch (IOException e) {
                                        e = e;
                                        mediaInterface2 = mediaInterface;
                                        z = true;
                                        if (z) {
                                            try {
                                                h(i, (String) a.a);
                                            } catch (PasswordLockException e2) {
                                                throw j6a1.b(e2);
                                            }
                                        }
                                        throw j6a1.b(e);
                                    } catch (PasswordLockException e3) {
                                        e = e3;
                                        throw j6a1.b(e);
                                    } catch (UnrecoverableKeyException e4) {
                                        e = e4;
                                        mediaInterface2 = mediaInterface;
                                        z = true;
                                        if (z) {
                                            try {
                                                h(i, (String) a.a);
                                            } catch (PasswordLockException e5) {
                                                throw j6a1.b(e5);
                                            }
                                        }
                                        throw e;
                                    } catch (InvalidKeySpecException e6) {
                                        e = e6;
                                        mediaInterface2 = mediaInterface;
                                        z = true;
                                        if (z) {
                                            try {
                                                h(i, (String) a.a);
                                            } catch (PasswordLockException e7) {
                                                throw j6a1.b(e7);
                                            }
                                        }
                                        throw j6a1.b(e);
                                    } catch (Throwable th) {
                                        th = th;
                                        containerReaderInterface2 = containerReaderInterface;
                                        z = true;
                                        if (z) {
                                        }
                                        if (containerReaderInterface2 != null) {
                                        }
                                        if (mediaInterface != null) {
                                        }
                                        throw th;
                                    }
                                }
                                CPKeyContainer cPKeyContainer = new CPKeyContainer(containerReaderInterface);
                                if (containerReaderInterface.login(cArr)) {
                                    cArr = null;
                                }
                                if (i == 1) {
                                    PrivateKeyInterface exchange = cPKeyContainer.getExchange(cArr);
                                    if (exchange != null) {
                                        gostExchPrivateKey = new GostExchPrivateKey(exchange);
                                    }
                                } else {
                                    if (i != 2) {
                                        PrivateKeyInterface exchange2 = cPKeyContainer.getExchange(cArr);
                                        if (exchange2 != null) {
                                            i = 1;
                                        }
                                        gostPrivateKey = exchange2 == null ? null : new GostExchPrivateKey(exchange2);
                                        if (gostPrivateKey == null) {
                                            PrivateKeyInterface signature = cPKeyContainer.getSignature(cArr);
                                            if (signature != null) {
                                                i = 2;
                                            }
                                            if (signature != null) {
                                                gostExchPrivateKey = new GostPrivateKey(signature);
                                            }
                                        }
                                        if (z2 && gostPrivateKey != null) {
                                            this.b.remove((String) a.a);
                                        }
                                        if (z) {
                                            reentrantReadWriteLock.writeLock().unlock();
                                        }
                                        containerReaderInterface.close();
                                        if (mediaInterface != null) {
                                            mediaInterface.unlock();
                                        }
                                        return gostPrivateKey;
                                    }
                                    PrivateKeyInterface signature2 = cPKeyContainer.getSignature(cArr);
                                    if (signature2 != null) {
                                        gostExchPrivateKey = new GostPrivateKey(signature2);
                                    }
                                }
                                gostPrivateKey = gostExchPrivateKey;
                                if (z2) {
                                    this.b.remove((String) a.a);
                                }
                                if (z) {
                                }
                                containerReaderInterface.close();
                                if (mediaInterface != null) {
                                }
                                return gostPrivateKey;
                            } catch (IOException e8) {
                                e = e8;
                                mediaInterface2 = mediaInterface;
                                if (z) {
                                }
                                throw j6a1.b(e);
                            } catch (UnrecoverableKeyException e9) {
                                e = e9;
                                mediaInterface2 = mediaInterface;
                                if (z) {
                                }
                                throw e;
                            } catch (InvalidKeySpecException e10) {
                                e = e10;
                                mediaInterface2 = mediaInterface;
                                if (z) {
                                }
                                throw j6a1.b(e);
                            } catch (PasswordLockException e11) {
                                e = e11;
                                throw j6a1.b(e);
                            } catch (Throwable th2) {
                                th = th2;
                                containerReaderInterface2 = containerReaderInterface;
                                if (z) {
                                }
                                if (containerReaderInterface2 != null) {
                                }
                                if (mediaInterface != null) {
                                }
                                throw th;
                            }
                        }
                        if (containerReaderInterface != null) {
                            containerReaderInterface.close();
                        }
                        if (mediaInterface != null) {
                            mediaInterface.unlock();
                        }
                    } catch (IOException e12) {
                        e = e12;
                        containerReaderInterface = null;
                    } catch (UnrecoverableKeyException e13) {
                        e = e13;
                        containerReaderInterface = null;
                    } catch (InvalidKeySpecException e14) {
                        e = e14;
                        containerReaderInterface = null;
                    } catch (PasswordLockException e15) {
                        e = e15;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    mediaInterface = mediaInterface2;
                    containerReaderInterface2 = containerReaderInterface;
                    if (z) {
                        reentrantReadWriteLock.writeLock().unlock();
                    }
                    if (containerReaderInterface2 != null) {
                        containerReaderInterface2.close();
                    }
                    if (mediaInterface != null) {
                        mediaInterface.unlock();
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                containerReaderInterface = null;
            } catch (PasswordLockException e17) {
                e = e17;
            } catch (UnrecoverableKeyException e18) {
                e = e18;
                containerReaderInterface = null;
            } catch (InvalidKeySpecException e19) {
                e = e19;
                containerReaderInterface = null;
            } catch (Throwable th5) {
                th = th5;
                mediaInterface = null;
            }
        }
        return null;
    }

    public final MediaInterface d() {
        try {
            return (MediaInterface) AccessController.doPrivileged(new hr61(2, this));
        } catch (PrivilegedActionException e) {
            throw ((IOException) e.getCause());
        }
    }

    public final void e(String str, int i) {
        gt61 gt61Var = (gt61) this.b.get(str);
        if (gt61Var != null) {
            if (i == 1) {
                if (gt61Var.b >= 3) {
                    throw new PasswordLockException();
                }
                return;
            }
            int i2 = gt61Var.a;
            if (i == 2) {
                if (i2 >= 3) {
                    throw new PasswordLockException();
                }
            } else {
                int i3 = gt61Var.b;
                if (i2 >= 3 || i3 >= 3) {
                    throw new PasswordLockException();
                }
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Enumeration engineAliases() {
        Throwable th;
        MediaInterface mediaInterface;
        String str = this.d;
        if (str != null) {
            return Collections.enumeration(Collections.singletonList(str));
        }
        MediaInterface mediaInterface2 = null;
        try {
            try {
                mediaInterface = d();
            } catch (Throwable th2) {
                th = th2;
                mediaInterface = null;
            }
        } catch (IOException unused) {
        }
        try {
            Enumeration enumeration = Collections.enumeration(Collections.list(new ox61(null, mediaInterface)));
            if (mediaInterface != null) {
                mediaInterface.unlock();
            }
            return enumeration;
        } catch (IOException unused2) {
            mediaInterface2 = mediaInterface;
            Enumeration elements = new Vector(0).elements();
            if (mediaInterface2 != null) {
                mediaInterface2.unlock();
            }
            return elements;
        } catch (Throwable th3) {
            th = th3;
            if (mediaInterface != null) {
                mediaInterface.unlock();
            }
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineContainsAlias(String str) {
        return engineIsKeyEntry(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // java.security.KeyStoreSpi
    public final void engineDeleteEntry(String str) {
        MediaInterface mediaInterface;
        vbb a = a(str);
        if (a == null) {
            dy31.t("Alias not found");
            return;
        }
        String str2 = (String) a.a;
        char[] cArr = (char[]) a.b;
        ?? r2 = 0;
        r2 = 0;
        try {
            try {
                mediaInterface = d();
            } catch (Throwable th) {
                th = th;
                r2 = this;
                mediaInterface = null;
            }
            try {
                mediaInterface.lockMutex();
                ContainerReaderInterface g2 = g(str2, mediaInterface);
                if (g2 == null) {
                    throw new KeyStoreException("Alias not found");
                }
                g2.login(cArr);
                AccessController.doPrivileged(new gs61(g2, str2, 1));
                mediaInterface.unlock();
                mediaInterface.unlockMutex();
            } catch (IOException e) {
                e = e;
                throw j6a1.a(e);
            } catch (PrivilegedActionException e2) {
                e = e2;
                throw j6a1.a((IOException) e.getCause());
            } catch (UnrecoverableKeyException e3) {
                e = e3;
                throw j6a1.a(e);
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                if (mediaInterface != null) {
                    mediaInterface.unlock();
                    mediaInterface.unlockMutex();
                }
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (PrivilegedActionException e5) {
            e = e5;
        } catch (UnrecoverableKeyException e6) {
            e = e6;
        } catch (Throwable th3) {
            th = th3;
            mediaInterface = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r5 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        r0 = b(r1, r2, r9, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (r8 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        r8.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
    
        if (r8 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0097, code lost:
    
        if (r8 != null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [ru.CryptoPro.JCP.KeyStore.ContainerStore] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ru.CryptoPro.JCP.KeyStore.MediaInterface] */
    /* JADX WARN: Type inference failed for: r8v10, types: [ru.CryptoPro.JCP.KeyStore.MediaInterface] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Certificate engineGetCertificate(String str) {
        MediaInterface mediaInterface;
        Certificate certificate;
        boolean z;
        vbb a = a(str);
        ContainerReaderInterface containerReaderInterface = null;
        Certificate b = null;
        r0 = null;
        r0 = null;
        r0 = null;
        ContainerReaderInterface containerReaderInterface2 = null;
        ContainerReaderInterface containerReaderInterface3 = null;
        ContainerReaderInterface containerReaderInterface4 = null;
        containerReaderInterface = null;
        try {
            if (a == null) {
                return null;
            }
            try {
                this = d();
                try {
                    ContainerReaderInterface g2 = g((String) a.a, this);
                    if (g2 != null) {
                        try {
                            try {
                                CPKeyContainer cPKeyContainer = new CPKeyContainer(g2);
                                certificate = cPKeyContainer.isExchangeExist() ? cPKeyContainer.getExchangeCertificate() : cPKeyContainer.getSignatureCertificate();
                                if (certificate == null) {
                                    try {
                                        boolean z2 = true;
                                        if (!f.booleanValue() && !DefaultProvider.getKeytoolCompat()) {
                                            z = false;
                                            if (!g.booleanValue() && !DefaultProvider.isUseCertStub()) {
                                                z2 = false;
                                            }
                                        }
                                        z = true;
                                        if (!g.booleanValue()) {
                                            z2 = false;
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        containerReaderInterface2 = g2;
                                        mediaInterface = this;
                                        JCPLogger.subThrown(e);
                                        if (containerReaderInterface2 != null) {
                                            containerReaderInterface2.close();
                                        }
                                    } catch (UnrecoverableKeyException e2) {
                                        e = e2;
                                        containerReaderInterface3 = g2;
                                        mediaInterface = this;
                                        JCPLogger.subThrown(e);
                                        if (containerReaderInterface3 != null) {
                                            containerReaderInterface3.close();
                                        }
                                    } catch (CertificateException e3) {
                                        e = e3;
                                        containerReaderInterface4 = g2;
                                        mediaInterface = this;
                                        JCPLogger.subThrown(e);
                                        if (containerReaderInterface4 != null) {
                                            containerReaderInterface4.close();
                                        }
                                    }
                                }
                                b = certificate;
                            } catch (Throwable th) {
                                th = th;
                                containerReaderInterface = g2;
                                if (containerReaderInterface != null) {
                                    containerReaderInterface.close();
                                }
                                if (this != 0) {
                                    this.unlock();
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            certificate = null;
                        } catch (UnrecoverableKeyException e5) {
                            e = e5;
                            certificate = null;
                        } catch (CertificateException e6) {
                            e = e6;
                            certificate = null;
                        }
                    }
                    if (g2 != null) {
                        g2.close();
                    }
                    if (this != 0) {
                        this.unlock();
                    }
                    return b;
                } catch (IOException e7) {
                    e = e7;
                    certificate = null;
                    mediaInterface = this;
                } catch (UnrecoverableKeyException e8) {
                    e = e8;
                    certificate = null;
                    mediaInterface = this;
                } catch (CertificateException e9) {
                    e = e9;
                    certificate = null;
                    mediaInterface = this;
                }
            } catch (IOException e10) {
                e = e10;
                mediaInterface = null;
                certificate = null;
            } catch (UnrecoverableKeyException e11) {
                e = e11;
                mediaInterface = null;
                certificate = null;
            } catch (CertificateException e12) {
                e = e12;
                mediaInterface = null;
                certificate = null;
            } catch (Throwable th2) {
                th = th2;
                this = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final String engineGetCertificateAlias(Certificate certificate) {
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

    @Override // java.security.KeyStoreSpi
    public final Certificate[] engineGetCertificateChain(String str) {
        return i(str, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r4 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r4 == 0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [ru.CryptoPro.JCP.KeyStore.ContainerStore] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ru.CryptoPro.JCP.KeyStore.MediaInterface] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ru.CryptoPro.JCP.KeyStore.MediaInterface] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [ru.CryptoPro.JCP.KeyStore.MediaInterface] */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Date engineGetCreationDate(String str) {
        ContainerReaderInterface containerReaderInterface;
        vbb a = a(str);
        ?? r1 = 0;
        Date date = null;
        r1 = 0;
        r1 = 0;
        try {
            if (a != null) {
                try {
                    this = d();
                    try {
                    } catch (IOException e) {
                        e = e;
                    } catch (PrivilegedActionException e2) {
                        e = e2;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    this = 0;
                    containerReaderInterface = null;
                } catch (PrivilegedActionException e4) {
                    e = e4;
                    this = 0;
                    containerReaderInterface = null;
                } catch (Throwable th2) {
                    th = th2;
                    this = 0;
                }
                try {
                    containerReaderInterface = g((String) a.a, this);
                    if (containerReaderInterface != null) {
                        try {
                            date = (Date) AccessController.doPrivileged(new hr61(0, containerReaderInterface));
                        } catch (IOException e5) {
                            e = e5;
                            JCPLogger.info("", (Throwable) e);
                            if (containerReaderInterface != null) {
                                containerReaderInterface.close();
                            }
                        } catch (PrivilegedActionException e6) {
                            e = e6;
                            JCPLogger.info("", (Throwable) e);
                            if (containerReaderInterface != null) {
                                containerReaderInterface.close();
                            }
                        }
                    }
                    if (containerReaderInterface != null) {
                        containerReaderInterface.close();
                    }
                    if (this != 0) {
                        this.unlock();
                    }
                    return date;
                } catch (IOException e7) {
                    e = e7;
                    containerReaderInterface = null;
                    JCPLogger.info("", (Throwable) e);
                    if (containerReaderInterface != null) {
                    }
                } catch (PrivilegedActionException e8) {
                    e = e8;
                    containerReaderInterface = null;
                    JCPLogger.info("", (Throwable) e);
                    if (containerReaderInterface != null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r1 != 0) {
                        r1.close();
                    }
                    if (this != 0) {
                        this.unlock();
                    }
                    throw th;
                }
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            r1 = a;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Key engineGetKey(String str, char[] cArr) {
        return c(str, cArr, 0);
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsCertificateEntry(String str) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r2.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r2 == null) goto L21;
     */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean engineIsKeyEntry(String str) {
        MediaInterface mediaInterface;
        vbb a = a(str);
        if (a == null) {
            return false;
        }
        MediaInterface mediaInterface2 = null;
        r1 = null;
        ContainerReaderInterface containerReaderInterface = null;
        try {
            mediaInterface = d();
            try {
                containerReaderInterface = g((String) a.a, mediaInterface);
                if (containerReaderInterface != null) {
                    containerReaderInterface.close();
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
                mediaInterface2 = mediaInterface;
                if (mediaInterface2 != null) {
                    mediaInterface2.unlock();
                }
                throw th;
            }
        } catch (IOException unused2) {
            mediaInterface = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineLoad(InputStream inputStream, char[] cArr) {
        String readLine;
        ReentrantReadWriteLock reentrantReadWriteLock = this.c;
        reentrantReadWriteLock.writeLock().lock();
        if (inputStream != null) {
            if (inputStream instanceof StoreInputStream) {
                readLine = ((StoreInputStream) inputStream).getContainerAlias();
            } else if (this.e && !(inputStream instanceof VoidInputStream)) {
                readLine = new BufferedReader(new InputStreamReader(inputStream)).readLine();
            }
            this.d = readLine;
        }
        try {
            this.b.clear();
            this.a.load();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void engineSetCertificateEntry(String str, Certificate certificate) {
        String substring;
        ?? r8;
        MediaInterface mediaInterface;
        int indexOf = str.indexOf("****");
        ContainerReaderInterface containerReaderInterface = null;
        char[] cArr = null;
        containerReaderInterface = null;
        char c = 0;
        if (indexOf < 0) {
            int indexOf2 = str.indexOf("::::");
            if (indexOf2 < 0) {
                substring = null;
                r8 = str;
            } else {
                String substring2 = str.substring(0, indexOf2);
                substring = str.substring(indexOf2 + 4);
                r8 = substring2;
            }
        } else {
            String substring3 = str.substring(0, indexOf);
            String substring4 = str.substring(indexOf + 4);
            int indexOf3 = substring4.indexOf("::::");
            if (indexOf3 < 0) {
                substring = null;
            } else {
                String substring5 = substring4.substring(0, indexOf3);
                substring = substring4.substring(indexOf3 + 4);
                substring4 = substring5;
            }
            if (substring4.matches("1")) {
                c = 1;
            } else if (substring4.matches("2")) {
                c = 2;
            }
            r8 = substring3;
        }
        char[] charArray = substring == null ? null : substring.toCharArray();
        if (!(certificate instanceof X509Certificate)) {
            dy31.t("Certificate format is invalid");
            return;
        }
        CPKeyContainer.validateCreationAlias(r8);
        try {
            try {
                mediaInterface = d();
            } catch (Throwable th) {
                th = th;
                mediaInterface = null;
            }
            try {
                r8 = g(r8, mediaInterface);
            } catch (IOException e) {
                e = e;
            } catch (UnrecoverableKeyException e2) {
                e = e2;
            } catch (InvalidKeySpecException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                if (containerReaderInterface != null) {
                    containerReaderInterface.close();
                }
                if (mediaInterface != null) {
                    mediaInterface.unlock();
                }
                throw th;
            }
            try {
                if (r8 == 0) {
                    throw new KeyStoreException("Unable create container only with certificate");
                }
                if (!r8.login(charArray)) {
                    cArr = charArray;
                }
                CPKeyContainer cPKeyContainer = new CPKeyContainer(r8);
                if (c == 1) {
                    cPKeyContainer.setExchangeCertificate(certificate);
                } else {
                    if (c != 2) {
                        try {
                            cPKeyContainer.setExchangeCertificate(certificate);
                        } catch (CertWithoutKeyException | CertificateValidityException unused) {
                        }
                    }
                    cPKeyContainer.setSignatureCertificate(certificate);
                }
                cPKeyContainer.saveCert(cArr);
                r8.close();
                if (mediaInterface != null) {
                    mediaInterface.unlock();
                }
            } catch (IOException e4) {
                e = e4;
                throw j6a1.a(e);
            } catch (UnrecoverableKeyException e5) {
                e = e5;
                throw j6a1.a(e);
            } catch (InvalidKeySpecException e6) {
                e = e6;
                throw j6a1.a(e);
            } catch (Throwable th3) {
                th = th3;
                containerReaderInterface = r8;
                if (containerReaderInterface != null) {
                }
                if (mediaInterface != null) {
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (UnrecoverableKeyException e8) {
            e = e8;
        } catch (InvalidKeySpecException e9) {
            e = e9;
        } catch (Throwable th4) {
            th = th4;
            mediaInterface = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x03cc, code lost:
    
        if (r24 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03d2, code lost:
    
        if (r4.isSignatureExist() == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03d4, code lost:
    
        if (r5 != false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03e0, code lost:
    
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r6.length == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x05a6, code lost:
    
        if (r13 == false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0656, code lost:
    
        java.security.AccessController.doPrivileged(new defpackage.as61(r7, r10, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x065f, code lost:
    
        if (r29 != null) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0661, code lost:
    
        f(r11, r6, r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x07d2, code lost:
    
        if (r15 != null) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0808, code lost:
    
        if (r15 == null) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x080a, code lost:
    
        r15.unlockMutex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x080d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05d2, code lost:
    
        if (r13 == false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x03d6, code lost:
    
        if (r13 == null) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x03dc, code lost:
    
        if (r4.isExchangeExist() == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x03de, code lost:
    
        if (r7 == false) goto L301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a9 A[Catch: all -> 0x0300, InvalidKeySpecException -> 0x0305, UnrecoverableKeyException -> 0x030a, IOException -> 0x030f, PrivilegedActionException -> 0x0314, PasswordLockException -> 0x0319, TryCatch #36 {IOException -> 0x030f, PrivilegedActionException -> 0x0314, UnrecoverableKeyException -> 0x030a, InvalidKeySpecException -> 0x0305, PasswordLockException -> 0x0319, all -> 0x0300, blocks: (B:74:0x02d9, B:76:0x02eb, B:79:0x02f2, B:80:0x02ff, B:81:0x031e, B:84:0x0326, B:85:0x032a, B:86:0x0334, B:88:0x0338, B:91:0x0356, B:92:0x0363, B:93:0x032f, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:101:0x03a9, B:104:0x03bc, B:105:0x03c9, B:107:0x03b3, B:113:0x03ce, B:118:0x03e5, B:121:0x03ed, B:126:0x03fb, B:127:0x041e, B:130:0x0426, B:135:0x0434, B:137:0x045e, B:142:0x046a, B:144:0x047e, B:149:0x048a, B:378:0x04a0, B:385:0x04b8, B:386:0x04bd, B:388:0x03d8, B:392:0x037e, B:394:0x0384, B:398:0x038c, B:400:0x0392, B:402:0x0398, B:403:0x039f), top: B:73:0x02d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x045e A[Catch: all -> 0x0300, InvalidKeySpecException -> 0x0305, UnrecoverableKeyException -> 0x030a, IOException -> 0x030f, PrivilegedActionException -> 0x0314, PasswordLockException -> 0x0319, CertificateException -> 0x0412, TryCatch #64 {CertificateException -> 0x0412, blocks: (B:118:0x03e5, B:121:0x03ed, B:126:0x03fb, B:127:0x041e, B:130:0x0426, B:135:0x0434, B:137:0x045e, B:142:0x046a, B:144:0x047e, B:149:0x048a), top: B:117:0x03e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x047e A[Catch: all -> 0x0300, InvalidKeySpecException -> 0x0305, UnrecoverableKeyException -> 0x030a, IOException -> 0x030f, PrivilegedActionException -> 0x0314, PasswordLockException -> 0x0319, CertificateException -> 0x0412, TryCatch #64 {CertificateException -> 0x0412, blocks: (B:118:0x03e5, B:121:0x03ed, B:126:0x03fb, B:127:0x041e, B:130:0x0426, B:135:0x0434, B:137:0x045e, B:142:0x046a, B:144:0x047e, B:149:0x048a), top: B:117:0x03e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x055d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x059b A[Catch: all -> 0x0527, InvalidKeySpecException -> 0x0530, UnrecoverableKeyException -> 0x0537, IOException -> 0x053e, PrivilegedActionException -> 0x0545, PasswordLockException -> 0x054c, TryCatch #32 {IOException -> 0x053e, PrivilegedActionException -> 0x0545, InvalidKeySpecException -> 0x0530, PasswordLockException -> 0x054c, UnrecoverableKeyException -> 0x0537, all -> 0x0527, blocks: (B:161:0x0509, B:163:0x050f, B:164:0x0518, B:166:0x051d, B:179:0x059b, B:181:0x05a8, B:190:0x0635, B:194:0x0656, B:196:0x0661, B:302:0x0646, B:303:0x0653, B:314:0x0606, B:316:0x060b, B:318:0x0610, B:319:0x0615, B:321:0x061a, B:323:0x061f, B:324:0x058f, B:333:0x05c6, B:335:0x05ba, B:340:0x05da, B:347:0x05e9, B:344:0x05eb, B:345:0x05f3, B:343:0x05f0, B:353:0x0565, B:355:0x056a, B:357:0x056f, B:358:0x0574, B:360:0x0579, B:362:0x057e), top: B:160:0x0509 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0668 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0775 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0795 A[Catch: all -> 0x073d, TryCatch #14 {all -> 0x073d, blocks: (B:247:0x0739, B:244:0x074b, B:250:0x0741, B:262:0x075b, B:259:0x0765, B:265:0x0760, B:228:0x0775, B:225:0x077f, B:231:0x077a, B:235:0x078d, B:237:0x0795, B:240:0x07a1, B:254:0x07b2), top: B:30:0x0083, inners: #30, #39, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07a1 A[Catch: all -> 0x073d, TRY_LEAVE, TryCatch #14 {all -> 0x073d, blocks: (B:247:0x0739, B:244:0x074b, B:250:0x0741, B:262:0x075b, B:259:0x0765, B:265:0x0760, B:228:0x0775, B:225:0x077f, B:231:0x077a, B:235:0x078d, B:237:0x0795, B:240:0x07a1, B:254:0x07b2), top: B:30:0x0083, inners: #30, #39, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0739 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x075b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0800 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0602 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0606 A[Catch: all -> 0x0527, InvalidKeySpecException -> 0x0530, UnrecoverableKeyException -> 0x0537, IOException -> 0x053e, PrivilegedActionException -> 0x0545, PasswordLockException -> 0x054c, TryCatch #32 {IOException -> 0x053e, PrivilegedActionException -> 0x0545, InvalidKeySpecException -> 0x0530, PasswordLockException -> 0x054c, UnrecoverableKeyException -> 0x0537, all -> 0x0527, blocks: (B:161:0x0509, B:163:0x050f, B:164:0x0518, B:166:0x051d, B:179:0x059b, B:181:0x05a8, B:190:0x0635, B:194:0x0656, B:196:0x0661, B:302:0x0646, B:303:0x0653, B:314:0x0606, B:316:0x060b, B:318:0x0610, B:319:0x0615, B:321:0x061a, B:323:0x061f, B:324:0x058f, B:333:0x05c6, B:335:0x05ba, B:340:0x05da, B:347:0x05e9, B:344:0x05eb, B:345:0x05f3, B:343:0x05f0, B:353:0x0565, B:355:0x056a, B:357:0x056f, B:358:0x0574, B:360:0x0579, B:362:0x057e), top: B:160:0x0509 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0615 A[Catch: all -> 0x0527, InvalidKeySpecException -> 0x0530, UnrecoverableKeyException -> 0x0537, IOException -> 0x053e, PrivilegedActionException -> 0x0545, PasswordLockException -> 0x054c, TryCatch #32 {IOException -> 0x053e, PrivilegedActionException -> 0x0545, InvalidKeySpecException -> 0x0530, PasswordLockException -> 0x054c, UnrecoverableKeyException -> 0x0537, all -> 0x0527, blocks: (B:161:0x0509, B:163:0x050f, B:164:0x0518, B:166:0x051d, B:179:0x059b, B:181:0x05a8, B:190:0x0635, B:194:0x0656, B:196:0x0661, B:302:0x0646, B:303:0x0653, B:314:0x0606, B:316:0x060b, B:318:0x0610, B:319:0x0615, B:321:0x061a, B:323:0x061f, B:324:0x058f, B:333:0x05c6, B:335:0x05ba, B:340:0x05da, B:347:0x05e9, B:344:0x05eb, B:345:0x05f3, B:343:0x05f0, B:353:0x0565, B:355:0x056a, B:357:0x056f, B:358:0x0574, B:360:0x0579, B:362:0x057e), top: B:160:0x0509 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05c6 A[Catch: all -> 0x0527, InvalidKeySpecException -> 0x0530, UnrecoverableKeyException -> 0x0537, IOException -> 0x053e, PrivilegedActionException -> 0x0545, PasswordLockException -> 0x054c, TRY_LEAVE, TryCatch #32 {IOException -> 0x053e, PrivilegedActionException -> 0x0545, InvalidKeySpecException -> 0x0530, PasswordLockException -> 0x054c, UnrecoverableKeyException -> 0x0537, all -> 0x0527, blocks: (B:161:0x0509, B:163:0x050f, B:164:0x0518, B:166:0x051d, B:179:0x059b, B:181:0x05a8, B:190:0x0635, B:194:0x0656, B:196:0x0661, B:302:0x0646, B:303:0x0653, B:314:0x0606, B:316:0x060b, B:318:0x0610, B:319:0x0615, B:321:0x061a, B:323:0x061f, B:324:0x058f, B:333:0x05c6, B:335:0x05ba, B:340:0x05da, B:347:0x05e9, B:344:0x05eb, B:345:0x05f3, B:343:0x05f0, B:353:0x0565, B:355:0x056a, B:357:0x056f, B:358:0x0574, B:360:0x0579, B:362:0x057e), top: B:160:0x0509 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0565 A[Catch: all -> 0x0527, InvalidKeySpecException -> 0x0530, UnrecoverableKeyException -> 0x0537, IOException -> 0x053e, PrivilegedActionException -> 0x0545, PasswordLockException -> 0x054c, TryCatch #32 {IOException -> 0x053e, PrivilegedActionException -> 0x0545, InvalidKeySpecException -> 0x0530, PasswordLockException -> 0x054c, UnrecoverableKeyException -> 0x0537, all -> 0x0527, blocks: (B:161:0x0509, B:163:0x050f, B:164:0x0518, B:166:0x051d, B:179:0x059b, B:181:0x05a8, B:190:0x0635, B:194:0x0656, B:196:0x0661, B:302:0x0646, B:303:0x0653, B:314:0x0606, B:316:0x060b, B:318:0x0610, B:319:0x0615, B:321:0x061a, B:323:0x061f, B:324:0x058f, B:333:0x05c6, B:335:0x05ba, B:340:0x05da, B:347:0x05e9, B:344:0x05eb, B:345:0x05f3, B:343:0x05f0, B:353:0x0565, B:355:0x056a, B:357:0x056f, B:358:0x0574, B:360:0x0579, B:362:0x057e), top: B:160:0x0509 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0574 A[Catch: all -> 0x0527, InvalidKeySpecException -> 0x0530, UnrecoverableKeyException -> 0x0537, IOException -> 0x053e, PrivilegedActionException -> 0x0545, PasswordLockException -> 0x054c, TryCatch #32 {IOException -> 0x053e, PrivilegedActionException -> 0x0545, InvalidKeySpecException -> 0x0530, PasswordLockException -> 0x054c, UnrecoverableKeyException -> 0x0537, all -> 0x0527, blocks: (B:161:0x0509, B:163:0x050f, B:164:0x0518, B:166:0x051d, B:179:0x059b, B:181:0x05a8, B:190:0x0635, B:194:0x0656, B:196:0x0661, B:302:0x0646, B:303:0x0653, B:314:0x0606, B:316:0x060b, B:318:0x0610, B:319:0x0615, B:321:0x061a, B:323:0x061f, B:324:0x058f, B:333:0x05c6, B:335:0x05ba, B:340:0x05da, B:347:0x05e9, B:344:0x05eb, B:345:0x05f3, B:343:0x05f0, B:353:0x0565, B:355:0x056a, B:357:0x056f, B:358:0x0574, B:360:0x0579, B:362:0x057e), top: B:160:0x0509 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x02c5 A[Catch: all -> 0x04be, InvalidKeySpecException -> 0x04c3, UnrecoverableKeyException -> 0x04c8, IOException -> 0x04cd, PrivilegedActionException -> 0x04d2, PasswordLockException -> 0x04d7, TRY_ENTER, TryCatch #30 {IOException -> 0x04cd, PrivilegedActionException -> 0x04d2, PasswordLockException -> 0x04d7, UnrecoverableKeyException -> 0x04c8, InvalidKeySpecException -> 0x04c3, all -> 0x04be, blocks: (B:49:0x0253, B:57:0x028c, B:62:0x029b, B:71:0x02d2, B:429:0x02c5), top: B:48:0x0253 }] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b6 A[Catch: all -> 0x0265, InvalidKeySpecException -> 0x0269, UnrecoverableKeyException -> 0x026d, IOException -> 0x0271, PrivilegedActionException -> 0x0275, PasswordLockException -> 0x0279, TRY_LEAVE, TryCatch #39 {IOException -> 0x0271, PrivilegedActionException -> 0x0275, UnrecoverableKeyException -> 0x026d, InvalidKeySpecException -> 0x0269, PasswordLockException -> 0x0279, all -> 0x0265, blocks: (B:433:0x025c, B:54:0x0281, B:66:0x02a6, B:67:0x02b3, B:69:0x02b6), top: B:432:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0370 A[Catch: all -> 0x0300, InvalidKeySpecException -> 0x0305, UnrecoverableKeyException -> 0x030a, IOException -> 0x030f, PrivilegedActionException -> 0x0314, PasswordLockException -> 0x0319, TryCatch #36 {IOException -> 0x030f, PrivilegedActionException -> 0x0314, UnrecoverableKeyException -> 0x030a, InvalidKeySpecException -> 0x0305, PasswordLockException -> 0x0319, all -> 0x0300, blocks: (B:74:0x02d9, B:76:0x02eb, B:79:0x02f2, B:80:0x02ff, B:81:0x031e, B:84:0x0326, B:85:0x032a, B:86:0x0334, B:88:0x0338, B:91:0x0356, B:92:0x0363, B:93:0x032f, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:101:0x03a9, B:104:0x03bc, B:105:0x03c9, B:107:0x03b3, B:113:0x03ce, B:118:0x03e5, B:121:0x03ed, B:126:0x03fb, B:127:0x041e, B:130:0x0426, B:135:0x0434, B:137:0x045e, B:142:0x046a, B:144:0x047e, B:149:0x048a, B:378:0x04a0, B:385:0x04b8, B:386:0x04bd, B:388:0x03d8, B:392:0x037e, B:394:0x0384, B:398:0x038c, B:400:0x0392, B:402:0x0398, B:403:0x039f), top: B:73:0x02d9 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [char[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Object, ru.CryptoPro.JCP.KeyStore.CPKeyContainer] */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v90 */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        char[] cArr2;
        GostPrivateKey gostPrivateKey;
        GostExchPrivateKey gostExchPrivateKey;
        ?? r16;
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock;
        MediaInterface mediaInterface;
        boolean z2;
        ContainerReaderInterface containerReaderInterface;
        ContainerReaderInterface containerReaderInterface2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        GostPrivateKey gostPrivateKey2;
        boolean z7;
        char[] cArr3;
        Certificate certificate;
        Certificate[] certificateArr2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        PrivateKeyInterface privateKeyInterface;
        ?? r7;
        boolean z15;
        GostExchPrivateKey gostExchPrivateKey2;
        Certificate[] certificateArr3;
        Certificate certificate2;
        boolean z16;
        int i;
        boolean z17;
        boolean z18;
        boolean matchFP;
        boolean z19;
        boolean z20;
        PrivateKeyInterface privateKeyInterface2;
        Certificate certificate3;
        Certificate[] certificateArr4;
        Certificate[] certificateArr5;
        boolean z21;
        Certificate certificate4;
        PrivateKeyInterface privateKeyInterface3;
        boolean matchFP2;
        ReentrantReadWriteLock reentrantReadWriteLock2 = this.c;
        if (key != null && !key.getClass().isAssignableFrom(GostPrivateKey.class) && !key.getClass().isAssignableFrom(GostExchPrivateKey.class)) {
            dy31.t("key is not GostPrivateKey or GostExchPrivateKey");
            return;
        }
        int indexOf = str.indexOf("::::");
        int i2 = 0;
        String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
        if (indexOf >= 0) {
            cArr2 = str.substring(indexOf + 4, str.length()).toCharArray();
        }
        cArr2 = null;
        boolean equals = Arrays.equals(cArr, cArr2);
        boolean z22 = key == null && certificateArr != null;
        try {
            try {
                try {
                    try {
                        if (key == null) {
                            gostPrivateKey = null;
                        } else {
                            if (!key.getClass().isAssignableFrom(GostPrivateKey.class)) {
                                gostExchPrivateKey = (GostExchPrivateKey) key;
                                gostPrivateKey = null;
                                int i3 = (gostPrivateKey == null || gostExchPrivateKey != null) ? gostPrivateKey == null ? 2 : 1 : 0;
                                CPKeyContainer.validateCreationAlias(substring);
                                mediaInterface = d();
                                mediaInterface.lockMutex();
                                containerReaderInterface = g(substring, mediaInterface);
                                if (containerReaderInterface != null) {
                                    try {
                                        containerReaderInterface2 = (ContainerReaderInterface) AccessController.doPrivileged(new pr61(mediaInterface, substring, i2));
                                        try {
                                            boolean z23 = containerReaderInterface2 instanceof hq61;
                                            z3 = !z23;
                                            if (z23) {
                                                try {
                                                    reentrantReadWriteLock2.writeLock().lock();
                                                } catch (IOException e) {
                                                    e = e;
                                                    reentrantReadWriteLock = reentrantReadWriteLock2;
                                                    containerReaderInterface = containerReaderInterface2;
                                                    z = true;
                                                    z2 = false;
                                                    if (z2) {
                                                    }
                                                    throw j6a1.a(e);
                                                } catch (PrivilegedActionException e2) {
                                                    e = e2;
                                                    throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                                } catch (UnrecoverableKeyException e3) {
                                                    e = e3;
                                                    reentrantReadWriteLock = reentrantReadWriteLock2;
                                                    containerReaderInterface = containerReaderInterface2;
                                                    z = true;
                                                    z2 = false;
                                                    if (z2) {
                                                    }
                                                    throw j6a1.a(e);
                                                } catch (InvalidKeySpecException e4) {
                                                    e = e4;
                                                    reentrantReadWriteLock = reentrantReadWriteLock2;
                                                    containerReaderInterface = containerReaderInterface2;
                                                    z = true;
                                                    z2 = false;
                                                    if (z2) {
                                                    }
                                                    throw j6a1.a(e);
                                                } catch (PasswordLockException e5) {
                                                    e = e5;
                                                    throw j6a1.a(e);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    reentrantReadWriteLock = reentrantReadWriteLock2;
                                                    containerReaderInterface = containerReaderInterface2;
                                                    r16 = 0;
                                                    z = true;
                                                    z2 = false;
                                                    if (z2) {
                                                    }
                                                    if (z) {
                                                    }
                                                    if (containerReaderInterface != null) {
                                                    }
                                                }
                                                try {
                                                    e(substring, i3);
                                                    z4 = true;
                                                } catch (IOException e6) {
                                                    e = e6;
                                                    reentrantReadWriteLock = reentrantReadWriteLock2;
                                                    containerReaderInterface = containerReaderInterface2;
                                                    z2 = true;
                                                    z = true;
                                                    if (z2) {
                                                    }
                                                    throw j6a1.a(e);
                                                } catch (PrivilegedActionException e7) {
                                                    e = e7;
                                                    throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                                } catch (PasswordLockException e8) {
                                                    e = e8;
                                                    throw j6a1.a(e);
                                                } catch (UnrecoverableKeyException e9) {
                                                    e = e9;
                                                    reentrantReadWriteLock = reentrantReadWriteLock2;
                                                    containerReaderInterface = containerReaderInterface2;
                                                    z2 = true;
                                                    z = true;
                                                    if (z2) {
                                                    }
                                                    throw j6a1.a(e);
                                                } catch (InvalidKeySpecException e10) {
                                                    e = e10;
                                                    reentrantReadWriteLock = reentrantReadWriteLock2;
                                                    containerReaderInterface = containerReaderInterface2;
                                                    z2 = true;
                                                    z = true;
                                                    if (z2) {
                                                    }
                                                    throw j6a1.a(e);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    reentrantReadWriteLock = reentrantReadWriteLock2;
                                                    containerReaderInterface = containerReaderInterface2;
                                                    z2 = true;
                                                    r16 = 0;
                                                    z = true;
                                                    if (z2) {
                                                    }
                                                    if (z) {
                                                    }
                                                    if (containerReaderInterface != null) {
                                                    }
                                                }
                                            } else {
                                                z4 = false;
                                            }
                                            try {
                                                char[] cArr4 = containerReaderInterface2.login(cArr2) ? null : cArr2;
                                                CPKeyContainer cPKeyContainer = new CPKeyContainer(containerReaderInterface2, substring);
                                                z5 = gostPrivateKey != null;
                                                z6 = gostExchPrivateKey != null;
                                                gostPrivateKey2 = gostPrivateKey;
                                                z7 = z4;
                                                cArr3 = cArr4;
                                                certificate = null;
                                                certificateArr2 = null;
                                                z8 = false;
                                                z9 = false;
                                                z10 = false;
                                                z = true;
                                                z11 = false;
                                                z12 = false;
                                                z13 = false;
                                                z14 = false;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                privateKeyInterface = null;
                                                r7 = cPKeyContainer;
                                            } catch (IOException e11) {
                                                e = e11;
                                                z2 = z4;
                                                containerReaderInterface = containerReaderInterface2;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                i2 = 0;
                                                z = true;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (PrivilegedActionException e12) {
                                                e = e12;
                                                throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                            } catch (PasswordLockException e13) {
                                                e = e13;
                                                throw j6a1.a(e);
                                            } catch (UnrecoverableKeyException e14) {
                                                e = e14;
                                                z2 = z4;
                                                containerReaderInterface = containerReaderInterface2;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                i2 = 0;
                                                z = true;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (InvalidKeySpecException e15) {
                                                e = e15;
                                                z2 = z4;
                                                containerReaderInterface = containerReaderInterface2;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                i2 = 0;
                                                z = true;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z2 = z4;
                                                containerReaderInterface = containerReaderInterface2;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                i2 = 0;
                                                r16 = 0;
                                                z = true;
                                                if (z2) {
                                                }
                                                if (z) {
                                                    try {
                                                        if (containerReaderInterface != null) {
                                                        }
                                                    } finally {
                                                        containerReaderInterface.close();
                                                        if (mediaInterface != null) {
                                                            mediaInterface.unlock();
                                                        }
                                                    }
                                                }
                                                if (containerReaderInterface != null) {
                                                }
                                            }
                                        } catch (IOException e16) {
                                            e = e16;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                            containerReaderInterface = containerReaderInterface2;
                                            i2 = 0;
                                            z2 = false;
                                            z = true;
                                            if (z2) {
                                            }
                                            throw j6a1.a(e);
                                        } catch (PrivilegedActionException e17) {
                                            e = e17;
                                            throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                        } catch (UnrecoverableKeyException e18) {
                                            e = e18;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                            containerReaderInterface = containerReaderInterface2;
                                            i2 = 0;
                                            z2 = false;
                                            z = true;
                                            if (z2) {
                                            }
                                            throw j6a1.a(e);
                                        } catch (InvalidKeySpecException e19) {
                                            e = e19;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                            containerReaderInterface = containerReaderInterface2;
                                            i2 = 0;
                                            z2 = false;
                                            z = true;
                                            if (z2) {
                                            }
                                            throw j6a1.a(e);
                                        } catch (PasswordLockException e20) {
                                            e = e20;
                                            throw j6a1.a(e);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                            containerReaderInterface = containerReaderInterface2;
                                            i2 = 0;
                                            z2 = false;
                                            r16 = 0;
                                            z = true;
                                            if (z2) {
                                            }
                                            if (z) {
                                            }
                                            if (containerReaderInterface != null) {
                                            }
                                        }
                                    } catch (IOException e21) {
                                        e = e21;
                                        reentrantReadWriteLock = reentrantReadWriteLock2;
                                    } catch (PrivilegedActionException e22) {
                                        e = e22;
                                    } catch (PasswordLockException e23) {
                                        e = e23;
                                    } catch (UnrecoverableKeyException e24) {
                                        e = e24;
                                        reentrantReadWriteLock = reentrantReadWriteLock2;
                                    } catch (InvalidKeySpecException e25) {
                                        e = e25;
                                        reentrantReadWriteLock = reentrantReadWriteLock2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        reentrantReadWriteLock = reentrantReadWriteLock2;
                                    }
                                } else {
                                    try {
                                        boolean z24 = containerReaderInterface instanceof hq61;
                                        z3 = !z24;
                                        if (z24) {
                                            reentrantReadWriteLock2.writeLock().lock();
                                            try {
                                                e(substring, i3);
                                                z17 = true;
                                            } catch (IOException e26) {
                                                e = e26;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                i2 = 0;
                                                z2 = true;
                                                z = false;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (PrivilegedActionException e27) {
                                                e = e27;
                                                throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                            } catch (PasswordLockException e28) {
                                                e = e28;
                                                throw j6a1.a(e);
                                            } catch (UnrecoverableKeyException e29) {
                                                e = e29;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                i2 = 0;
                                                z2 = true;
                                                z = false;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (InvalidKeySpecException e30) {
                                                e = e30;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                i2 = 0;
                                                z2 = true;
                                                z = false;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (Throwable th6) {
                                                th = th6;
                                                reentrantReadWriteLock = reentrantReadWriteLock2;
                                                i2 = 0;
                                                z2 = true;
                                                r16 = 0;
                                                z = false;
                                                if (z2) {
                                                }
                                                if (z) {
                                                }
                                                if (containerReaderInterface != null) {
                                                }
                                            }
                                        } else {
                                            z17 = false;
                                        }
                                        try {
                                            char[] cArr5 = containerReaderInterface.login(cArr2) ? null : cArr2;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                            try {
                                                CPKeyContainer cPKeyContainer2 = new CPKeyContainer(containerReaderInterface);
                                                if (z22) {
                                                    gostPrivateKey2 = gostPrivateKey;
                                                    boolean z25 = z17;
                                                    r7 = cPKeyContainer2;
                                                    cArr3 = cArr5;
                                                    z7 = z25;
                                                    privateKeyInterface = null;
                                                    certificate = null;
                                                    z5 = false;
                                                    z6 = false;
                                                    z8 = false;
                                                    z9 = false;
                                                    z10 = false;
                                                    z = false;
                                                    z11 = false;
                                                    z12 = false;
                                                    z13 = false;
                                                    z14 = false;
                                                    containerReaderInterface2 = containerReaderInterface;
                                                    certificateArr2 = null;
                                                } else {
                                                    try {
                                                        if (gostPrivateKey != null) {
                                                            try {
                                                                if (!cPKeyContainer2.isSignatureExist()) {
                                                                    z5 = true;
                                                                    z6 = gostExchPrivateKey == null && !cPKeyContainer2.isExchangeExist();
                                                                    boolean z26 = (cPKeyContainer2.secondaryAbsent() || z5 || z6) ? false : true;
                                                                    if (!cPKeyContainer2.isPasswordProtected() && cArr5 == null && !z26) {
                                                                        throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_OLD_PASS_NEED));
                                                                    }
                                                                    gostPrivateKey2 = gostPrivateKey;
                                                                    ProviderSpec providerSpec = ProviderSpec.getInstance(gostPrivateKey != null ? gostExchPrivateKey.getSpec().getParams().getOID() : gostPrivateKey.getSpec().getParams().getOID());
                                                                    z18 = z17;
                                                                    ProviderSpec providerSpec2 = ProviderSpec.getInstance(cPKeyContainer2.getAlgidSpec(0).getOID());
                                                                    if (!cPKeyContainer2.keyAbsent() && providerSpec.a != providerSpec2.a) {
                                                                        throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_DIFF_ALG_CONT));
                                                                    }
                                                                    if (!cPKeyContainer2.keyAbsent()) {
                                                                        ParamsInterface params = (gostPrivateKey2 == null ? gostExchPrivateKey.getSpec() : gostPrivateKey2.getSpec()).getParams();
                                                                        if ((params instanceof AlgIdInterface) && !((AlgIdInterface) params).getCryptParams().getOID().equals(cPKeyContainer2.getAlgidSpec(0).getCryptParams().getOID())) {
                                                                            throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_DIFF_CIPHER_ALG_CONT));
                                                                        }
                                                                    }
                                                                    PrivateKeyInterface privateKeyInterface4 = (PrivateKeyInterface) ((GostPrivateKey) key).getSpec();
                                                                    if (gostExchPrivateKey == null) {
                                                                        if (cPKeyContainer2.isPrimaryExchange()) {
                                                                            matchFP2 = cPKeyContainer2.matchFP(privateKeyInterface4, 0);
                                                                        } else if (!cPKeyContainer2.secondaryAbsent()) {
                                                                            matchFP2 = cPKeyContainer2.matchFP(privateKeyInterface4, 1);
                                                                        }
                                                                        z19 = matchFP2;
                                                                        matchFP = false;
                                                                        if ((gostPrivateKey2 != null && cPKeyContainer2.isSignatureExist() && !matchFP) || (gostExchPrivateKey != null && cPKeyContainer2.isExchangeExist() && !z19)) {
                                                                            throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_KEY_ALREADY_EXISTS));
                                                                        }
                                                                        z9 = false;
                                                                        try {
                                                                            if (!cPKeyContainer2.isExchangeExist() || gostExchPrivateKey == null || !cPKeyContainer2.isSignatureExist() || (equals && !z9)) {
                                                                                z11 = matchFP;
                                                                                z20 = false;
                                                                                privateKeyInterface2 = null;
                                                                                certificate3 = null;
                                                                                certificateArr4 = null;
                                                                                z12 = false;
                                                                                if (cPKeyContainer2.isSignatureExist() || gostPrivateKey2 == null || !cPKeyContainer2.isExchangeExist() || (equals && !z9)) {
                                                                                    z13 = z20;
                                                                                    certificateArr5 = certificateArr4;
                                                                                    z21 = false;
                                                                                    certificate4 = certificate3;
                                                                                    privateKeyInterface3 = privateKeyInterface2;
                                                                                    z10 = false;
                                                                                    if (gostPrivateKey2 != null && !cPKeyContainer2.isSignatureExist() && z5 && (!equals || z9)) {
                                                                                        privateKeyInterface3 = cPKeyContainer2.getExchange(cArr5);
                                                                                        certificate4 = cPKeyContainer2.getExchangeCertificate();
                                                                                        certificateArr5 = cPKeyContainer2.getContainerCertificateChain(false);
                                                                                        z21 = true;
                                                                                        z10 = true;
                                                                                        z12 = true;
                                                                                    }
                                                                                    if (gostExchPrivateKey != null && !cPKeyContainer2.isExchangeExist() && z6 && (!equals || z9)) {
                                                                                        privateKeyInterface3 = cPKeyContainer2.getSignature(cArr5);
                                                                                        certificate4 = cPKeyContainer2.getSignatureCertificate();
                                                                                        certificateArr5 = cPKeyContainer2.getContainerCertificateChain(true);
                                                                                        z21 = false;
                                                                                        z12 = true;
                                                                                        z13 = true;
                                                                                    }
                                                                                    if (equals || z9) {
                                                                                        cPKeyContainer2.reset();
                                                                                    }
                                                                                    Certificate[] certificateArr6 = certificateArr5;
                                                                                    z14 = z21;
                                                                                    certificate = certificate4;
                                                                                    cArr3 = cArr5;
                                                                                    containerReaderInterface2 = containerReaderInterface;
                                                                                    certificateArr2 = certificateArr6;
                                                                                    z7 = z18;
                                                                                    z8 = z19;
                                                                                    r7 = cPKeyContainer2;
                                                                                    privateKeyInterface = privateKeyInterface3;
                                                                                    z = false;
                                                                                }
                                                                                PrivateKeyInterface exchange = cPKeyContainer2.getExchange(cArr5);
                                                                                Certificate exchangeCertificate = cPKeyContainer2.getExchangeCertificate();
                                                                                z13 = z20;
                                                                                Certificate[] containerCertificateChain = cPKeyContainer2.getContainerCertificateChain(false);
                                                                                z12 = cPKeyContainer2.isPrimaryExchange();
                                                                                certificateArr5 = containerCertificateChain;
                                                                                z21 = true;
                                                                                certificate4 = exchangeCertificate;
                                                                                privateKeyInterface3 = exchange;
                                                                                z10 = true;
                                                                                if (gostPrivateKey2 != null) {
                                                                                    privateKeyInterface3 = cPKeyContainer2.getExchange(cArr5);
                                                                                    certificate4 = cPKeyContainer2.getExchangeCertificate();
                                                                                    certificateArr5 = cPKeyContainer2.getContainerCertificateChain(false);
                                                                                    z21 = true;
                                                                                    z10 = true;
                                                                                    z12 = true;
                                                                                }
                                                                                if (gostExchPrivateKey != null) {
                                                                                    privateKeyInterface3 = cPKeyContainer2.getSignature(cArr5);
                                                                                    certificate4 = cPKeyContainer2.getSignatureCertificate();
                                                                                    certificateArr5 = cPKeyContainer2.getContainerCertificateChain(true);
                                                                                    z21 = false;
                                                                                    z12 = true;
                                                                                    z13 = true;
                                                                                }
                                                                                if (equals) {
                                                                                }
                                                                                cPKeyContainer2.reset();
                                                                                Certificate[] certificateArr62 = certificateArr5;
                                                                                z14 = z21;
                                                                                certificate = certificate4;
                                                                                cArr3 = cArr5;
                                                                                containerReaderInterface2 = containerReaderInterface;
                                                                                certificateArr2 = certificateArr62;
                                                                                z7 = z18;
                                                                                z8 = z19;
                                                                                r7 = cPKeyContainer2;
                                                                                privateKeyInterface = privateKeyInterface3;
                                                                                z = false;
                                                                            }
                                                                            privateKeyInterface2 = cPKeyContainer2.getSignature(cArr5);
                                                                            certificate3 = cPKeyContainer2.getSignatureCertificate();
                                                                            z11 = matchFP;
                                                                            certificateArr4 = cPKeyContainer2.getContainerCertificateChain(true);
                                                                            z12 = !cPKeyContainer2.isPrimaryExchange();
                                                                            z20 = true;
                                                                            if (cPKeyContainer2.isSignatureExist()) {
                                                                            }
                                                                            z13 = z20;
                                                                            certificateArr5 = certificateArr4;
                                                                            z21 = false;
                                                                            certificate4 = certificate3;
                                                                            privateKeyInterface3 = privateKeyInterface2;
                                                                            z10 = false;
                                                                            if (gostPrivateKey2 != null) {
                                                                            }
                                                                            if (gostExchPrivateKey != null) {
                                                                            }
                                                                            if (equals) {
                                                                            }
                                                                            cPKeyContainer2.reset();
                                                                            Certificate[] certificateArr622 = certificateArr5;
                                                                            z14 = z21;
                                                                            certificate = certificate4;
                                                                            cArr3 = cArr5;
                                                                            containerReaderInterface2 = containerReaderInterface;
                                                                            certificateArr2 = certificateArr622;
                                                                            z7 = z18;
                                                                            z8 = z19;
                                                                            r7 = cPKeyContainer2;
                                                                            privateKeyInterface = privateKeyInterface3;
                                                                            z = false;
                                                                        } catch (CertificateException e31) {
                                                                            throw new KeyStoreException(e31);
                                                                        }
                                                                    } else if (gostPrivateKey2 != null) {
                                                                        if (!cPKeyContainer2.isPrimaryExchange()) {
                                                                            matchFP = cPKeyContainer2.matchFP(privateKeyInterface4, 0);
                                                                        } else if (!cPKeyContainer2.secondaryAbsent()) {
                                                                            matchFP = cPKeyContainer2.matchFP(privateKeyInterface4, 1);
                                                                        }
                                                                        z19 = false;
                                                                        if (gostPrivateKey2 != null) {
                                                                            throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_KEY_ALREADY_EXISTS));
                                                                        }
                                                                        throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_KEY_ALREADY_EXISTS));
                                                                    }
                                                                    matchFP = false;
                                                                    z19 = false;
                                                                    if (gostPrivateKey2 != null) {
                                                                    }
                                                                    throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_KEY_ALREADY_EXISTS));
                                                                }
                                                            } catch (IOException e32) {
                                                                e = e32;
                                                                z2 = z17;
                                                                i2 = 0;
                                                                z = false;
                                                                if (z2) {
                                                                }
                                                                throw j6a1.a(e);
                                                            } catch (PrivilegedActionException e33) {
                                                                e = e33;
                                                                throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                                            } catch (UnrecoverableKeyException e34) {
                                                                e = e34;
                                                                z2 = z17;
                                                                i2 = 0;
                                                                z = false;
                                                                if (z2) {
                                                                }
                                                                throw j6a1.a(e);
                                                            } catch (InvalidKeySpecException e35) {
                                                                e = e35;
                                                                z2 = z17;
                                                                i2 = 0;
                                                                z = false;
                                                                if (z2) {
                                                                }
                                                                throw j6a1.a(e);
                                                            } catch (PasswordLockException e36) {
                                                                e = e36;
                                                                throw j6a1.a(e);
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                z2 = z17;
                                                                i2 = 0;
                                                                r16 = 0;
                                                                z = false;
                                                                if (z2) {
                                                                }
                                                                if (z) {
                                                                }
                                                                if (containerReaderInterface != null) {
                                                                }
                                                            }
                                                        }
                                                        ProviderSpec providerSpec22 = ProviderSpec.getInstance(cPKeyContainer2.getAlgidSpec(0).getOID());
                                                        if (!cPKeyContainer2.keyAbsent()) {
                                                            throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_DIFF_ALG_CONT));
                                                        }
                                                        if (!cPKeyContainer2.keyAbsent()) {
                                                        }
                                                        PrivateKeyInterface privateKeyInterface42 = (PrivateKeyInterface) ((GostPrivateKey) key).getSpec();
                                                        if (gostExchPrivateKey == null) {
                                                        }
                                                        matchFP = false;
                                                        z19 = false;
                                                        if (gostPrivateKey2 != null) {
                                                        }
                                                        throw new KeyStoreException(InternalGostPrivateKey.resource.getString(ERROR_KEY_ALREADY_EXISTS));
                                                    } catch (IOException e37) {
                                                        e = e37;
                                                        z2 = z18;
                                                        i2 = 0;
                                                        z = false;
                                                        if (z2) {
                                                        }
                                                        throw j6a1.a(e);
                                                    } catch (PrivilegedActionException e38) {
                                                        e = e38;
                                                        throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                                    } catch (UnrecoverableKeyException e39) {
                                                        e = e39;
                                                        z2 = z18;
                                                        i2 = 0;
                                                        z = false;
                                                        if (z2) {
                                                        }
                                                        throw j6a1.a(e);
                                                    } catch (InvalidKeySpecException e40) {
                                                        e = e40;
                                                        z2 = z18;
                                                        i2 = 0;
                                                        z = false;
                                                        if (z2) {
                                                        }
                                                        throw j6a1.a(e);
                                                    } catch (PasswordLockException e41) {
                                                        e = e41;
                                                        throw j6a1.a(e);
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        z2 = z18;
                                                        i2 = 0;
                                                        r16 = 0;
                                                        z = false;
                                                        if (z2) {
                                                        }
                                                        if (z) {
                                                        }
                                                        if (containerReaderInterface != null) {
                                                        }
                                                    }
                                                    z5 = false;
                                                    if (gostExchPrivateKey == null) {
                                                    }
                                                    if (cPKeyContainer2.secondaryAbsent()) {
                                                    }
                                                    if (!cPKeyContainer2.isPasswordProtected()) {
                                                    }
                                                    gostPrivateKey2 = gostPrivateKey;
                                                    ProviderSpec providerSpec3 = ProviderSpec.getInstance(gostPrivateKey != null ? gostExchPrivateKey.getSpec().getParams().getOID() : gostPrivateKey.getSpec().getParams().getOID());
                                                    z18 = z17;
                                                }
                                            } catch (IOException e42) {
                                                e = e42;
                                                z18 = z17;
                                                z2 = z18;
                                                i2 = 0;
                                                z = false;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (PrivilegedActionException e43) {
                                                e = e43;
                                                z18 = z17;
                                                throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                            } catch (PasswordLockException e44) {
                                                e = e44;
                                                z18 = z17;
                                                throw j6a1.a(e);
                                            } catch (UnrecoverableKeyException e45) {
                                                e = e45;
                                                z18 = z17;
                                                z2 = z18;
                                                i2 = 0;
                                                z = false;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (InvalidKeySpecException e46) {
                                                e = e46;
                                                z18 = z17;
                                                z2 = z18;
                                                i2 = 0;
                                                z = false;
                                                if (z2) {
                                                }
                                                throw j6a1.a(e);
                                            } catch (Throwable th9) {
                                                th = th9;
                                                z18 = z17;
                                                z2 = z18;
                                                i2 = 0;
                                                r16 = 0;
                                                z = false;
                                                if (z2) {
                                                }
                                                if (z) {
                                                }
                                                if (containerReaderInterface != null) {
                                                }
                                            }
                                        } catch (IOException e47) {
                                            e = e47;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                        } catch (PrivilegedActionException e48) {
                                            e = e48;
                                        } catch (UnrecoverableKeyException e49) {
                                            e = e49;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                        } catch (InvalidKeySpecException e50) {
                                            e = e50;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                        } catch (PasswordLockException e51) {
                                            e = e51;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            reentrantReadWriteLock = reentrantReadWriteLock2;
                                        }
                                    } catch (IOException e52) {
                                        e = e52;
                                        reentrantReadWriteLock = reentrantReadWriteLock2;
                                        i2 = 0;
                                        z2 = false;
                                        z = false;
                                        if (z2) {
                                        }
                                        throw j6a1.a(e);
                                    } catch (PrivilegedActionException e53) {
                                        e = e53;
                                        throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                    } catch (InvalidKeySpecException e54) {
                                        e = e54;
                                        reentrantReadWriteLock = reentrantReadWriteLock2;
                                        i2 = 0;
                                        z2 = false;
                                        z = false;
                                        if (z2) {
                                        }
                                        throw j6a1.a(e);
                                    } catch (PasswordLockException e55) {
                                        e = e55;
                                        throw j6a1.a(e);
                                    } catch (UnrecoverableKeyException e56) {
                                        e = e56;
                                        reentrantReadWriteLock = reentrantReadWriteLock2;
                                        i2 = 0;
                                        z2 = false;
                                        z = false;
                                        if (z2) {
                                        }
                                        throw j6a1.a(e);
                                    } catch (Throwable th11) {
                                        th = th11;
                                        reentrantReadWriteLock = reentrantReadWriteLock2;
                                        i2 = 0;
                                        z2 = false;
                                        r16 = 0;
                                        z = false;
                                        if (z2) {
                                        }
                                        if (z) {
                                        }
                                        if (containerReaderInterface != null) {
                                        }
                                    }
                                }
                                ?? r10 = z3 ? cArr : cArr3;
                                if (certificateArr == null) {
                                    z15 = z22;
                                    try {
                                        gostExchPrivateKey2 = gostExchPrivateKey;
                                        if (certificateArr.length > 1) {
                                            Certificate[] certificateArr7 = new Certificate[certificateArr.length - 1];
                                            int i4 = 0;
                                            while (i4 < certificateArr.length - 1) {
                                                int i5 = i4 + 1;
                                                certificateArr7[i4] = certificateArr[i5];
                                                i4 = i5;
                                            }
                                            certificateArr3 = certificateArr7;
                                            if ((!z13 || z10) && privateKeyInterface != null && z12) {
                                                if (z14) {
                                                    r7.setExchange(privateKeyInterface, r10);
                                                    if (certificate != null) {
                                                        r7.setExchangeCertificate(certificate);
                                                        if (certificateArr2 != null) {
                                                            r7.setContainerCertificateChain(false, certificateArr2);
                                                        }
                                                    }
                                                } else {
                                                    r7.setSignature(privateKeyInterface, r10);
                                                    if (certificate != null) {
                                                        r7.setSignatureCertificate(certificate);
                                                        if (certificateArr2 != null) {
                                                            r7.setContainerCertificateChain(true, certificateArr2);
                                                        }
                                                    }
                                                }
                                            }
                                            if (gostPrivateKey2 != null) {
                                                if (!z5 && equals && !z9 && !z10) {
                                                    z16 = false;
                                                    if (certificateArr != null) {
                                                        r7.setSignatureCertificate(certificateArr[0]);
                                                        r7.setContainerCertificateChain(true, certificateArr3);
                                                    }
                                                    if (!z13) {
                                                        if (!z10) {
                                                        }
                                                        i = 1;
                                                        if (!z15) {
                                                            if (((gostPrivateKey2 != null && z5) || ((gostExchPrivateKey2 != null && z6) || ((gostPrivateKey2 != null && !z11) || (gostExchPrivateKey2 != null && !z8)))) && !((PrivateKeyInterface) ((GostPrivateKey) key).getSpec()).isExportable()) {
                                                                throw new KeyIsNotExportableException(InternalGostPrivateKey.resource.getString("KeyIsNotExportable"));
                                                            }
                                                        }
                                                        i = 0;
                                                        if (!z3) {
                                                            try {
                                                                this.b.remove(substring);
                                                            } catch (IOException e57) {
                                                                e = e57;
                                                                i2 = i;
                                                                containerReaderInterface = containerReaderInterface2;
                                                                z2 = z7;
                                                                if (z2) {
                                                                    try {
                                                                        h(i3, str);
                                                                    } catch (PasswordLockException e58) {
                                                                        throw j6a1.a(e58);
                                                                    }
                                                                }
                                                                throw j6a1.a(e);
                                                            } catch (PrivilegedActionException e59) {
                                                                e = e59;
                                                                throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                                            } catch (InvalidKeySpecException e60) {
                                                                e = e60;
                                                                i2 = i;
                                                                containerReaderInterface = containerReaderInterface2;
                                                                z2 = z7;
                                                                if (z2) {
                                                                    try {
                                                                        h(i3, str);
                                                                    } catch (PasswordLockException e61) {
                                                                        throw j6a1.a(e61);
                                                                    }
                                                                }
                                                                throw j6a1.a(e);
                                                            } catch (PasswordLockException e62) {
                                                                e = e62;
                                                                throw j6a1.a(e);
                                                            } catch (UnrecoverableKeyException e63) {
                                                                e = e63;
                                                                i2 = i;
                                                                containerReaderInterface = containerReaderInterface2;
                                                                z2 = z7;
                                                                if (z2) {
                                                                    try {
                                                                        h(i3, str);
                                                                    } catch (PasswordLockException e64) {
                                                                        throw j6a1.a(e64);
                                                                    }
                                                                }
                                                                throw j6a1.a(e);
                                                            } catch (Throwable th12) {
                                                                th = th12;
                                                                i2 = i;
                                                                containerReaderInterface = containerReaderInterface2;
                                                                z2 = z7;
                                                                r16 = 0;
                                                                if (z2) {
                                                                    reentrantReadWriteLock.writeLock().unlock();
                                                                }
                                                                if (z && i2 == 0) {
                                                                    if (containerReaderInterface != null) {
                                                                        try {
                                                                            AccessController.doPrivileged(new gs61(containerReaderInterface, substring, 0));
                                                                            containerReaderInterface.close();
                                                                        } catch (PrivilegedActionException e65) {
                                                                            if (r16 != 0) {
                                                                                throw r16;
                                                                            }
                                                                            if (!(e65.getCause() instanceof IOException)) {
                                                                                throw ((KeyStoreException) e65.getCause());
                                                                            }
                                                                            throw j6a1.a((IOException) e65.getCause());
                                                                        }
                                                                    }
                                                                }
                                                                if (containerReaderInterface != null) {
                                                                }
                                                            }
                                                        }
                                                        if (z7) {
                                                            reentrantReadWriteLock.writeLock().unlock();
                                                        }
                                                        if (z) {
                                                            try {
                                                                if (i == 0) {
                                                                    try {
                                                                        AccessController.doPrivileged(new gs61(containerReaderInterface2, substring, 0));
                                                                    } catch (PrivilegedActionException e66) {
                                                                        if (!(e66.getCause() instanceof IOException)) {
                                                                            throw ((KeyStoreException) e66.getCause());
                                                                        }
                                                                        throw j6a1.a((IOException) e66.getCause());
                                                                    }
                                                                }
                                                            } finally {
                                                                containerReaderInterface2.close();
                                                                mediaInterface.unlock();
                                                            }
                                                        }
                                                        mediaInterface.unlockMutex();
                                                        return;
                                                    }
                                                    if (privateKeyInterface != null && !z12) {
                                                        if (z14) {
                                                            r7.setSignature(privateKeyInterface, r10);
                                                            if (certificate != null) {
                                                                r7.setSignatureCertificate(certificate);
                                                                if (certificateArr2 != null) {
                                                                    i = 1;
                                                                    r7.setContainerCertificateChain(true, certificateArr2);
                                                                    if (!z15) {
                                                                    }
                                                                    i = 0;
                                                                    if (!z3) {
                                                                    }
                                                                    if (z7) {
                                                                    }
                                                                    if (z) {
                                                                    }
                                                                    mediaInterface.unlockMutex();
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            r7.setExchange(privateKeyInterface, r10);
                                                            if (certificate != null) {
                                                                r7.setExchangeCertificate(certificate);
                                                                if (certificateArr2 != null) {
                                                                    r7.setContainerCertificateChain(false, certificateArr2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i = 1;
                                                    if (!z15) {
                                                    }
                                                    i = 0;
                                                    if (!z3) {
                                                    }
                                                    if (z7) {
                                                    }
                                                    if (z) {
                                                    }
                                                    mediaInterface.unlockMutex();
                                                    return;
                                                }
                                                r7.setSignature((PrivateKeyInterface) gostPrivateKey2.getSpec(), r10);
                                                z16 = true;
                                                if (certificateArr != null) {
                                                }
                                                if (!z13) {
                                                }
                                                if (privateKeyInterface != null) {
                                                    if (z14) {
                                                    }
                                                }
                                                i = 1;
                                                if (!z15) {
                                                }
                                                i = 0;
                                                if (!z3) {
                                                }
                                                if (z7) {
                                                }
                                                if (z) {
                                                }
                                                mediaInterface.unlockMutex();
                                                return;
                                            }
                                            if (gostExchPrivateKey2 != null) {
                                                if (!z6 && equals && !z9 && !z13) {
                                                    z16 = false;
                                                    if (certificateArr != null) {
                                                        r7.setExchangeCertificate(certificateArr[0]);
                                                        r7.setContainerCertificateChain(false, certificateArr3);
                                                    }
                                                    if (!z13) {
                                                    }
                                                    if (privateKeyInterface != null) {
                                                    }
                                                    i = 1;
                                                    if (!z15) {
                                                    }
                                                    i = 0;
                                                    if (!z3) {
                                                    }
                                                    if (z7) {
                                                    }
                                                    if (z) {
                                                    }
                                                    mediaInterface.unlockMutex();
                                                    return;
                                                }
                                                r7.setExchange((PrivateKeyInterface) gostExchPrivateKey2.getSpec(), r10);
                                                z16 = true;
                                                if (certificateArr != null) {
                                                }
                                                if (!z13) {
                                                }
                                                if (privateKeyInterface != null) {
                                                }
                                                i = 1;
                                                if (!z15) {
                                                }
                                                i = 0;
                                                if (!z3) {
                                                }
                                                if (z7) {
                                                }
                                                if (z) {
                                                }
                                                mediaInterface.unlockMutex();
                                                return;
                                            }
                                            if (z15) {
                                                if (certificateArr != null) {
                                                    try {
                                                        r7.setExchangeCertificate(certificateArr[0]);
                                                        r7.setContainerCertificateChain(false, certificateArr3);
                                                    } catch (CertWithoutKeyException unused) {
                                                        certificate2 = certificateArr[0];
                                                        r7.setSignatureCertificate(certificate2);
                                                        r7.setContainerCertificateChain(true, certificateArr3);
                                                        if (certificateArr != null) {
                                                        }
                                                        z16 = false;
                                                        if (!z13) {
                                                        }
                                                        if (privateKeyInterface != null) {
                                                        }
                                                        i = 1;
                                                        if (!z15) {
                                                        }
                                                        i = 0;
                                                        if (!z3) {
                                                        }
                                                        if (z7) {
                                                        }
                                                        if (z) {
                                                        }
                                                        mediaInterface.unlockMutex();
                                                        return;
                                                    } catch (CertificateValidityException unused2) {
                                                        certificate2 = certificateArr[0];
                                                        r7.setSignatureCertificate(certificate2);
                                                        r7.setContainerCertificateChain(true, certificateArr3);
                                                        if (certificateArr != null) {
                                                        }
                                                        z16 = false;
                                                        if (!z13) {
                                                        }
                                                        if (privateKeyInterface != null) {
                                                        }
                                                        i = 1;
                                                        if (!z15) {
                                                        }
                                                        i = 0;
                                                        if (!z3) {
                                                        }
                                                        if (z7) {
                                                        }
                                                        if (z) {
                                                        }
                                                        mediaInterface.unlockMutex();
                                                        return;
                                                    }
                                                }
                                                if (certificateArr != null) {
                                                }
                                            }
                                            r7.saveCert(r10);
                                            z16 = false;
                                            if (!z13) {
                                            }
                                            if (privateKeyInterface != null) {
                                            }
                                            i = 1;
                                            if (!z15) {
                                            }
                                            i = 0;
                                            if (!z3) {
                                            }
                                            if (z7) {
                                            }
                                            if (z) {
                                            }
                                            mediaInterface.unlockMutex();
                                            return;
                                        }
                                    } catch (IOException e67) {
                                        e = e67;
                                        containerReaderInterface = containerReaderInterface2;
                                        z2 = z7;
                                        i2 = 0;
                                        if (z2) {
                                        }
                                        throw j6a1.a(e);
                                    } catch (PrivilegedActionException e68) {
                                        e = e68;
                                        throw (e.getCause() instanceof IOException ? j6a1.a((IOException) e.getCause()) : (KeyStoreException) e.getCause());
                                    } catch (InvalidKeySpecException e69) {
                                        e = e69;
                                        containerReaderInterface = containerReaderInterface2;
                                        z2 = z7;
                                        i2 = 0;
                                        if (z2) {
                                        }
                                        throw j6a1.a(e);
                                    } catch (PasswordLockException e70) {
                                        e = e70;
                                        throw j6a1.a(e);
                                    } catch (UnrecoverableKeyException e71) {
                                        e = e71;
                                        containerReaderInterface = containerReaderInterface2;
                                        z2 = z7;
                                        i2 = 0;
                                        if (z2) {
                                        }
                                        throw j6a1.a(e);
                                    } catch (Throwable th13) {
                                        th = th13;
                                        containerReaderInterface = containerReaderInterface2;
                                        z2 = z7;
                                        i2 = 0;
                                        r16 = 0;
                                        if (z2) {
                                        }
                                        if (z) {
                                        }
                                        if (containerReaderInterface != null) {
                                        }
                                    }
                                } else {
                                    z15 = z22;
                                    gostExchPrivateKey2 = gostExchPrivateKey;
                                }
                                certificateArr3 = null;
                                if (!z13) {
                                }
                                if (z14) {
                                }
                                if (gostPrivateKey2 != null) {
                                }
                                z16 = false;
                                if (!z13) {
                                }
                                if (privateKeyInterface != null) {
                                }
                                i = 1;
                                if (!z15) {
                                }
                                i = 0;
                                if (!z3) {
                                }
                                if (z7) {
                                }
                                if (z) {
                                }
                                mediaInterface.unlockMutex();
                                return;
                            }
                            gostPrivateKey = (GostPrivateKey) key;
                        }
                        mediaInterface.lockMutex();
                        containerReaderInterface = g(substring, mediaInterface);
                        if (containerReaderInterface != null) {
                        }
                        if (z3) {
                        }
                        if (certificateArr == null) {
                        }
                        certificateArr3 = null;
                        if (!z13) {
                        }
                        if (z14) {
                        }
                        if (gostPrivateKey2 != null) {
                        }
                        z16 = false;
                        if (!z13) {
                        }
                        if (privateKeyInterface != null) {
                        }
                        i = 1;
                        if (!z15) {
                        }
                        i = 0;
                        if (!z3) {
                        }
                        if (z7) {
                        }
                        if (z) {
                        }
                        mediaInterface.unlockMutex();
                        return;
                    } catch (IOException e72) {
                        e = e72;
                        reentrantReadWriteLock = reentrantReadWriteLock2;
                        i2 = 0;
                        containerReaderInterface = null;
                    } catch (PrivilegedActionException e73) {
                        e = e73;
                    } catch (UnrecoverableKeyException e74) {
                        e = e74;
                        reentrantReadWriteLock = reentrantReadWriteLock2;
                        i2 = 0;
                        containerReaderInterface = null;
                    } catch (InvalidKeySpecException e75) {
                        e = e75;
                        reentrantReadWriteLock = reentrantReadWriteLock2;
                        i2 = 0;
                        containerReaderInterface = null;
                    } catch (PasswordLockException e76) {
                        e = e76;
                    } catch (Throwable th14) {
                        th = th14;
                        reentrantReadWriteLock = reentrantReadWriteLock2;
                        i2 = 0;
                        containerReaderInterface = null;
                    }
                    mediaInterface = d();
                } catch (Throwable th15) {
                    th = th15;
                }
            } catch (IOException e77) {
                e = e77;
                reentrantReadWriteLock = reentrantReadWriteLock2;
                i2 = 0;
                containerReaderInterface = null;
                z2 = false;
                mediaInterface = null;
            } catch (PrivilegedActionException e78) {
                e = e78;
            } catch (PasswordLockException e79) {
                e = e79;
            } catch (UnrecoverableKeyException e80) {
                e = e80;
                reentrantReadWriteLock = reentrantReadWriteLock2;
                i2 = 0;
                containerReaderInterface = null;
                z2 = false;
                mediaInterface = null;
            } catch (InvalidKeySpecException e81) {
                e = e81;
                reentrantReadWriteLock = reentrantReadWriteLock2;
                i2 = 0;
                containerReaderInterface = null;
                z2 = false;
                mediaInterface = null;
            } catch (Throwable th16) {
                th = th16;
                reentrantReadWriteLock = reentrantReadWriteLock2;
                i2 = 0;
                containerReaderInterface = null;
                z2 = false;
                mediaInterface = null;
            }
        } catch (Throwable th17) {
            th = th17;
            r16 = this;
        }
        gostExchPrivateKey = null;
        if (gostPrivateKey == null) {
        }
        CPKeyContainer.validateCreationAlias(substring);
    }

    @Override // java.security.KeyStoreSpi
    public final int engineSize() {
        Throwable th;
        MediaInterface mediaInterface;
        if (this.d != null) {
            return 1;
        }
        MediaInterface mediaInterface2 = null;
        int i = 0;
        try {
            mediaInterface = d();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
            mediaInterface = null;
        }
        try {
            ox61 ox61Var = new ox61(null, mediaInterface);
            while (ox61Var.hasMoreElements()) {
                i++;
                ox61Var.nextElement();
            }
            if (mediaInterface != null) {
                mediaInterface.unlock();
            }
            return i;
        } catch (IOException unused2) {
            mediaInterface2 = mediaInterface;
            if (mediaInterface2 != null) {
                mediaInterface2.unlock();
            }
            return i;
        } catch (Throwable th3) {
            th = th3;
            if (mediaInterface != null) {
                mediaInterface.unlock();
            }
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineStore(OutputStream outputStream, char[] cArr) {
    }

    public final void h(int i, String str) {
        Map map = this.b;
        gt61 gt61Var = (gt61) map.get(str);
        if (gt61Var == null) {
            map.put(str, i == 1 ? new gt61(0, 1) : new gt61(1, 0));
        } else {
            if (i == 1) {
                gt61Var.b++;
            } else {
                gt61Var.a++;
            }
            map.put(str, gt61Var);
        }
        e(str, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b0, code lost:
    
        if (r8 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        r8.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f2, code lost:
    
        if (r5 == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f4, code lost:
    
        if (r11 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f7, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f8, code lost:
    
        r0 = new java.security.cert.Certificate[r5.length + r2];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fe, code lost:
    
        if (r8 >= r5.length) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        r0[r8 + r2] = r5[r8];
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0109, code lost:
    
        if (r11 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
    
        r0[0] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010e, code lost:
    
        if (r11 == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        return new java.security.cert.Certificate[]{r11};
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ef, code lost:
    
        if (r8 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e4, code lost:
    
        if (r8 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d9, code lost:
    
        if (r8 == null) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f A[Catch: all -> 0x002e, CertificateException -> 0x00d4, UnrecoverableKeyException -> 0x00df, IOException -> 0x00ea, TryCatch #7 {all -> 0x002e, blocks: (B:33:0x0018, B:38:0x0022, B:40:0x0028, B:41:0x0043, B:46:0x0075, B:48:0x007d, B:52:0x0087, B:54:0x008f, B:60:0x009d, B:62:0x00a3, B:80:0x003e, B:82:0x0051, B:84:0x0057, B:85:0x005b, B:87:0x0060, B:89:0x0066, B:90:0x006a), top: B:32:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.security.cert.Certificate[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.security.cert.Certificate[]] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Certificate[] i(String str, char[] cArr, int i) {
        MediaInterface mediaInterface;
        ContainerReaderInterface containerReaderInterface;
        ?? r5;
        boolean z;
        boolean z2;
        X509Certificate b;
        boolean z3;
        Certificate certificate;
        vbb a = a(str);
        ContainerReaderInterface containerReaderInterface2 = null;
        if (a == null) {
            return null;
        }
        int i2 = 1;
        try {
            mediaInterface = d();
            try {
                containerReaderInterface = g((String) a.a, mediaInterface);
                if (containerReaderInterface != null) {
                    try {
                        try {
                            CPKeyContainer cPKeyContainer = new CPKeyContainer(containerReaderInterface);
                            try {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (cPKeyContainer.isExchangeExist()) {
                                            z3 = false;
                                            certificate = cPKeyContainer.getExchangeCertificate();
                                        } else {
                                            z3 = true;
                                            certificate = cPKeyContainer.getSignatureCertificate();
                                        }
                                        r5 = cPKeyContainer.getContainerCertificateChain(z3);
                                        i = certificate;
                                    } else {
                                        if (cPKeyContainer.isSignatureExist()) {
                                            Certificate signatureCertificate = cPKeyContainer.getSignatureCertificate();
                                            r5 = cPKeyContainer.getContainerCertificateChain(true);
                                            i = signatureCertificate;
                                        }
                                        i = 0;
                                        r5 = 0;
                                        if (r5 == 0 && i == 0) {
                                            try {
                                                if (!f.booleanValue() && !DefaultProvider.getKeytoolCompat()) {
                                                    z = false;
                                                    if (!g.booleanValue() && !DefaultProvider.isUseCertStub()) {
                                                        z2 = false;
                                                        if (z && z2 && (b = b(containerReaderInterface, cPKeyContainer, a, cArr)) != null) {
                                                            r5 = new Certificate[]{b};
                                                        }
                                                    }
                                                    z2 = true;
                                                    if (z) {
                                                        r5 = new Certificate[]{b};
                                                    }
                                                }
                                                z = true;
                                                if (!g.booleanValue()) {
                                                    z2 = false;
                                                    if (z) {
                                                    }
                                                }
                                                z2 = true;
                                                if (z) {
                                                }
                                            } catch (IOException unused) {
                                                if (containerReaderInterface != null) {
                                                    containerReaderInterface.close();
                                                }
                                            } catch (UnrecoverableKeyException unused2) {
                                                if (containerReaderInterface != null) {
                                                    containerReaderInterface.close();
                                                }
                                            } catch (CertificateException unused3) {
                                                if (containerReaderInterface != null) {
                                                    containerReaderInterface.close();
                                                }
                                            }
                                        }
                                    }
                                    if (r5 == 0) {
                                        if (!f.booleanValue()) {
                                            z = false;
                                            if (!g.booleanValue()) {
                                            }
                                            z2 = true;
                                            if (z) {
                                            }
                                        }
                                        z = true;
                                        if (!g.booleanValue()) {
                                        }
                                        z2 = true;
                                        if (z) {
                                        }
                                    }
                                } else {
                                    if (cPKeyContainer.isExchangeExist()) {
                                        Certificate exchangeCertificate = cPKeyContainer.getExchangeCertificate();
                                        r5 = cPKeyContainer.getContainerCertificateChain(false);
                                        i = exchangeCertificate;
                                        if (r5 == 0) {
                                        }
                                    }
                                    i = 0;
                                    r5 = 0;
                                    if (r5 == 0) {
                                    }
                                }
                            } catch (IOException unused4) {
                                r5 = 0;
                            } catch (UnrecoverableKeyException unused5) {
                                r5 = 0;
                            } catch (CertificateException unused6) {
                                r5 = 0;
                            }
                        } catch (Throwable th) {
                            th = th;
                            containerReaderInterface2 = containerReaderInterface;
                            if (containerReaderInterface2 != null) {
                                containerReaderInterface2.close();
                            }
                            if (mediaInterface != null) {
                                mediaInterface.unlock();
                            }
                            throw th;
                        }
                    } catch (IOException unused7) {
                        i = 0;
                        r5 = 0;
                    } catch (UnrecoverableKeyException unused8) {
                        i = 0;
                        r5 = 0;
                    } catch (CertificateException unused9) {
                        i = 0;
                        r5 = 0;
                    }
                } else {
                    i = 0;
                    r5 = 0;
                }
                if (containerReaderInterface != null) {
                    containerReaderInterface.close();
                }
            } catch (IOException unused10) {
                i = 0;
                containerReaderInterface = i;
                r5 = containerReaderInterface;
                if (containerReaderInterface != null) {
                }
            } catch (UnrecoverableKeyException unused11) {
                i = 0;
                containerReaderInterface = i;
                r5 = containerReaderInterface;
                if (containerReaderInterface != null) {
                }
            } catch (CertificateException unused12) {
                i = 0;
                containerReaderInterface = i;
                r5 = containerReaderInterface;
                if (containerReaderInterface != null) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused13) {
            mediaInterface = null;
            i = 0;
        } catch (UnrecoverableKeyException unused14) {
            mediaInterface = null;
            i = 0;
        } catch (CertificateException unused15) {
            mediaInterface = null;
            i = 0;
        } catch (Throwable th3) {
            th = th3;
            mediaInterface = null;
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new KeyStoreException("engineSetKeyEntry with protected key is not supported ");
    }
}
