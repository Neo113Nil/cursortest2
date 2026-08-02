package com.datadog.android.rum.internal.instrumentation.gestures;

import android.content.Context;
import android.view.Window;
import coil3.svg.internal.AndroidSvg;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.internal.tracking.JetpackViewAttributesProvider;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.rum.tracking.ActionTrackingStrategy;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes4.dex */
public final class DatadogGesturesTracker {
    public final ActionTrackingStrategy composeActionsTrackingStrategy;
    public final NoOpInteractionPredicate interactionPredicate;
    public final InternalLogger internalLogger;
    public final JetpackViewAttributesProvider[] targetAttributesProviders;

    public DatadogGesturesTracker(JetpackViewAttributesProvider[] jetpackViewAttributesProviderArr, NoOpInteractionPredicate noOpInteractionPredicate, ActionTrackingStrategy actionTrackingStrategy, InternalLogger internalLogger) {
        internalLogger.getClass();
        this.targetAttributesProviders = jetpackViewAttributesProviderArr;
        this.interactionPredicate = noOpInteractionPredicate;
        this.composeActionsTrackingStrategy = actionTrackingStrategy;
        this.internalLogger = internalLogger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DatadogGesturesTracker.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Arrays.equals(this.targetAttributesProviders, ((DatadogGesturesTracker) obj).targetAttributesProviders) && NoOpInteractionPredicate.class.equals(NoOpInteractionPredicate.class);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.targetAttributesProviders) + 544;
        return NoOpInteractionPredicate.class.hashCode() + (hashCode * 31) + hashCode;
    }

    public final void startTracking(Window window, Context context, InternalSdkCore internalSdkCore) {
        context.getClass();
        internalSdkCore.getClass();
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new NoOpWindowCallback();
        }
        WeakReference weakReference = new WeakReference(window);
        WeakReference weakReference2 = new WeakReference(context);
        JetpackViewAttributesProvider[] jetpackViewAttributesProviderArr = this.targetAttributesProviders;
        NoOpInteractionPredicate noOpInteractionPredicate = this.interactionPredicate;
        window.setCallback(new WindowCallbackWrapper(window, internalSdkCore, callback, new AndroidSvg(context, new GesturesListener(internalSdkCore, weakReference, jetpackViewAttributesProviderArr, noOpInteractionPredicate, weakReference2, this.internalLogger, this.composeActionsTrackingStrategy)), noOpInteractionPredicate, jetpackViewAttributesProviderArr, this.internalLogger));
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DatadogGesturesTracker(", ArraysKt___ArraysKt.joinToString$default(this.targetAttributesProviders, null, null, null, null, 63), ")");
    }
}
