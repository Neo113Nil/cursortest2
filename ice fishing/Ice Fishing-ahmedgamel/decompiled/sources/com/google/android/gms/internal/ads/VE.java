package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final /* synthetic */ class VE implements InterfaceC3850rG, InterfaceC3473kG, UF, SF, InterfaceC3581mG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28926n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ VE f28920u = new VE(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ VE f28921v = new VE(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ VE f28922w = new VE(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ VE f28923x = new VE(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ VE f28924y = new VE(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ VE f28925z = new VE(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ VE f28897A = new VE(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ VE f28898B = new VE(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ VE f28899C = new VE(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ VE f28900D = new VE(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ VE f28901E = new VE(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ VE f28902F = new VE(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ VE f28903G = new VE(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ VE f28904H = new VE(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ VE f28905I = new VE(14);
    public static final /* synthetic */ VE J = new VE(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ VE f28906K = new VE(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ VE f28907L = new VE(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ VE f28908M = new VE(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ VE f28909N = new VE(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ VE f28910O = new VE(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ VE f28911P = new VE(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ VE f28912Q = new VE(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ VE f28913R = new VE(23);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ VE f28914S = new VE(24);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ VE f28915T = new VE(25);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ VE f28916U = new VE(26);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ VE f28917V = new VE(27);

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ VE f28918W = new VE(28);

    /* renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ VE f28919X = new VE(29);

    public /* synthetic */ VE(int i) {
        this.f28926n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3581mG
    public C4174xG a(AbstractC3848rE abstractC3848rE) {
        switch (this.f28926n) {
            case 4:
                YE ye = (YE) abstractC3848rE;
                C3527lG c3527lG = ZE.f29637a;
                C3956tE a9 = ZE.a(ye.f29438b);
                C3906sI C8 = C3960tI.C();
                C8.h();
                ((C3960tI) C8.f28504u).E(ye.f29437a);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", a9, ((C3960tI) C8.j()).a());
            case 8:
                C2990bF c2990bF = (C2990bF) abstractC3848rE;
                C3527lG c3527lG2 = AbstractC3043cF.f30218a;
                return C4174xG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", AbstractC3043cF.a(c2990bF.f30036a), AbstractC3043cF.b(c2990bF).a());
            case 14:
                GE ge = (GE) abstractC3848rE;
                C3527lG c3527lG3 = AbstractC3472kF.f32163a;
                C3956tE a10 = AbstractC3472kF.a(ge.f25748e);
                C3368iH D8 = C3420jH.D();
                C3582mH C9 = C3690oH.C();
                C3744pH B3 = C3798qH.B();
                B3.h();
                ((C3798qH) B3.f28504u).D(ge.f25746c);
                C3798qH c3798qH = (C3798qH) B3.j();
                C9.h();
                ((C3690oH) C9.f28504u).E(c3798qH);
                C9.h();
                ((C3690oH) C9.f28504u).F(ge.f25744a);
                C3690oH c3690oH = (C3690oH) C9.j();
                D8.h();
                ((C3420jH) D8.f28504u).E(c3690oH);
                ZH E8 = C2939aI.E();
                C3046cI d9 = AbstractC3472kF.d(ge);
                E8.h();
                ((C2939aI) E8.f28504u).G(d9);
                E8.h();
                ((C2939aI) E8.f28504u).H(ge.f25745b);
                C2939aI c2939aI = (C2939aI) E8.j();
                D8.h();
                ((C3420jH) D8.f28504u).F(c2939aI);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", a10, ((C3420jH) D8.j()).a());
            case 18:
                JE je = (JE) abstractC3848rE;
                C3527lG c3527lG4 = AbstractC3526lF.f32530a;
                C3956tE a11 = AbstractC3526lF.a(je.f26413c);
                C3959tH D9 = C4013uH.D();
                C4067vH B9 = C4121wH.B();
                B9.h();
                ((C4121wH) B9.f28504u).D(je.f26412b);
                C4121wH c4121wH = (C4121wH) B9.j();
                D9.h();
                ((C4013uH) D9.f28504u).E(c4121wH);
                D9.h();
                ((C4013uH) D9.f28504u).F(je.f26411a);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.AesEaxKey", a11, ((C4013uH) D9.j()).a());
            case 22:
                NE ne = (NE) abstractC3848rE;
                C3527lG c3527lG5 = AbstractC3688oF.f33671a;
                C3956tE a12 = AbstractC3688oF.a(ne.f27261b);
                C4283zH D10 = AH.D();
                D10.h();
                ((AH) D10.f28504u).E(ne.f27260a);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.AesGcmKey", a12, ((AH) D10.j()).a());
            default:
                QE qe = (QE) abstractC3848rE;
                C3527lG c3527lG6 = AbstractC3796qF.f34007a;
                C3956tE a13 = AbstractC3796qF.a(qe.f27794b);
                DH D11 = EH.D();
                D11.h();
                ((EH) D11.f28504u).E(qe.f27793a);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", a13, ((EH) D11.j()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3850rG, com.google.android.gms.internal.ads.UF
    public C4120wG b(WC wc) {
        switch (this.f28926n) {
            case 2:
                XE xe = (XE) wc;
                C3527lG c3527lG = ZE.f29637a;
                C3799qI D8 = C3852rI.D();
                C3906sI C8 = C3960tI.C();
                YE ye = xe.f29285b;
                C8.h();
                ((C3960tI) C8.f28504u).E(ye.f29437a);
                C3960tI c3960tI = (C3960tI) C8.j();
                D8.h();
                ((C3852rI) D8.f28504u).F(c3960tI);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C3852rI) D8.j()).a(), C3902sE.f34681g, ZE.a(xe.f29285b.f29438b), xe.f29287d);
            case 6:
                C2936aF c2936aF = (C2936aF) wc;
                C3527lG c3527lG2 = AbstractC3043cF.f30218a;
                C4014uI D9 = C4068vI.D();
                C4176xI b9 = AbstractC3043cF.b(c2936aF.f29813b);
                D9.h();
                ((C4068vI) D9.f28504u).F(b9);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((C4068vI) D9.j()).a(), C3902sE.f34681g, AbstractC3043cF.a(c2936aF.f29813b.f30036a), c2936aF.f29815d);
            case 12:
                BE be = (BE) wc;
                C3527lG c3527lG3 = AbstractC3472kF.f32163a;
                C3260gH E8 = C3314hH.E();
                C3474kH D10 = C3528lH.D();
                C3744pH B3 = C3798qH.B();
                int i = be.f24632b.f25746c;
                B3.h();
                ((C3798qH) B3.f28504u).D(i);
                C3798qH c3798qH = (C3798qH) B3.j();
                D10.h();
                ((C3528lH) D10.f28504u).F(c3798qH);
                byte[] b10 = ((C3263gK) be.f24633c.f30647u).b();
                HK s9 = JK.s(b10, 0, b10.length);
                D10.h();
                ((C3528lH) D10.f28504u).G(s9);
                C3528lH c3528lH = (C3528lH) D10.j();
                E8.h();
                ((C3314hH) E8.f28504u).G(c3528lH);
                XH E9 = YH.E();
                GE ge = be.f24632b;
                C3046cI d9 = AbstractC3472kF.d(ge);
                E9.h();
                ((YH) E9.f28504u).H(d9);
                byte[] b11 = ((C3263gK) be.f24634d.f30647u).b();
                HK s10 = JK.s(b11, 0, b11.length);
                E9.h();
                ((YH) E9.f28504u).I(s10);
                YH yh = (YH) E9.j();
                E8.h();
                ((C3314hH) E8.f28504u).H(yh);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C3314hH) E8.j()).a(), C3902sE.f34678d, AbstractC3472kF.a(ge.f25748e), be.f24636f);
            case 16:
                HE he = (HE) wc;
                C3527lG c3527lG4 = AbstractC3526lF.f32530a;
                C3851rH E10 = C3905sH.E();
                JE je = he.f26016b;
                C4067vH B9 = C4121wH.B();
                int i4 = je.f26412b;
                B9.h();
                ((C4121wH) B9.f28504u).D(i4);
                C4121wH c4121wH = (C4121wH) B9.j();
                E10.h();
                ((C3905sH) E10.f28504u).G(c4121wH);
                byte[] b12 = ((C3263gK) he.f26017c.f30647u).b();
                HK s11 = JK.s(b12, 0, b12.length);
                E10.h();
                ((C3905sH) E10.f28504u).H(s11);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C3905sH) E10.j()).a(), C3902sE.f34678d, AbstractC3526lF.a(he.f26016b.f26413c), he.f26019e);
            case 20:
                KE ke = (KE) wc;
                C3527lG c3527lG5 = AbstractC3688oF.f33671a;
                C4175xH D11 = C4229yH.D();
                byte[] b13 = ((C3263gK) ke.f26631c.f30647u).b();
                HK s12 = JK.s(b13, 0, b13.length);
                D11.h();
                ((C4229yH) D11.f28504u).F(s12);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C4229yH) D11.j()).a(), C3902sE.f34678d, AbstractC3688oF.a(ke.f26630b.f27261b), ke.f26633e);
            case 24:
                OE oe = (OE) wc;
                C3527lG c3527lG6 = AbstractC3796qF.f34007a;
                BH D12 = CH.D();
                byte[] b14 = ((C3263gK) oe.f27374c.f30647u).b();
                HK s13 = JK.s(b14, 0, b14.length);
                D12.h();
                ((CH) D12.f28504u).F(s13);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((CH) D12.j()).a(), C3902sE.f34678d, AbstractC3796qF.a(oe.f27373b.f27794b), oe.f27376e);
            default:
                RE re = (RE) wc;
                C3527lG c3527lG7 = AbstractC3957tF.f35039a;
                FH D13 = GH.D();
                byte[] b15 = ((C3263gK) re.f27938c.f30647u).b();
                HK s14 = JK.s(b15, 0, b15.length);
                D13.h();
                ((GH) D13.f28504u).F(s14);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((GH) D13.j()).a(), C3902sE.f34678d, AbstractC3957tF.a(re.f27937b.f28492a), re.f27940e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3473kG
    public AbstractC3848rE c(C4174xG c4174xG) {
        C3902sE c3902sE;
        switch (this.f28926n) {
            case 1:
                C3527lG c3527lG = ZE.f29637a;
                C3261gI c3261gI = c4174xG.f35750b;
                if (!c3261gI.A().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI.A())));
                }
                try {
                    JK B3 = c3261gI.B();
                    PK pk = PK.f27540a;
                    int i = BK.f24648a;
                    String A9 = C3960tI.B(B3, PK.f27541b).A();
                    C3956tE c3956tE = c4174xG.f35751c;
                    if (c3956tE == C3956tE.f35016d) {
                        c3902sE = C3902sE.f34684k;
                    } else {
                        if (c3956tE != C3956tE.f35018f) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
                        }
                        c3902sE = C3902sE.f34685l;
                    }
                    return new YE(A9, c3902sE);
                } catch (C3318hL e9) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e9);
                }
            case 5:
                C3527lG c3527lG2 = AbstractC3043cF.f30218a;
                C3261gI c3261gI2 = c4174xG.f35750b;
                if (!c3261gI2.A().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI2.A())));
                }
                try {
                    JK B9 = c3261gI2.B();
                    PK pk2 = PK.f27540a;
                    int i4 = BK.f24648a;
                    return AbstractC3043cF.c(C4176xI.C(B9, PK.f27541b), c4174xG.f35751c);
                } catch (C3318hL e10) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
                }
            case 11:
                C3527lG c3527lG3 = AbstractC3472kF.f32163a;
                C3261gI c3261gI3 = c4174xG.f35750b;
                if (!c3261gI3.A().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI3.A())));
                }
                try {
                    JK B10 = c3261gI3.B();
                    PK pk3 = PK.f27540a;
                    int i6 = BK.f24648a;
                    C3420jH C8 = C3420jH.C(B10, PK.f27541b);
                    if (C8.B().C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    T8 t82 = new T8(6);
                    t82.b(C8.A().B());
                    t82.h(C8.B().B());
                    t82.l(C8.A().A().A());
                    t82.m(C8.B().A().B());
                    t82.f28482x = AbstractC3472kF.c(C8.B().A().A());
                    t82.f28483y = AbstractC3472kF.b(c4174xG.f35751c);
                    return t82.p();
                } catch (C3318hL e11) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e11);
                }
            case 15:
                C3527lG c3527lG4 = AbstractC3526lF.f32530a;
                C3261gI c3261gI4 = c4174xG.f35750b;
                if (!c3261gI4.A().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI4.A())));
                }
                try {
                    JK B11 = c3261gI4.B();
                    PK pk4 = PK.f27540a;
                    int i9 = BK.f24648a;
                    C4013uH C9 = C4013uH.C(B11, PK.f27541b);
                    C2590Gf c2590Gf = new C2590Gf(29);
                    c2590Gf.h(C9.B());
                    c2590Gf.o(C9.A().A());
                    c2590Gf.r();
                    c2590Gf.f25833x = AbstractC3526lF.b(c4174xG.f35751c);
                    return c2590Gf.z();
                } catch (C3318hL e12) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e12);
                }
            case 19:
                C3527lG c3527lG5 = AbstractC3688oF.f33671a;
                C3261gI c3261gI5 = c4174xG.f35750b;
                if (!c3261gI5.A().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI5.A())));
                }
                try {
                    JK B12 = c3261gI5.B();
                    PK pk5 = PK.f27540a;
                    int i10 = BK.f24648a;
                    AH C10 = AH.C(B12, PK.f27541b);
                    if (C10.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    ME me = new ME(0);
                    me.a(C10.A());
                    me.c();
                    me.f();
                    me.f27064e = AbstractC3688oF.b(c4174xG.f35751c);
                    return me.i();
                } catch (C3318hL e13) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e13);
                }
            case 23:
                C3527lG c3527lG6 = AbstractC3796qF.f34007a;
                C3261gI c3261gI6 = c4174xG.f35750b;
                if (!c3261gI6.A().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI6.A())));
                }
                try {
                    JK B13 = c3261gI6.B();
                    PK pk6 = PK.f27540a;
                    int i11 = BK.f24648a;
                    EH C11 = EH.C(B13, PK.f27541b);
                    if (C11.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int A10 = C11.A();
                    if (A10 == 16 || A10 == 32) {
                        return new QE(A10, AbstractC3796qF.b(c4174xG.f35751c));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(A10)));
                } catch (C3318hL e14) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e14);
                }
            default:
                C3527lG c3527lG7 = AbstractC3957tF.f35039a;
                C3261gI c3261gI7 = c4174xG.f35750b;
                if (!c3261gI7.A().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI7.A())));
                }
                try {
                    JK B14 = c3261gI7.B();
                    PK pk7 = PK.f27540a;
                    int i12 = BK.f24648a;
                    HH.A(B14, PK.f27541b);
                    return new TE(AbstractC3957tF.b(c4174xG.f35751c));
                } catch (C3318hL e15) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e15);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.SF
    public WC d(C4120wG c4120wG) {
        C3902sE c3902sE;
        int i = 19;
        boolean z6 = false;
        switch (this.f28926n) {
            case 3:
                C3527lG c3527lG = ZE.f29637a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    JK jk = c4120wG.f35589c;
                    PK pk = PK.f27540a;
                    int i4 = BK.f24648a;
                    C3852rI C8 = C3852rI.C(jk, PK.f27541b);
                    if (C8.A() != 0) {
                        String valueOf = String.valueOf(C8);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                        sb.append("KmsAeadKey are only accepted with version 0, got ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    String A9 = C8.B().A();
                    C3956tE c3956tE = c4120wG.f35591e;
                    if (c3956tE == C3956tE.f35016d) {
                        c3902sE = C3902sE.f34684k;
                    } else {
                        if (c3956tE != C3956tE.f35018f) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
                        }
                        c3902sE = C3902sE.f34685l;
                    }
                    return XE.j(new YE(A9, c3902sE), c4120wG.f35592f);
                } catch (C3318hL e9) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e9);
                }
            case 7:
                C3527lG c3527lG2 = AbstractC3043cF.f30218a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    JK jk2 = c4120wG.f35589c;
                    PK pk2 = PK.f27540a;
                    int i6 = BK.f24648a;
                    C4068vI C9 = C4068vI.C(jk2, PK.f27541b);
                    if (C9.A() != 0) {
                        String valueOf2 = String.valueOf(C9);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 58);
                        sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                        sb2.append(valueOf2);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                    C4176xI B3 = C9.B();
                    C3956tE c3956tE2 = c4120wG.f35591e;
                    C3956tE c3956tE3 = C3956tE.f35016d;
                    if (c3956tE2 != c3956tE3 && c3956tE2 != (c3956tE3 = C3956tE.f35018f)) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE2.f35038b));
                    }
                    return C2936aF.j(AbstractC3043cF.c(B3, c3956tE3), c4120wG.f35592f);
                } catch (C3318hL e10) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
                }
            case 13:
                C3527lG c3527lG3 = AbstractC3472kF.f32163a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    JK jk3 = c4120wG.f35589c;
                    PK pk3 = PK.f27540a;
                    int i9 = BK.f24648a;
                    C3314hH D8 = C3314hH.D(jk3, PK.f27541b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (D8.B().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (D8.C().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    T8 t82 = new T8(6);
                    t82.b(D8.B().C().f());
                    t82.h(D8.C().C().f());
                    t82.l(D8.B().B().A());
                    t82.m(D8.C().B().B());
                    t82.f28482x = AbstractC3472kF.c(D8.C().B().A());
                    t82.f28483y = AbstractC3472kF.b(c4120wG.f35591e);
                    GE p9 = t82.p();
                    C2590Gf c2590Gf = new C2590Gf(28);
                    c2590Gf.f25830u = p9;
                    c2590Gf.f25831v = new C3128du(8, C3263gK.a(D8.B().C().a()));
                    c2590Gf.f25832w = new C3128du(8, C3263gK.a(D8.C().C().a()));
                    c2590Gf.f25833x = c4120wG.f35592f;
                    return c2590Gf.y();
                } catch (C3318hL unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 17:
                C3527lG c3527lG4 = AbstractC3526lF.f32530a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    JK jk4 = c4120wG.f35589c;
                    PK pk4 = PK.f27540a;
                    int i10 = BK.f24648a;
                    C3905sH D9 = C3905sH.D(jk4, PK.f27541b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2590Gf c2590Gf2 = new C2590Gf(29);
                    c2590Gf2.h(D9.C().f());
                    c2590Gf2.o(D9.B().A());
                    c2590Gf2.r();
                    c2590Gf2.f25833x = AbstractC3526lF.b(c4120wG.f35591e);
                    JE z9 = c2590Gf2.z();
                    C4297ze c4297ze = new C4297ze(19, false);
                    c4297ze.f36133u = z9;
                    c4297ze.f36134v = new C3128du(8, C3263gK.a(D9.C().a()));
                    c4297ze.f36135w = c4120wG.f35592f;
                    return c4297ze.s();
                } catch (C3318hL unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxKey failed");
                }
            case 21:
                C3527lG c3527lG5 = AbstractC3688oF.f33671a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    JK jk5 = c4120wG.f35589c;
                    PK pk5 = PK.f27540a;
                    int i11 = BK.f24648a;
                    C4229yH C10 = C4229yH.C(jk5, PK.f27541b);
                    if (C10.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ME me = new ME(0);
                    me.a(C10.B().f());
                    me.c();
                    me.f();
                    me.f27064e = AbstractC3688oF.b(c4120wG.f35591e);
                    NE i12 = me.i();
                    C3504ku c3504ku = new C3504ku(i, z6);
                    c3504ku.f32445u = i12;
                    c3504ku.f32446v = new C3128du(8, C3263gK.a(C10.B().a()));
                    c3504ku.f32447w = c4120wG.f35592f;
                    return c3504ku.u();
                } catch (C3318hL unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 25:
                C3527lG c3527lG6 = AbstractC3796qF.f34007a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    JK jk6 = c4120wG.f35589c;
                    PK pk6 = PK.f27540a;
                    int i13 = BK.f24648a;
                    CH C11 = CH.C(jk6, PK.f27541b);
                    if (C11.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int f2 = C11.B().f();
                    if (f2 != 16 && f2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(f2)));
                    }
                    QE qe = new QE(f2, AbstractC3796qF.b(c4120wG.f35591e));
                    C4297ze c4297ze2 = new C4297ze(20, false);
                    c4297ze2.f36133u = qe;
                    c4297ze2.f36134v = new C3128du(8, C3263gK.a(C11.B().a()));
                    c4297ze2.f36135w = c4120wG.f35592f;
                    return c4297ze2.t();
                } catch (C3318hL unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            default:
                C3527lG c3527lG7 = AbstractC3957tF.f35039a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    JK jk7 = c4120wG.f35589c;
                    PK pk7 = PK.f27540a;
                    int i14 = BK.f24648a;
                    GH C12 = GH.C(jk7, PK.f27541b);
                    if (C12.A() == 0) {
                        return RE.j(AbstractC3957tF.b(c4120wG.f35591e), new C3128du(8, C3263gK.a(C12.B().a())), c4120wG.f35592f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3318hL unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3850rG, com.google.android.gms.internal.ads.UF
    public Object b(WC wc) {
        switch (this.f28926n) {
            case 0:
                XF xf = WE.f29124a;
                AbstractC3741pE.a(((C2936aF) wc).f29813b.f30037b);
                throw null;
            case 9:
                C3150eF c3150eF = (C3150eF) wc;
                c3150eF.getClass();
                return new BF(((C3263gK) c3150eF.f30694c.f30647u).b(), c3150eF.f30695d, c3150eF.f30693b.f31316b);
            default:
                C3312hF c3312hF = (C3312hF) wc;
                C3797qG c3797qG = AbstractC3366iF.f31787a;
                try {
                    C3849rF.b();
                    return new DF(((C3263gK) c3312hF.f31517c.f30647u).b(), c3312hF.f31518d.b(), C3849rF.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C4227yF(3, ((C3263gK) c3312hF.f31517c.f30647u).b(), c3312hF.f31518d.b());
                }
        }
    }
}
