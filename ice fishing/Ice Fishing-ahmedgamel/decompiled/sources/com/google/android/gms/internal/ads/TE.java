package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class TE extends AbstractC4280zE {

    /* renamed from: a, reason: collision with root package name */
    public final C3579mE f28492a;

    public TE(C3579mE c3579mE) {
        this.f28492a = c3579mE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f28492a != C3579mE.f32696D;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TE) && ((TE) obj).f28492a == this.f28492a;
    }

    public final int hashCode() {
        return Objects.hash(TE.class, this.f28492a);
    }

    public final String toString() {
        String str = this.f28492a.f32711u;
        return D.x.p(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
