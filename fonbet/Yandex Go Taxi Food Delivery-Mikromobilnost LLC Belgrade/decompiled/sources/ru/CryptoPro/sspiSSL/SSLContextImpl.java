package ru.CryptoPro.sspiSSL;

import defpackage.a441;
import defpackage.au61;
import defpackage.es61;
import defpackage.fs61;
import defpackage.g8e;
import defpackage.mu61;
import defpackage.ny61;
import defpackage.or61;
import defpackage.oyr;
import defpackage.puu0;
import defpackage.pw61;
import defpackage.s421;
import defpackage.tq61;
import defpackage.wv61;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.CryptoPrimitive;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PrivilegedExceptionAction;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.KeyStore.StoreInputStream;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.MSCAPI.Sspi;
import ru.CryptoPro.ssl.JavaTLSKeyStoreParameter;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.util.ParamUtil;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
public abstract class SSLContextImpl extends SSLContextSpi {
    public static final String DISABLE_DEFAULT_CONTEXT_SETTING = "disable_default_context";
    public static final boolean r = GetProperty.getBooleanProperty("disable_default_context", false);
    public boolean c;
    public s421 d;
    public s421 e;
    public s421 f;
    public a441 g;
    public a441 h;
    public a441 i;
    public X509ExtendedKeyManager l;
    public X509TrustManager m;
    public boolean n;
    public s421 j = null;
    public a441 k = null;
    public final long[] o = new long[2];
    public PrivateKey p = null;
    public X509Certificate[] q = null;
    public final SSLSessionContextImpl a = new SSLSessionContextImpl();
    public final SSLSessionContextImpl b = new SSLSessionContextImpl();

    abstract class AbstractSSLContext extends SSLContextImpl {
        public static final SSLParameters s;
        public static final SSLParameters t;

        static {
            SSLParameters sSLParameters = new SSLParameters();
            t = sSLParameters;
            or61 or61Var = or61.z;
            String str = or61Var.c;
            or61 or61Var2 = or61.A;
            String str2 = or61Var2.c;
            or61 or61Var3 = or61.B;
            String str3 = or61Var3.c;
            or61 or61Var4 = or61.C;
            sSLParameters.setProtocols(new String[]{str, str2, str3, or61Var4.c});
            or61[] or61VarArr = {or61Var, or61Var2, or61Var3, or61Var4};
            SSLParameters sSLParameters2 = new SSLParameters();
            s = sSLParameters2;
            sSLParameters2.setProtocols((String[]) k(or61VarArr).toArray(new String[0]));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
        public static List k(or61[] or61VarArr) {
            ?? r0 = Collections.EMPTY_LIST;
            if (or61VarArr.length != 0) {
                r0 = new ArrayList(or61VarArr.length);
                for (or61 or61Var : or61VarArr) {
                    if (or61.G.contains(or61Var)) {
                        r0.add(or61Var.c);
                    }
                }
            }
            return r0;
        }

        @Override // ru.CryptoPro.sspiSSL.SSLContextImpl
        public final SSLParameters f() {
            return s;
        }

        @Override // ru.CryptoPro.sspiSSL.SSLContextImpl
        public final SSLParameters h() {
            return t;
        }
    }

    class CustomizedSSLContext extends AbstractSSLContext {
        public static final SSLParameters u;
        public static final IllegalArgumentException v;

        static {
            or61[] or61VarArr;
            String[] strArr;
            String str = (String) AccessController.doPrivileged(new puu0(6));
            if (str == null || str.length() == 0) {
                or61VarArr = new or61[]{or61.z, or61.A, or61.B, or61.C};
            } else {
                if (str.length() > 1 && str.charAt(0) == '\"' && g8e.a(1, str) == '\"') {
                    str = oyr.g(1, 1, str);
                }
                if (str.length() != 0) {
                    strArr = str.split(",");
                } else {
                    v = new IllegalArgumentException("No protocol specified in jdk.tls.client.protocols system property");
                    strArr = new String[0];
                }
                or61VarArr = new or61[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    String trim = strArr[i].trim();
                    strArr[i] = trim;
                    try {
                        or61VarArr[i] = or61.b(trim);
                    } catch (IllegalArgumentException e) {
                        v = new IllegalArgumentException(oyr.t(new StringBuilder("jdk.tls.client.protocols: "), strArr[i], " is not a standard SSL/TLS protocol name"), e);
                    }
                }
            }
            SSLParameters sSLParameters = new SSLParameters();
            u = sSLParameters;
            if (v == null) {
                sSLParameters.setProtocols((String[]) AbstractSSLContext.k(or61VarArr).toArray(new String[0]));
            }
        }

