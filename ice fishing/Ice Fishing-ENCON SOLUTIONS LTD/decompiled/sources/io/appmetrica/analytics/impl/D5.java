package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class D5 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E5 f4279a;

    public D5(E5 e5) {
        this.f4279a = e5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i2 = C5.f4255a[activityEvent.ordinal()];
        if (i2 == 1) {
            this.f4279a.f4341b.resumeSession();
        } else {
            if (i2 != 2) {
                return;
            }
            this.f4279a.f4341b.pauseSession();
        }
    }
}
