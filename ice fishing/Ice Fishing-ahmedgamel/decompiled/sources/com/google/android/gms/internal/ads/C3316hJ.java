package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3316hJ extends AJ {

    /* renamed from: b, reason: collision with root package name */
    public final C3154eJ f31522b;

    /* renamed from: c, reason: collision with root package name */
    public final C3263gK f31523c;

    /* renamed from: d, reason: collision with root package name */
    public final C3263gK f31524d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f31525e;

    public C3316hJ(C3154eJ c3154eJ, C3263gK c3263gK, C3263gK c3263gK2, Integer num) {
        this.f31522b = c3154eJ;
        this.f31523c = c3263gK;
        this.f31524d = c3263gK2;
        this.f31525e = num;
    }

    public static C3316hJ j(FE fe, C3263gK c3263gK, Integer num) {
        C3263gK a9;
        C3154eJ c3154eJ = new C3154eJ(fe);
        FE fe2 = FE.f25525M;
        boolean equals = fe.equals(fe2);
        String str = fe.f25532u;
        if (!equals && num == null) {
            throw new GeneralSecurityException(D.x.p(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (fe.equals(fe2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        byte[] bArr = c3263gK.f31325a;
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(D.x.k(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (fe == fe2) {
            a9 = AbstractC3367iG.f31791a;
        } else if (fe == FE.f25523K || fe == FE.f25524L) {
            a9 = AbstractC3367iG.a(num.intValue());
        } else {
            if (fe != FE.J) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            a9 = AbstractC3367iG.b(num.intValue());
        }
        return new C3316hJ(c3154eJ, c3263gK, a9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3848rE b() {
        return this.f31522b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f31525e;
    }

    @Override // com.google.android.gms.internal.ads.AJ
    public final C3263gK i() {
        return this.f31524d;
    }
}
