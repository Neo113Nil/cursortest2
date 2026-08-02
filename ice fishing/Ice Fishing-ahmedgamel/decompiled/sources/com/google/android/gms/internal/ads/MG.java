package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class MG {
    static {
        int i = C4230yI.zza;
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() {
        PG pg = PG.f27534a;
        C3259gG c3259gG = C3259gG.f31317b;
        c3259gG.b(PG.f27534a);
        c3259gG.a(PG.f27535b);
        c3259gG.b(HG.f26022a);
        int i = JG.f26420f;
        if (!WC.c(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        S0.e eVar = TG.f28495a;
        C3313hG c3313hG = C3313hG.f31520b;
        c3313hG.c(TG.f28496b);
        c3313hG.d(TG.f28497c);
        c3313hG.a(TG.f28498d);
        c3313hG.b(TG.f28499e);
        c3259gG.a(JG.f26415a);
        c3259gG.a(JG.f26416b);
        C3205fG c3205fG = C3205fG.f31026b;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", QG.f27799a);
        ME me = new ME(2);
        me.a(32);
        me.d(16);
        FE fe = FE.f25522I;
        me.f27064e = fe;
        KG kg = KG.f26644d;
        me.f27063d = kg;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", me.j());
        ME me2 = new ME(2);
        me2.a(32);
        me2.d(32);
        FE fe2 = FE.f25519F;
        me2.f27064e = fe2;
        me2.f27063d = kg;
        hashMap.put("HMAC_SHA256_256BITTAG", me2.j());
        ME me3 = new ME(2);
        me3.a(32);
        me3.d(32);
        me3.f27064e = fe;
        me3.f27063d = kg;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", me3.j());
        ME me4 = new ME(2);
        me4.a(64);
        me4.d(16);
        me4.f27064e = fe2;
        KG kg2 = KG.f26646f;
        me4.f27063d = kg2;
        hashMap.put("HMAC_SHA512_128BITTAG", me4.j());
        ME me5 = new ME(2);
        me5.a(64);
        me5.d(16);
        me5.f27064e = fe;
        me5.f27063d = kg2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", me5.j());
        ME me6 = new ME(2);
        me6.a(64);
        me6.d(32);
        me6.f27064e = fe2;
        me6.f27063d = kg2;
        hashMap.put("HMAC_SHA512_256BITTAG", me6.j());
        ME me7 = new ME(2);
        me7.a(64);
        me7.d(32);
        me7.f27064e = fe;
        me7.f27063d = kg2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", me7.j());
        hashMap.put("HMAC_SHA512_512BITTAG", QG.f27800b);
        ME me8 = new ME(2);
        me8.a(64);
        me8.d(64);
        me8.f27064e = fe;
        me8.f27063d = kg2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", me8.j());
        c3205fG.b(Collections.unmodifiableMap(hashMap));
        C3044cG c3044cG = C3044cG.f30222b;
        c3044cG.a(JG.f26419e, LG.class);
        C3151eG.f30697b.a(JG.f26418d, LG.class);
        QF qf = QF.f27796d;
        qf.c(JG.f26417c, i, true);
        if (HF.a()) {
            return;
        }
        C3797qG c3797qG = FG.f25534a;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        c3313hG.c(RG.f27943a);
        c3313hG.d(RG.f27944b);
        c3313hG.a(RG.f27945c);
        c3313hG.b(RG.f27946d);
        c3044cG.a(CE.f24836l, GG.class);
        c3259gG.a(FG.f25534a);
        c3259gG.a(FG.f25535b);
        HashMap hashMap2 = new HashMap();
        GG gg = QG.f27801c;
        hashMap2.put("AES_CMAC", gg);
        hashMap2.put("AES256_CMAC", gg);
        C3504ku c3504ku = new C3504ku(21);
        c3504ku.h(32);
        c3504ku.l(16);
        c3504ku.f32447w = C3956tE.f35032u;
        hashMap2.put("AES256_CMAC_RAW", c3504ku.v());
        c3205fG.b(Collections.unmodifiableMap(hashMap2));
        qf.a(FG.f25536c, true);
    }
}
