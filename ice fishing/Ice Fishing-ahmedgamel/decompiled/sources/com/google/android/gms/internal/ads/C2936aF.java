package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.aF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2936aF extends AbstractC4226yE {

    /* renamed from: b, reason: collision with root package name */
    public final C2990bF f29813b;

    /* renamed from: c, reason: collision with root package name */
    public final C3263gK f29814c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f29815d;

    public C2936aF(C2990bF c2990bF, C3263gK c3263gK, Integer num) {
        this.f29813b = c2990bF;
        this.f29814c = c3263gK;
        this.f29815d = num;
    }

    public static C2936aF j(C2990bF c2990bF, Integer num) {
        C3263gK b9;
        FE fe = c2990bF.f30036a;
        if (fe == FE.f25518E) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b9 = AbstractC3367iG.f31791a;
        } else {
            if (fe != FE.f25517D) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(fe)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b9 = AbstractC3367iG.b(num.intValue());
        }
        return new C2936aF(c2990bF, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3848rE b() {
        return this.f29813b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f29815d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4226yE
    public final C3263gK i() {
        return this.f29814c;
    }
}
