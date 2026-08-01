package com.google.android.gms.internal.ads;

import O2.C0361k;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class TG {

    /* renamed from: a, reason: collision with root package name */
    public static final C0361k f27712a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3504lG f27713b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3396jG f27714c;

    /* renamed from: d, reason: collision with root package name */
    public static final TF f27715d;

    /* renamed from: e, reason: collision with root package name */
    public static final RF f27716e;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        WH wh = WH.SHA1;
        KG kg = KG.f25890b;
        hashMap.put(wh, kg);
        hashMap2.put(kg, wh);
        WH wh2 = WH.SHA224;
        KG kg2 = KG.f25891c;
        hashMap.put(wh2, kg2);
        hashMap2.put(kg2, wh2);
        WH wh3 = WH.SHA256;
        KG kg3 = KG.f25892d;
        hashMap.put(wh3, kg3);
        hashMap2.put(kg3, wh3);
        WH wh4 = WH.SHA384;
        KG kg4 = KG.f25893e;
        hashMap.put(wh4, kg4);
        hashMap2.put(kg4, wh4);
        WH wh5 = WH.SHA512;
        KG kg5 = KG.f25894f;
        hashMap.put(wh5, kg5);
        hashMap2.put(kg5, wh5);
        f27712a = new C0361k(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        f27713b = new C3504lG(LG.class, C3880sF.f33945R);
        f27714c = new C3396jG(a9, C3880sF.f33942O);
        f27715d = new TF(IG.class, C3880sF.f33943P);
        f27716e = new RF(a9, C3880sF.f33944Q);
    }

    public static C3933tE a(FE fe) {
        if (fe == FE.f24766I) {
            return C3933tE.f34232f;
        }
        if (fe == FE.f24763F) {
            return C3933tE.f34230d;
        }
        if (fe == FE.f24765H) {
            return C3933tE.f34231e;
        }
        if (fe == FE.f24764G) {
            return C3933tE.f34233g;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(fe)));
    }

    public static FE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34232f) {
            return FE.f24766I;
        }
        if (c3933tE == C3933tE.f34230d) {
            return FE.f24763F;
        }
        if (c3933tE == C3933tE.f34231e) {
            return FE.f24765H;
        }
        if (c3933tE == C3933tE.f34233g) {
            return FE.f24764G;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(c3933tE.f34252b));
    }
}
