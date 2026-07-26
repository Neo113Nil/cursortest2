package android.content.Context;

import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStrictModeDragonAlpha5913 implements FrostHunterApplicationInfoEclipseSparkDelta6014, FrostHunterMenuPrimeTitan7073 {
    public final FrostHunterSnackbarStormVortex8264 FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterBitmapStrikeOmegaPixel8415 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterStrictModeDragonAlpha5913(FrostHunterSnackbarStormVortex8264 frostHunterSnackbarStormVortex8264, FrostHunterBitmapStrikeOmegaPixel8415 frostHunterBitmapStrikeOmegaPixel8415) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterSnackbarStormVortex8264;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterBitmapStrikeOmegaPixel8415;
    }

    @Override // android.content.Context.FrostHunterApplicationInfoEclipseSparkDelta6014
    public final int FrostHunterAlertDialogAuroraDelta3200(FrostHunterJobIntentServiceMasterFusionStrike2318 frostHunterJobIntentServiceMasterFusionStrike2318, List list, int i) {
        int FrostHunterBillingClientFusionVortex9008 = frostHunterJobIntentServiceMasterFusionStrike2318.FrostHunterBillingClientFusionVortex9008(this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            FrostHunterDigitalInkRecognitionSpeedMasterVision5998 frostHunterDigitalInkRecognitionSpeedMasterVision5998 = (FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list.get(i4);
            float FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955(frostHunterDigitalInkRecognitionSpeedMasterVision5998));
            int FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterDigitalInkRecognitionSpeedMasterVision5998.FrostHunterRemoteConfigSpeedSpeed8566(i);
            if (FrostHunterMediaPlayerCelestialBetaTitan3868 == 0.0f) {
                i3 += FrostHunterRemoteConfigSpeedSpeed8566;
            } else if (FrostHunterMediaPlayerCelestialBetaTitan3868 > 0.0f) {
                f += FrostHunterMediaPlayerCelestialBetaTitan3868;
                i2 = Math.max(i2, Math.round(FrostHunterRemoteConfigSpeedSpeed8566 / FrostHunterMediaPlayerCelestialBetaTitan3868));
            }
        }
        return ((list.size() - 1) * FrostHunterBillingClientFusionVortex9008) + Math.round(i2 * f) + i3;
    }

    @Override // android.content.Context.FrostHunterMenuPrimeTitan7073
    public final int FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterClipDrawableMasterVortexEclipse8656 frostHunterClipDrawableMasterVortexEclipse8656) {
        return frostHunterClipDrawableMasterVortexEclipse8656.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // android.content.Context.FrostHunterApplicationInfoEclipseSparkDelta6014
    public final int FrostHunterBundlePulseFusionHero2475(FrostHunterJobIntentServiceMasterFusionStrike2318 frostHunterJobIntentServiceMasterFusionStrike2318, List list, int i) {
        int FrostHunterBillingClientFusionVortex9008 = frostHunterJobIntentServiceMasterFusionStrike2318.FrostHunterBillingClientFusionVortex9008(this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * FrostHunterBillingClientFusionVortex9008, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            FrostHunterDigitalInkRecognitionSpeedMasterVision5998 frostHunterDigitalInkRecognitionSpeedMasterVision5998 = (FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list.get(i3);
            float FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955(frostHunterDigitalInkRecognitionSpeedMasterVision5998));
            if (FrostHunterMediaPlayerCelestialBetaTitan3868 == 0.0f) {
                int min2 = Math.min(frostHunterDigitalInkRecognitionSpeedMasterVision5998.FrostHunterRemoteConfigSpeedSpeed8566(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, frostHunterDigitalInkRecognitionSpeedMasterVision5998.FrostHunterFCMDeltaQuantumHero8364(min2));
            } else if (FrostHunterMediaPlayerCelestialBetaTitan3868 > 0.0f) {
                f += FrostHunterMediaPlayerCelestialBetaTitan3868;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            FrostHunterDigitalInkRecognitionSpeedMasterVision5998 frostHunterDigitalInkRecognitionSpeedMasterVision59982 = (FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list.get(i4);
            float FrostHunterMediaPlayerCelestialBetaTitan38682 = FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955(frostHunterDigitalInkRecognitionSpeedMasterVision59982));
            if (FrostHunterMediaPlayerCelestialBetaTitan38682 > 0.0f) {
                i2 = Math.max(i2, frostHunterDigitalInkRecognitionSpeedMasterVision59982.FrostHunterFCMDeltaQuantumHero8364(round != Integer.MAX_VALUE ? Math.round(round * FrostHunterMediaPlayerCelestialBetaTitan38682) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // android.content.Context.FrostHunterMenuPrimeTitan7073
    public final FrostHunterInstrumentationPhantomVortex8747 FrostHunterCameraXPixelTurboCosmos9814(final FrostHunterClipDrawableMasterVortexEclipse8656[] frostHunterClipDrawableMasterVortexEclipse8656Arr, final FrostHunterStateFlowCosmosMega1087 frostHunterStateFlowCosmosMega1087, final int[] iArr, int i, final int i2) {
        return frostHunterStateFlowCosmosMega1087.FrostHunterPushNotificationStormTitanGamma8999(i2, i, FrostHunterLayoutInfernoStrike4529.FrostHunterCameraXPixelTurboCosmos9814, new FrostHunterCombineLegendMegaPrime5473() { // from class: android.content.Context.FrostHunterGraphBlazeCosmosHero8154
            @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
            public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
                FrostHunterFCMMegaBlazePrime4399 frostHunterFCMMegaBlazePrime4399 = (FrostHunterFCMMegaBlazePrime4399) obj;
                FrostHunterClipDrawableMasterVortexEclipse8656[] frostHunterClipDrawableMasterVortexEclipse8656Arr2 = frostHunterClipDrawableMasterVortexEclipse8656Arr;
                int length = frostHunterClipDrawableMasterVortexEclipse8656Arr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    FrostHunterClipDrawableMasterVortexEclipse8656 frostHunterClipDrawableMasterVortexEclipse8656 = frostHunterClipDrawableMasterVortexEclipse8656Arr2[i3];
                    int i5 = i4 + 1;
                    frostHunterClipDrawableMasterVortexEclipse8656.getClass();
                    frostHunterClipDrawableMasterVortexEclipse8656.FrostHunterFragmentBetaMegaVortex6025();
                    FrostHunterViewLegendStormDelta9630 layoutDirection = frostHunterStateFlowCosmosMega1087.getLayoutDirection();
                    float f = (i2 - frostHunterClipDrawableMasterVortexEclipse8656.FrostHunterCameraXPixelTurboCosmos9814) / 2.0f;
                    float f2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (layoutDirection != FrostHunterViewLegendStormDelta9630.FrostHunterCameraXPixelTurboCosmos9814) {
                        f2 *= -1.0f;
                    }
                    FrostHunterFCMMegaBlazePrime4399.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterFCMMegaBlazePrime4399, frostHunterClipDrawableMasterVortexEclipse8656, Math.round((1.0f + f2) * f), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            }
        });
    }

    @Override // android.content.Context.FrostHunterApplicationInfoEclipseSparkDelta6014
    public final FrostHunterInstrumentationPhantomVortex8747 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterStateFlowCosmosMega1087 frostHunterStateFlowCosmosMega1087, List list, long j) {
        return FrostHunterCanvasInfernoVortex4700.FrostHunterNavigationMasterMegaMax2752(this, FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterFlowMaxDragonHero5809(j), FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j), FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterRemoteConfigSpeedSpeed8566(j), FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterCameraXPixelTurboCosmos9814(j), frostHunterStateFlowCosmosMega1087.FrostHunterBillingClientFusionVortex9008(this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761()), frostHunterStateFlowCosmosMega1087, list, new FrostHunterClipDrawableMasterVortexEclipse8656[list.size()], list.size());
    }

    @Override // android.content.Context.FrostHunterMenuPrimeTitan7073
    public final void FrostHunterFlowMaxDragonHero5809(int i, FrostHunterStateFlowCosmosMega1087 frostHunterStateFlowCosmosMega1087, int[] iArr, int[] iArr2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200(i, frostHunterStateFlowCosmosMega1087, iArr, iArr2);
    }

    @Override // android.content.Context.FrostHunterApplicationInfoEclipseSparkDelta6014
    public final int FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterJobIntentServiceMasterFusionStrike2318 frostHunterJobIntentServiceMasterFusionStrike2318, List list, int i) {
        int FrostHunterBillingClientFusionVortex9008 = frostHunterJobIntentServiceMasterFusionStrike2318.FrostHunterBillingClientFusionVortex9008(this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * FrostHunterBillingClientFusionVortex9008, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            FrostHunterDigitalInkRecognitionSpeedMasterVision5998 frostHunterDigitalInkRecognitionSpeedMasterVision5998 = (FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list.get(i3);
            float FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955(frostHunterDigitalInkRecognitionSpeedMasterVision5998));
            if (FrostHunterMediaPlayerCelestialBetaTitan3868 == 0.0f) {
                int min2 = Math.min(frostHunterDigitalInkRecognitionSpeedMasterVision5998.FrostHunterRemoteConfigSpeedSpeed8566(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, frostHunterDigitalInkRecognitionSpeedMasterVision5998.FrostHunterMeteringPointMegaCyber7955(min2));
            } else if (FrostHunterMediaPlayerCelestialBetaTitan3868 > 0.0f) {
                f += FrostHunterMediaPlayerCelestialBetaTitan3868;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            FrostHunterDigitalInkRecognitionSpeedMasterVision5998 frostHunterDigitalInkRecognitionSpeedMasterVision59982 = (FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list.get(i4);
            float FrostHunterMediaPlayerCelestialBetaTitan38682 = FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955(frostHunterDigitalInkRecognitionSpeedMasterVision59982));
            if (FrostHunterMediaPlayerCelestialBetaTitan38682 > 0.0f) {
                i2 = Math.max(i2, frostHunterDigitalInkRecognitionSpeedMasterVision59982.FrostHunterMeteringPointMegaCyber7955(round != Integer.MAX_VALUE ? Math.round(round * FrostHunterMediaPlayerCelestialBetaTitan38682) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // android.content.Context.FrostHunterMenuPrimeTitan7073
    public final long FrostHunterLifecycleBlazeGammaElite2889(int i, int i2, int i3, boolean z) {
        return !z ? FrostHunterActivityGammaForce8909.FrostHunterAlphaAnimationNeoCosmos5761(0, i3, i, i2) : FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceInfoHyperionSparkMax9966(0, i3, i, i2);
    }

    @Override // android.content.Context.FrostHunterMenuPrimeTitan7073
    public final int FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterClipDrawableMasterVortexEclipse8656 frostHunterClipDrawableMasterVortexEclipse8656) {
        return frostHunterClipDrawableMasterVortexEclipse8656.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterApplicationInfoEclipseSparkDelta6014
    public final int FrostHunterServiceEliteCelestialThunder1757(FrostHunterJobIntentServiceMasterFusionStrike2318 frostHunterJobIntentServiceMasterFusionStrike2318, List list, int i) {
        int FrostHunterBillingClientFusionVortex9008 = frostHunterJobIntentServiceMasterFusionStrike2318.FrostHunterBillingClientFusionVortex9008(this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            FrostHunterDigitalInkRecognitionSpeedMasterVision5998 frostHunterDigitalInkRecognitionSpeedMasterVision5998 = (FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list.get(i4);
            float FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955(frostHunterDigitalInkRecognitionSpeedMasterVision5998));
            int FrostHunterNavigationMasterMegaMax2752 = frostHunterDigitalInkRecognitionSpeedMasterVision5998.FrostHunterNavigationMasterMegaMax2752(i);
            if (FrostHunterMediaPlayerCelestialBetaTitan3868 == 0.0f) {
                i3 += FrostHunterNavigationMasterMegaMax2752;
            } else if (FrostHunterMediaPlayerCelestialBetaTitan3868 > 0.0f) {
                f += FrostHunterMediaPlayerCelestialBetaTitan3868;
                i2 = Math.max(i2, Math.round(FrostHunterNavigationMasterMegaMax2752 / FrostHunterMediaPlayerCelestialBetaTitan3868));
            }
        }
        return ((list.size() - 1) * FrostHunterBillingClientFusionVortex9008) + Math.round(i2 * f) + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterStrictModeDragonAlpha5913)) {
            return false;
        }
        FrostHunterStrictModeDragonAlpha5913 frostHunterStrictModeDragonAlpha5913 = (FrostHunterStrictModeDragonAlpha5913) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterStrictModeDragonAlpha5913.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterStrictModeDragonAlpha5913.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761) + (this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", horizontalAlignment=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ')';
    }
}
