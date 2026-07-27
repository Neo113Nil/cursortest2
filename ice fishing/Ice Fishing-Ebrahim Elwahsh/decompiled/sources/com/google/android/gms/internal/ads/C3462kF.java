package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.kF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3462kF extends AbstractC4270zE {

    /* renamed from: b, reason: collision with root package name */
    public final C3570mF f32281b;

    /* renamed from: c, reason: collision with root package name */
    public final Mu f32282c;

    /* renamed from: d, reason: collision with root package name */
    public final C3791qK f32283d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f32284e;

    public C3462kF(C3570mF c3570mF, Mu mu, C3791qK c3791qK, Integer num) {
        this.f32281b = c3570mF;
        this.f32282c = mu;
        this.f32283d = c3791qK;
        this.f32284e = num;
    }

    public static C3462kF k(LE le, Mu mu, Integer num) {
        C3791qK b9;
        LE le2 = LE.f26119C;
        String str = le.f26130u;
        if (le != le2 && num == null) {
            throw new GeneralSecurityException(D.y.o(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (le == le2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C3791qK c3791qK = (C3791qK) mu.f26395u;
        if (c3791qK.f33687a.length != 32) {
            int length = c3791qK.f33687a.length;
            throw new GeneralSecurityException(D.y.j(length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 75)));
        }
        C3570mF c3570mF = new C3570mF(le);
        if (le == le2) {
            b9 = AbstractC3571mG.f32676a;
        } else if (le == LE.f26118B) {
            b9 = AbstractC3571mG.a(num.intValue());
        } else {
            if (le != LE.f26117A) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3571mG.b(num.intValue());
        }
        return new C3462kF(c3570mF, mu, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final /* synthetic */ AbstractC4000uE b() {
        return this.f32281b;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return this.f32284e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4270zE
    public final C3791qK j() {
        return this.f32283d;
    }
}
