package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4231yJ {
    static {
        int i = C4230yI.zza;
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() {
        C3422jJ c3422jJ = C3422jJ.f32011a;
        C3259gG c3259gG = C3259gG.f31317b;
        c3259gG.b(C3422jJ.f32011a);
        c3259gG.a(C3422jJ.f32012b);
        c3259gG.b(C3530lJ.f32536a);
        c3259gG.a(C3530lJ.f32537b);
        int i = AbstractC3101dJ.f30516f;
        if (!WC.c(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        C3527lG c3527lG = BJ.f24642a;
        C3313hG c3313hG = C3313hG.f31520b;
        c3313hG.c(BJ.f24642a);
        c3313hG.d(BJ.f24643b);
        c3313hG.a(BJ.f24644c);
        c3313hG.b(BJ.f24645d);
        c3313hG.a(BJ.f24646e);
        c3313hG.b(BJ.f24647f);
        C3205fG c3205fG = C3205fG.f31026b;
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", AbstractC3370iJ.f31792a);
        hashMap.put("ECDSA_P256_IEEE_P1363", AbstractC3370iJ.f31795d);
        ME me = new ME(3);
        me.f27063d = C3579mE.f32699G;
        me.f27062c = YI.f29441c;
        me.f27061b = C3902sE.f34689p;
        me.f27064e = C3956tE.f35036y;
        hashMap.put("ECDSA_P256_RAW", me.k());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", AbstractC3370iJ.f31797f);
        hashMap.put("ECDSA_P384", AbstractC3370iJ.f31793b);
        hashMap.put("ECDSA_P384_IEEE_P1363", AbstractC3370iJ.f31796e);
        ME me2 = new ME(3);
        me2.f27063d = C3579mE.f32701I;
        YI yi = YI.f29442d;
        me2.f27062c = yi;
        C3902sE c3902sE = C3902sE.f34690q;
        me2.f27061b = c3902sE;
        C3956tE c3956tE = C3956tE.f35033v;
        me2.f27064e = c3956tE;
        hashMap.put("ECDSA_P384_SHA512", me2.k());
        ME me3 = new ME(3);
        me3.f27063d = C3579mE.f32700H;
        me3.f27062c = yi;
        me3.f27061b = c3902sE;
        me3.f27064e = c3956tE;
        hashMap.put("ECDSA_P384_SHA384", me3.k());
        hashMap.put("ECDSA_P521", AbstractC3370iJ.f31794c);
        hashMap.put("ECDSA_P521_IEEE_P1363", AbstractC3370iJ.f31798g);
        c3205fG.b(Collections.unmodifiableMap(hashMap));
        c3259gG.a(AbstractC3101dJ.f30511a);
        c3259gG.a(AbstractC3101dJ.f30512b);
        C3044cG c3044cG = C3044cG.f30222b;
        c3044cG.a(AbstractC3101dJ.f30515e, ZI.class);
        QF qf = QF.f27796d;
        qf.c(AbstractC3101dJ.f30513c, i, true);
        qf.c(AbstractC3101dJ.f30514d, i, false);
        int i4 = AbstractC3853rJ.f34323f;
        if (!WC.c(i4)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3313hG.c(HJ.f26023a);
        c3313hG.d(HJ.f26024b);
        c3313hG.a(HJ.f26025c);
        c3313hG.b(HJ.f26026d);
        c3313hG.a(HJ.f26027e);
        c3313hG.b(HJ.f26028f);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", AbstractC3370iJ.f31799h);
        BigInteger bigInteger = C3692oJ.f33677e;
        C3584mJ c3584mJ = new C3584mJ();
        c3584mJ.f32720c = C3638nJ.f33494b;
        c3584mJ.a(3072);
        BigInteger bigInteger2 = C3692oJ.f33677e;
        c3584mJ.f32719b = bigInteger2;
        C3579mE c3579mE = C3579mE.f32704M;
        c3584mJ.f32721d = c3579mE;
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", c3584mJ.b());
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", AbstractC3370iJ.i);
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", AbstractC3370iJ.f31800j);
        C3584mJ c3584mJ2 = new C3584mJ();
        c3584mJ2.f32720c = C3638nJ.f33496d;
        c3584mJ2.a(4096);
        c3584mJ2.f32719b = bigInteger2;
        c3584mJ2.f32721d = c3579mE;
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", c3584mJ2.b());
        c3205fG.b(hashMap2);
        c3259gG.a(AbstractC3853rJ.f34318a);
        c3259gG.a(AbstractC3853rJ.f34319b);
        c3044cG.a(AbstractC3853rJ.f34322e, C3692oJ.class);
        qf.c(AbstractC3853rJ.f34320c, i4, true);
        qf.c(AbstractC3853rJ.f34321d, i4, false);
        int i6 = AbstractC4177xJ.f35757f;
        if (!WC.c(i6)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3313hG.c(LJ.f26891a);
        c3313hG.d(LJ.f26892b);
        c3313hG.a(LJ.f26893c);
        c3313hG.b(LJ.f26894d);
        c3313hG.a(LJ.f26895e);
        c3313hG.b(LJ.f26896f);
        HashMap hashMap3 = new HashMap();
        BigInteger bigInteger3 = C4015uJ.f35284g;
        C3907sJ c3907sJ = new C3907sJ();
        C3961tJ c3961tJ = C3961tJ.f35045b;
        c3907sJ.f34732c = c3961tJ;
        c3907sJ.f34733d = c3961tJ;
        c3907sJ.b(32);
        c3907sJ.a(3072);
        BigInteger bigInteger4 = C4015uJ.f35284g;
        c3907sJ.f34731b = bigInteger4;
        C3902sE c3902sE2 = C3902sE.f34691r;
        c3907sJ.f34735f = c3902sE2;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", c3907sJ.c());
        C3907sJ c3907sJ2 = new C3907sJ();
        c3907sJ2.f34732c = c3961tJ;
        c3907sJ2.f34733d = c3961tJ;
        c3907sJ2.b(32);
        c3907sJ2.a(3072);
        c3907sJ2.f34731b = bigInteger4;
        C3902sE c3902sE3 = C3902sE.f34694u;
        c3907sJ2.f34735f = c3902sE3;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", c3907sJ2.c());
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", AbstractC3370iJ.f31801k);
        C3907sJ c3907sJ3 = new C3907sJ();
        C3961tJ c3961tJ2 = C3961tJ.f35047d;
        c3907sJ3.f34732c = c3961tJ2;
        c3907sJ3.f34733d = c3961tJ2;
        c3907sJ3.b(64);
        c3907sJ3.a(4096);
        c3907sJ3.f34731b = bigInteger4;
        c3907sJ3.f34735f = c3902sE2;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", c3907sJ3.c());
        C3907sJ c3907sJ4 = new C3907sJ();
        c3907sJ4.f34732c = c3961tJ2;
        c3907sJ4.f34733d = c3961tJ2;
        c3907sJ4.b(64);
        c3907sJ4.a(4096);
        c3907sJ4.f34731b = bigInteger4;
        c3907sJ4.f34735f = c3902sE3;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", c3907sJ4.c());
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", AbstractC3370iJ.f31802l);
        c3205fG.b(Collections.unmodifiableMap(hashMap3));
        c3259gG.a(AbstractC4177xJ.f35752a);
        c3259gG.a(AbstractC4177xJ.f35753b);
        c3044cG.a(AbstractC4177xJ.f35756e, C4015uJ.class);
        qf.c(AbstractC4177xJ.f35754c, i6, true);
        qf.c(AbstractC4177xJ.f35755d, i6, false);
        if (HF.a()) {
            return;
        }
        C3797qG c3797qG = AbstractC3262gJ.f31319a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c3313hG.c(DJ.f25123a);
        c3313hG.d(DJ.f25124b);
        c3313hG.a(DJ.f25125c);
        c3313hG.b(DJ.f25126d);
        c3313hG.a(DJ.f25127e);
        c3313hG.b(DJ.f25128f);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("ED25519", new C3154eJ(FE.J));
        FE fe = FE.f25525M;
        hashMap4.put("ED25519_RAW", new C3154eJ(fe));
        hashMap4.put("ED25519WithRawOutput", new C3154eJ(fe));
        c3205fG.b(Collections.unmodifiableMap(hashMap4));
        c3044cG.a(AbstractC3262gJ.f31324f, C3154eJ.class);
        C3151eG.f30697b.a(AbstractC3262gJ.f31323e, C3154eJ.class);
        c3259gG.a(AbstractC3262gJ.f31319a);
        c3259gG.a(AbstractC3262gJ.f31320b);
        qf.a(AbstractC3262gJ.f31321c, true);
        qf.a(AbstractC3262gJ.f31322d, false);
    }
}
