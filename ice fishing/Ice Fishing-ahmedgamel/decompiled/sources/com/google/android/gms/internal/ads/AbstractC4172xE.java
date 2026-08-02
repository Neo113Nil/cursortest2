package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.xE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4172xE {
    static {
        int i = C4230yI.zza;
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() {
        AE ae = AE.f24438a;
        C3259gG c3259gG = C3259gG.f31317b;
        c3259gG.b(AE.f24438a);
        c3259gG.a(AE.f24439b);
        MG.a();
        int i = EE.f25330e;
        if (!WC.c(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C3527lG c3527lG = AbstractC3472kF.f32163a;
        C3313hG c3313hG = C3313hG.f31520b;
        c3313hG.c(AbstractC3472kF.f32163a);
        c3313hG.d(AbstractC3472kF.f32164b);
        c3313hG.a(AbstractC3472kF.f32165c);
        c3313hG.b(AbstractC3472kF.f32166d);
        c3259gG.a(EE.f25326a);
        C3205fG c3205fG = C3205fG.f31026b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", AbstractC3097dF.f30506e);
        T8 t82 = new T8(6);
        t82.b(16);
        t82.h(32);
        t82.m(16);
        t82.l(16);
        FE fe = FE.f25528x;
        t82.f28482x = fe;
        C3579mE c3579mE = C3579mE.f32693A;
        t82.f28483y = c3579mE;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", t82.p());
        hashMap.put("AES256_CTR_HMAC_SHA256", AbstractC3097dF.f30507f);
        T8 t83 = new T8(6);
        t83.b(32);
        t83.h(32);
        t83.m(32);
        t83.l(16);
        t83.f28482x = fe;
        t83.f28483y = c3579mE;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", t83.p());
        c3205fG.b(Collections.unmodifiableMap(hashMap));
        C3151eG c3151eG = C3151eG.f30697b;
        c3151eG.a(EE.f25328c, GE.class);
        C3044cG c3044cG = C3044cG.f30222b;
        c3044cG.a(EE.f25329d, GE.class);
        QF qf = QF.f27796d;
        qf.c(EE.f25327b, i, true);
        int i4 = LE.f26882e;
        if (!WC.c(i4)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3313hG.c(AbstractC3688oF.f33671a);
        c3313hG.d(AbstractC3688oF.f33672b);
        c3313hG.a(AbstractC3688oF.f33673c);
        c3313hG.b(AbstractC3688oF.f33674d);
        c3259gG.a(LE.f26878a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", AbstractC3097dF.f30502a);
        ME me = new ME(0);
        me.c();
        me.a(16);
        me.f();
        C3956tE c3956tE = C3956tE.f35022k;
        me.f27064e = c3956tE;
        hashMap2.put("AES128_GCM_RAW", me.i());
        hashMap2.put("AES256_GCM", AbstractC3097dF.f30503b);
        ME me2 = new ME(0);
        me2.c();
        me2.a(32);
        me2.f();
        me2.f27064e = c3956tE;
        hashMap2.put("AES256_GCM_RAW", me2.i());
        c3205fG.b(Collections.unmodifiableMap(hashMap2));
        c3151eG.a(LE.f26880c, NE.class);
        c3044cG.a(LE.f26881d, NE.class);
        qf.c(LE.f26879b, i4, true);
        if (HF.a()) {
            return;
        }
        C3797qG c3797qG = IE.f26213a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        c3313hG.c(AbstractC3526lF.f32530a);
        c3313hG.d(AbstractC3526lF.f32531b);
        c3313hG.a(AbstractC3526lF.f32532c);
        c3313hG.b(AbstractC3526lF.f32533d);
        c3259gG.a(IE.f26213a);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", AbstractC3097dF.f30504c);
        C2590Gf c2590Gf = new C2590Gf(29);
        c2590Gf.o(16);
        c2590Gf.h(16);
        c2590Gf.r();
        C3902sE c3902sE = C3902sE.f34683j;
        c2590Gf.f25833x = c3902sE;
        hashMap3.put("AES128_EAX_RAW", c2590Gf.z());
        hashMap3.put("AES256_EAX", AbstractC3097dF.f30505d);
        C2590Gf c2590Gf2 = new C2590Gf(29);
        c2590Gf2.o(16);
        c2590Gf2.h(32);
        c2590Gf2.r();
        c2590Gf2.f25833x = c3902sE;
        hashMap3.put("AES256_EAX_RAW", c2590Gf2.z());
        c3205fG.b(Collections.unmodifiableMap(hashMap3));
        c3044cG.a(IE.f26215c, JE.class);
        qf.a(IE.f26214b, true);
        C3797qG c3797qG2 = PE.f27532a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c3313hG.c(AbstractC3796qF.f34007a);
        c3313hG.d(AbstractC3796qF.f34008b);
        c3313hG.a(AbstractC3796qF.f34009c);
        c3313hG.b(AbstractC3796qF.f34010d);
        HashMap hashMap4 = new HashMap();
        FE fe2 = FE.f25516C;
        FE fe3 = FE.f25514A;
        hashMap4.put("AES128_GCM_SIV", new QE(16, fe3));
        hashMap4.put("AES128_GCM_SIV_RAW", new QE(16, fe2));
        hashMap4.put("AES256_GCM_SIV", new QE(32, fe3));
        hashMap4.put("AES256_GCM_SIV_RAW", new QE(32, fe2));
        c3205fG.b(Collections.unmodifiableMap(hashMap4));
        c3151eG.a(DE.f25115c, QE.class);
        c3044cG.a(CE.f24830e, QE.class);
        c3259gG.a(PE.f27532a);
        qf.a(PE.f27533b, true);
        C3797qG c3797qG3 = SE.f28139a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        c3313hG.c(AbstractC3957tF.f35039a);
        c3313hG.d(AbstractC3957tF.f35040b);
        c3313hG.a(AbstractC3957tF.f35041c);
        c3313hG.b(AbstractC3957tF.f35042d);
        c3259gG.a(SE.f28139a);
        c3044cG.a(CE.f24831f, TE.class);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new TE(C3579mE.f32694B));
        hashMap5.put("CHACHA20_POLY1305_RAW", new TE(C3579mE.f32696D));
        c3205fG.b(Collections.unmodifiableMap(hashMap5));
        qf.a(SE.f28140b, true);
        C3797qG c3797qG4 = UE.f28710a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        c3313hG.c(ZE.f29637a);
        c3313hG.d(ZE.f29638b);
        c3313hG.a(ZE.f29639c);
        c3313hG.b(ZE.f29640d);
        c3259gG.a(UE.f28710a);
        c3044cG.a(UE.f28712c, YE.class);
        qf.a(UE.f28711b, true);
        XF xf = WE.f29124a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        c3313hG.c(AbstractC3043cF.f30218a);
        c3313hG.d(AbstractC3043cF.f30219b);
        c3313hG.a(AbstractC3043cF.f30220c);
        c3313hG.b(AbstractC3043cF.f30221d);
        c3044cG.a(WE.f29125b, C2990bF.class);
        c3259gG.a(WE.f29126c);
        qf.a(WE.f29124a, true);
        C3797qG c3797qG5 = AbstractC3366iF.f31787a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        c3313hG.c(EF.f25331a);
        c3313hG.d(EF.f25332b);
        c3313hG.a(EF.f25333c);
        c3313hG.b(EF.f25334d);
        c3259gG.a(AbstractC3366iF.f31787a);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new C3418jF(C3902sE.f34686m));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new C3418jF(C3902sE.f34688o));
        c3205fG.b(Collections.unmodifiableMap(hashMap6));
        c3044cG.a(AbstractC3366iF.f31790d, C3418jF.class);
        c3151eG.a(AbstractC3366iF.f31789c, C3418jF.class);
        qf.a(AbstractC3366iF.f31788b, true);
        C3797qG c3797qG6 = AbstractC3204fF.f31025a;
        c3313hG.c(CF.f24843a);
        c3313hG.d(CF.f24844b);
        c3313hG.a(CF.f24845c);
        c3313hG.b(CF.f24846d);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", AbstractC3097dF.f30508g);
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", AbstractC3097dF.f30509h);
        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", AbstractC3097dF.i);
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", AbstractC3097dF.f30510j);
        c3205fG.b(Collections.unmodifiableMap(hashMap7));
        c3259gG.a(AbstractC3204fF.f31025a);
        c3044cG.a(CE.i, C3258gF.class);
    }
}
