package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3436k2 implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f31370a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31371b;

    public C3436k2(float f3, int i) {
        this.f31370a = f3;
        this.f31371b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3436k2.class == obj.getClass()) {
            C3436k2 c3436k2 = (C3436k2) obj;
            if (this.f31370a == c3436k2.f31370a && this.f31371b == c3436k2.f31371b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f31370a) + 527) * 31) + this.f31371b;
    }

    public final String toString() {
        float f3 = this.f31370a;
        int length = String.valueOf(f3).length();
        int i = this.f31371b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f3);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }
}
