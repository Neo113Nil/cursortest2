package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class GE extends AbstractC4280zE {

    /* renamed from: a, reason: collision with root package name */
    public final int f25744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25746c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25747d;

    /* renamed from: e, reason: collision with root package name */
    public final C3579mE f25748e;

    /* renamed from: f, reason: collision with root package name */
    public final FE f25749f;

    public GE(int i, int i4, int i6, int i9, C3579mE c3579mE, FE fe) {
        this.f25744a = i;
        this.f25745b = i4;
        this.f25746c = i6;
        this.f25747d = i9;
        this.f25748e = c3579mE;
        this.f25749f = fe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f25748e != C3579mE.f32693A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GE)) {
            return false;
        }
        GE ge = (GE) obj;
        return ge.f25744a == this.f25744a && ge.f25745b == this.f25745b && ge.f25746c == this.f25746c && ge.f25747d == this.f25747d && ge.f25748e == this.f25748e && ge.f25749f == this.f25749f;
    }

    public final int hashCode() {
        return Objects.hash(GE.class, Integer.valueOf(this.f25744a), Integer.valueOf(this.f25745b), Integer.valueOf(this.f25746c), Integer.valueOf(this.f25747d), this.f25748e, this.f25749f);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25748e);
        String valueOf2 = String.valueOf(this.f25749f);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.f25746c;
        int length3 = String.valueOf(i).length();
        int i4 = this.f25747d;
        int length4 = String.valueOf(i4).length();
        int i6 = this.f25744a;
        int length5 = String.valueOf(i6).length();
        int i9 = this.f25745b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i9).length() + 15);
        AbstractC5128c.h(sb, "AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        AbstractC5128c.g(sb, ", ", i, "-byte IV, and ", i4);
        AbstractC5128c.g(sb, "-byte tags, and ", i6, "-byte AES key, and ", i9);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
