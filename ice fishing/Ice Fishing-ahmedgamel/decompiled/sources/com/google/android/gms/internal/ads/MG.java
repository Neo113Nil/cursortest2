package com.google.android.gms.internal.ads;

import O2.C0361k;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class MG {
    static {
        int i = C4207yI.zza;
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() {
        PG pg = PG.f26751a;
        C3236gG c3236gG = C3236gG.f30551b;
        c3236gG.b(PG.f26751a);
        c3236gG.a(PG.f26752b);
        c3236gG.b(HG.f25250a);
        int i = JG.f25667f;
        if (!WC.c(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C0361k c0361k = TG.f27712a;
        C3290hG c3290hG = C3290hG.f30754b;
        c3290hG.c(TG.f27713b);
        c3290hG.d(TG.f27714c);
        c3290hG.a(TG.f27715d);
        c3290hG.b(TG.f27716e);
        c3236gG.a(JG.f25662a);
        c3236gG.a(JG.f25663b);
        C3182fG c3182fG = C3182fG.f30239b;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", QG.f27012a);
        ME me = new ME(2);
        me.a(32);
        me.d(16);
        FE fe = FE.f24766I;
        me.f26273e = fe;
        KG kg = KG.f25892d;
        me.f26272d = kg;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", me.j());
        ME me2 = new ME(2);
        me2.a(32);
        me2.d(32);
        FE fe2 = FE.f24763F;
        me2.f26273e = fe2;
        me2.f26272d = kg;
        hashMap.put("HMAC_SHA256_256BITTAG", me2.j());
        ME me3 = new ME(2);
        me3.a(32);
        me3.d(32);
        me3.f26273e = fe;
        me3.f26272d = kg;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", me3.j());
        ME me4 = new ME(2);
        me4.a(64);
        me4.d(16);
        me4.f26273e = fe2;
        KG kg2 = KG.f25894f;
        me4.f26272d = kg2;
        hashMap.put("HMAC_SHA512_128BITTAG", me4.j());
        ME me5 = new ME(2);
        me5.a(64);
        me5.d(16);
        me5.f26273e = fe;
        me5.f26272d = kg2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", me5.j());
        ME me6 = new ME(2);
        me6.a(64);
        me6.d(32);
        me6.f26273e = fe2;
        me6.f26272d = kg2;
        hashMap.put("HMAC_SHA512_256BITTAG", me6.j());
        ME me7 = new ME(2);
        me7.a(64);
        me7.d(32);
        me7.f26273e = fe;
        me7.f26272d = kg2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", me7.j());
        hashMap.put("HMAC_SHA512_512BITTAG", QG.f27013b);
        ME me8 = new ME(2);
        me8.a(64);
        me8.d(64);
        me8.f26273e = fe;
        me8.f26272d = kg2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", me8.j());
        c3182fG.b(Collections.unmodifiableMap(hashMap));
        C3021cG c3021cG = C3021cG.f29439b;
        c3021cG.a(JG.f25666e, LG.class);
        C3128eG.f29905b.a(JG.f25665d, LG.class);
        QF qf = QF.f27009d;
        qf.c(JG.f25664c, i, true);
        if (HF.a()) {
            return;
        }
        C3774qG c3774qG = FG.f24778a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        c3290hG.c(RG.f27187a);
        c3290hG.d(RG.f27188b);
        c3290hG.a(RG.f27189c);
        c3290hG.b(RG.f27190d);
        c3021cG.a(CE.f24073l, GG.class);
        c3236gG.a(FG.f24778a);
        c3236gG.a(FG.f24779b);
        HashMap hashMap2 = new HashMap();
        GG gg = QG.f27014c;
        hashMap2.put("AES_CMAC", gg);
        hashMap2.put("AES256_CMAC", gg);
        C3481ku c3481ku = new C3481ku(21);
        c3481ku.h(32);
        c3481ku.l(16);
        c3481ku.f31665w = C3933tE.f34246u;
        hashMap2.put("AES256_CMAC_RAW", c3481ku.w());
        c3182fG.b(Collections.unmodifiableMap(hashMap2));
        qf.a(FG.f24780c, true);
    }
}
