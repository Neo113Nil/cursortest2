package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class RE extends AbstractC4203yE {

    /* renamed from: b, reason: collision with root package name */
    public final TE f27181b;

    /* renamed from: c, reason: collision with root package name */
    public final C3105du f27182c;

    /* renamed from: d, reason: collision with root package name */
    public final C3240gK f27183d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f27184e;

    public RE(TE te, C3105du c3105du, C3240gK c3240gK, Integer num) {
        this.f27181b = te;
        this.f27182c = c3105du;
        this.f27183d = c3240gK;
        this.f27184e = num;
    }

    public static RE j(C3556mE c3556mE, C3105du c3105du, Integer num) {
        C3240gK b9;
        C3556mE c3556mE2 = C3556mE.f31916D;
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
            throw new GeneralSecurityException(D.y.m(length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 74)));
        }
        TE te = new TE(c3556mE);
        if (c3556mE == c3556mE2) {
            b9 = AbstractC3344iG.f31018a;
        } else if (c3556mE == C3556mE.f31915C) {
            b9 = AbstractC3344iG.a(num.intValue());
        } else {
            if (c3556mE != C3556mE.f31914B) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3344iG.b(num.intValue());
        }
        return new RE(te, c3105du, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3825rE b() {
        return this.f27181b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f27184e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4203yE
    public final C3240gK i() {
        return this.f27183d;
    }
}
