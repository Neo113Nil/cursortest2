package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0194d6 implements Runnable {
    public final /* synthetic */ InterfaceC0781xg a;
    public final /* synthetic */ C0222e6 b;

    public RunnableC0194d6(C0222e6 c0222e6, InterfaceC0781xg interfaceC0781xg) {
        this.b = c0222e6;
        this.a = interfaceC0781xg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                C0222e6 c0222e6 = this.b;
                Object obj = c0222e6.a;
                if (obj == null) {
                    c0222e6.b.add(this.a);
                } else {
                    this.a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
