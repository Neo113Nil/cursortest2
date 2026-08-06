package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5082b;

    public T0(C0756t1 c0756t1, String str) {
        this.f5082b = c0756t1;
        this.f5081a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0911z0 c0911z0 = this.f5082b.f6922a;
        String str = this.f5081a;
        c0911z0.getClass();
        C0885y0.c().setUserProfileID(str);
    }
}
