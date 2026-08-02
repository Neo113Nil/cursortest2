package com.bugsnag.android;

import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class LaunchCrashTracker extends BaseObservable {
    public final ScheduledThreadPoolExecutor executor;
    public final AtomicBoolean launching;
    public final Logger logger;

    public LaunchCrashTracker(ImmutableConfig immutableConfig) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.executor = scheduledThreadPoolExecutor;
        this.launching = new AtomicBoolean(true);
        this.logger = immutableConfig.logger;
        long j = immutableConfig.launchDurationMillis;
        if (j > 0) {
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                scheduledThreadPoolExecutor.schedule(new AFLogger$$ExternalSyntheticLambda0(this, 12), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                this.logger.w("Failed to schedule timer for LaunchCrashTracker", e);
            }
        }
    }

    public final void markLaunchCompleted() {
        this.executor.shutdown();
        this.launching.set(false);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.UpdateIsLaunching updateIsLaunching = new StateEvent.UpdateIsLaunching();
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((StateObserver) it.next()).onStateChange(updateIsLaunching);
            }
        }
        this.logger.d("App launch period marked as complete");
    }
}
