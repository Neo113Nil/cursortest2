package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5273a;

    public W0(C0756t1 c0756t1) {
        this.f5273a = c0756t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f5273a).sendEventsBuffer();
    }
}
