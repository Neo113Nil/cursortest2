package android.content.Context;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterJobSchedulerPhoenixRogue9514 implements ThreadFactory {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final ThreadFactory FrostHunterConstraintSetCloneMasterUltraRogue2633 = Executors.defaultThreadFactory();

    public FrostHunterJobSchedulerPhoenixRogue9514(String str) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.newThread(new FrostHunterContextOlympianElite8027(runnable, 2));
        newThread.setName(this.FrostHunterAlphaAnimationNeoCosmos5761);
        return newThread;
    }
}
