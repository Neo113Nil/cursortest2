package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlipAnimationStrikeCelestialNova8784 {
    public final boolean FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterContentObserverThunderForceElite2345 FrostHunterAlphaAnimationNeoCosmos5761;
    public final long[] FrostHunterBundlePulseFusionHero2475;
    public final int[] FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterFlowMaxDragonHero5809;
    public final long[] FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final int[] FrostHunterRemoteConfigSpeedSpeed8566;
    public final int[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterFlipAnimationStrikeCelestialNova8784(FrostHunterContentObserverThunderForceElite2345 frostHunterContentObserverThunderForceElite2345, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(iArr.length == jArr2.length);
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(jArr.length == jArr2.length);
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(iArr2.length == jArr2.length);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterContentObserverThunderForceElite2345;
        this.FrostHunterBundlePulseFusionHero2475 = jArr;
        this.FrostHunterServiceEliteCelestialThunder1757 = iArr;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = jArr2;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = iArr2;
        this.FrostHunterCameraXPixelTurboCosmos9814 = iArr3;
        this.FrostHunterAlertDialogAuroraDelta3200 = z;
        this.FrostHunterFlowMaxDragonHero5809 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        long[] jArr = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (jArr.length <= 0) {
            return -1;
        }
        int i = 0;
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            return FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceEliteCelestialThunder1757(jArr, j, false);
        }
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int i3 = ((length - i) / 2) + i;
            if (jArr[iArr[i3]] <= j) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        long[] jArr = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            return FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761(jArr, j, true);
        }
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int i3 = ((length - i) / 2) + i;
            if (jArr[iArr[i3]] >= j) {
                length = i3 - 1;
                i2 = i3;
            } else {
                i = i3 + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i4 = i2 + 1;
                if (jArr[iArr[i4]] != j2) {
                    break;
                }
                i2 = i4;
            }
        }
        return iArr[i2];
    }
}
