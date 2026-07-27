package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterRemoteConfigDeltaTitanMaster1902 implements Executor {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final void FrostHunterAlphaAnimationNeoCosmos5761(Runnable runnable) {
    }
}
