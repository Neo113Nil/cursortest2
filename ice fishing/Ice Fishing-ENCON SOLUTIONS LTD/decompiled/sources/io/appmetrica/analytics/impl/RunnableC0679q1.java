package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0679q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f6765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6766c;

    public RunnableC0679q1(C0756t1 c0756t1, String str, Throwable th) {
        this.f6766c = c0756t1;
        this.f6764a = str;
        this.f6765b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6766c).reportError(this.f6764a, this.f6765b);
    }
}
