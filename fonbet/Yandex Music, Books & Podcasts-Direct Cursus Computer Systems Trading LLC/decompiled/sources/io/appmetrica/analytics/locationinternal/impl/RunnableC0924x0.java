package io.appmetrica.analytics.locationinternal.impl;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0924x0 implements Runnable {
    public final /* synthetic */ C0856c a;
    public final /* synthetic */ C0927y0 b;

    public RunnableC0924x0(C0927y0 c0927y0, C0856c c0856c) {
        this.b = c0927y0;
        this.a = c0856c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0927y0 c0927y0 = this.b;
        C0856c c0856c = this.a;
        c0927y0.a = c0856c;
        c0927y0.b.a(c0856c != null && c0856c.c.b);
        c0927y0.c();
    }
}
