package com.datadog.android.rum.tracking;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum._RumInternalProxy;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class ActivityLifecycleTrackingStrategy implements Application.ActivityLifecycleCallbacks, TrackingStrategy {
    public InternalSdkCore sdkCore;

    public final InternalLogger getInternalLogger$dd_sdk_android_rum_release() {
        if (this.sdkCore != null) {
            return getSdkCore().getInternalLogger();
        }
        InternalLogger.Companion.getClass();
        return InternalLogger.Companion.UNBOUND;
    }

    public final InternalSdkCore getSdkCore() {
        InternalSdkCore internalSdkCore = this.sdkCore;
        if (internalSdkCore != null) {
            return internalSdkCore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sdkCore");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent;
        _RumInternalProxy internalProxy;
        Bundle bundle2;
        activity.getClass();
        if (this.sdkCore == null || (intent = activity.getIntent()) == null || (internalProxy = GlobalRumMonitor.get(getSdkCore()).getInternalProxy()) == null) {
            return;
        }
        try {
            bundle2 = intent.getExtras();
        } catch (Exception unused) {
            bundle2 = null;
        }
        String string2 = bundle2 != null ? bundle2.getString("_dd.synthetics.test_id") : null;
        String string3 = bundle2 != null ? bundle2.getString("_dd.synthetics.result_id") : null;
        if (internalProxy.handledSyntheticsAttribute) {
            return;
        }
        internalProxy.handledSyntheticsAttribute = true;
        if (string2 == null || StringsKt.isBlank(string2) || string3 == null || StringsKt.isBlank(string3)) {
            return;
        }
        internalProxy.rumMonitor.handleEvent$dd_sdk_android_rum_release(new RumRawEvent.SetSyntheticsTestAttribute(string2, string3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(InternalSdkCore internalSdkCore, Context context) {
        internalSdkCore.getClass();
        context.getClass();
        if (context instanceof Application) {
            this.sdkCore = internalSdkCore;
            ((Application) context).registerActivityLifecycleCallbacks(this);
        } else {
            DBUtil.log$default(internalSdkCore.getInternalLogger(), 5, InternalLogger.Target.USER, ActivityLifecycleTrackingStrategy$register$1.INSTANCE, null, false, 56);
        }
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(Context context) {
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void withSdkCore(Function1 function1) {
        if (this.sdkCore != null) {
            function1.invoke(getSdkCore());
            return;
        }
        InternalLogger.Companion.getClass();
        DBUtil.log$default(InternalLogger.Companion.UNBOUND, 3, InternalLogger.Target.USER, ActivityLifecycleTrackingStrategy$register$1.INSTANCE$1, null, false, 56);
    }
}
