package android.content.Context;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLiveDataScopeCyberHyper8513 {
    public float FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterLaunchTitanPhantomQuantum2374 FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterBitmapTurboDeltaNebula8743;
    public RectF FrostHunterDialogFragmentTurboPhoenixDragon7627;
    public FrostHunterCardViewFusionHeroSpectra3749 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public FrostHunterCoroutinePixelNebulaMaster1626 FrostHunterFragmentBetaMegaVortex6025;
    public FrostHunterCoroutineNovaXMasterMaster7803 FrostHunterKeyframeGammaGamma1197;
    public Outline FrostHunterLevelListDrawableFusionDragonHero2232;
    public boolean FrostHunterLightSensorForceFusion4241;
    public int FrostHunterLintTitanVortexQuantum9911;
    public long FrostHunterLooperThreadBetaHyperionMax1000;
    public long FrostHunterMotionSceneAuroraMega2271;
    public boolean FrostHunterResourcesTitanHyperVision5823;
    public FrostHunterTimerMaxMega5472 FrostHunterScaleAnimationStrikeSpark5059;
    public FrostHunterCoroutinePixelNebulaMaster1626 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public long FrostHunterTextViewDragonStormMega4297;
    public FrostHunterDispatchersPrimeHeroSpeed4562 FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLifecycleBlazeGammaElite2889;
    public FrostHunterViewLegendStormDelta9630 FrostHunterBundlePulseFusionHero2475 = FrostHunterViewLegendStormDelta9630.FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterCombineLegendMegaPrime5473 FrostHunterServiceEliteCelestialThunder1757 = FrostHunterManifestHyperTitanAlpha1411.FrostHunterServiceInfoHyperionSparkMax9966;
    public final FrostHunterOnAttachStateChangeListenerStrikeOmegaElite9598 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterOnAttachStateChangeListenerStrikeOmegaElite9598(13, this);
    public boolean FrostHunterRemoteConfigSpeedSpeed8566 = true;
    public long FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public long FrostHunterFlowMaxDragonHero5809 = 9205357640488583168L;
    public final FrostHunterDispatchersInfernoSpark9076 FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterDispatchersInfernoSpark9076();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public FrostHunterLiveDataScopeCyberHyper8513(FrostHunterLaunchTitanPhantomQuantum2374 frostHunterLaunchTitanPhantomQuantum2374) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLaunchTitanPhantomQuantum2374;
        frostHunterLaunchTitanPhantomQuantum2374.FrostHunterTextViewDragonStormMega4297(false);
        this.FrostHunterTextViewDragonStormMega4297 = 0L;
        this.FrostHunterLooperThreadBetaHyperionMax1000 = 0L;
        this.FrostHunterMotionSceneAuroraMega2271 = 9205357640488583168L;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        Outline outline;
        if (this.FrostHunterRemoteConfigSpeedSpeed8566) {
            boolean z = this.FrostHunterBitmapTurboDeltaNebula8743;
            Outline outline2 = null;
            FrostHunterLaunchTitanPhantomQuantum2374 frostHunterLaunchTitanPhantomQuantum2374 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (z || frostHunterLaunchTitanPhantomQuantum2374.FrostHunterMeteringPointMegaCyber7955() > 0.0f) {
                FrostHunterCoroutinePixelNebulaMaster1626 frostHunterCoroutinePixelNebulaMaster1626 = this.FrostHunterFragmentBetaMegaVortex6025;
                if (frostHunterCoroutinePixelNebulaMaster1626 != null) {
                    RectF rectF = this.FrostHunterDialogFragmentTurboPhoenixDragon7627;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.FrostHunterDialogFragmentTurboPhoenixDragon7627 = rectF;
                    }
                    boolean z2 = frostHunterCoroutinePixelNebulaMaster1626 instanceof FrostHunterCoroutinePixelNebulaMaster1626;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = frostHunterCoroutinePixelNebulaMaster1626.FrostHunterAlphaAnimationNeoCosmos5761;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                        if (outline == null) {
                            outline = new Outline();
                            this.FrostHunterLevelListDrawableFusionDragonHero2232 = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.FrostHunterLightSensorForceFusion4241 = !outline.canClip();
                    } else {
                        Outline outline3 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.FrostHunterLightSensorForceFusion4241 = true;
                        outline = null;
                    }
                    this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterCoroutinePixelNebulaMaster1626;
                    if (outline != null) {
                        outline.setAlpha(frostHunterLaunchTitanPhantomQuantum2374.FrostHunterAlphaAnimationNeoCosmos5761());
                        outline2 = outline;
                    }
                    frostHunterLaunchTitanPhantomQuantum2374.FrostHunterKeyframeGammaGamma1197(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.FrostHunterLightSensorForceFusion4241 && this.FrostHunterBitmapTurboDeltaNebula8743) {
                        frostHunterLaunchTitanPhantomQuantum2374.FrostHunterTextViewDragonStormMega4297(false);
                        frostHunterLaunchTitanPhantomQuantum2374.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
                    } else {
                        frostHunterLaunchTitanPhantomQuantum2374.FrostHunterTextViewDragonStormMega4297(this.FrostHunterBitmapTurboDeltaNebula8743);
                    }
                } else {
                    frostHunterLaunchTitanPhantomQuantum2374.FrostHunterTextViewDragonStormMega4297(this.FrostHunterBitmapTurboDeltaNebula8743);
                    Outline outline4 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.FrostHunterLevelListDrawableFusionDragonHero2232 = outline4;
                    }
                    Outline outline5 = outline4;
                    long FrostHunterColorDrawableLegendPhoenixVision7927 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorDrawableLegendPhoenixVision7927(this.FrostHunterLooperThreadBetaHyperionMax1000);
                    long j = this.FrostHunterCameraXPixelTurboCosmos9814;
                    long j2 = this.FrostHunterFlowMaxDragonHero5809;
                    if (j2 != 9205357640488583168L) {
                        FrostHunterColorDrawableLegendPhoenixVision7927 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (FrostHunterColorDrawableLegendPhoenixVision7927 >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (FrostHunterColorDrawableLegendPhoenixVision7927 & 4294967295L)) + Float.intBitsToFloat(i3)), this.FrostHunterAlertDialogAuroraDelta3200);
                    outline5.setAlpha(frostHunterLaunchTitanPhantomQuantum2374.FrostHunterAlphaAnimationNeoCosmos5761());
                    frostHunterLaunchTitanPhantomQuantum2374.FrostHunterKeyframeGammaGamma1197(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                frostHunterLaunchTitanPhantomQuantum2374.FrostHunterTextViewDragonStormMega4297(false);
                frostHunterLaunchTitanPhantomQuantum2374.FrostHunterKeyframeGammaGamma1197(null, 0L);
            }
        }
        this.FrostHunterRemoteConfigSpeedSpeed8566 = false;
    }

    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterMotionLayoutThunderMasterOmega3195 frostHunterMotionLayoutThunderMasterOmega3195) {
        FrostHunterDispatchersInfernoSpark9076 frostHunterDispatchersInfernoSpark9076 = this.FrostHunterCameraXTurboCelestialHero5430;
        frostHunterDispatchersInfernoSpark9076.FrostHunterBundlePulseFusionHero2475 = (FrostHunterLiveDataScopeCyberHyper8513) frostHunterDispatchersInfernoSpark9076.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = (FrostHunterToolbarHeroNovaX1020) frostHunterDispatchersInfernoSpark9076.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterToolbarHeroNovaX1020 != null && frostHunterToolbarHeroNovaX1020.FrostHunterCameraXPixelTurboCosmos9814()) {
            FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX10202 = (FrostHunterToolbarHeroNovaX1020) frostHunterDispatchersInfernoSpark9076.FrostHunterLifecycleBlazeGammaElite2889;
            if (frostHunterToolbarHeroNovaX10202 == null) {
                int i = FrostHunterViewModelSolarLegendTitan9202.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterToolbarHeroNovaX10202 = new FrostHunterToolbarHeroNovaX1020();
                frostHunterDispatchersInfernoSpark9076.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterToolbarHeroNovaX10202;
            }
            frostHunterToolbarHeroNovaX10202.FrostHunterFlowMaxDragonHero5809(frostHunterToolbarHeroNovaX1020);
            frostHunterToolbarHeroNovaX1020.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        frostHunterDispatchersInfernoSpark9076.FrostHunterAlphaAnimationNeoCosmos5761 = true;
        this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMotionLayoutThunderMasterOmega3195);
        frostHunterDispatchersInfernoSpark9076.FrostHunterAlphaAnimationNeoCosmos5761 = false;
        FrostHunterLiveDataScopeCyberHyper8513 frostHunterLiveDataScopeCyberHyper8513 = (FrostHunterLiveDataScopeCyberHyper8513) frostHunterDispatchersInfernoSpark9076.FrostHunterBundlePulseFusionHero2475;
        if (frostHunterLiveDataScopeCyberHyper8513 != null) {
            frostHunterLiveDataScopeCyberHyper8513.FrostHunterLifecycleBlazeGammaElite2889();
        }
        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX10203 = (FrostHunterToolbarHeroNovaX1020) frostHunterDispatchersInfernoSpark9076.FrostHunterLifecycleBlazeGammaElite2889;
        if (frostHunterToolbarHeroNovaX10203 == null || !frostHunterToolbarHeroNovaX10203.FrostHunterCameraXPixelTurboCosmos9814()) {
            return;
        }
        Object[] objArr = frostHunterToolbarHeroNovaX10203.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr = frostHunterToolbarHeroNovaX10203.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((FrostHunterLiveDataScopeCyberHyper8513) objArr[(i2 << 3) + i4]).FrostHunterLifecycleBlazeGammaElite2889();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        frostHunterToolbarHeroNovaX10203.FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterResourcesTitanHyperVision5823 && this.FrostHunterLintTitanVortexQuantum9911 == 0) {
            FrostHunterDispatchersInfernoSpark9076 frostHunterDispatchersInfernoSpark9076 = this.FrostHunterCameraXTurboCelestialHero5430;
            FrostHunterLiveDataScopeCyberHyper8513 frostHunterLiveDataScopeCyberHyper8513 = (FrostHunterLiveDataScopeCyberHyper8513) frostHunterDispatchersInfernoSpark9076.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (frostHunterLiveDataScopeCyberHyper8513 != null) {
                frostHunterLiveDataScopeCyberHyper8513.FrostHunterLifecycleBlazeGammaElite2889();
                frostHunterDispatchersInfernoSpark9076.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
            }
            FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = (FrostHunterToolbarHeroNovaX1020) frostHunterDispatchersInfernoSpark9076.FrostHunterServiceEliteCelestialThunder1757;
            if (frostHunterToolbarHeroNovaX1020 != null) {
                Object[] objArr = frostHunterToolbarHeroNovaX1020.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                long[] jArr = frostHunterToolbarHeroNovaX1020.FrostHunterAlphaAnimationNeoCosmos5761;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((FrostHunterLiveDataScopeCyberHyper8513) objArr[(i << 3) + i3]).FrostHunterLifecycleBlazeGammaElite2889();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                frostHunterToolbarHeroNovaX1020.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
        }
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(float f, long j, long j2) {
        if (FrostHunterFirebaseVortexDeltaBlaze8413.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterCameraXPixelTurboCosmos9814, j) && FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFlowMaxDragonHero5809, j2) && this.FrostHunterAlertDialogAuroraDelta3200 == f && this.FrostHunterFragmentBetaMegaVortex6025 == null) {
            return;
        }
        this.FrostHunterKeyframeGammaGamma1197 = null;
        this.FrostHunterFragmentBetaMegaVortex6025 = null;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = true;
        this.FrostHunterLightSensorForceFusion4241 = false;
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
        this.FrostHunterFlowMaxDragonHero5809 = j2;
        this.FrostHunterAlertDialogAuroraDelta3200 = f;
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889() {
        this.FrostHunterLintTitanVortexQuantum9911--;
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final FrostHunterCoroutineNovaXMasterMaster7803 FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterCoroutineNovaXMasterMaster7803 frostHunterViewPulseShadow4652;
        FrostHunterCoroutineNovaXMasterMaster7803 frostHunterCoroutineNovaXMasterMaster7803 = this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterCoroutinePixelNebulaMaster1626 frostHunterCoroutinePixelNebulaMaster1626 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterCoroutineNovaXMasterMaster7803 != null) {
            return frostHunterCoroutineNovaXMasterMaster7803;
        }
        if (frostHunterCoroutinePixelNebulaMaster1626 != null) {
            FrostHunterAnnotationProcessorLegendHyperNeo3699 frostHunterAnnotationProcessorLegendHyperNeo3699 = new FrostHunterAnnotationProcessorLegendHyperNeo3699(frostHunterCoroutinePixelNebulaMaster1626);
            this.FrostHunterKeyframeGammaGamma1197 = frostHunterAnnotationProcessorLegendHyperNeo3699;
            return frostHunterAnnotationProcessorLegendHyperNeo3699;
        }
        long FrostHunterColorDrawableLegendPhoenixVision7927 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorDrawableLegendPhoenixVision7927(this.FrostHunterLooperThreadBetaHyperionMax1000);
        long j = this.FrostHunterCameraXPixelTurboCosmos9814;
        long j2 = this.FrostHunterFlowMaxDragonHero5809;
        if (j2 != 9205357640488583168L) {
            FrostHunterColorDrawableLegendPhoenixVision7927 = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (FrostHunterColorDrawableLegendPhoenixVision7927 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (FrostHunterColorDrawableLegendPhoenixVision7927 & 4294967295L)) + intBitsToFloat2;
        if (this.FrostHunterAlertDialogAuroraDelta3200 > 0.0f) {
            frostHunterViewPulseShadow4652 = new FrostHunterMaterialCardViewAuroraBlazeSpeed8498(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLifecycleBlazeGammaElite2889(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            frostHunterViewPulseShadow4652 = new FrostHunterViewPulseShadow4652(new FrostHunterBarrierThunderHyperion9659(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterViewPulseShadow4652;
        return frostHunterViewPulseShadow4652;
    }
}
