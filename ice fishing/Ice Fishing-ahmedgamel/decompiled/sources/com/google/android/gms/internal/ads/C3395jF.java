package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3395jF extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final C3879sE f31221a;

    public C3395jF(C3879sE c3879sE) {
        this.f31221a = c3879sE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f31221a != C3879sE.f33920o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3395jF) && ((C3395jF) obj).f31221a == this.f31221a;
    }

    public final int hashCode() {
        return Objects.hash(C3395jF.class, this.f31221a);
    }

    public final String toString() {
        String str = this.f31221a.f33928b;
        return D.y.s(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
