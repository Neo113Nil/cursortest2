package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class EF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f25331a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f25332b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f25333c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f25334d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f25331a = new C3527lG(C3418jF.class, C3903sF.f34699C);
        f25332b = new C3419jG(a9, C3903sF.f34724z);
        f25333c = new TF(C3312hF.class, C3903sF.f34697A);
        f25334d = new RF(a9, C3903sF.f34698B);
    }

    public static C3956tE a(C3902sE c3902sE) {
        if (c3902sE.equals(C3902sE.f34686m)) {
            return C3956tE.f35016d;
        }
        if (c3902sE.equals(C3902sE.f34687n)) {
            return C3956tE.f35019g;
        }
        if (c3902sE.equals(C3902sE.f34688o)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3902sE.f34696b));
    }

    public static C3902sE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35016d) {
            return C3902sE.f34686m;
        }
        if (c3956tE == C3956tE.f35019g || c3956tE == C3956tE.f35017e) {
            return C3902sE.f34687n;
        }
        if (c3956tE == C3956tE.f35018f) {
            return C3902sE.f34688o;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }
}
