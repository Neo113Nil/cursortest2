package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class IE extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final int f25539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25541c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25542d;

    /* renamed from: e, reason: collision with root package name */
    public final HE f25543e;

    /* renamed from: f, reason: collision with root package name */
    public final GE f25544f;

    public IE(int i, int i4, int i9, int i10, HE he, GE ge) {
        this.f25539a = i;
        this.f25540b = i4;
        this.f25541c = i9;
        this.f25542d = i10;
        this.f25543e = he;
        this.f25544f = ge;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f25543e != HE.f25330e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IE)) {
            return false;
        }
        IE ie = (IE) obj;
        return ie.f25539a == this.f25539a && ie.f25540b == this.f25540b && ie.f25541c == this.f25541c && ie.f25542d == this.f25542d && ie.f25543e == this.f25543e && ie.f25544f == this.f25544f;
    }

    public final int hashCode() {
        return Objects.hash(IE.class, Integer.valueOf(this.f25539a), Integer.valueOf(this.f25540b), Integer.valueOf(this.f25541c), Integer.valueOf(this.f25542d), this.f25543e, this.f25544f);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25543e);
        String valueOf2 = String.valueOf(this.f25544f);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.f25541c;
        int length3 = String.valueOf(i).length();
        int i4 = this.f25542d;
        int length4 = String.valueOf(i4).length();
        int i9 = this.f25539a;
        int length5 = String.valueOf(i9).length();
        int i10 = this.f25540b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i10).length() + 15);
        AbstractC5051n.j(sb, "AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        AbstractC5051n.i(sb, ", ", i, "-byte IV, and ", i4);
        AbstractC5051n.i(sb, "-byte tags, and ", i9, "-byte AES key, and ", i10);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
