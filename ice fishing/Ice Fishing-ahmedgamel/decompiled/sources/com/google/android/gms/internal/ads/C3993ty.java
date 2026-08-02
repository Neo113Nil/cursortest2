package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ty, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3993ty implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final Runnable f35205n;

    /* renamed from: u, reason: collision with root package name */
    public final long f35206u;

    public C3993ty(Runnable runnable, long j6) {
        this.f35205n = runnable;
        this.f35206u = j6;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f35206u, ((C3993ty) obj).f35206u);
    }
}
