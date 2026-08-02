package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0952u implements ActivityLifecycleListener {
    public final /* synthetic */ C0953v a;

    public C0952u(C0953v c0953v) {
        this.a = c0953v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i = AbstractC0951t.a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.a.a.getContext().getContentResolver().unregisterContentObserver(this.a.d);
            } else {
                C0943k c0943k = this.a.c;
                if (c0943k == null || !c0943k.a) {
                    return;
                }
                this.a.a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.a.d);
            }
        } catch (Throwable unused) {
        }
    }
}
