package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes9.dex */
public final class r implements ActivityLifecycleListener {
    public final /* synthetic */ C1113s a;

    public r(C1113s c1113s) {
        this.a = c1113s;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC1112q.a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.a.a.getContext().getContentResolver().unregisterContentObserver(this.a.d);
            } else {
                C1105j c1105j = this.a.c;
                if (c1105j == null || !c1105j.a) {
                    return;
                }
                this.a.a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.a.d);
            }
        } catch (Throwable unused) {
        }
    }
}
