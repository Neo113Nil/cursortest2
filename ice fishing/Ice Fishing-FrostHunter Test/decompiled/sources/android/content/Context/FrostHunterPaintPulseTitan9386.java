package android.content.Context;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterPaintPulseTitan9386 implements ThreadFactory {
    public final /* synthetic */ String FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterPaintPulseTitan9386(String str, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.FrostHunterAlphaAnimationNeoCosmos5761);
        thread.setDaemon(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        return thread;
    }
}
