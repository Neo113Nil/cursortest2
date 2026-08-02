package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class RG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f27943a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f27944b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f27945c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f27946d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f27943a = new C3527lG(GG.class, C3903sF.f34709N);
        f27944b = new C3419jG(a9, C3903sF.f34706K);
        f27945c = new TF(EG.class, C3903sF.f34707L);
        f27946d = new RF(a9, C3903sF.f34708M);
    }

    public static C3956tE a(C3956tE c3956tE) {
        if (c3956tE.equals(C3956tE.f35029r)) {
            return C3956tE.f35016d;
        }
        if (c3956tE.equals(C3956tE.f35030s)) {
            return C3956tE.f35019g;
        }
        if (c3956tE.equals(C3956tE.f35032u)) {
            return C3956tE.f35018f;
        }
        if (c3956tE.equals(C3956tE.f35031t)) {
            return C3956tE.f35017e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3956tE)));
    }

    public static C3956tE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35016d) {
            return C3956tE.f35029r;
        }
        if (c3956tE == C3956tE.f35019g) {
            return C3956tE.f35030s;
        }
        if (c3956tE == C3956tE.f35017e) {
            return C3956tE.f35031t;
        }
        if (c3956tE == C3956tE.f35018f) {
            return C3956tE.f35032u;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }
}
