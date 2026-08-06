package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5020b;

    public S0(C0756t1 c0756t1, boolean z2) {
        this.f5020b = c0756t1;
        this.f5019a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0911z0 c0911z0 = this.f5020b.f6922a;
        boolean z2 = this.f5019a;
        c0911z0.getClass();
        C0885y0.c().setDataSendingEnabled(z2);
    }
}
