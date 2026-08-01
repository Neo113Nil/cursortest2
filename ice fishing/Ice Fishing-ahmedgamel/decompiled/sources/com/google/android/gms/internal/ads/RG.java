package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class RG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f27187a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f27188b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f27189c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f27190d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f27187a = new C3504lG(GG.class, C3880sF.f33941N);
        f27188b = new C3396jG(a9, C3880sF.f33938K);
        f27189c = new TF(EG.class, C3880sF.f33939L);
        f27190d = new RF(a9, C3880sF.f33940M);
    }

    public static C3933tE a(C3933tE c3933tE) {
        if (c3933tE.equals(C3933tE.f34243r)) {
            return C3933tE.f34230d;
        }
        if (c3933tE.equals(C3933tE.f34244s)) {
            return C3933tE.f34233g;
        }
        if (c3933tE.equals(C3933tE.f34246u)) {
            return C3933tE.f34232f;
        }
        if (c3933tE.equals(C3933tE.f34245t)) {
            return C3933tE.f34231e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3933tE)));
    }

    public static C3933tE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34230d) {
            return C3933tE.f34243r;
        }
        if (c3933tE == C3933tE.f34233g) {
            return C3933tE.f34244s;
        }
        if (c3933tE == C3933tE.f34231e) {
            return C3933tE.f34245t;
        }
        if (c3933tE == C3933tE.f34232f) {
            return C3933tE.f34246u;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }
}
