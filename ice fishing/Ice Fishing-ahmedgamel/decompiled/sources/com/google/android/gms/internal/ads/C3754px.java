package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.px, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3754px implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f33163a;

    /* renamed from: b, reason: collision with root package name */
    public final float f33164b;

    public C3754px(float f3, float f9) {
        boolean z3 = false;
        if (f3 >= -90.0f && f3 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f) {
            z3 = true;
        }
        AbstractC2772Sd.q("Invalid latitude or longitude", z3);
        this.f33163a = f3;
        this.f33164b = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3754px.class == obj.getClass()) {
            C3754px c3754px = (C3754px) obj;
            if (this.f33163a == c3754px.f33163a && this.f33164b == c3754px.f33164b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33164b) + ((Float.hashCode(this.f33163a) + 527) * 31);
    }

    public final String toString() {
        float f3 = this.f33163a;
        int length = String.valueOf(f3).length();
        float f9 = this.f33164b;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f9).length());
        sb.append("xyz: latitude=");
        sb.append(f3);
        sb.append(", longitude=");
        sb.append(f9);
        return sb.toString();
    }
}
