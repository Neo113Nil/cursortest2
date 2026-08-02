package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.kF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3472kF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3527lG f32163a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3419jG f32164b;

    /* renamed from: c, reason: collision with root package name */
    public static final TF f32165c;

    /* renamed from: d, reason: collision with root package name */
    public static final RF f32166d;

    static {
        C3263gK a9 = DG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f32163a = new C3527lG(GE.class, VE.f28905I);
        f32164b = new C3419jG(a9, VE.f28902F);
        f32165c = new TF(BE.class, VE.f28903G);
        f32166d = new RF(a9, VE.f28904H);
    }

    public static C3956tE a(C3579mE c3579mE) {
        if (c3579mE.equals(C3579mE.f32708y)) {
            return C3956tE.f35016d;
        }
        if (c3579mE.equals(C3579mE.f32709z)) {
            return C3956tE.f35019g;
        }
        if (c3579mE.equals(C3579mE.f32693A)) {
            return C3956tE.f35018f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3579mE)));
    }

    public static C3579mE b(C3956tE c3956tE) {
        if (c3956tE == C3956tE.f35016d) {
            return C3579mE.f32708y;
        }
        if (c3956tE == C3956tE.f35019g || c3956tE == C3956tE.f35017e) {
            return C3579mE.f32709z;
        }
        if (c3956tE == C3956tE.f35018f) {
            return C3579mE.f32693A;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(c3956tE.f35038b));
    }

    public static FE c(WH wh) {
        int ordinal = wh.ordinal();
        if (ordinal == 1) {
            return FE.f25526v;
        }
        if (ordinal == 2) {
            return FE.f25529y;
        }
        if (ordinal == 3) {
            return FE.f25528x;
        }
        if (ordinal == 4) {
            return FE.f25530z;
        }
        if (ordinal == 5) {
            return FE.f25527w;
        }
        int c9 = wh.c();
        throw new GeneralSecurityException(D.x.k(c9, "Unable to parse HashType: ", new StringBuilder(String.valueOf(c9).length() + 26)));
    }

    public static C3046cI d(GE ge) {
        WH wh;
        C2993bI C8 = C3046cI.C();
        int i = ge.f25747d;
        C8.h();
        ((C3046cI) C8.f28504u).F(i);
        FE fe = FE.f25526v;
        FE fe2 = ge.f25749f;
        if (fe2.equals(fe)) {
            wh = WH.SHA1;
        } else if (fe2.equals(FE.f25527w)) {
            wh = WH.SHA224;
        } else if (fe2.equals(FE.f25528x)) {
            wh = WH.SHA256;
        } else if (fe2.equals(FE.f25529y)) {
            wh = WH.SHA384;
        } else {
            if (!fe2.equals(FE.f25530z)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(fe2)));
            }
            wh = WH.SHA512;
        }
        C8.h();
        ((C3046cI) C8.f28504u).E(wh);
        return (C3046cI) C8.j();
    }
}
