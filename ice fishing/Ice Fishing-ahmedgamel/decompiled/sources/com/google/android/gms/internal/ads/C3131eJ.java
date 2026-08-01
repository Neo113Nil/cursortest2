package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.eJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3131eJ extends OG {

    /* renamed from: a, reason: collision with root package name */
    public final FE f29907a;

    public C3131eJ(FE fe) {
        this.f29907a = fe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f29907a != FE.f24769M;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3131eJ) && ((C3131eJ) obj).f29907a == this.f29907a;
    }

    public final int hashCode() {
        return Objects.hash(C3131eJ.class, this.f29907a);
    }

    public final String toString() {
        String str = this.f29907a.f24776u;
        return D.y.s(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
