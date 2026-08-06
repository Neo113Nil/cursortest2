package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0553l5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0278ae f6420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0579m5 f6421b;

    public RunnableC0553l5(C0579m5 c0579m5, InterfaceC0278ae interfaceC0278ae) {
        this.f6421b = c0579m5;
        this.f6420a = interfaceC0278ae;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6421b) {
            try {
                C0579m5 c0579m5 = this.f6421b;
                Object obj = c0579m5.f6480a;
                if (obj == null) {
                    c0579m5.f6481b.add(this.f6420a);
                } else {
                    this.f6420a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
