package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3418jF extends AbstractC4280zE {

    /* renamed from: a, reason: collision with root package name */
    public final C3902sE f32008a;

    public C3418jF(C3902sE c3902sE) {
        this.f32008a = c3902sE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f32008a != C3902sE.f34688o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3418jF) && ((C3418jF) obj).f32008a == this.f32008a;
    }

    public final int hashCode() {
        return Objects.hash(C3418jF.class, this.f32008a);
    }

    public final String toString() {
        String str = this.f32008a.f34696b;
        return D.x.p(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
