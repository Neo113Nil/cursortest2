package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.eF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3150eF extends AbstractC4226yE {

    /* renamed from: b, reason: collision with root package name */
    public final C3258gF f30693b;

    /* renamed from: c, reason: collision with root package name */
    public final C3128du f30694c;

    /* renamed from: d, reason: collision with root package name */
    public final C3263gK f30695d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f30696e;

    public C3150eF(C3258gF c3258gF, C3128du c3128du, C3263gK c3263gK, Integer num) {
        this.f30693b = c3258gF;
        this.f30694c = c3128du;
        this.f30695d = c3263gK;
        this.f30696e = num;
    }

    public static C3150eF j(C3258gF c3258gF, C3128du c3128du, Integer num) {
        C3263gK b9;
        C3579mE c3579mE = c3258gF.f31315a;
        C3579mE c3579mE2 = C3579mE.f32698F;
        String str = c3579mE.f32711u;
        if (c3579mE != c3579mE2 && num == null) {
            throw new GeneralSecurityException(D.x.p(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c3579mE == c3579mE2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C3263gK c3263gK = (C3263gK) c3128du.f30647u;
        if (c3263gK.f31325a.length != 32) {
            int length = c3263gK.f31325a.length;
            throw new GeneralSecurityException(D.x.k(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
        }
        if (c3579mE == c3579mE2) {
            b9 = AbstractC3367iG.f31791a;
        } else {
            if (c3579mE != C3579mE.f32697E) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3367iG.b(num.intValue());
        }
        return new C3150eF(c3258gF, c3128du, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3848rE b() {
        return this.f30693b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f30696e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4226yE
    public final C3263gK i() {
        return this.f30695d;
    }
}
