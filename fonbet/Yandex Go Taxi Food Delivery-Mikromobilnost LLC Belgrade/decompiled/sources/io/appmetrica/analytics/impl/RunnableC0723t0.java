package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0723t0 implements Runnable {
    public final /* synthetic */ C0781v0 a;

    public RunnableC0723t0(C0781v0 c0781v0) {
        this.a = c0781v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0781v0 c0781v0 = this.a;
        synchronized (c0781v0) {
            if (c0781v0.a != null && c0781v0.a()) {
                try {
                    c0781v0.d = null;
                    c0781v0.a.unbindService(c0781v0.j);
                } catch (Throwable unused) {
                }
            }
            c0781v0.d = null;
        }
    }
}
