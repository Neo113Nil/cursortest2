package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class WE extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final HE f28375a;

    public WE(HE he) {
        this.f28375a = he;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f28375a != HE.f25333h;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WE) && ((WE) obj).f28375a == this.f28375a;
    }

    public final int hashCode() {
        return Objects.hash(WE.class, this.f28375a);
    }

    public final String toString() {
        String str = this.f28375a.f25338b;
        return D.y.o(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
