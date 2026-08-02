package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3957tF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f35039a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f35040b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f35041c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f35042d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f35039a = new C3527lG(TE.class, C3903sF.f34719u);
        f35040b = new C3419jG(a9, VE.f28917V);
        f35041c = new TF(RE.class, VE.f28918W);
        f35042d = new RF(a9, VE.f28919X);
    }

    public static C3956tE a(C3579mE c3579mE) {
        if (c3579mE.equals(C3579mE.f32694B)) {
            return C3956tE.f35016d;
        }
        if (c3579mE.equals(C3579mE.f32695C)) {
            return C3956tE.f35019g;
        }
        if (c3579mE.equals(C3579mE.f32696D)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3579mE.f32711u));
    }

    public static C3579mE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35016d) {
            return C3579mE.f32694B;
        }
        if (c3956tE == C3956tE.f35019g || c3956tE == C3956tE.f35017e) {
            return C3579mE.f32695C;
        }
        if (c3956tE == C3956tE.f35018f) {
            return C3579mE.f32696D;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }
}
