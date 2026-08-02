package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2988bD implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC3310hD f30033n;

    /* renamed from: u, reason: collision with root package name */
    public final P3.a f30034u;

    public RunnableC2988bD(AbstractC3310hD abstractC3310hD, P3.a aVar) {
        this.f30033n = abstractC3310hD;
        this.f30034u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f30033n.f34004n != this) {
            return;
        }
        P3.a aVar = this.f30034u;
        if (AbstractC3794qD.f34003z.r(this.f30033n, this, AbstractC3310hD.h(aVar))) {
            AbstractC3310hD.p(this.f30033n, false);
        }
    }
}
