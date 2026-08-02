package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.oo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3714oo {

    /* renamed from: a, reason: collision with root package name */
    public final long f33730a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33731b;

    public C3714oo(long j6, int i) {
        this.f33730a = j6;
        this.f33731b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3714oo) {
            C3714oo c3714oo = (C3714oo) obj;
            if (this.f33730a == c3714oo.f33730a && this.f33731b == c3714oo.f33731b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f33730a;
        return ((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f33731b;
    }

    public final String toString() {
        long j6 = this.f33730a;
        int length = String.valueOf(j6).length();
        int i = this.f33731b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        com.IceFishing.LiveIceFishing.k.z(sb, "OnDeviceStorageKey{id=", j6, ", eventType=");
        return AbstractC5128c.e(i, "}", sb);
    }
}