        public CustomizedSSLContext() {
            IllegalArgumentException illegalArgumentException = v;
            if (illegalArgumentException != null) {
                throw illegalArgumentException;
            }
        }

        @Override // ru.CryptoPro.sspiSSL.SSLContextImpl
        public final SSLParameters g() {
            return u;
        }
    }

    public final class DefaultSSLContext extends CustomizedSSLContext {
        public static volatile DefaultSSLContext w;
        public static TrustManager[] x;
        public static KeyManager[] y;

        public DefaultSSLContext() throws Exception {
            TrustManager[] trustManagerArr;
            try {
                KeyManager[] l = l();
                synchronized (DefaultSSLContext.class) {
                    trustManagerArr = x;
                    if (trustManagerArr == null) {
                        KeyStore b = TrustManagerFactoryImpl.b();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init(b);
                        trustManagerArr = trustManagerFactory.getTrustManagers();
                        x = trustManagerArr;
                    }
                }
                super.engineInit(l, trustManagerArr, null);
                if (w == null) {
                    w = this;
                }
                SSLLogger.info("DefaultSSLContext initialized.");
            } catch (Exception e) {
                SSLLogger.warning("default context init failed: ", e);
                throw e;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00c6 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:9:0x0009, B:11:0x0043, B:14:0x004c, B:15:0x0053, B:16:0x0057, B:18:0x005e, B:20:0x0066, B:21:0x0073, B:23:0x0081, B:24:0x0087, B:26:0x008f, B:29:0x00c6, B:30:0x00c9, B:32:0x00e2, B:33:0x00f7, B:36:0x00e6, B:38:0x00ea, B:39:0x00f4, B:40:0x0096, B:42:0x009c, B:46:0x00a7, B:48:0x00ad, B:50:0x00b8, B:51:0x00c1, B:52:0x00bd), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e2 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:9:0x0009, B:11:0x0043, B:14:0x004c, B:15:0x0053, B:16:0x0057, B:18:0x005e, B:20:0x0066, B:21:0x0073, B:23:0x0081, B:24:0x0087, B:26:0x008f, B:29:0x00c6, B:30:0x00c9, B:32:0x00e2, B:33:0x00f7, B:36:0x00e6, B:38:0x00ea, B:39:0x00f4, B:40:0x0096, B:42:0x009c, B:46:0x00a7, B:48:0x00ad, B:50:0x00b8, B:51:0x00c1, B:52:0x00bd), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:9:0x0009, B:11:0x0043, B:14:0x004c, B:15:0x0053, B:16:0x0057, B:18:0x005e, B:20:0x0066, B:21:0x0073, B:23:0x0081, B:24:0x0087, B:26:0x008f, B:29:0x00c6, B:30:0x00c9, B:32:0x00e2, B:33:0x00f7, B:36:0x00e6, B:38:0x00ea, B:39:0x00f4, B:40:0x0096, B:42:0x009c, B:46:0x00a7, B:48:0x00ad, B:50:0x00b8, B:51:0x00c1, B:52:0x00bd), top: B:3:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static synchronized KeyManager[] l() {
            KeyStore keyStore;
            synchronized (DefaultSSLContext.class) {
                try {
                    KeyManager[] keyManagerArr = y;
                    if (keyManagerArr != null) {
                        return keyManagerArr;
                    }
                    SSLLogger.fine("DefaultSSLContext getDefaultKeyManager().");
                    Map load = ParamUtil.load("JCSP");
                    final String str = (String) load.get("keyStore");
                    String str2 = (String) load.get("keyStoreType");
                    String str3 = (String) load.get("keyStoreProvider");
                    SSLLogger.info("keyStore is : ", str);
                    SSLLogger.info("keyStore type is : ", str2);
                    SSLLogger.info("keyStore provider is : ", str3);
                    if ("PKCS11".equals(str2) && !JCP.RAW_PREFIX.equals(str)) {
                        throw new IllegalArgumentException("if keyStoreType is PKCS11, then keyStore must be NONE");
                    }
                    InputStream inputStream = (str.length() == 0 || JCP.RAW_PREFIX.equals(str)) ? null : (InputStream) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.sspiSSL.SSLContextImpl.DefaultSSLContext.1
                        @Override // java.security.PrivilegedExceptionAction
                        public InputStream run() throws Exception {
                            String str4 = str;
                            if (!new File(str4).exists()) {
                                return new StoreInputStream(str4);
                            }
                            try {
                                return new FileInputStream(str4);
                            } catch (FileNotFoundException unused) {
                                return null;
                            }
                        }
                    });
                    String str4 = (String) load.get("keyStorePasswd");
                    char[] charArray = str4.length() != 0 ? str4.toCharArray() : null;
                    if (JCP.RAW_PREFIX.equals(str2)) {
                        SSLLogger.info("NO STORE");
                    } else {
                        if (str2.length() == 0) {
                            str2 = Platform.isWindows() ? JCSP.REG_STORE_NAME : "HDIMAGE";
                        }
                        if (str2.length() != 0) {
                            SSLLogger.info("init keystore");
                            keyStore = str3.length() == 0 ? KeyStore.getInstance(str2) : KeyStore.getInstance(str2, str3);
                            keyStore.load(inputStream, charArray);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            SSLLogger.info("init keymanager of type", KeyManagerFactory.getDefaultAlgorithm());
                            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                            if (!"PKCS11".equals(str2)) {
                                keyManagerFactory.init(keyStore, null);
                            } else if (SSLContextImpl.r) {
                                keyManagerFactory.init(new JavaTLSKeyStoreParameter(keyStore, charArray, true));
                            } else {
                                keyManagerFactory.init(keyStore, charArray);
                            }
                            KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
                            y = keyManagers;
                            return keyManagers;
                        }
                    }
                    keyStore = null;
                    if (inputStream != null) {
                    }
                    SSLLogger.info("init keymanager of type", KeyManagerFactory.getDefaultAlgorithm());
                    KeyManagerFactory keyManagerFactory2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                    if (!"PKCS11".equals(str2)) {
                    }
                    KeyManager[] keyManagers2 = keyManagerFactory2.getKeyManagers();
                    y = keyManagers2;
                    return keyManagers2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.CryptoPro.sspiSSL.SSLContextImpl, javax.net.ssl.SSLContextSpi
        public final void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
            throw new KeyManagementException("Default SSLContext is initialized automatically");
        }
    }

