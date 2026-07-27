package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4091vy implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final Runnable f34906n;

    /* renamed from: u, reason: collision with root package name */
    public final long f34907u;

    public C4091vy(Runnable runnable, long j9) {
        this.f34906n = runnable;
        this.f34907u = j9;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f34907u, ((C4091vy) obj).f34907u);
    }
}
