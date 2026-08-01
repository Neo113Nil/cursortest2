package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4208yJ {
    static {
        int i = C4207yI.zza;
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() {
        C3399jJ c3399jJ = C3399jJ.f31224a;
        C3236gG c3236gG = C3236gG.f30551b;
        c3236gG.b(C3399jJ.f31224a);
        c3236gG.a(C3399jJ.f31225b);
        c3236gG.b(C3507lJ.f31756a);
        c3236gG.a(C3507lJ.f31757b);
        int i = AbstractC3078dJ.f29744f;
        if (!WC.c(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        C3504lG c3504lG = BJ.f23871a;
        C3290hG c3290hG = C3290hG.f30754b;
        c3290hG.c(BJ.f23871a);
        c3290hG.d(BJ.f23872b);
        c3290hG.a(BJ.f23873c);
        c3290hG.b(BJ.f23874d);
        c3290hG.a(BJ.f23875e);
        c3290hG.b(BJ.f23876f);
        C3182fG c3182fG = C3182fG.f30239b;
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", AbstractC3347iJ.f31019a);
        hashMap.put("ECDSA_P256_IEEE_P1363", AbstractC3347iJ.f31022d);
        ME me = new ME(3);
        me.f26272d = C3556mE.f31919G;
        me.f26271c = YI.f28664c;
        me.f26270b = C3879sE.f33921p;
        me.f26273e = C3933tE.f34250y;
        hashMap.put("ECDSA_P256_RAW", me.k());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", AbstractC3347iJ.f31024f);
        hashMap.put("ECDSA_P384", AbstractC3347iJ.f31020b);
        hashMap.put("ECDSA_P384_IEEE_P1363", AbstractC3347iJ.f31023e);
        ME me2 = new ME(3);
        me2.f26272d = C3556mE.f31921I;
        YI yi = YI.f28665d;
        me2.f26271c = yi;
        C3879sE c3879sE = C3879sE.f33922q;
        me2.f26270b = c3879sE;
        C3933tE c3933tE = C3933tE.f34247v;
        me2.f26273e = c3933tE;
        hashMap.put("ECDSA_P384_SHA512", me2.k());
        ME me3 = new ME(3);
        me3.f26272d = C3556mE.f31920H;
        me3.f26271c = yi;
        me3.f26270b = c3879sE;
        me3.f26273e = c3933tE;
        hashMap.put("ECDSA_P384_SHA384", me3.k());
        hashMap.put("ECDSA_P521", AbstractC3347iJ.f31021c);
        hashMap.put("ECDSA_P521_IEEE_P1363", AbstractC3347iJ.f31025g);
        c3182fG.b(Collections.unmodifiableMap(hashMap));
        c3236gG.a(AbstractC3078dJ.f29739a);
        c3236gG.a(AbstractC3078dJ.f29740b);
        C3021cG c3021cG = C3021cG.f29439b;
        c3021cG.a(AbstractC3078dJ.f29743e, ZI.class);
        QF qf = QF.f27009d;
        qf.c(AbstractC3078dJ.f29741c, i, true);
        qf.c(AbstractC3078dJ.f29742d, i, false);
        int i6 = AbstractC3830rJ.f33555f;
        if (!WC.c(i6)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3290hG.c(HJ.f25251a);
        c3290hG.d(HJ.f25252b);
        c3290hG.a(HJ.f25253c);
        c3290hG.b(HJ.f25254d);
        c3290hG.a(HJ.f25255e);
        c3290hG.b(HJ.f25256f);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", AbstractC3347iJ.f31026h);
        BigInteger bigInteger = C3669oJ.f32890e;
        C3561mJ c3561mJ = new C3561mJ();
        c3561mJ.f31940c = C3615nJ.f32716b;
        c3561mJ.a(3072);
        BigInteger bigInteger2 = C3669oJ.f32890e;
        c3561mJ.f31939b = bigInteger2;
        C3556mE c3556mE = C3556mE.f31924M;
        c3561mJ.f31941d = c3556mE;
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", c3561mJ.b());
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", AbstractC3347iJ.i);
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", AbstractC3347iJ.f31027j);
        C3561mJ c3561mJ2 = new C3561mJ();
        c3561mJ2.f31940c = C3615nJ.f32718d;
        c3561mJ2.a(4096);
        c3561mJ2.f31939b = bigInteger2;
        c3561mJ2.f31941d = c3556mE;
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", c3561mJ2.b());
        c3182fG.b(hashMap2);
        c3236gG.a(AbstractC3830rJ.f33550a);
        c3236gG.a(AbstractC3830rJ.f33551b);
        c3021cG.a(AbstractC3830rJ.f33554e, C3669oJ.class);
        qf.c(AbstractC3830rJ.f33552c, i6, true);
        qf.c(AbstractC3830rJ.f33553d, i6, false);
        int i9 = AbstractC4154xJ.f34976f;
        if (!WC.c(i9)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3290hG.c(LJ.f26091a);
        c3290hG.d(LJ.f26092b);
        c3290hG.a(LJ.f26093c);
        c3290hG.b(LJ.f26094d);
        c3290hG.a(LJ.f26095e);
        c3290hG.b(LJ.f26096f);
        HashMap hashMap3 = new HashMap();
        BigInteger bigInteger3 = C3992uJ.f34510g;
        C3884sJ c3884sJ = new C3884sJ();
        C3938tJ c3938tJ = C3938tJ.f34259b;
        c3884sJ.f33964c = c3938tJ;
        c3884sJ.f33965d = c3938tJ;
        c3884sJ.b(32);
        c3884sJ.a(3072);
        BigInteger bigInteger4 = C3992uJ.f34510g;
        c3884sJ.f33963b = bigInteger4;
        C3879sE c3879sE2 = C3879sE.f33923r;
        c3884sJ.f33967f = c3879sE2;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", c3884sJ.c());
        C3884sJ c3884sJ2 = new C3884sJ();
        c3884sJ2.f33964c = c3938tJ;
        c3884sJ2.f33965d = c3938tJ;
        c3884sJ2.b(32);
        c3884sJ2.a(3072);
        c3884sJ2.f33963b = bigInteger4;
        C3879sE c3879sE3 = C3879sE.f33926u;
        c3884sJ2.f33967f = c3879sE3;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", c3884sJ2.c());
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", AbstractC3347iJ.f31028k);
        C3884sJ c3884sJ3 = new C3884sJ();
        C3938tJ c3938tJ2 = C3938tJ.f34261d;
        c3884sJ3.f33964c = c3938tJ2;
        c3884sJ3.f33965d = c3938tJ2;
        c3884sJ3.b(64);
        c3884sJ3.a(4096);
        c3884sJ3.f33963b = bigInteger4;
        c3884sJ3.f33967f = c3879sE2;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", c3884sJ3.c());
        C3884sJ c3884sJ4 = new C3884sJ();
        c3884sJ4.f33964c = c3938tJ2;
        c3884sJ4.f33965d = c3938tJ2;
        c3884sJ4.b(64);
        c3884sJ4.a(4096);
        c3884sJ4.f33963b = bigInteger4;
        c3884sJ4.f33967f = c3879sE3;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", c3884sJ4.c());
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", AbstractC3347iJ.f31029l);
        c3182fG.b(Collections.unmodifiableMap(hashMap3));
        c3236gG.a(AbstractC4154xJ.f34971a);
        c3236gG.a(AbstractC4154xJ.f34972b);
        c3021cG.a(AbstractC4154xJ.f34975e, C3992uJ.class);
        qf.c(AbstractC4154xJ.f34973c, i9, true);
        qf.c(AbstractC4154xJ.f34974d, i9, false);
        if (HF.a()) {
            return;
        }
        C3774qG c3774qG = AbstractC3239gJ.f30553a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c3290hG.c(DJ.f24378a);
        c3290hG.d(DJ.f24379b);
        c3290hG.a(DJ.f24380c);
        c3290hG.b(DJ.f24381d);
        c3290hG.a(DJ.f24382e);
        c3290hG.b(DJ.f24383f);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("ED25519", new C3131eJ(FE.J));
        FE fe = FE.f24769M;
        hashMap4.put("ED25519_RAW", new C3131eJ(fe));
        hashMap4.put("ED25519WithRawOutput", new C3131eJ(fe));
        c3182fG.b(Collections.unmodifiableMap(hashMap4));
        c3021cG.a(AbstractC3239gJ.f30558f, C3131eJ.class);
        C3128eG.f29905b.a(AbstractC3239gJ.f30557e, C3131eJ.class);
        c3236gG.a(AbstractC3239gJ.f30553a);
        c3236gG.a(AbstractC3239gJ.f30554b);
        qf.a(AbstractC3239gJ.f30555c, true);
        qf.a(AbstractC3239gJ.f30556d, false);
    }
}
