package com.datadog.android.rum.internal.instrumentation;

import android.app.Activity;
import android.os.Bundle;
import com.bugsnag.android.TraceParser$parse$1;
import com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker;
import com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy;
import com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy;

/* loaded from: classes4.dex */
public final class UserActionTrackingStrategyApi29 extends ActivityLifecycleTrackingStrategy implements UserActionTrackingStrategy {
    public final DatadogGesturesTracker gesturesTracker;

    public UserActionTrackingStrategyApi29(DatadogGesturesTracker datadogGesturesTracker) {
        this.gesturesTracker = datadogGesturesTracker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!UserActionTrackingStrategyApi29.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.gesturesTracker.equals(((UserActionTrackingStrategyApi29) obj).gesturesTracker);
    }

    public final int hashCode() {
        return this.gesturesTracker.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        withSdkCore(new TraceParser$parse$1(9, this, activity));
        super.onActivityPreCreated(activity, bundle);
    }

    public final String toString() {
        return "UserActionTrackingStrategyApi29(" + this.gesturesTracker + ")";
    }
}
