package android.content.Context;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFirestoreMegaTitanCelestial9734 implements Executor {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterFirestoreMegaTitanCelestial9734() {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        FrostHunterValueAnimatorHyperNebulaUltra9912 frostHunterValueAnimatorHyperNebulaUltra9912 = new FrostHunterValueAnimatorHyperNebulaUltra9912(Looper.getMainLooper());
        Looper.getMainLooper();
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterValueAnimatorHyperNebulaUltra9912;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Executor) obj).execute(new FrostHunterContextOlympianElite8027(runnable, 0));
                return;
            default:
                ((FrostHunterValueAnimatorHyperNebulaUltra9912) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ FrostHunterFirestoreMegaTitanCelestial9734(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }
}
