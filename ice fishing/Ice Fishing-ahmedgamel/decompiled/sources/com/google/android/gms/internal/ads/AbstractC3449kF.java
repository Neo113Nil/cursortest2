package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.kF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3449kF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3504lG f31384a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3396jG f31385b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f31386c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f31387d;

    static {
        C3240gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f31384a = new C3504lG(GE.class, VE.f28108I);
        f31385b = new C3396jG(a9, VE.f28105F);
        f31386c = new TF(BE.class, VE.f28106G);
        f31387d = new RF(a9, VE.f28107H);
    }

    public static C3933tE a(C3556mE c3556mE) {
        if (c3556mE.equals(C3556mE.f31928y)) {
            return C3933tE.f34230d;
        }
        if (c3556mE.equals(C3556mE.f31929z)) {
            return C3933tE.f34233g;
        }
        if (c3556mE.equals(C3556mE.f31913A)) {
            return C3933tE.f34232f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3556mE)));
    }

    public static C3556mE b(C3933tE c3933tE) {
        if (c3933tE == C3933tE.f34230d) {
            return C3556mE.f31928y;
        }
        if (c3933tE == C3933tE.f34233g || c3933tE == C3933tE.f34231e) {
            return C3556mE.f31929z;
        }
        if (c3933tE == C3933tE.f34232f) {
            return C3556mE.f31913A;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3933tE.f34252b));
    }

    public static FE c(WH wh) {
        int ordinal = wh.ordinal();
        if (ordinal == 1) {
            return FE.f24770v;
        }
        if (ordinal == 2) {
            return FE.f24773y;
        }
        if (ordinal == 3) {
            return FE.f24772x;
        }
        if (ordinal == 4) {
            return FE.f24774z;
        }
        if (ordinal == 5) {
            return FE.f24771w;
        }
        int c9 = wh.c();
        throw new GeneralSecurityException(D.y.m(c9, "Unable to parse HashType: ", new StringBuilder(String.valueOf(c9).length() + 26)));
    }

    public static C3023cI d(GE ge) {
        WH wh;
        C2970bI C8 = C3023cI.C();
        int i = ge.f24957d;
        C8.h();
        ((C3023cI) C8.f27721u).F(i);
        FE fe = FE.f24770v;
        FE fe2 = ge.f24959f;
        if (fe2.equals(fe)) {
            wh = WH.SHA1;
        } else if (fe2.equals(FE.f24771w)) {
            wh = WH.SHA224;
        } else if (fe2.equals(FE.f24772x)) {
            wh = WH.SHA256;
        } else if (fe2.equals(FE.f24773y)) {
            wh = WH.SHA384;
        } else {
            if (!fe2.equals(FE.f24774z)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(fe2)));
            }
            wh = WH.SHA512;
        }
        C8.h();
        ((C3023cI) C8.f27721u).E(wh);
        return (C3023cI) C8.j();
    }
}
