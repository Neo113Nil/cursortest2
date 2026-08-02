package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final /* synthetic */ class CE implements PF {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CE f24827b = new CE(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CE f24828c = new CE(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CE f24829d = new CE(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CE f24830e = new CE(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CE f24831f = new CE(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CE f24832g = new CE(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ CE f24833h = new CE(6);
    public static final /* synthetic */ CE i = new CE(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ CE f24834j = new CE(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ CE f24835k = new CE(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ CE f24836l = new CE(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ CE f24837m = new CE(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ CE f24838n = new CE(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ CE f24839o = new CE(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ CE f24840p = new CE(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ CE f24841q = new CE(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24842a;

    public /* synthetic */ CE(int i4) {
        this.f24842a = i4;
    }

    @Override // com.google.android.gms.internal.ads.PF
    public final WC a(AbstractC3848rE abstractC3848rE, Integer num) {
        int i4 = 19;
        int i6 = 22;
        int i9 = 23;
        boolean z6 = false;
        switch (this.f24842a) {
            case 0:
                GE ge = (GE) abstractC3848rE;
                C3797qG c3797qG = EE.f25326a;
                int i10 = ge.f25744a;
                if (i10 != 16 && i10 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                C2590Gf c2590Gf = new C2590Gf(28);
                c2590Gf.f25830u = ge;
                c2590Gf.f25833x = num;
                c2590Gf.f25831v = C3128du.e(i10);
                c2590Gf.f25832w = C3128du.e(ge.f25745b);
                return c2590Gf.y();
            case 1:
                JE je = (JE) abstractC3848rE;
                C3797qG c3797qG2 = IE.f26213a;
                int i11 = je.f26411a;
                if (i11 == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                C4297ze c4297ze = new C4297ze(19, false);
                c4297ze.f36133u = je;
                c4297ze.f36135w = num;
                c4297ze.f36134v = C3128du.e(i11);
                return c4297ze.s();
            case 2:
                NE ne = (NE) abstractC3848rE;
                C3797qG c3797qG3 = LE.f26878a;
                int i12 = ne.f27260a;
                if (i12 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                C3504ku c3504ku = new C3504ku(i4, z6);
                c3504ku.f32445u = ne;
                c3504ku.f32447w = num;
                c3504ku.f32446v = C3128du.e(i12);
                return c3504ku.u();
            case 3:
                QE qe = (QE) abstractC3848rE;
                C3797qG c3797qG4 = PE.f27532a;
                C4297ze c4297ze2 = new C4297ze(20, false);
                c4297ze2.f36133u = qe;
                c4297ze2.f36135w = num;
                c4297ze2.f36134v = C3128du.e(qe.f27793a);
                return c4297ze2.t();
            case 4:
                C3797qG c3797qG5 = SE.f28139a;
                return RE.j(((TE) abstractC3848rE).f28492a, C3128du.e(32), num);
            case 5:
                C3797qG c3797qG6 = UE.f28710a;
                return XE.j((YE) abstractC3848rE, num);
            case 6:
                XF xf = WE.f29124a;
                return C2936aF.j((C2990bF) abstractC3848rE, num);
            case 7:
                return C3150eF.j((C3258gF) abstractC3848rE, C3128du.e(32), num);
            case 8:
                C3797qG c3797qG7 = AbstractC3366iF.f31787a;
                return C3312hF.j(((C3418jF) abstractC3848rE).f32008a, C3128du.e(32), num);
            case 9:
                C3044cG c3044cG = C3044cG.f30222b;
                C4174xG c4174xG = ((C2937aG) abstractC3848rE).f29816a;
                QF qf = QF.f27796d;
                C3261gI c3261gI = c4174xG.f35750b;
                XF d9 = qf.d(c3261gI.A());
                if (!((Boolean) qf.f27798b.get(c3261gI.A())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                JK B3 = c3261gI.B();
                d9.getClass();
                C3207fI D8 = C3261gI.D();
                String str = d9.f29288a;
                D8.h();
                ((C3261gI) D8.f28504u).F(str);
                D8.h();
                ((C3261gI) D8.f28504u).G(B3);
                D8.h();
                ((C3261gI) D8.f28504u).I(5);
                C4174xG b9 = C4174xG.b((C3261gI) D8.j());
                C3313hG c3313hG = C3313hG.f31520b;
                C4120wG c4120wG = (C4120wG) c3313hG.f(C3044cG.f30222b.b(c3313hG.g(b9), null));
                C3100dI C8 = C3153eI.C();
                C8.h();
                ((C3153eI) C8.f28504u).E(c4120wG.f35587a);
                C8.h();
                ((C3153eI) C8.f28504u).F(c4120wG.f35589c);
                int i13 = C2944aN.i(c4120wG.f35590d);
                C8.h();
                ((C3153eI) C8.f28504u).H(i13);
                C3153eI c3153eI = (C3153eI) C8.j();
                return new ZF(C4120wG.a(c3153eI.A(), c3153eI.B(), C2944aN.n(c3153eI.G()), C2944aN.p(c3261gI.H()), num));
            case 10:
                GG gg = (GG) abstractC3848rE;
                C3797qG c3797qG8 = FG.f25534a;
                int i14 = gg.f25751a;
                if (i14 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                C4297ze c4297ze3 = new C4297ze(21, false);
                c4297ze3.f36133u = gg;
                c4297ze3.f36134v = C3128du.e(i14);
                c4297ze3.f36135w = num;
                return c4297ze3.u();
            case 11:
                LG lg = (LG) abstractC3848rE;
                C3797qG c3797qG9 = JG.f26415a;
                C4297ze c4297ze4 = new C4297ze(22, false);
                c4297ze4.f36133u = lg;
                c4297ze4.f36134v = C3128du.e(lg.f26887a);
                c4297ze4.f36135w = num;
                return c4297ze4.v();
            case 12:
                ZI zi = (ZI) abstractC3848rE;
                C3797qG c3797qG10 = AbstractC3101dJ.f30511a;
                ECParameterSpec eCParameterSpec = zi.f29647b.f29445b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) WJ.f29142f.f29144a.b("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
                C3504ku c3504ku2 = new C3504ku(i6, z6);
                c3504ku2.f32445u = zi;
                c3504ku2.f32447w = num;
                c3504ku2.f32446v = eCPublicKey.getW();
                C3047cJ w3 = c3504ku2.w();
                S0.c cVar = new S0.c(27);
                cVar.f2902u = w3;
                cVar.f2903v = new C3557lt(9, eCPrivateKey.getS());
                return cVar.m();
            case 13:
                C3154eJ c3154eJ = (C3154eJ) abstractC3848rE;
                C3797qG c3797qG11 = AbstractC3262gJ.f31319a;
                byte[] a9 = AbstractC4228yG.a(32);
                if (a9.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return C3208fJ.j(C3316hJ.j(c3154eJ.f30699a, C3263gK.a(Arrays.copyOf(MA.l(MA.v(a9)), 32)), num), new C3128du(8, C3263gK.a(Arrays.copyOf(a9, a9.length))));
            case 14:
                C3692oJ c3692oJ = (C3692oJ) abstractC3848rE;
                C3797qG c3797qG12 = AbstractC3853rJ.f34318a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) WJ.f29142f.f29144a.b("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(c3692oJ.f33678a, new BigInteger(1, c3692oJ.f33679b.toByteArray())));
                KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair2.getPrivate();
                C4297ze c4297ze5 = new C4297ze(23, false);
                c4297ze5.f36133u = c3692oJ;
                c4297ze5.f36134v = rSAPublicKey.getModulus();
                c4297ze5.f36135w = num;
                C3800qJ w6 = c4297ze5.w();
                C3 c32 = new C3(false);
                c32.f24783n = w6;
                C3557lt c3557lt = new C3557lt(9, rSAPrivateCrtKey.getPrimeP());
                C3557lt c3557lt2 = new C3557lt(9, rSAPrivateCrtKey.getPrimeQ());
                c32.f24785v = c3557lt;
                c32.f24786w = c3557lt2;
                c32.f24784u = new C3557lt(9, rSAPrivateCrtKey.getPrivateExponent());
                C3557lt c3557lt3 = new C3557lt(9, rSAPrivateCrtKey.getPrimeExponentP());
                C3557lt c3557lt4 = new C3557lt(9, rSAPrivateCrtKey.getPrimeExponentQ());
                c32.f24787x = c3557lt3;
                c32.f24788y = c3557lt4;
                c32.f24789z = new C3557lt(9, rSAPrivateCrtKey.getCrtCoefficient());
                return c32.g();
            default:
                C4015uJ c4015uJ = (C4015uJ) abstractC3848rE;
                C3797qG c3797qG13 = AbstractC4177xJ.f35752a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) WJ.f29142f.f29144a.b("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(c4015uJ.f35285a, new BigInteger(1, c4015uJ.f35286b.toByteArray())));
                KeyPair generateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) generateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) generateKeyPair3.getPrivate();
                C3504ku c3504ku3 = new C3504ku(i9, z6);
                c3504ku3.f32445u = c4015uJ;
                c3504ku3.f32446v = rSAPublicKey2.getModulus();
                c3504ku3.f32447w = num;
                C4123wJ x9 = c3504ku3.x();
                C3 c33 = new C3(false);
                c33.f24783n = x9;
                C3557lt c3557lt5 = new C3557lt(9, rSAPrivateCrtKey2.getPrimeP());
                C3557lt c3557lt6 = new C3557lt(9, rSAPrivateCrtKey2.getPrimeQ());
                c33.f24785v = c3557lt5;
                c33.f24786w = c3557lt6;
                c33.f24784u = new C3557lt(9, rSAPrivateCrtKey2.getPrivateExponent());
                C3557lt c3557lt7 = new C3557lt(9, rSAPrivateCrtKey2.getPrimeExponentP());
                C3557lt c3557lt8 = new C3557lt(9, rSAPrivateCrtKey2.getPrimeExponentQ());
                c33.f24787x = c3557lt7;
                c33.f24788y = c3557lt8;
                c33.f24789z = new C3557lt(9, rSAPrivateCrtKey2.getCrtCoefficient());
                return c33.h();
        }
    }
}
