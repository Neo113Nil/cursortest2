package android.content.Context;

import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionEventBetaAuroraStorm8100 {
    public final ArrayList FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterSharedFlowTitaniumBeta1713 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final FrostHunterContentResolverEpicBetaOlympian4466 FrostHunterLifecycleBlazeGammaElite2889;
    public final ArrayList FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterMotionEventBetaAuroraStorm8100(int i, ArrayList arrayList) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = arrayList;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        if (i < 0) {
            FrostHunterDialogMegaAuroraSpark4718.FrostHunterAlphaAnimationNeoCosmos5761("Invalid start index");
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = new ArrayList();
        FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian4466 = new FrostHunterContentResolverEpicBetaOlympian4466();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            FrostHunterTimerLegendMaster7334 frostHunterTimerLegendMaster7334 = (FrostHunterTimerLegendMaster7334) this.FrostHunterAlphaAnimationNeoCosmos5761.get(i3);
            int i4 = frostHunterTimerLegendMaster7334.FrostHunterBundlePulseFusionHero2475;
            int i5 = frostHunterTimerLegendMaster7334.FrostHunterServiceEliteCelestialThunder1757;
            frostHunterContentResolverEpicBetaOlympian4466.FrostHunterRemoteConfigSpeedSpeed8566(i4, new FrostHunterExecutorBetaRogue1502(i3, i2, i5));
            i2 += i5;
        }
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterContentResolverEpicBetaOlympian4466;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterSharedFlowTitaniumBeta1713(new FrostHunterJavaMaxThunderLegend3579(2, this));
    }

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(int i, int i2) {
        FrostHunterExecutorBetaRogue1502 frostHunterExecutorBetaRogue1502;
        int i3;
        int i4;
        FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian4466 = this.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterExecutorBetaRogue1502 frostHunterExecutorBetaRogue15022 = (FrostHunterExecutorBetaRogue1502) frostHunterContentResolverEpicBetaOlympian4466.FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
        if (frostHunterExecutorBetaRogue15022 == null) {
            return false;
        }
        int i5 = frostHunterExecutorBetaRogue15022.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i6 = i2 - frostHunterExecutorBetaRogue15022.FrostHunterBundlePulseFusionHero2475;
        frostHunterExecutorBetaRogue15022.FrostHunterBundlePulseFusionHero2475 = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = frostHunterContentResolverEpicBetaOlympian4466.FrostHunterBundlePulseFusionHero2475;
        long[] jArr = frostHunterContentResolverEpicBetaOlympian4466.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (frostHunterExecutorBetaRogue1502 = (FrostHunterExecutorBetaRogue1502) objArr[(i7 << 3) + i9]).FrostHunterConstraintSetCloneMasterUltraRogue2633) >= i5 && frostHunterExecutorBetaRogue1502 != frostHunterExecutorBetaRogue15022 && (i4 = i3 + i6) >= 0) {
                        frostHunterExecutorBetaRogue1502.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
