package android.content.Context;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionEventOlympianHyperionPrime9094 implements Runnable {
    public final /* synthetic */ SingleThreadCachedScheduler FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ long FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Runnable FrostHunterFlowMaxDragonHero5809;

    public FrostHunterMotionEventOlympianHyperionPrime9094(SingleThreadCachedScheduler singleThreadCachedScheduler, long j, Runnable runnable) {
        this.FrostHunterAlertDialogAuroraDelta3200 = singleThreadCachedScheduler;
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
        this.FrostHunterFlowMaxDragonHero5809 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(this.FrostHunterCameraXPixelTurboCosmos9814);
        } catch (InterruptedException e) {
            AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
        }
        this.FrostHunterAlertDialogAuroraDelta3200.submit(this.FrostHunterFlowMaxDragonHero5809);
    }
}
