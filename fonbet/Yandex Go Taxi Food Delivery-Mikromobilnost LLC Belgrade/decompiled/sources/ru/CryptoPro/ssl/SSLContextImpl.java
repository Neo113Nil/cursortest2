package ru.CryptoPro.ssl;

import defpackage.g8e;
import defpackage.htf0;
import defpackage.ny61;
import defpackage.oyr;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.CryptoPrimitive;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.PrivilegedExceptionAction;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
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
import ru.CryptoPro.JCP.KeyStore.StoreInputStream;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.ssl.util.ParamUtil;
import ru.CryptoPro.ssl.util.TLSSettings;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
public abstract class SSLContextImpl extends SSLContextSpi {
    public static final String DISABLE_DEFAULT_CONTEXT_SETTING = "disable_default_context";
    public static final boolean n = GetProperty.getBooleanProperty("disable_default_context", false);
    public final cl_32 a = new cl_32();
    public final SSLSessionContextImpl b = new SSLSessionContextImpl();
    public final SSLSessionContextImpl c = new SSLSessionContextImpl();
    public boolean d;
    public X509ExtendedKeyManager e;
    public X509TrustManager f;
    public SecureRandom g;
    public cl_83 h;
    public cl_83 i;
    public cl_83 j;
    public cl_14 k;
    public cl_14 l;
    public cl_14 m;

    abstract class AbstractSSLContext extends SSLContextImpl {
        public static final SSLParameters o;
        public static final SSLParameters p;

