package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.oF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3665oF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f32884a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f32885b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f32886c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f32887d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f32884a = new C3504lG(NE.class, VE.f28115Q);
        f32885b = new C3396jG(a9, VE.f28112N);
        f32886c = new TF(KE.class, VE.f28113O);
        f32887d = new RF(a9, VE.f28114P);
    }

    public static C3933tE a(C3933tE c3933tE) {
        if (c3933tE.equals(C3933tE.i)) {
            return C3933tE.f34230d;
        }
        if (c3933tE.equals(C3933tE.f34235j)) {
            return C3933tE.f34233g;
        }
        if (c3933tE.equals(C3933tE.f34236k)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3933tE)));
    }

    public static C3933tE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34230d) {
            return C3933tE.i;
        }
        if (c3933tE == C3933tE.f34233g || c3933tE == C3933tE.f34231e) {
            return C3933tE.f34235j;
        }
        if (c3933tE == C3933tE.f34232f) {
            return C3933tE.f34236k;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }
}
