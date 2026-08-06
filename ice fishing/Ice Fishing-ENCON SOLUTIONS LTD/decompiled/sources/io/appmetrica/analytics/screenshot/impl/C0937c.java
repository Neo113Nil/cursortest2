package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0938d f7632a;

    public C0937c(C0938d c0938d) {
        this.f7632a = c0938d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Executor mainExecutor;
        int i2 = AbstractC0936b.f7631a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                C0944j c0944j = this.f7632a.f7635c;
                if (c0944j == null || !c0944j.f7651a) {
                    return;
                }
                mainExecutor = this.f7632a.f7633a.getContext().getMainExecutor();
                activity.registerScreenCaptureCallback(mainExecutor, C0938d.d(this.f7632a));
            } else if (i2 != 2) {
            } else {
                activity.unregisterScreenCaptureCallback(C0938d.d(this.f7632a));
            }
        } catch (Throwable unused) {
        }
    }
}
