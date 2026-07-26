package android.content.Context;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterLayoutNeoCyberMega2992 {
    public static final FrostHunterMaterialCardViewTitanMax3245 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterMaterialCardViewTitanMax3245(new byte[0], 0, 0, false, false);
    public static final AtomicReference[] FrostHunterBundlePulseFusionHero2475;
    public static final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        FrostHunterBundlePulseFusionHero2475 = atomicReferenceArr;
    }

    public static final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245) {
        frostHunterMaterialCardViewTitanMax3245.getClass();
        if (frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232 != null || frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566 != null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
            return;
        }
        if (frostHunterMaterialCardViewTitanMax3245.FrostHunterServiceEliteCelestialThunder1757) {
            return;
        }
        AtomicReference atomicReference = FrostHunterBundlePulseFusionHero2475[(int) (Thread.currentThread().getId() & (FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1))];
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32453 = (FrostHunterMaterialCardViewTitanMax3245) atomicReference.getAndSet(frostHunterMaterialCardViewTitanMax32452);
        if (frostHunterMaterialCardViewTitanMax32453 == frostHunterMaterialCardViewTitanMax32452) {
            return;
        }
        int i = frostHunterMaterialCardViewTitanMax32453 != null ? frostHunterMaterialCardViewTitanMax32453.FrostHunterBundlePulseFusionHero2475 : 0;
        if (i >= 65536) {
            atomicReference.set(frostHunterMaterialCardViewTitanMax32453);
            return;
        }
        frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterMaterialCardViewTitanMax32453;
        frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
        frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 = i + 8192;
        atomicReference.set(frostHunterMaterialCardViewTitanMax3245);
    }

    public static final FrostHunterMaterialCardViewTitanMax3245 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        AtomicReference atomicReference = FrostHunterBundlePulseFusionHero2475[(int) (Thread.currentThread().getId() & (FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1))];
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = (FrostHunterMaterialCardViewTitanMax3245) atomicReference.getAndSet(frostHunterMaterialCardViewTitanMax3245);
        if (frostHunterMaterialCardViewTitanMax32452 == frostHunterMaterialCardViewTitanMax3245) {
            return new FrostHunterMaterialCardViewTitanMax3245();
        }
        if (frostHunterMaterialCardViewTitanMax32452 == null) {
            atomicReference.set(null);
            return new FrostHunterMaterialCardViewTitanMax3245();
        }
        atomicReference.set(frostHunterMaterialCardViewTitanMax32452.FrostHunterLevelListDrawableFusionDragonHero2232);
        frostHunterMaterialCardViewTitanMax32452.FrostHunterLevelListDrawableFusionDragonHero2232 = null;
        frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475 = 0;
        return frostHunterMaterialCardViewTitanMax32452;
    }
}
