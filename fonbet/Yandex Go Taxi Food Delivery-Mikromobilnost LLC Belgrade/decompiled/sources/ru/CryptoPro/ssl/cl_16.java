package ru.CryptoPro.ssl;

import defpackage.dy31;
import defpackage.ev61;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rq61;
import defpackage.w511;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.CryptoPrimitive;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PrivilegedActionException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.Subject;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.Key.MasterSecretInterface;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.ssl.util.ParamUtil;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
final class cl_16 extends cl_63 {
    public static final boolean t0 = GetProperty.getBooleanProperty("jsse.enableSNIExtension", true);
    public static final boolean u0 = GetProperty.getBooleanProperty("jdk.tls.allowUnsafeServerCertChange", false);
    public PublicKey h0;
    public PublicKey i0;
    public BigInteger j0;
    public cl_21 k0;
    public cl_25 l0;
    public cl_49 m0;
    public boolean n0;
    public cl_84 o0;
    public boolean p0;
    public List q0;
    public boolean r0;
    public X509Certificate[] s0;

    public static HashSet G(int i, Collection collection) {
        String str;
        Iterator it = collection.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            List list = (List) it.next();
            if (((Integer) list.get(0)).intValue() == i && (str = (String) list.get(1)) != null && !str.isEmpty()) {
                if (hashSet == null) {
                    hashSet = new HashSet(collection.size());
                }
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static boolean L(HashSet hashSet, HashSet hashSet2) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                if (str.equalsIgnoreCase((String) it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void H(cl_52 cl_52Var) {
        cl_52Var.f();
        BigInteger bigInteger = new BigInteger(1, cl_52Var.b);
        BigInteger bigInteger2 = new BigInteger(1, cl_52Var.c);
        SecureRandom secureRandom = this.D.g;
        cl_21 cl_21Var = new cl_21();
        cl_21Var.a = bigInteger;
        cl_21Var.b = bigInteger2;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DiffieHellman", cl_73.g("DiffieHellman"));
            keyPairGenerator.initialize(new DHParameterSpec(bigInteger, bigInteger2), secureRandom);
            DHPublicKeySpec b = cl_21Var.b(keyPairGenerator);
            if (b == null) {
                throw new RuntimeException("Could not generate DH keypair");
            }
            cl_21Var.d = b.getY();
            this.k0 = cl_21Var;
            BigInteger bigInteger3 = new BigInteger(1, cl_52Var.d);
            this.j0 = bigInteger3;
            this.k0.c(this.i, bigInteger3);
        } catch (GeneralSecurityException e) {
            ny61.n("Could not generate DH keypair", e);
        }
    }

    public final void I(cl_54 cl_54Var) {
        cl_54Var.f();
        ECPublicKey eCPublicKey = cl_54Var.e;
        this.l0 = new cl_25(eCPublicKey.getParams(), this.D.g);
        this.i0 = eCPublicKey;
        if (this.i.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), this.i0)) {
            return;
        }
        dy31.u("ECDH ServerKeyExchange does not comply to algorithm constraints");
    }

    public final void J(cl_58 cl_58Var) {
        cl_58Var.f();
        PublicKey publicKey = this.h0;
        cl_87 cl_87Var = this.E;
        cl_87 cl_87Var2 = this.F;
        Signature signature = cl_58Var.d;
        signature.initVerify(publicKey);
        cl_58Var.e(cl_87Var.a, cl_87Var2.a);
        if (!signature.verify(cl_58Var.e)) {
            f(Alerts.alert_handshake_failure, "server key exchange invalid", null);
            throw null;
        }
        try {
            this.i0 = KeyFactory.getInstance("RSA", cl_73.g("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, cl_58Var.b), new BigInteger(1, cl_58Var.c)));
            if (this.i.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), this.i0)) {
                return;
            }
            dy31.u("RSA ServerKeyExchange does not comply to algorithm constraints");
        } catch (Exception e) {
            ny61.j(e);
        }
    }

    public final void K(cl_59 cl_59Var) {
        SSLSessionImpl sSLSessionImpl;
        SSLSessionImpl sSLSessionImpl2;
        SSLSessionImpl sSLSessionImpl3;
        Subject subject;
        this.n0 = false;
        cl_59Var.f();
        cl_67 cl_67Var = cl_59Var.g;
        cl_84 cl_84Var = cl_59Var.b;
        if (this.n == null) {
            this.n = B();
        }
        cl_83 cl_83Var = this.n;
        cl_83Var.getClass();
        if (!(cl_84Var == cl_84.c ? false : cl_83Var.a.contains(cl_84Var))) {
            throw new SSLHandshakeException("Server chose " + cl_84Var + ", but that protocol version is not enabled or not supported by the client.");
        }
        n(cl_84Var);
        cl_89 cl_89Var = (cl_89) cl_67Var.a(cl_36.k);
        boolean z = this.f;
        if (cl_89Var != null) {
            if (z) {
                if (!cl_89Var.c()) {
                    f(Alerts.alert_handshake_failure, "The renegotiation_info field is not empty", null);
                    throw null;
                }
                this.c = true;
            } else {
                if (!this.c) {
                    f(Alerts.alert_handshake_failure, "Unexpected renegotiation indication extension", null);
                    throw null;
                }
                byte[] bArr = this.d;
                byte[] bArr2 = new byte[bArr.length + this.e.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                byte[] bArr3 = this.e;
                System.arraycopy(bArr3, 0, bArr2, this.d.length, bArr3.length);
                if (!Arrays.equals(bArr2, cl_89Var.e)) {
                    f(Alerts.alert_handshake_failure, "Incorrect verify data in ServerHello renegotiation_info message", null);
                    throw null;
                }
            }
        } else if (z) {
            if (!cl_63.b0) {
                f(Alerts.alert_handshake_failure, "Failed to negotiate the use of secure renegotiation", null);
                throw null;
            }
            this.c = false;
            SSLLogger.fine("Warning: No renegotiation indication extension in ServerHello");
        } else if (this.c) {
            f(Alerts.alert_handshake_failure, "No renegotiation indication extension", null);
            throw null;
        }
        this.F = cl_59Var.c;
        boolean s = s(cl_59Var.e);
        cl_8 cl_8Var = cl_59Var.e;
        if (!s) {
            f(Alerts.alert_illegal_parameter, "Server selected improper ciphersuite " + cl_8Var, null);
            throw null;
        }
        this.H = cl_8Var;
        this.I = cl_8Var.w;
        this.z.c(cl_84Var, cl_8Var);
        if (this.a.n >= cl_84.z.n) {
            cl_45 cl_45Var = this.z;
            this.H.z.getClass();
            cl_45Var.getClass();
        }
        if (cl_59Var.f != 0) {
            f(Alerts.alert_illegal_parameter, "compression type not supported, " + ((int) cl_59Var.f), null);
            throw null;
        }
        SSLSessionImpl sSLSessionImpl4 = this.G;
        if (sSLSessionImpl4 != null) {
            if (sSLSessionImpl4.b.equals(cl_59Var.d)) {
                SSLSessionImpl sSLSessionImpl5 = this.G;
                cl_8 cl_8Var2 = sSLSessionImpl5.g;
                if (this.H != cl_8Var2) {
                    dy31.m("Server returned wrong cipher suite for session");
                    return;
                }
                if (this.a != sSLSessionImpl5.a) {
                    dy31.m("Server resumed session with wrong protocol version");
                    return;
                }
                cl_11 cl_11Var = cl_8Var2.w;
                if (cl_11Var == cl_11.n || cl_11Var == cl_11.o) {
                    Principal localPrincipal = sSLSessionImpl5.getLocalPrincipal();
                    try {
                        subject = (Subject) AccessController.doPrivileged(new cl_17(this));
                    } catch (PrivilegedActionException unused) {
                        SSLLogger.warning("Attempt to obtain subject failed!");
                        subject = null;
                    }
                    if (subject == null) {
                        SSLLogger.warning("Kerberos credentials are not present in the current Subject; check if  javax.security.auth.useSubjectAsCreds system property has been set to false");
                        dy31.m("Server resumed session with no subject");
                        return;
                    } else {
                        if (!subject.getPrincipals(Principal.class).contains(localPrincipal)) {
                            dy31.m("Server resumed session with wrong subject identity");
                            return;
                        }
                        SSLLogger.fine("Subject identity is same");
                    }
                }
                this.J = true;
                this.C = 19;
                cl_11 cl_11Var2 = this.I;
                if (cl_11Var2 != cl_11.q && cl_11Var2 != cl_11.r && cl_11Var2 != cl_11.s && cl_11Var2 != cl_11.t && cl_11Var2 != cl_11.u) {
                    o(this.G.h);
                    throw null;
                }
                try {
                    i((MasterSecretInterface) this.G.h);
                    SSLLogger.fine("%% Server resumed ", this.G);
                } catch (InvalidKeyException e) {
                    RuntimeException runtimeException = new RuntimeException("Invalid key exchange", e);
                    runtimeException.initCause(e);
                    throw runtimeException;
                }
            } else {
                if (this.f) {
                    this.G.invalidate();
                }
                this.G = null;
                if (!this.K) {
                    throw new SSLException("New session creation is disabled");
                }
            }
        }
        cl_36 cl_36Var = cl_36.h;
        cl_0 cl_0Var = (cl_0) cl_67Var.a(cl_36Var);
        if (cl_0Var != null) {
            if (!this.p0) {
                f(Alerts.alert_unsupported_extension, "Server sent " + cl_36Var + " extension when not requested by client", null);
                throw null;
            }
            List list = cl_0Var.f;
            if (list.size() == 1) {
                String str = (String) list.get(0);
                if (!str.isEmpty()) {
                    int i = 0;
                    while (true) {
                        String[] strArr = this.r;
                        if (i >= strArr.length || strArr[i].equals(str)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i == this.r.length) {
                        f(Alerts.alert_handshake_failure, "Server has selected an application protocol name which was not offered by the client: ".concat(str), null);
                        throw null;
                    }
                    this.s = str;
                }
            }
            f(Alerts.alert_handshake_failure, "Incorrect data in ServerHello " + cl_36Var + " message", null);
            throw null;
        }
        this.s = "";
        cl_35 cl_35Var = (cl_35) cl_67Var.a(cl_36.i);
        boolean z2 = cl_63.d0;
        if (cl_35Var != null) {
            if (!z2 || cl_84Var.n < cl_84.x.n || !this.X) {
                f(Alerts.alert_unsupported_extension, "Server sent the extended_master_secret extension improperly", null);
                throw null;
            }
            if (this.J && (sSLSessionImpl3 = this.G) != null && !sSLSessionImpl3.i) {
                f(Alerts.alert_unsupported_extension, "Server sent an unexpected extended_master_secret extension on session resumption", null);
                throw null;
            }
        } else {
            if (z2 && !cl_63.g0) {
                f(Alerts.alert_handshake_failure, "Extended Master Secret extension is required", null);
                throw null;
            }
            if (this.J && (sSLSessionImpl = this.G) != null) {
                if (sSLSessionImpl.i) {
                    f(Alerts.alert_handshake_failure, "Missing Extended Master Secret extension on session resumption", null);
                    throw null;
                }
                if (z2 && !cl_63.f0) {
                    f(Alerts.alert_handshake_failure, "Extended Master Secret extension is required", null);
                    throw null;
                }
            }
        }
        if (((cl_107) cl_67Var.a(cl_36.j)) != null) {
            if (!cl_63.e0 || cl_84Var.n < cl_84.x.n || !this.Y) {
                f(Alerts.alert_unsupported_extension, "Server sent the session_ticket extension improperly", null);
                throw null;
            }
            this.Z = true;
        }
        if (this.J && (sSLSessionImpl2 = this.G) != null) {
            k(sSLSessionImpl2);
            if (this.f) {
                this.G.y = true;
                return;
            }
            return;
        }
        Iterator it = cl_67Var.a.iterator();
        while (it.hasNext()) {
            cl_36 cl_36Var2 = ((cl_66) it.next()).d;
            cl_36 cl_36Var3 = cl_36.d;
            if (cl_36Var2 == cl_36Var3) {
                this.r0 = true;
            } else if (cl_36Var2 != cl_36.e && cl_36Var2 != cl_36.f && cl_36Var2 != cl_36Var3 && cl_36Var2 != cl_36.k && cl_36Var2 != cl_36.i && cl_36Var2 != cl_36.j && cl_36Var2 != cl_36.h && cl_36Var2 != cl_36.l) {
                f(Alerts.alert_unsupported_extension, "Server sent an unsupported extension: " + cl_36Var2, null);
                throw null;
            }
        }
        cl_84 cl_84Var2 = this.a;
        cl_8 cl_8Var3 = this.H;
        Collection x = x();
        cl_106 cl_106Var = cl_59Var.d;
        String p = p();
        SSLSocketImpl sSLSocketImpl = this.x;
        SSLSessionImpl sSLSessionImpl6 = new SSLSessionImpl(cl_84Var2, cl_8Var3, x, cl_106Var, p, sSLSocketImpl != null ? sSLSocketImpl.getPort() : this.y.getPeerPort(), cl_35Var != null, w());
        this.G = sSLSessionImpl6;
        sSLSessionImpl6.u = new ArrayList(this.q0);
        k(this.G);
        SSLLogger.fine("** ", this.H);
    }

    public final void M(boolean z) {
        cl_55 cl_55Var = new cl_55(this.a, this.z, 1, this.G.h, this.H);
        l(cl_55Var, z);
        if (this.c) {
            this.d = cl_55Var.b;
        }
        this.C = 19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0390, code lost:
    
        if (r1.a.contains(ru.CryptoPro.ssl.cl_8.b0) == false) goto L214;
     */
    @Override // ru.CryptoPro.ssl.cl_63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cl_47 b() {
        SSLSessionImpl sSLSessionImpl;
        String str;
        String str2;
        boolean booleanValue;
        byte[] bArr;
        SSLSessionImpl sSLSessionImpl2;
        String w;
        cl_106 cl_106Var = SSLSessionImpl.B.b;
        cl_14 A = A();
        this.o0 = this.a;
        SSLSessionContextImpl sSLSessionContextImpl = this.D.b;
        String p = p();
        SSLSocketImpl sSLSocketImpl = this.x;
        int port = sSLSocketImpl != null ? sSLSocketImpl.getPort() : this.y.getPeerPort();
        sSLSessionContextImpl.getClass();
        if ((p == null && port == -1) || sSLSessionContextImpl.d() || (sSLSessionImpl = (SSLSessionImpl) sSLSessionContextImpl.b.get(SSLSessionContextImpl.b(port, p))) == null || sSLSessionImpl.a(sSLSessionContextImpl.d)) {
            sSLSessionImpl = null;
        }
        this.G = sSLSessionImpl;
        if (sSLSessionImpl != null) {
            StringBuilder sb = new StringBuilder("%% Client cached ");
            sb.append(this.G);
            sb.append(" ");
            sb.append(this.G.b() ? "" : " (not rejoinable)");
            str = sb.toString();
        } else {
            str = "%% No cached client session";
        }
        SSLLogger.finer(str);
        SSLSessionImpl sSLSessionImpl3 = this.G;
        if (sSLSessionImpl3 != null) {
            if (!u0 && sSLSessionImpl3.y) {
                try {
                    this.s0 = (X509Certificate[]) sSLSessionImpl3.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                }
            }
            if (!this.G.b()) {
                this.G = null;
            }
        }
        SSLSessionImpl sSLSessionImpl4 = this.G;
        if (sSLSessionImpl4 != null) {
            cl_8 cl_8Var = sSLSessionImpl4.g;
            cl_84 cl_84Var = sSLSessionImpl4.a;
            if (!s(cl_8Var)) {
                SSLLogger.fine("%% can't resume, unavailable cipher");
                this.G = null;
            }
            if (this.G != null) {
                if (this.n == null) {
                    this.n = B();
                }
                cl_83 cl_83Var = this.n;
                cl_83Var.getClass();
                if (!(cl_84Var == cl_84.c ? false : cl_83Var.a.contains(cl_84Var))) {
                    SSLLogger.fine("%% can't resume, protocol disabled");
                    this.G = null;
                }
            }
            SSLSessionImpl sSLSessionImpl5 = this.G;
            if (sSLSessionImpl5 != null && cl_63.d0) {
                boolean z = cl_84Var.n >= cl_84.x.n;
                if (z && !sSLSessionImpl5.i && !cl_63.f0) {
                    this.G = null;
                }
                if (this.G != null && !u0 && (((w = w()) == null || w.length() == 0) && (!z || !this.G.i))) {
                    this.G = null;
                }
            }
            String w2 = w();
            SSLSessionImpl sSLSessionImpl6 = this.G;
            if (sSLSessionImpl6 != null && w2 != null) {
                String str3 = sSLSessionImpl6.x;
                if (!w2.equals(str3)) {
                    SSLLogger.fine("%% can't resume, endpoint id algorithm does not match, requested: " + w2 + ", cached: " + str3);
                    this.G = null;
                }
            }
            if (this.G != null) {
                StringBuilder sb2 = new StringBuilder("%% Try resuming ");
                sb2.append(this.G);
                sb2.append(" from port ");
                SSLSocketImpl sSLSocketImpl2 = this.x;
                sb2.append(sSLSocketImpl2 != null ? sSLSocketImpl2.getLocalPort() : -1);
                SSLLogger.finer(sb2.toString());
                cl_106Var = this.G.b;
                cl_84 cl_84Var2 = this.o0;
                this.o0 = cl_84Var;
                if (cl_84Var2 != cl_84Var) {
                    ArrayList arrayList = new ArrayList(2);
                    for (cl_8 cl_8Var2 : A.a) {
                        int i = cl_8Var2.C;
                        int i2 = this.o0.n;
                        if (i > i2 && cl_8Var2.D <= i2) {
                            arrayList.add(cl_8Var2);
                        }
                    }
                    A = new cl_14(arrayList);
                }
                n(cl_84Var);
            }
            if (!this.K) {
                if (this.G == null) {
                    str2 = "Can't reuse existing SSL client session";
                    dy31.u(str2);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(cl_8Var);
                if (!this.c) {
                    cl_8 cl_8Var3 = cl_8.b0;
                    if (A.a.contains(cl_8Var3)) {
                        arrayList2.add(cl_8Var3);
                    }
                }
                A = new cl_14(arrayList2);
            }
        }
        if (this.G != null || this.K) {
            if (this.c) {
                if (A.a.contains(cl_8.b0)) {
                    ArrayList arrayList3 = new ArrayList(A.a.size() - 1);
                    for (cl_8 cl_8Var4 : A.a) {
                        if (cl_8Var4 != cl_8.b0) {
                            arrayList3.add(cl_8Var4);
                        }
                    }
                    A = new cl_14(arrayList3);
                }
            }
            Iterator it = A.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = "No negotiable cipher suite";
                    break;
                }
                if (s((cl_8) it.next())) {
                    SecureRandom secureRandom = this.D.g;
                    cl_84 cl_84Var3 = this.o0;
                    cl_51 cl_51Var = new cl_51();
                    cl_51Var.g = new cl_67();
                    cl_51Var.b = cl_84Var3;
                    cl_51Var.d = cl_106Var;
                    cl_51Var.e = A;
                    if (A.c == null) {
                        Iterator it2 = A.a.iterator();
                        while (it2.hasNext()) {
                            int i3 = cl_15.a[((cl_8) it2.next()).w.ordinal()];
                            if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) {
                                A.c = Boolean.TRUE;
                                booleanValue = true;
                                break;
                            }
                        }
                        A.c = Boolean.FALSE;
                    }
                    booleanValue = A.c.booleanValue();
                    if (booleanValue) {
                        cl_51Var.g.c(cl_26.f);
                        cl_51Var.g.c(cl_28.f);
                    }
                    cl_51Var.c = new cl_87(secureRandom);
                    cl_51Var.f = cl_51.h;
                    if (this.o0.n >= cl_84.z.n) {
                        ArrayList arrayList4 = (ArrayList) x();
                        if (arrayList4.isEmpty()) {
                            str2 = "No supported signature algorithm";
                        } else {
                            cl_108 cl_108Var = new cl_108(cl_36.g);
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            cl_108Var.e = arrayList5;
                            Set set = cl_109.e;
                            cl_108Var.f = arrayList5.size() * 2;
                            cl_51Var.g.c(cl_108Var);
                        }
                    }
                    if (cl_63.d0 && this.o0.n >= cl_84.x.n && ((this.G == null && A.g()) || ((sSLSessionImpl2 = this.G) != null && sSLSessionImpl2.i))) {
                        cl_51Var.g.c(new cl_35());
                        this.X = true;
                    }
                    if (cl_63.e0 && this.o0.n >= cl_84.x.n) {
                        SSLSessionImpl sSLSessionImpl7 = this.G;
                        if (sSLSessionImpl7 != null) {
                            if (sSLSessionImpl7.e != 0 && System.currentTimeMillis() - sSLSessionImpl7.d >= sSLSessionImpl7.e) {
                                sSLSessionImpl7.c = null;
                                sSLSessionImpl7.e = 0;
                            }
                            bArr = sSLSessionImpl7.c;
                        } else {
                            bArr = null;
                        }
                        cl_67 cl_67Var = cl_51Var.g;
                        cl_107 cl_107Var = new cl_107(cl_36.j);
                        cl_107Var.e = null;
                        if (bArr != null) {
                            cl_107Var.e = Array.copy(bArr);
                        }
                        cl_67Var.c(cl_107Var);
                        this.Y = true;
                    }
                    if (t0) {
                        SSLSessionImpl sSLSessionImpl8 = this.G;
                        this.q0 = sSLSessionImpl8 != null ? sSLSessionImpl8.getRequestedServerNames() : this.p;
                        if (!this.q0.isEmpty()) {
                            try {
                                cl_51Var.g.c(new cl_104(this.q0));
                            } catch (IOException unused2) {
                            }
                        }
                    }
                    String[] strArr = this.r;
                    if (strArr != null && strArr.length > 0) {
                        cl_51Var.g.c(new cl_0(strArr));
                        this.p0 = true;
                    }
                    this.E = cl_51Var.c;
                    if (!this.c) {
                    }
                    cl_51Var.g.c(new cl_89(this.d, new byte[0]));
                    return cl_51Var;
                }
            }
        } else {
            str2 = "No existing session to resume";
        }
        dy31.u(str2);
        return null;
    }

    @Override // ru.CryptoPro.ssl.cl_63
    public final void d(byte b) {
        String alertDescription = Alerts.alertDescription(b);
        SSLLogger.fine("SSL - handshake alert: ", alertDescription);
        throw new SSLProtocolException(g8e.o("handshake alert:  ", alertDescription));
    }

    /* JADX WARN: Code restructure failed: missing block: B:423:0x07f4, code lost:
    
        if (L(r9, r0) != false) goto L415;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0498 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ru.CryptoPro.ssl.cl_63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(byte b, int i) {
        String str;
        String w;
        Collection<List<?>> collection;
        Collection<List<?>> collection2;
        String str2;
        PrivateKey privateKey;
        byte b2;
        byte b3;
        cl_47 cl_47Var;
        SecretKey secretKey;
        cl_25 cl_25Var;
        PublicKey publicKey;
        cl_109 cl_109Var;
        String str3;
        cl_75 cl_75Var;
        SSLSessionImpl sSLSessionImpl;
        String str4;
        PrivateKey privateKey2;
        cl_48 cl_48Var;
        X509Certificate[] certificateChain;
        PrivateKey privateKey3;
        String[] strArr;
        String str5;
        SSLSocketImpl sSLSocketImpl = this.x;
        SSLEngineImpl sSLEngineImpl = this.y;
        String str6 = "Server did not send certificate message";
        boolean z = cl_63.e0;
        if (this.C >= b && b != 0 && b != 4) {
            throw new SSLProtocolException(oyr.i(b, "Handshake message sequence violation, "));
        }
        if (b == 0) {
            new cl_56().f();
            if (this.C < 1) {
                if (!this.c) {
                    SSLLogger.fine("Warning: continue with insecure renegotiation");
                }
                F();
            }
        } else if (b == 2) {
            cl_46 cl_46Var = this.A;
            cl_59 cl_59Var = new cl_59();
            cl_59Var.g = new cl_67();
            cl_59Var.b = cl_84.a(cl_46Var.c(), cl_46Var.c());
            cl_59Var.c = new cl_87(cl_46Var);
            cl_106 cl_106Var = new cl_106(cl_46Var.n());
            cl_59Var.d = cl_106Var;
            cl_106Var.a();
            SSLLogger.fine("ServerHello sessionId: " + cl_59Var.d);
            cl_59Var.e = cl_8.b(cl_46Var.c(), cl_46Var.c());
            cl_59Var.f = (byte) cl_46Var.c();
            if (cl_59Var.c() != i) {
                cl_59Var.g = new cl_67(cl_46Var, true, cl_59Var.e.a.equalsIgnoreCase("TLS_CIPHER_2001"));
            }
            K(cl_59Var);
        } else if (b == 4) {
            cl_46 cl_46Var2 = this.A;
            cl_57 cl_57Var = new cl_57();
            cl_46Var2.e(4);
            cl_57Var.b = (cl_46Var2.c() << 24) | (cl_46Var2.c() << 16) | (cl_46Var2.c() << 8) | cl_46Var2.c();
            cl_57Var.c = cl_46Var2.g();
            cl_57Var.f();
            if (!z || !this.Z) {
                f(Alerts.alert_illegal_parameter, "Server sent the new_session_ticket improperly", null);
                throw null;
            }
            SSLSessionImpl sSLSessionImpl2 = this.G;
            byte[] b4 = cl_57Var.b();
            int e = cl_57Var.e();
            if (sSLSessionImpl2.c != null) {
                sSLSessionImpl2.c = null;
            }
            sSLSessionImpl2.d = System.currentTimeMillis();
            sSLSessionImpl2.e = e;
            sSLSessionImpl2.c = Array.copy(b4);
            this.Z = false;
        } else if (b != 20) {
            switch (b) {
                case 11:
                    cl_11 cl_11Var = this.I;
                    if (cl_11Var == cl_11.h || cl_11Var == cl_11.m || cl_11Var == cl_11.n || cl_11Var == cl_11.o) {
                        f((byte) 10, "unexpected server cert chain", null);
                        throw null;
                    }
                    cl_48 cl_48Var2 = new cl_48(this.A);
                    cl_48Var2.f();
                    X509Certificate[] x509CertificateArr = (X509Certificate[]) cl_48Var2.b.clone();
                    if (x509CertificateArr.length == 0) {
                        f(Alerts.alert_bad_certificate, "empty certificate chain", null);
                        throw null;
                    }
                    if (this.s0 != null && !this.G.i && ((w = w()) == null || w.length() == 0)) {
                        X509Certificate x509Certificate = x509CertificateArr[0];
                        X509Certificate x509Certificate2 = this.s0[0];
                        if (!x509Certificate.equals(x509Certificate2)) {
                            try {
                                collection = x509Certificate.getSubjectAlternativeNames();
                            } catch (CertificateParsingException e2) {
                                SSLLogger.subThrown("Attempt to obtain subjectAltNames extension failed!", e2);
                                collection = null;
                            }
                            try {
                                collection2 = x509Certificate2.getSubjectAlternativeNames();
                            } catch (CertificateParsingException e3) {
                                SSLLogger.subThrown("Attempt to obtain subjectAltNames extension failed!", e3);
                                collection2 = null;
                            }
                            if (collection != null && collection2 != null) {
                                HashSet G = G(7, collection);
                                HashSet G2 = G(7, collection2);
                                if (G == null || G2 == null || !L(G, G2)) {
                                    HashSet G3 = G(2, collection);
                                    HashSet G4 = G(2, collection2);
                                    if (G3 != null) {
                                        if (G4 != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                            X500Principal subjectX500Principal2 = x509Certificate2.getSubjectX500Principal();
                            X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                            X500Principal issuerX500Principal2 = x509Certificate2.getIssuerX500Principal();
                            if (subjectX500Principal.getName().isEmpty() || subjectX500Principal2.getName().isEmpty() || !subjectX500Principal.equals(subjectX500Principal2) || !issuerX500Principal.equals(issuerX500Principal2)) {
                                f(Alerts.alert_bad_certificate, "server certificate change is restricted during renegotiation", null);
                                throw null;
                            }
                        }
                    }
                    X509TrustManager x509TrustManager = this.D.f;
                    try {
                        cl_11 cl_11Var2 = this.I;
                        if (cl_11Var2 == cl_11.c && !this.n0) {
                            cl_11Var2 = cl_11.b;
                        }
                        String str7 = cl_11Var2.v;
                        if (!(x509TrustManager instanceof X509ExtendedTrustManager)) {
                            throw new CertificateException("Improper X509TrustManager implementation");
                        }
                        if (sSLSocketImpl != null) {
                            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted((X509Certificate[]) x509CertificateArr.clone(), str7, sSLSocketImpl);
                        } else {
                            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted((X509Certificate[]) x509CertificateArr.clone(), str7, sSLEngineImpl);
                        }
                        SSLSessionImpl sSLSessionImpl3 = this.G;
                        if (sSLSessionImpl3.f == null) {
                            sSLSessionImpl3.f = x509CertificateArr;
                        }
                        this.h0 = sSLSessionImpl3.getPeerCertificates()[0].getPublicKey();
                        break;
                    } catch (CertificateException e4) {
                        f(Alerts.alert_certificate_unknown, null, e4);
                        throw null;
                    }
                    break;
                case 12:
                    this.n0 = true;
                    switch (cl_18.a[this.I.ordinal()]) {
                        case 1:
                            PublicKey publicKey2 = this.h0;
                            if (publicKey2 == null) {
                                dy31.m("Server did not send certificate message");
                                return;
                            }
                            if (!(publicKey2 instanceof RSAPublicKey)) {
                                dy31.m("Protocol violation: the certificate type must be appropriate for the selected cipher suite's key exchange algorithm");
                                return;
                            }
                            if (cl_73.a(publicKey2) <= 512) {
                                throw new SSLProtocolException("Protocol violation: server sent a server key exchange message for key exchange " + this.I + " when the public key in the server certificate is less than or equal to 512 bits in length");
                            }
                            try {
                                cl_46 cl_46Var3 = this.A;
                                cl_58 cl_58Var = new cl_58();
                                int i2 = cl_86.e;
                                cl_58Var.d = cl_73.e("MD5andSHA1withRSA");
                                cl_58Var.b = cl_46Var3.g();
                                cl_58Var.c = cl_46Var3.g();
                                cl_58Var.e = cl_46Var3.g();
                                J(cl_58Var);
                                break;
                            } catch (GeneralSecurityException e5) {
                                cl_63.g("Server key", e5);
                                throw null;
                            }
                        case 2:
                            try {
                                H(new cl_52(this.A, this.a));
                                break;
                            } catch (GeneralSecurityException e6) {
                                cl_63.g("Server key", e6);
                                throw null;
                            }
                        case 3:
                        case 4:
                            try {
                                H(new cl_52(this.A, this.h0, this.E.a, this.F.a, i, x(), this.a));
                                break;
                            } catch (GeneralSecurityException e7) {
                                cl_63.g("Server key", e7);
                                throw null;
                            }
                        case 5:
                        case 6:
                        case 7:
                            try {
                                I(new cl_54(this.A, this.h0, this.E.a, this.F.a, x(), this.a));
                                break;
                            } catch (GeneralSecurityException e8) {
                                cl_63.g("Server key", e8);
                                throw null;
                            }
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            throw new SSLProtocolException("Protocol violation: server sent a server key exchange message for key exchange " + this.I);
                        case 13:
                        case 14:
                            dy31.m("unexpected receipt of server key exchange algorithm");
                            return;
                        default:
                            throw new SSLProtocolException("unsupported key exchange algorithm = " + this.I);
                    }
                case 13:
                    cl_11 cl_11Var3 = this.I;
                    if (cl_11Var3 == cl_11.h || cl_11Var3 == cl_11.m) {
                        dy31.u("Client authentication requested for anonymous cipher suite.");
                        return;
                    }
                    if (cl_11Var3 == cl_11.n || cl_11Var3 == cl_11.o) {
                        dy31.u("Client certificate requested for kerberos cipher suite.");
                        return;
                    }
                    cl_46 cl_46Var4 = this.A;
                    cl_84 cl_84Var = this.a;
                    cl_49 cl_49Var = new cl_49();
                    cl_49Var.g = false;
                    cl_49Var.d = cl_84Var;
                    cl_49Var.b = cl_46Var4.n();
                    if (cl_84Var.n >= cl_84.z.n) {
                        int d = cl_46Var4.d();
                        cl_49Var.f = d;
                        if (d < 2) {
                            throw new SSLProtocolException(oyr.i(d, "Invalid supported_signature_algorithms field: "));
                        }
                        cl_49Var.e = new ArrayList();
                        int i3 = 0;
                        while (d > 1) {
                            i3++;
                            cl_49Var.e.add(cl_109.c(cl_46Var4.c(), cl_46Var4.c(), i3));
                            d -= 2;
                        }
                        if (d != 0) {
                            throw new SSLProtocolException(oyr.i(d, "Invalid supported_signature_algorithms field. remains: "));
                        }
                    } else {
                        cl_49Var.e = new ArrayList();
                        cl_49Var.f = 0;
                    }
                    int d2 = cl_46Var4.d();
                    ArrayList arrayList = new ArrayList();
                    while (d2 >= 3) {
                        cl_53 cl_53Var = new cl_53();
                        byte[] g = cl_46Var4.g();
                        cl_53Var.a = g;
                        arrayList.add(cl_53Var);
                        d2 -= g.length + 2;
                    }
                    if (d2 != 0) {
                        throw new SSLProtocolException(oyr.i(d2, "Bad CertificateRequest DN length: "));
                    }
                    cl_53[] cl_53VarArr = (cl_53[]) arrayList.toArray(new cl_53[arrayList.size()]);
                    cl_49Var.c = cl_53VarArr;
                    SSLLogger.fine("Received authorities list's size: " + cl_53VarArr.length + " element(s)");
                    this.m0 = cl_49Var;
                    cl_49Var.f();
                    if (this.a.n >= cl_84.z.n) {
                        ArrayList arrayList2 = this.m0.e;
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            dy31.u("No peer supported signature algorithms");
                            return;
                        }
                        ArrayList b5 = cl_109.b(this.i, arrayList2);
                        if (b5.isEmpty()) {
                            dy31.u("No supported signature and hash algorithm in common");
                            return;
                        }
                        this.m = new ArrayList(b5);
                        SSLSessionImpl sSLSessionImpl4 = this.G;
                        sSLSessionImpl4.getClass();
                        sSLSessionImpl4.t = cl_109.f(b5);
                        break;
                    }
                    break;
                case 14:
                    new cl_60().f();
                    this.A.a();
                    if (this.m0 != null) {
                        SSLLogger.fine("Certificate request received...");
                        X509ExtendedKeyManager x509ExtendedKeyManager = this.D.e;
                        ArrayList arrayList3 = new ArrayList(4);
                        byte[] bArr = this.m0.b;
                        cl_11 cl_11Var4 = this.I;
                        boolean z2 = cl_11Var4 == cl_11.q || cl_11Var4 == cl_11.r || cl_11Var4 == cl_11.s || cl_11Var4 == cl_11.t || cl_11Var4 == cl_11.u;
                        if (z2) {
                            bArr = cl_49.D;
                        }
                        int[] iArr = new int[bArr.length];
                        for (int i4 = 0; i4 < bArr.length; i4++) {
                            iArr[i4] = bArr[i4] & 255;
                        }
                        if (z2) {
                            Arrays.sort(iArr);
                            iArr = Array.intOrderI(iArr);
                        }
                        for (int i5 : iArr) {
                            if (i5 == 1) {
                                str5 = "RSA";
                            } else if (i5 == 2) {
                                str5 = "DSA";
                            } else if (i5 == 21 || i5 == 22) {
                                str5 = JCP.GOST_EL_DEGREE_NAME;
                            } else {
                                if (i5 == 64) {
                                    boolean z3 = cl_73.a;
                                    synchronized (cl_73.class) {
                                    }
                                } else if (i5 == 238) {
                                    str5 = JCP.GOST_EL_2012_256_NAME;
                                } else if (i5 == 239) {
                                    str5 = JCP.GOST_EL_2012_512_NAME;
                                }
                                str5 = null;
                            }
                            if (str5 != null && !arrayList3.contains(str5)) {
                                arrayList3.add(str5);
                            }
                        }
                        if (z2) {
                            SSLLogger.fine("Search for client containers with GOST algorithms...");
                            int size = arrayList3.size();
                            if (size != 0) {
                                String[] strArr2 = (String[]) arrayList3.toArray(new String[size]);
                                int length = strArr2.length;
                                int i6 = 0;
                                boolean z4 = false;
                                PrivateKey privateKey4 = null;
                                cl_48 cl_48Var3 = null;
                                while (true) {
                                    if (i6 < length) {
                                        String str8 = strArr2[i6];
                                        SSLLogger.fine("Search for client containers with any GOST algorithm...");
                                        String[] clientAliases = x509ExtendedKeyManager.getClientAliases(str8, this.m0.h());
                                        if (clientAliases == null) {
                                            SSLLogger.fine("Appropriate client aliases not found.");
                                        }
                                        if (clientAliases != null) {
                                            int length2 = clientAliases.length;
                                            str2 = str6;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < length2) {
                                                    int i8 = i7;
                                                    String str9 = clientAliases[i8];
                                                    strArr = strArr2;
                                                    String[] strArr3 = clientAliases;
                                                    SSLLogger.fine("Checking private key: " + str9);
                                                    X509Certificate[] certificateChain2 = x509ExtendedKeyManager.getCertificateChain(str9);
                                                    if (certificateChain2 == null || certificateChain2.length == 0) {
                                                        i7 = i8 + 1;
                                                        strArr2 = strArr;
                                                        clientAliases = strArr3;
                                                    } else {
                                                        SSLLogger.fine("Certificate chain " + str9 + " found.");
                                                        privateKey3 = x509ExtendedKeyManager.getPrivateKey(str9);
                                                        SSLLogger.fine("Private key " + str9 + " is available.");
                                                        StringBuilder sb = new StringBuilder("%% Chosen client alias: ");
                                                        sb.append(str9);
                                                        SSLLogger.fine(sb.toString());
                                                        cl_48Var = new cl_48(certificateChain2);
                                                        SSLSessionImpl sSLSessionImpl5 = this.G;
                                                        sSLSessionImpl5.r = privateKey3;
                                                        sSLSessionImpl5.q = certificateChain2;
                                                        z4 = true;
                                                    }
                                                } else {
                                                    strArr = strArr2;
                                                    privateKey3 = privateKey4;
                                                    cl_48Var = cl_48Var3;
                                                }
                                            }
                                            if (!z4) {
                                                cl_48Var3 = cl_48Var;
                                                privateKey4 = privateKey3;
                                            }
                                        } else {
                                            str2 = str6;
                                            strArr = strArr2;
                                            SSLLogger.fine("Containers not found.");
                                        }
                                        i6++;
                                        str6 = str2;
                                        strArr2 = strArr;
                                    } else {
                                        str2 = str6;
                                        privateKey3 = privateKey4;
                                        cl_48Var = cl_48Var3;
                                    }
                                }
                            } else {
                                str2 = "Server did not send certificate message";
                                cl_48Var = null;
                                privateKey3 = null;
                            }
                            privateKey2 = privateKey3;
                        } else {
                            str2 = "Server did not send certificate message";
                            SSLLogger.fine("Search for client containers with other algorithms...");
                            int size2 = arrayList3.size();
                            if (size2 != 0) {
                                String[] strArr4 = (String[]) arrayList3.toArray(new String[size2]);
                                X500Principal[] h = this.m0.h();
                                str4 = sSLSocketImpl != null ? x509ExtendedKeyManager.chooseClientAlias(strArr4, h, sSLSocketImpl) : x509ExtendedKeyManager.chooseEngineClientAlias(strArr4, h, sSLEngineImpl);
                            } else {
                                str4 = null;
                            }
                            if (str4 != null && (certificateChain = x509ExtendedKeyManager.getCertificateChain(str4)) != null && certificateChain.length != 0) {
                                PublicKey publicKey3 = certificateChain[0].getPublicKey();
                                if ((publicKey3 instanceof ECPublicKey) && !cl_26.d(cl_26.c(((ECPublicKey) publicKey3).getParams()))) {
                                    publicKey3 = null;
                                }
                                if (publicKey3 != null) {
                                    cl_48 cl_48Var4 = new cl_48(certificateChain);
                                    privateKey2 = x509ExtendedKeyManager.getPrivateKey(str4);
                                    SSLSessionImpl sSLSessionImpl6 = this.G;
                                    sSLSessionImpl6.r = privateKey2;
                                    sSLSessionImpl6.q = certificateChain;
                                    cl_48Var = cl_48Var4;
                                }
                            }
                            privateKey2 = null;
                            cl_48Var = null;
                        }
                        if (cl_48Var == null) {
                            SSLLogger.fine("No appropriate cert was found.");
                            if (this.a.n >= cl_84.x.n) {
                                cl_48Var = new cl_48(new X509Certificate[0]);
                            } else if (sSLSocketImpl != null) {
                                sSLSocketImpl.a((byte) 1, Alerts.alert_no_certificate);
                            } else {
                                sSLEngineImpl.d((byte) 1, Alerts.alert_no_certificate);
                            }
                            SSLLogger.fine("Warning: no suitable certificate found - continuing without client authentication");
                        }
                        if (cl_48Var != null) {
                            cl_48Var.f();
                            cl_48Var.c(this.B);
                        }
                        privateKey = privateKey2;
                    } else {
                        str2 = "Server did not send certificate message";
                        privateKey = null;
                    }
                    switch (cl_18.a[this.I.ordinal()]) {
                        case 1:
                        case 8:
                            PublicKey publicKey4 = this.h0;
                            if (publicKey4 == null) {
                                dy31.m(str2);
                                return;
                            }
                            if (!(publicKey4 instanceof RSAPublicKey)) {
                                dy31.m("Server certificate does not include an RSA key");
                                return;
                            }
                            if (this.I != cl_11.b) {
                                if (cl_73.a(publicKey4) <= 512) {
                                    publicKey4 = this.h0;
                                } else {
                                    publicKey4 = this.i0;
                                    if (publicKey4 == null) {
                                        dy31.m("Server did not send a RSA_EXPORT Server Key Exchange message");
                                        return;
                                    }
                                }
                            }
                            cl_84 cl_84Var2 = this.a;
                            cl_84 cl_84Var3 = this.o0;
                            SecureRandom secureRandom = this.D.g;
                            cl_85 cl_85Var = new cl_85();
                            if (!publicKey4.getAlgorithm().equals("RSA")) {
                                throw new SSLKeyException("Public key not of type RSA");
                            }
                            cl_85Var.b = cl_84Var2;
                            if (cl_85.e || cl_84Var3.n >= cl_84.y.n) {
                                byte b6 = cl_84Var3.o;
                                b2 = cl_84Var3.p;
                                b3 = b6;
                            } else {
                                b3 = cl_84Var2.o;
                                b2 = cl_84Var2.p;
                            }
                            try {
                                String str10 = cl_84Var2.n >= cl_84.z.n ? "JavaTls12RsaPremasterSecret" : "JavaTlsRsaPremasterSecret";
                                KeyGenerator keyGenerator = KeyGenerator.getInstance(str10, cl_73.g(str10));
                                ev61 ev61Var = new ev61();
                                rq61.a(b3);
                                rq61.a(b2);
                                keyGenerator.init(ev61Var, secureRandom);
                                SecretKey generateKey = keyGenerator.generateKey();
                                cl_85Var.c = generateKey;
                                Cipher c = cl_73.c("RSA/ECB/PKCS1Padding");
                                c.init(3, publicKey4, secureRandom);
                                cl_85Var.d = c.wrap(generateKey);
                                cl_47Var = cl_85Var;
                                break;
                            } catch (GeneralSecurityException e9) {
                                throw ((SSLKeyException) new SSLKeyException("RSA premaster secret error").initCause(e9));
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                            if (this.k0 == null) {
                                dy31.m("Server did not send a DH Server Key Exchange message");
                                return;
                            }
                            BigInteger bigInteger = this.k0.d;
                            cl_20 cl_20Var = new cl_20();
                            cl_20Var.b = cl_47.b(bigInteger);
                            cl_47Var = cl_20Var;
                            break;
                        case 5:
                        case 6:
                        case 7:
                            if (this.l0 != null) {
                                cl_47Var = new cl_24(this.l0.b);
                                break;
                            } else {
                                dy31.m("Server did not send a ECDH Server Key Exchange message");
                                return;
                            }
                        case 9:
                        case 10:
                            cl_20 cl_20Var2 = new cl_20();
                            cl_20Var2.b = null;
                            cl_47Var = cl_20Var2;
                            break;
                        case 11:
                        case 12:
                            PublicKey publicKey5 = this.h0;
                            if (publicKey5 != null) {
                                if (publicKey5 instanceof ECPublicKey) {
                                    this.l0 = new cl_25(((ECPublicKey) publicKey5).getParams(), this.D.g);
                                    cl_47Var = new cl_24(this.l0.b);
                                    break;
                                } else {
                                    dy31.m("Server certificate does not include an EC key");
                                    return;
                                }
                            } else {
                                dy31.m(str2);
                                return;
                            }
                        case 13:
                        case 14:
                            Iterator it = this.q0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    SNIServerName sNIServerName = (SNIServerName) it.next();
                                    if (sNIServerName instanceof SNIHostName) {
                                        str3 = ((SNIHostName) sNIServerName).getAsciiName();
                                    }
                                } else {
                                    str3 = null;
                                }
                            }
                            if (str3 != null) {
                                try {
                                    cl_75Var = new cl_75(str3, v(), this.a, this.D.g);
                                } catch (IOException e10) {
                                    if (this.r0) {
                                        throw e10;
                                    }
                                    SSLLogger.subThrown("Warning, cannot use Server Name Indication: " + e10.getMessage(), e10);
                                }
                                if (cl_75Var == null) {
                                    String p = p();
                                    if (p == null) {
                                        ny61.v("Hostname is required to use Kerberos cipher suites");
                                        return;
                                    }
                                    cl_75Var = new cl_75(p, v(), this.a, this.D.g);
                                }
                                cl_75 cl_75Var2 = cl_75Var;
                                sSLSessionImpl = this.G;
                                Principal e11 = cl_75Var2.e();
                                if (sSLSessionImpl.v == null) {
                                    sSLSessionImpl.v = e11;
                                }
                                this.G.w = cl_75Var2.g();
                                cl_47Var = cl_75Var2;
                                break;
                            }
                            cl_75Var = null;
                            if (cl_75Var == null) {
                            }
                            cl_75 cl_75Var22 = cl_75Var;
                            sSLSessionImpl = this.G;
                            Principal e112 = cl_75Var22.e();
                            if (sSLSessionImpl.v == null) {
                            }
                            this.G.w = cl_75Var22.g();
                            cl_47Var = cl_75Var22;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            try {
                                if (!cpSSLConfig.isJCP()) {
                                    PublicKey publicKey6 = this.h0;
                                    if (publicKey6 instanceof GostPublicKey) {
                                        try {
                                            this.h0 = ParamUtil.convertJCP2JCSP(publicKey6, cpSSLConfig.getDefaultDigestSignatureSSLProvider());
                                        } catch (InvalidKeySpecException e12) {
                                            RuntimeException runtimeException = new RuntimeException("Invalid server public key");
                                            runtimeException.initCause(e12);
                                            throw runtimeException;
                                        }
                                    }
                                }
                                SSLLogger.fine("Generate pre-master-key.");
                                cl_47Var = new cl_37(this.H, this.E.a, this.F.a, this.h0);
                                break;
                            } catch (IOException e13) {
                                RuntimeException runtimeException2 = new RuntimeException("Invalid key exchange", e13);
                                runtimeException2.initCause(e13);
                                throw runtimeException2;
                            }
                        default:
                            dy31.l(this.I, "Unsupported key exchange: ");
                            return;
                    }
                    cl_47Var.f();
                    cl_47Var.c(this.B);
                    this.B.c.v();
                    this.B.flush();
                    switch (cl_18.a[this.I.ordinal()]) {
                        case 1:
                        case 8:
                            secretKey = ((cl_85) cl_47Var).c;
                            try {
                                h(secretKey);
                                if (privateKey != null) {
                                    try {
                                        if (this.a.n >= cl_84.z.n) {
                                            cl_109 d3 = cl_109.d(this.m, privateKey.getAlgorithm(), privateKey);
                                            if (d3 == null) {
                                                throw new SSLHandshakeException("No supported signature algorithm");
                                            }
                                            String str11 = d3.a.n;
                                            if (str11 == null || str11.length() == 0) {
                                                throw new SSLHandshakeException("No supported hash algorithm");
                                            }
                                            cl_109Var = d3;
                                        } else {
                                            cl_109Var = null;
                                        }
                                        SSLLogger.fine("Make certificate verify.");
                                        cl_50 cl_50Var = new cl_50(this.a, this.z, privateKey, this.G.h, this.D.g, cl_109Var);
                                        cl_50Var.f();
                                        cl_50Var.c(this.B);
                                        this.B.c.v();
                                    } catch (GeneralSecurityException e14) {
                                        f(Alerts.alert_handshake_failure, "Error signing certificate verify", e14);
                                        throw null;
                                    }
                                }
                                M(false);
                                break;
                            } catch (InvalidKeyException e15) {
                                RuntimeException runtimeException3 = new RuntimeException("Invalid key exchange", e15);
                                runtimeException3.initCause(e15);
                                throw runtimeException3;
                            }
                        case 2:
                        case 3:
                        case 4:
                            secretKey = this.k0.a(this.j0, true);
                            h(secretKey);
                            if (privateKey != null) {
                            }
                            M(false);
                            break;
                        case 5:
                        case 6:
                        case 7:
                            cl_25Var = this.l0;
                            publicKey = this.i0;
                            secretKey = cl_25Var.a(publicKey);
                            h(secretKey);
                            if (privateKey != null) {
                            }
                            M(false);
                            break;
                        case 9:
                        case 10:
                        default:
                            w511.r(this.I, "Internal error: unknown key exchange ");
                            return;
                        case 11:
                        case 12:
                            cl_25Var = this.l0;
                            publicKey = this.h0;
                            secretKey = cl_25Var.a(publicKey);
                            h(secretKey);
                            if (privateKey != null) {
                            }
                            M(false);
                            break;
                        case 13:
                        case 14:
                            secretKey = new SecretKeySpec(((cl_75) cl_47Var).b(), "TlsPremasterSecret");
                            h(secretKey);
                            if (privateKey != null) {
                            }
                            M(false);
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            SSLLogger.fine("Unwrap client key exchange to pre-master-key.");
                            secretKey = ((cl_37) cl_47Var).e();
                            h(secretKey);
                            if (privateKey != null) {
                            }
                            M(false);
                            break;
                    }
                default:
                    throw new SSLProtocolException(oyr.i(b, "Illegal client handshake msg, "));
            }
        } else {
            if (z && this.Z) {
                f(Alerts.alert_handshake_failure, "Server didn't send the new_session_ticket", null);
                throw null;
            }
            if (!(sSLSocketImpl != null ? sSLSocketImpl.x : sSLEngineImpl.h)) {
                f(Alerts.alert_handshake_failure, "Received Finished message before ChangeCipherSpec", null);
                throw null;
            }
            cl_55 cl_55Var = new cl_55(this.a, this.A, this.H);
            cl_55Var.f();
            if (!Arrays.equals(cl_55Var.e(this.z, 2, this.G.h, cl_55Var.d), cl_55Var.b)) {
                f(Alerts.alert_illegal_parameter, "server 'finished' message doesn't verify", null);
                throw null;
            }
            if (this.c) {
                this.e = cl_55Var.b;
            }
            if (!this.f) {
                this.G.y = false;
            }
            if (this.J) {
                this.A.a();
                M(true);
            }
            this.G.k = System.currentTimeMillis();
            if (!this.J) {
                if (this.G.b()) {
                    this.D.b.a(this.G);
                    str = "%% Cached client session: ";
                } else {
                    str = "%% Didn't cache non-resumable client session: ";
                }
                SSLLogger.fine(str, this.G);
            }
        }
        if (this.C < b) {
            this.C = b;
        }
    }
}
