package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.aF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2913aF extends AbstractC4203yE {

    /* renamed from: b, reason: collision with root package name */
    public final C2967bF f29043b;

    /* renamed from: c, reason: collision with root package name */
    public final C3240gK f29044c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f29045d;

    public C2913aF(C2967bF c2967bF, C3240gK c3240gK, Integer num) {
        this.f29043b = c2967bF;
        this.f29044c = c3240gK;
        this.f29045d = num;
    }

    public static C2913aF j(C2967bF c2967bF, Integer num) {
        C3240gK b9;
        FE fe = c2967bF.f29248a;
        if (fe == FE.f24762E) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b9 = AbstractC3344iG.f31018a;
        } else {
            if (fe != FE.f24761D) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(fe)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b9 = AbstractC3344iG.b(num.intValue());
        }
        return new C2913aF(c2967bF, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3825rE b() {
        return this.f29043b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f29045d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4203yE
    public final C3240gK i() {
        return this.f29044c;
    }
}
