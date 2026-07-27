package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class GG extends OG {

    /* renamed from: a, reason: collision with root package name */
    public final int f24961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24962b;

    /* renamed from: c, reason: collision with root package name */
    public final C3933tE f24963c;

    public GG(int i, int i6, C3933tE c3933tE) {
        this.f24961a = i;
        this.f24962b = i6;
        this.f24963c = c3933tE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f24963c != C3933tE.f34246u;
    }

    public final int b() {
        C3933tE c3933tE = C3933tE.f34246u;
        int i = this.f24962b;
        C3933tE c3933tE2 = this.f24963c;
        if (c3933tE2 == c3933tE) {
            return i;
        }
        if (c3933tE2 == C3933tE.f34243r || c3933tE2 == C3933tE.f34244s || c3933tE2 == C3933tE.f34245t) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GG)) {
            return false;
        }
        GG gg = (GG) obj;
        return gg.f24961a == this.f24961a && gg.b() == b() && gg.f24963c == this.f24963c;
    }

    public final int hashCode() {
        return Objects.hash(GG.class, Integer.valueOf(this.f24961a), Integer.valueOf(this.f24962b), this.f24963c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24963c);
        int length = valueOf.length();
        int i = this.f24962b;
        int length2 = String.valueOf(i).length();
        int i6 = this.f24961a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i6).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        return u1.h.d(i6, "-byte tags, and ", "-byte key)", sb);
    }
}
