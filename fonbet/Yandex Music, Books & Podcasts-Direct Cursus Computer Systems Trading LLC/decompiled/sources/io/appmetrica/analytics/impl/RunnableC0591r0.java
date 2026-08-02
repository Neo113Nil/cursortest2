package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0591r0 implements Runnable {
    public final /* synthetic */ C0649t0 a;

    public RunnableC0591r0(C0649t0 c0649t0) {
        this.a = c0649t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0649t0 c0649t0 = this.a;
        synchronized (c0649t0) {
            if (c0649t0.a != null && c0649t0.a()) {
                try {
                    c0649t0.d = null;
                    c0649t0.a.unbindService(c0649t0.j);
                } catch (Throwable unused) {
                }
            }
            c0649t0.d = null;
        }
    }
}
