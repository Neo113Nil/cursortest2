package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3312hF extends AbstractC4226yE {

    /* renamed from: b, reason: collision with root package name */
    public final C3418jF f31516b;

    /* renamed from: c, reason: collision with root package name */
    public final C3128du f31517c;

    /* renamed from: d, reason: collision with root package name */
    public final C3263gK f31518d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f31519e;

    public C3312hF(C3418jF c3418jF, C3128du c3128du, C3263gK c3263gK, Integer num) {
        this.f31516b = c3418jF;
        this.f31517c = c3128du;
        this.f31518d = c3263gK;
        this.f31519e = num;
    }

    public static C3312hF j(C3902sE c3902sE, C3128du c3128du, Integer num) {
        C3263gK b9;
        C3902sE c3902sE2 = C3902sE.f34688o;
        String str = c3902sE.f34696b;
        if (c3902sE != c3902sE2 && num == null) {
            throw new GeneralSecurityException(D.x.p(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c3902sE == c3902sE2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C3263gK c3263gK = (C3263gK) c3128du.f30647u;
        if (c3263gK.f31325a.length != 32) {
            int length = c3263gK.f31325a.length;
            throw new GeneralSecurityException(D.x.k(length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 75)));
        }
        C3418jF c3418jF = new C3418jF(c3902sE);
        if (c3902sE == c3902sE2) {
            b9 = AbstractC3367iG.f31791a;
        } else if (c3902sE == C3902sE.f34687n) {
            b9 = AbstractC3367iG.a(num.intValue());
        } else {
            if (c3902sE != C3902sE.f34686m) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3367iG.b(num.intValue());
        }
        return new C3312hF(c3418jF, c3128du, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3848rE b() {
        return this.f31516b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f31519e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4226yE
    public final C3263gK i() {
        return this.f31518d;
    }
}
