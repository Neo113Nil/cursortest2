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
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.ads.zJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4275zJ implements InterfaceC4056vG, InterfaceC3679oG, YF, WF, InterfaceC3787qG, InterfaceC3361iK {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35527n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35521u = new C4275zJ(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35522v = new C4275zJ(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35523w = new C4275zJ(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35524x = new C4275zJ(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35525y = new C4275zJ(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35526z = new C4275zJ(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35500A = new C4275zJ(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35501B = new C4275zJ(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35502C = new C4275zJ(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35503D = new C4275zJ(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35504E = new C4275zJ(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35505F = new C4275zJ(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35506G = new C4275zJ(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35507H = new C4275zJ(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35508I = new C4275zJ(14);
    public static final /* synthetic */ C4275zJ J = new C4275zJ(15);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35509K = new C4275zJ(16);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35510L = new C4275zJ(17);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35511M = new C4275zJ(18);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35512N = new C4275zJ(19);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35513O = new C4275zJ(20);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35514P = new C4275zJ(21);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35515Q = new C4275zJ(22);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35516R = new C4275zJ(23);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35517S = new C4275zJ(24);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35518T = new C4275zJ(25);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35519U = new C4275zJ(26);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ C4275zJ f35520V = new C4275zJ(27);

    public /* synthetic */ C4275zJ(int i) {
        this.f35527n = i;
    }

    private final XC f(BG bg) {
        boolean z8 = false;
        C3733pG c3733pG = RJ.f27331a;
        String str = bg.f24012a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
        }
        try {
            SK sk = bg.f24014c;
            YK yk = YK.f28820a;
            int i = KK.f25952a;
            LI I2 = LI.I(sk, YK.f28821b);
            if (I2.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            NI B8 = I2.B();
            if (B8.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, B8.C().a());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, B8.D().a());
            BigInteger bigInteger3 = C4113wJ.f34969e;
            C3951tJ c3951tJ = new C3951tJ();
            c3951tJ.f34394c = (C4005uJ) RJ.f27338h.b(B8.B().A());
            c3951tJ.f34393b = bigInteger2;
            c3951tJ.a(bitLength);
            c3951tJ.f34395d = (C4059vJ) RJ.f27337g.b(bg.f24016e);
            C4113wJ b9 = c3951tJ.b();
            C4017ue c4017ue = new C4017ue(23, false);
            c4017ue.f34630u = b9;
            c4017ue.f34631v = bigInteger;
            c4017ue.f34632w = bg.f24017f;
            C4221yJ z9 = c4017ue.z();
            A3 a32 = new A3(z8);
            a32.f23807n = z9;
            Mt b10 = RJ.b(I2.D());
            Mt b11 = RJ.b(I2.E());
            a32.f23809v = b10;
            a32.f23810w = b11;
            a32.f23808u = RJ.b(I2.C());
            Mt b12 = RJ.b(I2.F());
            Mt b13 = RJ.b(I2.G());
            a32.f23811x = b12;
            a32.f23812y = b13;
            a32.f23813z = RJ.b(I2.H());
            return a32.h();
        } catch (C3845rL | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private final XC g(BG bg) {
        C3733pG c3733pG = UJ.f27956a;
        String str = bg.f24012a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
        }
        try {
            SK sk = bg.f24014c;
            YK yk = YK.f28820a;
            int i = KK.f25952a;
            VI E8 = VI.E(sk, YK.f28821b);
            if (E8.A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, E8.C().a());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = EJ.f24693g;
            BJ bj = new BJ();
            C4237yi c4237yi = UJ.f27963h;
            bj.f24022c = (CJ) c4237yi.b(E8.B().A());
            bj.f24023d = (CJ) c4237yi.b(E8.B().B());
            bj.f24021b = new BigInteger(1, E8.D().a());
            bj.a(bitLength);
            bj.b(E8.B().C());
            bj.f24025f = (DJ) UJ.f27962g.b(bg.f24016e);
            EJ c4 = bj.c();
            C3602mu c3602mu = new C3602mu(23, false);
            c3602mu.f32774u = c4;
            c3602mu.f32775v = bigInteger;
            c3602mu.f32776w = bg.f24017f;
            return c3602mu.z();
        } catch (C3845rL | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    @Override // com.google.android.gms.internal.ads.WF
    public XC a(BG bg) {
        int i = 22;
        int i4 = 23;
        boolean z8 = false;
        switch (this.f35527n) {
            case 6:
                C3733pG c3733pG = LJ.f26135a;
                String str = bg.f24012a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    SK sk = bg.f24014c;
                    YK yk = YK.f28820a;
                    int i9 = KK.f25952a;
                    WH E8 = WH.E(sk, YK.f28821b);
                    if (E8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    PE pe = new PE(3);
                    pe.f26884d = LJ.b(E8.B().A());
                    pe.f26882b = LJ.h(E8.B().F());
                    pe.f26883c = LJ.g(E8.B().E());
                    pe.f26885e = LJ.c(bg.f24016e);
                    C3306hJ k6 = pe.k();
                    C3602mu c3602mu = new C3602mu(i, z8);
                    c3602mu.f32774u = k6;
                    c3602mu.f32775v = new ECPoint(new BigInteger(1, E8.C().a()), new BigInteger(1, E8.D().a()));
                    c3602mu.f32776w = bg.f24017f;
                    return c3602mu.y();
                } catch (C3845rL | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 8:
                C3733pG c3733pG2 = LJ.f26135a;
                String str2 = bg.f24012a;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    SK sk2 = bg.f24014c;
                    YK yk2 = YK.f28820a;
                    int i10 = KK.f25952a;
                    UH D8 = UH.D(sk2, YK.f28821b);
                    if (D8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    WH B8 = D8.B();
                    if (B8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    PE pe2 = new PE(3);
                    pe2.f26884d = LJ.b(B8.B().A());
                    pe2.f26882b = LJ.h(B8.B().F());
                    pe2.f26883c = LJ.g(B8.B().E());
                    pe2.f26885e = LJ.c(bg.f24016e);
                    C3306hJ k9 = pe2.k();
                    C3602mu c3602mu2 = new C3602mu(i, z8);
                    c3602mu2.f32774u = k9;
                    c3602mu2.f32775v = new ECPoint(new BigInteger(1, B8.C().a()), new BigInteger(1, B8.D().a()));
                    c3602mu2.f32776w = bg.f24017f;
                    C3412jJ y6 = c3602mu2.y();
                    C4164xG c4164xG = new C4164xG(2);
                    c4164xG.f35132u = y6;
                    c4164xG.f35133v = new Mt(8, new BigInteger(1, D8.C().a()));
                    return c4164xG.R();
                } catch (C3845rL | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 12:
                C3733pG c3733pG3 = NJ.f26511a;
                String str3 = bg.f24012a;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str3)));
                }
                try {
                    SK sk3 = bg.f24014c;
                    YK yk3 = YK.f28820a;
                    int i11 = KK.f25952a;
                    C2978bI C7 = C2978bI.C(sk3, YK.f28821b);
                    if (C7.A() == 0) {
                        return C3736pJ.k((C3520lJ) NJ.f26517g.b(bg.f24016e), C3791qK.a(C7.B().a()), bg.f24017f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C3845rL unused3) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 14:
                C3733pG c3733pG4 = NJ.f26511a;
                String str4 = bg.f24012a;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str4)));
                }
                try {
                    SK sk4 = bg.f24014c;
                    YK yk4 = YK.f28820a;
                    int i12 = KK.f25952a;
                    ZH D9 = ZH.D(sk4, YK.f28821b);
                    if (D9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2978bI C8 = D9.C();
                    if (C8.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return C3628nJ.k(C3736pJ.k((C3520lJ) NJ.f26517g.b(bg.f24016e), C3791qK.a(C8.B().a()), bg.f24017f), new Mu(7, C3791qK.a(D9.B().a())));
                } catch (C3845rL unused4) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 18:
                C3733pG c3733pG5 = RJ.f27331a;
                String str5 = bg.f24012a;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str5)));
                }
                try {
                    SK sk5 = bg.f24014c;
                    YK yk5 = YK.f28820a;
                    int i13 = KK.f25952a;
                    NI E9 = NI.E(sk5, YK.f28821b);
                    if (E9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, E9.C().a());
                    int bitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = C4113wJ.f34969e;
                    C3951tJ c3951tJ = new C3951tJ();
                    c3951tJ.f34394c = (C4005uJ) RJ.f27338h.b(E9.B().A());
                    c3951tJ.f34393b = new BigInteger(1, E9.D().a());
                    c3951tJ.a(bitLength);
                    c3951tJ.f34395d = (C4059vJ) RJ.f27337g.b(bg.f24016e);
                    C4113wJ b9 = c3951tJ.b();
                    C4017ue c4017ue = new C4017ue(23, false);
                    c4017ue.f34630u = b9;
                    c4017ue.f34631v = bigInteger;
                    c4017ue.f34632w = bg.f24017f;
                    return c4017ue.z();
                } catch (C3845rL | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 20:
                return f(bg);
            case 24:
                return g(bg);
            default:
                C3733pG c3733pG6 = UJ.f27956a;
                String str6 = bg.f24012a;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str6)));
                }
                try {
                    SK sk6 = bg.f24014c;
                    YK yk6 = YK.f28820a;
                    int i14 = KK.f25952a;
                    TI I2 = TI.I(sk6, YK.f28821b);
                    if (I2.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    VI B9 = I2.B();
                    if (B9.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, B9.C().a());
                    int bitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, B9.D().a());
                    BigInteger bigInteger5 = EJ.f24693g;
                    BJ bj = new BJ();
                    C4237yi c4237yi = UJ.f27963h;
                    bj.f24022c = (CJ) c4237yi.b(B9.B().A());
                    bj.f24023d = (CJ) c4237yi.b(B9.B().B());
                    bj.f24021b = bigInteger4;
                    bj.a(bitLength2);
                    bj.b(B9.B().C());
                    bj.f24025f = (DJ) UJ.f27962g.b(bg.f24016e);
                    EJ c4 = bj.c();
                    C3602mu c3602mu3 = new C3602mu(i4, z8);
                    c3602mu3.f32774u = c4;
                    c3602mu3.f32775v = bigInteger3;
                    c3602mu3.f32776w = bg.f24017f;
                    GJ z9 = c3602mu3.z();
                    A3 a32 = new A3(z8);
                    a32.f23807n = z9;
                    Mt c9 = UJ.c(I2.D());
                    Mt c10 = UJ.c(I2.E());
                    a32.f23809v = c9;
                    a32.f23810w = c10;
                    a32.f23808u = UJ.c(I2.C());
                    Mt c11 = UJ.c(I2.F());
                    Mt c12 = UJ.c(I2.G());
                    a32.f23811x = c11;
                    a32.f23812y = c12;
                    a32.f23813z = UJ.c(I2.H());
                    return a32.i();
                } catch (C3845rL | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3679oG
    public AbstractC4000uE b(CG cg) {
        switch (this.f35527n) {
            case 4:
                C3733pG c3733pG = LJ.f26135a;
                C3573mI c3573mI = cg.f24159b;
                if (!c3573mI.A().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI.A())));
                }
                try {
                    SK B8 = c3573mI.B();
                    YK yk = YK.f28820a;
                    int i = KK.f25952a;
                    QH B9 = QH.B(B8, YK.f28821b);
                    PE pe = new PE(3);
                    pe.f26884d = LJ.b(B9.A().A());
                    pe.f26882b = LJ.h(B9.A().F());
                    pe.f26883c = LJ.g(B9.A().E());
                    pe.f26885e = LJ.c(c3573mI.C());
                    return pe.k();
                } catch (C3845rL e6) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e6);
                }
            case 10:
                C3733pG c3733pG2 = NJ.f26511a;
                C3573mI c3573mI2 = cg.f24159b;
                if (!c3573mI2.A().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI2.A())));
                }
                try {
                    SK B10 = c3573mI2.B();
                    YK yk2 = YK.f28820a;
                    int i4 = KK.f25952a;
                    if (XH.B(B10, YK.f28821b).A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return new C3574mJ((C3520lJ) NJ.f26517g.b(c3573mI2.C()));
                } catch (C3845rL e9) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e9);
                }
            case 16:
                C3733pG c3733pG3 = RJ.f27331a;
                C3573mI c3573mI3 = cg.f24159b;
                if (!c3573mI3.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI3.A())));
                }
                try {
                    SK B11 = c3573mI3.B();
                    YK yk3 = YK.f28820a;
                    int i9 = KK.f25952a;
                    HI D8 = HI.D(B11, YK.f28821b);
                    BigInteger bigInteger = C4113wJ.f34969e;
                    C3951tJ c3951tJ = new C3951tJ();
                    c3951tJ.f34394c = (C4005uJ) RJ.f27338h.b(D8.A().A());
                    c3951tJ.f34393b = new BigInteger(1, D8.C().a());
                    c3951tJ.a(D8.B());
                    c3951tJ.f34395d = (C4059vJ) RJ.f27337g.b(c3573mI3.C());
                    return c3951tJ.b();
                } catch (C3845rL e10) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
                }
            default:
                C3733pG c3733pG4 = UJ.f27956a;
                C3573mI c3573mI4 = cg.f24159b;
                if (!c3573mI4.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(c3573mI4.A())));
                }
                try {
                    SK B12 = c3573mI4.B();
                    YK yk4 = YK.f28820a;
                    int i10 = KK.f25952a;
                    PI D9 = PI.D(B12, YK.f28821b);
                    BigInteger bigInteger2 = EJ.f24693g;
                    BJ bj = new BJ();
                    EnumC3032cI A8 = D9.A().A();
                    C4237yi c4237yi = UJ.f27963h;
                    bj.f24022c = (CJ) c4237yi.b(A8);
                    bj.f24023d = (CJ) c4237yi.b(D9.A().B());
                    bj.f24021b = new BigInteger(1, D9.C().a());
                    bj.a(D9.B());
                    bj.b(D9.A().C());
                    bj.f24025f = (DJ) UJ.f27962g.b(c3573mI4.C());
                    return bj.c();
                } catch (C3845rL e11) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4056vG
    public BG c(XC xc) {
        switch (this.f35527n) {
            case 5:
                C3412jJ c3412jJ = (C3412jJ) xc;
                return BG.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", LJ.f(c3412jJ).a(), 4, LJ.a(c3412jJ.f32098b.f31225d), c3412jJ.f32101e);
            case 7:
                C3360iJ c3360iJ = (C3360iJ) xc;
                C3733pG c3733pG = LJ.f26135a;
                int d2 = LJ.d(c3360iJ.f31329b.f32098b.f31223b);
                TH E8 = UH.E();
                C3412jJ c3412jJ2 = c3360iJ.f31329b;
                WH f6 = LJ.f(c3412jJ2);
                E8.h();
                ((UH) E8.f30000u).G(f6);
                byte[] i = AbstractC4161xD.i((BigInteger) c3360iJ.f31330c.f26393u, d2);
                QK qk = SK.f27529u;
                QK s3 = SK.s(i, 0, i.length);
                E8.h();
                ((UH) E8.f30000u).H(s3);
                return BG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((UH) E8.j()).a(), 3, LJ.a(c3412jJ2.f32098b.f31225d), c3412jJ2.f32101e);
            case 11:
                C3736pJ c3736pJ = (C3736pJ) xc;
                return BG.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", NJ.a(c3736pJ).a(), 4, (EI) NJ.f26517g.a(c3736pJ.f33376b.f32677a), c3736pJ.f33379e);
            case 13:
                C3628nJ c3628nJ = (C3628nJ) xc;
                C3733pG c3733pG2 = NJ.f26511a;
                YH E9 = ZH.E();
                C2978bI a9 = NJ.a(c3628nJ.f32847b);
                E9.h();
                ((ZH) E9.f30000u).H(a9);
                byte[] b9 = ((C3791qK) c3628nJ.f32848c.f26395u).b();
                QK s6 = SK.s(b9, 0, b9.length);
                E9.h();
                ((ZH) E9.f30000u).G(s6);
                QK a10 = ((ZH) E9.j()).a();
                C3736pJ c3736pJ2 = c3628nJ.f32847b;
                return BG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", a10, 3, (EI) NJ.f26517g.a(c3736pJ2.f33376b.f32677a), c3736pJ2.f33379e);
            case 17:
                C4221yJ c4221yJ = (C4221yJ) xc;
                return BG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", RJ.a(c4221yJ).a(), 4, (EI) RJ.f27337g.a(c4221yJ.f35337b.f34972c), c4221yJ.f35340e);
            case 19:
                C4167xJ c4167xJ = (C4167xJ) xc;
                C3733pG c3733pG3 = RJ.f27331a;
                KI J8 = LI.J();
                J8.h();
                ((LI) J8.f30000u).L();
                NI a11 = RJ.a(c4167xJ.f35134b);
                J8.h();
                ((LI) J8.f30000u).M(a11);
                byte[] f9 = AbstractC4161xD.f((BigInteger) c4167xJ.f35135c.f26393u);
                QK qk2 = SK.f27529u;
                QK s9 = SK.s(f9, 0, f9.length);
                J8.h();
                ((LI) J8.f30000u).N(s9);
                byte[] f10 = AbstractC4161xD.f((BigInteger) c4167xJ.f35136d.f26393u);
                QK s10 = SK.s(f10, 0, f10.length);
                J8.h();
                ((LI) J8.f30000u).O(s10);
                byte[] f11 = AbstractC4161xD.f((BigInteger) c4167xJ.f35137e.f26393u);
                QK s11 = SK.s(f11, 0, f11.length);
                J8.h();
                ((LI) J8.f30000u).P(s11);
                byte[] f12 = AbstractC4161xD.f((BigInteger) c4167xJ.f35138f.f26393u);
                QK s12 = SK.s(f12, 0, f12.length);
                J8.h();
                ((LI) J8.f30000u).Q(s12);
                byte[] f13 = AbstractC4161xD.f((BigInteger) c4167xJ.f35139g.f26393u);
                QK s13 = SK.s(f13, 0, f13.length);
                J8.h();
                ((LI) J8.f30000u).R(s13);
                byte[] f14 = AbstractC4161xD.f((BigInteger) c4167xJ.f35140h.f26393u);
                QK s14 = SK.s(f14, 0, f14.length);
                J8.h();
                ((LI) J8.f30000u).S(s14);
                QK a12 = ((LI) J8.j()).a();
                C4221yJ c4221yJ2 = c4167xJ.f35134b;
                return BG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", a12, 3, (EI) RJ.f27337g.a(c4221yJ2.f35337b.f34972c), c4221yJ2.f35340e);
            case 23:
                GJ gj = (GJ) xc;
                return BG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", UJ.b(gj).a(), 4, (EI) UJ.f27962g.a(gj.f25135b.f24696c), gj.f25138e);
            default:
                FJ fj = (FJ) xc;
                C3733pG c3733pG4 = UJ.f27956a;
                SI J9 = TI.J();
                J9.h();
                ((TI) J9.f30000u).L();
                VI b10 = UJ.b(fj.f24941b);
                J9.h();
                ((TI) J9.f30000u).M(b10);
                byte[] f15 = AbstractC4161xD.f((BigInteger) fj.f24942c.f26393u);
                QK qk3 = SK.f27529u;
                QK s15 = SK.s(f15, 0, f15.length);
                J9.h();
                ((TI) J9.f30000u).N(s15);
                byte[] f16 = AbstractC4161xD.f((BigInteger) fj.f24943d.f26393u);
                QK s16 = SK.s(f16, 0, f16.length);
                J9.h();
                ((TI) J9.f30000u).O(s16);
                byte[] f17 = AbstractC4161xD.f((BigInteger) fj.f24944e.f26393u);
                QK s17 = SK.s(f17, 0, f17.length);
                J9.h();
                ((TI) J9.f30000u).P(s17);
                byte[] f18 = AbstractC4161xD.f((BigInteger) fj.f24945f.f26393u);
                QK s18 = SK.s(f18, 0, f18.length);
                J9.h();
                ((TI) J9.f30000u).Q(s18);
                byte[] f19 = AbstractC4161xD.f((BigInteger) fj.f24946g.f26393u);
                QK s19 = SK.s(f19, 0, f19.length);
                J9.h();
                ((TI) J9.f30000u).R(s19);
                byte[] f20 = AbstractC4161xD.f((BigInteger) fj.f24947h.f26393u);
                QK s20 = SK.s(f20, 0, f20.length);
                J9.h();
                ((TI) J9.f30000u).S(s20);
                QK a13 = ((TI) J9.j()).a();
                GJ gj2 = fj.f24941b;
                return BG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", a13, 3, (EI) UJ.f27962g.a(gj2.f25135b.f24696c), gj2.f25138e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3361iK
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        switch (this.f35527n) {
            case 28:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3787qG
    public CG e(AbstractC4000uE abstractC4000uE) {
        switch (this.f35527n) {
            case 9:
                C3306hJ c3306hJ = (C3306hJ) abstractC4000uE;
                C3733pG c3733pG = LJ.f26135a;
                C3519lI E8 = C3573mI.E();
                E8.m("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                PH C7 = QH.C();
                SH e6 = LJ.e(c3306hJ);
                C7.h();
                ((QH) C7.f30000u).D(e6);
                E8.n(((QH) C7.j()).a());
                E8.o(LJ.a(c3306hJ.f31225d));
                return CG.a((C3573mI) E8.j());
            case 15:
                C3733pG c3733pG2 = NJ.f26511a;
                C3519lI E9 = C3573mI.E();
                E9.m("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                E9.n(XH.C().a());
                E9.o((EI) NJ.f26517g.a(((C3574mJ) abstractC4000uE).f32677a));
                return CG.a((C3573mI) E9.j());
            case 21:
                C4113wJ c4113wJ = (C4113wJ) abstractC4000uE;
                C3733pG c3733pG3 = RJ.f27331a;
                C3519lI E10 = C3573mI.E();
                E10.m("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                GI E11 = HI.E();
                II B8 = JI.B();
                EnumC3032cI enumC3032cI = (EnumC3032cI) RJ.f27338h.a(c4113wJ.f34973d);
                B8.h();
                ((JI) B8.f30000u).D(enumC3032cI);
                JI ji = (JI) B8.j();
                E11.h();
                ((HI) E11.f30000u).F(ji);
                E11.h();
                ((HI) E11.f30000u).G(c4113wJ.f34970a);
                byte[] f6 = AbstractC4161xD.f(c4113wJ.f34971b);
                QK qk = SK.f27529u;
                QK s3 = SK.s(f6, 0, f6.length);
                E11.h();
                ((HI) E11.f30000u).H(s3);
                E10.n(((HI) E11.j()).a());
                E10.o((EI) RJ.f27337g.a(c4113wJ.f34972c));
                return CG.a((C3573mI) E10.j());
            default:
                EJ ej = (EJ) abstractC4000uE;
                C3733pG c3733pG4 = UJ.f27956a;
                C3519lI E12 = C3573mI.E();
                E12.m("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                OI E13 = PI.E();
                RI a9 = UJ.a(ej);
                E13.h();
                ((PI) E13.f30000u).F(a9);
                E13.h();
                ((PI) E13.f30000u).G(ej.f24694a);
                byte[] f9 = AbstractC4161xD.f(ej.f24695b);
                QK qk2 = SK.f27529u;
                QK s6 = SK.s(f9, 0, f9.length);
                E13.h();
                ((PI) E13.f30000u).H(s6);
                E12.n(((PI) E13.j()).a());
                E12.o((EI) UJ.f27962g.a(ej.f24696c));
                return CG.a((C3573mI) E12.j());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4056vG
    public Object c(XC xc) {
        KeyFactory keyFactory;
        InterfaceC4108wE b9;
        switch (this.f35527n) {
            case 0:
                C4167xJ c4167xJ = (C4167xJ) xc;
                int i = IG.f25546a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
                }
                Provider e6 = AbstractC2720Pd.e();
                if (e6 != null) {
                    keyFactory = KeyFactory.getInstance("RSA", e6);
                } else {
                    keyFactory = (KeyFactory) C3253gK.f30986g.f30987a.d("RSA");
                }
                C4221yJ c4221yJ = c4167xJ.f35134b;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c4221yJ.f35338c, c4221yJ.f35337b.f34971b, (BigInteger) c4167xJ.f35135c.f26393u, (BigInteger) c4167xJ.f35136d.f26393u, (BigInteger) c4167xJ.f35137e.f26393u, (BigInteger) c4167xJ.f35138f.f26393u, (BigInteger) c4167xJ.f35139g.f26393u, (BigInteger) c4167xJ.f35140h.f26393u));
                C4221yJ c4221yJ2 = c4167xJ.f35134b;
                if (e6 != null) {
                    b9 = TJ.c(c4221yJ2, e6);
                } else {
                    b9 = AbstractC3629nK.b(c4221yJ2);
                }
                SJ sj = new SJ(rSAPrivateCrtKey, c4221yJ2.f35337b.f34973d, c4221yJ2.f35339d.b(), c4221yJ2.f35337b.f34972c.equals(C4059vJ.f34750d) ? SJ.f27522h : SJ.f27521g, b9, e6);
                byte[] bArr = SJ.i;
                Provider provider = sj.f27528f;
                String str = sj.f27524b;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) C3253gK.f30983d.f30987a.d(str);
                signature.initSign(sj.f27523a);
                signature.update(bArr);
                byte[] bArr2 = sj.f27526d;
                if (bArr2.length > 0) {
                    signature.update(bArr2);
                }
                byte[] sign = signature.sign();
                byte[] bArr3 = sj.f27525c;
                if (bArr3.length > 0) {
                    sign = XC.f(bArr3, sign);
                }
                try {
                    sj.f27527e.a(sign, bArr);
                    return sj;
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException("RSA signature computation error", e9);
                }
            case 1:
                return AbstractC3629nK.b((C4221yJ) xc);
            case 2:
                FJ fj = (FJ) xc;
                try {
                    return OJ.b(fj);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory2 = (KeyFactory) C3253gK.f30986g.f30987a.d("RSA");
                    BigInteger bigInteger = fj.f24941b.f25136c;
                    GJ gj = fj.f24941b;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, gj.f25135b.f24695b, (BigInteger) fj.f24942c.f26393u, (BigInteger) fj.f24943d.f26393u, (BigInteger) fj.f24944e.f26393u, (BigInteger) fj.f24945f.f26393u, (BigInteger) fj.f24946g.f26393u, (BigInteger) fj.f24947h.f26393u));
                    C4237yi c4237yi = AbstractC3737pK.f33380a;
                    EJ ej = gj.f25135b;
                    EnumC3413jK enumC3413jK = (EnumC3413jK) c4237yi.a(ej.f24697d);
                    EnumC3413jK enumC3413jK2 = (EnumC3413jK) c4237yi.a(ej.f24698e);
                    gj.f25137d.b();
                    OJ oj = new OJ();
                    if (!JF.a()) {
                        AbstractC3137eE.f(enumC3413jK);
                        if (enumC3413jK.equals(enumC3413jK2)) {
                            AbstractC3137eE.i(rSAPrivateCrtKey2.getModulus().bitLength());
                            AbstractC3137eE.k(rSAPrivateCrtKey2.getPublicExponent());
                            return oj;
                        }
                        throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                    }
                    throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                }
            default:
                GJ gj2 = (GJ) xc;
                C4237yi c4237yi2 = AbstractC3737pK.f33380a;
                try {
                    return VJ.d(gj2);
                } catch (NoSuchProviderException unused2) {
                    KeyFactory keyFactory3 = (KeyFactory) C3253gK.f30986g.f30987a.d("RSA");
                    BigInteger bigInteger2 = gj2.f25136c;
                    EJ ej2 = gj2.f25135b;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory3.generatePublic(new RSAPublicKeySpec(bigInteger2, ej2.f24695b));
                    C4237yi c4237yi3 = AbstractC3737pK.f33380a;
                    return new C3683oK(rSAPublicKey, (EnumC3413jK) c4237yi3.a(ej2.f24697d), (EnumC3413jK) c4237yi3.a(ej2.f24698e), ej2.f24699f, gj2.f25137d.b(), ej2.f24696c.equals(DJ.f24414d) ? AbstractC3737pK.f33382c : AbstractC3737pK.f33381b);
                }
        }
    }
}
