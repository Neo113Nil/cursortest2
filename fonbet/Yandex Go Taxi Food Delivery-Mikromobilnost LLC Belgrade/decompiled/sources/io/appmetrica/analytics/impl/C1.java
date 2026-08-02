package io.appmetrica.analytics.impl;

import android.app.Activity;

/* loaded from: classes9.dex */
public final class C1 implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ J1 b;

    public C1(J1 j1, Activity activity) {
        this.b = j1;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1 j1 = this.b;
        C0747to c0747to = j1.h;
        Activity activity = this.a;
        InterfaceC0446jc interfaceC0446jc = j1.c().a;
        if (activity != null) {
            c0747to.f.a(activity);
        }
        if (c0747to.e.a(activity, EnumC0636q.PAUSED)) {
            interfaceC0446jc.a(activity);
        }
    }
}
