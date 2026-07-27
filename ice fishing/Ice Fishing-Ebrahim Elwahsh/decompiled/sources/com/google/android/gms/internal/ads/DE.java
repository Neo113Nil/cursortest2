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
public final /* synthetic */ class DE implements TF {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DE f24366b = new DE(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DE f24367c = new DE(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ DE f24368d = new DE(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DE f24369e = new DE(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DE f24370f = new DE(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ DE f24371g = new DE(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ DE f24372h = new DE(6);
    public static final /* synthetic */ DE i = new DE(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ DE f24373j = new DE(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ DE f24374k = new DE(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ DE f24375l = new DE(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ DE f24376m = new DE(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ DE f24377n = new DE(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ DE f24378o = new DE(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ DE f24379p = new DE(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ DE f24380q = new DE(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24381a;

    public /* synthetic */ DE(int i4) {
        this.f24381a = i4;
    }

    @Override // com.google.android.gms.internal.ads.TF
    public final XC a(AbstractC4000uE abstractC4000uE, Integer num) {
        int i4 = 19;
        int i9 = 22;
        int i10 = 23;
        boolean z8 = false;
        switch (this.f24381a) {
            case 0:
                IE ie = (IE) abstractC4000uE;
                C4002uG c4002uG = FE.f24931a;
                int i11 = ie.f25539a;
                if (i11 != 16 && i11 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                C2518Df c2518Df = new C2518Df(28);
                c2518Df.f24453u = ie;
                c2518Df.f24456x = num;
                c2518Df.f24454v = Mu.e(i11);
                c2518Df.f24455w = Mu.e(ie.f25540b);
                return c2518Df.y();
            case 1:
                ME me = (ME) abstractC4000uE;
                C4002uG c4002uG2 = KE.f25943a;
                int i12 = me.f26313a;
                if (i12 == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                C4017ue c4017ue = new C4017ue(19, false);
                c4017ue.f34630u = me;
                c4017ue.f34632w = num;
                c4017ue.f34631v = Mu.e(i12);
                return c4017ue.u();
            case 2:
                QE qe = (QE) abstractC4000uE;
                C4002uG c4002uG3 = OE.f26668a;
                int i13 = qe.f27130a;
                if (i13 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                C3602mu c3602mu = new C3602mu(i4, z8);
                c3602mu.f32774u = qe;
                c3602mu.f32776w = num;
                c3602mu.f32775v = Mu.e(i13);
                return c3602mu.w();
            case 3:
                TE te = (TE) abstractC4000uE;
                C4002uG c4002uG4 = SE.f27513a;
                C4017ue c4017ue2 = new C4017ue(20, false);
                c4017ue2.f34630u = te;
                c4017ue2.f34632w = num;
                c4017ue2.f34631v = Mu.e(te.f27728a);
                return c4017ue2.v();
            case 4:
                C4002uG c4002uG5 = VE.f28226a;
                return UE.k(((WE) abstractC4000uE).f28375a, Mu.e(32), num);
            case 5:
                C4002uG c4002uG6 = XE.f28621a;
                return ZE.k((C2920aF) abstractC4000uE, num);
            case 6:
                C2921aG c2921aG = YE.f28813a;
                return C3084dF.k((C3138eF) abstractC4000uE, num);
            case 7:
                return C3302hF.k((C3408jF) abstractC4000uE, Mu.e(32), num);
            case 8:
                C4002uG c4002uG7 = AbstractC3516lF.f32554a;
                return C3462kF.k(((C3570mF) abstractC4000uE).f32675a, Mu.e(32), num);
            case 9:
                C3249gG c3249gG = C3249gG.f30974b;
                CG cg = ((C3139eG) abstractC4000uE).f30340a;
                UF uf = UF.f27953d;
                C3573mI c3573mI = cg.f24159b;
                C2921aG d2 = uf.d(c3573mI.A());
                if (!((Boolean) uf.f27955b.get(c3573mI.A())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                SK B8 = c3573mI.B();
                d2.getClass();
                C3519lI E8 = C3573mI.E();
                E8.m(d2.f29189a);
                E8.n(B8);
                E8.o(EI.RAW);
                C3573mI c3573mI2 = (C3573mI) E8.j();
                CG cg2 = new CG(c3573mI2, IG.b(c3573mI2.A()));
                C3517lG c3517lG = C3517lG.f32558b;
                BG bg = (BG) c3517lG.f(C3249gG.f30974b.b(c3517lG.g(cg2), null));
                C3411jI D8 = C3465kI.D();
                D8.h();
                ((C3465kI) D8.f30000u).F(bg.f24012a);
                D8.h();
                ((C3465kI) D8.f30000u).G(bg.f24014c);
                D8.h();
                ((C3465kI) D8.f30000u).H(bg.f24015d);
                C3465kI c3465kI = (C3465kI) D8.j();
                return new C3085dG(BG.a(c3465kI.A(), c3465kI.B(), c3465kI.C(), c3573mI.C(), num));
            case 10:
                LG lg = (LG) abstractC4000uE;
                C4002uG c4002uG8 = KG.f25949a;
                int i14 = lg.f26132a;
                if (i14 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                C4017ue c4017ue3 = new C4017ue(21, false);
                c4017ue3.f34630u = lg;
                c4017ue3.f34631v = Mu.e(i14);
                c4017ue3.f34632w = num;
                return c4017ue3.w();
            case 11:
                RG rg = (RG) abstractC4000uE;
                C4002uG c4002uG9 = OG.f26677a;
                C4017ue c4017ue4 = new C4017ue(22, false);
                c4017ue4.f34630u = rg;
                c4017ue4.f34631v = Mu.e(rg.f27327a);
                c4017ue4.f34632w = num;
                return c4017ue4.y();
            case 12:
                C3306hJ c3306hJ = (C3306hJ) abstractC4000uE;
                C4002uG c4002uG10 = AbstractC3466kJ.f32287a;
                ECParameterSpec eCParameterSpec = c3306hJ.f31223b.f30980b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C3253gK.f30985f.f30987a.d("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
                C3602mu c3602mu2 = new C3602mu(i9, z8);
                c3602mu2.f32774u = c3306hJ;
                c3602mu2.f32776w = num;
                c3602mu2.f32775v = eCPublicKey.getW();
                C3412jJ y6 = c3602mu2.y();
                C4164xG c4164xG = new C4164xG(2);
                c4164xG.f35132u = y6;
                c4164xG.f35133v = new Mt(8, eCPrivateKey.getS());
                return c4164xG.R();
            case 13:
                C3574mJ c3574mJ = (C3574mJ) abstractC4000uE;
                C4002uG c4002uG11 = AbstractC3682oJ.f33124a;
                byte[] a9 = DG.a(32);
                if (a9.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return C3628nJ.k(C3736pJ.k(c3574mJ.f32677a, C3791qK.a(Arrays.copyOf(AbstractC2655Lg.m(AbstractC2655Lg.p(a9)), 32)), num), new Mu(7, C3791qK.a(Arrays.copyOf(a9, a9.length))));
            case 14:
                C4113wJ c4113wJ = (C4113wJ) abstractC4000uE;
                C4002uG c4002uG12 = AJ.f23845a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) C3253gK.f30985f.f30987a.d("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(c4113wJ.f34970a, new BigInteger(1, c4113wJ.f34971b.toByteArray())));
                KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair2.getPrivate();
                C4017ue c4017ue5 = new C4017ue(23, false);
                c4017ue5.f34630u = c4113wJ;
                c4017ue5.f34631v = rSAPublicKey.getModulus();
                c4017ue5.f34632w = num;
                C4221yJ z9 = c4017ue5.z();
                A3 a32 = new A3(false);
                a32.f23807n = z9;
                Mt mt = new Mt(8, rSAPrivateCrtKey.getPrimeP());
                Mt mt2 = new Mt(8, rSAPrivateCrtKey.getPrimeQ());
                a32.f23809v = mt;
                a32.f23810w = mt2;
                a32.f23808u = new Mt(8, rSAPrivateCrtKey.getPrivateExponent());
                Mt mt3 = new Mt(8, rSAPrivateCrtKey.getPrimeExponentP());
                Mt mt4 = new Mt(8, rSAPrivateCrtKey.getPrimeExponentQ());
                a32.f23811x = mt3;
                a32.f23812y = mt4;
                a32.f23813z = new Mt(8, rSAPrivateCrtKey.getCrtCoefficient());
                return a32.h();
            default:
                EJ ej = (EJ) abstractC4000uE;
                C4002uG c4002uG13 = HJ.f25344a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) C3253gK.f30985f.f30987a.d("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(ej.f24694a, new BigInteger(1, ej.f24695b.toByteArray())));
                KeyPair generateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) generateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) generateKeyPair3.getPrivate();
                C3602mu c3602mu3 = new C3602mu(i10, z8);
                c3602mu3.f32774u = ej;
                c3602mu3.f32775v = rSAPublicKey2.getModulus();
                c3602mu3.f32776w = num;
                GJ z10 = c3602mu3.z();
                A3 a33 = new A3(false);
                a33.f23807n = z10;
                Mt mt5 = new Mt(8, rSAPrivateCrtKey2.getPrimeP());
                Mt mt6 = new Mt(8, rSAPrivateCrtKey2.getPrimeQ());
                a33.f23809v = mt5;
                a33.f23810w = mt6;
                a33.f23808u = new Mt(8, rSAPrivateCrtKey2.getPrivateExponent());
                Mt mt7 = new Mt(8, rSAPrivateCrtKey2.getPrimeExponentP());
                Mt mt8 = new Mt(8, rSAPrivateCrtKey2.getPrimeExponentQ());
                a33.f23811x = mt7;
                a33.f23812y = mt8;
                a33.f23813z = new Mt(8, rSAPrivateCrtKey2.getCrtCoefficient());
                return a33.i();
        }
    }
}
