package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPagingSourceInfernoOmega7178 implements Runnable {
    public final /* synthetic */ ActivityHandler FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ OnAttributionReadListener FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterPagingSourceInfernoOmega7178(ActivityHandler activityHandler, OnAttributionReadListener onAttributionReadListener, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = activityHandler;
        this.FrostHunterFlowMaxDragonHero5809 = onAttributionReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustAttribution adjustAttribution;
        AdjustAttribution adjustAttribution2;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        ActivityHandler activityHandler = this.FrostHunterAlertDialogAuroraDelta3200;
        OnAttributionReadListener onAttributionReadListener = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustAttribution = activityHandler.attribution;
                onAttributionReadListener.onAttributionRead(adjustAttribution);
                break;
            default:
                adjustAttribution2 = activityHandler.attribution;
                onAttributionReadListener.onAttributionRead(adjustAttribution2);
                break;
        }
    }
}
