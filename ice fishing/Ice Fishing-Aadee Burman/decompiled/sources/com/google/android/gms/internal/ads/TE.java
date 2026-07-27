package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class TE extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final C3556mE f27709a;

    public TE(C3556mE c3556mE) {
        this.f27709a = c3556mE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f27709a != C3556mE.f31916D;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TE) && ((TE) obj).f27709a == this.f27709a;
    }

    public final int hashCode() {
        return Objects.hash(TE.class, this.f27709a);
    }

    public final String toString() {
        String str = this.f27709a.f31931u;
        return D.y.s(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
