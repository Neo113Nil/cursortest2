package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3027cD implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC3354iD f29652n;

    /* renamed from: u, reason: collision with root package name */
    public final J3.a f29653u;

    public RunnableC3027cD(AbstractC3354iD abstractC3354iD, J3.a aVar) {
        this.f29652n = abstractC3354iD;
        this.f29653u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29652n.f33992n != this) {
            return;
        }
        J3.a aVar = this.f29653u;
        if (AbstractC3837rD.f33991z.o(this.f29652n, this, AbstractC3354iD.h(aVar))) {
            AbstractC3354iD.p(this.f29652n, false);
        }
    }
}
