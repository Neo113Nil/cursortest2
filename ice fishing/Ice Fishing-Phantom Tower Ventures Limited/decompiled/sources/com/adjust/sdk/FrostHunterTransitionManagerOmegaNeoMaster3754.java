package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionManagerOmegaNeoMaster3754 implements Runnable {
    public final /* synthetic */ ActivityHandler FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ OnAdidReadListener FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterTransitionManagerOmegaNeoMaster3754(ActivityHandler activityHandler, OnAdidReadListener onAdidReadListener, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = activityHandler;
        this.FrostHunterFlowMaxDragonHero5809 = onAdidReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityState activityState;
        ActivityState activityState2;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        ActivityHandler activityHandler = this.FrostHunterAlertDialogAuroraDelta3200;
        OnAdidReadListener onAdidReadListener = this.FrostHunterFlowMaxDragonHero5809;
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
