package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0291b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5580c;

    public RunnableC0291b1(C0756t1 c0756t1, String str, String str2) {
        this.f5580c = c0756t1;
        this.f5578a = str;
        this.f5579b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0911z0 c0911z0 = this.f5580c.f6922a;
        String str = this.f5578a;
        String str2 = this.f5579b;
        c0911z0.getClass();
        C0885y0.c().a(str, str2);
    }
}
