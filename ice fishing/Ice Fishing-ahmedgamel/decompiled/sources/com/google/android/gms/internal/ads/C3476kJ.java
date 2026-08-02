package com.google.android.gms.internal.ads;

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
public final /* synthetic */ class C3476kJ implements InterfaceC3850rG, InterfaceC3473kG, UF, SF, InterfaceC3581mG, YJ {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32195n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32189u = new C3476kJ(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32190v = new C3476kJ(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32191w = new C3476kJ(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32192x = new C3476kJ(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32193y = new C3476kJ(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32194z = new C3476kJ(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32167A = new C3476kJ(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32168B = new C3476kJ(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32169C = new C3476kJ(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32170D = new C3476kJ(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32171E = new C3476kJ(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32172F = new C3476kJ(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32173G = new C3476kJ(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32174H = new C3476kJ(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32175I = new C3476kJ(14);
    public static final /* synthetic */ C3476kJ J = new C3476kJ(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32176K = new C3476kJ(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32177L = new C3476kJ(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32178M = new C3476kJ(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32179N = new C3476kJ(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32180O = new C3476kJ(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32181P = new C3476kJ(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32182Q = new C3476kJ(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32183R = new C3476kJ(23);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32184S = new C3476kJ(24);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32185T = new C3476kJ(25);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32186U = new C3476kJ(26);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32187V = new C3476kJ(27);

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ C3476kJ f32188W = new C3476kJ(28);

    public /* synthetic */ C3476kJ(int i) {
        this.f32195n = i;
    }

    private final WC e(C4120wG c4120wG) {
        boolean z6 = false;
        C3527lG c3527lG = HJ.f26023a;
        String str = c4120wG.f35587a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
        }
        try {
            JK jk = c4120wG.f35589c;
            PK pk = PK.f27540a;
            int i = BK.f24648a;
            EI I8 = EI.I(jk, PK.f27541b);
            if (I8.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            GI B3 = I8.B();
            if (B3.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, B3.C().a());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, B3.D().a());
            BigInteger bigInteger3 = C3692oJ.f33677e;
            C3584mJ c3584mJ = new C3584mJ();
            c3584mJ.f32720c = (C3638nJ) HJ.f26029g.L(B3.B().A());
            c3584mJ.f32719b = bigInteger2;
            c3584mJ.a(bitLength);
            c3584mJ.f32721d = HJ.b(c4120wG.f35591e);
            C3692oJ b9 = c3584mJ.b();
            C4297ze c4297ze = new C4297ze(23, false);
            c4297ze.f36133u = b9;
            c4297ze.f36134v = bigInteger;
            c4297ze.f36135w = c4120wG.f35592f;
            C3800qJ w3 = c4297ze.w();
            C3 c32 = new C3(z6);
            c32.f24783n = w3;
            C3557lt d9 = HJ.d(I8.D());
            C3557lt d10 = HJ.d(I8.E());
            c32.f24785v = d9;
            c32.f24786w = d10;
            c32.f24784u = HJ.d(I8.C());
            C3557lt d11 = HJ.d(I8.F());
            C3557lt d12 = HJ.d(I8.G());
            c32.f24787x = d11;
            c32.f24788y = d12;
            c32.f24789z = HJ.d(I8.H());
            return c32.g();
        } catch (C3318hL | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private final WC g(C4120wG c4120wG) {
        C3527lG c3527lG = LJ.f26891a;
        String str = c4120wG.f35587a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
        }
        try {
            JK jk = c4120wG.f35589c;
            PK pk = PK.f27540a;
            int i = BK.f24648a;
            OI E8 = OI.E(jk, PK.f27541b);
            if (E8.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, E8.C().a());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = C4015uJ.f35284g;
            C3907sJ c3907sJ = new C3907sJ();
            S0.e eVar = LJ.f26897g;
            c3907sJ.f34732c = (C3961tJ) eVar.L(E8.B().A());
            c3907sJ.f34733d = (C3961tJ) eVar.L(E8.B().B());
            c3907sJ.f34731b = new BigInteger(1, E8.D().a());
            c3907sJ.a(bitLength);
            c3907sJ.b(E8.B().C());
            c3907sJ.f34735f = LJ.b(c4120wG.f35591e);
            C4015uJ c9 = c3907sJ.c();
            C3504ku c3504ku = new C3504ku(23, false);
            c3504ku.f32445u = c9;
            c3504ku.f32446v = bigInteger;
            c3504ku.f32447w = c4120wG.f35592f;
            return c3504ku.x();
        } catch (C3318hL | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3581mG
    public C4174xG a(AbstractC3848rE abstractC3848rE) {
        switch (this.f32195n) {
            case 10:
                ZI zi = (ZI) abstractC3848rE;
                C3527lG c3527lG = BJ.f24642a;
                C3956tE a9 = BJ.a(zi.f29649d);
                IH C8 = JH.C();
                LH e9 = BJ.e(zi);
                C8.h();
                ((JH) C8.f28504u).D(e9);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", a9, ((JH) C8.j()).a());
            case 16:
                C3527lG c3527lG2 = DJ.f25123a;
                return C4174xG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", DJ.a(((C3154eJ) abstractC3848rE).f30699a), RH.C().a());
            case 22:
                C3692oJ c3692oJ = (C3692oJ) abstractC3848rE;
                C3527lG c3527lG3 = HJ.f26023a;
                C3956tE a10 = HJ.a(c3692oJ.f33680c);
                C4284zI E8 = AI.E();
                BI B3 = CI.B();
                WH wh = (WH) HJ.f26029g.H(c3692oJ.f33681d);
                B3.h();
                ((CI) B3.f28504u).D(wh);
                CI ci = (CI) B3.j();
                E8.h();
                ((AI) E8.f28504u).F(ci);
                E8.h();
                ((AI) E8.f28504u).G(c3692oJ.f33678a);
                byte[] c9 = AbstractC4117wD.c(c3692oJ.f33679b);
                HK hk = JK.f26428u;
                HK s9 = JK.s(c9, 0, c9.length);
                E8.h();
                ((AI) E8.f28504u).H(s9);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", a10, ((AI) E8.j()).a());
            default:
                C4015uJ c4015uJ = (C4015uJ) abstractC3848rE;
                C3527lG c3527lG4 = LJ.f26891a;
                C3956tE a11 = LJ.a(c4015uJ.f35287c);
                HI E9 = II.E();
                KI c10 = LJ.c(c4015uJ);
                E9.h();
                ((II) E9.f28504u).F(c10);
                E9.h();
                ((II) E9.f28504u).G(c4015uJ.f35285a);
                byte[] c11 = AbstractC4117wD.c(c4015uJ.f35286b);
                HK hk2 = JK.f26428u;
                HK s10 = JK.s(c11, 0, c11.length);
                E9.h();
                ((II) E9.f28504u).H(s10);
                return C4174xG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", a11, ((II) E9.j()).a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3850rG, com.google.android.gms.internal.ads.UF
    public C4120wG b(WC wc) {
        switch (this.f32195n) {
            case 6:
                C3047cJ c3047cJ = (C3047cJ) wc;
                return C4120wG.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", BJ.f(c3047cJ).a(), C3902sE.f34680f, BJ.a(c3047cJ.f30224b.f29649d), c3047cJ.f30227e);
            case 8:
                C2940aJ c2940aJ = (C2940aJ) wc;
                C3527lG c3527lG = BJ.f24642a;
                int d9 = BJ.d(c2940aJ.f29817b.f30224b.f29647b);
                MH E8 = OH.E();
                C3047cJ c3047cJ2 = c2940aJ.f29817b;
                QH f2 = BJ.f(c3047cJ2);
                E8.h();
                ((OH) E8.f28504u).G(f2);
                byte[] h3 = AbstractC4117wD.h((BigInteger) c2940aJ.f29818c.f32643u, d9);
                HK hk = JK.f26428u;
                HK s9 = JK.s(h3, 0, h3.length);
                E8.h();
                ((OH) E8.f28504u).H(s9);
                return C4120wG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((OH) E8.j()).a(), C3902sE.f34679e, BJ.a(c3047cJ2.f30224b.f29649d), c3047cJ2.f30227e);
            case 12:
                C3316hJ c3316hJ = (C3316hJ) wc;
                return C4120wG.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", DJ.c(c3316hJ).a(), C3902sE.f34680f, DJ.a(c3316hJ.f31522b.f30699a), c3316hJ.f31525e);
            case 14:
                C3208fJ c3208fJ = (C3208fJ) wc;
                C3527lG c3527lG2 = DJ.f25123a;
                SH E9 = TH.E();
                VH c9 = DJ.c(c3208fJ.f31028b);
                E9.h();
                ((TH) E9.f28504u).H(c9);
                byte[] b9 = ((C3263gK) c3208fJ.f31029c.f30647u).b();
                HK s10 = JK.s(b9, 0, b9.length);
                E9.h();
                ((TH) E9.f28504u).G(s10);
                HK a9 = ((TH) E9.j()).a();
                C3902sE c3902sE = C3902sE.f34679e;
                C3316hJ c3316hJ2 = c3208fJ.f31028b;
                return C4120wG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", a9, c3902sE, DJ.a(c3316hJ2.f31522b.f30699a), c3316hJ2.f31525e);
            case 18:
                C3800qJ c3800qJ = (C3800qJ) wc;
                return C4120wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", HJ.c(c3800qJ).a(), C3902sE.f34680f, HJ.a(c3800qJ.f34014b.f33680c), c3800qJ.f34017e);
            case 20:
                C3746pJ c3746pJ = (C3746pJ) wc;
                C3527lG c3527lG3 = HJ.f26023a;
                DI J8 = EI.J();
                J8.h();
                ((EI) J8.f28504u).L();
                GI c10 = HJ.c(c3746pJ.f33846b);
                J8.h();
                ((EI) J8.f28504u).M(c10);
                byte[] c11 = AbstractC4117wD.c((BigInteger) c3746pJ.f33847c.f32643u);
                HK hk2 = JK.f26428u;
                HK s11 = JK.s(c11, 0, c11.length);
                J8.h();
                ((EI) J8.f28504u).N(s11);
                byte[] c12 = AbstractC4117wD.c((BigInteger) c3746pJ.f33848d.f32643u);
                HK s12 = JK.s(c12, 0, c12.length);
                J8.h();
                ((EI) J8.f28504u).O(s12);
                byte[] c13 = AbstractC4117wD.c((BigInteger) c3746pJ.f33849e.f32643u);
                HK s13 = JK.s(c13, 0, c13.length);
                J8.h();
                ((EI) J8.f28504u).P(s13);
                byte[] c14 = AbstractC4117wD.c((BigInteger) c3746pJ.f33850f.f32643u);
                HK s14 = JK.s(c14, 0, c14.length);
                J8.h();
                ((EI) J8.f28504u).Q(s14);
                byte[] c15 = AbstractC4117wD.c((BigInteger) c3746pJ.f33851g.f32643u);
                HK s15 = JK.s(c15, 0, c15.length);
                J8.h();
                ((EI) J8.f28504u).R(s15);
                byte[] c16 = AbstractC4117wD.c((BigInteger) c3746pJ.f33852h.f32643u);
                HK s16 = JK.s(c16, 0, c16.length);
                J8.h();
                ((EI) J8.f28504u).S(s16);
                HK a10 = ((EI) J8.j()).a();
                C3902sE c3902sE2 = C3902sE.f34679e;
                C3800qJ c3800qJ2 = c3746pJ.f33846b;
                return C4120wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", a10, c3902sE2, HJ.a(c3800qJ2.f34014b.f33680c), c3800qJ2.f34017e);
            case 24:
                C4123wJ c4123wJ = (C4123wJ) wc;
                return C4120wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", LJ.d(c4123wJ).a(), C3902sE.f34680f, LJ.a(c4123wJ.f35593b.f35287c), c4123wJ.f35596e);
            default:
                C4069vJ c4069vJ = (C4069vJ) wc;
                C3527lG c3527lG4 = LJ.f26891a;
                LI J9 = MI.J();
                J9.h();
                ((MI) J9.f28504u).L();
                OI d10 = LJ.d(c4069vJ.f35443b);
                J9.h();
                ((MI) J9.f28504u).M(d10);
                byte[] c17 = AbstractC4117wD.c((BigInteger) c4069vJ.f35444c.f32643u);
                HK hk3 = JK.f26428u;
                HK s17 = JK.s(c17, 0, c17.length);
                J9.h();
                ((MI) J9.f28504u).N(s17);
                byte[] c18 = AbstractC4117wD.c((BigInteger) c4069vJ.f35445d.f32643u);
                HK s18 = JK.s(c18, 0, c18.length);
                J9.h();
                ((MI) J9.f28504u).O(s18);
                byte[] c19 = AbstractC4117wD.c((BigInteger) c4069vJ.f35446e.f32643u);
                HK s19 = JK.s(c19, 0, c19.length);
                J9.h();
                ((MI) J9.f28504u).P(s19);
                byte[] c20 = AbstractC4117wD.c((BigInteger) c4069vJ.f35447f.f32643u);
                HK s20 = JK.s(c20, 0, c20.length);
                J9.h();
                ((MI) J9.f28504u).Q(s20);
                byte[] c21 = AbstractC4117wD.c((BigInteger) c4069vJ.f35448g.f32643u);
                HK s21 = JK.s(c21, 0, c21.length);
                J9.h();
                ((MI) J9.f28504u).R(s21);
                byte[] c22 = AbstractC4117wD.c((BigInteger) c4069vJ.f35449h.f32643u);
                HK s22 = JK.s(c22, 0, c22.length);
                J9.h();
                ((MI) J9.f28504u).S(s22);
                HK a11 = ((MI) J9.j()).a();
                C3902sE c3902sE3 = C3902sE.f34679e;
                C4123wJ c4123wJ2 = c4069vJ.f35443b;
                return C4120wG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", a11, c3902sE3, LJ.a(c4123wJ2.f35593b.f35287c), c4123wJ2.f35596e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3473kG
    public AbstractC3848rE c(C4174xG c4174xG) {
        switch (this.f32195n) {
            case 5:
                C3527lG c3527lG = BJ.f24642a;
                C3261gI c3261gI = c4174xG.f35750b;
                if (!c3261gI.A().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI.A())));
                }
                try {
                    JK B3 = c3261gI.B();
                    PK pk = PK.f27540a;
                    int i = BK.f24648a;
                    JH B9 = JH.B(B3, PK.f27541b);
                    ME me = new ME(3);
                    me.f27063d = BJ.b(B9.A().A());
                    me.f27061b = BJ.h(B9.A().F());
                    me.f27062c = BJ.g(B9.A().E());
                    me.f27064e = BJ.c(c4174xG.f35751c);
                    return me.k();
                } catch (C3318hL e9) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e9);
                }
            case 11:
                C3527lG c3527lG2 = DJ.f25123a;
                C3261gI c3261gI2 = c4174xG.f35750b;
                if (!c3261gI2.A().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI2.A())));
                }
                try {
                    JK B10 = c3261gI2.B();
                    PK pk2 = PK.f27540a;
                    int i4 = BK.f24648a;
                    if (RH.B(B10, PK.f27541b).A() == 0) {
                        return new C3154eJ(DJ.b(c4174xG.f35751c));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3318hL e10) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
                }
            case 17:
                C3527lG c3527lG3 = HJ.f26023a;
                C3261gI c3261gI3 = c4174xG.f35750b;
                if (!c3261gI3.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI3.A())));
                }
                try {
                    JK B11 = c3261gI3.B();
                    PK pk3 = PK.f27540a;
                    int i6 = BK.f24648a;
                    AI D8 = AI.D(B11, PK.f27541b);
                    BigInteger bigInteger = C3692oJ.f33677e;
                    C3584mJ c3584mJ = new C3584mJ();
                    c3584mJ.f32720c = (C3638nJ) HJ.f26029g.L(D8.A().A());
                    c3584mJ.f32719b = new BigInteger(1, D8.C().a());
                    c3584mJ.a(D8.B());
                    c3584mJ.f32721d = HJ.b(c4174xG.f35751c);
                    return c3584mJ.b();
                } catch (C3318hL e11) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e11);
                }
            default:
                C3527lG c3527lG4 = LJ.f26891a;
                C3261gI c3261gI4 = c4174xG.f35750b;
                if (!c3261gI4.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(c3261gI4.A())));
                }
                try {
                    JK B12 = c3261gI4.B();
                    PK pk4 = PK.f27540a;
                    int i9 = BK.f24648a;
                    II D9 = II.D(B12, PK.f27541b);
                    BigInteger bigInteger2 = C4015uJ.f35284g;
                    C3907sJ c3907sJ = new C3907sJ();
                    WH A9 = D9.A().A();
                    S0.e eVar = LJ.f26897g;
                    c3907sJ.f34732c = (C3961tJ) eVar.L(A9);
                    c3907sJ.f34733d = (C3961tJ) eVar.L(D9.A().B());
                    c3907sJ.f34731b = new BigInteger(1, D9.C().a());
                    c3907sJ.a(D9.B());
                    c3907sJ.b(D9.A().C());
                    c3907sJ.f34735f = LJ.b(c4174xG.f35751c);
                    return c3907sJ.c();
                } catch (C3318hL e12) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e12);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.SF
    public WC d(C4120wG c4120wG) {
        int i = 22;
        int i4 = 23;
        boolean z6 = false;
        switch (this.f32195n) {
            case 7:
                C3527lG c3527lG = BJ.f24642a;
                String str = c4120wG.f35587a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    JK jk = c4120wG.f35589c;
                    PK pk = PK.f27540a;
                    int i6 = BK.f24648a;
                    QH E8 = QH.E(jk, PK.f27541b);
                    if (E8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ME me = new ME(3);
                    me.f27063d = BJ.b(E8.B().A());
                    me.f27061b = BJ.h(E8.B().F());
                    me.f27062c = BJ.g(E8.B().E());
                    me.f27064e = BJ.c(c4120wG.f35591e);
                    ZI k9 = me.k();
                    C3504ku c3504ku = new C3504ku(i, z6);
                    c3504ku.f32445u = k9;
                    c3504ku.f32446v = new ECPoint(new BigInteger(1, E8.C().a()), new BigInteger(1, E8.D().a()));
                    c3504ku.f32447w = c4120wG.f35592f;
                    return c3504ku.w();
                } catch (C3318hL | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 9:
                C3527lG c3527lG2 = BJ.f24642a;
                String str2 = c4120wG.f35587a;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    JK jk2 = c4120wG.f35589c;
                    PK pk2 = PK.f27540a;
                    int i9 = BK.f24648a;
                    OH D8 = OH.D(jk2, PK.f27541b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    QH B3 = D8.B();
                    if (B3.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ME me2 = new ME(3);
                    me2.f27063d = BJ.b(B3.B().A());
                    me2.f27061b = BJ.h(B3.B().F());
                    me2.f27062c = BJ.g(B3.B().E());
                    me2.f27064e = BJ.c(c4120wG.f35591e);
                    ZI k10 = me2.k();
                    C3504ku c3504ku2 = new C3504ku(i, z6);
                    c3504ku2.f32445u = k10;
                    c3504ku2.f32446v = new ECPoint(new BigInteger(1, B3.C().a()), new BigInteger(1, B3.D().a()));
                    c3504ku2.f32447w = c4120wG.f35592f;
                    C3047cJ w3 = c3504ku2.w();
                    S0.c cVar = new S0.c(27);
                    cVar.f2902u = w3;
                    cVar.f2903v = new C3557lt(9, new BigInteger(1, D8.C().a()));
                    return cVar.m();
                } catch (C3318hL | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 13:
                C3527lG c3527lG3 = DJ.f25123a;
                String str3 = c4120wG.f35587a;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str3)));
                }
                try {
                    JK jk3 = c4120wG.f35589c;
                    PK pk3 = PK.f27540a;
                    int i10 = BK.f24648a;
                    VH C8 = VH.C(jk3, PK.f27541b);
                    if (C8.A() == 0) {
                        return C3316hJ.j(DJ.b(c4120wG.f35591e), C3263gK.a(C8.B().a()), c4120wG.f35592f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3318hL unused3) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 15:
                C3527lG c3527lG4 = DJ.f25123a;
                String str4 = c4120wG.f35587a;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str4)));
                }
                try {
                    JK jk4 = c4120wG.f35589c;
                    PK pk4 = PK.f27540a;
                    int i11 = BK.f24648a;
                    TH D9 = TH.D(jk4, PK.f27541b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    VH C9 = D9.C();
                    if (C9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return C3208fJ.j(C3316hJ.j(DJ.b(c4120wG.f35591e), C3263gK.a(C9.B().a()), c4120wG.f35592f), new C3128du(8, C3263gK.a(D9.B().a())));
                } catch (C3318hL unused4) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 19:
                C3527lG c3527lG5 = HJ.f26023a;
                String str5 = c4120wG.f35587a;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str5)));
                }
                try {
                    JK jk5 = c4120wG.f35589c;
                    PK pk5 = PK.f27540a;
                    int i12 = BK.f24648a;
                    GI E9 = GI.E(jk5, PK.f27541b);
                    if (E9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, E9.C().a());
                    int bitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = C3692oJ.f33677e;
                    C3584mJ c3584mJ = new C3584mJ();
                    c3584mJ.f32720c = (C3638nJ) HJ.f26029g.L(E9.B().A());
                    c3584mJ.f32719b = new BigInteger(1, E9.D().a());
                    c3584mJ.a(bitLength);
                    c3584mJ.f32721d = HJ.b(c4120wG.f35591e);
                    C3692oJ b9 = c3584mJ.b();
                    C4297ze c4297ze = new C4297ze(23, false);
                    c4297ze.f36133u = b9;
                    c4297ze.f36134v = bigInteger;
                    c4297ze.f36135w = c4120wG.f35592f;
                    return c4297ze.w();
                } catch (C3318hL | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 21:
                return e(c4120wG);
            case 25:
                return g(c4120wG);
            default:
                C3527lG c3527lG6 = LJ.f26891a;
                String str6 = c4120wG.f35587a;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str6)));
                }
                try {
                    JK jk6 = c4120wG.f35589c;
                    PK pk6 = PK.f27540a;
                    int i13 = BK.f24648a;
                    MI I8 = MI.I(jk6, PK.f27541b);
                    if (I8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    OI B9 = I8.B();
                    if (B9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, B9.C().a());
                    int bitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, B9.D().a());
                    BigInteger bigInteger5 = C4015uJ.f35284g;
                    C3907sJ c3907sJ = new C3907sJ();
                    S0.e eVar = LJ.f26897g;
                    c3907sJ.f34732c = (C3961tJ) eVar.L(B9.B().A());
                    c3907sJ.f34733d = (C3961tJ) eVar.L(B9.B().B());
                    c3907sJ.f34731b = bigInteger4;
                    c3907sJ.a(bitLength2);
                    c3907sJ.b(B9.B().C());
                    c3907sJ.f34735f = LJ.b(c4120wG.f35591e);
                    C4015uJ c9 = c3907sJ.c();
                    C3504ku c3504ku3 = new C3504ku(i4, z6);
                    c3504ku3.f32445u = c9;
                    c3504ku3.f32446v = bigInteger3;
                    c3504ku3.f32447w = c4120wG.f35592f;
                    C4123wJ x9 = c3504ku3.x();
                    C3 c32 = new C3(z6);
                    c32.f24783n = x9;
                    C3557lt e9 = LJ.e(I8.D());
                    C3557lt e10 = LJ.e(I8.E());
                    c32.f24785v = e9;
                    c32.f24786w = e10;
                    c32.f24784u = LJ.e(I8.C());
                    C3557lt e11 = LJ.e(I8.F());
                    C3557lt e12 = LJ.e(I8.G());
                    c32.f24787x = e11;
                    c32.f24788y = e12;
                    c32.f24789z = LJ.e(I8.H());
                    return c32.h();
                } catch (C3318hL | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.YJ
    public /* bridge */ /* synthetic */ Object f(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3850rG, com.google.android.gms.internal.ads.UF
    public Object b(WC wc) {
        KeyFactory keyFactory;
        InterfaceC4064vE b9;
        switch (this.f32195n) {
            case 0:
                C4120wG c4120wG = ((ZF) wc).f29641b;
                C3902sE c3902sE = c4120wG.f35590d;
                InterfaceC4064vE interfaceC4064vE = (InterfaceC4064vE) QF.f27796d.b(InterfaceC4064vE.class, c4120wG.f35587a).a(c4120wG.f35589c);
                C3956tE c3956tE = c4120wG.f35591e;
                return new GJ(interfaceC4064vE, C2944aN.c(c3956tE, c4120wG.f35592f).b(), c3956tE.equals(C3956tE.f35017e) ? new byte[]{0} : new byte[0]);
            case 1:
                C3746pJ c3746pJ = (C3746pJ) wc;
                int i = DG.f25122a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
                }
                Provider h3 = AbstractC3066cl.h();
                if (h3 != null) {
                    keyFactory = KeyFactory.getInstance("RSA", h3);
                } else {
                    keyFactory = (KeyFactory) WJ.f29143g.f29144a.b("RSA");
                }
                C3800qJ c3800qJ = c3746pJ.f33846b;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c3800qJ.f34015c, c3800qJ.f34014b.f33679b, (BigInteger) c3746pJ.f33847c.f32643u, (BigInteger) c3746pJ.f33848d.f32643u, (BigInteger) c3746pJ.f33849e.f32643u, (BigInteger) c3746pJ.f33850f.f32643u, (BigInteger) c3746pJ.f33851g.f32643u, (BigInteger) c3746pJ.f33852h.f32643u));
                C3800qJ c3800qJ2 = c3746pJ.f33846b;
                if (h3 != null) {
                    b9 = JJ.c(c3800qJ2, h3);
                } else {
                    b9 = AbstractC3048cK.b(c3800qJ2);
                }
                IJ ij = new IJ(rSAPrivateCrtKey, c3800qJ2.f34014b.f33681d, c3800qJ2.f34016d.b(), c3800qJ2.f34014b.f33680c.equals(C3579mE.f32703L) ? IJ.f26224h : IJ.f26223g, b9, h3);
                byte[] bArr = IJ.i;
                Provider provider = ij.f26230f;
                String str = ij.f26226b;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) WJ.f29140d.f29144a.b(str);
                signature.initSign(ij.f26225a);
                signature.update(bArr);
                byte[] bArr2 = ij.f26228d;
                if (bArr2.length > 0) {
                    signature.update(bArr2);
                }
                byte[] sign = signature.sign();
                byte[] bArr3 = ij.f26227c;
                if (bArr3.length > 0) {
                    sign = AbstractC4117wD.d(bArr3, sign);
                }
                try {
                    ij.f26229e.a(sign, bArr);
                    return ij;
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException("RSA signature computation error", e9);
                }
            case 2:
                return AbstractC3048cK.b((C3800qJ) wc);
            case 3:
                C4069vJ c4069vJ = (C4069vJ) wc;
                try {
                    return EJ.b(c4069vJ);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory2 = (KeyFactory) WJ.f29143g.f29144a.b("RSA");
                    BigInteger bigInteger = c4069vJ.f35443b.f35594c;
                    C4123wJ c4123wJ = c4069vJ.f35443b;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, c4123wJ.f35593b.f35286b, (BigInteger) c4069vJ.f35444c.f32643u, (BigInteger) c4069vJ.f35445d.f32643u, (BigInteger) c4069vJ.f35446e.f32643u, (BigInteger) c4069vJ.f35447f.f32643u, (BigInteger) c4069vJ.f35448g.f32643u, (BigInteger) c4069vJ.f35449h.f32643u));
                    S0.e eVar = AbstractC3209fK.f31030a;
                    C4015uJ c4015uJ = c4123wJ.f35593b;
                    ZJ zj = (ZJ) eVar.H(c4015uJ.f35288d);
                    ZJ zj2 = (ZJ) eVar.H(c4015uJ.f35289e);
                    c4123wJ.f35595d.b();
                    EJ ej = new EJ();
                    if (!HF.a()) {
                        AbstractC3364iD.i(zj);
                        if (zj.equals(zj2)) {
                            AbstractC3364iD.k(rSAPrivateCrtKey2.getModulus().bitLength());
                            AbstractC3364iD.n(rSAPrivateCrtKey2.getPublicExponent());
                            return ej;
                        }
                        throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                    }
                    throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                }
            default:
                C4123wJ c4123wJ2 = (C4123wJ) wc;
                S0.e eVar2 = AbstractC3209fK.f31030a;
                try {
                    return MJ.d(c4123wJ2);
                } catch (NoSuchProviderException unused2) {
                    KeyFactory keyFactory3 = (KeyFactory) WJ.f29143g.f29144a.b("RSA");
                    BigInteger bigInteger2 = c4123wJ2.f35594c;
                    C4015uJ c4015uJ2 = c4123wJ2.f35593b;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory3.generatePublic(new RSAPublicKeySpec(bigInteger2, c4015uJ2.f35286b));
                    S0.e eVar3 = AbstractC3209fK.f31030a;
                    return new C3155eK(rSAPublicKey, (ZJ) eVar3.H(c4015uJ2.f35288d), (ZJ) eVar3.H(c4015uJ2.f35289e), c4015uJ2.f35290f, c4123wJ2.f35595d.b(), c4015uJ2.f35287c.equals(C3902sE.f34693t) ? AbstractC3209fK.f31032c : AbstractC3209fK.f31031b);
                }
        }
    }
}
