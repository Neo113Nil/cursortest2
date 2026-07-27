package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4191y2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35082b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35083c;

    public C4191y2(int i, int i6, float f3) {
        this.f35081a = i;
        this.f35082b = i6;
        this.f35083c = f3;
    }

    public static /* synthetic */ C4191y2 a(int i) {
        int i6 = i >> 13;
        if (i6 == 0) {
            return null;
        }
        return new C4191y2(i6, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4191y2)) {
            return false;
        }
        C4191y2 c4191y2 = (C4191y2) obj;
        return this.f35081a == c4191y2.f35081a && this.f35082b == c4191y2.f35082b && Float.compare(this.f35083c, c4191y2.f35083c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35083c) + (((this.f35081a * 31) + this.f35082b) * 31);
    }

    public final String toString() {
        int i = this.f35081a;
        int length = String.valueOf(i).length();
        int i6 = this.f35082b;
        int length2 = String.valueOf(i6).length();
        float f3 = this.f35083c;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f3).length() + 1);
        u1.h.h(sb, "GainField{name=", i, ", originator=", i6);
        sb.append(", gain=");
        sb.append(f3);
        sb.append("}");
        return sb.toString();
    }
}
