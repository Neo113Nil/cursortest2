package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class RE extends AbstractC4226yE {

    /* renamed from: b, reason: collision with root package name */
    public final TE f27937b;

    /* renamed from: c, reason: collision with root package name */
    public final C3128du f27938c;

    /* renamed from: d, reason: collision with root package name */
    public final C3263gK f27939d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f27940e;

    public RE(TE te, C3128du c3128du, C3263gK c3263gK, Integer num) {
        this.f27937b = te;
        this.f27938c = c3128du;
        this.f27939d = c3263gK;
        this.f27940e = num;
    }

    public static RE j(C3579mE c3579mE, C3128du c3128du, Integer num) {
        C3263gK b9;
        C3579mE c3579mE2 = C3579mE.f32696D;
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
            throw new GeneralSecurityException(D.x.k(length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 74)));
        }
        TE te = new TE(c3579mE);
        if (c3579mE == c3579mE2) {
            b9 = AbstractC3367iG.f31791a;
        } else if (c3579mE == C3579mE.f32695C) {
            b9 = AbstractC3367iG.a(num.intValue());
        } else {
            if (c3579mE != C3579mE.f32694B) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3367iG.b(num.intValue());
        }
        return new RE(te, c3128du, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3848rE b() {
        return this.f27937b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f27940e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4226yE
    public final C3263gK i() {
        return this.f27939d;
    }
}