    public final class TLS10Context extends AbstractSSLContext {
        public static final SSLParameters u;

        static {
            or61[] or61VarArr = {or61.z};
            SSLParameters sSLParameters = new SSLParameters();
            u = sSLParameters;
            sSLParameters.setProtocols((String[]) AbstractSSLContext.k(or61VarArr).toArray(new String[0]));
        }

        @Override // ru.CryptoPro.sspiSSL.SSLContextImpl
        public final SSLParameters g() {
            return u;
        }
    }

    public final class TLS11Context extends AbstractSSLContext {
        public static final SSLParameters u;

        static {
            or61[] or61VarArr = {or61.z, or61.A};
            SSLParameters sSLParameters = new SSLParameters();
            u = sSLParameters;
            sSLParameters.setProtocols((String[]) AbstractSSLContext.k(or61VarArr).toArray(new String[0]));
        }

        @Override // ru.CryptoPro.sspiSSL.SSLContextImpl
        public final SSLParameters g() {
            return u;
        }
    }

    public final class TLS12Context extends AbstractSSLContext {
        public static final SSLParameters u;

        static {
            or61[] or61VarArr = {or61.z, or61.A, or61.B};
            SSLParameters sSLParameters = new SSLParameters();
            u = sSLParameters;
            sSLParameters.setProtocols((String[]) AbstractSSLContext.k(or61VarArr).toArray(new String[0]));
        }

