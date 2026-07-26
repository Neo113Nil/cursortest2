package android.content.Context;

import android.content.Context;
import com.adjust.sdk.AdjustInstance;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterTextureViewFusionBlazeSpark6411 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Context FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterTextureViewFusionBlazeSpark6411(Context context, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Context context = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(context);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new FrostHunterTextureViewFusionBlazeSpark6411(context, 2));
                break;
            default:
                FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigThunderShadow4435(context, new FrostHunterRemoteConfigDeltaTitanMaster1902(1), FrostHunterBindingAdapterSpeedNeo6677.FrostHunterLightSensorForceFusion4241, false);
                break;
        }
    }
}
