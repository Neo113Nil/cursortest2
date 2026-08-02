package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3242g implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f31248n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f31249u;

    public C3242g(DP dp, int i) {
        this.f31248n = 1 == (dp.f25167e & 1);
        this.f31249u = SP.K(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3242g c3242g = (C3242g) obj;
        return KB.f26626a.d(this.f31249u, c3242g.f31249u).d(this.f31248n, c3242g.f31248n).e();
    }
}
