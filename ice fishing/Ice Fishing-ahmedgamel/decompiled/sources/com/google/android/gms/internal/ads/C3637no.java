package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3637no {

    /* renamed from: a, reason: collision with root package name */
    public final long f32768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32769b;

    public C3637no(long j6, int i) {
        this.f32768a = j6;
        this.f32769b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3637no) {
            C3637no c3637no = (C3637no) obj;
            if (this.f32768a == c3637no.f32768a && this.f32769b == c3637no.f32769b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f32768a;
        return ((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f32769b;
    }

    public final String toString() {
        long j6 = this.f32768a;
        int length = String.valueOf(j6).length();
        int i = this.f32769b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        D.y.x(sb, "OnDeviceStorageKey{id=", j6, ", eventType=");
        return u1.h.e(i, "}", sb);
    }
}
