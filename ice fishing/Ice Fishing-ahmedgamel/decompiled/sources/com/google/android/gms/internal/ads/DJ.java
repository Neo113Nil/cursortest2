package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class DJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f25123a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f25124b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f25125c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f25126d;

    /* renamed from: e, reason: collision with root package name */
    public static final TF f25127e;

    /* renamed from: f, reason: collision with root package name */
    public static final RF f25128f;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        C3263gK a10 = DG.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f25123a = new C3527lG(C3154eJ.class, C3476kJ.f32176K);
        f25124b = new C3419jG(a9, C3476kJ.f32172F);
        f25125c = new TF(C3316hJ.class, C3476kJ.f32173G);
        f25126d = new RF(a10, C3476kJ.f32174H);
        f25127e = new TF(C3208fJ.class, C3476kJ.f32175I);
        f25128f = new RF(a9, C3476kJ.J);
    }

    public static C3956tE a(FE fe) {
        if (fe.equals(FE.f25525M)) {
            return C3956tE.f35018f;
        }
        if (fe.equals(FE.J)) {
            return C3956tE.f35016d;
        }
        if (fe.equals(FE.f25523K)) {
            return C3956tE.f35019g;
        }
        if (fe.equals(FE.f25524L)) {
            return C3956tE.f35017e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(fe.f25532u));
    }

    public static FE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35018f) {
            return FE.f25525M;
        }
        if (c3956tE == C3956tE.f35016d) {
            return FE.J;
        }
        if (c3956tE == C3956tE.f35019g) {
            return FE.f25523K;
        }
        if (c3956tE == C3956tE.f35017e) {
            return FE.f25524L;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }

    public static VH c(C3316hJ c3316hJ) {
        UH D8 = VH.D();
        byte[] b9 = c3316hJ.f31523c.b();
        HK s9 = JK.s(b9, 0, b9.length);
        D8.h();
        ((VH) D8.f28504u).G(s9);
        return (VH) D8.j();
    }
}