        @Override // ru.CryptoPro.sspiSSL.SSLContextImpl
        public final SSLParameters g() {
            return u;
        }
    }

    public final class TLS13Context extends AbstractSSLContext {
        public static final SSLParameters u;

        static {
            or61[] or61VarArr = {or61.z, or61.A, or61.B, or61.C};
            SSLParameters sSLParameters = new SSLParameters();
            u = sSLParameters;
            sSLParameters.setProtocols((String[]) AbstractSSLContext.k(or61VarArr).toArray(new String[0]));
        }

        @Override // ru.CryptoPro.sspiSSL.SSLContextImpl
        public final SSLParameters g() {
            return u;
        }
    }

    public final class TLSContext extends CustomizedSSLContext {
    }

    public SSLContextImpl() {
        SelfTester_Auxiliary.checkClass(SSLContextImpl.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r4 = "Ignoring obsoleted cipher suite:";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a441 b(s421 s421Var, boolean z) {
        int i = z ? 300 : 1;
        Collection<mu61> values = mu61.B.values();
        TreeSet treeSet = new TreeSet();
        ArrayList arrayList = (ArrayList) s421Var.b;
        or61 or61Var = (or61) s421Var.x;
        or61 or61Var2 = (or61) s421Var.w;
        if (!arrayList.isEmpty()) {
            int i2 = or61Var2.a;
            int i3 = or61Var2.a;
            if (i2 != or61.w.a) {
                for (mu61 mu61Var : values) {
                    boolean z2 = mu61Var.x;
                    int i4 = mu61Var.z;
                    int i5 = mu61Var.y;
                    if (z2 && mu61Var.w >= i) {
                        if (!z2 || i5 <= i3 || i4 > or61Var.a) {
                            String str = i4 > or61Var.a ? "Ignoring unsupported cipher suite:" : "Ignoring unavailable cipher suite:";
                            SSLLogger.fine(str, mu61Var);
                        } else if (es61.f.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), mu61Var.a, null)) {
                            treeSet.add(mu61Var);
                        }
                    }
                }
            }
        }
        return new a441(treeSet);
    }

    public final s421 a(boolean z) {
        if (z) {
            if (this.d == null) {
                this.d = new s421(f().getProtocols());
            }
            return this.d;
        }
        if (this.e == null) {
            this.e = new s421(g().getProtocols());
        }
        return this.e;
    }

