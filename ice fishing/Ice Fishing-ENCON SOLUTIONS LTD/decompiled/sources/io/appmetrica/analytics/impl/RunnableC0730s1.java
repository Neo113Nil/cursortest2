package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0730s1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f6875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6876b;

    public RunnableC0730s1(C0756t1 c0756t1, Throwable th) {
        this.f6876b = c0756t1;
        this.f6875a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6876b).reportUnhandledException(this.f6875a);
    }
}
