package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSnackbarSparkLegendLegend9759 implements Runnable {
    public final /* synthetic */ ActivityHandler FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ EventResponseData FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterSnackbarSparkLegendLegend9759(ActivityHandler activityHandler, EventResponseData eventResponseData, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = activityHandler;
        this.FrostHunterFlowMaxDragonHero5809 = eventResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        AdjustConfig adjustConfig3;
        AdjustConfig adjustConfig4;
        AdjustConfig adjustConfig5;
        AdjustConfig adjustConfig6;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        EventResponseData eventResponseData = this.FrostHunterFlowMaxDragonHero5809;
        ActivityHandler activityHandler = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null) {
                    adjustConfig2 = activityHandler.adjustConfig;
                    if (adjustConfig2.onEventTrackingSucceededListener != null) {
                        adjustConfig3 = activityHandler.adjustConfig;
                        adjustConfig3.onEventTrackingSucceededListener.onEventTrackingSucceeded(eventResponseData.getSuccessResponseData());
                        break;
                    }
                }
                break;
            default:
                adjustConfig4 = activityHandler.adjustConfig;
                if (adjustConfig4 != null) {
                    adjustConfig5 = activityHandler.adjustConfig;
                    if (adjustConfig5.onEventTrackingFailedListener != null) {
                        adjustConfig6 = activityHandler.adjustConfig;
                        adjustConfig6.onEventTrackingFailedListener.onEventTrackingFailed(eventResponseData.getFailureResponseData());
                        break;
                    }
                }
                break;
        }
    }
}
