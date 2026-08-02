package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class TG {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.e f28495a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3527lG f28496b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3419jG f28497c;

    /* renamed from: d, reason: collision with root package name */
    public static final TF f28498d;

    /* renamed from: e, reason: collision with root package name */
    public static final RF f28499e;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        WH wh = WH.SHA1;
        KG kg = KG.f26642b;
        hashMap.put(wh, kg);
        hashMap2.put(kg, wh);
        WH wh2 = WH.SHA224;
        KG kg2 = KG.f26643c;
        hashMap.put(wh2, kg2);
        hashMap2.put(kg2, wh2);
        WH wh3 = WH.SHA256;
        KG kg3 = KG.f26644d;
        hashMap.put(wh3, kg3);
        hashMap2.put(kg3, wh3);
        WH wh4 = WH.SHA384;
        KG kg4 = KG.f26645e;
        hashMap.put(wh4, kg4);
        hashMap2.put(kg4, wh4);
        WH wh5 = WH.SHA512;
        KG kg5 = KG.f26646f;
        hashMap.put(wh5, kg5);
        hashMap2.put(kg5, wh5);
        f28495a = new S0.e(26, Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        f28496b = new C3527lG(LG.class, C3903sF.f34713R);
        f28497c = new C3419jG(a9, C3903sF.f34710O);
        f28498d = new TF(IG.class, C3903sF.f34711P);
        f28499e = new RF(a9, C3903sF.f34712Q);
    }

    public static C3956tE a(FE fe) {
        if (fe == FE.f25522I) {
            return C3956tE.f35018f;
        }
        if (fe == FE.f25519F) {
            return C3956tE.f35016d;
        }
        if (fe == FE.f25521H) {
            return C3956tE.f35017e;
        }
        if (fe == FE.f25520G) {
            return C3956tE.f35019g;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(fe)));
    }

    public static FE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35018f) {
            return FE.f25522I;
        }
        if (c3956tE == C3956tE.f35016d) {
            return FE.f25519F;
        }
        if (c3956tE == C3956tE.f35017e) {
            return FE.f25521H;
        }
        if (c3956tE == C3956tE.f35019g) {
            return FE.f25520G;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(c3956tE.f35038b));
    }
}
