package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBindingAdapterVisionNovaXNeo5053 implements FrostHunterInputFilterOlympianSparkCyber6164, FrostHunterSnackbarStormVortex8264 {
    public final float FrostHunterAlertDialogAuroraDelta3200;
    public final float FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterLaunchEclipseAurora4535 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterBindingAdapterVisionNovaXNeo5053(float f, FrostHunterLaunchEclipseAurora4535 frostHunterLaunchEclipseAurora4535) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = f;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterLaunchEclipseAurora4535;
        this.FrostHunterAlertDialogAuroraDelta3200 = f;
    }

    @Override // android.content.Context.FrostHunterSnackbarStormVortex8264
    public final void FrostHunterAlertDialogAuroraDelta3200(int i, FrostHunterStateFlowCosmosMega1087 frostHunterStateFlowCosmosMega1087, int[] iArr, int[] iArr2) {
        FrostHunterRemoteConfigSpeedSpeed8566(frostHunterStateFlowCosmosMega1087, i, iArr, FrostHunterViewLegendStormDelta9630.FrostHunterCameraXPixelTurboCosmos9814, iArr2);
    }

    @Override // android.content.Context.FrostHunterInputFilterOlympianSparkCyber6164, android.content.Context.FrostHunterSnackbarStormVortex8264
    public final float FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // android.content.Context.FrostHunterInputFilterOlympianSparkCyber6164
    public final void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterStateFlowCosmosMega1087 frostHunterStateFlowCosmosMega1087, int i, int[] iArr, FrostHunterViewLegendStormDelta9630 frostHunterViewLegendStormDelta9630, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int FrostHunterBillingClientFusionVortex9008 = frostHunterStateFlowCosmosMega1087.FrostHunterBillingClientFusionVortex9008(this.FrostHunterCameraXPixelTurboCosmos9814);
        if (frostHunterViewLegendStormDelta9630 == FrostHunterViewLegendStormDelta9630.FrostHunterFlowMaxDragonHero5809) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int min = Math.min(i2, i - i4);
                iArr2[length] = min;
                int min2 = Math.min(FrostHunterBillingClientFusionVortex9008, (i - min) - i4);
                int i5 = iArr2[length] + i4 + min2;
                length--;
                i3 = min2;
                i2 = i5;
            }
        } else {
            int length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int min3 = Math.min(i2, i - i8);
                iArr2[i7] = min3;
                int min4 = Math.min(FrostHunterBillingClientFusionVortex9008, (i - min3) - i8);
                int i9 = iArr2[i7] + i8 + min4;
                i6++;
                i3 = min4;
                i2 = i9;
                i7++;
            }
        }
        int i10 = i2 - i3;
        if (i10 < i) {
            int intValue = ((Number) this.FrostHunterFlowMaxDragonHero5809.FrostHunterCameraXPixelTurboCosmos9814(Integer.valueOf(i - i10), frostHunterViewLegendStormDelta9630)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + intValue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FrostHunterBindingAdapterVisionNovaXNeo5053) {
            FrostHunterBindingAdapterVisionNovaXNeo5053 frostHunterBindingAdapterVisionNovaXNeo5053 = (FrostHunterBindingAdapterVisionNovaXNeo5053) obj;
            return FrostHunterGyroscopeGammaEclipseForce6837.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterCameraXPixelTurboCosmos9814, frostHunterBindingAdapterVisionNovaXNeo5053.FrostHunterCameraXPixelTurboCosmos9814) && this.FrostHunterFlowMaxDragonHero5809 == frostHunterBindingAdapterVisionNovaXNeo5053.FrostHunterFlowMaxDragonHero5809;
        }
        return false;
    }

    public final int hashCode() {
        return this.FrostHunterFlowMaxDragonHero5809.hashCode() + FrostHunterImageCaptureShadowGammaMax6416.FrostHunterAlphaAnimationNeoCosmos5761(Float.hashCode(this.FrostHunterCameraXPixelTurboCosmos9814) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) FrostHunterGyroscopeGammaEclipseForce6837.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterCameraXPixelTurboCosmos9814)) + ", " + this.FrostHunterFlowMaxDragonHero5809 + ')';
    }
}
