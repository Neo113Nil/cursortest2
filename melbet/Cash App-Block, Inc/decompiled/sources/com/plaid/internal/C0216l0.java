package com.plaid.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.text.StringsKt;

/* renamed from: com.plaid.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0216l0 implements Application.ActivityLifecycleCallbacks {
    public WeakReference<Activity> a = new WeakReference<>(null);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (StringsKt.contains((CharSequence) activity.getClass().getName(), (CharSequence) "com.plaid", false)) {
            this.a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (StringsKt.contains((CharSequence) activity.getClass().getName(), (CharSequence) "com.plaid", false)) {
            this.a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        if (StringsKt.contains((CharSequence) activity.getClass().getName(), (CharSequence) "com.plaid", false)) {
            this.a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
