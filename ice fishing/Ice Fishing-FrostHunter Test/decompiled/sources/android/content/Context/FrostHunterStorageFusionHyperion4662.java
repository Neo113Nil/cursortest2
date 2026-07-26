package android.content.Context;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStorageFusionHyperion4662 implements FrostHunterAccelerometerPulseTitaniumMaster6945 {
    public final FrostHunterKotlinQuantumRogue5892 FrostHunterAlphaAnimationNeoCosmos5761;
    public Bundle FrostHunterBundlePulseFusionHero2475;
    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterSharedFlowTitaniumBeta1713 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterStorageFusionHyperion4662(FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892, FrostHunterFragmentManagerOlympianNovaAlpha1516 frostHunterFragmentManagerOlympianNovaAlpha1516) {
        frostHunterKotlinQuantumRogue5892.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterKotlinQuantumRogue5892;
        this.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterSharedFlowTitaniumBeta1713(new FrostHunterAnimatorAlphaVortexInferno7431(22, frostHunterFragmentManagerOlympianNovaAlpha1516));
    }

    @Override // android.content.Context.FrostHunterAccelerometerPulseTitaniumMaster6945
    public final Bundle FrostHunterAlphaAnimationNeoCosmos5761() {
        Bundle FrostHunterAlertDialogAuroraDelta3200 = FrostHunterVectorDrawableForceMax1351.FrostHunterAlertDialogAuroraDelta3200((FrostHunterLaunchHeroForce4010[]) Arrays.copyOf(new FrostHunterLaunchHeroForce4010[0], 0));
        Bundle bundle = this.FrostHunterBundlePulseFusionHero2475;
        if (bundle != null) {
            FrostHunterAlertDialogAuroraDelta3200.putAll(bundle);
        }
        for (Map.Entry entry : ((FrostHunterJobIntentServiceRogueNovaX8543) this.FrostHunterServiceEliteCelestialThunder1757.getValue()).FrostHunterConstraintSetCloneMasterUltraRogue2633.entrySet()) {
            String str = (String) entry.getKey();
            Bundle FrostHunterAlphaAnimationNeoCosmos5761 = ((FrostHunterServiceHeroPulseNovaX1024) ((FrostHunterStateFlowCosmosTurboPhantom3869) entry.getValue()).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFragmentBetaMegaVortex6025).FrostHunterAlphaAnimationNeoCosmos5761();
            if (!FrostHunterAlphaAnimationNeoCosmos5761.isEmpty()) {
                str.getClass();
                FrostHunterAlertDialogAuroraDelta3200.putBundle(str, FrostHunterAlphaAnimationNeoCosmos5761);
            }
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = false;
        return FrostHunterAlertDialogAuroraDelta3200;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return;
        }
        Bundle FrostHunterFlowMaxDragonHero5809 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle FrostHunterAlertDialogAuroraDelta3200 = FrostHunterVectorDrawableForceMax1351.FrostHunterAlertDialogAuroraDelta3200((FrostHunterLaunchHeroForce4010[]) Arrays.copyOf(new FrostHunterLaunchHeroForce4010[0], 0));
        Bundle bundle = this.FrostHunterBundlePulseFusionHero2475;
        if (bundle != null) {
            FrostHunterAlertDialogAuroraDelta3200.putAll(bundle);
        }
        if (FrostHunterFlowMaxDragonHero5809 != null) {
            FrostHunterAlertDialogAuroraDelta3200.putAll(FrostHunterFlowMaxDragonHero5809);
        }
        this.FrostHunterBundlePulseFusionHero2475 = FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = true;
    }
}
