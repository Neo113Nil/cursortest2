package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4042v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34699b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34700c;

    public C4042v2(int i, int i4, float f6) {
        this.f34698a = i;
        this.f34699b = i4;
        this.f34700c = f6;
    }

    public static /* synthetic */ C4042v2 a(int i) {
        int i4 = i >> 13;
        if (i4 == 0) {
            return null;
        }
        return new C4042v2(i4, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4042v2)) {
            return false;
        }
        C4042v2 c4042v2 = (C4042v2) obj;
        return this.f34698a == c4042v2.f34698a && this.f34699b == c4042v2.f34699b && Float.compare(this.f34700c, c4042v2.f34700c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34700c) + (((this.f34698a * 31) + this.f34699b) * 31);
    }

    public final String toString() {
        int i = this.f34698a;
        int length = String.valueOf(i).length();
        int i4 = this.f34699b;
        int length2 = String.valueOf(i4).length();
        float f6 = this.f34700c;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f6).length() + 1);
        AbstractC5051n.i(sb, "GainField{name=", i, ", originator=", i4);
        sb.append(", gain=");
        sb.append(f6);
        sb.append("}");
        return sb.toString();
    }
}
