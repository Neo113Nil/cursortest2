package android.content.Context;

import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewModelTitaniumFusionHyper9731 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ PackageHandler FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterViewModelTitaniumFusionHyper9731(PackageHandler packageHandler, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        AtomicBoolean atomicBoolean;
        ILogger iLogger2;
        AtomicBoolean atomicBoolean2;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        PackageHandler packageHandler = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                packageHandler.initI();
                break;
            case 1:
                packageHandler.sendFirstI();
                break;
            case 2:
                iLogger = packageHandler.logger;
                iLogger.verbose("Package handler can send", new Object[0]);
                atomicBoolean = packageHandler.isSending;
                atomicBoolean.set(false);
                packageHandler.sendFirstPackage();
                break;
            case 3:
                packageHandler.flushI();
                break;
            default:
                iLogger2 = packageHandler.logger;
                iLogger2.verbose("Package handler finished waiting to continue", new Object[0]);
                atomicBoolean2 = packageHandler.isSending;
                atomicBoolean2.set(false);
                packageHandler.sendFirstPackage();
                break;
        }
    }
}
