package android.content.Context;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.SdkClickHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLocationListenerEclipseHyperionCosmos2575 implements Runnable {
    public final /* synthetic */ SdkClickHandler FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ActivityPackage FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterLocationListenerEclipseHyperionCosmos2575(SdkClickHandler sdkClickHandler, ActivityPackage activityPackage, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = sdkClickHandler;
        this.FrostHunterFlowMaxDragonHero5809 = activityPackage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ILogger iLogger;
        List list2;
        ILogger iLogger2;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        ActivityPackage activityPackage = this.FrostHunterFlowMaxDragonHero5809;
        SdkClickHandler sdkClickHandler = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                list = sdkClickHandler.packageQueue;
                list.add(activityPackage);
                iLogger = sdkClickHandler.logger;
                list2 = sdkClickHandler.packageQueue;
                iLogger.debug("Added sdk_click %d", Integer.valueOf(list2.size()));
                iLogger2 = sdkClickHandler.logger;
                iLogger2.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                break;
            default:
                sdkClickHandler.sendSdkClickI(activityPackage);
                sdkClickHandler.sendNextSdkClick();
                break;
        }
    }
}
