package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class f0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f7640a;

    public f0(g0 g0Var) {
        this.f7640a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i2 = e0.f7639a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                C0948n c0948n = this.f7640a.f7645e;
                if (c0948n == null || !c0948n.f7667a) {
                    return;
                }
                this.f7640a.f7644d = false;
                g0 g0Var = this.f7640a;
                g0Var.f7643c.postDelayed(g0Var.f7646f, 0L);
            } else if (i2 != 2) {
            } else {
                this.f7640a.f7644d = true;
            }
        } catch (Throwable unused) {
        }
    }
}
