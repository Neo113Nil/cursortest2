package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class SG {
    static {
        int i = FI.zza;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() {
        VG vg = VG.f28230a;
        C3463kG c3463kG = C3463kG.f32285b;
        c3463kG.b(VG.f28230a);
        c3463kG.a(VG.f28231b);
        c3463kG.b(MG.f26318a);
        int i = OG.f26682f;
        if (!XC.e(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C4237yi c4237yi = AbstractC2922aH.f29192a;
        C3517lG c3517lG = C3517lG.f32558b;
        c3517lG.c(AbstractC2922aH.f29194c);
        c3517lG.d(AbstractC2922aH.f29195d);
        c3517lG.a(AbstractC2922aH.f29196e);
        c3517lG.b(AbstractC2922aH.f29197f);
        c3463kG.a(OG.f26677a);
        c3463kG.a(OG.f26678b);
        C3409jG c3409jG = C3409jG.f32096b;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", WG.f28376a);
        PE pe = new PE(2);
        pe.a(32);
        pe.d(16);
        QG qg = QG.f27135e;
        pe.f26885e = qg;
        PG pg = PG.f26895d;
        pe.f26884d = pg;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", pe.j());
        PE pe2 = new PE(2);
        pe2.a(32);
        pe2.d(32);
        QG qg2 = QG.f27132b;
        pe2.f26885e = qg2;
        pe2.f26884d = pg;
        hashMap.put("HMAC_SHA256_256BITTAG", pe2.j());
        PE pe3 = new PE(2);
        pe3.a(32);
        pe3.d(32);
        pe3.f26885e = qg;
        pe3.f26884d = pg;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", pe3.j());
        PE pe4 = new PE(2);
        pe4.a(64);
        pe4.d(16);
        pe4.f26885e = qg2;
        PG pg2 = PG.f26897f;
        pe4.f26884d = pg2;
        hashMap.put("HMAC_SHA512_128BITTAG", pe4.j());
        PE pe5 = new PE(2);
        pe5.a(64);
        pe5.d(16);
        pe5.f26885e = qg;
        pe5.f26884d = pg2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", pe5.j());
        PE pe6 = new PE(2);
        pe6.a(64);
        pe6.d(32);
        pe6.f26885e = qg2;
        pe6.f26884d = pg2;
        hashMap.put("HMAC_SHA512_256BITTAG", pe6.j());
        PE pe7 = new PE(2);
        pe7.a(64);
        pe7.d(32);
        pe7.f26885e = qg;
        pe7.f26884d = pg2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", pe7.j());
        hashMap.put("HMAC_SHA512_512BITTAG", WG.f28377b);
        PE pe8 = new PE(2);
        pe8.a(64);
        pe8.d(64);
        pe8.f26885e = qg;
        pe8.f26884d = pg2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", pe8.j());
        c3409jG.b(Collections.unmodifiableMap(hashMap));
        C3249gG c3249gG = C3249gG.f30974b;
        c3249gG.a(OG.f26681e, RG.class);
        C3357iG.f31327b.a(OG.f26680d, RG.class);
        UF uf = UF.f27953d;
        uf.c(OG.f26679c, i, true);
        if (JF.a()) {
            return;
        }
        C4002uG c4002uG = KG.f25949a;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        c3517lG.c(XG.f28626a);
        c3517lG.d(XG.f28627b);
        c3517lG.a(XG.f28628c);
        c3517lG.b(XG.f28629d);
        c3249gG.a(DE.f24375l, LG.class);
        c3463kG.a(KG.f25949a);
        c3463kG.a(KG.f25950b);
        HashMap hashMap2 = new HashMap();
        LG lg = WG.f28378c;
        hashMap2.put("AES_CMAC", lg);
        hashMap2.put("AES256_CMAC", lg);
        C3602mu c3602mu = new C3602mu(21);
        c3602mu.f(32);
        c3602mu.r(16);
        c3602mu.f32776w = C3731pE.f33362K;
        hashMap2.put("AES256_CMAC_RAW", c3602mu.x());
        c3409jG.b(Collections.unmodifiableMap(hashMap2));
        uf.a(KG.f25951c, true);
    }
}
