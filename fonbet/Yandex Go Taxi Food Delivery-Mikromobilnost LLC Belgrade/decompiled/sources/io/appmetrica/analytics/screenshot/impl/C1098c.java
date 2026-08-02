package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1098c implements ActivityLifecycleListener {
    public final /* synthetic */ C1099d a;

    public C1098c(C1099d c1099d) {
        this.a = c1099d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC1097b.a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C1099d.d(this.a));
            } else {
                C1104i c1104i = this.a.c;
                if (c1104i == null || !c1104i.a) {
                    return;
                }
                activity.registerScreenCaptureCallback(this.a.a.getContext().getMainExecutor(), C1099d.d(this.a));
            }
        } catch (Throwable unused) {
        }
    }
}
