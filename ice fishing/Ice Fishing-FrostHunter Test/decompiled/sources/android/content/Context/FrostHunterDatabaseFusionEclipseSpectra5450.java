package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterDatabaseFusionEclipseSpectra5450 implements Runnable {
    public final /* synthetic */ String FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ActivityHandler FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ String FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterDatabaseFusionEclipseSpectra5450(ActivityHandler activityHandler, String str, String str2, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = activityHandler;
        this.FrostHunterAlertDialogAuroraDelta3200 = str;
        this.FrostHunterKeyframeGammaGamma1197 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        String str = this.FrostHunterKeyframeGammaGamma1197;
        String str2 = this.FrostHunterAlertDialogAuroraDelta3200;
        ActivityHandler activityHandler = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$addGlobalPartnerParameter$23(str2, str);
                break;
            default:
                activityHandler.lambda$addGlobalCallbackParameter$21(str2, str);
                break;
        }
    }
}
