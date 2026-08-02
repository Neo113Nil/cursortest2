package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0354g6 implements Runnable {
    public final /* synthetic */ Ng a;
    public final /* synthetic */ C0383h6 b;

    public RunnableC0354g6(C0383h6 c0383h6, Ng ng) {
        this.b = c0383h6;
        this.a = ng;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                C0383h6 c0383h6 = this.b;
                Object obj = c0383h6.a;
                if (obj == null) {
                    c0383h6.b.add(this.a);
                } else {
                    this.a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
