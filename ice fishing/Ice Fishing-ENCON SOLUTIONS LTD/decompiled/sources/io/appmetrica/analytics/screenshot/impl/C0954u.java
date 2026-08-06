package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954u implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0955v f7676a;

    public C0954u(C0955v c0955v) {
        this.f7676a = c0955v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i2 = AbstractC0953t.f7675a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                C0945k c0945k = this.f7676a.f7679c;
                if (c0945k == null || !c0945k.f7654a) {
                } else {
                    this.f7676a.f7677a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f7676a.f7680d);
                }
            } else if (i2 != 2) {
            } else {
                this.f7676a.f7677a.getContext().getContentResolver().unregisterContentObserver(this.f7676a.f7680d);
            }
        } catch (Throwable unused) {
        }
    }
}
