package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0601n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6547b;

    public RunnableC0601n1(C0756t1 c0756t1, String str) {
        this.f6547b = c0756t1;
        this.f6546a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6547b).reportEvent(this.f6546a);
    }
}
