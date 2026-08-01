package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3219g implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f30482n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f30483u;

    public C3219g(DP dp, int i) {
        this.f30482n = 1 == (dp.f24422e & 1);
        this.f30483u = RP.K(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3219g c3219g = (C3219g) obj;
        return KB.f25874a.d(this.f30483u, c3219g.f30483u).d(this.f30482n, c3219g.f30482n).e();
    }
}
