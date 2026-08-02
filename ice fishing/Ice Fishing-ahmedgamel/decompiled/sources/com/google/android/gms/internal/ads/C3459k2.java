package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3459k2 implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f32149a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32150b;

    public C3459k2(float f2, int i) {
        this.f32149a = f2;
        this.f32150b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3459k2.class == obj.getClass()) {
            C3459k2 c3459k2 = (C3459k2) obj;
            if (this.f32149a == c3459k2.f32149a && this.f32150b == c3459k2.f32150b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f32149a) + 527) * 31) + this.f32150b;
    }

    public final String toString() {
        float f2 = this.f32149a;
        int length = String.valueOf(f2).length();
        int i = this.f32150b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f2);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }
}
