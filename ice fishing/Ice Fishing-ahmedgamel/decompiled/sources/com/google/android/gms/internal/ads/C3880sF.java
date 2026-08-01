package com.google.android.gms.internal.ads;

import O2.C0361k;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/* renamed from: com.google.android.gms.internal.ads.sF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3880sF implements InterfaceC3558mG, InterfaceC3450kG, UF, SF, InterfaceC3827rG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33957n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33951u = new C3880sF(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33952v = new C3880sF(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33953w = new C3880sF(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33954x = new C3880sF(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33955y = new C3880sF(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33956z = new C3880sF(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33929A = new C3880sF(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33930B = new C3880sF(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33931C = new C3880sF(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33932D = new C3880sF(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33933E = new C3880sF(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33934F = new C3880sF(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33935G = new C3880sF(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33936H = new C3880sF(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33937I = new C3880sF(14);
    public static final /* synthetic */ C3880sF J = new C3880sF(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33938K = new C3880sF(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33939L = new C3880sF(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33940M = new C3880sF(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33941N = new C3880sF(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33942O = new C3880sF(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33943P = new C3880sF(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33944Q = new C3880sF(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33945R = new C3880sF(23);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33946S = new C3880sF(25);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33947T = new C3880sF(26);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33948U = new C3880sF(27);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33949V = new C3880sF(28);

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ C3880sF f33950W = new C3880sF(29);

    public /* synthetic */ C3880sF(int i) {
        this.f33957n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3558mG
    public C4151xG a(AbstractC3825rE abstractC3825rE) {
        switch (this.f33957n) {
            case 0:
                C3504lG c3504lG = AbstractC3934tF.f34253a;
                return C4151xG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", AbstractC3934tF.a(((TE) abstractC3825rE).f27709a), HH.B().a());
            case 4:
                C3235gF c3235gF = (C3235gF) abstractC3825rE;
                C3504lG c3504lG2 = CF.f24080a;
                C3933tE a9 = CF.a(c3235gF.f30549a);
                RI D8 = SI.D();
                TI B9 = UI.B();
                B9.h();
                ((UI) B9.f27721u).D(c3235gF.f30550b);
                UI ui = (UI) B9.j();
                D8.h();
                ((SI) D8.f27721u).E(ui);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", a9, ((SI) D8.j()).a());
            case 8:
                C3504lG c3504lG3 = EF.f24570a;
                return C4151xG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", EF.a(((C3395jF) abstractC3825rE).f31221a), XI.C().a());
            case 19:
                GG gg = (GG) abstractC3825rE;
                C3504lG c3504lG4 = RG.f27187a;
                C3933tE a10 = RG.a(gg.f24963c);
                C3022cH D9 = C3076dH.D();
                C3129eH B10 = C3183fH.B();
                B10.h();
                ((C3183fH) B10.f27721u).D(gg.f24962b);
                C3183fH c3183fH = (C3183fH) B10.j();
                D9.h();
                ((C3076dH) D9.f27721u).F(c3183fH);
                D9.h();
                ((C3076dH) D9.f27721u).E(gg.f24961a);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.AesCmacKey", a10, ((C3076dH) D9.j()).a());
            default:
                LG lg = (LG) abstractC3825rE;
                C0361k c0361k = TG.f27712a;
                C3933tE a11 = TG.a(lg.f26089c);
                ZH E8 = C2916aI.E();
                C2970bI C8 = C3023cI.C();
                C8.h();
                ((C3023cI) C8.f27721u).F(lg.f26088b);
                WH wh = (WH) TG.f27712a.b(lg.f26090d);
                C8.h();
                ((C3023cI) C8.f27721u).E(wh);
                C3023cI c3023cI = (C3023cI) C8.j();
                E8.h();
                ((C2916aI) E8.f27721u).G(c3023cI);
                E8.h();
                ((C2916aI) E8.f27721u).H(lg.f26087a);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.HmacKey", a11, ((C2916aI) E8.j()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.UF
    public C4097wG b(WC wc) {
        switch (this.f33957n) {
            case 2:
                C3127eF c3127eF = (C3127eF) wc;
                C3504lG c3504lG = CF.f24080a;
                PI E8 = QI.E();
                byte[] b9 = ((C3240gK) c3127eF.f29902c.f29859u).b();
                HK s9 = JK.s(b9, 0, b9.length);
                E8.h();
                ((QI) E8.f27721u).G(s9);
                TI B9 = UI.B();
                C3235gF c3235gF = c3127eF.f29901b;
                B9.h();
                ((UI) B9.f27721u).D(c3235gF.f30550b);
                UI ui = (UI) B9.j();
                E8.h();
                ((QI) E8.f27721u).F(ui);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((QI) E8.j()).a(), C3879sE.f33910d, CF.a(c3235gF.f30549a), c3127eF.f29904e);
            case 6:
                C3289hF c3289hF = (C3289hF) wc;
                C3504lG c3504lG2 = EF.f24570a;
                VI D8 = WI.D();
                byte[] b10 = ((C3240gK) c3289hF.f30751c.f29859u).b();
                HK s10 = JK.s(b10, 0, b10.length);
                D8.h();
                ((WI) D8.f27721u).F(s10);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((WI) D8.j()).a(), C3879sE.f33910d, EF.a(c3289hF.f30750b.f31221a), c3289hF.f30753e);
            case 10:
                C4097wG c4097wG = ((ZF) wc).f28861b;
                C3879sE c3879sE = c4097wG.f34821d;
                return c4097wG;
            case 17:
                EG eg = (EG) wc;
                C3504lG c3504lG3 = RG.f27187a;
                C2915aH E9 = C2969bH.E();
                GG gg = eg.f24574b;
                C3129eH B10 = C3183fH.B();
                int i = gg.f24962b;
                B10.h();
                ((C3183fH) B10.f27721u).D(i);
                C3183fH c3183fH = (C3183fH) B10.j();
                E9.h();
                ((C2969bH) E9.f27721u).H(c3183fH);
                byte[] b11 = ((C3240gK) eg.f24575c.f29859u).b();
                HK s11 = JK.s(b11, 0, b11.length);
                E9.h();
                ((C2969bH) E9.f27721u).G(s11);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C2969bH) E9.j()).a(), C3879sE.f33910d, RG.a(eg.f24574b.f24963c), eg.f24577e);
            default:
                IG ig = (IG) wc;
                C0361k c0361k = TG.f27712a;
                XH E10 = YH.E();
                LG lg = ig.f25476b;
                C2970bI C8 = C3023cI.C();
                int i6 = lg.f26088b;
                C8.h();
                ((C3023cI) C8.f27721u).F(i6);
                WH wh = (WH) TG.f27712a.b(lg.f26090d);
                C8.h();
                ((C3023cI) C8.f27721u).E(wh);
                C3023cI c3023cI = (C3023cI) C8.j();
                E10.h();
                ((YH) E10.f27721u).H(c3023cI);
                byte[] b12 = ((C3240gK) ig.f25477c.f29859u).b();
                HK s12 = JK.s(b12, 0, b12.length);
                E10.h();
                ((YH) E10.f27721u).I(s12);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.HmacKey", ((YH) E10.j()).a(), C3879sE.f33910d, TG.a(ig.f25476b.f26089c), ig.f25479e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3450kG
    public AbstractC3825rE c(C4151xG c4151xG) {
        C3556mE c3556mE;
        switch (this.f33957n) {
            case 1:
                C3504lG c3504lG = CF.f24080a;
                C3238gI c3238gI = c4151xG.f34969b;
                if (!c3238gI.A().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI.A())));
                }
                try {
                    JK B9 = c3238gI.B();
                    PK pk = PK.f26757a;
                    int i = BK.f23877a;
                    SI C8 = SI.C(B9, PK.f26758b);
                    if (C8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    C3933tE c3933tE = c4151xG.f34970c;
                    if (c3933tE == C3933tE.f34230d) {
                        c3556mE = C3556mE.f31917E;
                    } else {
                        if (c3933tE != C3933tE.f34232f) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
                        }
                        c3556mE = C3556mE.f31918F;
                    }
                    return C3235gF.b(c3556mE, C8.B().A());
                } catch (C3295hL e9) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e9);
                }
            case 5:
                C3504lG c3504lG2 = EF.f24570a;
                C3238gI c3238gI2 = c4151xG.f34969b;
                if (!c3238gI2.A().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI2.A())));
                }
                try {
                    JK B10 = c3238gI2.B();
                    PK pk2 = PK.f26757a;
                    int i6 = BK.f23877a;
                    if (XI.B(B10, PK.f26758b).A() == 0) {
                        return new C3395jF(EF.b(c4151xG.f34970c));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (C3295hL e10) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
                }
            case 16:
                C3504lG c3504lG3 = RG.f27187a;
                C3238gI c3238gI3 = c4151xG.f34969b;
                if (!c3238gI3.A().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI3.A())));
                }
                try {
                    JK B11 = c3238gI3.B();
                    PK pk3 = PK.f26757a;
                    int i9 = BK.f23877a;
                    C3076dH C9 = C3076dH.C(B11, PK.f26758b);
                    C3481ku c3481ku = new C3481ku(21);
                    c3481ku.h(C9.A());
                    c3481ku.l(C9.B().A());
                    c3481ku.f31665w = RG.b(c4151xG.f34970c);
                    return c3481ku.w();
                } catch (C3295hL e11) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e11);
                }
            default:
                C0361k c0361k = TG.f27712a;
                C3238gI c3238gI4 = c4151xG.f34969b;
                if (!c3238gI4.A().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI4.A())));
                }
                try {
                    JK B12 = c3238gI4.B();
                    PK pk4 = PK.f26757a;
                    int i10 = BK.f23877a;
                    C2916aI D8 = C2916aI.D(B12, PK.f26758b);
                    if (D8.C() != 0) {
                        int C10 = D8.C();
                        throw new GeneralSecurityException(D.y.m(C10, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(C10).length() + 47)));
                    }
                    ME me = new ME(2);
                    me.a(D8.B());
                    me.d(D8.A().B());
                    me.f26272d = (KG) TG.f27712a.c(D8.A().A());
                    me.f26273e = TG.b(c4151xG.f34970c);
                    return me.j();
                } catch (C3295hL e12) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e12);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.SF
    public WC d(C4097wG c4097wG) {
        C3556mE c3556mE;
        switch (this.f33957n) {
            case 3:
                C3504lG c3504lG = CF.f24080a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    JK jk = c4097wG.f34820c;
                    PK pk = PK.f26757a;
                    int i = BK.f23877a;
                    QI D8 = QI.D(jk, PK.f26758b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (D8.C().f() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    C3933tE c3933tE = c4097wG.f34822e;
                    if (c3933tE == C3933tE.f34230d) {
                        c3556mE = C3556mE.f31917E;
                    } else {
                        if (c3933tE != C3933tE.f34232f) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
                        }
                        c3556mE = C3556mE.f31918F;
                    }
                    return C3127eF.j(C3235gF.b(c3556mE, D8.B().A()), new C3105du(8, C3240gK.a(D8.C().a())), c4097wG.f34823f);
                } catch (C3295hL unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            case 7:
                C3504lG c3504lG2 = EF.f24570a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    JK jk2 = c4097wG.f34820c;
                    PK pk2 = PK.f26757a;
                    int i6 = BK.f23877a;
                    WI C8 = WI.C(jk2, PK.f26758b);
                    if (C8.A() == 0) {
                        return C3289hF.j(EF.b(c4097wG.f34822e), new C3105du(8, C3240gK.a(C8.B().a())), c4097wG.f34823f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3295hL unused2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 18:
                C3504lG c3504lG3 = RG.f27187a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    JK jk3 = c4097wG.f34820c;
                    PK pk3 = PK.f26757a;
                    int i9 = BK.f23877a;
                    C2969bH D9 = C2969bH.D(jk3, PK.f26758b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C3481ku c3481ku = new C3481ku(21);
                    c3481ku.h(D9.B().f());
                    c3481ku.l(D9.C().A());
                    c3481ku.f31665w = RG.b(c4097wG.f34822e);
                    GG w6 = c3481ku.w();
                    C4274ze c4274ze = new C4274ze(21, false);
                    c4274ze.f35360u = w6;
                    c4274ze.f35361v = new C3105du(8, C3240gK.a(D9.B().a()));
                    c4274ze.f35362w = c4097wG.f34823f;
                    return c4274ze.u();
                } catch (C3295hL | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                C0361k c0361k = TG.f27712a;
                if (!c4097wG.f34818a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    JK jk4 = c4097wG.f34820c;
                    PK pk4 = PK.f26757a;
                    int i10 = BK.f23877a;
                    YH D10 = YH.D(jk4, PK.f26758b);
                    if (D10.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ME me = new ME(2);
                    me.a(D10.C().f());
                    me.d(D10.B().B());
                    me.f26272d = (KG) TG.f27712a.c(D10.B().A());
                    me.f26273e = TG.b(c4097wG.f34822e);
                    LG j6 = me.j();
                    C4274ze c4274ze2 = new C4274ze(22, false);
                    c4274ze2.f35360u = j6;
                    c4274ze2.f35361v = new C3105du(8, C3240gK.a(D10.C().a()));
                    c4274ze2.f35362w = c4097wG.f34823f;
                    return c4274ze2.v();
                } catch (C3295hL | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3827rG, com.google.android.gms.internal.ads.UF
    public Object b(WC wc) {
        KeyFactory keyFactory;
        KeyFactory keyFactory2;
        switch (this.f33957n) {
            case 11:
                EG eg = (EG) wc;
                C3774qG c3774qG = FG.f24778a;
                if (eg.f24574b.f24961a == 32) {
                    if (WC.c(1)) {
                        Provider h9 = AbstractC3043cl.h();
                        if (h9 != null) {
                            try {
                                return SG.a(eg, h9);
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
                C3774qG c3774qG2 = FG.f24778a;
                if (eg2.f24574b.f24961a == 32) {
                    return new C2972bK(eg2);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 13:
                SG sg = new SG();
                if (WC.c(2)) {
                    return sg;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 14:
                return new C2972bK((IG) wc);
            case 15:
                ZF zf = (ZF) wc;
                C4097wG c4097wG = zf.f28861b;
                if (!c4097wG.f34821d.equals(C3879sE.f33910d)) {
                    c4097wG.f34821d.getClass();
                }
                C3933tE c3933tE = c4097wG.f34822e;
                C2921aN.q(c3933tE);
                C2921aN.c(c3933tE, zf.f28861b.f34823f).b();
                return new UG();
            case 25:
                C2917aJ c2917aJ = (C2917aJ) wc;
                Provider h10 = AbstractC3043cl.h();
                ZJ zj = (ZJ) CJ.i.b(c2917aJ.f29047b.f29441b.f28868c);
                C0361k c0361k = CJ.f24090j;
                C3024cJ c3024cJ = c2917aJ.f29047b;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) c2917aJ.f29048c.f31863u, QC.i((SJ) CJ.f24091k.b(c3024cJ.f29441b.f28867b)));
                if (h10 != null) {
                    keyFactory = KeyFactory.getInstance("EC", h10);
                } else {
                    keyFactory = (KeyFactory) WJ.f28345g.f28346a.b("EC");
                }
                c3024cJ.f29443d.b();
                EJ ej = new EJ();
                if (WC.c(2)) {
                    AbstractC3341iD.i(zj);
                    zj.toString().concat("withECDSA");
                    return ej;
                }
                throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            case 26:
                C3024cJ c3024cJ2 = (C3024cJ) wc;
                byte[] bArr = CJ.f24088g;
                Provider h11 = AbstractC3043cl.h();
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(c3024cJ2.f29442c, QC.i((SJ) CJ.f24091k.b(c3024cJ2.f29441b.f28867b)));
                if (h11 != null) {
                    keyFactory2 = KeyFactory.getInstance("EC", h11);
                } else {
                    keyFactory2 = (KeyFactory) WJ.f28345g.f28346a.b("EC");
                }
                ECPublicKey eCPublicKey = (ECPublicKey) keyFactory2.generatePublic(eCPublicKeySpec);
                ZI zi = c3024cJ2.f29441b;
                return new CJ(eCPublicKey, (ZJ) CJ.i.b(zi.f28868c), (TJ) CJ.f24090j.b(zi.f28866a), c3024cJ2.f29443d.b(), zi.f28869d.equals(C3933tE.f34249x) ? CJ.f24089h : CJ.f24088g, h11);
            case 27:
                C3185fJ c3185fJ = (C3185fJ) wc;
                if (WC.c(1)) {
                    try {
                        return EJ.a(c3185fJ);
                    } catch (GeneralSecurityException unused2) {
                        byte[] b9 = ((C3240gK) c3185fJ.f30242c.f29859u).b();
                        c3185fJ.f30241b.f30758d.b();
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
                C3293hJ c3293hJ = (C3293hJ) wc;
                if (WC.c(1)) {
                    try {
                        return FJ.b(c3293hJ);
                    } catch (GeneralSecurityException unused3) {
                        return new GJ(c3293hJ.f30757c.b(), c3293hJ.f30758d.b(), c3293hJ.f30756b.f29907a.equals(FE.f24768L) ? new byte[]{0} : new byte[0]);
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            default:
                C4097wG c4097wG2 = ((ZF) wc).f28861b;
                C3879sE c3879sE = c4097wG2.f34821d;
                C2921aN.c(c4097wG2.f34822e, c4097wG2.f34823f).b();
                return new EJ();
        }
    }
}
