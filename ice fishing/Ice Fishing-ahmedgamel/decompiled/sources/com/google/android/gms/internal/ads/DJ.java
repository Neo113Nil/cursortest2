package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class DJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f24378a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f24379b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f24380c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f24381d;

    /* renamed from: e, reason: collision with root package name */
    public static final TF f24382e;

    /* renamed from: f, reason: collision with root package name */
    public static final RF f24383f;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        C3240gK a10 = DG.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f24378a = new C3504lG(C3131eJ.class, C3453kJ.f31397K);
        f24379b = new C3396jG(a9, C3453kJ.f31393F);
        f24380c = new TF(C3293hJ.class, C3453kJ.f31394G);
        f24381d = new RF(a10, C3453kJ.f31395H);
        f24382e = new TF(C3185fJ.class, C3453kJ.f31396I);
        f24383f = new RF(a9, C3453kJ.J);
    }

    public static C3933tE a(FE fe) {
        if (fe.equals(FE.f24769M)) {
            return C3933tE.f34232f;
        }
        if (fe.equals(FE.J)) {
            return C3933tE.f34230d;
        }
        if (fe.equals(FE.f24767K)) {
            return C3933tE.f34233g;
        }
        if (fe.equals(FE.f24768L)) {
            return C3933tE.f34231e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(fe.f24776u));
    }

    public static FE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34232f) {
            return FE.f24769M;
        }
        if (c3933tE == C3933tE.f34230d) {
            return FE.J;
        }
        if (c3933tE == C3933tE.f34233g) {
            return FE.f24767K;
        }
        if (c3933tE == C3933tE.f34231e) {
            return FE.f24768L;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }

    public static VH c(C3293hJ c3293hJ) {
        UH D8 = VH.D();
        byte[] b9 = c3293hJ.f30757c.b();
        HK s9 = JK.s(b9, 0, b9.length);
        D8.h();
        ((VH) D8.f27721u).G(s9);
        return (VH) D8.j();
    }
}
