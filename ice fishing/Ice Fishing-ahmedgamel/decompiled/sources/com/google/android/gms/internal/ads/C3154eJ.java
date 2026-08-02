package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.eJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3154eJ extends OG {

    /* renamed from: a, reason: collision with root package name */
    public final FE f30699a;

    public C3154eJ(FE fe) {
        this.f30699a = fe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f30699a != FE.f25525M;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3154eJ) && ((C3154eJ) obj).f30699a == this.f30699a;
    }

    public final int hashCode() {
        return Objects.hash(C3154eJ.class, this.f30699a);
    }

    public final String toString() {
        String str = this.f30699a.f25532u;
        return D.x.p(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
