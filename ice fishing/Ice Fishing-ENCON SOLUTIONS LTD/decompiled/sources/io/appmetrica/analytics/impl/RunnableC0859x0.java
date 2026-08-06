package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0859x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0885y0 f7163a;

    public RunnableC0859x0(C0885y0 c0885y0) {
        this.f7163a = c0885y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0294b4.l().f5584c.a().executeDelayed(new RunnableC0808v1(this.f7163a.f7219a), TimeUnit.SECONDS.toMillis(5L));
    }
}
