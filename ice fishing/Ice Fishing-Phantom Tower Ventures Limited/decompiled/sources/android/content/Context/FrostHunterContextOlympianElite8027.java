package android.content.Context;

import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContextOlympianElite8027 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Runnable FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterContextOlympianElite8027(Runnable runnable, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Runnable runnable = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    runnable.run();
                    break;
                } catch (Exception unused) {
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterMediaPlayerCelestialBetaTitan3868("Executor");
                    return;
                }
            case 1:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                return this.FrostHunterFlowMaxDragonHero5809.toString();
            default:
                return super.toString();
        }
    }
}
