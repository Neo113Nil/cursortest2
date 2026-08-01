package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class LG extends OG {

    /* renamed from: a, reason: collision with root package name */
    public final int f26087a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26088b;

    /* renamed from: c, reason: collision with root package name */
    public final FE f26089c;

    /* renamed from: d, reason: collision with root package name */
    public final KG f26090d;

    public LG(int i, int i6, FE fe, KG kg) {
        this.f26087a = i;
        this.f26088b = i6;
        this.f26089c = fe;
        this.f26090d = kg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f26089c != FE.f24766I;
    }

    public final int b() {
        FE fe = FE.f24766I;
        int i = this.f26088b;
        FE fe2 = this.f26089c;
        if (fe2 == fe) {
            return i;
        }
        if (fe2 == FE.f24763F || fe2 == FE.f24764G || fe2 == FE.f24765H) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LG)) {
            return false;
        }
        LG lg = (LG) obj;
        return lg.f26087a == this.f26087a && lg.b() == b() && lg.f26089c == this.f26089c && lg.f26090d == this.f26090d;
    }

    public final int hashCode() {
        return Objects.hash(LG.class, Integer.valueOf(this.f26087a), Integer.valueOf(this.f26088b), this.f26089c, this.f26090d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26089c);
        String valueOf2 = String.valueOf(this.f26090d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.f26088b;
        int length3 = String.valueOf(i).length();
        int i6 = this.f26087a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i6).length() + 10);
        u1.h.i(sb, "HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        u1.h.h(sb, ", ", i, "-byte tags, and ", i6);
        sb.append("-byte key)");
        return sb.toString();
    }
}
