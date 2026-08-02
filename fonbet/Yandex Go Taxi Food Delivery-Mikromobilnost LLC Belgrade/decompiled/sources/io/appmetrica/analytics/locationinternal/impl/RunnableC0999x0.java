package io.appmetrica.analytics.locationinternal.impl;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0999x0 implements Runnable {
    public final /* synthetic */ C0933c a;
    public final /* synthetic */ C1002y0 b;

    public RunnableC0999x0(C1002y0 c1002y0, C0933c c0933c) {
        this.b = c1002y0;
        this.a = c0933c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1002y0 c1002y0 = this.b;
        C0933c c0933c = this.a;
        c1002y0.a = c0933c;
        c1002y0.b.a(c0933c != null && c0933c.c.b);
        c1002y0.c();
    }
}
