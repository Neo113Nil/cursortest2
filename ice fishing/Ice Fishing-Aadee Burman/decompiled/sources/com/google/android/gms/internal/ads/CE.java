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
    public static final /* synthetic */ CE f24064b = new CE(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CE f24065c = new CE(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CE f24066d = new CE(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CE f24067e = new CE(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CE f24068f = new CE(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CE f24069g = new CE(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ CE f24070h = new CE(6);
    public static final /* synthetic */ CE i = new CE(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ CE f24071j = new CE(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ CE f24072k = new CE(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ CE f24073l = new CE(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ CE f24074m = new CE(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ CE f24075n = new CE(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ CE f24076o = new CE(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ CE f24077p = new CE(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ CE f24078q = new CE(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24079a;

    public /* synthetic */ CE(int i6) {
        this.f24079a = i6;
    }

    @Override // com.google.android.gms.internal.ads.PF
    public final WC a(AbstractC3825rE abstractC3825rE, Integer num) {
        int i6 = 19;
        int i9 = 22;
        int i10 = 23;
        boolean z3 = false;
        switch (this.f24079a) {
            case 0:
                GE ge = (GE) abstractC3825rE;
                C3774qG c3774qG = EE.f24565a;
                int i11 = ge.f24954a;
                if (i11 != 16 && i11 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                C2570Gf c2570Gf = new C2570Gf(28);
                c2570Gf.f25042u = ge;
                c2570Gf.f25045x = num;
                c2570Gf.f25043v = C3105du.e(i11);
                c2570Gf.f25044w = C3105du.e(ge.f24955b);
                return c2570Gf.y();
            case 1:
                JE je = (JE) abstractC3825rE;
                C3774qG c3774qG2 = IE.f25470a;
                int i12 = je.f25658a;
                if (i12 == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                C4274ze c4274ze = new C4274ze(19, false);
                c4274ze.f35360u = je;
                c4274ze.f35362w = num;
                c4274ze.f35361v = C3105du.e(i12);
                return c4274ze.s();
            case 2:
                NE ne = (NE) abstractC3825rE;
                C3774qG c3774qG3 = LE.f26078a;
                int i13 = ne.f26476a;
                if (i13 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                C3481ku c3481ku = new C3481ku(i6, z3);
                c3481ku.f31663u = ne;
                c3481ku.f31665w = num;
                c3481ku.f31664v = C3105du.e(i13);
                return c3481ku.v();
            case 3:
                QE qe = (QE) abstractC3825rE;
                C3774qG c3774qG4 = PE.f26749a;
                C4274ze c4274ze2 = new C4274ze(20, false);
                c4274ze2.f35360u = qe;
                c4274ze2.f35362w = num;
                c4274ze2.f35361v = C3105du.e(qe.f27006a);
                return c4274ze2.t();
            case 4:
                C3774qG c3774qG5 = SE.f27425a;
                return RE.j(((TE) abstractC3825rE).f27709a, C3105du.e(32), num);
            case 5:
                C3774qG c3774qG6 = UE.f27913a;
                return XE.j((YE) abstractC3825rE, num);
            case 6:
                XF xf = WE.f28326a;
                return C2913aF.j((C2967bF) abstractC3825rE, num);
            case 7:
                return C3127eF.j((C3235gF) abstractC3825rE, C3105du.e(32), num);
            case 8:
                C3774qG c3774qG7 = AbstractC3343iF.f31014a;
                return C3289hF.j(((C3395jF) abstractC3825rE).f31221a, C3105du.e(32), num);
            case 9:
                C3021cG c3021cG = C3021cG.f29439b;
                C4151xG c4151xG = ((C2914aG) abstractC3825rE).f29046a;
                QF qf = QF.f27009d;
                C3238gI c3238gI = c4151xG.f34969b;
                XF d2 = qf.d(c3238gI.A());
                if (!((Boolean) qf.f27011b.get(c3238gI.A())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                JK B9 = c3238gI.B();
                d2.getClass();
                C3184fI D8 = C3238gI.D();
                String str = d2.f28508a;
                D8.h();
                ((C3238gI) D8.f27721u).F(str);
                D8.h();
                ((C3238gI) D8.f27721u).G(B9);
                D8.h();
                ((C3238gI) D8.f27721u).I(5);
                C4151xG b9 = C4151xG.b((C3238gI) D8.j());
                C3290hG c3290hG = C3290hG.f30754b;
                C4097wG c4097wG = (C4097wG) c3290hG.f(C3021cG.f29439b.b(c3290hG.g(b9), null));
                C3077dI C8 = C3130eI.C();
                C8.h();
                ((C3130eI) C8.f27721u).E(c4097wG.f34818a);
                C8.h();
                ((C3130eI) C8.f27721u).F(c4097wG.f34820c);
                int i14 = C2921aN.i(c4097wG.f34821d);
                C8.h();
                ((C3130eI) C8.f27721u).H(i14);
                C3130eI c3130eI = (C3130eI) C8.j();
                return new ZF(C4097wG.a(c3130eI.A(), c3130eI.B(), C2921aN.n(c3130eI.G()), C2921aN.p(c3238gI.H()), num));
            case 10:
                GG gg = (GG) abstractC3825rE;
                C3774qG c3774qG8 = FG.f24778a;
                int i15 = gg.f24961a;
                if (i15 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                C4274ze c4274ze3 = new C4274ze(21, false);
                c4274ze3.f35360u = gg;
                c4274ze3.f35361v = C3105du.e(i15);
                c4274ze3.f35362w = num;
                return c4274ze3.u();
            case 11:
                LG lg = (LG) abstractC3825rE;
                C3774qG c3774qG9 = JG.f25662a;
                C4274ze c4274ze4 = new C4274ze(22, false);
                c4274ze4.f35360u = lg;
                c4274ze4.f35361v = C3105du.e(lg.f26087a);
                c4274ze4.f35362w = num;
                return c4274ze4.v();
            case 12:
                ZI zi = (ZI) abstractC3825rE;
                C3774qG c3774qG10 = AbstractC3078dJ.f29739a;
                ECParameterSpec eCParameterSpec = zi.f28867b.f28668b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) WJ.f28344f.f28346a.b("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
                C3481ku c3481ku2 = new C3481ku(i9, z3);
                c3481ku2.f31663u = zi;
                c3481ku2.f31665w = num;
                c3481ku2.f31664v = eCPublicKey.getW();
                C3024cJ x9 = c3481ku2.x();
                S0.c cVar = new S0.c(24);
                cVar.f2775u = x9;
                cVar.f2776v = new C3534lt(9, eCPrivateKey.getS());
                return cVar.v();
            case 13:
                C3131eJ c3131eJ = (C3131eJ) abstractC3825rE;
                C3774qG c3774qG11 = AbstractC3239gJ.f30553a;
                byte[] a9 = AbstractC4205yG.a(32);
                if (a9.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return C3185fJ.j(C3293hJ.j(c3131eJ.f29907a, C3240gK.a(Arrays.copyOf(MA.l(MA.v(a9)), 32)), num), new C3105du(8, C3240gK.a(Arrays.copyOf(a9, a9.length))));
            case 14:
                C3669oJ c3669oJ = (C3669oJ) abstractC3825rE;
                C3774qG c3774qG12 = AbstractC3830rJ.f33550a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) WJ.f28344f.f28346a.b("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(c3669oJ.f32891a, new BigInteger(1, c3669oJ.f32892b.toByteArray())));
                KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair2.getPrivate();
                C4274ze c4274ze5 = new C4274ze(23, false);
                c4274ze5.f35360u = c3669oJ;
                c4274ze5.f35361v = rSAPublicKey.getModulus();
                c4274ze5.f35362w = num;
                C3777qJ w6 = c4274ze5.w();
                C3 c32 = new C3(false);
                c32.f24020n = w6;
                C3534lt c3534lt = new C3534lt(9, rSAPrivateCrtKey.getPrimeP());
                C3534lt c3534lt2 = new C3534lt(9, rSAPrivateCrtKey.getPrimeQ());
                c32.f24022v = c3534lt;
                c32.f24023w = c3534lt2;
                c32.f24021u = new C3534lt(9, rSAPrivateCrtKey.getPrivateExponent());
                C3534lt c3534lt3 = new C3534lt(9, rSAPrivateCrtKey.getPrimeExponentP());
                C3534lt c3534lt4 = new C3534lt(9, rSAPrivateCrtKey.getPrimeExponentQ());
                c32.f24024x = c3534lt3;
                c32.f24025y = c3534lt4;
                c32.f24026z = new C3534lt(9, rSAPrivateCrtKey.getCrtCoefficient());
                return c32.g();
            default:
                C3992uJ c3992uJ = (C3992uJ) abstractC3825rE;
                C3774qG c3774qG13 = AbstractC4154xJ.f34971a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) WJ.f28344f.f28346a.b("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(c3992uJ.f34511a, new BigInteger(1, c3992uJ.f34512b.toByteArray())));
                KeyPair generateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) generateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) generateKeyPair3.getPrivate();
                C3481ku c3481ku3 = new C3481ku(i10, z3);
                c3481ku3.f31663u = c3992uJ;
                c3481ku3.f31664v = rSAPublicKey2.getModulus();
                c3481ku3.f31665w = num;
                C4100wJ y7 = c3481ku3.y();
                C3 c33 = new C3(false);
                c33.f24020n = y7;
                C3534lt c3534lt5 = new C3534lt(9, rSAPrivateCrtKey2.getPrimeP());
                C3534lt c3534lt6 = new C3534lt(9, rSAPrivateCrtKey2.getPrimeQ());
                c33.f24022v = c3534lt5;
                c33.f24023w = c3534lt6;
                c33.f24021u = new C3534lt(9, rSAPrivateCrtKey2.getPrivateExponent());
                C3534lt c3534lt7 = new C3534lt(9, rSAPrivateCrtKey2.getPrimeExponentP());
                C3534lt c3534lt8 = new C3534lt(9, rSAPrivateCrtKey2.getPrimeExponentQ());
                c33.f24024x = c3534lt7;
                c33.f24025y = c3534lt8;
                c33.f24026z = new C3534lt(9, rSAPrivateCrtKey2.getCrtCoefficient());
                return c33.i();
        }
    }
}
