package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.dF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3084dF extends AbstractC4270zE {

    /* renamed from: b, reason: collision with root package name */
    public final C3138eF f29991b;

    /* renamed from: c, reason: collision with root package name */
    public final C3791qK f29992c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f29993d;

    public C3084dF(C3138eF c3138eF, C3791qK c3791qK, Integer num) {
        this.f29991b = c3138eF;
        this.f29992c = c3791qK;
        this.f29993d = num;
    }

    public static C3084dF k(C3138eF c3138eF, Integer num) {
        C3791qK b9;
        GE ge = c3138eF.f30336a;
        if (ge == GE.f25123l) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b9 = AbstractC3571mG.f32676a;
        } else {
            if (ge != GE.f25122k) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(ge)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b9 = AbstractC3571mG.b(num.intValue());
        }
        return new C3084dF(c3138eF, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final /* synthetic */ AbstractC4000uE b() {
        return this.f29991b;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return this.f29993d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4270zE
    public final C3791qK j() {
        return this.f29992c;
    }
}
