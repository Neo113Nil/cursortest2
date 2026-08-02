package com.datadog.android.rum.tracking;

import android.app.Activity;
import androidx.room.util.DBUtil;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.datadog.android.rum.internal.utils.WriteOperation$submit$1$1;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;

/* loaded from: classes4.dex */
public final class ActivityViewTrackingStrategy extends ActivityLifecycleTrackingStrategy implements ViewTrackingStrategy {
    public final HurlStack componentPredicate = new HurlStack(1);
    public final Lazy executor$delegate = LazyKt.lazy(new KeyHandle$keyPair$2(this, 26));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ActivityViewTrackingStrategy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.componentPredicate.equals(((ActivityViewTrackingStrategy) obj).componentPredicate);
    }

    public final RumMonitor getRumMonitor() {
        if (this.sdkCore != null) {
            return GlobalRumMonitor.get(getSdkCore());
        }
        InternalLogger.Companion.getClass();
        DBUtil.log$default(InternalLogger.Companion.UNBOUND, 3, InternalLogger.Target.USER, ActivityLifecycleTrackingStrategy$register$1.INSTANCE$1, null, false, 56);
        return null;
    }

    public final int hashCode() {
        return HurlStack.class.hashCode() + (Boolean.hashCode(false) * 31);
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        InternalLogger internalLogger$dd_sdk_android_rum_release = getInternalLogger$dd_sdk_android_rum_release();
        try {
            String resolveViewUrl = ViewUtilsKt.resolveViewUrl(activity);
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            RumMonitor rumMonitor = getRumMonitor();
            if (rumMonitor != null) {
                rumMonitor.startView(resolveViewUrl, activity, emptyMap);
            }
        } catch (Exception e) {
            DBUtil.log$default(internalLogger$dd_sdk_android_rum_release, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), WriteOperation$submit$1$1.INSTANCE$1, e, 48);
        }
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        zzho.scheduleSafe((ScheduledExecutorService) this.executor$delegate.getValue(), "Delayed view stop", 200L, getInternalLogger$dd_sdk_android_rum_release(), new q4$$ExternalSyntheticLambda0(22, this, activity));
    }
}
