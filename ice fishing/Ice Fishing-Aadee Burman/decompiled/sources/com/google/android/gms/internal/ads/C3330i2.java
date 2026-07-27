package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3330i2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f30987a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30988b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30989c;

    public C3330i2(int i, long j6, long j9) {
        AbstractC2772Sd.i(j6 < j9);
        this.f30987a = j6;
        this.f30988b = j9;
        this.f30989c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3330i2.class == obj.getClass()) {
            C3330i2 c3330i2 = (C3330i2) obj;
            if (this.f30987a == c3330i2.f30987a && this.f30988b == c3330i2.f30988b && this.f30989c == c3330i2.f30989c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f30987a), Long.valueOf(this.f30988b), Integer.valueOf(this.f30989c));
    }

    public final String toString() {
        String str = AbstractC3159eu.f29993a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f30987a + ", endTimeMs=" + this.f30988b + ", speedDivisor=" + this.f30989c;
    }
}
