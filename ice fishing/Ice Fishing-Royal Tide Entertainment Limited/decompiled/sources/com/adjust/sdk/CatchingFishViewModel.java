package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishViewModel implements Runnable {
    public final /* synthetic */ SessionResponseData CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ ActivityHandler CatchingFishWorkManager;

    public /* synthetic */ CatchingFishViewModel(ActivityHandler activityHandler, SessionResponseData sessionResponseData, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = activityHandler;
        this.CatchingFishDaggerWebsocket = sessionResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        AdjustConfig adjustConfig3;
        AdjustConfig adjustConfig4;
        AdjustConfig adjustConfig5;
        AdjustConfig adjustConfig6;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ActivityHandler activityHandler = this.CatchingFishWorkManager;
                adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null) {
                    adjustConfig2 = activityHandler.adjustConfig;
                    if (adjustConfig2.onSessionTrackingSucceededListener != null) {
                        adjustConfig3 = activityHandler.adjustConfig;
                        adjustConfig3.onSessionTrackingSucceededListener.onSessionTrackingSucceeded(this.CatchingFishDaggerWebsocket.getSuccessResponseData());
                        break;
                    }
                }
                break;
            default:
                ActivityHandler activityHandler2 = this.CatchingFishWorkManager;
                adjustConfig4 = activityHandler2.adjustConfig;
                if (adjustConfig4 != null) {
                    adjustConfig5 = activityHandler2.adjustConfig;
                    if (adjustConfig5.onSessionTrackingFailedListener != null) {
                        adjustConfig6 = activityHandler2.adjustConfig;
                        adjustConfig6.onSessionTrackingFailedListener.onSessionTrackingFailed(this.CatchingFishDaggerWebsocket.getFailureResponseData());
                        break;
                    }
                }
                break;
        }
    }
}
