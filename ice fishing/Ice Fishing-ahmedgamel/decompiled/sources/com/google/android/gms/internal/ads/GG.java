package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class GG extends OG {

    /* renamed from: a, reason: collision with root package name */
    public final int f25751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25752b;

    /* renamed from: c, reason: collision with root package name */
    public final C3956tE f25753c;

    public GG(int i, int i4, C3956tE c3956tE) {
        this.f25751a = i;
        this.f25752b = i4;
        this.f25753c = c3956tE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f25753c != C3956tE.f35032u;
    }

    public final int b() {
        C3956tE c3956tE = C3956tE.f35032u;
        int i = this.f25752b;
        C3956tE c3956tE2 = this.f25753c;
        if (c3956tE2 == c3956tE) {
            return i;
        }
        if (c3956tE2 == C3956tE.f35029r || c3956tE2 == C3956tE.f35030s || c3956tE2 == C3956tE.f35031t) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GG)) {
            return false;
        }
        GG gg = (GG) obj;
        return gg.f25751a == this.f25751a && gg.b() == b() && gg.f25753c == this.f25753c;
    }

    public final int hashCode() {
        return Objects.hash(GG.class, Integer.valueOf(this.f25751a), Integer.valueOf(this.f25752b), this.f25753c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25753c);
        int length = valueOf.length();
        int i = this.f25752b;
        int length2 = String.valueOf(i).length();
        int i4 = this.f25751a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i4).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        return AbstractC5128c.d(i4, "-byte tags, and ", "-byte key)", sb);
    }
}
