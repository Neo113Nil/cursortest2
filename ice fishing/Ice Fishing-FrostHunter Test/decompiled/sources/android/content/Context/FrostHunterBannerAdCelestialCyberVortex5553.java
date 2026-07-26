package android.content.Context;

import com.adjust.sdk.AdjustFactory;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBannerAdCelestialCyberVortex5553 implements RejectedExecutionHandler {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ String FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterBannerAdCelestialCyberVortex5553(String str, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        String str = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
                break;
            default:
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
                break;
        }
    }
}
