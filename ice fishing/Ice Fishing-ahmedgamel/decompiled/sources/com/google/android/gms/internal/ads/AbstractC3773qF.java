package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3773qF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f33223a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f33224b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f33225c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f33226d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f33223a = new C3504lG(QE.class, VE.f28119U);
        f33224b = new C3396jG(a9, VE.f28116R);
        f33225c = new TF(OE.class, VE.f28117S);
        f33226d = new RF(a9, VE.f28118T);
    }

    public static C3933tE a(FE fe) {
        if (fe.equals(FE.f24758A)) {
            return C3933tE.f34230d;
        }
        if (fe.equals(FE.f24759B)) {
            return C3933tE.f34233g;
        }
        if (fe.equals(FE.f24760C)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fe)));
    }

    public static FE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34230d) {
            return FE.f24758A;
        }
        if (c3933tE == C3933tE.f34233g || c3933tE == C3933tE.f34231e) {
            return FE.f24759B;
        }
        if (c3933tE == C3933tE.f34232f) {
            return FE.f24760C;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }
}
