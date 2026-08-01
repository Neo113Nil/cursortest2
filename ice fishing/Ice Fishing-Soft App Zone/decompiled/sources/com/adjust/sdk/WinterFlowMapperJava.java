package com.adjust.sdk;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperJava implements Runnable {
    public final /* synthetic */ Intent WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ ActivityHandler WinterFlowUnitTestResponse;
    public final /* synthetic */ Uri WinterFlowVariableVersionControl;

    public WinterFlowMapperJava(ActivityHandler activityHandler, Intent intent, Uri uri) {
        this.WinterFlowUnitTestResponse = activityHandler;
        this.WinterFlowVariableVersionControl = uri;
        this.WinterFlowTransactionManagerStrategy = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        boolean z;
        AdjustConfig adjustConfig3;
        ActivityHandler activityHandler = this.WinterFlowUnitTestResponse;
        adjustConfig = activityHandler.adjustConfig;
        if (adjustConfig == null) {
            return;
        }
        adjustConfig2 = activityHandler.adjustConfig;
        OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = adjustConfig2.onDeferredDeeplinkResponseListener;
        Uri uri = this.WinterFlowVariableVersionControl;
        if (onDeferredDeeplinkResponseListener != null) {
            adjustConfig3 = activityHandler.adjustConfig;
            z = adjustConfig3.onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri);
        } else {
            z = true;
        }
        if (z) {
            activityHandler.launchDeeplinkMain(this.WinterFlowTransactionManagerStrategy, uri);
        }
    }
}
