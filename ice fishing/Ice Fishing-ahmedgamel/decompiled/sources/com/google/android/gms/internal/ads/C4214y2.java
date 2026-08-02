package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4214y2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35868b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35869c;

    public C4214y2(int i, int i4, float f2) {
        this.f35867a = i;
        this.f35868b = i4;
        this.f35869c = f2;
    }

    public static /* synthetic */ C4214y2 a(int i) {
        int i4 = i >> 13;
        if (i4 == 0) {
            return null;
        }
        return new C4214y2(i4, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4214y2)) {
            return false;
        }
        C4214y2 c4214y2 = (C4214y2) obj;
        return this.f35867a == c4214y2.f35867a && this.f35868b == c4214y2.f35868b && Float.compare(this.f35869c, c4214y2.f35869c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35869c) + (((this.f35867a * 31) + this.f35868b) * 31);
    }

    public final String toString() {
        int i = this.f35867a;
        int length = String.valueOf(i).length();
        int i4 = this.f35868b;
        int length2 = String.valueOf(i4).length();
        float f2 = this.f35869c;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f2).length() + 1);
        AbstractC5128c.g(sb, "GainField{name=", i, ", originator=", i4);
        sb.append(", gain=");
        sb.append(f2);
        sb.append("}");
        return sb.toString();
    }
}
