package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0343d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5777c;

    public RunnableC0343d1(C0756t1 c0756t1, String str, String str2) {
        this.f5777c = c0756t1;
        this.f5775a = str;
        this.f5776b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f5777c).b(this.f5775a, this.f5776b);
    }
}
