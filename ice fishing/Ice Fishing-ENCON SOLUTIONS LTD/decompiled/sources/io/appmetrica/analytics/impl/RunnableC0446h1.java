package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0446h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f6108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6109b;

    public RunnableC0446h1(C0756t1 c0756t1, Activity activity) {
        this.f6109b = c0756t1;
        this.f6108a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1 c0756t1 = this.f6109b;
        Wk wk = c0756t1.f6929h;
        Activity activity = this.f6108a;
        Ia ia = c0756t1.d().f6277a;
        if (activity != null) {
            wk.f5319f.a(activity);
        }
        if (wk.f5318e.a(activity, EnumC0651p.RESUMED)) {
            ia.a(activity);
        }
    }
}
