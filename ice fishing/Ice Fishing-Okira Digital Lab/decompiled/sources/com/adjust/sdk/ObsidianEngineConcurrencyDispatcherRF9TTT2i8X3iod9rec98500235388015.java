package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 implements Runnable {
    public final /* synthetic */ OnAdidReadListener LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ ActivityHandler YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015(ActivityHandler activityHandler, OnAdidReadListener onAdidReadListener, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = activityHandler;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = onAdidReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityState activityState;
        ActivityState activityState2;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ActivityHandler activityHandler = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        OnAdidReadListener onAdidReadListener = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityState = activityHandler.activityState;
                onAdidReadListener.onAdidRead(activityState.adid);
                break;
            default:
                activityState2 = activityHandler.activityState;
                onAdidReadListener.onAdidRead(activityState2.adid);
                break;
        }
    }
}
