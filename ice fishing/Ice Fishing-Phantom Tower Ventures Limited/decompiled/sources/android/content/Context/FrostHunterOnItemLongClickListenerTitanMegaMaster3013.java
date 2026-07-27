package android.content.Context;

import android.os.Handler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterOnItemLongClickListenerTitanMegaMaster3013 implements Executor {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterOnItemLongClickListenerTitanMegaMaster3013(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Handler) obj).post(runnable);
                break;
            default:
                ((FrostHunterRotateDrawableMaxPrime8918) obj).FrostHunterServiceEliteCelestialThunder1757(runnable);
                break;
        }
    }
}
