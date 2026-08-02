package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.px, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3777px implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f33947a;

    /* renamed from: b, reason: collision with root package name */
    public final float f33948b;

    public C3777px(float f2, float f9) {
        boolean z6 = false;
        if (f2 >= -90.0f && f2 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f) {
            z6 = true;
        }
        AbstractC2792Sd.q("Invalid latitude or longitude", z6);
        this.f33947a = f2;
        this.f33948b = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3777px.class == obj.getClass()) {
            C3777px c3777px = (C3777px) obj;
            if (this.f33947a == c3777px.f33947a && this.f33948b == c3777px.f33948b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33948b) + ((Float.hashCode(this.f33947a) + 527) * 31);
    }

    public final String toString() {
        float f2 = this.f33947a;
        int length = String.valueOf(f2).length();
        float f9 = this.f33948b;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f9).length());
        sb.append("xyz: latitude=");
        sb.append(f2);
        sb.append(", longitude=");
        sb.append(f9);
        return sb.toString();
    }
}
