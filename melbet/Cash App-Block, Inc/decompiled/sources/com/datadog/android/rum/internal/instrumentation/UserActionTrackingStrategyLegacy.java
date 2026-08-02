package com.datadog.android.rum.internal.instrumentation;

import android.app.Activity;
import android.view.Window;
import com.bugsnag.android.TraceParser$parse$1;
import com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker;
import com.datadog.android.rum.internal.instrumentation.gestures.NoOpWindowCallback;
import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy;
import com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy;

/* loaded from: classes4.dex */
public final class UserActionTrackingStrategyLegacy extends ActivityLifecycleTrackingStrategy implements UserActionTrackingStrategy {
    public final DatadogGesturesTracker gesturesTracker;

    public UserActionTrackingStrategyLegacy(DatadogGesturesTracker datadogGesturesTracker) {
        this.gesturesTracker = datadogGesturesTracker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!UserActionTrackingStrategyLegacy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.gesturesTracker.equals(((UserActionTrackingStrategyLegacy) obj).gesturesTracker);
    }

    public final int hashCode() {
        return this.gesturesTracker.hashCode();
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackWrapper) {
            Window.Callback callback2 = ((WindowCallbackWrapper) callback).wrappedCallback;
            if (callback2 instanceof NoOpWindowCallback) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        withSdkCore(new TraceParser$parse$1(10, this, activity));
    }

    public final String toString() {
        return "UserActionTrackingStrategyLegacy(" + this.gesturesTracker + ")";
    }
}
