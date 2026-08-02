package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/* renamed from: com.google.android.gms.internal.ads.sF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3903sF implements InterfaceC3581mG, InterfaceC3473kG, UF, SF, InterfaceC3850rG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34725n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34719u = new C3903sF(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34720v = new C3903sF(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34721w = new C3903sF(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34722x = new C3903sF(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34723y = new C3903sF(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34724z = new C3903sF(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34697A = new C3903sF(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34698B = new C3903sF(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34699C = new C3903sF(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34700D = new C3903sF(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34701E = new C3903sF(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34702F = new C3903sF(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34703G = new C3903sF(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34704H = new C3903sF(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34705I = new C3903sF(14);
    public static final /* synthetic */ C3903sF J = new C3903sF(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34706K = new C3903sF(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34707L = new C3903sF(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34708M = new C3903sF(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34709N = new C3903sF(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34710O = new C3903sF(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34711P = new C3903sF(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34712Q = new C3903sF(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34713R = new C3903sF(23);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34714S = new C3903sF(25);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34715T = new C3903sF(26);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34716U = new C3903sF(27);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34717V = new C3903sF(28);

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ C3903sF f34718W = new C3903sF(29);

    public /* synthetic */ C3903sF(int i) {
        this.f34725n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3581mG
    public C4174xG a(AbstractC3848rE abstractC3848rE) {
        switch (this.f34725n) {
            case 0:
                C3527lG c3527lG = AbstractC3957tF.f35039a;
                return C4174xG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", AbstractC3957tF.a(((TE) abstractC3848rE).f28492a), HH.B().a());
            case 4:
                C3258gF c3258gF = (C3258gF) abstractC3848rE;
                C3527lG c3527lG2 = CF.f24843a;
                C3956tE a9 = CF.a(c3258gF.f31315a);
                RI D8 = SI.D();
                TI B3 = UI.B();
                B3.h();
                ((UI) B3.f28504u).D(c3258gF.f31316b);
                UI ui = (UI) B3.j();
                D8.h();
                ((SI) D8.f28504u).E(ui);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", a9, ((SI) D8.j()).a());
            case 8:
                C3527lG c3527lG3 = EF.f25331a;
                return C4174xG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", EF.a(((C3418jF) abstractC3848rE).f32008a), XI.C().a());
            case 19:
                GG gg = (GG) abstractC3848rE;
                C3527lG c3527lG4 = RG.f27943a;
                C3956tE a10 = RG.a(gg.f25753c);
                C3045cH D9 = C3099dH.D();
                C3152eH B9 = C3206fH.B();
                B9.h();
                ((C3206fH) B9.f28504u).D(gg.f25752b);
                C3206fH c3206fH = (C3206fH) B9.j();
                D9.h();
                ((C3099dH) D9.f28504u).F(c3206fH);
                D9.h();
                ((C3099dH) D9.f28504u).E(gg.f25751a);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.AesCmacKey", a10, ((C3099dH) D9.j()).a());
            default:
                LG lg = (LG) abstractC3848rE;
                S0.e eVar = TG.f28495a;
                C3956tE a11 = TG.a(lg.f26889c);
                ZH E8 = C2939aI.E();
                C2993bI C8 = C3046cI.C();
                C8.h();
                ((C3046cI) C8.f28504u).F(lg.f26888b);
                WH wh = (WH) TG.f28495a.H(lg.f26890d);
                C8.h();
                ((C3046cI) C8.f28504u).E(wh);
                C3046cI c3046cI = (C3046cI) C8.j();
                E8.h();
                ((C2939aI) E8.f28504u).G(c3046cI);
                E8.h();
                ((C2939aI) E8.f28504u).H(lg.f26887a);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.HmacKey", a11, ((C2939aI) E8.j()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.UF
    public C4120wG b(WC wc) {
        switch (this.f34725n) {
            case 2:
                C3150eF c3150eF = (C3150eF) wc;
                C3527lG c3527lG = CF.f24843a;
                PI E8 = QI.E();
                byte[] b9 = ((C3263gK) c3150eF.f30694c.f30647u).b();
                HK s9 = JK.s(b9, 0, b9.length);
                E8.h();
                ((QI) E8.f28504u).G(s9);
                TI B3 = UI.B();
                C3258gF c3258gF = c3150eF.f30693b;
                B3.h();
                ((UI) B3.f28504u).D(c3258gF.f31316b);
                UI ui = (UI) B3.j();
                E8.h();
                ((QI) E8.f28504u).F(ui);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((QI) E8.j()).a(), C3902sE.f34678d, CF.a(c3258gF.f31315a), c3150eF.f30696e);
            case 6:
                C3312hF c3312hF = (C3312hF) wc;
                C3527lG c3527lG2 = EF.f25331a;
                VI D8 = WI.D();
                byte[] b10 = ((C3263gK) c3312hF.f31517c.f30647u).b();
                HK s10 = JK.s(b10, 0, b10.length);
                D8.h();
                ((WI) D8.f28504u).F(s10);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((WI) D8.j()).a(), C3902sE.f34678d, EF.a(c3312hF.f31516b.f32008a), c3312hF.f31519e);
            case 10:
                C4120wG c4120wG = ((ZF) wc).f29641b;
                C3902sE c3902sE = c4120wG.f35590d;
                return c4120wG;
            case 17:
                EG eg = (EG) wc;
                C3527lG c3527lG3 = RG.f27943a;
                C2938aH E9 = C2992bH.E();
                GG gg = eg.f25335b;
                C3152eH B9 = C3206fH.B();
                int i = gg.f25752b;
                B9.h();
                ((C3206fH) B9.f28504u).D(i);
                C3206fH c3206fH = (C3206fH) B9.j();
                E9.h();
                ((C2992bH) E9.f28504u).H(c3206fH);
                byte[] b11 = ((C3263gK) eg.f25336c.f30647u).b();
                HK s11 = JK.s(b11, 0, b11.length);
                E9.h();
                ((C2992bH) E9.f28504u).G(s11);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C2992bH) E9.j()).a(), C3902sE.f34678d, RG.a(eg.f25335b.f25753c), eg.f25338e);
            default:
                IG ig = (IG) wc;
                S0.e eVar = TG.f28495a;
                XH E10 = YH.E();
                LG lg = ig.f26219b;
                C2993bI C8 = C3046cI.C();
                int i4 = lg.f26888b;
                C8.h();
                ((C3046cI) C8.f28504u).F(i4);
                WH wh = (WH) TG.f28495a.H(lg.f26890d);
                C8.h();
                ((C3046cI) C8.f28504u).E(wh);
                C3046cI c3046cI = (C3046cI) C8.j();
                E10.h();
                ((YH) E10.f28504u).H(c3046cI);
                byte[] b12 = ((C3263gK) ig.f26220c.f30647u).b();
                HK s12 = JK.s(b12, 0, b12.length);
                E10.h();
                ((YH) E10.f28504u).I(s12);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.HmacKey", ((YH) E10.j()).a(), C3902sE.f34678d, TG.a(ig.f26219b.f26889c), ig.f26222e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3473kG
    public AbstractC3848rE c(C4174xG c4174xG) {
        C3579mE c3579mE;
        switch (this.f34725n) {
            case 1:
                C3527lG c3527lG = CF.f24843a;
                C3261gI c3261gI = c4174xG.f35750b;
                if (!c3261gI.A().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI.A())));
                }
                try {
                    JK B3 = c3261gI.B();
                    PK pk = PK.f27540a;
                    int i = BK.f24648a;
                    SI C8 = SI.C(B3, PK.f27541b);
                    if (C8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    C3956tE c3956tE = c4174xG.f35751c;
                    if (c3956tE == C3956tE.f35016d) {
                        c3579mE = C3579mE.f32697E;
                    } else {
                        if (c3956tE != C3956tE.f35018f) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
                        }
                        c3579mE = C3579mE.f32698F;
                    }
                    return C3258gF.b(c3579mE, C8.B().A());
                } catch (C3318hL e9) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e9);
                }
            case 5:
                C3527lG c3527lG2 = EF.f25331a;
                C3261gI c3261gI2 = c4174xG.f35750b;
                if (!c3261gI2.A().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI2.A())));
                }
                try {
                    JK B9 = c3261gI2.B();
                    PK pk2 = PK.f27540a;
                    int i4 = BK.f24648a;
                    if (XI.B(B9, PK.f27541b).A() == 0) {
                        return new C3418jF(EF.b(c4174xG.f35751c));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (C3318hL e10) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
                }
            case 16:
                C3527lG c3527lG3 = RG.f27943a;
                C3261gI c3261gI3 = c4174xG.f35750b;
                if (!c3261gI3.A().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI3.A())));
                }
                try {
                    JK B10 = c3261gI3.B();
                    PK pk3 = PK.f27540a;
                    int i6 = BK.f24648a;
                    C3099dH C9 = C3099dH.C(B10, PK.f27541b);
                    C3504ku c3504ku = new C3504ku(21);
                    c3504ku.h(C9.A());
                    c3504ku.l(C9.B().A());
                    c3504ku.f32447w = RG.b(c4174xG.f35751c);
                    return c3504ku.v();
                } catch (C3318hL e11) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e11);
                }
            default:
                S0.e eVar = TG.f28495a;
                C3261gI c3261gI4 = c4174xG.f35750b;
                if (!c3261gI4.A().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI4.A())));
                }
                try {
                    JK B11 = c3261gI4.B();
                    PK pk4 = PK.f27540a;
                    int i9 = BK.f24648a;
                    C2939aI D8 = C2939aI.D(B11, PK.f27541b);
                    if (D8.C() != 0) {
                        int C10 = D8.C();
                        throw new GeneralSecurityException(D.x.k(C10, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(C10).length() + 47)));
                    }
                    ME me = new ME(2);
                    me.a(D8.B());
                    me.d(D8.A().B());
                    me.f27063d = (KG) TG.f28495a.L(D8.A().A());
                    me.f27064e = TG.b(c4174xG.f35751c);
                    return me.j();
                } catch (C3318hL e12) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e12);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.SF
    public WC d(C4120wG c4120wG) {
        C3579mE c3579mE;
        switch (this.f34725n) {
            case 3:
                C3527lG c3527lG = CF.f24843a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    JK jk = c4120wG.f35589c;
                    PK pk = PK.f27540a;
                    int i = BK.f24648a;
                    QI D8 = QI.D(jk, PK.f27541b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (D8.C().f() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    C3956tE c3956tE = c4120wG.f35591e;
                    if (c3956tE == C3956tE.f35016d) {
                        c3579mE = C3579mE.f32697E;
                    } else {
                        if (c3956tE != C3956tE.f35018f) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
                        }
                        c3579mE = C3579mE.f32698F;
                    }
                    return C3150eF.j(C3258gF.b(c3579mE, D8.B().A()), new C3128du(8, C3263gK.a(D8.C().a())), c4120wG.f35592f);
                } catch (C3318hL unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            case 7:
                C3527lG c3527lG2 = EF.f25331a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    JK jk2 = c4120wG.f35589c;
                    PK pk2 = PK.f27540a;
                    int i4 = BK.f24648a;
                    WI C8 = WI.C(jk2, PK.f27541b);
                    if (C8.A() == 0) {
                        return C3312hF.j(EF.b(c4120wG.f35591e), new C3128du(8, C3263gK.a(C8.B().a())), c4120wG.f35592f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3318hL unused2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 18:
                C3527lG c3527lG3 = RG.f27943a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    JK jk3 = c4120wG.f35589c;
                    PK pk3 = PK.f27540a;
                    int i6 = BK.f24648a;
                    C2992bH D9 = C2992bH.D(jk3, PK.f27541b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3504ku c3504ku = new C3504ku(21);
                    c3504ku.h(D9.B().f());
                    c3504ku.l(D9.C().A());
                    c3504ku.f32447w = RG.b(c4120wG.f35591e);
                    GG v9 = c3504ku.v();
                    C4297ze c4297ze = new C4297ze(21, false);
                    c4297ze.f36133u = v9;
                    c4297ze.f36134v = new C3128du(8, C3263gK.a(D9.B().a()));
                    c4297ze.f36135w = c4120wG.f35592f;
                    return c4297ze.u();
                } catch (C3318hL | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                S0.e eVar = TG.f28495a;
                if (!c4120wG.f35587a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    JK jk4 = c4120wG.f35589c;
                    PK pk4 = PK.f27540a;
                    int i9 = BK.f24648a;
                    YH D10 = YH.D(jk4, PK.f27541b);
                    if (D10.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ME me = new ME(2);
                    me.a(D10.C().f());
                    me.d(D10.B().B());
                    me.f27063d = (KG) TG.f28495a.L(D10.B().A());
                    me.f27064e = TG.b(c4120wG.f35591e);
                    LG j6 = me.j();
                    C4297ze c4297ze2 = new C4297ze(22, false);
                    c4297ze2.f36133u = j6;
                    c4297ze2.f36134v = new C3128du(8, C3263gK.a(D10.C().a()));
                    c4297ze2.f36135w = c4120wG.f35592f;
                    return c4297ze2.v();
                } catch (C3318hL | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3850rG, com.google.android.gms.internal.ads.UF
    public Object b(WC wc) {
        KeyFactory keyFactory;
        KeyFactory keyFactory2;
        switch (this.f34725n) {
            case 11:
                EG eg = (EG) wc;
                C3797qG c3797qG = FG.f25534a;
                if (eg.f25335b.f25751a == 32) {
                    if (WC.c(1)) {
                        Provider h3 = AbstractC3066cl.h();
                        if (h3 != null) {
                            try {
                                return SG.a(eg, h3);
                            } catch (GeneralSecurityException unused) {
                            }
                        }
                        return new SG();
                    }
                    throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 12:
                EG eg2 = (EG) wc;
                C3797qG c3797qG2 = FG.f25534a;
                if (eg2.f25335b.f25751a == 32) {
                    return new C2995bK(eg2);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 13:
                SG sg = new SG();
                if (WC.c(2)) {
                    return sg;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 14:
                return new C2995bK((IG) wc);
            case 15:
                ZF zf = (ZF) wc;
                C4120wG c4120wG = zf.f29641b;
                if (!c4120wG.f35590d.equals(C3902sE.f34678d)) {
                    c4120wG.f35590d.getClass();
                }
                C3956tE c3956tE = c4120wG.f35591e;
                C2944aN.q(c3956tE);
                C2944aN.c(c3956tE, zf.f29641b.f35592f).b();
                return new UG();
            case 25:
                C2940aJ c2940aJ = (C2940aJ) wc;
                Provider h9 = AbstractC3066cl.h();
                ZJ zj = (ZJ) CJ.i.H(c2940aJ.f29817b.f30224b.f29648c);
                S0.e eVar = CJ.f24853j;
                C3047cJ c3047cJ = c2940aJ.f29817b;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) c2940aJ.f29818c.f32643u, QC.i((SJ) CJ.f24854k.H(c3047cJ.f30224b.f29647b)));
                if (h9 != null) {
                    keyFactory = KeyFactory.getInstance("EC", h9);
                } else {
                    keyFactory = (KeyFactory) WJ.f29143g.f29144a.b("EC");
                }
                c3047cJ.f30226d.b();
                EJ ej = new EJ();
                if (WC.c(2)) {
                    AbstractC3364iD.i(zj);
                    zj.toString().concat("withECDSA");
                    return ej;
                }
                throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            case 26:
                C3047cJ c3047cJ2 = (C3047cJ) wc;
                byte[] bArr = CJ.f24851g;
                Provider h10 = AbstractC3066cl.h();
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(c3047cJ2.f30225c, QC.i((SJ) CJ.f24854k.H(c3047cJ2.f30224b.f29647b)));
                if (h10 != null) {
                    keyFactory2 = KeyFactory.getInstance("EC", h10);
                } else {
                    keyFactory2 = (KeyFactory) WJ.f29143g.f29144a.b("EC");
                }
                ECPublicKey eCPublicKey = (ECPublicKey) keyFactory2.generatePublic(eCPublicKeySpec);
                ZI zi = c3047cJ2.f30224b;
                return new CJ(eCPublicKey, (ZJ) CJ.i.H(zi.f29648c), (TJ) CJ.f24853j.H(zi.f29646a), c3047cJ2.f30226d.b(), zi.f29649d.equals(C3956tE.f35035x) ? CJ.f24852h : CJ.f24851g, h10);
            case 27:
                C3208fJ c3208fJ = (C3208fJ) wc;
                if (WC.c(1)) {
                    try {
                        return EJ.a(c3208fJ);
                    } catch (GeneralSecurityException unused2) {
                        byte[] b9 = ((C3263gK) c3208fJ.f31029c.f30647u).b();
                        c3208fJ.f31028b.f31524d.b();
                        EJ ej2 = new EJ();
                        if (WC.c(1)) {
                            if (b9.length == 32) {
                                MA.l(MA.v(b9));
                                return ej2;
                            }
                            throw new IllegalArgumentException("Given private key's length is not 32");
                        }
                        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 28:
                C3316hJ c3316hJ = (C3316hJ) wc;
                if (WC.c(1)) {
                    try {
                        return FJ.b(c3316hJ);
                    } catch (GeneralSecurityException unused3) {
                        return new GJ(c3316hJ.f31523c.b(), c3316hJ.f31524d.b(), c3316hJ.f31522b.f30699a.equals(FE.f25524L) ? new byte[]{0} : new byte[0]);
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            default:
                C4120wG c4120wG2 = ((ZF) wc).f29641b;
                C3902sE c3902sE = c4120wG2.f35590d;
                C2944aN.c(c4120wG2.f35591e, c4120wG2.f35592f).b();
                return new EJ();
        }
    }
}
