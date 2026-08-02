package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.oF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3688oF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f33671a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f33672b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f33673c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f33674d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f33671a = new C3527lG(NE.class, VE.f28912Q);
        f33672b = new C3419jG(a9, VE.f28909N);
        f33673c = new TF(KE.class, VE.f28910O);
        f33674d = new RF(a9, VE.f28911P);
    }

    public static C3956tE a(C3956tE c3956tE) {
        if (c3956tE.equals(C3956tE.i)) {
            return C3956tE.f35016d;
        }
        if (c3956tE.equals(C3956tE.f35021j)) {
            return C3956tE.f35019g;
        }
        if (c3956tE.equals(C3956tE.f35022k)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3956tE)));
    }

    public static C3956tE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35016d) {
            return C3956tE.i;
        }
        if (c3956tE == C3956tE.f35019g || c3956tE == C3956tE.f35017e) {
            return C3956tE.f35021j;
        }
        if (c3956tE == C3956tE.f35018f) {
            return C3956tE.f35022k;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }
}
