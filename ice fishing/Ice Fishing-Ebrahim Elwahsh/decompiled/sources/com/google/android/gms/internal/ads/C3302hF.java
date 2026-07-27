package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3302hF extends AbstractC4270zE {

    /* renamed from: b, reason: collision with root package name */
    public final C3408jF f31218b;

    /* renamed from: c, reason: collision with root package name */
    public final Mu f31219c;

    /* renamed from: d, reason: collision with root package name */
    public final C3791qK f31220d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f31221e;

    public C3302hF(C3408jF c3408jF, Mu mu, C3791qK c3791qK, Integer num) {
        this.f31218b = c3408jF;
        this.f31219c = mu;
        this.f31220d = c3791qK;
        this.f31221e = num;
    }

    public static C3302hF k(C3408jF c3408jF, Mu mu, Integer num) {
        C3791qK b9;
        HE he = c3408jF.f32094a;
        HE he2 = HE.f25334j;
        String str = he.f25338b;
        if (he != he2 && num == null) {
            throw new GeneralSecurityException(D.y.o(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (he == he2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C3791qK c3791qK = (C3791qK) mu.f26395u;
        if (c3791qK.f33687a.length != 32) {
            int length = c3791qK.f33687a.length;
            throw new GeneralSecurityException(D.y.j(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
        }
        if (he == he2) {
            b9 = AbstractC3571mG.f32676a;
        } else {
            if (he != HE.i) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3571mG.b(num.intValue());
        }
        return new C3302hF(c3408jF, mu, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final /* synthetic */ AbstractC4000uE b() {
        return this.f31218b;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return this.f31221e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4270zE
    public final C3791qK j() {
        return this.f31220d;
    }
}
