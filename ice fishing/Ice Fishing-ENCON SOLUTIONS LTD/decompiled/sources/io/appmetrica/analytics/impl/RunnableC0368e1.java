package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0368e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5860b;

    public RunnableC0368e1(C0756t1 c0756t1, String str) {
        this.f5860b = c0756t1;
        this.f5859a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f5860b).b(this.f5859a);
    }
}
