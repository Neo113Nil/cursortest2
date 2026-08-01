package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3934tF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f34253a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f34254b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f34255c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f34256d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f34253a = new C3504lG(TE.class, C3880sF.f33951u);
        f34254b = new C3396jG(a9, VE.f28120V);
        f34255c = new TF(RE.class, VE.f28121W);
        f34256d = new RF(a9, VE.f28122X);
    }

    public static C3933tE a(C3556mE c3556mE) {
        if (c3556mE.equals(C3556mE.f31914B)) {
            return C3933tE.f34230d;
        }
        if (c3556mE.equals(C3556mE.f31915C)) {
            return C3933tE.f34233g;
        }
        if (c3556mE.equals(C3556mE.f31916D)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3556mE.f31931u));
    }

    public static C3556mE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34230d) {
            return C3556mE.f31914B;
        }
        if (c3933tE == C3933tE.f34233g || c3933tE == C3933tE.f34231e) {
            return C3556mE.f31915C;
        }
        if (c3933tE == C3933tE.f34232f) {
            return C3556mE.f31916D;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }
}
