package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3343i2 implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f31308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31309b;

    public C3343i2(float f6, int i) {
        this.f31308a = f6;
        this.f31309b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3343i2.class == obj.getClass()) {
            C3343i2 c3343i2 = (C3343i2) obj;
            if (this.f31308a == c3343i2.f31308a && this.f31309b == c3343i2.f31309b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f31308a) + 527) * 31) + this.f31309b;
    }

    public final String toString() {
        float f6 = this.f31308a;
        int length = String.valueOf(f6).length();
        int i = this.f31309b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f6);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }
}
