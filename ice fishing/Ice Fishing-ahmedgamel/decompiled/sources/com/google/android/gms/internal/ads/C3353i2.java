package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3353i2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f31760a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31761b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31762c;

    public C3353i2(int i, long j6, long j9) {
        AbstractC2792Sd.i(j6 < j9);
        this.f31760a = j6;
        this.f31761b = j9;
        this.f31762c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3353i2.class == obj.getClass()) {
            C3353i2 c3353i2 = (C3353i2) obj;
            if (this.f31760a == c3353i2.f31760a && this.f31761b == c3353i2.f31761b && this.f31762c == c3353i2.f31762c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f31760a), Long.valueOf(this.f31761b), Integer.valueOf(this.f31762c));
    }

    public final String toString() {
        String str = AbstractC3182eu.f30782a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f31760a + ", endTimeMs=" + this.f31761b + ", speedDivisor=" + this.f31762c;
    }
}
