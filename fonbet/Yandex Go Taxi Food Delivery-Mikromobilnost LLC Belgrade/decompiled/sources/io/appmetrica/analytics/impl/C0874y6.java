package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0874y6 implements ActivityLifecycleListener {
    public final /* synthetic */ C0903z6 a;

    public C0874y6(C0903z6 c0903z6) {
        this.a = c0903z6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC0845x6.a[activityEvent.ordinal()];
        if (i == 1) {
            this.a.b.resumeSession();
        } else {
            if (i != 2) {
                return;
            }
            this.a.b.pauseSession();
        }
    }
}