    public final void c() {
        boolean z;
        if (!this.c) {
            throw new SSLException("SSLContextImpl is not initialized");
        }
        SSLLogger.fine("Create new server credentials.");
        if (this.k == null) {
            this.k = d(true);
        }
        if (this.j == null) {
            this.j = a(true);
        }
        or61 or61Var = (or61) this.j.x;
        int[] iArr = new int[((AbstractCollection) this.k.b).size()];
        X509ExtendedKeyManager x509ExtendedKeyManager = this.l;
        Iterator it = ((AbstractCollection) this.k.b).iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((mu61) it.next()).c;
            i++;
        }
        try {
            String[] serverAliases = x509ExtendedKeyManager.getServerAliases(JCP.GOST_EL_DEGREE_NAME, null);
            if (serverAliases == null) {
                throw new SSLException("Server container not found.");
            }
            int length = serverAliases.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str = serverAliases[i2];
                SSLLogger.fine("Checking private key: " + str);
                X509Certificate[] certificateChain = x509ExtendedKeyManager.getCertificateChain(str);
                if (certificateChain != null && certificateChain.length != 0) {
                    SSLLogger.fine("Certificate chain " + str + " found.");
                    PrivateKey privateKey = x509ExtendedKeyManager.getPrivateKey(str);
                    if (privateKey != null) {
                        SSLLogger.fine("Private key " + str + " is available.");
                        this.p = privateKey;
                        this.q = certificateChain;
                        SSLLogger.fine("%% Chosen server alias: " + str);
                        break;
                    }
                }
                i2++;
            }
            PrivateKey privateKey2 = this.p;
            if (privateKey2 == null || this.q == null) {
                throw new SSLException("Server container not found.");
            }
            PrivateKeyInterface extractSpec = InternalGostPrivateKey.extractSpec(privateKey2);
            if (!(extractSpec instanceof AbstractKeySpec)) {
                throw new InvalidKeyException("Invalid key");
            }
            long handle = ((AbstractKeySpec) extractSpec).getKey().getProvHandle().getHandle();
            int keyType = ((AbstractKeySpec) extractSpec).getKeyType();
            ArrayList arrayList = new ArrayList();
            for (X509Certificate x509Certificate : this.q) {
                arrayList.add(x509Certificate.getEncoded());
            }
            X509TrustManager x509TrustManager = this.m;
            ArrayList arrayList2 = new ArrayList();
            if (x509TrustManager instanceof au61) {
                boolean equalsIgnoreCase = ((au61) x509TrustManager).a.equalsIgnoreCase("LIBSSPI");
                for (X509Certificate x509Certificate2 : ((au61) x509TrustManager).getAcceptedIssuers()) {
                    arrayList2.add(x509Certificate2.getEncoded());
                }
                z = equalsIgnoreCase;
            } else {
                z = false;
            }
            Sspi.acquireCredentialsHandle(this.o, false, SSLEngineImpl.b(or61Var), iArr, arrayList, handle, keyType, z, arrayList2);
            SSLLogger.fine("Acquire server credentials done");
        } catch (Exception e) {
            throw new SSLException(e);
        }
    }

    public final a441 d(boolean z) {
        a441 a441Var;
        synchronized (this) {
            try {
                this.i = null;
                this.g = null;
                this.h = null;
                if (z) {
                    this.g = b(a(true), true);
                    a441Var = this.g;
                } else {
                    this.h = b(a(false), true);
                    a441Var = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a441Var;
    }

    public final synchronized long[] e() {
        try {
            if (Sspi.isNullHandle(this.o)) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.o;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLEngine engineCreateSSLEngine(String str, int i) {
        if (!this.c) {
            ny61.r("SSLContextImpl is not initialized");
            return null;
        }
        SSLEngineImpl sSLEngineImpl = new SSLEngineImpl(this, str, i);
        sSLEngineImpl.setNeedClientAuth(this.n);
        return sSLEngineImpl;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLSessionContext engineGetClientSessionContext() {
        return this.a;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLSessionContext engineGetServerSessionContext() {
        return this.b;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLServerSocketFactory engineGetServerSocketFactory() {
        if (this.c) {
            return new SSLServerSocketFactoryImpl(this);
        }
        ny61.r("SSLContextImpl is not initialized");
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLSocketFactory engineGetSocketFactory() {
        if (this.c) {
            return new SSLSocketFactoryImpl(this);
        }
        ny61.r("SSLContextImpl is not initialized");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[LOOP:1: B:19:0x0042->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    @Override // javax.net.ssl.SSLContextSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        X509ExtendedKeyManager x509ExtendedKeyManager;
        X509TrustManager x509TrustManager;
        TrustManager trustManager;
        SSLLogger.info("SSLContextImpl init.");
        this.c = false;
        try {
            for (int i = 0; keyManagerArr != null && i < keyManagerArr.length; i++) {
                KeyManager keyManager = keyManagerArr[i];
                if (keyManager instanceof X509KeyManager) {
                    if (keyManager instanceof X509ExtendedKeyManager) {
                        x509ExtendedKeyManager = (X509ExtendedKeyManager) keyManager;
                    } else {
                        SSLLogger.fine("X509KeyManager passed to SSLContext.init(): need an X509ExtendedKeyManager for SSLEngine use");
                        x509ExtendedKeyManager = new tq61((X509KeyManager) keyManager);
                    }
                    this.l = x509ExtendedKeyManager;
                    if (trustManagerArr == null) {
                        try {
                            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                            trustManagerFactory.init((KeyStore) null);
                            trustManagerArr = trustManagerFactory.getTrustManagers();
                        } catch (Exception unused) {
                        }
                    }
                    for (int i2 = 0; trustManagerArr != null && i2 < trustManagerArr.length; i2++) {
                        trustManager = trustManagerArr[i2];
                        if (!(trustManager instanceof X509TrustManager)) {
                            x509TrustManager = trustManager instanceof X509ExtendedTrustManager ? (X509TrustManager) trustManager : new fs61((X509TrustManager) trustManagerArr[i2]);
                            this.m = x509TrustManager;
                            String str = SSPISSL.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
                            SecureRandom secureRandom2 = SecureRandom.getInstance(JCP.CP_RANDOM, "JCSP");
                            SSLLogger.info("trigger seeding of SecureRandom");
                            secureRandom2.nextInt();
                            SSLLogger.info("done seeding SecureRandom");
                            if (TLSSettings.getDefaultEnableRevocation() && TLSSettings.getTlsProhibitDisabledValidation()) {
                                throw new KeyManagementException("Certificate validation is disabled but required. The check can be turned off using -Dtls_prohibit_disabled_validation=false or SetPrefs (see the programmer's guide) or TLSSettings.");
                            }
                            SSLLogger.info("SSLContextImpl initialized.");
                            this.c = true;
                            return;
                        }
                    }
                    x509TrustManager = pw61.a;
                    this.m = x509TrustManager;
                    String str2 = SSPISSL.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
                    SecureRandom secureRandom22 = SecureRandom.getInstance(JCP.CP_RANDOM, "JCSP");
                    SSLLogger.info("trigger seeding of SecureRandom");
                    secureRandom22.nextInt();
                    SSLLogger.info("done seeding SecureRandom");
                    if (TLSSettings.getDefaultEnableRevocation()) {
                    }
                    SSLLogger.info("SSLContextImpl initialized.");
                    this.c = true;
                    return;
                }
            }
            SecureRandom secureRandom222 = SecureRandom.getInstance(JCP.CP_RANDOM, "JCSP");
            SSLLogger.info("trigger seeding of SecureRandom");
            secureRandom222.nextInt();
            SSLLogger.info("done seeding SecureRandom");
            if (TLSSettings.getDefaultEnableRevocation()) {
            }
            SSLLogger.info("SSLContextImpl initialized.");
            this.c = true;
            return;
        } catch (Exception e) {
            throw new KeyManagementException(e);
        }
        x509ExtendedKeyManager = wv61.a;
        this.l = x509ExtendedKeyManager;
        if (trustManagerArr == null) {
        }
        while (trustManagerArr != null) {
            trustManager = trustManagerArr[i2];
            if (!(trustManager instanceof X509TrustManager)) {
            }
        }
        x509TrustManager = pw61.a;
        this.m = x509TrustManager;
        String str22 = SSPISSL.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
    }

    public abstract SSLParameters f();

    public abstract SSLParameters g();

    public synchronized String[] getEnabledCipherSuites() {
        return this.k.v();
    }

    public String[] getEnabledProtocols() {
        return this.j.p();
    }

    public X509Certificate[] getLocalCerts() {
        return this.q;
    }

    public PrivateKey getLocalPrivateKey() {
        return this.p;
    }

    public abstract SSLParameters h();

    public final s421 i() {
        if (this.f == null) {
            this.f = new s421(h().getProtocols());
        }
        return this.f;
    }

    public final a441 j() {
        a441 a441Var;
        synchronized (this) {
            this.i = null;
            this.g = null;
            this.h = null;
            this.i = b(i(), false);
            a441Var = this.i;
        }
        return a441Var;
    }

    public synchronized void setEnabledCipherSuites(String[] strArr) {
        this.k = new a441(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.j = new s421(strArr);
    }

    public void setNeedClientAuth(boolean z) {
        this.n = z;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLEngine engineCreateSSLEngine() {
        if (this.c) {
            return new SSLEngineImpl(this, false);
        }
        ny61.r("SSLContextImpl is not initialized");
        return null;
    }
}