        static {
            SSLParameters sSLParameters = new SSLParameters();
            p = sSLParameters;
            synchronized (cl_39.class) {
            }
            cl_84 cl_84Var = cl_84.x;
            String str = cl_84Var.a;
            cl_84 cl_84Var2 = cl_84.y;
            String str2 = cl_84Var2.a;
            cl_84 cl_84Var3 = cl_84.z;
            sSLParameters.setProtocols(new String[]{str, str2, cl_84Var3.a});
            cl_84[] cl_84VarArr = {cl_84Var, cl_84Var2, cl_84Var3};
            SSLParameters sSLParameters2 = new SSLParameters();
            o = sSLParameters2;
            sSLParameters2.setProtocols((String[]) l(cl_84VarArr).toArray(new String[0]));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
        public static List l(cl_84[] cl_84VarArr) {
            ?? r0 = Collections.EMPTY_LIST;
            if (cl_84VarArr.length != 0) {
                r0 = new ArrayList(cl_84VarArr.length);
                for (cl_84 cl_84Var : cl_84VarArr) {
                    if (cl_84.E.contains(cl_84Var)) {
                        r0.add(cl_84Var.a);
                    }
                }
            }
            return r0;
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl
        public final SSLEngineImpl a() {
            return new SSLEngineImpl(this);
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl
        public final SSLEngineImpl b(int i, String str) {
            return new SSLEngineImpl(this, str, i);
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl
        public final SSLParameters g() {
            return o;
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl
        public final SSLParameters i() {
            return p;
        }
    }

    class CustomizedSSLContext extends AbstractSSLContext {
        public static final SSLParameters q;
        public static final IllegalArgumentException r;

        static {
            cl_84[] cl_84VarArr;
            String[] strArr;
            String str = (String) AccessController.doPrivileged(new htf0("jdk.tls.client.protocols", 6));
            if (str == null || str.length() == 0) {
                String str2 = cl_39.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
                synchronized (cl_39.class) {
                }
                cl_84VarArr = new cl_84[]{cl_84.x, cl_84.y, cl_84.z};
            } else {
                if (str.length() > 1 && str.charAt(0) == '\"' && g8e.a(1, str) == '\"') {
                    str = oyr.g(1, 1, str);
                }
                if (str.length() != 0) {
                    strArr = str.split(",");
                } else {
                    r = new IllegalArgumentException("No protocol specified in jdk.tls.client.protocols system property");
                    strArr = new String[0];
                }
                cl_84VarArr = new cl_84[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    String trim = strArr[i].trim();
                    strArr[i] = trim;
                    try {
                        cl_84VarArr[i] = cl_84.b(trim);
                    } catch (IllegalArgumentException e) {
                        r = new IllegalArgumentException(oyr.t(new StringBuilder("jdk.tls.client.protocols: "), strArr[i], " is not a standard SSL/TLS protocol name"), e);
                    }
                }
                if (r == null) {
                    String str3 = cl_39.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
                    synchronized (cl_39.class) {
                    }
                }
            }
            SSLParameters sSLParameters = new SSLParameters();
            q = sSLParameters;
            if (r == null) {
                sSLParameters.setProtocols((String[]) AbstractSSLContext.l(cl_84VarArr).toArray(new String[0]));
            }
        }

        public CustomizedSSLContext() {
            IllegalArgumentException illegalArgumentException = r;
            if (illegalArgumentException != null) {
                throw illegalArgumentException;
            }
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl
        public final SSLParameters h() {
            return q;
        }
    }

    public final class DefaultSSLContext extends CustomizedSSLContext {
        public static volatile DefaultSSLContext s;
        public static TrustManager[] t;
        public static KeyManager[] u;

        public DefaultSSLContext() throws Exception {
            TrustManager[] trustManagerArr;
            try {
                KeyManager[] m = m();
                synchronized (DefaultSSLContext.class) {
                    trustManagerArr = t;
                    if (trustManagerArr == null) {
                        KeyStore a = TrustManagerFactoryImpl.a();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init(a);
                        trustManagerArr = trustManagerFactory.getTrustManagers();
                        t = trustManagerArr;
                    }
                }
                super.engineInit(m, trustManagerArr, null);
                if (s == null) {
                    s = this;
                }
                SSLLogger.info("DefaultSSLContext initialized.");
            } catch (Exception e) {
                SSLLogger.warning("default context init failed: ", e);
                throw e;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00ce A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:9:0x0009, B:11:0x0043, B:14:0x004c, B:15:0x0053, B:16:0x0057, B:18:0x005e, B:20:0x0066, B:21:0x0073, B:23:0x0081, B:24:0x0087, B:26:0x008f, B:29:0x00ce, B:30:0x00d1, B:32:0x00ea, B:33:0x00ff, B:36:0x00ee, B:38:0x00f2, B:39:0x00fc, B:40:0x0096, B:42:0x009c, B:44:0x00a4, B:48:0x00af, B:50:0x00b5, B:52:0x00c0, B:53:0x00c9, B:54:0x00c5), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ea A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:9:0x0009, B:11:0x0043, B:14:0x004c, B:15:0x0053, B:16:0x0057, B:18:0x005e, B:20:0x0066, B:21:0x0073, B:23:0x0081, B:24:0x0087, B:26:0x008f, B:29:0x00ce, B:30:0x00d1, B:32:0x00ea, B:33:0x00ff, B:36:0x00ee, B:38:0x00f2, B:39:0x00fc, B:40:0x0096, B:42:0x009c, B:44:0x00a4, B:48:0x00af, B:50:0x00b5, B:52:0x00c0, B:53:0x00c9, B:54:0x00c5), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ee A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:9:0x0009, B:11:0x0043, B:14:0x004c, B:15:0x0053, B:16:0x0057, B:18:0x005e, B:20:0x0066, B:21:0x0073, B:23:0x0081, B:24:0x0087, B:26:0x008f, B:29:0x00ce, B:30:0x00d1, B:32:0x00ea, B:33:0x00ff, B:36:0x00ee, B:38:0x00f2, B:39:0x00fc, B:40:0x0096, B:42:0x009c, B:44:0x00a4, B:48:0x00af, B:50:0x00b5, B:52:0x00c0, B:53:0x00c9, B:54:0x00c5), top: B:3:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static synchronized KeyManager[] m() {
            KeyStore keyStore;
            synchronized (DefaultSSLContext.class) {
                try {
                    KeyManager[] keyManagerArr = u;
                    if (keyManagerArr != null) {
                        return keyManagerArr;
                    }
                    SSLLogger.fine("DefaultSSLContext getDefaultKeyManager().");
                    Map load = ParamUtil.load(cpSSLConfig.DEFAULT_PROVIDER);
                    final String str = (String) load.get("keyStore");
                    String str2 = (String) load.get("keyStoreType");
                    String str3 = (String) load.get("keyStoreProvider");
                    SSLLogger.info("keyStore is : ", str);
                    SSLLogger.info("keyStore type is : ", str2);
                    SSLLogger.info("keyStore provider is : ", str3);
                    if ("PKCS11".equals(str2) && !JCP.RAW_PREFIX.equals(str)) {
                        throw new IllegalArgumentException("if keyStoreType is PKCS11, then keyStore must be NONE");
                    }
                    InputStream inputStream = (str.length() == 0 || JCP.RAW_PREFIX.equals(str)) ? null : (InputStream) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.ssl.SSLContextImpl.DefaultSSLContext.1
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
                            str2 = "HDImageStore";
                            if (!cpSSLConfig.isJCP()) {
                                str2 = Platform.isWindows() ? JCSP.REG_STORE_NAME : "HDIMAGE";
                            }
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
                            } else if (SSLContextImpl.n) {
                                keyManagerFactory.init(new JavaTLSKeyStoreParameter(keyStore, charArray, true));
                            } else {
                                keyManagerFactory.init(keyStore, charArray);
                            }
                            KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
                            u = keyManagers;
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
                    u = keyManagers2;
                    return keyManagers2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl, javax.net.ssl.SSLContextSpi
        public final void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
            throw new KeyManagementException("Default SSLContext is initialized automatically");
        }
    }

    public final class TLS10Context extends AbstractSSLContext {
        public static final SSLParameters q;

        static {
            String str = cl_39.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
            synchronized (cl_39.class) {
            }
            cl_84[] cl_84VarArr = {cl_84.x};
            SSLParameters sSLParameters = new SSLParameters();
            q = sSLParameters;
            sSLParameters.setProtocols((String[]) AbstractSSLContext.l(cl_84VarArr).toArray(new String[0]));
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl
        public final SSLParameters h() {
            return q;
        }
    }

    public final class TLS11Context extends AbstractSSLContext {
        public static final SSLParameters q;

        static {
            String str = cl_39.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
            synchronized (cl_39.class) {
            }
            cl_84[] cl_84VarArr = {cl_84.x, cl_84.y};
            SSLParameters sSLParameters = new SSLParameters();
            q = sSLParameters;
            sSLParameters.setProtocols((String[]) AbstractSSLContext.l(cl_84VarArr).toArray(new String[0]));
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl
        public final SSLParameters h() {
            return q;
        }
    }

    public final class TLS12Context extends AbstractSSLContext {
        public static final SSLParameters q;

        static {
            String str = cl_39.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
            synchronized (cl_39.class) {
            }
            cl_84[] cl_84VarArr = {cl_84.x, cl_84.y, cl_84.z};
            SSLParameters sSLParameters = new SSLParameters();
            q = sSLParameters;
            sSLParameters.setProtocols((String[]) AbstractSSLContext.l(cl_84VarArr).toArray(new String[0]));
        }

        @Override // ru.CryptoPro.ssl.SSLContextImpl
        public final SSLParameters h() {
            return q;
        }
    }

    public final class TLSContext extends CustomizedSSLContext {
    }

    public SSLContextImpl() {
        SelfTester_Auxiliary.checkClass(SSLContextImpl.class);
    }

    public static cl_14 c(cl_83 cl_83Var, boolean z) {
        int i = z ? 300 : 1;
        Collection<cl_8> values = cl_8.G.values();
        TreeSet treeSet = new TreeSet();
        ArrayList arrayList = cl_83Var.a;
        cl_84 cl_84Var = cl_83Var.d;
        cl_84 cl_84Var2 = cl_83Var.c;
        if (!arrayList.isEmpty() && cl_84Var2.n != cl_84.b.n) {
            for (cl_8 cl_8Var : values) {
                boolean z2 = cl_8Var.B;
                int i2 = cl_8Var.D;
                int i3 = cl_8Var.C;
                if (z2 && cl_8Var.c >= i) {
                    if (!cl_8Var.f() || i3 <= cl_84Var2.n || i2 > cl_84Var.n) {
                        SSLLogger.fine(i3 <= cl_84Var2.n ? "Ignoring obsoleted cipher suite:" : i2 > cl_84Var.n ? "Ignoring unsupported cipher suite:" : "Ignoring unavailable cipher suite:", cl_8Var);
                    } else if (cl_90.f.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), cl_8Var.a, null)) {
                        treeSet.add(cl_8Var);
                    }
                }
            }
        }
        return new cl_14(treeSet);
    }

    public abstract SSLEngineImpl a();

    public abstract SSLEngineImpl b(int i, String str);

    public final cl_83 d(boolean z) {
        if (z) {
            if (this.h == null) {
                this.h = new cl_83(g().getProtocols());
            }
            return this.h;
        }
        if (this.i == null) {
            this.i = new cl_83(h().getProtocols());
        }
        return this.i;
    }

    public final boolean e(cl_83 cl_83Var) {
        return cl_83Var == this.h || cl_83Var == this.i;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLEngine engineCreateSSLEngine() {
        if (this.d) {
            return a();
        }
        ny61.r("SSLContextImpl is not initialized");
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLSessionContext engineGetClientSessionContext() {
        return this.b;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLSessionContext engineGetServerSessionContext() {
        return this.c;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLServerSocketFactory engineGetServerSocketFactory() {
        if (this.d) {
            return new SSLServerSocketFactoryImpl(this);
        }
        ny61.r("SSLContext is not initialized");
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLSocketFactory engineGetSocketFactory() {
        if (!this.d) {
            ny61.r("SSLContextImpl is not initialized");
            return null;
        }
        SSLSocketFactoryImpl sSLSocketFactoryImpl = new SSLSocketFactoryImpl();
        sSLSocketFactoryImpl.a = this;
        return sSLSocketFactoryImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[LOOP:1: B:22:0x0048->B:27:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // javax.net.ssl.SSLContextSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        X509ExtendedKeyManager x509ExtendedKeyManager;
        X509TrustManager x509TrustManager;
        SSLLogger.info("SSLContextImpl init.");
        this.d = false;
        for (int i = 0; keyManagerArr != null && i < keyManagerArr.length; i++) {
            KeyManager keyManager = keyManagerArr[i];
            if (keyManager instanceof X509KeyManager) {
                String str = cl_39.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
                synchronized (cl_39.class) {
                }
                if (keyManager instanceof X509ExtendedKeyManager) {
                    x509ExtendedKeyManager = (X509ExtendedKeyManager) keyManager;
                } else {
                    SSLLogger.fine("X509KeyManager passed to SSLContext.init(): need an X509ExtendedKeyManager for SSLEngine use");
                    x509ExtendedKeyManager = new cl_1((X509KeyManager) keyManager);
                }
                this.e = x509ExtendedKeyManager;
                if (trustManagerArr == null) {
                    try {
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        trustManagerArr = trustManagerFactory.getTrustManagers();
                    } catch (Exception unused) {
                    }
                }
                for (int i2 = 0; trustManagerArr != null && i2 < trustManagerArr.length; i2++) {
                    if (!(trustManagerArr[i2] instanceof X509TrustManager)) {
                        String str2 = cl_39.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
                        synchronized (cl_39.class) {
                        }
                        TrustManager trustManager = trustManagerArr[i2];
                        x509TrustManager = trustManager instanceof X509ExtendedTrustManager ? (X509TrustManager) trustManager : new cl_2((X509TrustManager) trustManagerArr[i2]);
                        this.f = x509TrustManager;
                        this.g = cl_73.h();
                        SSLLogger.info("trigger seeding of SecureRandom");
                        this.g.nextInt();
                        SSLLogger.info("done seeding SecureRandom");
                        if (TLSSettings.getDefaultEnableRevocation() && TLSSettings.getTlsProhibitDisabledValidation()) {
                            throw new KeyManagementException("Certificate validation is disabled but required. The check can be turned off using -Dtls_prohibit_disabled_validation=false or SetPrefs (see the programmer's guide) or TLSSettings.");
                        }
                        SSLLogger.info("SSLContextImpl initialized.");
                        this.d = true;
                    }
                }
                x509TrustManager = cl_23.a;
                this.f = x509TrustManager;
                this.g = cl_73.h();
                SSLLogger.info("trigger seeding of SecureRandom");
                this.g.nextInt();
                SSLLogger.info("done seeding SecureRandom");
                if (TLSSettings.getDefaultEnableRevocation()) {
                }
                SSLLogger.info("SSLContextImpl initialized.");
                this.d = true;
            }
        }
        x509ExtendedKeyManager = cl_22.a;
        this.e = x509ExtendedKeyManager;
        if (trustManagerArr == null) {
        }
        while (trustManagerArr != null) {
            if (!(trustManagerArr[i2] instanceof X509TrustManager)) {
            }
        }
        x509TrustManager = cl_23.a;
        this.f = x509TrustManager;
        this.g = cl_73.h();
        SSLLogger.info("trigger seeding of SecureRandom");
        this.g.nextInt();
        SSLLogger.info("done seeding SecureRandom");
        if (TLSSettings.getDefaultEnableRevocation()) {
        }
        SSLLogger.info("SSLContextImpl initialized.");
        this.d = true;
    }

    public final cl_14 f(boolean z) {
        cl_14 cl_14Var;
        synchronized (this) {
            try {
                this.m = null;
                this.k = null;
                this.l = null;
                HashMap hashMap = cl_9.l;
                synchronized (cl_9.class) {
                    cl_9.l.clear();
                }
                boolean z2 = cl_73.a;
                synchronized (cl_73.class) {
                }
                if (z) {
                    if (this.k == null) {
                        this.k = c(d(true), true);
                    }
                    cl_14Var = this.k;
                } else {
                    if (this.l == null) {
                        this.l = c(d(false), true);
                    }
                    cl_14Var = this.l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cl_14Var;
    }

    public abstract SSLParameters g();

    public abstract SSLParameters h();

    public abstract SSLParameters i();

    public final cl_83 j() {
        if (this.j == null) {
            this.j = new cl_83(i().getProtocols());
        }
        return this.j;
    }

    public final cl_14 k() {
        cl_14 cl_14Var;
        synchronized (this) {
            try {
                this.m = null;
                this.k = null;
                this.l = null;
                HashMap hashMap = cl_9.l;
                synchronized (cl_9.class) {
                    cl_9.l.clear();
                }
                boolean z = cl_73.a;
                synchronized (cl_73.class) {
                }
                if (this.m == null) {
                    this.m = c(j(), false);
                }
                cl_14Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cl_14Var;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLEngine engineCreateSSLEngine(String str, int i) {
        if (this.d) {
            return b(i, str);
        }
        ny61.r("SSLContextImpl is not initialized");
        return null;
    }
}
