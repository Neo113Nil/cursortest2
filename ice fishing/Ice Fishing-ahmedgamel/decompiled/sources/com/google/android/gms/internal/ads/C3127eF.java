package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.eF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3127eF extends AbstractC4203yE {

    /* renamed from: b, reason: collision with root package name */
    public final C3235gF f29901b;

    /* renamed from: c, reason: collision with root package name */
    public final C3105du f29902c;

    /* renamed from: d, reason: collision with root package name */
    public final C3240gK f29903d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f29904e;

    public C3127eF(C3235gF c3235gF, C3105du c3105du, C3240gK c3240gK, Integer num) {
        this.f29901b = c3235gF;
        this.f29902c = c3105du;
        this.f29903d = c3240gK;
        this.f29904e = num;
    }

    public static C3127eF j(C3235gF c3235gF, C3105du c3105du, Integer num) {
        C3240gK b9;
        C3556mE c3556mE = c3235gF.f30549a;
        C3556mE c3556mE2 = C3556mE.f31918F;
        String str = c3556mE.f31931u;
        if (c3556mE != c3556mE2 && num == null) {
            throw new GeneralSecurityException(D.y.s(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c3556mE == c3556mE2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C3240gK c3240gK = (C3240gK) c3105du.f29859u;
        if (c3240gK.f30559a.length != 32) {
            int length = c3240gK.f30559a.length;
            throw new GeneralSecurityException(D.y.m(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
        }
        if (c3556mE == c3556mE2) {
            b9 = AbstractC3344iG.f31018a;
        } else {
            if (c3556mE != C3556mE.f31917E) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3344iG.b(num.intValue());
        }
        return new C3127eF(c3235gF, c3105du, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3825rE b() {
        return this.f29901b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f29904e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4203yE
    public final C3240gK i() {
        return this.f29903d;
    }
}
