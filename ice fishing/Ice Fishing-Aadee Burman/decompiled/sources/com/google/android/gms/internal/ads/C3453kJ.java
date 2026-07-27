package com.google.android.gms.internal.ads;

import O2.C0361k;
import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.kJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3453kJ implements InterfaceC3827rG, InterfaceC3450kG, UF, SF, InterfaceC3558mG, YJ {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31416n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31410u = new C3453kJ(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31411v = new C3453kJ(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31412w = new C3453kJ(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31413x = new C3453kJ(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31414y = new C3453kJ(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31415z = new C3453kJ(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31388A = new C3453kJ(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31389B = new C3453kJ(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31390C = new C3453kJ(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31391D = new C3453kJ(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31392E = new C3453kJ(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31393F = new C3453kJ(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31394G = new C3453kJ(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31395H = new C3453kJ(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31396I = new C3453kJ(14);
    public static final /* synthetic */ C3453kJ J = new C3453kJ(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31397K = new C3453kJ(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31398L = new C3453kJ(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31399M = new C3453kJ(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31400N = new C3453kJ(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31401O = new C3453kJ(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31402P = new C3453kJ(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31403Q = new C3453kJ(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31404R = new C3453kJ(23);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31405S = new C3453kJ(24);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31406T = new C3453kJ(25);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31407U = new C3453kJ(26);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31408V = new C3453kJ(27);

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ C3453kJ f31409W = new C3453kJ(28);

    public /* synthetic */ C3453kJ(int i) {
        this.f31416n = i;
    }

    private final WC e(C4097wG c4097wG) {
        boolean z3 = false;
        C3504lG c3504lG = HJ.f25251a;
        String str = c4097wG.f34818a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
        }
        try {
            JK jk = c4097wG.f34820c;
            PK pk = PK.f26757a;
            int i = BK.f23877a;
            EI I8 = EI.I(jk, PK.f26758b);
            if (I8.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            GI B9 = I8.B();
            if (B9.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, B9.C().a());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, B9.D().a());
            BigInteger bigInteger3 = C3669oJ.f32890e;
            C3561mJ c3561mJ = new C3561mJ();
            c3561mJ.f31940c = (C3615nJ) HJ.f25257g.c(B9.B().A());
            c3561mJ.f31939b = bigInteger2;
            c3561mJ.a(bitLength);
            c3561mJ.f31941d = HJ.b(c4097wG.f34822e);
            C3669oJ b9 = c3561mJ.b();
            C4274ze c4274ze = new C4274ze(23, false);
            c4274ze.f35360u = b9;
            c4274ze.f35361v = bigInteger;
            c4274ze.f35362w = c4097wG.f34823f;
            C3777qJ w6 = c4274ze.w();
            C3 c32 = new C3(z3);
            c32.f24020n = w6;
            C3534lt d2 = HJ.d(I8.D());
            C3534lt d9 = HJ.d(I8.E());
            c32.f24022v = d2;
            c32.f24023w = d9;
            c32.f24021u = HJ.d(I8.C());
            C3534lt d10 = HJ.d(I8.F());
            C3534lt d11 = HJ.d(I8.G());
            c32.f24024x = d10;
            c32.f24025y = d11;
            c32.f24026z = HJ.d(I8.H());
            return c32.g();
        } catch (C3295hL | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private final WC g(C4097wG c4097wG) {
        C3504lG c3504lG = LJ.f26091a;
        String str = c4097wG.f34818a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
        }
        try {
            JK jk = c4097wG.f34820c;
            PK pk = PK.f26757a;
            int i = BK.f23877a;
            OI E8 = OI.E(jk, PK.f26758b);
            if (E8.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, E8.C().a());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = C3992uJ.f34510g;
            C3884sJ c3884sJ = new C3884sJ();
            C0361k c0361k = LJ.f26097g;
            c3884sJ.f33964c = (C3938tJ) c0361k.c(E8.B().A());
            c3884sJ.f33965d = (C3938tJ) c0361k.c(E8.B().B());
            c3884sJ.f33963b = new BigInteger(1, E8.D().a());
            c3884sJ.a(bitLength);
            c3884sJ.b(E8.B().C());
            c3884sJ.f33967f = LJ.b(c4097wG.f34822e);
            C3992uJ c9 = c3884sJ.c();
            C3481ku c3481ku = new C3481ku(23, false);
            c3481ku.f31663u = c9;
            c3481ku.f31664v = bigInteger;
            c3481ku.f31665w = c4097wG.f34823f;
            return c3481ku.y();
        } catch (C3295hL | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3558mG
    public C4151xG a(AbstractC3825rE abstractC3825rE) {
        switch (this.f31416n) {
            case 10:
                ZI zi = (ZI) abstractC3825rE;
                C3504lG c3504lG = BJ.f23871a;
                C3933tE a9 = BJ.a(zi.f28869d);
                IH C8 = JH.C();
                LH e9 = BJ.e(zi);
                C8.h();
                ((JH) C8.f27721u).D(e9);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", a9, ((JH) C8.j()).a());
            case 16:
                C3504lG c3504lG2 = DJ.f24378a;
                return C4151xG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", DJ.a(((C3131eJ) abstractC3825rE).f29907a), RH.C().a());
            case 22:
                C3669oJ c3669oJ = (C3669oJ) abstractC3825rE;
                C3504lG c3504lG3 = HJ.f25251a;
                C3933tE a10 = HJ.a(c3669oJ.f32893c);
                C4261zI E8 = AI.E();
                BI B9 = CI.B();
                WH wh = (WH) HJ.f25257g.b(c3669oJ.f32894d);
                B9.h();
                ((CI) B9.f27721u).D(wh);
                CI ci = (CI) B9.j();
                E8.h();
                ((AI) E8.f27721u).F(ci);
                E8.h();
                ((AI) E8.f27721u).G(c3669oJ.f32891a);
                byte[] c9 = AbstractC4094wD.c(c3669oJ.f32892b);
                HK hk = JK.f25675u;
                HK s9 = JK.s(c9, 0, c9.length);
                E8.h();
                ((AI) E8.f27721u).H(s9);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", a10, ((AI) E8.j()).a());
            default:
                C3992uJ c3992uJ = (C3992uJ) abstractC3825rE;
                C3504lG c3504lG4 = LJ.f26091a;
                C3933tE a11 = LJ.a(c3992uJ.f34513c);
                HI E9 = II.E();
                KI c10 = LJ.c(c3992uJ);
                E9.h();
                ((II) E9.f27721u).F(c10);
                E9.h();
                ((II) E9.f27721u).G(c3992uJ.f34511a);
                byte[] c11 = AbstractC4094wD.c(c3992uJ.f34512b);
                HK hk2 = JK.f25675u;
                HK s10 = JK.s(c11, 0, c11.length);
                E9.h();
                ((II) E9.f27721u).H(s10);
                return C4151xG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", a11, ((II) E9.j()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3827rG, com.google.android.gms.internal.ads.UF
    public C4097wG b(WC wc) {
        switch (this.f31416n) {
            case 6:
                C3024cJ c3024cJ = (C3024cJ) wc;
                return C4097wG.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", BJ.f(c3024cJ).a(), C3879sE.f33912f, BJ.a(c3024cJ.f29441b.f28869d), c3024cJ.f29444e);
            case 8:
                C2917aJ c2917aJ = (C2917aJ) wc;
                C3504lG c3504lG = BJ.f23871a;
                int d2 = BJ.d(c2917aJ.f29047b.f29441b.f28867b);
                MH E8 = OH.E();
                C3024cJ c3024cJ2 = c2917aJ.f29047b;
                QH f3 = BJ.f(c3024cJ2);
                E8.h();
                ((OH) E8.f27721u).G(f3);
                byte[] h9 = AbstractC4094wD.h((BigInteger) c2917aJ.f29048c.f31863u, d2);
                HK hk = JK.f25675u;
                HK s9 = JK.s(h9, 0, h9.length);
                E8.h();
                ((OH) E8.f27721u).H(s9);
                return C4097wG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((OH) E8.j()).a(), C3879sE.f33911e, BJ.a(c3024cJ2.f29441b.f28869d), c3024cJ2.f29444e);
            case 12:
                C3293hJ c3293hJ = (C3293hJ) wc;
                return C4097wG.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", DJ.c(c3293hJ).a(), C3879sE.f33912f, DJ.a(c3293hJ.f30756b.f29907a), c3293hJ.f30759e);
            case 14:
                C3185fJ c3185fJ = (C3185fJ) wc;
                C3504lG c3504lG2 = DJ.f24378a;
                SH E9 = TH.E();
                VH c9 = DJ.c(c3185fJ.f30241b);
                E9.h();
                ((TH) E9.f27721u).H(c9);
                byte[] b9 = ((C3240gK) c3185fJ.f30242c.f29859u).b();
                HK s10 = JK.s(b9, 0, b9.length);
                E9.h();
                ((TH) E9.f27721u).G(s10);
                HK a9 = ((TH) E9.j()).a();
                C3879sE c3879sE = C3879sE.f33911e;
                C3293hJ c3293hJ2 = c3185fJ.f30241b;
                return C4097wG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", a9, c3879sE, DJ.a(c3293hJ2.f30756b.f29907a), c3293hJ2.f30759e);
            case 18:
                C3777qJ c3777qJ = (C3777qJ) wc;
                return C4097wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", HJ.c(c3777qJ).a(), C3879sE.f33912f, HJ.a(c3777qJ.f33230b.f32893c), c3777qJ.f33233e);
            case 20:
                C3723pJ c3723pJ = (C3723pJ) wc;
                C3504lG c3504lG3 = HJ.f25251a;
                DI J2 = EI.J();
                J2.h();
                ((EI) J2.f27721u).L();
                GI c10 = HJ.c(c3723pJ.f33056b);
                J2.h();
                ((EI) J2.f27721u).M(c10);
                byte[] c11 = AbstractC4094wD.c((BigInteger) c3723pJ.f33057c.f31863u);
                HK hk2 = JK.f25675u;
                HK s11 = JK.s(c11, 0, c11.length);
                J2.h();
                ((EI) J2.f27721u).N(s11);
                byte[] c12 = AbstractC4094wD.c((BigInteger) c3723pJ.f33058d.f31863u);
                HK s12 = JK.s(c12, 0, c12.length);
                J2.h();
                ((EI) J2.f27721u).O(s12);
                byte[] c13 = AbstractC4094wD.c((BigInteger) c3723pJ.f33059e.f31863u);
                HK s13 = JK.s(c13, 0, c13.length);
                J2.h();
                ((EI) J2.f27721u).P(s13);
                byte[] c14 = AbstractC4094wD.c((BigInteger) c3723pJ.f33060f.f31863u);
                HK s14 = JK.s(c14, 0, c14.length);
                J2.h();
                ((EI) J2.f27721u).Q(s14);
                byte[] c15 = AbstractC4094wD.c((BigInteger) c3723pJ.f33061g.f31863u);
                HK s15 = JK.s(c15, 0, c15.length);
                J2.h();
                ((EI) J2.f27721u).R(s15);
                byte[] c16 = AbstractC4094wD.c((BigInteger) c3723pJ.f33062h.f31863u);
                HK s16 = JK.s(c16, 0, c16.length);
                J2.h();
                ((EI) J2.f27721u).S(s16);
                HK a10 = ((EI) J2.j()).a();
                C3879sE c3879sE2 = C3879sE.f33911e;
                C3777qJ c3777qJ2 = c3723pJ.f33056b;
                return C4097wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", a10, c3879sE2, HJ.a(c3777qJ2.f33230b.f32893c), c3777qJ2.f33233e);
            case 24:
                C4100wJ c4100wJ = (C4100wJ) wc;
                return C4097wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", LJ.d(c4100wJ).a(), C3879sE.f33912f, LJ.a(c4100wJ.f34824b.f34513c), c4100wJ.f34827e);
            default:
                C4046vJ c4046vJ = (C4046vJ) wc;
                C3504lG c3504lG4 = LJ.f26091a;
                LI J8 = MI.J();
                J8.h();
                ((MI) J8.f27721u).L();
                OI d9 = LJ.d(c4046vJ.f34680b);
                J8.h();
                ((MI) J8.f27721u).M(d9);
                byte[] c17 = AbstractC4094wD.c((BigInteger) c4046vJ.f34681c.f31863u);
                HK hk3 = JK.f25675u;
                HK s17 = JK.s(c17, 0, c17.length);
                J8.h();
                ((MI) J8.f27721u).N(s17);
                byte[] c18 = AbstractC4094wD.c((BigInteger) c4046vJ.f34682d.f31863u);
                HK s18 = JK.s(c18, 0, c18.length);
                J8.h();
                ((MI) J8.f27721u).O(s18);
                byte[] c19 = AbstractC4094wD.c((BigInteger) c4046vJ.f34683e.f31863u);
                HK s19 = JK.s(c19, 0, c19.length);
                J8.h();
                ((MI) J8.f27721u).P(s19);
                byte[] c20 = AbstractC4094wD.c((BigInteger) c4046vJ.f34684f.f31863u);
                HK s20 = JK.s(c20, 0, c20.length);
                J8.h();
                ((MI) J8.f27721u).Q(s20);
                byte[] c21 = AbstractC4094wD.c((BigInteger) c4046vJ.f34685g.f31863u);
                HK s21 = JK.s(c21, 0, c21.length);
                J8.h();
                ((MI) J8.f27721u).R(s21);
                byte[] c22 = AbstractC4094wD.c((BigInteger) c4046vJ.f34686h.f31863u);
                HK s22 = JK.s(c22, 0, c22.length);
                J8.h();
                ((MI) J8.f27721u).S(s22);
                HK a11 = ((MI) J8.j()).a();
                C3879sE c3879sE3 = C3879sE.f33911e;
                C4100wJ c4100wJ2 = c4046vJ.f34680b;
                return C4097wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", a11, c3879sE3, LJ.a(c4100wJ2.f34824b.f34513c), c4100wJ2.f34827e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3450kG
    public AbstractC3825rE c(C4151xG c4151xG) {
        switch (this.f31416n) {
            case 5:
                C3504lG c3504lG = BJ.f23871a;
                C3238gI c3238gI = c4151xG.f34969b;
                if (!c3238gI.A().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI.A())));
                }
                try {
                    JK B9 = c3238gI.B();
                    PK pk = PK.f26757a;
                    int i = BK.f23877a;
                    JH B10 = JH.B(B9, PK.f26758b);
                    ME me = new ME(3);
                    me.f26272d = BJ.b(B10.A().A());
                    me.f26270b = BJ.h(B10.A().F());
                    me.f26271c = BJ.g(B10.A().E());
                    me.f26273e = BJ.c(c4151xG.f34970c);
                    return me.k();
                } catch (C3295hL e9) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e9);
                }
            case 11:
                C3504lG c3504lG2 = DJ.f24378a;
                C3238gI c3238gI2 = c4151xG.f34969b;
                if (!c3238gI2.A().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI2.A())));
                }
                try {
                    JK B11 = c3238gI2.B();
                    PK pk2 = PK.f26757a;
                    int i6 = BK.f23877a;
                    if (RH.B(B11, PK.f26758b).A() == 0) {
                        return new C3131eJ(DJ.b(c4151xG.f34970c));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3295hL e10) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
                }
            case 17:
                C3504lG c3504lG3 = HJ.f25251a;
                C3238gI c3238gI3 = c4151xG.f34969b;
                if (!c3238gI3.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI3.A())));
                }
                try {
                    JK B12 = c3238gI3.B();
                    PK pk3 = PK.f26757a;
                    int i9 = BK.f23877a;
                    AI D8 = AI.D(B12, PK.f26758b);
                    BigInteger bigInteger = C3669oJ.f32890e;
                    C3561mJ c3561mJ = new C3561mJ();
                    c3561mJ.f31940c = (C3615nJ) HJ.f25257g.c(D8.A().A());
                    c3561mJ.f31939b = new BigInteger(1, D8.C().a());
                    c3561mJ.a(D8.B());
                    c3561mJ.f31941d = HJ.b(c4151xG.f34970c);
                    return c3561mJ.b();
                } catch (C3295hL e11) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e11);
                }
            default:
                C3504lG c3504lG4 = LJ.f26091a;
                C3238gI c3238gI4 = c4151xG.f34969b;
                if (!c3238gI4.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(c3238gI4.A())));
                }
                try {
                    JK B13 = c3238gI4.B();
                    PK pk4 = PK.f26757a;
                    int i10 = BK.f23877a;
                    II D9 = II.D(B13, PK.f26758b);
                    BigInteger bigInteger2 = C3992uJ.f34510g;
                    C3884sJ c3884sJ = new C3884sJ();
                    WH A9 = D9.A().A();
                    C0361k c0361k = LJ.f26097g;
                    c3884sJ.f33964c = (C3938tJ) c0361k.c(A9);
                    c3884sJ.f33965d = (C3938tJ) c0361k.c(D9.A().B());
                    c3884sJ.f33963b = new BigInteger(1, D9.C().a());
                    c3884sJ.a(D9.B());
                    c3884sJ.b(D9.A().C());
                    c3884sJ.f33967f = LJ.b(c4151xG.f34970c);
                    return c3884sJ.c();
                } catch (C3295hL e12) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e12);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.SF
    public WC d(C4097wG c4097wG) {
        int i = 22;
        int i6 = 23;
        boolean z3 = false;
        switch (this.f31416n) {
            case 7:
                C3504lG c3504lG = BJ.f23871a;
                String str = c4097wG.f34818a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    JK jk = c4097wG.f34820c;
                    PK pk = PK.f26757a;
                    int i9 = BK.f23877a;
                    QH E8 = QH.E(jk, PK.f26758b);
                    if (E8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ME me = new ME(3);
                    me.f26272d = BJ.b(E8.B().A());
                    me.f26270b = BJ.h(E8.B().F());
                    me.f26271c = BJ.g(E8.B().E());
                    me.f26273e = BJ.c(c4097wG.f34822e);
                    ZI k9 = me.k();
                    C3481ku c3481ku = new C3481ku(i, z3);
                    c3481ku.f31663u = k9;
                    c3481ku.f31664v = new ECPoint(new BigInteger(1, E8.C().a()), new BigInteger(1, E8.D().a()));
                    c3481ku.f31665w = c4097wG.f34823f;
                    return c3481ku.x();
                } catch (C3295hL | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 9:
                C3504lG c3504lG2 = BJ.f23871a;
                String str2 = c4097wG.f34818a;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    JK jk2 = c4097wG.f34820c;
                    PK pk2 = PK.f26757a;
                    int i10 = BK.f23877a;
                    OH D8 = OH.D(jk2, PK.f26758b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    QH B9 = D8.B();
                    if (B9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ME me2 = new ME(3);
                    me2.f26272d = BJ.b(B9.B().A());
                    me2.f26270b = BJ.h(B9.B().F());
                    me2.f26271c = BJ.g(B9.B().E());
                    me2.f26273e = BJ.c(c4097wG.f34822e);
                    ZI k10 = me2.k();
                    C3481ku c3481ku2 = new C3481ku(i, z3);
                    c3481ku2.f31663u = k10;
                    c3481ku2.f31664v = new ECPoint(new BigInteger(1, B9.C().a()), new BigInteger(1, B9.D().a()));
                    c3481ku2.f31665w = c4097wG.f34823f;
                    C3024cJ x9 = c3481ku2.x();
                    S0.c cVar = new S0.c(24);
                    cVar.f2775u = x9;
                    cVar.f2776v = new C3534lt(9, new BigInteger(1, D8.C().a()));
                    return cVar.v();
                } catch (C3295hL | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 13:
                C3504lG c3504lG3 = DJ.f24378a;
                String str3 = c4097wG.f34818a;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str3)));
                }
                try {
                    JK jk3 = c4097wG.f34820c;
                    PK pk3 = PK.f26757a;
                    int i11 = BK.f23877a;
                    VH C8 = VH.C(jk3, PK.f26758b);
                    if (C8.A() == 0) {
                        return C3293hJ.j(DJ.b(c4097wG.f34822e), C3240gK.a(C8.B().a()), c4097wG.f34823f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3295hL unused3) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 15:
                C3504lG c3504lG4 = DJ.f24378a;
                String str4 = c4097wG.f34818a;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str4)));
                }
                try {
                    JK jk4 = c4097wG.f34820c;
                    PK pk4 = PK.f26757a;
                    int i12 = BK.f23877a;
                    TH D9 = TH.D(jk4, PK.f26758b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    VH C9 = D9.C();
                    if (C9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return C3185fJ.j(C3293hJ.j(DJ.b(c4097wG.f34822e), C3240gK.a(C9.B().a()), c4097wG.f34823f), new C3105du(8, C3240gK.a(D9.B().a())));
                } catch (C3295hL unused4) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 19:
                C3504lG c3504lG5 = HJ.f25251a;
                String str5 = c4097wG.f34818a;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str5)));
                }
                try {
                    JK jk5 = c4097wG.f34820c;
                    PK pk5 = PK.f26757a;
                    int i13 = BK.f23877a;
                    GI E9 = GI.E(jk5, PK.f26758b);
                    if (E9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, E9.C().a());
                    int bitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = C3669oJ.f32890e;
                    C3561mJ c3561mJ = new C3561mJ();
                    c3561mJ.f31940c = (C3615nJ) HJ.f25257g.c(E9.B().A());
                    c3561mJ.f31939b = new BigInteger(1, E9.D().a());
                    c3561mJ.a(bitLength);
                    c3561mJ.f31941d = HJ.b(c4097wG.f34822e);
                    C3669oJ b9 = c3561mJ.b();
                    C4274ze c4274ze = new C4274ze(23, false);
                    c4274ze.f35360u = b9;
                    c4274ze.f35361v = bigInteger;
                    c4274ze.f35362w = c4097wG.f34823f;
                    return c4274ze.w();
                } catch (C3295hL | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 21:
                return e(c4097wG);
            case 25:
                return g(c4097wG);
            default:
                C3504lG c3504lG6 = LJ.f26091a;
                String str6 = c4097wG.f34818a;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str6)));
                }
                try {
                    JK jk6 = c4097wG.f34820c;
                    PK pk6 = PK.f26757a;
                    int i14 = BK.f23877a;
                    MI I8 = MI.I(jk6, PK.f26758b);
                    if (I8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    OI B10 = I8.B();
                    if (B10.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, B10.C().a());
                    int bitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, B10.D().a());
                    BigInteger bigInteger5 = C3992uJ.f34510g;
                    C3884sJ c3884sJ = new C3884sJ();
                    C0361k c0361k = LJ.f26097g;
                    c3884sJ.f33964c = (C3938tJ) c0361k.c(B10.B().A());
                    c3884sJ.f33965d = (C3938tJ) c0361k.c(B10.B().B());
                    c3884sJ.f33963b = bigInteger4;
                    c3884sJ.a(bitLength2);
                    c3884sJ.b(B10.B().C());
                    c3884sJ.f33967f = LJ.b(c4097wG.f34822e);
                    C3992uJ c9 = c3884sJ.c();
                    C3481ku c3481ku3 = new C3481ku(i6, z3);
                    c3481ku3.f31663u = c9;
                    c3481ku3.f31664v = bigInteger3;
                    c3481ku3.f31665w = c4097wG.f34823f;
                    C4100wJ y7 = c3481ku3.y();
                    C3 c32 = new C3(z3);
                    c32.f24020n = y7;
                    C3534lt e9 = LJ.e(I8.D());
                    C3534lt e10 = LJ.e(I8.E());
                    c32.f24022v = e9;
                    c32.f24023w = e10;
                    c32.f24021u = LJ.e(I8.C());
                    C3534lt e11 = LJ.e(I8.F());
                    C3534lt e12 = LJ.e(I8.G());
                    c32.f24024x = e11;
                    c32.f24025y = e12;
                    c32.f24026z = LJ.e(I8.H());
                    return c32.i();
                } catch (C3295hL | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.YJ
    public /* bridge */ /* synthetic */ Object f(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3827rG, com.google.android.gms.internal.ads.UF
    public Object b(WC wc) {
        KeyFactory keyFactory;
        InterfaceC4041vE b9;
        switch (this.f31416n) {
            case 0:
                C4097wG c4097wG = ((ZF) wc).f28861b;
                C3879sE c3879sE = c4097wG.f34821d;
                InterfaceC4041vE interfaceC4041vE = (InterfaceC4041vE) QF.f27009d.b(InterfaceC4041vE.class, c4097wG.f34818a).a(c4097wG.f34820c);
                C3933tE c3933tE = c4097wG.f34822e;
                return new GJ(interfaceC4041vE, C2921aN.c(c3933tE, c4097wG.f34823f).b(), c3933tE.equals(C3933tE.f34231e) ? new byte[]{0} : new byte[0]);
            case 1:
                C3723pJ c3723pJ = (C3723pJ) wc;
                int i = DG.f24377a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
                }
                Provider h9 = AbstractC3043cl.h();
                if (h9 != null) {
                    keyFactory = KeyFactory.getInstance("RSA", h9);
                } else {
                    keyFactory = (KeyFactory) WJ.f28345g.f28346a.b("RSA");
                }
                C3777qJ c3777qJ = c3723pJ.f33056b;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c3777qJ.f33231c, c3777qJ.f33230b.f32892b, (BigInteger) c3723pJ.f33057c.f31863u, (BigInteger) c3723pJ.f33058d.f31863u, (BigInteger) c3723pJ.f33059e.f31863u, (BigInteger) c3723pJ.f33060f.f31863u, (BigInteger) c3723pJ.f33061g.f31863u, (BigInteger) c3723pJ.f33062h.f31863u));
                C3777qJ c3777qJ2 = c3723pJ.f33056b;
                if (h9 != null) {
                    b9 = JJ.c(c3777qJ2, h9);
                } else {
                    b9 = AbstractC3025cK.b(c3777qJ2);
                }
                IJ ij = new IJ(rSAPrivateCrtKey, c3777qJ2.f33230b.f32894d, c3777qJ2.f33232d.b(), c3777qJ2.f33230b.f32893c.equals(C3556mE.f31923L) ? IJ.f25481h : IJ.f25480g, b9, h9);
                byte[] bArr = IJ.i;
                Provider provider = ij.f25487f;
                String str = ij.f25483b;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) WJ.f28342d.f28346a.b(str);
                signature.initSign(ij.f25482a);
                signature.update(bArr);
                byte[] bArr2 = ij.f25485d;
                if (bArr2.length > 0) {
                    signature.update(bArr2);
                }
                byte[] sign = signature.sign();
                byte[] bArr3 = ij.f25484c;
                if (bArr3.length > 0) {
                    sign = AbstractC4094wD.d(bArr3, sign);
                }
                try {
                    ij.f25486e.a(sign, bArr);
                    return ij;
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException("RSA signature computation error", e9);
                }
            case 2:
                return AbstractC3025cK.b((C3777qJ) wc);
            case 3:
                C4046vJ c4046vJ = (C4046vJ) wc;
                try {
                    return EJ.b(c4046vJ);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory2 = (KeyFactory) WJ.f28345g.f28346a.b("RSA");
                    BigInteger bigInteger = c4046vJ.f34680b.f34825c;
                    C4100wJ c4100wJ = c4046vJ.f34680b;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, c4100wJ.f34824b.f34512b, (BigInteger) c4046vJ.f34681c.f31863u, (BigInteger) c4046vJ.f34682d.f31863u, (BigInteger) c4046vJ.f34683e.f31863u, (BigInteger) c4046vJ.f34684f.f31863u, (BigInteger) c4046vJ.f34685g.f31863u, (BigInteger) c4046vJ.f34686h.f31863u));
                    C0361k c0361k = AbstractC3186fK.f30243a;
                    C3992uJ c3992uJ = c4100wJ.f34824b;
                    ZJ zj = (ZJ) c0361k.b(c3992uJ.f34514d);
                    ZJ zj2 = (ZJ) c0361k.b(c3992uJ.f34515e);
                    c4100wJ.f34826d.b();
                    EJ ej = new EJ();
                    if (!HF.a()) {
                        AbstractC3341iD.i(zj);
                        if (zj.equals(zj2)) {
                            AbstractC3341iD.k(rSAPrivateCrtKey2.getModulus().bitLength());
                            AbstractC3341iD.n(rSAPrivateCrtKey2.getPublicExponent());
                            return ej;
                        }
                        throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                    }
                    throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                }
            default:
                C4100wJ c4100wJ2 = (C4100wJ) wc;
                C0361k c0361k2 = AbstractC3186fK.f30243a;
                try {
                    return MJ.d(c4100wJ2);
                } catch (NoSuchProviderException unused2) {
                    KeyFactory keyFactory3 = (KeyFactory) WJ.f28345g.f28346a.b("RSA");
                    BigInteger bigInteger2 = c4100wJ2.f34825c;
                    C3992uJ c3992uJ2 = c4100wJ2.f34824b;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory3.generatePublic(new RSAPublicKeySpec(bigInteger2, c3992uJ2.f34512b));
                    C0361k c0361k3 = AbstractC3186fK.f30243a;
                    return new C3132eK(rSAPublicKey, (ZJ) c0361k3.b(c3992uJ2.f34514d), (ZJ) c0361k3.b(c3992uJ2.f34515e), c3992uJ2.f34516f, c4100wJ2.f34826d.b(), c3992uJ2.f34513c.equals(C3879sE.f33925t) ? AbstractC3186fK.f30245c : AbstractC3186fK.f30244b);
                }
        }
    }
}
