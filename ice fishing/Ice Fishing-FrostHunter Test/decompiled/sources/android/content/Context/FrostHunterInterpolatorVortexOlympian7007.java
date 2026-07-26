package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterInterpolatorVortexOlympian7007 implements ThreadFactory {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ String FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterInterpolatorVortexOlympian7007(String str, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        String str = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, str);
        }
    }
}
