package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.OnIsEnabledListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterStateListAnimatorHeroStormDelta2562 implements Runnable {
    public final /* synthetic */ OnIsEnabledListener FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ActivityHandler FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterStateListAnimatorHeroStormDelta2562(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = activityHandler;
        this.FrostHunterAlertDialogAuroraDelta3200 = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        OnIsEnabledListener onIsEnabledListener = this.FrostHunterAlertDialogAuroraDelta3200;
        ActivityHandler activityHandler = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$isEnabled$9(onIsEnabledListener);
                break;
            case 1:
                activityHandler.lambda$isEnabled$11(onIsEnabledListener);
                break;
            default:
                activityHandler.lambda$isEnabled$10(onIsEnabledListener);
                break;
        }
    }
}
