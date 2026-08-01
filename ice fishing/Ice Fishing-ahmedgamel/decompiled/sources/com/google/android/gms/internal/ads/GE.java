package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class GE extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final int f24954a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24955b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24956c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24957d;

    /* renamed from: e, reason: collision with root package name */
    public final C3556mE f24958e;

    /* renamed from: f, reason: collision with root package name */
    public final FE f24959f;

    public GE(int i, int i6, int i9, int i10, C3556mE c3556mE, FE fe) {
        this.f24954a = i;
        this.f24955b = i6;
        this.f24956c = i9;
        this.f24957d = i10;
        this.f24958e = c3556mE;
        this.f24959f = fe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f24958e != C3556mE.f31913A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GE)) {
            return false;
        }
        GE ge = (GE) obj;
        return ge.f24954a == this.f24954a && ge.f24955b == this.f24955b && ge.f24956c == this.f24956c && ge.f24957d == this.f24957d && ge.f24958e == this.f24958e && ge.f24959f == this.f24959f;
    }

    public final int hashCode() {
        return Objects.hash(GE.class, Integer.valueOf(this.f24954a), Integer.valueOf(this.f24955b), Integer.valueOf(this.f24956c), Integer.valueOf(this.f24957d), this.f24958e, this.f24959f);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24958e);
        String valueOf2 = String.valueOf(this.f24959f);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.f24956c;
        int length3 = String.valueOf(i).length();
        int i6 = this.f24957d;
        int length4 = String.valueOf(i6).length();
        int i9 = this.f24954a;
        int length5 = String.valueOf(i9).length();
        int i10 = this.f24955b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i10).length() + 15);
        u1.h.i(sb, "AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        u1.h.h(sb, ", ", i, "-byte IV, and ", i6);
        u1.h.h(sb, "-byte tags, and ", i9, "-byte AES key, and ", i10);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
