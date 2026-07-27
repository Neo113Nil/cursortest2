package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMutableLiveData implements Runnable {
    public final /* synthetic */ EventResponseData CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ ActivityHandler CatchingFishWorkManager;

    public /* synthetic */ CatchingFishMutableLiveData(ActivityHandler activityHandler, EventResponseData eventResponseData, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = activityHandler;
        this.CatchingFishDaggerWebsocket = eventResponseData;
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
                    if (adjustConfig2.onEventTrackingSucceededListener != null) {
                        adjustConfig3 = activityHandler.adjustConfig;
                        adjustConfig3.onEventTrackingSucceededListener.onEventTrackingSucceeded(this.CatchingFishDaggerWebsocket.getSuccessResponseData());
                        break;
                    }
                }
                break;
            default:
                ActivityHandler activityHandler2 = this.CatchingFishWorkManager;
                adjustConfig4 = activityHandler2.adjustConfig;
                if (adjustConfig4 != null) {
                    adjustConfig5 = activityHandler2.adjustConfig;
                    if (adjustConfig5.onEventTrackingFailedListener != null) {
                        adjustConfig6 = activityHandler2.adjustConfig;
                        adjustConfig6.onEventTrackingFailedListener.onEventTrackingFailed(this.CatchingFishDaggerWebsocket.getFailureResponseData());
                        break;
                    }
                }
                break;
        }
    }
}
