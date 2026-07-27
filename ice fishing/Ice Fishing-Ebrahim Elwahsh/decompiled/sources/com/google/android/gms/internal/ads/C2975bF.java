package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.bF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2975bF implements InterfaceC3679oG, YF, WF, InterfaceC3787qG, InterfaceC4056vG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29466n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29460u = new C2975bF(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29461v = new C2975bF(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29462w = new C2975bF(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29463x = new C2975bF(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29464y = new C2975bF(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29465z = new C2975bF(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29437A = new C2975bF(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29438B = new C2975bF(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29439C = new C2975bF(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29440D = new C2975bF(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29441E = new C2975bF(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29442F = new C2975bF(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29443G = new C2975bF(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29444H = new C2975bF(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29445I = new C2975bF(14);
    public static final /* synthetic */ C2975bF J = new C2975bF(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29446K = new C2975bF(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29447L = new C2975bF(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29448M = new C2975bF(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29449N = new C2975bF(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29450O = new C2975bF(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29451P = new C2975bF(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29452Q = new C2975bF(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29453R = new C2975bF(23);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29454S = new C2975bF(24);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29455T = new C2975bF(25);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29456U = new C2975bF(26);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29457V = new C2975bF(27);

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29458W = new C2975bF(28);

    /* renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ C2975bF f29459X = new C2975bF(29);

    public /* synthetic */ C2975bF(int i) {
        this.f29466n = i;
    }

    @Override // com.google.android.gms.internal.ads.WF
    public XC a(BG bg) {
        int i = 19;
        boolean z8 = false;
        switch (this.f29466n) {
            case 2:
                C3733pG c3733pG = AbstractC3029cF.f29657a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    SK sk = bg.f24014c;
                    YK yk = YK.f28820a;
                    int i4 = KK.f25952a;
                    C4166xI C7 = C4166xI.C(sk, YK.f28821b);
                    if (C7.A() == 0) {
                        return ZE.k(new C2920aF(C7.B().A(), AbstractC3029cF.b(bg.f24016e)), bg.f24017f);
                    }
                    String valueOf = String.valueOf(C7);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                    sb.append("KmsAeadKey are only accepted with version 0, got ");
                    sb.append(valueOf);
                    throw new GeneralSecurityException(sb.toString());
                } catch (C3845rL e6) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e6);
                }
            case 6:
                C3733pG c3733pG2 = AbstractC3193fF.f30637a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    SK sk2 = bg.f24014c;
                    YK yk2 = YK.f28820a;
                    int i9 = KK.f25952a;
                    BI C8 = BI.C(sk2, YK.f28821b);
                    if (C8.A() == 0) {
                        return C3084dF.k(AbstractC3193fF.c(C8.B(), bg.f24016e), bg.f24017f);
                    }
                    String valueOf2 = String.valueOf(C8);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 58);
                    sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb2.append(valueOf2);
                    throw new GeneralSecurityException(sb2.toString());
                } catch (C3845rL e9) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e9);
                }
            case 12:
                C3733pG c3733pG3 = AbstractC3678oF.f33120a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    SK sk3 = bg.f24014c;
                    YK yk3 = YK.f28820a;
                    int i10 = KK.f25952a;
                    C3680oH D8 = C3680oH.D(sk3, YK.f28821b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (D8.B().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (D8.C().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    Q8 q82 = new Q8(6);
                    q82.b(D8.B().C().f());
                    q82.g(D8.C().C().f());
                    q82.k(D8.B().B().A());
                    q82.l(D8.C().B().B());
                    q82.f27123x = AbstractC3678oF.c(D8.C().B().A());
                    q82.f27124y = AbstractC3678oF.b(bg.f24016e);
                    IE n9 = q82.n();
                    C2518Df c2518Df = new C2518Df(28);
                    c2518Df.f24453u = n9;
                    c2518Df.f24454v = new Mu(7, C3791qK.a(D8.B().C().a()));
                    c2518Df.f24455w = new Mu(7, C3791qK.a(D8.C().C().a()));
                    c2518Df.f24456x = bg.f24017f;
                    return c2518Df.y();
                } catch (C3845rL unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 16:
                C3733pG c3733pG4 = AbstractC3732pF.f33370a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    SK sk4 = bg.f24014c;
                    YK yk4 = YK.f28820a;
                    int i11 = KK.f25952a;
                    C4219yH D9 = C4219yH.D(sk4, YK.f28821b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2518Df c2518Df2 = new C2518Df(29);
                    c2518Df2.j(D9.C().f());
                    c2518Df2.r(D9.B().A());
                    c2518Df2.u();
                    c2518Df2.f24456x = AbstractC3732pF.b(bg.f24016e);
                    ME z9 = c2518Df2.z();
                    C4017ue c4017ue = new C4017ue(19, false);
                    c4017ue.f34630u = z9;
                    c4017ue.f34631v = new Mu(7, C3791qK.a(D9.C().a()));
                    c4017ue.f34632w = bg.f24017f;
                    return c4017ue.u();
                } catch (C3845rL unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxKey failed");
                }
            case 20:
                C3733pG c3733pG5 = AbstractC3839rF.f34001a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    SK sk5 = bg.f24014c;
                    YK yk5 = YK.f28820a;
                    int i12 = KK.f25952a;
                    EH C9 = EH.C(sk5, YK.f28821b);
                    if (C9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    PE pe = new PE(0);
                    pe.a(C9.B().f());
                    pe.c();
                    pe.f();
                    pe.f26885e = AbstractC3839rF.b(bg.f24016e);
                    QE i13 = pe.i();
                    C3602mu c3602mu = new C3602mu(i, z8);
                    c3602mu.f32774u = i13;
                    c3602mu.f32775v = new Mu(7, C3791qK.a(C9.B().a()));
                    c3602mu.f32776w = bg.f24017f;
                    return c3602mu.w();
                } catch (C3845rL unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 24:
                C3733pG c3733pG6 = AbstractC3947tF.f34384a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    SK sk6 = bg.f24014c;
                    YK yk6 = YK.f28820a;
                    int i14 = KK.f25952a;
                    IH C10 = IH.C(sk6, YK.f28821b);
                    if (C10.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int f6 = C10.B().f();
                    if (f6 != 16 && f6 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(f6)));
                    }
                    TE te = new TE(f6, AbstractC3947tF.b(bg.f24016e));
                    C4017ue c4017ue2 = new C4017ue(20, false);
                    c4017ue2.f34630u = te;
                    c4017ue2.f34631v = new Mu(7, C3791qK.a(C10.B().a()));
                    c4017ue2.f34632w = bg.f24017f;
                    return c4017ue2.v();
                } catch (C3845rL unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            default:
                C3733pG c3733pG7 = AbstractC4055vF.f34744a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    SK sk7 = bg.f24014c;
                    YK yk7 = YK.f28820a;
                    int i15 = KK.f25952a;
                    MH C11 = MH.C(sk7, YK.f28821b);
                    if (C11.A() == 0) {
                        return UE.k(AbstractC4055vF.b(bg.f24016e), new Mu(7, C3791qK.a(C11.B().a())), bg.f24017f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3845rL unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3679oG
    public AbstractC4000uE b(CG cg) {
        switch (this.f29466n) {
            case 0:
                C3733pG c3733pG = AbstractC3029cF.f29657a;
                C3573mI c3573mI = cg.f24159b;
                if (!c3573mI.A().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI.A())));
                }
                try {
                    SK B8 = c3573mI.B();
                    YK yk = YK.f28820a;
                    int i = KK.f25952a;
                    return new C2920aF(C4274zI.B(B8, YK.f28821b).A(), AbstractC3029cF.b(c3573mI.C()));
                } catch (C3845rL e6) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e6);
                }
            case 4:
                C3733pG c3733pG2 = AbstractC3193fF.f30637a;
                C3573mI c3573mI2 = cg.f24159b;
                if (!c3573mI2.A().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI2.A())));
                }
                try {
                    SK B9 = c3573mI2.B();
                    YK yk2 = YK.f28820a;
                    int i4 = KK.f25952a;
                    return AbstractC3193fF.c(DI.C(B9, YK.f28821b), c3573mI2.C());
                } catch (C3845rL e9) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e9);
                }
            case 10:
                C3733pG c3733pG3 = AbstractC3678oF.f33120a;
                C3573mI c3573mI3 = cg.f24159b;
                if (!c3573mI3.A().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI3.A())));
                }
                try {
                    SK B10 = c3573mI3.B();
                    YK yk3 = YK.f28820a;
                    int i9 = KK.f25952a;
                    C3788qH C7 = C3788qH.C(B10, YK.f28821b);
                    if (C7.B().C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    Q8 q82 = new Q8(6);
                    q82.b(C7.A().B());
                    q82.g(C7.B().B());
                    q82.k(C7.A().A().A());
                    q82.l(C7.B().A().B());
                    q82.f27123x = AbstractC3678oF.c(C7.B().A().A());
                    q82.f27124y = AbstractC3678oF.b(c3573mI3.C());
                    return q82.n();
                } catch (C3845rL e10) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
                }
            case 14:
                C3733pG c3733pG4 = AbstractC3732pF.f33370a;
                C3573mI c3573mI4 = cg.f24159b;
                if (!c3573mI4.A().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI4.A())));
                }
                try {
                    SK B11 = c3573mI4.B();
                    YK yk4 = YK.f28820a;
                    int i10 = KK.f25952a;
                    AH C8 = AH.C(B11, YK.f28821b);
                    C2518Df c2518Df = new C2518Df(29);
                    c2518Df.j(C8.B());
                    c2518Df.r(C8.A().A());
                    c2518Df.u();
                    c2518Df.f24456x = AbstractC3732pF.b(c3573mI4.C());
                    return c2518Df.z();
                } catch (C3845rL e11) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e11);
                }
            case 18:
                C3733pG c3733pG5 = AbstractC3839rF.f34001a;
                C3573mI c3573mI5 = cg.f24159b;
                if (!c3573mI5.A().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI5.A())));
                }
                try {
                    SK B12 = c3573mI5.B();
                    YK yk5 = YK.f28820a;
                    int i11 = KK.f25952a;
                    GH C9 = GH.C(B12, YK.f28821b);
                    if (C9.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    PE pe = new PE(0);
                    pe.a(C9.A());
                    pe.c();
                    pe.f();
                    pe.f26885e = AbstractC3839rF.b(c3573mI5.C());
                    return pe.i();
                } catch (C3845rL e12) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e12);
                }
            case 22:
                C3733pG c3733pG6 = AbstractC3947tF.f34384a;
                C3573mI c3573mI6 = cg.f24159b;
                if (!c3573mI6.A().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI6.A())));
                }
                try {
                    SK B13 = c3573mI6.B();
                    YK yk6 = YK.f28820a;
                    int i12 = KK.f25952a;
                    KH C10 = KH.C(B13, YK.f28821b);
                    if (C10.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int A8 = C10.A();
                    if (A8 == 16 || A8 == 32) {
                        return new TE(A8, AbstractC3947tF.b(c3573mI6.C()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(A8)));
                } catch (C3845rL e13) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e13);
                }
            default:
                C3733pG c3733pG7 = AbstractC4055vF.f34744a;
                C3573mI c3573mI7 = cg.f24159b;
                if (!c3573mI7.A().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI7.A())));
                }
                try {
                    SK B14 = c3573mI7.B();
                    YK yk7 = YK.f28820a;
                    int i13 = KK.f25952a;
                    OH.A(B14, YK.f28821b);
                    return new WE(AbstractC4055vF.b(c3573mI7.C()));
                } catch (C3845rL e14) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e14);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.YF, com.google.android.gms.internal.ads.InterfaceC4056vG
    public BG c(XC xc) {
        switch (this.f29466n) {
            case 1:
                ZE ze = (ZE) xc;
                C3733pG c3733pG = AbstractC3029cF.f29657a;
                C4112wI D8 = C4166xI.D();
                C4220yI C7 = C4274zI.C();
                C2920aF c2920aF = ze.f28973b;
                C7.h();
                ((C4274zI) C7.f30000u).E(c2920aF.f29187a);
                C4274zI c4274zI = (C4274zI) C7.j();
                D8.h();
                ((C4166xI) D8.f30000u).F(c4274zI);
                return BG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C4166xI) D8.j()).a(), 5, AbstractC3029cF.a(ze.f28973b.f29188b), ze.f28975d);
            case 5:
                C3084dF c3084dF = (C3084dF) xc;
                C3733pG c3733pG2 = AbstractC3193fF.f30637a;
                AI D9 = BI.D();
                DI b9 = AbstractC3193fF.b(c3084dF.f29991b);
                D9.h();
                ((BI) D9.f30000u).F(b9);
                return BG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((BI) D9.j()).a(), 5, AbstractC3193fF.a(c3084dF.f29991b.f30336a), c3084dF.f29993d);
            case 11:
                CE ce = (CE) xc;
                C3733pG c3733pG3 = AbstractC3678oF.f33120a;
                C3626nH E8 = C3680oH.E();
                C3841rH D10 = C3895sH.D();
                C4057vH B8 = C4111wH.B();
                int i = ce.f24150b.f25541c;
                B8.h();
                ((C4111wH) B8.f30000u).D(i);
                C4111wH c4111wH = (C4111wH) B8.j();
                D10.h();
                ((C3895sH) D10.f30000u).F(c4111wH);
                byte[] b10 = ((C3791qK) ce.f24151c.f26395u).b();
                QK s3 = SK.s(b10, 0, b10.length);
                D10.h();
                ((C3895sH) D10.f30000u).G(s3);
                C3895sH c3895sH = (C3895sH) D10.j();
                E8.h();
                ((C3680oH) E8.f30000u).G(c3895sH);
                C3087dI E9 = C3141eI.E();
                IE ie = ce.f24150b;
                C3359iI d2 = AbstractC3678oF.d(ie);
                E9.h();
                ((C3141eI) E9.f30000u).H(d2);
                byte[] b11 = ((C3791qK) ce.f24152d.f26395u).b();
                QK s6 = SK.s(b11, 0, b11.length);
                E9.h();
                ((C3141eI) E9.f30000u).I(s6);
                C3141eI c3141eI = (C3141eI) E9.j();
                E8.h();
                ((C3680oH) E8.f30000u).H(c3141eI);
                return BG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C3680oH) E8.j()).a(), 2, AbstractC3678oF.a(ie.f25543e), ce.f24154f);
            case 15:
                JE je = (JE) xc;
                C3733pG c3733pG4 = AbstractC3732pF.f33370a;
                C4165xH E10 = C4219yH.E();
                ME me = je.f25749b;
                BH B9 = CH.B();
                int i4 = me.f26314b;
                B9.h();
                ((CH) B9.f30000u).D(i4);
                CH ch = (CH) B9.j();
                E10.h();
                ((C4219yH) E10.f30000u).G(ch);
                byte[] b12 = ((C3791qK) je.f25750c.f26395u).b();
                QK s9 = SK.s(b12, 0, b12.length);
                E10.h();
                ((C4219yH) E10.f30000u).H(s9);
                return BG.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C4219yH) E10.j()).a(), 2, AbstractC3732pF.a(je.f25749b.f26315c), je.f25752e);
            case 19:
                NE ne = (NE) xc;
                C3733pG c3733pG5 = AbstractC3839rF.f34001a;
                DH D11 = EH.D();
                byte[] b13 = ((C3791qK) ne.f26495c.f26395u).b();
                QK s10 = SK.s(b13, 0, b13.length);
                D11.h();
                ((EH) D11.f30000u).F(s10);
                return BG.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((EH) D11.j()).a(), 2, AbstractC3839rF.a(ne.f26494b.f27131b), ne.f26497e);
            case 23:
                RE re = (RE) xc;
                C3733pG c3733pG6 = AbstractC3947tF.f34384a;
                HH D12 = IH.D();
                byte[] b14 = ((C3791qK) re.f27323c.f26395u).b();
                QK s11 = SK.s(b14, 0, b14.length);
                D12.h();
                ((IH) D12.f30000u).F(s11);
                return BG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((IH) D12.j()).a(), 2, AbstractC3947tF.a(re.f27322b.f27729b), re.f27325e);
            default:
                UE ue = (UE) xc;
                C3733pG c3733pG7 = AbstractC4055vF.f34744a;
                LH D13 = MH.D();
                byte[] b15 = ((C3791qK) ue.f27949c.f26395u).b();
                QK s12 = SK.s(b15, 0, b15.length);
                D13.h();
                ((MH) D13.f30000u).F(s12);
                return BG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((MH) D13.j()).a(), 2, AbstractC4055vF.a(ue.f27948b.f28375a), ue.f27951e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3787qG
    public CG e(AbstractC4000uE abstractC4000uE) {
        switch (this.f29466n) {
            case 3:
                C2920aF c2920aF = (C2920aF) abstractC4000uE;
                C3733pG c3733pG = AbstractC3029cF.f29657a;
                C3519lI E8 = C3573mI.E();
                E8.m("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                C4220yI C7 = C4274zI.C();
                String str = c2920aF.f29187a;
                C7.h();
                ((C4274zI) C7.f30000u).E(str);
                E8.n(((C4274zI) C7.j()).a());
                E8.o(AbstractC3029cF.a(c2920aF.f29188b));
                return CG.a((C3573mI) E8.j());
            case 7:
                C3138eF c3138eF = (C3138eF) abstractC4000uE;
                C3733pG c3733pG2 = AbstractC3193fF.f30637a;
                C3519lI E9 = C3573mI.E();
                E9.m("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                E9.n(AbstractC3193fF.b(c3138eF).a());
                E9.o(AbstractC3193fF.a(c3138eF.f30336a));
                return CG.a((C3573mI) E9.j());
            case 13:
                IE ie = (IE) abstractC4000uE;
                C3733pG c3733pG3 = AbstractC3678oF.f33120a;
                C3519lI E10 = C3573mI.E();
                E10.m("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                C3734pH D8 = C3788qH.D();
                C3949tH C8 = C4003uH.C();
                C4057vH B8 = C4111wH.B();
                int i = ie.f25541c;
                B8.h();
                ((C4111wH) B8.f30000u).D(i);
                C4111wH c4111wH = (C4111wH) B8.j();
                C8.h();
                ((C4003uH) C8.f30000u).E(c4111wH);
                C8.h();
                ((C4003uH) C8.f30000u).F(ie.f25539a);
                C4003uH c4003uH = (C4003uH) C8.j();
                D8.h();
                ((C3788qH) D8.f30000u).E(c4003uH);
                C3196fI E11 = C3251gI.E();
                C3359iI d2 = AbstractC3678oF.d(ie);
                E11.h();
                ((C3251gI) E11.f30000u).G(d2);
                E11.h();
                ((C3251gI) E11.f30000u).H(ie.f25540b);
                C3251gI c3251gI = (C3251gI) E11.j();
                D8.h();
                ((C3788qH) D8.f30000u).F(c3251gI);
                E10.n(((C3788qH) D8.j()).a());
                E10.o(AbstractC3678oF.a(ie.f25543e));
                return CG.a((C3573mI) E10.j());
            case 17:
                ME me = (ME) abstractC4000uE;
                C3733pG c3733pG4 = AbstractC3732pF.f33370a;
                C3519lI E12 = C3573mI.E();
                E12.m("type.googleapis.com/google.crypto.tink.AesEaxKey");
                C4273zH D9 = AH.D();
                BH B9 = CH.B();
                int i4 = me.f26314b;
                B9.h();
                ((CH) B9.f30000u).D(i4);
                CH ch = (CH) B9.j();
                D9.h();
                ((AH) D9.f30000u).E(ch);
                D9.h();
                ((AH) D9.f30000u).F(me.f26313a);
                E12.n(((AH) D9.j()).a());
                E12.o(AbstractC3732pF.a(me.f26315c));
                return CG.a((C3573mI) E12.j());
            case 21:
                QE qe = (QE) abstractC4000uE;
                C3733pG c3733pG5 = AbstractC3839rF.f34001a;
                C3519lI E13 = C3573mI.E();
                E13.m("type.googleapis.com/google.crypto.tink.AesGcmKey");
                FH D10 = GH.D();
                int i9 = qe.f27130a;
                D10.h();
                ((GH) D10.f30000u).E(i9);
                E13.n(((GH) D10.j()).a());
                E13.o(AbstractC3839rF.a(qe.f27131b));
                return CG.a((C3573mI) E13.j());
            case 25:
                TE te = (TE) abstractC4000uE;
                C3733pG c3733pG6 = AbstractC3947tF.f34384a;
                C3519lI E14 = C3573mI.E();
                E14.m("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                JH D11 = KH.D();
                int i10 = te.f27728a;
                D11.h();
                ((KH) D11.f30000u).E(i10);
                E14.n(((KH) D11.j()).a());
                E14.o(AbstractC3947tF.a(te.f27729b));
                return CG.a((C3573mI) E14.j());
            default:
                C3733pG c3733pG7 = AbstractC4055vF.f34744a;
                C3519lI E15 = C3573mI.E();
                E15.m("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                E15.n(OH.B().a());
                E15.o(AbstractC4055vF.a(((WE) abstractC4000uE).f28375a));
                return CG.a((C3573mI) E15.j());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4056vG
    public Object c(XC xc) {
        switch (this.f29466n) {
            case 8:
                C3302hF c3302hF = (C3302hF) xc;
                c3302hF.getClass();
                return new CF(((C3791qK) c3302hF.f31219c.f26395u).b(), c3302hF.f31220d, c3302hF.f31218b.f32095b);
            default:
                C3462kF c3462kF = (C3462kF) xc;
                C4002uG c4002uG = AbstractC3516lF.f32554a;
                try {
                    C4001uF.b();
                    return new FF(((C3791qK) c3462kF.f32282c.f26395u).b(), c3462kF.f32283d.b(), C4001uF.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C4271zF(3, ((C3791qK) c3462kF.f32282c.f26395u).b(), c3462kF.f32283d.b());
                }
        }
    }
}
