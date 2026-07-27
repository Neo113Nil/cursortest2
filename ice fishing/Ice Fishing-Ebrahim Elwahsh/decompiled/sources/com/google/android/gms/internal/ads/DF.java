package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final /* synthetic */ class DF implements InterfaceC3679oG, YF, WF, InterfaceC3787qG, InterfaceC4056vG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24410n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ DF f24404u = new DF(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ DF f24405v = new DF(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ DF f24406w = new DF(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ DF f24407x = new DF(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ DF f24408y = new DF(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ DF f24409z = new DF(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ DF f24382A = new DF(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ DF f24383B = new DF(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ DF f24384C = new DF(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ DF f24385D = new DF(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ DF f24386E = new DF(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ DF f24387F = new DF(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ DF f24388G = new DF(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ DF f24389H = new DF(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ DF f24390I = new DF(14);
    public static final /* synthetic */ DF J = new DF(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ DF f24391K = new DF(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ DF f24392L = new DF(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ DF f24393M = new DF(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ DF f24394N = new DF(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ DF f24395O = new DF(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ DF f24396P = new DF(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ DF f24397Q = new DF(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ DF f24398R = new DF(24);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ DF f24399S = new DF(25);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ DF f24400T = new DF(26);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ DF f24401U = new DF(27);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ DF f24402V = new DF(28);

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ DF f24403W = new DF(29);

    public /* synthetic */ DF(int i) {
        this.f24410n = i;
    }

    @Override // com.google.android.gms.internal.ads.WF
    public XC a(BG bg) {
        switch (this.f24410n) {
            case 2:
                C3733pG c3733pG = EF.f24680a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    SK sk = bg.f24014c;
                    YK yk = YK.f28820a;
                    int i = KK.f25952a;
                    XI D8 = XI.D(sk, YK.f28821b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (D8.C().f() == 32) {
                        return C3302hF.k(C3408jF.b(EF.b(bg.f24016e), D8.B().A()), new Mu(7, C3791qK.a(D8.C().a())), bg.f24017f);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (C3845rL unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            case 6:
                C3733pG c3733pG2 = GF.f25129a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    SK sk2 = bg.f24014c;
                    YK yk2 = YK.f28820a;
                    int i4 = KK.f25952a;
                    C3088dJ C7 = C3088dJ.C(sk2, YK.f28821b);
                    if (C7.A() == 0) {
                        return C3462kF.k(GF.b(bg.f24016e), new Mu(7, C3791qK.a(C7.B().a())), bg.f24017f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3845rL unused2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 17:
                C3733pG c3733pG3 = XG.f28626a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    SK sk3 = bg.f24014c;
                    YK yk3 = YK.f28820a;
                    int i9 = KK.f25952a;
                    C3304hH D9 = C3304hH.D(sk3, YK.f28821b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3602mu c3602mu = new C3602mu(21);
                    c3602mu.f(D9.B().f());
                    c3602mu.r(D9.C().A());
                    c3602mu.f32776w = XG.b(bg.f24016e);
                    LG x3 = c3602mu.x();
                    C4017ue c4017ue = new C4017ue(21, false);
                    c4017ue.f34630u = x3;
                    c4017ue.f34631v = new Mu(7, C3791qK.a(D9.B().a()));
                    c4017ue.f34632w = bg.f24017f;
                    return c4017ue.w();
                } catch (C3845rL | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                C4237yi c4237yi = AbstractC2922aH.f29192a;
                if (!bg.f24012a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    SK sk4 = bg.f24014c;
                    YK yk4 = YK.f28820a;
                    int i10 = KK.f25952a;
                    C3141eI D10 = C3141eI.D(sk4, YK.f28821b);
                    if (D10.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    PE pe = new PE(2);
                    pe.a(D10.C().f());
                    pe.d(D10.B().B());
                    pe.f26884d = (PG) AbstractC2922aH.f29193b.b(D10.B().A());
                    pe.f26885e = (QG) AbstractC2922aH.f29192a.b(bg.f24016e);
                    RG j9 = pe.j();
                    C4017ue c4017ue2 = new C4017ue(22, false);
                    c4017ue2.f34630u = j9;
                    c4017ue2.f34631v = new Mu(7, C3791qK.a(D10.C().a()));
                    c4017ue2.f34632w = bg.f24017f;
                    return c4017ue2.y();
                } catch (C3845rL | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3679oG
    public AbstractC4000uE b(CG cg) {
        switch (this.f24410n) {
            case 0:
                C3733pG c3733pG = EF.f24680a;
                C3573mI c3573mI = cg.f24159b;
                if (!c3573mI.A().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI.A())));
                }
                try {
                    SK B8 = c3573mI.B();
                    YK yk = YK.f28820a;
                    int i = KK.f25952a;
                    ZI C7 = ZI.C(B8, YK.f28821b);
                    if (C7.A() == 0) {
                        return C3408jF.b(EF.b(c3573mI.C()), C7.B().A());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (C3845rL e6) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e6);
                }
            case 4:
                C3733pG c3733pG2 = GF.f25129a;
                C3573mI c3573mI2 = cg.f24159b;
                if (!c3573mI2.A().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI2.A())));
                }
                try {
                    SK B9 = c3573mI2.B();
                    YK yk2 = YK.f28820a;
                    int i4 = KK.f25952a;
                    if (C3142eJ.B(B9, YK.f28821b).A() == 0) {
                        return new C3570mF(GF.b(c3573mI2.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (C3845rL e9) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e9);
                }
            case 15:
                C3733pG c3733pG3 = XG.f28626a;
                C3573mI c3573mI3 = cg.f24159b;
                if (!c3573mI3.A().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI3.A())));
                }
                try {
                    SK B10 = c3573mI3.B();
                    YK yk3 = YK.f28820a;
                    int i9 = KK.f25952a;
                    C3410jH C8 = C3410jH.C(B10, YK.f28821b);
                    C3602mu c3602mu = new C3602mu(21);
                    c3602mu.f(C8.A());
                    c3602mu.r(C8.B().A());
                    c3602mu.f32776w = XG.b(c3573mI3.C());
                    return c3602mu.x();
                } catch (C3845rL e10) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
                }
            default:
                C4237yi c4237yi = AbstractC2922aH.f29192a;
                C3573mI c3573mI4 = cg.f24159b;
                if (!c3573mI4.A().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI4.A())));
                }
                try {
                    SK B11 = c3573mI4.B();
                    YK yk4 = YK.f28820a;
                    int i10 = KK.f25952a;
                    C3251gI D8 = C3251gI.D(B11, YK.f28821b);
                    if (D8.C() != 0) {
                        int C9 = D8.C();
                        throw new GeneralSecurityException(D.y.j(C9, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(C9).length() + 47)));
                    }
                    PE pe = new PE(2);
                    pe.a(D8.B());
                    pe.d(D8.A().B());
                    pe.f26884d = (PG) AbstractC2922aH.f29193b.b(D8.A().A());
                    pe.f26885e = (QG) AbstractC2922aH.f29192a.b(c3573mI4.C());
                    return pe.j();
                } catch (C3845rL e11) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.YF, com.google.android.gms.internal.ads.InterfaceC4056vG
    public BG c(XC xc) {
        switch (this.f24410n) {
            case 1:
                C3302hF c3302hF = (C3302hF) xc;
                C3733pG c3733pG = EF.f24680a;
                WI E8 = XI.E();
                byte[] b9 = ((C3791qK) c3302hF.f31219c.f26395u).b();
                QK s3 = SK.s(b9, 0, b9.length);
                E8.h();
                ((XI) E8.f30000u).G(s3);
                C2924aJ B8 = C2979bJ.B();
                C3408jF c3408jF = c3302hF.f31218b;
                B8.h();
                ((C2979bJ) B8.f30000u).D(c3408jF.f32095b);
                C2979bJ c2979bJ = (C2979bJ) B8.j();
                E8.h();
                ((XI) E8.f30000u).F(c2979bJ);
                return BG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((XI) E8.j()).a(), 2, EF.a(c3408jF.f32094a), c3302hF.f31221e);
            case 5:
                C3462kF c3462kF = (C3462kF) xc;
                C3733pG c3733pG2 = GF.f25129a;
                C3033cJ D8 = C3088dJ.D();
                byte[] b10 = ((C3791qK) c3462kF.f32282c.f26395u).b();
                QK s6 = SK.s(b10, 0, b10.length);
                D8.h();
                ((C3088dJ) D8.f30000u).F(s6);
                return BG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((C3088dJ) D8.j()).a(), 2, GF.a(c3462kF.f32281b.f32675a), c3462kF.f32284e);
            case 9:
                BG bg = ((C3085dG) xc).f29994b;
                int i = AbstractC2976bG.f29468b[AbstractC5088e.d(bg.f24015d)];
                return bg;
            case 16:
                JG jg = (JG) xc;
                C3733pG c3733pG3 = XG.f28626a;
                C3250gH E9 = C3304hH.E();
                LG lg = jg.f25755b;
                C3464kH B9 = C3518lH.B();
                int i4 = lg.f26133b;
                B9.h();
                ((C3518lH) B9.f30000u).D(i4);
                C3518lH c3518lH = (C3518lH) B9.j();
                E9.h();
                ((C3304hH) E9.f30000u).H(c3518lH);
                byte[] b11 = ((C3791qK) jg.f25756c.f26395u).b();
                QK s9 = SK.s(b11, 0, b11.length);
                E9.h();
                ((C3304hH) E9.f30000u).G(s9);
                return BG.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C3304hH) E9.j()).a(), 2, XG.a(jg.f25755b.f26134c), jg.f25758e);
            default:
                NG ng = (NG) xc;
                C4237yi c4237yi = AbstractC2922aH.f29192a;
                C3087dI E10 = C3141eI.E();
                RG rg = ng.f26506b;
                C3305hI C7 = C3359iI.C();
                int i9 = rg.f27328b;
                C7.h();
                ((C3359iI) C7.f30000u).F(i9);
                EnumC3032cI enumC3032cI = (EnumC3032cI) AbstractC2922aH.f29193b.a(rg.f27330d);
                C7.h();
                ((C3359iI) C7.f30000u).E(enumC3032cI);
                C3359iI c3359iI = (C3359iI) C7.j();
                E10.h();
                ((C3141eI) E10.f30000u).H(c3359iI);
                byte[] b12 = ((C3791qK) ng.f26507c.f26395u).b();
                QK s10 = SK.s(b12, 0, b12.length);
                E10.h();
                ((C3141eI) E10.f30000u).I(s10);
                return BG.a("type.googleapis.com/google.crypto.tink.HmacKey", ((C3141eI) E10.j()).a(), 2, (EI) AbstractC2922aH.f29192a.a(ng.f26506b.f27329c), ng.f26509e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3787qG
    public CG e(AbstractC4000uE abstractC4000uE) {
        switch (this.f24410n) {
            case 3:
                C3408jF c3408jF = (C3408jF) abstractC4000uE;
                C3733pG c3733pG = EF.f24680a;
                C3519lI E8 = C3573mI.E();
                E8.m("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                YI D8 = ZI.D();
                C2924aJ B8 = C2979bJ.B();
                int i = c3408jF.f32095b;
                B8.h();
                ((C2979bJ) B8.f30000u).D(i);
                C2979bJ c2979bJ = (C2979bJ) B8.j();
                D8.h();
                ((ZI) D8.f30000u).E(c2979bJ);
                E8.n(((ZI) D8.j()).a());
                E8.o(EF.a(c3408jF.f32094a));
                return CG.a((C3573mI) E8.j());
            case 7:
                C3733pG c3733pG2 = GF.f25129a;
                C3519lI E9 = C3573mI.E();
                E9.m("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                E9.n(C3142eJ.C().a());
                E9.o(GF.a(((C3570mF) abstractC4000uE).f32675a));
                return CG.a((C3573mI) E9.j());
            case 18:
                LG lg = (LG) abstractC4000uE;
                C3733pG c3733pG3 = XG.f28626a;
                C3519lI E10 = C3573mI.E();
                E10.m("type.googleapis.com/google.crypto.tink.AesCmacKey");
                C3358iH D9 = C3410jH.D();
                C3464kH B9 = C3518lH.B();
                int i4 = lg.f26133b;
                B9.h();
                ((C3518lH) B9.f30000u).D(i4);
                C3518lH c3518lH = (C3518lH) B9.j();
                D9.h();
                ((C3410jH) D9.f30000u).F(c3518lH);
                D9.h();
                ((C3410jH) D9.f30000u).E(lg.f26132a);
                E10.n(((C3410jH) D9.j()).a());
                E10.o(XG.a(lg.f26134c));
                return CG.a((C3573mI) E10.j());
            default:
                RG rg = (RG) abstractC4000uE;
                C4237yi c4237yi = AbstractC2922aH.f29192a;
                C3519lI E11 = C3573mI.E();
                E11.m("type.googleapis.com/google.crypto.tink.HmacKey");
                C3196fI E12 = C3251gI.E();
                C3305hI C7 = C3359iI.C();
                int i9 = rg.f27328b;
                C7.h();
                ((C3359iI) C7.f30000u).F(i9);
                EnumC3032cI enumC3032cI = (EnumC3032cI) AbstractC2922aH.f29193b.a(rg.f27330d);
                C7.h();
                ((C3359iI) C7.f30000u).E(enumC3032cI);
                C3359iI c3359iI = (C3359iI) C7.j();
                E12.h();
                ((C3251gI) E12.f30000u).G(c3359iI);
                E12.h();
                ((C3251gI) E12.f30000u).H(rg.f27327a);
                E11.n(((C3251gI) E12.j()).a());
                E11.o((EI) AbstractC2922aH.f29192a.a(rg.f27329c));
                return CG.a((C3573mI) E11.j());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4056vG
    public Object c(XC xc) {
        KeyFactory keyFactory;
        KeyFactory keyFactory2;
        EI ei = EI.LEGACY;
        switch (this.f24410n) {
            case 10:
                JG jg = (JG) xc;
                C4002uG c4002uG = KG.f25949a;
                if (jg.f25755b.f26132a == 32) {
                    if (XC.e(1)) {
                        Provider e6 = AbstractC2720Pd.e();
                        if (e6 != null) {
                            try {
                                return YG.a(jg, e6);
                            } catch (GeneralSecurityException unused) {
                            }
                        }
                        return new YG();
                    }
                    throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 11:
                JG jg2 = (JG) xc;
                C4002uG c4002uG2 = KG.f25949a;
                if (jg2.f25755b.f26132a == 32) {
                    return new C3575mK(jg2);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 12:
                YG yg = new YG();
                if (XC.e(2)) {
                    return yg;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 13:
                return new C3575mK((NG) xc);
            case 14:
                C3085dG c3085dG = (C3085dG) xc;
                BG bg = c3085dG.f29994b;
                int i = AbstractC2976bG.f29468b[AbstractC5088e.d(bg.f24015d)];
                int ordinal = bg.f24016e.ordinal();
                BG bg2 = c3085dG.f29994b;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            AbstractC3571mG.f32676a.b();
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    AbstractC3571mG.a(bg2.f24017f.intValue()).b();
                } else {
                    AbstractC3571mG.b(bg2.f24017f.intValue()).b();
                }
                return new C2977bH();
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                BG bg3 = ((C3085dG) xc).f29994b;
                int i4 = AbstractC2976bG.f29468b[AbstractC5088e.d(bg3.f24015d)];
                return new QJ((InterfaceC4108wE) UF.f27953d.b(InterfaceC4108wE.class, bg3.f24012a).a(bg3.f24014c), QJ.c(bg3), bg3.f24016e.equals(ei) ? new byte[]{0} : new byte[0]);
            case 24:
                C3360iJ c3360iJ = (C3360iJ) xc;
                Provider e9 = AbstractC2720Pd.e();
                EnumC3413jK enumC3413jK = (EnumC3413jK) MJ.i.a(c3360iJ.f31329b.f32098b.f31224c);
                C4237yi c4237yi = MJ.f26321j;
                C3412jJ c3412jJ = c3360iJ.f31329b;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) c3360iJ.f31330c.f26393u, AbstractC3406jD.f((EnumC3034cK) MJ.f26322k.a(c3412jJ.f32098b.f31223b)));
                if (e9 != null) {
                    keyFactory = KeyFactory.getInstance("EC", e9);
                } else {
                    keyFactory = (KeyFactory) C3253gK.f30986g.f30987a.d("EC");
                }
                c3412jJ.f32100d.b();
                OJ oj = new OJ();
                if (XC.e(2)) {
                    AbstractC3137eE.f(enumC3413jK);
                    enumC3413jK.toString().concat("withECDSA");
                    return oj;
                }
                throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            case 25:
                C3412jJ c3412jJ2 = (C3412jJ) xc;
                byte[] bArr = MJ.f26319g;
                Provider e10 = AbstractC2720Pd.e();
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(c3412jJ2.f32099c, AbstractC3406jD.f((EnumC3034cK) MJ.f26322k.a(c3412jJ2.f32098b.f31223b)));
                if (e10 != null) {
                    keyFactory2 = KeyFactory.getInstance("EC", e10);
                } else {
                    keyFactory2 = (KeyFactory) C3253gK.f30986g.f30987a.d("EC");
                }
                ECPublicKey eCPublicKey = (ECPublicKey) keyFactory2.generatePublic(eCPublicKeySpec);
                C3306hJ c3306hJ = c3412jJ2.f32098b;
                return new MJ(eCPublicKey, (EnumC3413jK) MJ.i.a(c3306hJ.f31224c), (EnumC3089dK) MJ.f26321j.a(c3306hJ.f31222a), c3412jJ2.f32100d.b(), c3306hJ.f31225d.equals(LE.f26122F) ? MJ.f26320h : MJ.f26319g, e10);
            case 26:
                C3628nJ c3628nJ = (C3628nJ) xc;
                if (XC.e(1)) {
                    try {
                        return OJ.a(c3628nJ);
                    } catch (GeneralSecurityException unused2) {
                        byte[] b9 = ((C3791qK) c3628nJ.f32848c.f26395u).b();
                        c3628nJ.f32847b.f33378d.b();
                        OJ oj2 = new OJ();
                        if (XC.e(1)) {
                            if (b9.length == 32) {
                                AbstractC2655Lg.m(AbstractC2655Lg.p(b9));
                                return oj2;
                            }
                            throw new IllegalArgumentException("Given private key's length is not 32");
                        }
                        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 27:
                C3736pJ c3736pJ = (C3736pJ) xc;
                if (XC.e(1)) {
                    try {
                        return PJ.b(c3736pJ);
                    } catch (GeneralSecurityException unused3) {
                        return new QJ(c3736pJ.f33377c.b(), c3736pJ.f33378d.b(), c3736pJ.f33376b.f32677a.equals(C3520lJ.f32562d) ? new byte[]{0} : new byte[0]);
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 28:
                BG bg4 = ((C3085dG) xc).f29994b;
                int i9 = AbstractC2976bG.f29468b[AbstractC5088e.d(bg4.f24015d)];
                QJ.c(bg4);
                bg4.f24016e.equals(ei);
                return new OJ();
        }
    }
}
