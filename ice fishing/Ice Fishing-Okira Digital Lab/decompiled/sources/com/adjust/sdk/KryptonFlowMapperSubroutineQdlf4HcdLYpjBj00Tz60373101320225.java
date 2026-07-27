package com.adjust.sdk;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class KryptonFlowMapperSubroutineQdlf4HcdLYpjBj00Tz60373101320225 implements Runnable {
    public final /* synthetic */ Intent LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ Uri RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ ActivityHandler YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public KryptonFlowMapperSubroutineQdlf4HcdLYpjBj00Tz60373101320225(ActivityHandler activityHandler, Intent intent, Uri uri) {
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = activityHandler;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = uri;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        boolean z;
        AdjustConfig adjustConfig3;
        ActivityHandler activityHandler = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        adjustConfig = activityHandler.adjustConfig;
        if (adjustConfig == null) {
            return;
        }
        adjustConfig2 = activityHandler.adjustConfig;
        OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = adjustConfig2.onDeferredDeeplinkResponseListener;
        Uri uri = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (onDeferredDeeplinkResponseListener != null) {
            adjustConfig3 = activityHandler.adjustConfig;
            z = adjustConfig3.onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri);
        } else {
            z = true;
        }
        if (z) {
            activityHandler.launchDeeplinkMain(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, uri);
        }
    }
}
