package android.content.Context;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayoutPhantomBlaze1579 implements ThreadFactory {
    public static final ThreadFactory FrostHunterLifecycleBlazeGammaElite2889 = Executors.defaultThreadFactory();
    public final AtomicLong FrostHunterAlphaAnimationNeoCosmos5761 = new AtomicLong();
    public final int FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final StrictMode.ThreadPolicy FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterLayoutPhantomBlaze1579(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = FrostHunterLifecycleBlazeGammaElite2889.newThread(new FrostHunterDialogQuantumTurbo8340(13, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + " Thread #" + this.FrostHunterAlphaAnimationNeoCosmos5761.getAndIncrement());
        return newThread;
    }
}
