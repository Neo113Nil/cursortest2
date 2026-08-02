package ru.CryptoPro.ssl;

import defpackage.dy31;
import defpackage.g8e;
import defpackage.htf0;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.AlgorithmConstraints;
import java.security.CryptoPrimitive;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PrivilegedActionException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SNIMatcher;
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
import ru.CryptoPro.JCP.Key.MasterSecretInterface;
import ru.CryptoPro.ssl.util.GostKeyUtil;
import ru.CryptoPro.ssl.util.KeyUtil;
import ru.CryptoPro.ssl.util.LegacyAlgorithmConstraints;
import ru.CryptoPro.ssl.util.ParamUtil;

/* loaded from: classes4.dex */
final class cl_99 extends cl_63 {
    public static final boolean u0;
    public static final boolean v0;
    public static final int w0;
    public static final LegacyAlgorithmConstraints x0 = new LegacyAlgorithmConstraints(LegacyAlgorithmConstraints.PROPERTY_TLS_LEGACY_ALGS, new cl_92(false));
    public byte h0;
    public X509Certificate[] i0;
    public PrivateKey j0;
    public PublicKey k0;
    public Object l0;
    public boolean m0;
    public PrivateKey n0;
    public PublicKey o0;
    public cl_21 p0;
    public cl_25 q0;
    public cl_84 r0;
    public cl_26 s0;
    public cl_109 t0;

    static {
        String str = (String) AccessController.doPrivileged(new htf0("jdk.tls.ephemeralDHKeySize", 6));
        if (str == null || str.length() == 0) {
            v0 = false;
            u0 = false;
            w0 = -1;
            return;
        }
        if ("matched".equals(str)) {
            v0 = false;
            u0 = true;
            w0 = -1;
        } else {
            if ("legacy".equals(str)) {
                v0 = true;
                u0 = false;
                w0 = -1;
                return;
            }
            v0 = false;
            u0 = false;
            try {
                int parseUnsignedInt = ParamUtil.parseUnsignedInt(str);
                w0 = parseUnsignedInt;
                if (parseUnsignedInt < 1024 || parseUnsignedInt > 2048) {
                    throw new IllegalArgumentException("Customized DH key size should be positive integer between 1024 and 2048 bits, inclusive");
                }
            } catch (NumberFormatException unused) {
                ny61.g("Invalid system property jdk.tls.ephemeralDHKeySize");
            }
        }
    }

