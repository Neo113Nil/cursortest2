package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2965bD implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC3287hD f29245n;

    /* renamed from: u, reason: collision with root package name */
    public final N3.a f29246u;

    public RunnableC2965bD(AbstractC3287hD abstractC3287hD, N3.a aVar) {
        this.f29245n = abstractC3287hD;
        this.f29246u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29245n.f33220n != this) {
            return;
        }
        N3.a aVar = this.f29246u;
        if (AbstractC3771qD.f33219z.r(this.f29245n, this, AbstractC3287hD.h(aVar))) {
            AbstractC3287hD.p(this.f29245n, false);
        }
    }
}
