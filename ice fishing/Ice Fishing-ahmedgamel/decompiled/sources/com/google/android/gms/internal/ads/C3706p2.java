package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3706p2 implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final long f33016n;

    /* renamed from: u, reason: collision with root package name */
    public final long f33017u;

    /* renamed from: v, reason: collision with root package name */
    public final long f33018v;

    public /* synthetic */ C3706p2(long j6, long j9, long j10) {
        this.f33016n = j6;
        this.f33017u = j9;
        this.f33018v = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f33016n, ((C3706p2) obj).f33016n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3706p2)) {
            return false;
        }
        C3706p2 c3706p2 = (C3706p2) obj;
        return this.f33016n == c3706p2.f33016n && this.f33017u == c3706p2.f33017u && this.f33018v == c3706p2.f33018v;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f33016n), Long.valueOf(this.f33017u), Long.valueOf(this.f33018v));
    }
}
