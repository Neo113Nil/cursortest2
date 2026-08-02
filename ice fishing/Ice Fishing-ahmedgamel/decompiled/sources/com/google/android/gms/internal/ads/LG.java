package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class LG extends OG {

    /* renamed from: a, reason: collision with root package name */
    public final int f26887a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26888b;

    /* renamed from: c, reason: collision with root package name */
    public final FE f26889c;

    /* renamed from: d, reason: collision with root package name */
    public final KG f26890d;

    public LG(int i, int i4, FE fe, KG kg) {
        this.f26887a = i;
        this.f26888b = i4;
        this.f26889c = fe;
        this.f26890d = kg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f26889c != FE.f25522I;
    }

    public final int b() {
        FE fe = FE.f25522I;
        int i = this.f26888b;
        FE fe2 = this.f26889c;
        if (fe2 == fe) {
            return i;
        }
        if (fe2 == FE.f25519F || fe2 == FE.f25520G || fe2 == FE.f25521H) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LG)) {
            return false;
        }
        LG lg = (LG) obj;
        return lg.f26887a == this.f26887a && lg.b() == b() && lg.f26889c == this.f26889c && lg.f26890d == this.f26890d;
    }

    public final int hashCode() {
        return Objects.hash(LG.class, Integer.valueOf(this.f26887a), Integer.valueOf(this.f26888b), this.f26889c, this.f26890d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26889c);
        String valueOf2 = String.valueOf(this.f26890d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.f26888b;
        int length3 = String.valueOf(i).length();
        int i4 = this.f26887a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i4).length() + 10);
        AbstractC5128c.h(sb, "HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        AbstractC5128c.g(sb, ", ", i, "-byte tags, and ", i4);
        sb.append("-byte key)");
        return sb.toString();
    }
}
