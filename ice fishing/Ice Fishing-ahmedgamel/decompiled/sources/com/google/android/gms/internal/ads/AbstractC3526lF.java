package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.lF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3526lF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f32530a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f32531b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f32532c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f32533d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f32530a = new C3527lG(JE.class, VE.f28908M);
        f32531b = new C3419jG(a9, VE.J);
        f32532c = new TF(HE.class, VE.f28906K);
        f32533d = new RF(a9, VE.f28907L);
    }

    public static C3956tE a(C3902sE c3902sE) {
        if (c3902sE.equals(C3902sE.f34682h)) {
            return C3956tE.f35016d;
        }
        if (c3902sE.equals(C3902sE.i)) {
            return C3956tE.f35019g;
        }
        if (c3902sE.equals(C3902sE.f34683j)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3902sE)));
    }

    public static C3902sE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35016d) {
            return C3902sE.f34682h;
        }
        if (c3956tE == C3956tE.f35019g || c3956tE == C3956tE.f35017e) {
            return C3902sE.i;
        }
        if (c3956tE == C3956tE.f35018f) {
            return C3902sE.f34683j;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }
}
