package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class EmeraldStackResourceAbstractionUuYOmyF8shg5R5J3dm59059295741350 implements Runnable {
    public final /* synthetic */ SessionResponseData LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ ActivityHandler YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ EmeraldStackResourceAbstractionUuYOmyF8shg5R5J3dm59059295741350(ActivityHandler activityHandler, SessionResponseData sessionResponseData, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = activityHandler;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = sessionResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        AdjustConfig adjustConfig3;
        AdjustConfig adjustConfig4;
        AdjustConfig adjustConfig5;
        AdjustConfig adjustConfig6;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        SessionResponseData sessionResponseData = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        ActivityHandler activityHandler = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null) {
                    adjustConfig2 = activityHandler.adjustConfig;
                    if (adjustConfig2.onSessionTrackingSucceededListener != null) {
                        adjustConfig3 = activityHandler.adjustConfig;
                        adjustConfig3.onSessionTrackingSucceededListener.onSessionTrackingSucceeded(sessionResponseData.getSuccessResponseData());
                        break;
                    }
                }
                break;
            default:
                adjustConfig4 = activityHandler.adjustConfig;
                if (adjustConfig4 != null) {
                    adjustConfig5 = activityHandler.adjustConfig;
                    if (adjustConfig5.onSessionTrackingFailedListener != null) {
                        adjustConfig6 = activityHandler.adjustConfig;
                        adjustConfig6.onSessionTrackingFailedListener.onSessionTrackingFailed(sessionResponseData.getFailureResponseData());
                        break;
                    }
                }
                break;
        }
    }
}
