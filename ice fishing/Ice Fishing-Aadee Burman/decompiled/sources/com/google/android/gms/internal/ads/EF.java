package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class EF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f24570a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f24571b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f24572c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f24573d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f24570a = new C3504lG(C3395jF.class, C3880sF.f33931C);
        f24571b = new C3396jG(a9, C3880sF.f33956z);
        f24572c = new TF(C3289hF.class, C3880sF.f33929A);
        f24573d = new RF(a9, C3880sF.f33930B);
    }

    public static C3933tE a(C3879sE c3879sE) {
        if (c3879sE.equals(C3879sE.f33918m)) {
            return C3933tE.f34230d;
        }
        if (c3879sE.equals(C3879sE.f33919n)) {
            return C3933tE.f34233g;
        }
        if (c3879sE.equals(C3879sE.f33920o)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3879sE.f33928b));
    }

    public static C3879sE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34230d) {
            return C3879sE.f33918m;
        }
        if (c3933tE == C3933tE.f34233g || c3933tE == C3933tE.f34231e) {
            return C3879sE.f33919n;
        }
        if (c3933tE == C3933tE.f34232f) {
            return C3879sE.f33920o;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }
}
