package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0600n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0652p0 f6545a;

    public RunnableC0600n0(C0652p0 c0652p0) {
        this.f6545a = c0652p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0652p0 c0652p0 = this.f6545a;
        synchronized (c0652p0) {
            if (c0652p0.f6702a != null && c0652p0.a()) {
                try {
                    c0652p0.f6705d = null;
                    c0652p0.f6702a.unbindService(c0652p0.f6711j);
                } catch (Throwable unused) {
                }
            }
            c0652p0.f6705d = null;
        }
    }
}