    public final boolean G() {
        int i;
        cl_26 cl_26Var = this.s0;
        if (cl_26Var != null) {
            int[] iArr = cl_26Var.e;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i = -1;
                    break;
                }
                i = iArr[i2];
                if (cl_26.d(i)) {
                    break;
                }
                i2++;
            }
            if (i < 0) {
                return false;
            }
        } else {
            i = cl_26.f.e[0];
        }
        String str = (String) cl_26.h.get(Integer.valueOf(i));
        SecureRandom secureRandom = this.D.g;
        cl_25 cl_25Var = new cl_25();
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", cl_73.g("EC"));
            keyPairGenerator.initialize(new ECGenParameterSpec(str), secureRandom);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            cl_25Var.a = generateKeyPair.getPrivate();
            cl_25Var.b = (ECPublicKey) generateKeyPair.getPublic();
            this.q0 = cl_25Var;
            return true;
        } catch (GeneralSecurityException e) {
            ny61.n("Could not generate DH keypair", e);
            return false;
        }
    }

    public final void H(Key key, boolean z) {
        int i = z ? 512 : 1024;
        if (!z) {
            if (v0) {
                i = 768;
            } else if (!u0) {
                int i2 = w0;
                if (i2 > 0) {
                    i = i2;
                }
            } else if (key != null) {
                i = KeyUtil.getKeySize(key) > 1024 ? 2048 : 1024;
            }
        }
        SecureRandom secureRandom = this.D.g;
        cl_21 cl_21Var = new cl_21();
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DiffieHellman", cl_73.g("DiffieHellman"));
            keyPairGenerator.initialize(i, secureRandom);
            DHPublicKeySpec b = cl_21Var.b(keyPairGenerator);
            if (b == null) {
                throw new RuntimeException("Could not generate DH keypair");
            }
            cl_21Var.d = b.getY();
            cl_21Var.a = b.getP();
            cl_21Var.b = b.getG();
            this.p0 = cl_21Var;
        } catch (GeneralSecurityException e) {
            ny61.n("Could not generate DH keypair", e);
        }
    }

    public final void I(cl_50 cl_50Var) {
        String str;
        cl_50Var.f();
        if (this.a.n >= cl_84.z.n) {
            cl_109 cl_109Var = cl_50Var.d;
            if (cl_109Var != null) {
                String str2 = cl_109Var.a.n;
                str = (str2 == null || str2.length() == 0) ? "No supported hash algorithm" : "Illegal CertificateVerify message";
            }
            dy31.u(str);
            return;
        }
        try {
            PublicKey publicKey = this.G.getPeerCertificates()[0].getPublicKey();
            cl_84 cl_84Var = this.a;
            cl_45 cl_45Var = this.z;
            SecretKey secretKey = this.G.h;
            if (cl_50Var.g(cl_84Var, cl_45Var, publicKey)) {
                this.m0 = false;
            } else {
                f(Alerts.alert_bad_certificate, "certificate verify message signature error", null);
                throw null;
            }
        } catch (GeneralSecurityException e) {
            f(Alerts.alert_bad_certificate, "certificate verify format error", e);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b4, code lost:
    
        if (r3.isEmpty() == false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07d6 A[LOOP:5: B:380:0x07d3->B:382:0x07d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0510  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(cl_51 cl_51Var) {
        boolean z;
        String str;
        boolean z2;
        SSLEngineImpl sSLEngineImpl;
        boolean z3;
        SSLSessionImpl sSLSessionImpl;
        cl_106 cl_106Var;
        SSLSessionImpl sSLSessionImpl2;
        int i;
        cl_84 cl_84Var;
        cl_38 cl_38Var;
        boolean z4;
        cl_47 cl_54Var;
        cl_11 cl_11Var;
        Collection collection;
        X509Certificate[] acceptedIssuers;
        cl_49 cl_49Var;
        cl_11 cl_11Var2;
        cl_84 cl_84Var2;
        cl_14 A;
        byte b;
        cl_11 cl_11Var3;
        Map map;
        ArrayList arrayList;
        cl_108 cl_108Var;
        SSLSessionImpl sSLSessionImpl3;
        boolean b2;
        boolean z5;
        String w;
        String str2;
        cl_11 cl_11Var4;
        Subject subject;
        String str3;
        boolean z6;
        boolean z7;
        String str4;
        String str5 = "No supported signature algorithm";
        boolean z8 = cl_63.d0;
        SSLSocketImpl sSLSocketImpl = this.x;
        SSLEngineImpl sSLEngineImpl2 = this.y;
        cl_51Var.f();
        cl_84 cl_84Var3 = cl_51Var.b;
        cl_14 cl_14Var = cl_51Var.e;
        cl_67 cl_67Var = cl_51Var.g;
        if (cl_63.c0 && !this.f && this.C != 0) {
            f(Alerts.alert_handshake_failure, "Client initiated renegotiation is not allowed", null);
            throw null;
        }
        cl_104 cl_104Var = (cl_104) cl_67Var.a(cl_36.d);
        if (!this.q.isEmpty() && cl_104Var != null) {
            Collection<SNIMatcher> collection2 = this.q;
            Map map2 = cl_104Var.e;
            if (map2 != null && !map2.isEmpty()) {
                for (SNIMatcher sNIMatcher : collection2) {
                    String str6 = str5;
                    SNIServerName sNIServerName = (SNIServerName) map2.get(Integer.valueOf(sNIMatcher.getType()));
                    if (sNIServerName != null && !sNIMatcher.matches(sNIServerName)) {
                        f(Alerts.alert_unrecognized_name, "Unrecognized server name indication", null);
                        throw null;
                    }
                    str5 = str6;
                }
            }
        }
        String str7 = str5;
        if (!cl_14Var.a.contains(cl_8.b0)) {
            z = false;
        } else {
            if (!this.f) {
                if (this.c) {
                    f(Alerts.alert_handshake_failure, "The SCSV is present in a secure renegotiation", null);
                    throw null;
                }
                f(Alerts.alert_handshake_failure, "The SCSV is present in a insecure renegotiation", null);
                throw null;
            }
            this.c = true;
            z = true;
        }
        cl_89 cl_89Var = (cl_89) cl_67Var.a(cl_36.k);
        boolean z9 = this.f;
        if (cl_89Var != null) {
            if (z9) {
                if (!cl_89Var.c()) {
                    f(Alerts.alert_handshake_failure, "The renegotiation_info field is not empty", null);
                    throw null;
                }
                this.c = true;
            } else {
                if (!this.c) {
                    f(Alerts.alert_handshake_failure, "The renegotiation_info is present in a insecure renegotiation", null);
                    throw null;
                }
                if (!Arrays.equals(this.d, cl_89Var.e)) {
                    f(Alerts.alert_handshake_failure, "Incorrect verify data in ClientHello renegotiation_info message", null);
                    throw null;
                }
            }
            z = true;
        } else if (!z9 && this.c) {
            f(Alerts.alert_handshake_failure, "Inconsistent secure renegotiation indication", null);
            throw null;
        }
        if (!z || !this.c) {
            if (!this.f) {
                str = "Warning: continue with insecure renegotiation";
            } else {
                if (!cl_63.b0) {
                    f(Alerts.alert_handshake_failure, "Failed to negotiate the use of secure renegotiation", null);
                    throw null;
                }
                str = "Warning: No renegotiation indication in ClientHello, allow legacy ClientHello";
            }
            SSLLogger.info(str);
        }
        if (z8) {
            if (((cl_35) cl_67Var.a(cl_36.i)) != null) {
                this.X = true;
            } else if (cl_84Var3.n >= cl_84.x.n && !cl_63.g0) {
                f(Alerts.alert_handshake_failure, "Extended Master Secret extension is required", null);
                throw null;
            }
        }
        this.A.a();
        cl_59 cl_59Var = new cl_59();
        cl_59Var.g = new cl_67();
        this.r0 = cl_84Var3;
        if (this.n == null) {
            this.n = B();
        }
        Iterator it = this.n.a.iterator();
        cl_84 cl_84Var4 = null;
        while (true) {
            if (!it.hasNext()) {
                z2 = z8;
                break;
            }
            cl_84 cl_84Var5 = (cl_84) it.next();
            z2 = z8;
            Iterator it2 = it;
            if (cl_84Var5.n > cl_84Var3.n) {
                break;
            }
            cl_84Var4 = cl_84Var5;
            z8 = z2;
            it = it2;
        }
        if (cl_84Var4 == null || cl_84Var4.n == cl_84.c.n) {
            f(Alerts.alert_handshake_failure, "Client requested protocol " + this.r0 + " not enabled or not supported", null);
            throw null;
        }
        n(cl_84Var4);
        cl_59Var.b = this.a;
        this.E = cl_51Var.c;
        cl_87 cl_87Var = new cl_87(this.D.g);
        this.F = cl_87Var;
        cl_59Var.c = cl_87Var;
        cl_0 cl_0Var = (cl_0) cl_67Var.a(cl_36.h);
        boolean z10 = ((sSLEngineImpl2 == null || this.t == null) && (sSLSocketImpl == null || this.u == null)) ? false : true;
        if (z10) {
            sSLEngineImpl = sSLEngineImpl2;
            z3 = z10;
        } else {
            if (cl_0Var != null) {
                String[] strArr = this.r;
                z3 = z10;
                if (strArr.length > 0) {
                    List list = cl_0Var.f;
                    sSLEngineImpl = sSLEngineImpl2;
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            str4 = null;
                            break;
                        }
                        int i3 = length;
                        str4 = strArr[i2];
                        if (list.contains(str4)) {
                            break;
                        }
                        i2++;
                        length = i3;
                    }
                    if (str4 == null) {
                        f(Alerts.alert_no_application_protocol, null, new SSLHandshakeException("No matching ALPN values"));
                        throw null;
                    }
                    this.s = str4;
                }
            } else {
                z3 = z10;
            }
            sSLEngineImpl = sSLEngineImpl2;
            sSLSessionImpl = null;
            this.s = "";
            this.G = sSLSessionImpl;
            cl_106Var = cl_51Var.d;
            byte b3 = 2;
            if (cl_106Var.a.length != 0 && (sSLSessionImpl3 = (SSLSessionImpl) this.D.c.getSession(cl_106Var.b())) != null) {
                b2 = sSLSessionImpl3.b();
                this.J = b2;
                if (b2 || sSLSessionImpl3.a == cl_84Var3) {
                    z5 = false;
                } else {
                    z5 = false;
                    this.J = false;
                }
                if (this.J && z2) {
                    z7 = this.X;
                    if (z7 || sSLSessionImpl3.i) {
                        if (z7 && sSLSessionImpl3.i) {
                            f(Alerts.alert_handshake_failure, "Missing Extended Master Secret extension on session resumption", null);
                            throw null;
                        }
                        if (!z7 && !sSLSessionImpl3.i) {
                            if (cl_63.f0) {
                                f(Alerts.alert_handshake_failure, "Missing Extended Master Secret extension on session resumption", null);
                                throw null;
                            }
                            this.J = false;
                        }
                    } else {
                        this.J = z5;
                    }
                }
                if (this.J) {
                    List<SNIServerName> requestedServerNames = sSLSessionImpl3.getRequestedServerNames();
                    if (cl_104Var != null) {
                        int size = requestedServerNames.size();
                        Map map3 = cl_104Var.e;
                        if (size == map3.size()) {
                            for (SNIServerName sNIServerName2 : requestedServerNames) {
                                SNIServerName sNIServerName3 = (SNIServerName) map3.get(Integer.valueOf(sNIServerName2.getType()));
                                if (sNIServerName3 != null && sNIServerName2.equals(sNIServerName3)) {
                                }
                            }
                            if (!this.J) {
                                SSLLogger.fine("The requested server name indication is not identical to the previous one");
                            }
                        }
                        z6 = false;
                        this.J = z6;
                        if (!this.J) {
                        }
                    } else {
                        z6 = false;
                    }
                }
                if (this.J && this.h0 == 2) {
                    try {
                        sSLSessionImpl3.getPeerPrincipal();
                    } catch (SSLPeerUnverifiedException unused) {
                        this.J = false;
                    }
                }
                if (this.J && ((cl_11Var4 = sSLSessionImpl3.g.w) == cl_11.n || cl_11Var4 == cl_11.o)) {
                    Principal localPrincipal = sSLSessionImpl3.getLocalPrincipal();
                    try {
                        subject = (Subject) AccessController.doPrivileged(new cl_100(this));
                    } catch (PrivilegedActionException unused2) {
                        SSLLogger.fine("Attempt to obtain subject failed!");
                        subject = null;
                    }
                    if (subject != null) {
                        this.J = false;
                        str3 = "Kerberos credentials are not present in the current Subject; check if javax.security.auth.useSubjectAsCreds system property has been set to false";
                    } else if (cl_77.a(subject, localPrincipal)) {
                        str3 = "Subject can provide creds for princ";
                    } else {
                        this.J = false;
                        str3 = "Subject cannot provide creds for princ";
                    }
                    SSLLogger.fine(str3);
                }
                w = w();
                if (this.J && w != null) {
                    str2 = sSLSessionImpl3.x;
                    if (!w.equals(str2)) {
                        SSLLogger.fine("%% can't resume, endpoint id algorithm does not match, requested: " + w + ", cached: " + str2);
                        this.J = false;
                    }
                }
                if (this.J) {
                    cl_8 cl_8Var = sSLSessionImpl3.g;
                    if (s(cl_8Var) && cl_14Var.a.contains(cl_8Var)) {
                        this.H = cl_8Var;
                        this.I = cl_8Var.w;
                    } else {
                        this.J = false;
                    }
                }
                if (this.J) {
                    this.G = sSLSessionImpl3;
                    SSLLogger.fine("%% Resuming", sSLSessionImpl3);
                }
            }
            sSLSessionImpl2 = this.G;
            if (sSLSessionImpl2 == null) {
                k(sSLSessionImpl2);
            } else {
                if (!this.K) {
                    throw new SSLException("Client did not resume a session");
                }
                this.s0 = (cl_26) cl_67Var.a(cl_36.e);
                int i4 = this.a.n;
                cl_84 cl_84Var6 = cl_84.z;
                if (i4 >= cl_84Var6.n && (cl_108Var = (cl_108) cl_67Var.a(cl_36.g)) != null) {
                    ArrayList arrayList2 = cl_108Var.e;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        dy31.u("No peer supported signature algorithms");
                        return;
                    }
                    ArrayList b4 = cl_109.b(this.i, arrayList2);
                    if (b4.isEmpty()) {
                        dy31.u("No supported signature and hash algorithm in common");
                        return;
                    }
                    this.m = new ArrayList(b4);
                }
                cl_84 cl_84Var7 = this.a;
                cl_8 cl_8Var2 = cl_8.a0;
                Collection x = x();
                SecureRandom secureRandom = this.D.g;
                String hostAddress = sSLSocketImpl != null ? sSLSocketImpl.getInetAddress().getHostAddress() : sSLEngineImpl.getPeerHost();
                SSLSocketImpl sSLSocketImpl2 = this.x;
                SSLSessionImpl sSLSessionImpl4 = new SSLSessionImpl(cl_84Var7, cl_8Var2, x, new cl_106(SSLSessionImpl.D, secureRandom), hostAddress, sSLSocketImpl2 != null ? sSLSocketImpl2.getPort() : this.y.getPeerPort(), this.X && this.a.n >= cl_84.x.n, w());
                this.G = sSLSessionImpl4;
                if (this.a.n >= cl_84Var6.n && (arrayList = this.m) != null) {
                    sSLSessionImpl4.t = cl_109.f(arrayList);
                }
                List list2 = Collections.EMPTY_LIST;
                if (cl_104Var != null && (map = cl_104Var.e) != null && !map.isEmpty()) {
                    list2 = Collections.unmodifiableList(new ArrayList(map.values()));
                }
                SSLSessionImpl sSLSessionImpl5 = this.G;
                sSLSessionImpl5.getClass();
                sSLSessionImpl5.u = new ArrayList(list2);
                k(this.G);
                if (this.M) {
                    cl_14Var = A();
                    A = cl_14Var;
                } else {
                    A = A();
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = cl_14Var.a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            if (L((cl_8) it4.next())) {
                            }
                        }
                        f(Alerts.alert_handshake_failure, "no cipher suites in common", null);
                        throw null;
                    }
                    cl_8 cl_8Var3 = (cl_8) it3.next();
                    if (A.a.contains(cl_8Var3)) {
                        if (cl_8Var3 == cl_8.b0) {
                            b = b3;
                            cl_8Var3.getClass();
                        } else if (cl_8Var3.f()) {
                            SSLLogger.fine("Try to set cipher suite:", cl_8Var3);
                            if (this.h0 != b3 || ((cl_11Var3 = cl_8Var3.w) != cl_11.h && cl_11Var3 != cl_11.m)) {
                                b = b3;
                                if (x0.permits(null, cl_8Var3.a, null)) {
                                    if (L(cl_8Var3)) {
                                        break;
                                    }
                                } else {
                                    arrayList3.add(cl_8Var3);
                                }
                            }
                        }
                        b3 = b;
                    }
                    b = b3;
                    b3 = b;
                }
                SSLSessionImpl sSLSessionImpl6 = this.G;
                sSLSessionImpl6.g = this.H;
                SSLLogger.fine("%% Negotiating:", sSLSessionImpl6);
                SSLSessionImpl sSLSessionImpl7 = this.G;
                sSLSessionImpl7.i = this.X && this.a.n >= cl_84.x.n;
                sSLSessionImpl7.r = this.j0;
            }
            if (!this.H.d()) {
                this.X = false;
                this.G.i = false;
            }
            this.z.c(cl_84Var4, this.H);
            i = this.a.n;
            cl_84Var = cl_84.z;
            if (i >= cl_84Var.n) {
                cl_45 cl_45Var = this.z;
                this.H.z.getClass();
                cl_45Var.getClass();
            }
            cl_59Var.e = this.H;
            cl_59Var.d = this.G.b;
            cl_59Var.f = (byte) 0;
            if (this.c) {
                cl_59Var.g.c(new cl_89(this.d, this.e));
            }
            if (!this.q.isEmpty() && cl_104Var != null && !this.J) {
                cl_104 cl_104Var2 = new cl_104(cl_36.d);
                cl_104Var2.f = 0;
                cl_104Var2.e = Collections.EMPTY_MAP;
                cl_59Var.g.c(cl_104Var2);
            }
            cl_38Var = (cl_38) cl_67Var.a(cl_36.l);
            boolean equalsIgnoreCase = this.H.a.equalsIgnoreCase("TLS_CIPHER_2001");
            if (cl_38Var != null && equalsIgnoreCase) {
                cl_38.a(cl_38Var, false);
                cl_59Var.g.c(cl_38.a());
            }
            if (cl_0Var == null) {
                List list3 = cl_0Var.f;
                if (z3) {
                    this.s = (String) (sSLSocketImpl != null ? this.u.apply(sSLSocketImpl, list3) : this.t.apply(sSLEngineImpl, list3));
                }
                String str8 = this.s;
                if (str8 == null || !(str8.isEmpty() || list3.contains(this.s))) {
                    f(Alerts.alert_no_application_protocol, null, new SSLHandshakeException("No matching ALPN values"));
                    throw null;
                }
                if (!this.s.isEmpty()) {
                    cl_59Var.g.c(new cl_0(new String[]{this.s}));
                }
            } else {
                this.s = "";
            }
            if (this.G.i) {
                cl_59Var.g.c(new cl_35());
            }
            cl_59Var.f();
            SSLLogger.fine("Cipher suite: ", this.G.g);
            cl_59Var.c(this.B);
            z4 = this.J;
            cl_11 cl_11Var5 = this.I;
            if (!z4) {
                if (cl_11Var5 != cl_11.q && cl_11Var5 != cl_11.r && cl_11Var5 != cl_11.s && cl_11Var5 != cl_11.t && cl_11Var5 != cl_11.u) {
                    o(this.G.h);
                    throw null;
                }
                try {
                    i((MasterSecretInterface) this.G.h);
                    N(false);
                    return;
                } catch (InvalidKeyException e) {
                    RuntimeException runtimeException = new RuntimeException("Invalid key exchange", e);
                    runtimeException.initCause(e);
                    throw runtimeException;
                }
            }
            cl_11 cl_11Var6 = cl_11.n;
            if (cl_11Var5 != cl_11Var6 && cl_11Var5 != cl_11.o) {
                if (cl_11Var5 != cl_11.h && cl_11Var5 != cl_11.m) {
                    if (this.i0 == null) {
                        kbs.g("no certificates");
                        return;
                    }
                    X509Certificate[] x509CertificateArr = this.i0;
                    cl_48 cl_48Var = new cl_48(x509CertificateArr);
                    this.G.q = x509CertificateArr;
                    cl_48Var.f();
                    cl_48Var.c(this.B);
                } else if (this.i0 != null) {
                    kbs.g("anonymous keyexchange with certs");
                    return;
                }
            }
            switch (cl_102.a[this.I.ordinal()]) {
                case 2:
                    if (cl_73.a(this.i0[0].getPublicKey()) > 512) {
                        try {
                            cl_54Var = new cl_58(this.o0, this.j0, this.E, this.F, this.D.g);
                            this.j0 = this.n0;
                            if (cl_54Var != null) {
                                cl_54Var.f();
                                cl_54Var.c(this.B);
                            }
                            if (this.h0 != 0 && (cl_11Var = this.I) != cl_11.h && cl_11Var != cl_11.m && cl_11Var != cl_11Var6 && cl_11Var != cl_11.o) {
                                if (this.a.n < cl_84Var.n) {
                                    collection = (cl_11Var == cl_11.q || cl_11Var == cl_11.r) ? y() : (cl_11Var == cl_11.s || cl_11Var == cl_11.t || cl_11Var == cl_11.u) ? z() : x();
                                    if (collection.isEmpty()) {
                                        dy31.u(str7);
                                        return;
                                    } else if (cl_109.g(collection).isEmpty()) {
                                        dy31.u(str7);
                                        return;
                                    }
                                } else {
                                    collection = null;
                                }
                                acceptedIssuers = this.D.f.getAcceptedIssuers();
                                cl_11Var2 = this.I;
                                cl_84Var2 = this.a;
                                cl_49Var = new cl_49();
                                cl_49Var.g = false;
                                cl_49Var.d = cl_84Var2;
                                HashSet hashSet = new HashSet();
                                for (X509Certificate x509Certificate : acceptedIssuers) {
                                    X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                                    cl_53 cl_53Var = new cl_53();
                                    cl_53Var.a = subjectX500Principal.getEncoded();
                                    hashSet.add(cl_53Var);
                                }
                                cl_49Var.c = (cl_53[]) hashSet.toArray(new cl_53[hashSet.size()]);
                                int e2 = cl_49Var.e();
                                boolean z11 = e2 <= ((int) Math.pow(2.0d, 16.0d)) + (-1);
                                cl_49Var.g = z11;
                                SSLLogger.fine("Authorities list's size is " + e2 + " bytes, it will be send empty: " + z11);
                                if (cl_11Var2 != cl_11.q || cl_11Var2 == cl_11.r || cl_11Var2 == cl_11.s || cl_11Var2 == cl_11.t || cl_11Var2 == cl_11.u) {
                                    cl_49Var.b = cl_11Var2.n();
                                } else {
                                    boolean z12 = cl_73.a;
                                    synchronized (cl_73.class) {
                                    }
                                    cl_49Var.b = cl_49.h;
                                }
                                if (cl_84Var2.n >= cl_84.z.n) {
                                    cl_49Var.e = new ArrayList();
                                    cl_49Var.f = 0;
                                } else {
                                    if (collection == null || collection.isEmpty()) {
                                        dy31.m("No supported signature algorithms");
                                        return;
                                    }
                                    ArrayList arrayList4 = new ArrayList(collection);
                                    cl_49Var.e = arrayList4;
                                    Set set = cl_109.e;
                                    cl_49Var.f = arrayList4.size() * 2;
                                }
                                cl_49Var.f();
                                cl_49Var.c(this.B);
                            }
                            cl_60 cl_60Var = new cl_60();
                            cl_60Var.f();
                            cl_60Var.c(this.B);
                            this.B.flush();
                            return;
                        } catch (GeneralSecurityException e3) {
                            cl_63.g("Error generating RSA server key exchange", e3);
                            throw null;
                        }
                    }
                    break;
                case 1:
                case 3:
                case 4:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    cl_54Var = null;
                    if (cl_54Var != null) {
                    }
                    if (this.h0 != 0) {
                        if (this.a.n < cl_84Var.n) {
                        }
                        acceptedIssuers = this.D.f.getAcceptedIssuers();
                        cl_11Var2 = this.I;
                        cl_84Var2 = this.a;
                        cl_49Var = new cl_49();
                        cl_49Var.g = false;
                        cl_49Var.d = cl_84Var2;
                        HashSet hashSet2 = new HashSet();
                        while (r8 < acceptedIssuers.length) {
                        }
                        cl_49Var.c = (cl_53[]) hashSet2.toArray(new cl_53[hashSet2.size()]);
                        int e22 = cl_49Var.e();
                        if (e22 <= ((int) Math.pow(2.0d, 16.0d)) + (-1)) {
                        }
                        cl_49Var.g = z11;
                        SSLLogger.fine("Authorities list's size is " + e22 + " bytes, it will be send empty: " + z11);
                        if (cl_11Var2 != cl_11.q) {
                            break;
                        }
                        cl_49Var.b = cl_11Var2.n();
                        if (cl_84Var2.n >= cl_84.z.n) {
                        }
                        cl_49Var.f();
                        cl_49Var.c(this.B);
                        break;
                    }
                    cl_60 cl_60Var2 = new cl_60();
                    cl_60Var2.f();
                    cl_60Var2.c(this.B);
                    this.B.flush();
                    return;
                case 5:
                case 6:
                    try {
                        cl_54Var = new cl_52(this.p0, this.j0, this.E.a, this.F.a, this.D.g, this.t0, this.a);
                        if (cl_54Var != null) {
                        }
                        if (this.h0 != 0) {
                        }
                        cl_60 cl_60Var22 = new cl_60();
                        cl_60Var22.f();
                        cl_60Var22.c(this.B);
                        this.B.flush();
                        return;
                    } catch (GeneralSecurityException e4) {
                        cl_63.g("Error generating DH server key exchange", e4);
                        throw null;
                    }
                case 7:
                    cl_21 cl_21Var = this.p0;
                    cl_84 cl_84Var8 = this.a;
                    cl_52 cl_52Var = new cl_52();
                    cl_52Var.f = cl_84Var8;
                    cl_52Var.g = null;
                    cl_52Var.b = cl_47.b(cl_21Var.a);
                    cl_52Var.c = cl_47.b(cl_21Var.b);
                    cl_52Var.d = cl_47.b(cl_21Var.d);
                    cl_52Var.e = null;
                    cl_54Var = cl_52Var;
                    if (cl_54Var != null) {
                    }
                    if (this.h0 != 0) {
                    }
                    cl_60 cl_60Var222 = new cl_60();
                    cl_60Var222.f();
                    cl_60Var222.c(this.B);
                    this.B.flush();
                    return;
                case 8:
                case 9:
                    cl_54Var = null;
                    if (cl_54Var != null) {
                    }
                    if (this.h0 != 0) {
                    }
                    cl_60 cl_60Var2222 = new cl_60();
                    cl_60Var2222.f();
                    cl_60Var2222.c(this.B);
                    this.B.flush();
                    return;
                case 10:
                case 11:
                case 12:
                    try {
                        cl_54Var = new cl_54(this.q0, this.j0, this.E.a, this.F.a, this.D.g, this.t0, this.a);
                        if (cl_54Var != null) {
                        }
                        if (this.h0 != 0) {
                        }
                        cl_60 cl_60Var22222 = new cl_60();
                        cl_60Var22222.f();
                        cl_60Var22222.c(this.B);
                        this.B.flush();
                        return;
                    } catch (GeneralSecurityException e5) {
                        cl_63.g("Error generating ECDH server key exchange", e5);
                        throw null;
                    }
                default:
                    dy31.l(this.I, "internal error: ");
                    return;
            }
        }
        sSLSessionImpl = null;
        this.G = sSLSessionImpl;
        cl_106Var = cl_51Var.d;
        byte b32 = 2;
        if (cl_106Var.a.length != 0) {
            b2 = sSLSessionImpl3.b();
            this.J = b2;
            if (b2) {
            }
            z5 = false;
            if (this.J) {
                z7 = this.X;
                if (z7) {
                }
                if (z7) {
                }
                if (!z7) {
                    if (cl_63.f0) {
                    }
                }
            }
            if (this.J) {
            }
            if (this.J) {
                sSLSessionImpl3.getPeerPrincipal();
            }
            if (this.J) {
                Principal localPrincipal2 = sSLSessionImpl3.getLocalPrincipal();
                subject = (Subject) AccessController.doPrivileged(new cl_100(this));
                if (subject != null) {
                }
                SSLLogger.fine(str3);
            }
            w = w();
            if (this.J) {
                str2 = sSLSessionImpl3.x;
                if (!w.equals(str2)) {
                }
            }
            if (this.J) {
            }
            if (this.J) {
            }
        }
        sSLSessionImpl2 = this.G;
        if (sSLSessionImpl2 == null) {
        }
        if (!this.H.d()) {
        }
        this.z.c(cl_84Var4, this.H);
        i = this.a.n;
        cl_84Var = cl_84.z;
        if (i >= cl_84Var.n) {
        }
        cl_59Var.e = this.H;
        cl_59Var.d = this.G.b;
        cl_59Var.f = (byte) 0;
        if (this.c) {
        }
        if (!this.q.isEmpty()) {
            cl_104 cl_104Var22 = new cl_104(cl_36.d);
            cl_104Var22.f = 0;
            cl_104Var22.e = Collections.EMPTY_MAP;
            cl_59Var.g.c(cl_104Var22);
        }
        cl_38Var = (cl_38) cl_67Var.a(cl_36.l);
        boolean equalsIgnoreCase2 = this.H.a.equalsIgnoreCase("TLS_CIPHER_2001");
        if (cl_38Var != null) {
            cl_38.a(cl_38Var, false);
            cl_59Var.g.c(cl_38.a());
        }
        if (cl_0Var == null) {
        }
        if (this.G.i) {
        }
        cl_59Var.f();
        SSLLogger.fine("Cipher suite: ", this.G.g);
        cl_59Var.c(this.B);
        z4 = this.J;
        cl_11 cl_11Var52 = this.I;
        if (!z4) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(String str, boolean z) {
        boolean z2;
        StringBuilder sb;
        boolean z3;
        String str2;
        ?? r16;
        String str3;
        String str4;
        SSLLogger.fine("Search for server containers with algorithm: " + str);
        X509ExtendedKeyManager x509ExtendedKeyManager = this.D.e;
        SSLSocketImpl sSLSocketImpl = this.x;
        String[] serverAliases = x509ExtendedKeyManager.getServerAliases(str, null);
        boolean z4 = false;
        if (serverAliases == null) {
            SSLLogger.fine("Server container not found.");
            return false;
        }
        int length = serverAliases.length;
        int i = 0;
        while (i < length) {
            String str5 = serverAliases[i];
            SSLLogger.fine("Check private key: " + str5);
            PrivateKey privateKey = x509ExtendedKeyManager.getPrivateKey(str5);
            if (privateKey == null) {
                str4 = "Private key " + str5 + " is null.";
            } else {
                X509Certificate[] certificateChain = x509ExtendedKeyManager.getCertificateChain(str5);
                if (certificateChain == null || certificateChain.length == 0) {
                    z2 = z4 ? 1 : 0;
                    sb = new StringBuilder("Certificate chain ");
                    sb.append(str5);
                    sb.append(" is null.");
                } else {
                    String str6 = str.split("_")[z4 ? 1 : 0];
                    PublicKey publicKey = certificateChain[z4 ? 1 : 0].getPublicKey();
                    if (z || (privateKey.getAlgorithm().equals(str6) && publicKey.getAlgorithm().equals(str6))) {
                        if (str6.equals("EC")) {
                            if (publicKey instanceof ECPublicKey) {
                                int c = cl_26.c(((ECPublicKey) publicKey).getParams());
                                if (cl_26.d(c)) {
                                    cl_26 cl_26Var = this.s0;
                                    if (cl_26Var != null) {
                                        int[] iArr = cl_26Var.e;
                                        int length2 = iArr.length;
                                        int i2 = z4 ? 1 : 0;
                                        boolean z5 = z4;
                                        while (i2 < length2) {
                                            r16 = z5;
                                            if (c == iArr[i2]) {
                                                if (!z) {
                                                    SSLLogger.fine("Check if certificate " + str5 + " approach...");
                                                    if (ParamUtil.isCertApproach(certificateChain[r16], str)) {
                                                        SSLLogger.fine("Certificate " + str5 + " matches. Check if DH available...");
                                                        if (GostKeyUtil.isAvailable2012DHAllowed(privateKey)) {
                                                            SSLLogger.fine("Private key " + str5 + " is available.");
                                                        } else {
                                                            sb = new StringBuilder("DH unavailable for the key ");
                                                            sb.append(str5);
                                                            str3 = ". Continue.";
                                                        }
                                                    } else {
                                                        sb = new StringBuilder("Certificate with alias ");
                                                        sb.append(str5);
                                                        str3 = " does not match. Continue.";
                                                    }
                                                    sb.append(str3);
                                                    z2 = r16;
                                                }
                                                SSLLogger.fine("%% Chosen server alias: " + str5);
                                                this.j0 = privateKey;
                                                this.i0 = certificateChain;
                                                return true;
                                            }
                                            i2++;
                                            z5 = r16;
                                        }
                                        z3 = z5;
                                        str2 = "Unsupported elliptic curve extension [2]";
                                        SSLLogger.fine(str2);
                                        i++;
                                        z4 = z3;
                                    }
                                } else {
                                    str4 = "Unsupported elliptic curve extension [1]";
                                }
                            } else {
                                str4 = "Public key does not match to ECPublicKey";
                            }
                        }
                        r16 = z4 ? 1 : 0;
                        if (!z) {
                        }
                        SSLLogger.fine("%% Chosen server alias: " + str5);
                        this.j0 = privateKey;
                        this.i0 = certificateChain;
                        return true;
                    }
                    str4 = "Key algorithm doesn't match";
                }
                str2 = sb.toString();
                z3 = z2;
                SSLLogger.fine(str2);
                i++;
                z4 = z3;
            }
            SSLLogger.fine(str4);
            z3 = z4 ? 1 : 0;
            i++;
            z4 = z3;
        }
        boolean z6 = z4 ? 1 : 0;
        SSLLogger.fine("Server container not found.");
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b6, code lost:
    
        if (r5 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fb, code lost:
    
        if (r10.l0 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022f, code lost:
    
        if (M(r4) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0236, code lost:
    
        if (K("RSA", false) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        if (G() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0103, code lost:
    
        if (r4 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0113, code lost:
    
        if (G() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012f, code lost:
    
        if (r4 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        if (G() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018b, code lost:
    
        if (r5 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0193, code lost:
    
        if (K("DSA", false) == false) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L(cl_8 cl_8Var) {
        boolean z;
        cl_11 cl_11Var;
        int i;
        cl_84 cl_84Var;
        Collection collection;
        SecurityManager securityManager;
        cl_25 cl_25Var;
        PrivateKey privateKey;
        PublicKey publicKey;
        int i2;
        cl_111 cl_111Var;
        cl_109 c;
        if (!this.J) {
            if (cl_8Var == cl_8.b0) {
                cl_8Var.getClass();
            } else if (cl_8Var.f()) {
                z = true;
                cl_11Var = cl_8Var.w;
                boolean z2 = cl_8Var.A;
                if (z && (i = this.a.n) < cl_8Var.C && i >= cl_8Var.D) {
                    this.j0 = null;
                    this.i0 = null;
                    this.p0 = null;
                    this.n0 = null;
                    this.o0 = null;
                    cl_84Var = cl_84.z;
                    if (i < cl_84Var.n) {
                        collection = this.m;
                        if (collection == null) {
                            int i3 = cl_102.a[cl_11Var.ordinal()];
                            if (i3 != 1 && i3 != 5) {
                                if (i3 != 6) {
                                    if (i3 != 18) {
                                        if (i3 != 19) {
                                            switch (i3) {
                                                case 8:
                                                case 10:
                                                    break;
                                                case 9:
                                                case 11:
                                                    i2 = cl_110.d.o;
                                                    cl_111Var = cl_111.ECDSA;
                                                    c = cl_109.c(i2, cl_111Var.l, 0);
                                                    break;
                                                default:
                                                    c = null;
                                                    break;
                                            }
                                            if (c == null) {
                                                collection = Collections.EMPTY_SET;
                                            } else {
                                                ArrayList arrayList = new ArrayList(1);
                                                arrayList.add(c);
                                                collection = cl_109.b(this.i, arrayList);
                                            }
                                            SSLSessionImpl sSLSessionImpl = this.G;
                                            sSLSessionImpl.getClass();
                                            sSLSessionImpl.t = cl_109.f(collection);
                                        }
                                    }
                                }
                                i2 = cl_110.d.o;
                                cl_111Var = cl_111.DSA;
                                c = cl_109.c(i2, cl_111Var.l, 0);
                                if (c == null) {
                                }
                                SSLSessionImpl sSLSessionImpl2 = this.G;
                                sSLSessionImpl2.getClass();
                                sSLSessionImpl2.t = cl_109.f(collection);
                            }
                            i2 = cl_110.d.o;
                            cl_111Var = cl_111.RSA;
                            c = cl_109.c(i2, cl_111Var.l, 0);
                            if (c == null) {
                            }
                            SSLSessionImpl sSLSessionImpl22 = this.G;
                            sSLSessionImpl22.getClass();
                            sSLSessionImpl22.t = cl_109.f(collection);
                        }
                    } else {
                        collection = null;
                    }
                    switch (cl_102.a[cl_11Var.ordinal()]) {
                        case 1:
                            break;
                        case 2:
                            if (K("RSA", false)) {
                                try {
                                    if (cl_73.a(this.i0[0].getPublicKey()) > 512) {
                                        break;
                                    }
                                    this.H = cl_8Var;
                                    this.I = cl_11Var;
                                    if (this.a.n >= cl_84.z.n && this.m == null) {
                                        this.m = new ArrayList(collection);
                                        break;
                                    }
                                } catch (RuntimeException unused) {
                                    break;
                                }
                            }
                            break;
                        case 3:
                        case 4:
                            if (this.l0 == null) {
                                try {
                                    AccessControlContext v = v();
                                    Object doPrivileged = AccessController.doPrivileged(new cl_101(v));
                                    this.l0 = doPrivileged;
                                    if (doPrivileged != null) {
                                        SSLLogger.fine("Using Kerberos creds");
                                        String a = cl_77.a(this.l0);
                                        if (a != null && (securityManager = System.getSecurityManager()) != null) {
                                            try {
                                                securityManager.checkPermission(cl_77.a(a, "accept"), v);
                                            } catch (SecurityException e) {
                                                this.l0 = null;
                                                SSLLogger.subThrown("Permission to access Kerberos secret key denied", e);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                } catch (PrivilegedActionException e2) {
                                    SSLLogger.subThrown("Attempt to obtain Kerberos key failed: " + e2.toString(), e2);
                                    break;
                                }
                            }
                            this.H = cl_8Var;
                            this.I = cl_11Var;
                            if (this.a.n >= cl_84.z.n) {
                                this.m = new ArrayList(collection);
                                break;
                            }
                            break;
                        case 5:
                            if (K("RSA", false)) {
                                if (this.a.n >= cl_84Var.n) {
                                    cl_109 d = cl_109.d(collection, "RSA", this.j0);
                                    this.t0 = d;
                                    break;
                                }
                                H(this.j0, z2);
                                this.H = cl_8Var;
                                this.I = cl_11Var;
                                if (this.a.n >= cl_84.z.n) {
                                }
                            }
                            break;
                        case 6:
                            if (this.a.n >= cl_84Var.n) {
                                cl_109 d2 = cl_109.d(collection, "DSA", null);
                                this.t0 = d2;
                                break;
                            }
                            break;
                        case 7:
                            H(null, z2);
                            this.H = cl_8Var;
                            this.I = cl_11Var;
                            if (this.a.n >= cl_84.z.n) {
                            }
                            break;
                        case 8:
                            if (K("EC_RSA", false)) {
                                privateKey = this.j0;
                                publicKey = this.i0[0].getPublicKey();
                                cl_25Var = new cl_25();
                                cl_25Var.a = privateKey;
                                cl_25Var.b = (ECPublicKey) publicKey;
                                this.q0 = cl_25Var;
                                this.H = cl_8Var;
                                this.I = cl_11Var;
                                if (this.a.n >= cl_84.z.n) {
                                }
                            }
                            break;
                        case 9:
                            if (K("EC_EC", false)) {
                                privateKey = this.j0;
                                publicKey = this.i0[0].getPublicKey();
                                cl_25Var = new cl_25();
                                cl_25Var.a = privateKey;
                                cl_25Var.b = (ECPublicKey) publicKey;
                                this.q0 = cl_25Var;
                                this.H = cl_8Var;
                                this.I = cl_11Var;
                                if (this.a.n >= cl_84.z.n) {
                                }
                            }
                            break;
                        case 10:
                            if (K("RSA", false)) {
                                if (this.a.n >= cl_84Var.n) {
                                    cl_109 d3 = cl_109.d(collection, "RSA", this.j0);
                                    this.t0 = d3;
                                    break;
                                }
                                break;
                            }
                            break;
                        case 11:
                            if (this.a.n >= cl_84Var.n) {
                                cl_109 d4 = cl_109.d(collection, JCP.ECDSA_NAME, null);
                                this.t0 = d4;
                                break;
                            }
                            if (K("EC_EC", false)) {
                                break;
                            }
                            break;
                        case 12:
                            break;
                        case 13:
                        case 14:
                            String[] algorithms = GostKeyUtil.getAlgorithms(cl_11Var.n());
                            SSLLogger.fine("Setup private key and chain.");
                            for (String str : algorithms) {
                                if (K(str, true)) {
                                    this.H = cl_8Var;
                                    this.I = cl_11Var;
                                    if (this.a.n >= cl_84.z.n) {
                                    }
                                }
                            }
                            break;
                        case 15:
                        case 16:
                        case 17:
                            String[] algorithms2 = GostKeyUtil.getAlgorithms(cl_11Var.p());
                            SSLLogger.fine("Setup private key and chain...");
                            for (String str2 : algorithms2) {
                                if (K(str2, true)) {
                                    this.H = cl_8Var;
                                    this.I = cl_11Var;
                                    if (this.a.n >= cl_84.z.n) {
                                    }
                                }
                            }
                            break;
                        default:
                            w511.v(cl_8Var, "Unrecognized cipherSuite: ");
                            break;
                    }
                    return false;
                }
                return false;
            }
            z = false;
            cl_11Var = cl_8Var.w;
            boolean z22 = cl_8Var.A;
            if (z) {
                this.j0 = null;
                this.i0 = null;
                this.p0 = null;
                this.n0 = null;
                this.o0 = null;
                cl_84Var = cl_84.z;
                if (i < cl_84Var.n) {
                }
                switch (cl_102.a[cl_11Var.ordinal()]) {
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean M(boolean z) {
        int i;
        char c;
        KeyPair a;
        SSLContextImpl sSLContextImpl = this.D;
        cl_32 cl_32Var = sSLContextImpl.a;
        SecureRandom secureRandom = sSLContextImpl.g;
        cl_32Var.getClass();
        if (z) {
            i = 512;
            c = 0;
        } else {
            i = 1024;
            c = 1;
        }
        synchronized (cl_32Var.a) {
            a = cl_34.a(cl_32Var.a[c]);
            if (a == null) {
                try {
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", cl_73.g("RSA"));
                    keyPairGenerator.initialize(i, secureRandom);
                    cl_32Var.a[c] = new cl_34(keyPairGenerator.genKeyPair());
                    a = cl_34.a(cl_32Var.a[c]);
                } catch (Exception unused) {
                }
            }
        }
        if (a == null) {
            return false;
        }
        this.o0 = a.getPublic();
        this.n0 = a.getPrivate();
        return true;
    }

    public final void N(boolean z) {
        this.B.flush();
        cl_55 cl_55Var = new cl_55(this.a, this.z, 2, this.G.h, this.H);
        l(cl_55Var, z);
        if (this.c) {
            this.e = cl_55Var.b;
        }
        if (z) {
            this.C = 20;
        }
    }

    @Override // ru.CryptoPro.ssl.cl_63
    public final cl_47 b() {
        return new cl_56();
    }

    @Override // ru.CryptoPro.ssl.cl_63
    public final void d(byte b) {
        String alertDescription = Alerts.alertDescription(b);
        SSLLogger.fine("SSL -- handshake alert:", alertDescription);
        if (b != 41 || this.h0 != 1) {
            throw new SSLProtocolException(g8e.o("handshake alert: ", alertDescription));
        }
    }

    @Override // ru.CryptoPro.ssl.cl_63
    public final void e(byte b, int i) {
        String str;
        SecretKey secretKey;
        int i2 = this.C;
        if (i2 >= b && i2 != 16 && b != 15) {
            throw new SSLProtocolException("Handshake message sequence violation, state = " + this.C + ", type = " + ((int) b));
        }
        if (b != 1) {
            SSLEngineImpl sSLEngineImpl = this.y;
            SSLSocketImpl sSLSocketImpl = this.x;
            String str2 = "RSA";
            byte[] bArr = null;
            if (b != 11) {
                if (b == 20) {
                    if (!(sSLSocketImpl != null ? sSLSocketImpl.x : sSLEngineImpl.h)) {
                        f(Alerts.alert_handshake_failure, "Received Finished message before ChangeCipherSpec", null);
                        throw null;
                    }
                    cl_55 cl_55Var = new cl_55(this.a, this.A, this.H);
                    cl_55Var.f();
                    if (this.h0 == 2) {
                        this.G.getPeerPrincipal();
                    }
                    if (this.m0) {
                        f(Alerts.alert_handshake_failure, "client did not send certificate verify message", null);
                        throw null;
                    }
                    byte[] e = cl_55Var.e(this.z, 1, this.G.h, cl_55Var.d);
                    byte[] bArr2 = cl_55Var.b;
                    if (!Arrays.equals(e, bArr2)) {
                        f(Alerts.alert_handshake_failure, "client 'finished' message doesn't verify", null);
                        throw null;
                    }
                    if (this.c) {
                        this.d = bArr2;
                    }
                    if (!this.J) {
                        this.A.a();
                        N(true);
                    }
                    this.G.k = System.currentTimeMillis();
                    if (this.J || !this.G.b()) {
                        str = this.J ? "%% Cached server session:" : "%% Didn't cache non-resumable server session:";
                    } else {
                        this.D.c.a(this.G);
                    }
                    SSLLogger.fine(str, this.G);
                } else if (b == 15) {
                    cl_11 cl_11Var = this.I;
                    I((cl_11Var == cl_11.q || cl_11Var == cl_11.r) ? new cl_50(this.A, i, true, y(), this.a) : (cl_11Var == cl_11.s || cl_11Var == cl_11.t || cl_11Var == cl_11.u) ? new cl_50(this.A, i, true, z(), this.a) : new cl_50(this.A, i, false, x(), this.a));
                } else {
                    if (b != 16) {
                        throw new SSLProtocolException(oyr.i(b, "Illegal server handshake msg, "));
                    }
                    switch (cl_102.a[this.I.ordinal()]) {
                        case 1:
                        case 2:
                            cl_84 cl_84Var = this.a;
                            cl_84 cl_84Var2 = this.r0;
                            SecureRandom secureRandom = this.D.g;
                            cl_46 cl_46Var = this.A;
                            PrivateKey privateKey = this.j0;
                            cl_85 cl_85Var = new cl_85();
                            if (!privateKey.getAlgorithm().equals("RSA")) {
                                throw new SSLKeyException("Private key not of type RSA");
                            }
                            if (cl_84Var.n >= cl_84.x.n) {
                                cl_85Var.d = cl_46Var.g();
                            } else {
                                byte[] bArr3 = new byte[i];
                                cl_85Var.d = bArr3;
                                if (cl_46Var.read(bArr3) != i) {
                                    dy31.m("SSL: read PreMasterSecret: short read");
                                    return;
                                }
                            }
                            try {
                                Cipher c = cl_73.c("RSA/ECB/PKCS1Padding");
                                c.init(2, privateKey);
                                bArr = c.doFinal(cl_85Var.d);
                                e = null;
                            } catch (BadPaddingException e2) {
                                e = e2;
                            } catch (IllegalBlockSizeException unused) {
                                dy31.m("Unable to process PreMasterSecret, may be too big");
                                return;
                            } catch (Exception e3) {
                                SSLLogger.warning("RSA premaster secret decryption error:");
                                SSLLogger.thrown(e3);
                                ny61.n("Could not generate dummy secret", e3);
                                return;
                            }
                            cl_85Var.b = cl_84Var2;
                            if (secureRandom == null) {
                                secureRandom = new SecureRandom();
                            }
                            byte[] bArr4 = new byte[48];
                            secureRandom.nextBytes(bArr4);
                            if (e == null && bArr != null) {
                                if (bArr.length == 48) {
                                    byte b2 = cl_84Var2.o;
                                    byte b3 = bArr[0];
                                    if (b2 != b3 || cl_84Var2.p != bArr[1]) {
                                        if (cl_84Var2.n <= cl_84.x.n && cl_84Var.o == b3 && cl_84Var.p == bArr[1]) {
                                            cl_85Var.b = cl_84Var;
                                        } else {
                                            SSLLogger.finer("Mismatching Protocol Versions, ClientHello.client_version is " + cl_84Var2 + ", while PreMasterSecret.client_version is " + cl_84.a(bArr[0], bArr[1]));
                                            bArr = bArr4;
                                        }
                                    }
                                    secretKey = cl_85.e(cl_84Var2, bArr, secureRandom);
                                    cl_85Var.c = secretKey;
                                    cl_85Var.f();
                                    break;
                                } else {
                                    SSLLogger.fine("incorrect length of premaster secret: ", Integer.valueOf(bArr.length));
                                }
                            } else if (e != null) {
                                SSLLogger.warning("Error decrypting premaster secret:");
                                SSLLogger.thrown(e);
                            }
                            secretKey = cl_85.e(cl_84Var2, bArr4, secureRandom);
                            cl_85Var.c = secretKey;
                            cl_85Var.f();
                            break;
                        case 3:
                        case 4:
                            cl_75 cl_75Var = new cl_75(this.a, this.r0, this.D.g, this.A, v(), this.l0);
                            cl_75Var.f();
                            SSLSessionImpl sSLSessionImpl = this.G;
                            Principal e4 = cl_75Var.e();
                            if (sSLSessionImpl.v == null) {
                                sSLSessionImpl.v = e4;
                            }
                            this.G.w = cl_75Var.g();
                            secretKey = new SecretKeySpec(cl_75Var.b(), "TlsPremasterSecret");
                            break;
                        case 5:
                        case 6:
                        case 7:
                            cl_46 cl_46Var2 = this.A;
                            cl_20 cl_20Var = new cl_20();
                            if (cl_46Var2.available() < 2) {
                                dy31.u("Unsupported implicit client DiffieHellman public key");
                                return;
                            }
                            byte[] g = cl_46Var2.g();
                            cl_20Var.b = g;
                            cl_20Var.f();
                            BigInteger bigInteger = g != null ? new BigInteger(1, g) : null;
                            this.p0.c(this.i, bigInteger);
                            secretKey = this.p0.a(bigInteger, false);
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            cl_46 cl_46Var3 = this.A;
                            cl_24 cl_24Var = new cl_24();
                            byte[] n = cl_46Var3.n();
                            cl_24Var.b = n;
                            cl_24Var.f();
                            cl_25 cl_25Var = this.q0;
                            AlgorithmConstraints algorithmConstraints = this.i;
                            cl_25Var.getClass();
                            try {
                                ECParameterSpec params = cl_25Var.b.getParams();
                                if (!algorithmConstraints.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), (ECPublicKey) KeyFactory.getInstance("EC", cl_73.g("EC")).generatePublic(new ECPublicKeySpec(cl_73.b(n, params.getCurve()), params)))) {
                                    throw new SSLHandshakeException("ECPublicKey does not comply to algorithm constraints");
                                }
                                cl_25 cl_25Var2 = this.q0;
                                cl_25Var2.getClass();
                                try {
                                    ECParameterSpec params2 = cl_25Var2.b.getParams();
                                    secretKey = cl_25Var2.a(KeyFactory.getInstance("EC", cl_73.g("EC")).generatePublic(new ECPublicKeySpec(cl_73.b(n, params2.getCurve()), params2)));
                                    break;
                                } catch (IOException | GeneralSecurityException e5) {
                                    throw ((SSLHandshakeException) new SSLHandshakeException("Could not generate secret").initCause(e5));
                                }
                            } catch (IOException | GeneralSecurityException e6) {
                                throw ((SSLHandshakeException) new SSLHandshakeException("Could not generate ECPublicKey").initCause(e6));
                            }
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            cl_37 cl_37Var = new cl_37(this.A, i);
                            cl_37Var.a(this.H, this.E.a, this.F.a, this.j0, this.k0);
                            secretKey = cl_37Var.e();
                            this.m0 = cl_37Var.b();
                            break;
                        default:
                            throw new SSLProtocolException("Unrecognized key exchange: " + this.I);
                    }
                    if (this.G.i) {
                        this.A.a();
                    }
                    try {
                        h(secretKey);
                    } catch (InvalidKeyException e7) {
                        RuntimeException runtimeException = new RuntimeException("Invalid key exchange", e7);
                        runtimeException.initCause(e7);
                        throw runtimeException;
                    }
                }
            } else {
                if (this.h0 == 0) {
                    f((byte) 10, "client sent unsolicited cert chain", null);
                    throw null;
                }
                cl_48 cl_48Var = new cl_48(this.A);
                cl_48Var.f();
                X509Certificate[] x509CertificateArr = (X509Certificate[]) cl_48Var.b.clone();
                if (x509CertificateArr.length != 0) {
                    X509TrustManager x509TrustManager = this.D.f;
                    try {
                        PublicKey publicKey = x509CertificateArr[0].getPublicKey();
                        this.k0 = publicKey;
                        String algorithm = publicKey.getAlgorithm();
                        if (!algorithm.equals("RSA")) {
                            if (algorithm.equals("DSA")) {
                                str2 = "DSA";
                            } else if (algorithm.equals("EC")) {
                                str2 = "EC";
                            } else {
                                cl_11 cl_11Var2 = this.I;
                                if (cl_11Var2 != cl_11.q && cl_11Var2 != cl_11.r && cl_11Var2 != cl_11.s && cl_11Var2 != cl_11.t && cl_11Var2 != cl_11.u) {
                                    str2 = "UNKNOWN";
                                }
                                str2 = cl_11Var2.v;
                            }
                        }
                        if (!(x509TrustManager instanceof X509ExtendedTrustManager)) {
                            throw new CertificateException("Improper X509TrustManager implementation");
                        }
                        if (sSLSocketImpl != null) {
                            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted((X509Certificate[]) x509CertificateArr.clone(), str2, sSLSocketImpl);
                        } else {
                            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted((X509Certificate[]) x509CertificateArr.clone(), str2, sSLEngineImpl);
                        }
                        this.m0 = true;
                        SSLSessionImpl sSLSessionImpl2 = this.G;
                        if (sSLSessionImpl2.f == null) {
                            sSLSessionImpl2.f = x509CertificateArr;
                        }
                    } catch (CertificateException e8) {
                        f(Alerts.alert_certificate_unknown, null, e8);
                        throw null;
                    }
                } else if (this.h0 != 1) {
                    f(Alerts.alert_bad_certificate, "null cert chain", null);
                    throw null;
                }
            }
        } else {
            cl_46 cl_46Var4 = this.A;
            cl_51 cl_51Var = new cl_51();
            cl_51Var.g = new cl_67();
            cl_51Var.b = cl_84.a(cl_46Var4.c(), cl_46Var4.c());
            cl_51Var.c = new cl_87(cl_46Var4);
            cl_106 cl_106Var = new cl_106(cl_46Var4.n());
            cl_51Var.d = cl_106Var;
            cl_106Var.a();
            SSLLogger.fine("ClientHello sessionId: " + cl_106Var);
            cl_51Var.e = new cl_14(cl_46Var4);
            cl_51Var.f = cl_46Var4.n();
            if (cl_51Var.c() != i) {
                cl_51Var.g = new cl_67(cl_46Var4, false, false);
            }
            J(cl_51Var);
        }
        if (this.C < b) {
            if (b == 15) {
                this.C = b + 2;
            } else {
                this.C = b;
            }
        }
    }
}
