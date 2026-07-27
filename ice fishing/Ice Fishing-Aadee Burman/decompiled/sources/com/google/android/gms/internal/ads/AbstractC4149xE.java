package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.xE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4149xE {
    static {
        int i = C4207yI.zza;
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() {
        AE ae = AE.f23658a;
        C3236gG c3236gG = C3236gG.f30551b;
        c3236gG.b(AE.f23658a);
        c3236gG.a(AE.f23659b);
        MG.a();
        int i = EE.f24569e;
        if (!WC.c(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C3504lG c3504lG = AbstractC3449kF.f31384a;
        C3290hG c3290hG = C3290hG.f30754b;
        c3290hG.c(AbstractC3449kF.f31384a);
        c3290hG.d(AbstractC3449kF.f31385b);
        c3290hG.a(AbstractC3449kF.f31386c);
        c3290hG.b(AbstractC3449kF.f31387d);
        c3236gG.a(EE.f24565a);
        C3182fG c3182fG = C3182fG.f30239b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", AbstractC3074dF.f29734e);
        T8 t82 = new T8(6);
        t82.b(16);
        t82.h(32);
        t82.m(16);
        t82.l(16);
        FE fe = FE.f24772x;
        t82.f27699x = fe;
        C3556mE c3556mE = C3556mE.f31913A;
        t82.f27700y = c3556mE;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", t82.p());
        hashMap.put("AES256_CTR_HMAC_SHA256", AbstractC3074dF.f29735f);
        T8 t83 = new T8(6);
        t83.b(32);
        t83.h(32);
        t83.m(32);
        t83.l(16);
        t83.f27699x = fe;
        t83.f27700y = c3556mE;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", t83.p());
        c3182fG.b(Collections.unmodifiableMap(hashMap));
        C3128eG c3128eG = C3128eG.f29905b;
        c3128eG.a(EE.f24567c, GE.class);
        C3021cG c3021cG = C3021cG.f29439b;
        c3021cG.a(EE.f24568d, GE.class);
        QF qf = QF.f27009d;
        qf.c(EE.f24566b, i, true);
        int i6 = LE.f26082e;
        if (!WC.c(i6)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3290hG.c(AbstractC3665oF.f32884a);
        c3290hG.d(AbstractC3665oF.f32885b);
        c3290hG.a(AbstractC3665oF.f32886c);
        c3290hG.b(AbstractC3665oF.f32887d);
        c3236gG.a(LE.f26078a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", AbstractC3074dF.f29730a);
        ME me = new ME(0);
        me.c();
        me.a(16);
        me.f();
        C3933tE c3933tE = C3933tE.f34236k;
        me.f26273e = c3933tE;
        hashMap2.put("AES128_GCM_RAW", me.i());
        hashMap2.put("AES256_GCM", AbstractC3074dF.f29731b);
        ME me2 = new ME(0);
        me2.c();
        me2.a(32);
        me2.f();
        me2.f26273e = c3933tE;
        hashMap2.put("AES256_GCM_RAW", me2.i());
        c3182fG.b(Collections.unmodifiableMap(hashMap2));
        c3128eG.a(LE.f26080c, NE.class);
        c3021cG.a(LE.f26081d, NE.class);
        qf.c(LE.f26079b, i6, true);
        if (HF.a()) {
            return;
        }
        C3774qG c3774qG = IE.f25470a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        c3290hG.c(AbstractC3503lF.f31750a);
        c3290hG.d(AbstractC3503lF.f31751b);
        c3290hG.a(AbstractC3503lF.f31752c);
        c3290hG.b(AbstractC3503lF.f31753d);
        c3236gG.a(IE.f25470a);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", AbstractC3074dF.f29732c);
        C2570Gf c2570Gf = new C2570Gf(29);
        c2570Gf.p(16);
        c2570Gf.i(16);
        c2570Gf.s();
        C3879sE c3879sE = C3879sE.f33915j;
        c2570Gf.f25045x = c3879sE;
        hashMap3.put("AES128_EAX_RAW", c2570Gf.z());
        hashMap3.put("AES256_EAX", AbstractC3074dF.f29733d);
        C2570Gf c2570Gf2 = new C2570Gf(29);
        c2570Gf2.p(16);
        c2570Gf2.i(32);
        c2570Gf2.s();
        c2570Gf2.f25045x = c3879sE;
        hashMap3.put("AES256_EAX_RAW", c2570Gf2.z());
        c3182fG.b(Collections.unmodifiableMap(hashMap3));
        c3021cG.a(IE.f25472c, JE.class);
        qf.a(IE.f25471b, true);
        C3774qG c3774qG2 = PE.f26749a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c3290hG.c(AbstractC3773qF.f33223a);
        c3290hG.d(AbstractC3773qF.f33224b);
        c3290hG.a(AbstractC3773qF.f33225c);
        c3290hG.b(AbstractC3773qF.f33226d);
        HashMap hashMap4 = new HashMap();
        FE fe2 = FE.f24760C;
        FE fe3 = FE.f24758A;
        hashMap4.put("AES128_GCM_SIV", new QE(16, fe3));
        hashMap4.put("AES128_GCM_SIV_RAW", new QE(16, fe2));
        hashMap4.put("AES256_GCM_SIV", new QE(32, fe3));
        hashMap4.put("AES256_GCM_SIV_RAW", new QE(32, fe2));
        c3182fG.b(Collections.unmodifiableMap(hashMap4));
        c3128eG.a(DE.f24370c, QE.class);
        c3021cG.a(CE.f24067e, QE.class);
        c3236gG.a(PE.f26749a);
        qf.a(PE.f26750b, true);
        C3774qG c3774qG3 = SE.f27425a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        c3290hG.c(AbstractC3934tF.f34253a);
        c3290hG.d(AbstractC3934tF.f34254b);
        c3290hG.a(AbstractC3934tF.f34255c);
        c3290hG.b(AbstractC3934tF.f34256d);
        c3236gG.a(SE.f27425a);
        c3021cG.a(CE.f24068f, TE.class);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new TE(C3556mE.f31914B));
        hashMap5.put("CHACHA20_POLY1305_RAW", new TE(C3556mE.f31916D));
        c3182fG.b(Collections.unmodifiableMap(hashMap5));
        qf.a(SE.f27426b, true);
        C3774qG c3774qG4 = UE.f27913a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        c3290hG.c(ZE.f28857a);
        c3290hG.d(ZE.f28858b);
        c3290hG.a(ZE.f28859c);
        c3290hG.b(ZE.f28860d);
        c3236gG.a(UE.f27913a);
        c3021cG.a(UE.f27915c, YE.class);
        qf.a(UE.f27914b, true);
        XF xf = WE.f28326a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        c3290hG.c(AbstractC3020cF.f29435a);
        c3290hG.d(AbstractC3020cF.f29436b);
        c3290hG.a(AbstractC3020cF.f29437c);
        c3290hG.b(AbstractC3020cF.f29438d);
        c3021cG.a(WE.f28327b, C2967bF.class);
        c3236gG.a(WE.f28328c);
        qf.a(WE.f28326a, true);
        C3774qG c3774qG5 = AbstractC3343iF.f31014a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        c3290hG.c(EF.f24570a);
        c3290hG.d(EF.f24571b);
        c3290hG.a(EF.f24572c);
        c3290hG.b(EF.f24573d);
        c3236gG.a(AbstractC3343iF.f31014a);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new C3395jF(C3879sE.f33918m));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new C3395jF(C3879sE.f33920o));
        c3182fG.b(Collections.unmodifiableMap(hashMap6));
        c3021cG.a(AbstractC3343iF.f31017d, C3395jF.class);
        c3128eG.a(AbstractC3343iF.f31016c, C3395jF.class);
        qf.a(AbstractC3343iF.f31015b, true);
        C3774qG c3774qG6 = AbstractC3181fF.f30238a;
        c3290hG.c(CF.f24080a);
        c3290hG.d(CF.f24081b);
        c3290hG.a(CF.f24082c);
        c3290hG.b(CF.f24083d);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", AbstractC3074dF.f29736g);
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", AbstractC3074dF.f29737h);
        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", AbstractC3074dF.i);
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", AbstractC3074dF.f29738j);
        c3182fG.b(Collections.unmodifiableMap(hashMap7));
        c3236gG.a(AbstractC3181fF.f30238a);
        c3021cG.a(CE.i, C3235gF.class);
    }
}
