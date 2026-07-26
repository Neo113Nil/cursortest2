package android.content.Context;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterAdapterSpectraVisionThunder5171 extends FrostHunterTimerMegaOlympian7464 implements FrostHunterAdapterGammaQuantum7174 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterServiceEliteCelestialThunder1757 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterAdapterSpectraVisionThunder5171.class, "cleanedAndPointers$volatile");
    public final long FrostHunterBundlePulseFusionHero2475;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public FrostHunterAdapterSpectraVisionThunder5171(long j, FrostHunterAdapterSpectraVisionThunder5171 frostHunterAdapterSpectraVisionThunder5171, int i) {
        super(frostHunterAdapterSpectraVisionThunder5171);
        this.FrostHunterBundlePulseFusionHero2475 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // android.content.Context.FrostHunterTimerMegaOlympian7464
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return FrostHunterServiceEliteCelestialThunder1757.get(this) == FrostHunterLevelListDrawableFusionDragonHero2232() && FrostHunterConstraintSetCloneMasterUltraRogue2633() != null;
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814() {
        if (FrostHunterServiceEliteCelestialThunder1757.incrementAndGet(this) == FrostHunterLevelListDrawableFusionDragonHero2232()) {
            FrostHunterServiceEliteCelestialThunder1757();
        }
    }

    public final boolean FrostHunterFlowMaxDragonHero5809() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = FrostHunterServiceEliteCelestialThunder1757;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == FrostHunterLevelListDrawableFusionDragonHero2232() && FrostHunterConstraintSetCloneMasterUltraRogue2633() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public abstract int FrostHunterLevelListDrawableFusionDragonHero2232();

    public final boolean FrostHunterLifecycleBlazeGammaElite2889() {
        return FrostHunterServiceEliteCelestialThunder1757.addAndGet(this, -65536) == FrostHunterLevelListDrawableFusionDragonHero2232() && FrostHunterConstraintSetCloneMasterUltraRogue2633() != null;
    }

    public abstract void FrostHunterRemoteConfigSpeedSpeed8566(int i, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615);
}
