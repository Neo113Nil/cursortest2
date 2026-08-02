package ru.CryptoPro.ssl;

import defpackage.dy31;
import defpackage.kbs;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.rq61;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.security.AccessControlContext;
import java.security.AlgorithmConstraints;
import java.security.CryptoPrimitive;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiFunction;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.MasterSecretInterface;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.spec.GostMasterSpec;
import ru.CryptoPro.JCSP.Key.MasterKeySpec;
import ru.CryptoPro.ssl.util.TLSSettings;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
abstract class cl_63 {
    public static final boolean a0;
    public static final boolean b0;
    public static final boolean c0;
    public static final boolean d0;
    public static final boolean e0;
    public static final boolean f0;
    public static final boolean g0;
    public cl_46 A;
    public cl_62 B;
    public int C;
    public SSLContextImpl D;
    public cl_87 E;
    public cl_87 F;
    public SSLSessionImpl G;
    public cl_8 H;
    public cl_11 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public SecretKey N;
    public SecretKey O;
    public IvParameterSpec P;
    public IvParameterSpec Q;
    public SecretKey R;
    public SecretKey S;
    public volatile boolean T;
    public volatile cl_65 U;
    public volatile Exception V;
    public final Object W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public cl_84 a;
    public cl_84 b;
    public boolean c;
    public byte[] d;
    public byte[] e;
    public boolean f;
    public cl_83 g;
    public cl_14 h;
    public AlgorithmConstraints i = null;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public cl_83 n;
    public cl_14 o;
    public List p;
    public Collection q;
    public String[] r;
    public String s;
    public BiFunction t;
    public BiFunction u;
    public boolean v;
    public boolean w;
    public final SSLSocketImpl x;
    public final SSLEngineImpl y;
    public cl_45 z;

    static {
        boolean z = TLSSettings.getDefaultRiSupportRequired() == 0;
        boolean z2 = TLSSettings.getDefaultRiSupportRequired() == 0 || TLSSettings.getDefaultRiSupportRequired() == 1;
        a0 = GetProperty.getBooleanProperty("ru.CryptoPro.ssl.allowUnsafeRenegotiation", z);
        b0 = GetProperty.getBooleanProperty("ru.CryptoPro.ssl.allowLegacyHelloMessages", z2);
        c0 = GetProperty.getBooleanProperty("jdk.tls.rejectClientInitiatedRenegotiation", false);
        f0 = GetProperty.getBooleanProperty("ru.CryptoPro.ssl.allowLegacyResumption", true);
        g0 = GetProperty.getBooleanProperty("ru.CryptoPro.ssl.allowLegacyMasterSecret", true);
        d0 = GetProperty.getBooleanProperty("ru.CryptoPro.ssl.useExtendedMasterSecret", true);
        e0 = GetProperty.getBooleanProperty("ru.CryptoPro.ssl.useSessionTicket", true);
    }

    public cl_63(SSLEngineImpl sSLEngineImpl, SSLContextImpl sSLContextImpl, cl_83 cl_83Var, boolean z, boolean z2, cl_84 cl_84Var, boolean z3, boolean z4, byte[] bArr, byte[] bArr2) {
        List list = Collections.EMPTY_LIST;
        this.p = list;
        this.q = list;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.x = null;
        this.y = null;
        this.M = false;
        this.T = false;
        this.U = null;
        this.V = null;
        this.W = new Object();
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.y = sSLEngineImpl;
        j(sSLContextImpl, cl_83Var, z, z2, cl_84Var, z3, z4, bArr, bArr2);
    }

    public static void g(String str, GeneralSecurityException generalSecurityException) {
        SSLException sSLException = new SSLException(str);
        sSLException.initCause(generalSecurityException);
        throw sSLException;
    }

