package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0575m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f6472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6473b;

    public RunnableC0575m1(C0756t1 c0756t1, Activity activity) {
        this.f6473b = c0756t1;
        this.f6472a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1 c0756t1 = this.f6473b;
        Wk wk = c0756t1.f6929h;
        Activity activity = this.f6472a;
        Ia ia = c0756t1.d().f6277a;
        if (activity != null) {
            wk.f5319f.a(activity);
        }
        if (wk.f5318e.a(activity, EnumC0651p.PAUSED)) {
            ia.b(activity);
        }
    }
}
