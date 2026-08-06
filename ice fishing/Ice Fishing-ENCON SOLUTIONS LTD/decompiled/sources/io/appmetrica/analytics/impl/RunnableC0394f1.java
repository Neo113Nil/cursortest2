package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0394f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5962c;

    public RunnableC0394f1(C0756t1 c0756t1, String str, String str2) {
        this.f5962c = c0756t1;
        this.f5960a = str;
        this.f5961b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0911z0 c0911z0 = this.f5962c.f6922a;
        String str = this.f5960a;
        String str2 = this.f5961b;
        c0911z0.getClass();
        C0885y0.c().putAppEnvironmentValue(str, str2);
    }
}
