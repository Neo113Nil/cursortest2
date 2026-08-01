package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3289hF extends AbstractC4203yE {

    /* renamed from: b, reason: collision with root package name */
    public final C3395jF f30750b;

    /* renamed from: c, reason: collision with root package name */
    public final C3105du f30751c;

    /* renamed from: d, reason: collision with root package name */
    public final C3240gK f30752d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f30753e;

    public C3289hF(C3395jF c3395jF, C3105du c3105du, C3240gK c3240gK, Integer num) {
        this.f30750b = c3395jF;
        this.f30751c = c3105du;
        this.f30752d = c3240gK;
        this.f30753e = num;
    }

    public static C3289hF j(C3879sE c3879sE, C3105du c3105du, Integer num) {
        C3240gK b9;
        C3879sE c3879sE2 = C3879sE.f33920o;
        String str = c3879sE.f33928b;
        if (c3879sE != c3879sE2 && num == null) {
            throw new GeneralSecurityException(D.y.s(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c3879sE == c3879sE2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C3240gK c3240gK = (C3240gK) c3105du.f29859u;
        if (c3240gK.f30559a.length != 32) {
            int length = c3240gK.f30559a.length;
            throw new GeneralSecurityException(D.y.m(length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 75)));
        }
        C3395jF c3395jF = new C3395jF(c3879sE);
        if (c3879sE == c3879sE2) {
            b9 = AbstractC3344iG.f31018a;
        } else if (c3879sE == C3879sE.f33919n) {
            b9 = AbstractC3344iG.a(num.intValue());
        } else {
            if (c3879sE != C3879sE.f33918m) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3344iG.b(num.intValue());
        }
        return new C3289hF(c3395jF, c3105du, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3825rE b() {
        return this.f30750b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f30753e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4203yE
    public final C3240gK i() {
        return this.f30752d;
    }
}
