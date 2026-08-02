package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Z3 implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f29615n;

    /* renamed from: u, reason: collision with root package name */
    public final V3 f29616u;

    public Z3(int i, V3 v32) {
        this.f29615n = i;
        this.f29616u = v32;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f29615n, ((Z3) obj).f29615n);
    }
}
