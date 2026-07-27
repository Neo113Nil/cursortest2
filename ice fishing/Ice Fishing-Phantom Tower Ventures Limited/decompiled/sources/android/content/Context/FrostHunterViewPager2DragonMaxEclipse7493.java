package android.content.Context;

import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewPager2DragonMaxEclipse7493 extends FrostHunterNotificationManagerPixelTurbo6104 {
    public final /* synthetic */ FrostHunterGradientDrawablePrimeUltraNeo5802 FrostHunterAlertDialogAuroraDelta3200;
    public final Object FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterViewPager2DragonMaxEclipse7493(FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo5802, int i) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterGradientDrawablePrimeUltraNeo5802;
        Object obj = FrostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterLintTitanVortexQuantum9911;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterFlowMaxDragonHero5809()[i];
        this.FrostHunterFlowMaxDragonHero5809 = i;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        int i = this.FrostHunterFlowMaxDragonHero5809;
        Object obj = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo5802 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i != -1 && i < frostHunterGradientDrawablePrimeUltraNeo5802.size()) {
            if (FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(obj, frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterFlowMaxDragonHero5809()[this.FrostHunterFlowMaxDragonHero5809])) {
                return;
            }
        }
        Object obj2 = FrostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterLintTitanVortexQuantum9911;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterServiceEliteCelestialThunder1757(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo5802 = this.FrostHunterAlertDialogAuroraDelta3200;
        Map FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
            return FrostHunterConstraintSetCloneMasterUltraRogue2633.get(this.FrostHunterCameraXPixelTurboCosmos9814);
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
        int i = this.FrostHunterFlowMaxDragonHero5809;
        if (i == -1) {
            return null;
        }
        return frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterAlertDialogAuroraDelta3200()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo5802 = this.FrostHunterAlertDialogAuroraDelta3200;
        Map FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        Object obj2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
            return FrostHunterConstraintSetCloneMasterUltraRogue2633.put(obj2, obj);
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
        int i = this.FrostHunterFlowMaxDragonHero5809;
        if (i == -1) {
            frostHunterGradientDrawablePrimeUltraNeo5802.put(obj2, obj);
            return null;
        }
        Object obj3 = frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterAlertDialogAuroraDelta3200()[i];
        frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterAlertDialogAuroraDelta3200()[this.FrostHunterFlowMaxDragonHero5809] = obj;
        return obj3;
    }
}
