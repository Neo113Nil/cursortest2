package android.content.Context;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterToastCosmosSolar2390 {
    public final AtomicReferenceArray FrostHunterAlphaAnimationNeoCosmos5761 = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterConstraintSetCloneMasterUltraRogue2633 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterToastCosmosSolar2390.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterBundlePulseFusionHero2475 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterToastCosmosSolar2390.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterServiceEliteCelestialThunder1757 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterToastCosmosSolar2390.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterLifecycleBlazeGammaElite2889 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterToastCosmosSolar2390.class, "blockingTasksInBuffer$volatile");

    public final FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel3775) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterBundlePulseFusionHero2475;
        if (atomicIntegerFieldUpdater.get(this) - FrostHunterServiceEliteCelestialThunder1757.get(this) == 127) {
            return frostHunterLiveDataHyperionVisionPixel3775;
        }
        if (frostHunterLiveDataHyperionVisionPixel3775.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterLifecycleBlazeGammaElite2889.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, frostHunterLiveDataHyperionVisionPixel3775);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterBundlePulseFusionHero2475(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel3775 = (FrostHunterLiveDataHyperionVisionPixel3775) atomicReferenceArray.get(i2);
        if (frostHunterLiveDataHyperionVisionPixel3775 != null && frostHunterLiveDataHyperionVisionPixel3775.FrostHunterFlowMaxDragonHero5809 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, frostHunterLiveDataHyperionVisionPixel3775, null)) {
                if (atomicReferenceArray.get(i2) != frostHunterLiveDataHyperionVisionPixel3775) {
                }
            }
            if (z) {
                FrostHunterLifecycleBlazeGammaElite2889.decrementAndGet(this);
            }
            return frostHunterLiveDataHyperionVisionPixel3775;
        }
        return null;
    }

    public final FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel3775;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterServiceEliteCelestialThunder1757;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - FrostHunterBundlePulseFusionHero2475.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (frostHunterLiveDataHyperionVisionPixel3775 = (FrostHunterLiveDataHyperionVisionPixel3775) this.FrostHunterAlphaAnimationNeoCosmos5761.getAndSet(i2, null)) != null) {
                if (frostHunterLiveDataHyperionVisionPixel3775.FrostHunterFlowMaxDragonHero5809) {
                    FrostHunterLifecycleBlazeGammaElite2889.decrementAndGet(this);
                }
                return frostHunterLiveDataHyperionVisionPixel3775;
            }
        }
    }
}
