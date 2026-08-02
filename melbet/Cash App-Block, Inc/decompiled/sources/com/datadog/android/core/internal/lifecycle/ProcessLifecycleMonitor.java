package com.datadog.android.core.internal.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class ProcessLifecycleMonitor implements Application.ActivityLifecycleCallbacks {
    public final Callback callback;
    public final AtomicInteger activitiesResumedCounter = new AtomicInteger(0);
    public final AtomicInteger activitiesStartedCounter = new AtomicInteger(0);
    public final AtomicBoolean wasPaused = new AtomicBoolean(true);
    public final AtomicBoolean wasStopped = new AtomicBoolean(true);

    public interface Callback {
        void onPaused();

        void onResumed();

        void onStarted();

        void onStopped();
    }

    public ProcessLifecycleMonitor(Callback callback) {
        this.callback = callback;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.activitiesResumedCounter.decrementAndGet() != 0 || this.wasPaused.getAndSet(true)) {
            return;
        }
        this.callback.onPaused();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (this.activitiesResumedCounter.incrementAndGet() == 1 && this.wasPaused.getAndSet(false)) {
            this.callback.onResumed();
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
        if (this.activitiesStartedCounter.incrementAndGet() == 1 && this.wasStopped.getAndSet(false)) {
            this.callback.onStarted();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        if (this.activitiesStartedCounter.decrementAndGet() == 0 && this.wasPaused.get()) {
            this.callback.onStopped();
            this.wasStopped.set(true);
        }
    }
}
