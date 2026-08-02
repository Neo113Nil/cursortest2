package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3729p2 implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final long f33806n;

    /* renamed from: u, reason: collision with root package name */
    public final long f33807u;

    /* renamed from: v, reason: collision with root package name */
    public final long f33808v;

    public /* synthetic */ C3729p2(long j6, long j9, long j10) {
        this.f33806n = j6;
        this.f33807u = j9;
        this.f33808v = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f33806n, ((C3729p2) obj).f33806n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3729p2)) {
            return false;
        }
        C3729p2 c3729p2 = (C3729p2) obj;
        return this.f33806n == c3729p2.f33806n && this.f33807u == c3729p2.f33807u && this.f33808v == c3729p2.f33808v;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f33806n), Long.valueOf(this.f33807u), Long.valueOf(this.f33808v));
    }
}
