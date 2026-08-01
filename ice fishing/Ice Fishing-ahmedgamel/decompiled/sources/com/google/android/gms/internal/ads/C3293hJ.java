package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3293hJ extends AJ {

    /* renamed from: b, reason: collision with root package name */
    public final C3131eJ f30756b;

    /* renamed from: c, reason: collision with root package name */
    public final C3240gK f30757c;

    /* renamed from: d, reason: collision with root package name */
    public final C3240gK f30758d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f30759e;

    public C3293hJ(C3131eJ c3131eJ, C3240gK c3240gK, C3240gK c3240gK2, Integer num) {
        this.f30756b = c3131eJ;
        this.f30757c = c3240gK;
        this.f30758d = c3240gK2;
        this.f30759e = num;
    }

    public static C3293hJ j(FE fe, C3240gK c3240gK, Integer num) {
        C3240gK a9;
        C3131eJ c3131eJ = new C3131eJ(fe);
        FE fe2 = FE.f24769M;
        boolean equals = fe.equals(fe2);
        String str = fe.f24776u;
        if (!equals && num == null) {
            throw new GeneralSecurityException(D.y.s(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (fe.equals(fe2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        byte[] bArr = c3240gK.f30559a;
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(D.y.m(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (fe == fe2) {
            a9 = AbstractC3344iG.f31018a;
        } else if (fe == FE.f24767K || fe == FE.f24768L) {
            a9 = AbstractC3344iG.a(num.intValue());
        } else {
            if (fe != FE.J) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            a9 = AbstractC3344iG.b(num.intValue());
        }
        return new C3293hJ(c3131eJ, c3240gK, a9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3825rE b() {
        return this.f30756b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f30759e;
    }

    @Override // com.google.android.gms.internal.ads.AJ
    public final C3240gK i() {
        return this.f30758d;
    }
}
