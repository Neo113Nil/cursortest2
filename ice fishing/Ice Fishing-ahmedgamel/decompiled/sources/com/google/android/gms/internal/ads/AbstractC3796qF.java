package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3796qF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f34007a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f34008b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f34009c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f34010d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f34007a = new C3527lG(QE.class, VE.f28916U);
        f34008b = new C3419jG(a9, VE.f28913R);
        f34009c = new TF(OE.class, VE.f28914S);
        f34010d = new RF(a9, VE.f28915T);
    }

    public static C3956tE a(FE fe) {
        if (fe.equals(FE.f25514A)) {
            return C3956tE.f35016d;
        }
        if (fe.equals(FE.f25515B)) {
            return C3956tE.f35019g;
        }
        if (fe.equals(FE.f25516C)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fe)));
    }

    public static FE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35016d) {
            return FE.f25514A;
        }
        if (c3956tE == C3956tE.f35019g || c3956tE == C3956tE.f35017e) {
            return FE.f25515B;
        }
        if (c3956tE == C3956tE.f35018f) {
            return FE.f25516C;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }
}