    public final cl_14 A() {
        if (this.o == null) {
            if (this.n == null) {
                this.n = B();
            }
            ArrayList arrayList = new ArrayList();
            if (!this.n.a.isEmpty() && this.n.c.n != cl_84.b.n) {
                for (cl_8 cl_8Var : this.h.a) {
                    int i = cl_8Var.C;
                    cl_83 cl_83Var = this.n;
                    int i2 = cl_83Var.c.n;
                    if (i <= i2 || cl_8Var.D > cl_83Var.d.n) {
                        SSLLogger.fine(i <= i2 ? "Ignoring obsoleted cipher suite: " : "Ignoring unsupported cipher suite: ", cl_8Var);
                    } else if (this.i.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), cl_8Var.a, null)) {
                        arrayList.add(cl_8Var);
                    }
                }
            }
            this.o = new cl_14(arrayList);
        }
        return this.o;
    }

    public final cl_83 B() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.n == null) {
            ArrayList arrayList = new ArrayList(4);
            Iterator it = this.g.a.iterator();
            while (it.hasNext()) {
                cl_84 cl_84Var = (cl_84) it.next();
                AlgorithmConstraints algorithmConstraints = this.i;
                CryptoPrimitive cryptoPrimitive = CryptoPrimitive.KEY_AGREEMENT;
                if (!algorithmConstraints.permits(EnumSet.of(cryptoPrimitive), cl_84Var.a, null)) {
                    sb = new StringBuilder("Ignoring disabled protocol: ");
                } else if (cl_84Var.n != cl_84.c.n) {
                    if (this.i.permits(EnumSet.of(cryptoPrimitive), cl_84Var.a, null)) {
                        for (cl_8 cl_8Var : this.h.a) {
                            if (cl_8Var.f()) {
                                int i = cl_8Var.C;
                                int i2 = cl_84Var.n;
                                if (i > i2 && cl_8Var.D <= i2) {
                                    if (this.i.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), cl_8Var.a, null)) {
                                        arrayList.add(cl_84Var);
                                        break;
                                    }
                                    sb2 = new StringBuilder("Ignoring disabled cipher suite: ");
                                    sb2.append(cl_8Var);
                                    sb2.append(" for ");
                                    sb2.append(cl_84Var);
                                    SSLLogger.fine(sb2.toString());
                                }
                            }
                            sb2 = new StringBuilder("Ignoring unsupported cipher suite: ");
                            sb2.append(cl_8Var);
                            sb2.append(" for ");
                            sb2.append(cl_84Var);
                            SSLLogger.fine(sb2.toString());
                        }
                        sb = new StringBuilder("No available cipher suite for ");
                    } else {
                        sb = new StringBuilder("Ignoring disabled protocol: ");
                    }
                }
                sb.append(cl_84Var);
                SSLLogger.fine(sb.toString());
            }
            this.n = new cl_83(arrayList);
        }
        return this.n;
    }

    public final void C() {
        while (this.A.available() >= 4) {
            this.A.mark(4);
            byte c = (byte) this.A.c();
            int i = cl_47.a;
            if (c != 0 && c != 1 && c != 2 && c != 11 && c != 12 && c != 13 && c != 14 && c != 15 && c != 16 && c != 4 && c != 20) {
                throw new SSLProtocolException(oyr.i(c, "Received unsupported or unknown handshake message: "));
            }
            int k = this.A.k();
            int available = this.A.available();
            cl_46 cl_46Var = this.A;
            if (available < k) {
                cl_46Var.reset();
                return;
            }
            if (c == 0) {
                cl_46Var.reset();
                e(c, k);
                this.A.a.d(k + 4);
            } else {
                cl_46Var.mark(k);
                e(c, k);
                this.A.a();
            }
        }
    }

    public final boolean D() {
        return this.C >= -1;
    }

    public final boolean E() {
        return this.C >= 0;
    }

    public final void F() {
        if (this.C >= 0) {
            return;
        }
        cl_47 b = b();
        b.f();
        b.c(this.B);
        this.B.flush();
        this.C = b.a();
    }

    public final void a() {
        synchronized (this.W) {
            try {
                if (this.V != null) {
                    String message = this.V.getMessage();
                    if (message == null) {
                        message = "Delegated task threw Exception/Error";
                    }
                    Exception exc = this.V;
                    this.V = null;
                    if (exc instanceof RuntimeException) {
                        throw new RuntimeException(message, exc);
                    }
                    if (exc instanceof SSLHandshakeException) {
                        throw ((SSLHandshakeException) new SSLHandshakeException(message).initCause(exc));
                    }
                    if (exc instanceof SSLKeyException) {
                        throw ((SSLKeyException) new SSLKeyException(message).initCause(exc));
                    }
                    if (exc instanceof SSLPeerUnverifiedException) {
                        throw ((SSLPeerUnverifiedException) new SSLPeerUnverifiedException(message).initCause(exc));
                    }
                    if (!(exc instanceof SSLProtocolException)) {
                        throw new SSLException(message, exc);
                    }
                    throw ((SSLProtocolException) new SSLProtocolException(message).initCause(exc));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract cl_47 b();

    public final cl_7 c(cl_5 cl_5Var) {
        cl_8 cl_8Var = this.H;
        cl_9 cl_9Var = cl_8Var.x;
        cl_11 cl_11Var = cl_8Var.w;
        if (this.v) {
            cl_7 a = cl_9Var.a(this.O, this.Q, this.D.g, cl_5Var, cl_11Var.j(), false);
            this.O = null;
            this.Q = null;
            return a;
        }
        cl_7 a2 = cl_9Var.a(this.N, this.P, this.D.g, cl_5Var, cl_11Var.j(), false);
        this.N = null;
        this.P = null;
        return a2;
    }

    public abstract void d(byte b);

    public abstract void e(byte b, int i);

    public final void f(byte b, String str, Exception exc) {
        SSLSocketImpl sSLSocketImpl = this.x;
        if (sSLSocketImpl != null) {
            sSLSocketImpl.e(b, exc, str);
            throw null;
        }
        this.y.f(b, exc, str);
        throw null;
    }

    public final void h(SecretKey secretKey) {
        cl_13 cl_13Var;
        String str;
        SecretKey generateKey;
        String str2;
        GostMasterSpec gostMasterSpec;
        cl_11 cl_11Var = this.H.w;
        boolean z = cl_11Var == cl_11.q || cl_11Var == cl_11.r || cl_11Var == cl_11.s || cl_11Var == cl_11.t || cl_11Var == cl_11.u;
        if (z) {
            try {
                if (this.G.i) {
                    str2 = JCP.GOST_EXTENDED_MASTER_KEY_NAME;
                    try {
                        byte[] digest = ((MessageDigest) this.z.c.clone()).digest();
                        String g = this.H.w.g();
                        int l = this.H.w.l();
                        int j = this.H.w.j();
                        int k = this.H.w.k();
                        cl_8 cl_8Var = this.H;
                        gostMasterSpec = new GostMasterSpec(secretKey, digest, g, l, j, k, cl_8Var.x.h, cl_8Var.w.r());
                    } catch (CloneNotSupportedException e) {
                        throw new RuntimeException("Could not clone digest", e);
                    }
                } else {
                    byte[] bArr = this.E.a;
                    byte[] bArr2 = this.F.a;
                    String g2 = cl_11Var.g();
                    int l2 = this.H.w.l();
                    int j2 = this.H.w.j();
                    int k2 = this.H.w.k();
                    cl_8 cl_8Var2 = this.H;
                    GostMasterSpec gostMasterSpec2 = new GostMasterSpec(secretKey, bArr, bArr2, g2, l2, j2, k2, cl_8Var2.x.h, cl_8Var2.w.r());
                    str2 = JCP.GOST_MASTER_KEY_NAME;
                    gostMasterSpec = gostMasterSpec2;
                }
                generateKey = (MasterSecretInterface) SecretKeyFactory.getInstance(str2, cpSSLConfig.getDefaultEncryptionSSLProvider()).generateSecret(gostMasterSpec);
            } catch (NoSuchAlgorithmException e2) {
                InvalidKeyException invalidKeyException = new InvalidKeyException("Invalid pre-master key");
                invalidKeyException.initCause(e2);
                throw invalidKeyException;
            } catch (NoSuchProviderException e3) {
                InvalidKeyException invalidKeyException2 = new InvalidKeyException("Invalid pre-master key");
                invalidKeyException2.initCause(e3);
                throw invalidKeyException2;
            } catch (InvalidKeySpecException e4) {
                InvalidKeyException invalidKeyException3 = new InvalidKeyException("Invalid pre-master key");
                invalidKeyException3.initCause(e4);
                throw invalidKeyException3;
            }
        } else {
            SSLLogger.fine("SESSION KEYGEN:");
            if (SSLLogger.isAllEnabled()) {
                SSLLogger.dump("PreMaster Secret:", ByteBuffer.wrap(secretKey.getEncoded()));
            }
            int i = this.a.n;
            cl_84 cl_84Var = cl_84.z;
            if (i >= cl_84Var.n) {
                cl_13Var = this.H.z;
                str = "JavaTls12MasterSecret";
            } else {
                cl_13Var = cl_13.P_NONE;
                str = "JavaTlsMasterSecret";
            }
            String str3 = str;
            cl_13Var.getClass();
            boolean z2 = this.G.i;
            cl_84 cl_84Var2 = this.a;
            if (z2) {
                int i2 = cl_84Var2.n;
                int i3 = cl_84Var.n;
                cl_45 cl_45Var = this.z;
                if (i2 >= i3) {
                    cl_45Var.getClass();
                    kbs.g("getFinishedHash() unsupported.");
                    return;
                } else {
                    try {
                        if (cl_45Var.a == 1) {
                            throw new RuntimeException("getMD5Clone() unsupported.");
                        }
                        throw new RuntimeException("getMD5Clone() can be only be called for TLS 1.1");
                    } catch (DigestException e5) {
                        throw new ProviderException(e5);
                    }
                }
            }
            rq61 rq61Var = new rq61(secretKey, cl_84Var2.o, cl_84Var2.p, this.E.a, this.F.a);
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(str3, cl_73.g(str3));
                keyGenerator.init(rq61Var);
                generateKey = keyGenerator.generateKey();
            } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e6) {
                SSLLogger.warning("RSA master secret generation error:");
                SSLLogger.thrown(e6);
                throw new ProviderException(e6);
            }
        }
        SSLSessionImpl sSLSessionImpl = this.G;
        if (sSLSessionImpl.h != null) {
            kbs.g("setMasterSecret() error");
            return;
        }
        sSLSessionImpl.h = generateKey;
        if (z) {
            i((MasterSecretInterface) generateKey);
        } else {
            o(generateKey);
            throw null;
        }
    }

    public final void i(MasterSecretInterface masterSecretInterface) {
        cl_11 cl_11Var;
        SecretKey calculateConnectionKey;
        int i;
        int i2;
        SecretKey calculateConnectionKey2;
        int i3;
        int i4;
        SecretKey calculateConnectionKey3;
        boolean isJCP = cpSSLConfig.isJCP();
        boolean z = !this.v;
        CryptParamsSpec m = this.H.w.m();
        int i5 = this.H.x.d.equals("CNT") ? 3 : this.H.x.d.equals("CTR_ACPKM") ? 32 : 0;
        cl_8 cl_8Var = this.H;
        cl_11 cl_11Var2 = cl_8Var.w;
        int i6 = cl_8Var.x.h;
        try {
            byte[] bArr = new byte[i6];
            boolean z2 = this.v;
            cl_87 cl_87Var = this.E;
            if (isJCP) {
                calculateConnectionKey = masterSecretInterface.calculateConnectionKey(cl_87Var.a, this.F.a, MasterKeySpec.ENC_KEY_CLIENT, bArr, cl_11Var2.h(), m);
                i = i5;
                cl_11Var = cl_11Var2;
                i2 = i6;
            } else {
                int i7 = i5;
                cl_11Var = cl_11Var2;
                calculateConnectionKey = masterSecretInterface.calculateConnectionKey(cl_87Var.a, this.F.a, true, bArr, m, z, z2, i7, cl_11Var2.i(), cl_11Var2.l(), cl_11Var2.j(), i6, cl_11Var2.r());
                bArr = bArr;
                m = m;
                i = i7;
                i2 = i6;
            }
            this.N = calculateConnectionKey;
            this.P = new IvParameterSpec(bArr);
            try {
                byte[] bArr2 = new byte[i2];
                boolean z3 = !this.v;
                cl_87 cl_87Var2 = this.E;
                if (isJCP) {
                    calculateConnectionKey2 = masterSecretInterface.calculateConnectionKey(cl_87Var2.a, this.F.a, MasterKeySpec.ENC_KEY_SERVER, bArr2, cl_11Var.h(), m);
                } else {
                    CryptParamsSpec cryptParamsSpec = m;
                    int i8 = i2;
                    int i9 = i;
                    calculateConnectionKey2 = masterSecretInterface.calculateConnectionKey(cl_87Var2.a, this.F.a, true, bArr2, cryptParamsSpec, z, z3, i9, cl_11Var.i(), cl_11Var.l(), cl_11Var.j(), i8, cl_11Var.r());
                    bArr2 = bArr2;
                    m = cryptParamsSpec;
                    i = i9;
                    i2 = i8;
                }
                this.O = calculateConnectionKey2;
                this.Q = new IvParameterSpec(bArr2);
                try {
                    boolean z4 = this.v;
                    cl_87 cl_87Var3 = this.E;
                    if (isJCP) {
                        calculateConnectionKey3 = masterSecretInterface.calculateConnectionKey(cl_87Var3.a, this.F.a, MasterKeySpec.MAC_KEY_CLIENT, null, cl_11Var.h(), m);
                        i4 = i;
                        i3 = i2;
                    } else {
                        CryptParamsSpec cryptParamsSpec2 = m;
                        i3 = i2;
                        i4 = i;
                        calculateConnectionKey3 = masterSecretInterface.calculateConnectionKey(cl_87Var3.a, this.F.a, false, null, cryptParamsSpec2, z, z4, i4, cl_11Var.i(), cl_11Var.l(), cl_11Var.j(), i3, cl_11Var.r());
                        m = cryptParamsSpec2;
                    }
                    this.R = calculateConnectionKey3;
                    try {
                        boolean z5 = !this.v;
                        cl_87 cl_87Var4 = this.E;
                        this.S = isJCP ? masterSecretInterface.calculateConnectionKey(cl_87Var4.a, this.F.a, MasterKeySpec.MAC_KEY_SERVER, null, cl_11Var.h(), m) : masterSecretInterface.calculateConnectionKey(cl_87Var4.a, this.F.a, false, null, m, z, z5, i4, cl_11Var.i(), cl_11Var.l(), cl_11Var.j(), i3, cl_11Var.r());
                        this.L = true;
                        SSLLogger.fine("CONNECTION KEYGEN:");
                        if (SSLLogger.isAllEnabled()) {
                            SSLLogger.dump("Client Nonce:", ByteBuffer.wrap(this.E.a));
                            SSLLogger.dump("Server Nonce:", ByteBuffer.wrap(this.F.a));
                        }
                        SSLLogger.fine("Master Secret: ", masterSecretInterface);
                        SSLLogger.fine("Client MAC write Secret: ", this.R);
                        SSLLogger.fine("Server MAC write Secret: ", this.S);
                        SecretKey secretKey = this.N;
                        if (secretKey != null) {
                            SSLLogger.fine("Client write key: ", secretKey);
                            SSLLogger.fine("Server write key: ", this.O);
                        } else {
                            SSLLogger.fine("... no encryption keys used");
                        }
                        if (this.P != null) {
                            if (SSLLogger.isAllEnabled()) {
                                SSLLogger.dump("Client write IV:", ByteBuffer.wrap(this.P.getIV()));
                                SSLLogger.dump("Server write IV:", ByteBuffer.wrap(this.Q.getIV()));
                                return;
                            }
                            return;
                        }
                        if (this.a.n >= cl_84.y.n) {
                            SSLLogger.fine("... no IV derived for this protocol");
                        } else {
                            SSLLogger.fine("... no IV used for this cipher");
                        }
                    } catch (NoSuchAlgorithmException e) {
                        InvalidKeyException invalidKeyException = new InvalidKeyException("Error in creating server mac key");
                        invalidKeyException.initCause(e);
                        throw invalidKeyException;
                    }
                } catch (NoSuchAlgorithmException e2) {
                    InvalidKeyException invalidKeyException2 = new InvalidKeyException("Error in creating client mac key");
                    invalidKeyException2.initCause(e2);
                    throw invalidKeyException2;
                }
            } catch (NoSuchAlgorithmException e3) {
                InvalidKeyException invalidKeyException3 = new InvalidKeyException("Error in creating server encryption key");
                invalidKeyException3.initCause(e3);
                throw invalidKeyException3;
            }
        } catch (NoSuchAlgorithmException e4) {
            InvalidKeyException invalidKeyException4 = new InvalidKeyException("Error in creating client encryption key");
            invalidKeyException4.initCause(e4);
            throw invalidKeyException4;
        }
    }

    public final void j(SSLContextImpl sSLContextImpl, cl_83 cl_83Var, boolean z, boolean z2, cl_84 cl_84Var, boolean z3, boolean z4, byte[] bArr, byte[] bArr2) {
        StringBuilder sb = new StringBuilder("Allow unsafe renegotiation: ");
        sb.append(a0);
        sb.append("\nAllow legacy hello messages: ");
        nnm.v("\nIs initial handshake: ", "\nIs secure renegotiation: ", sb, b0, z3);
        sb.append(z4);
        SSLLogger.fine(sb.toString());
        this.D = sSLContextImpl;
        this.v = z2;
        this.w = z;
        this.b = cl_84Var;
        this.f = z3;
        this.c = z4;
        this.d = bArr;
        this.e = bArr2;
        this.K = true;
        this.L = false;
        cl_8 cl_8Var = cl_8.a0;
        this.H = cl_8Var;
        this.I = cl_8Var.w;
        this.o = null;
        this.n = null;
        this.g = cl_83Var;
        SSLSocketImpl sSLSocketImpl = this.x;
        if (sSLSocketImpl != null) {
            this.i = new cl_90((SSLSocket) sSLSocketImpl, true);
        } else {
            this.i = new cl_90((SSLEngine) this.y, true);
        }
        this.C = -2;
    }

    public final void k(SSLSessionImpl sSLSessionImpl) {
        SSLSocketImpl sSLSocketImpl = this.x;
        if (sSLSocketImpl != null) {
            synchronized (sSLSocketImpl) {
                sSLSocketImpl.i0 = sSLSessionImpl;
            }
        } else {
            SSLEngineImpl sSLEngineImpl = this.y;
            synchronized (sSLEngineImpl) {
                sSLEngineImpl.g = sSLSessionImpl;
            }
        }
    }

    public final void l(cl_55 cl_55Var, boolean z) {
        this.B.flush();
        cl_82 cl_82Var = this.x != null ? new cl_82((byte) 20, cl_88.s) : new cl_30((byte) 20, this.y);
        cl_82Var.k(this.a);
        cl_82Var.write(1);
        SSLSocketImpl sSLSocketImpl = this.x;
        if (sSLSocketImpl != null) {
            sSLSocketImpl.R.lock();
            try {
                this.x.w(cl_82Var);
                this.x.Z();
                cl_55Var.f();
                cl_55Var.c(this.B);
                this.B.flush();
                return;
            } finally {
                this.x.R.unlock();
            }
        }
        synchronized (this.y.N) {
            try {
                this.y.i((cl_30) cl_82Var);
                this.y.l();
                cl_55Var.f();
                cl_55Var.c(this.B);
                if (z) {
                    ((cl_30) this.B.c).D = true;
                }
                this.B.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(cl_69 cl_69Var, boolean z) {
        a();
        this.A.a.n(cl_69Var);
        if (this.x != null || z) {
            C();
            return;
        }
        this.U = new cl_65(this, new cl_64(this));
        this.T = false;
        this.V = null;
    }

    public final void n(cl_84 cl_84Var) {
        this.a = cl_84Var;
        SSLSocketImpl sSLSocketImpl = this.x;
        if (sSLSocketImpl != null) {
            synchronized (sSLSocketImpl) {
                sSLSocketImpl.p0 = cl_84Var;
                sSLSocketImpl.n0.b.k(cl_84Var);
            }
        } else {
            SSLEngineImpl sSLEngineImpl = this.y;
            synchronized (sSLEngineImpl) {
                sSLEngineImpl.B = cl_84Var;
                sSLEngineImpl.o.k(cl_84Var);
            }
        }
        this.B.c.k(cl_84Var);
    }

    public final void o(SecretKey secretKey) {
        cl_13 cl_13Var;
        String str;
        cl_8 cl_8Var = this.H;
        int i = cl_8Var.y.b;
        boolean z = cl_8Var.A;
        cl_9 cl_9Var = cl_8Var.x;
        int i2 = z ? cl_9Var.g : 0;
        if (this.a.n >= cl_84.z.n) {
            cl_13Var = cl_8Var.z;
            str = "JavaTls12KeyMaterial";
        } else {
            cl_13Var = cl_13.P_NONE;
            str = "JavaTlsKeyMaterial";
        }
        cl_13Var.getClass();
        int i3 = cl_9Var.h;
        if (cl_9Var.k != cl_10.c) {
            int i4 = this.a.n;
            int i5 = cl_84.y.n;
        }
        cl_84 cl_84Var = this.a;
        rq61 rq61Var = new rq61(secretKey, cl_84Var.o, cl_84Var.p, this.E.a, this.F.a, cl_9Var.c, cl_9Var.f, i2, i3, i);
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(str, cl_73.g(str));
            keyGenerator.init(rq61Var);
            if (keyGenerator.generateKey() == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (GeneralSecurityException e) {
            throw new ProviderException(e);
        }
    }

    public final String p() {
        String str;
        SSLSocketImpl sSLSocketImpl = this.x;
        if (sSLSocketImpl == null) {
            return this.y.getPeerHost();
        }
        synchronized (sSLSocketImpl) {
            try {
                String str2 = sSLSocketImpl.D;
                if (str2 != null) {
                    if (str2.length() == 0) {
                    }
                    str = sSLSocketImpl.D;
                }
                synchronized (sSLSocketImpl) {
                    InetAddress inetAddress = sSLSocketImpl.getInetAddress();
                    if (inetAddress != null) {
                        sSLSocketImpl.D = inetAddress.getHostName();
                    }
                    str = sSLSocketImpl.D;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final cl_7 q(cl_5 cl_5Var) {
        cl_8 cl_8Var = this.H;
        cl_9 cl_9Var = cl_8Var.x;
        cl_11 cl_11Var = cl_8Var.w;
        if (this.v) {
            cl_7 a = cl_9Var.a(this.N, this.P, this.D.g, cl_5Var, cl_11Var.j(), true);
            this.N = null;
            this.P = null;
            return a;
        }
        cl_7 a2 = cl_9Var.a(this.O, this.Q, this.D.g, cl_5Var, cl_11Var.j(), true);
        this.O = null;
        this.Q = null;
        return a2;
    }

    public final void r(cl_84 cl_84Var) {
        cl_82 cl_82Var;
        SSLEngineImpl sSLEngineImpl = this.y;
        SSLSocketImpl sSLSocketImpl = this.x;
        if (this.n == null) {
            this.n = B();
        }
        if (!this.n.a.isEmpty()) {
            int i = this.n.d.n;
            cl_84 cl_84Var2 = cl_84.b;
            if (i != cl_84Var2.n) {
                if (this.o == null) {
                    this.o = A();
                }
                if (this.o.a.isEmpty()) {
                    dy31.u("No appropriate cipher suite");
                    return;
                }
                this.a = !this.f ? this.b : this.n.d;
                if (cl_84Var == null || cl_84Var.n == cl_84Var2.n) {
                    cl_84Var = this.n.e;
                }
                cl_109.g(x());
                this.z = new cl_45(this.w);
                cl_45 cl_45Var = this.z;
                cl_46 cl_46Var = new cl_46();
                cl_69 cl_69Var = new cl_69();
                cl_46Var.a = cl_69Var;
                cl_69Var.a = cl_45Var;
                this.A = cl_46Var;
                if (sSLSocketImpl != null) {
                    cl_84 cl_84Var3 = this.a;
                    cl_45 cl_45Var2 = this.z;
                    cl_62 cl_62Var = new cl_62();
                    cl_62Var.a = sSLSocketImpl;
                    cl_82 cl_82Var2 = new cl_82((byte) 22);
                    cl_62Var.c = cl_82Var2;
                    cl_82Var2.k(cl_84Var3);
                    synchronized (cl_82Var2) {
                        cl_82Var2.y = cl_84Var;
                    }
                    cl_82Var2.a = cl_45Var2;
                    this.B = cl_62Var;
                    cl_69 cl_69Var2 = sSLSocketImpl.m0.b;
                    cl_69Var2.a = this.z;
                    cl_69Var2.y = cl_84Var;
                    cl_82Var = sSLSocketImpl.n0.b;
                    synchronized (cl_82Var) {
                        cl_82Var.y = cl_84Var;
                    }
                } else {
                    cl_84 cl_84Var4 = this.a;
                    cl_45 cl_45Var3 = this.z;
                    cl_62 cl_62Var2 = new cl_62();
                    cl_62Var2.b = sSLEngineImpl;
                    cl_30 cl_30Var = new cl_30((byte) 22, sSLEngineImpl);
                    cl_62Var2.c = cl_30Var;
                    cl_30Var.k(cl_84Var4);
                    synchronized (cl_30Var) {
                        cl_30Var.y = cl_84Var;
                    }
                    cl_30Var.a = cl_45Var3;
                    this.B = cl_62Var2;
                    cl_29 cl_29Var = sSLEngineImpl.n;
                    cl_29Var.a = this.z;
                    cl_29Var.y = cl_84Var;
                    cl_82Var = sSLEngineImpl.o;
                    synchronized (cl_82Var) {
                        cl_82Var.y = cl_84Var;
                    }
                }
                this.C = -1;
                return;
            }
        }
        dy31.u("No appropriate protocol (protocol is disabled or cipher suites are inappropriate)");
    }

    public final boolean s(cl_8 cl_8Var) {
        if (this.o == null) {
            this.o = A();
        }
        if (this.o.a.contains(cl_8Var)) {
            if (cl_8Var == cl_8.b0) {
                cl_8Var.getClass();
            } else if (cl_8Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final cl_80 t(cl_5 cl_5Var) {
        cl_8 cl_8Var = this.H;
        cl_12 cl_12Var = cl_8Var.y;
        cl_11 cl_11Var = cl_8Var.w;
        boolean z = this.v;
        cl_84 cl_84Var = this.a;
        if (z) {
            SecretKey secretKey = this.S;
            int j = cl_11Var.j();
            cl_12Var.getClass();
            cl_80 cl_80Var = new cl_80(cl_12Var, cl_84Var, secretKey, cl_5Var, j);
            this.S = null;
            return cl_80Var;
        }
        SecretKey secretKey2 = this.R;
        int j2 = cl_11Var.j();
        cl_12Var.getClass();
        cl_80 cl_80Var2 = new cl_80(cl_12Var, cl_84Var, secretKey2, cl_5Var, j2);
        this.R = null;
        return cl_80Var2;
    }

    public final cl_80 u(cl_5 cl_5Var) {
        cl_8 cl_8Var = this.H;
        cl_12 cl_12Var = cl_8Var.y;
        cl_11 cl_11Var = cl_8Var.w;
        boolean z = this.v;
        cl_84 cl_84Var = this.a;
        if (z) {
            SecretKey secretKey = this.R;
            int j = cl_11Var.j();
            cl_12Var.getClass();
            cl_80 cl_80Var = new cl_80(cl_12Var, cl_84Var, secretKey, cl_5Var, j);
            this.R = null;
            return cl_80Var;
        }
        SecretKey secretKey2 = this.S;
        int j2 = cl_11Var.j();
        cl_12Var.getClass();
        cl_80 cl_80Var2 = new cl_80(cl_12Var, cl_84Var, secretKey2, cl_5Var, j2);
        this.S = null;
        return cl_80Var2;
    }

    public final AccessControlContext v() {
        SSLSocketImpl sSLSocketImpl = this.x;
        return sSLSocketImpl != null ? sSLSocketImpl.F : this.y.p;
    }

    public final String w() {
        SSLSocketImpl sSLSocketImpl = this.x;
        return (sSLSocketImpl != null ? sSLSocketImpl.getSSLParameters() : this.y.getSSLParameters()).getEndpointIdentificationAlgorithm();
    }

    public final Collection x() {
        if (this.j == null) {
            AlgorithmConstraints algorithmConstraints = this.i;
            Set set = cl_109.e;
            ArrayList arrayList = new ArrayList();
            SortedMap sortedMap = cl_109.g;
            synchronized (sortedMap) {
                try {
                    for (cl_109 cl_109Var : sortedMap.values()) {
                        if (cl_109Var.d <= 240 && algorithmConstraints.permits(cl_109.e, cl_109Var.c, null)) {
                            arrayList.add(cl_109Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.j = arrayList;
        }
        return this.j;
    }

    public final Collection y() {
        if (this.k == null) {
            Set set = cl_109.e;
            ArrayList arrayList = new ArrayList();
            SortedMap sortedMap = cl_109.h;
            synchronized (sortedMap) {
                try {
                    for (cl_109 cl_109Var : sortedMap.values()) {
                        if (cl_109Var.d <= 240) {
                            arrayList.add(cl_109Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.k = arrayList;
        }
        return this.k;
    }

    public final Collection z() {
        if (this.l == null) {
            Set set = cl_109.e;
            ArrayList arrayList = new ArrayList();
            SortedMap sortedMap = cl_109.i;
            synchronized (sortedMap) {
                try {
                    for (cl_109 cl_109Var : sortedMap.values()) {
                        if (cl_109Var.d <= 240) {
                            arrayList.add(cl_109Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.l = arrayList;
        }
        return this.l;
    }

    public cl_63(SSLSocketImpl sSLSocketImpl, SSLContextImpl sSLContextImpl, cl_83 cl_83Var, boolean z, boolean z2, cl_84 cl_84Var, boolean z3, boolean z4, byte[] bArr, byte[] bArr2) {
        List list = Collections.EMPTY_LIST;
        this.p = list;
        this.q = list;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.x = null;
        this.y = null;
        this.M = false;
        this.T = false;
        this.U = null;
        this.V = null;
        this.W = new Object();
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.x = sSLSocketImpl;
        j(sSLContextImpl, cl_83Var, z, z2, cl_84Var, z3, z4, bArr, bArr2);
    }
}
