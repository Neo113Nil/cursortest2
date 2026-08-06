package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0704r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f6803c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6804d;

    public RunnableC0704r1(C0756t1 c0756t1, String str, String str2, Throwable th) {
        this.f6804d = c0756t1;
        this.f6801a = str;
        this.f6802b = str2;
        this.f6803c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6804d).reportError(this.f6801a, this.f6802b, this.f6803c);
    }
}
