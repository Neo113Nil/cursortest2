package android.content.Context;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlipAnimationGammaNeo8805 implements FrostHunterIntentServiceBetaPhoenixSolar4672 {
    public final FrostHunterAsyncPixelEclipse3110 FrostHunterAlphaAnimationNeoCosmos5761;
    public FrostHunterSQLiteMasterUltra9956 FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterCameraXTurboCelestialHero5430;
    public boolean FrostHunterCardViewSpectraCyber7714;
    public FrostHunterFirebaseOlympianMax4818 FrostHunterEditTextPulseHyperion1262;
    public int FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public FrostHunterBundleCelestialNovaXRogue4240 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final FrostHunterImageAnalysisTurboLegend2497 FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterLintTitanVortexQuantum9911;
    public boolean FrostHunterLooperHyperionForce4133;
    public FrostHunterFirebaseOlympianMax4818 FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterResourcesTitanHyperVision5823;
    public final FrostHunterResourcesHyperCelestial7280 FrostHunterServiceEliteCelestialThunder1757;
    public final FrostHunterLayoutInflaterVisionAuroraPulse9221 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterLayoutInflaterVisionAuroraPulse9221();
    public int FrostHunterFlowMaxDragonHero5809 = 1000;
    public long[] FrostHunterAlertDialogAuroraDelta3200 = new long[1000];
    public long[] FrostHunterKeyframeGammaGamma1197 = new long[1000];
    public long[] FrostHunterLightSensorForceFusion4241 = new long[1000];
    public int[] FrostHunterServiceConnectionTurboPhoenixOmega6719 = new int[1000];
    public int[] FrostHunterFragmentBetaMegaVortex6025 = new int[1000];
    public FrostHunterMenuHyperShadowInferno4622[] FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterMenuHyperShadowInferno4622[1000];
    public final FrostHunterActivityInfoMaxOlympian4796 FrostHunterBundlePulseFusionHero2475 = new FrostHunterActivityInfoMaxOlympian4796(new FrostHunterMaterialCardViewShadowBlazeBlaze3823(17));
    public long FrostHunterTextViewDragonStormMega4297 = Long.MIN_VALUE;
    public long FrostHunterMotionSceneAuroraMega2271 = Long.MIN_VALUE;
    public long FrostHunterBitmapTurboDeltaNebula8743 = Long.MIN_VALUE;
    public boolean FrostHunterServiceInfoHyperionSparkMax9966 = true;
    public boolean FrostHunterMeteringPointBetaCyber9571 = true;
    public boolean FrostHunterDatabaseEliteShadowUltra2452 = true;
    public long FrostHunterLooperThreadBetaHyperionMax1000 = Long.MIN_VALUE;
    public int FrostHunterDialogFragmentTurboPhoenixDragon7627 = -1;

    public FrostHunterFlipAnimationGammaNeo8805(FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947, FrostHunterResourcesHyperCelestial7280 frostHunterResourcesHyperCelestial7280, FrostHunterImageAnalysisTurboLegend2497 frostHunterImageAnalysisTurboLegend2497) {
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterResourcesHyperCelestial7280;
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterImageAnalysisTurboLegend2497;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterAsyncPixelEclipse3110(frostHunterTraceHyperionAuroraNebula9947);
    }

    public final int FrostHunterAlertDialogAuroraDelta3200(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.FrostHunterLightSensorForceFusion4241[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.FrostHunterFlowMaxDragonHero5809) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        if (((android.content.Context.FrostHunterInterstitialAdForceElite7511) r10.valueAt(r10.size() - 1)).FrostHunterAlphaAnimationNeoCosmos5761.equals(r9.FrostHunterEditTextPulseHyperion1262) == false) goto L50;
     */
    @Override // android.content.Context.FrostHunterIntentServiceBetaPhoenixSolar4672
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j, int i, int i2, int i3, FrostHunterMenuHyperShadowInferno4622 frostHunterMenuHyperShadowInferno4622) {
        int i4 = i & 1;
        boolean z = i4 != 0;
        if (this.FrostHunterMeteringPointBetaCyber9571) {
            if (!z) {
                return;
            } else {
                this.FrostHunterMeteringPointBetaCyber9571 = false;
            }
        }
        if (this.FrostHunterDatabaseEliteShadowUltra2452) {
            if (j < this.FrostHunterTextViewDragonStormMega4297) {
                return;
            }
            if (i4 == 0) {
                if (!this.FrostHunterCardViewSpectraCyber7714) {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Overriding unexpected non-sync sample for format: " + this.FrostHunterEditTextPulseHyperion1262);
                    this.FrostHunterCardViewSpectraCyber7714 = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566 - i2) - i3;
        synchronized (this) {
            try {
                int i5 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                if (i5 > 0) {
                    int FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025(i5 - 1);
                    FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(this.FrostHunterKeyframeGammaGamma1197[FrostHunterFragmentBetaMegaVortex6025] + ((long) this.FrostHunterFragmentBetaMegaVortex6025[FrostHunterFragmentBetaMegaVortex6025]) <= j2);
                }
                this.FrostHunterLooperHyperionForce4133 = (536870912 & i) != 0;
                this.FrostHunterBitmapTurboDeltaNebula8743 = Math.max(this.FrostHunterBitmapTurboDeltaNebula8743, j);
                long j3 = this.FrostHunterLooperThreadBetaHyperionMax1000;
                if (j3 != Long.MIN_VALUE && this.FrostHunterDialogFragmentTurboPhoenixDragon7627 == -1 && j >= j3) {
                    this.FrostHunterDialogFragmentTurboPhoenixDragon7627 = this.FrostHunterLintTitanVortexQuantum9911 + this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                }
                int FrostHunterFragmentBetaMegaVortex60252 = FrostHunterFragmentBetaMegaVortex6025(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
                this.FrostHunterLightSensorForceFusion4241[FrostHunterFragmentBetaMegaVortex60252] = j;
                this.FrostHunterKeyframeGammaGamma1197[FrostHunterFragmentBetaMegaVortex60252] = j2;
                this.FrostHunterFragmentBetaMegaVortex6025[FrostHunterFragmentBetaMegaVortex60252] = i2;
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719[FrostHunterFragmentBetaMegaVortex60252] = i;
                this.FrostHunterScaleAnimationStrikeSpark5059[FrostHunterFragmentBetaMegaVortex60252] = frostHunterMenuHyperShadowInferno4622;
                this.FrostHunterAlertDialogAuroraDelta3200[FrostHunterFragmentBetaMegaVortex60252] = 0;
                if (!(((SparseArray) this.FrostHunterBundlePulseFusionHero2475.FrostHunterAlertDialogAuroraDelta3200).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.FrostHunterBundlePulseFusionHero2475.FrostHunterAlertDialogAuroraDelta3200;
                }
                FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterEditTextPulseHyperion1262;
                frostHunterFirebaseOlympianMax4818.getClass();
                FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013 = this.FrostHunterServiceEliteCelestialThunder1757 != null ? FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809 : FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809;
                FrostHunterActivityInfoMaxOlympian4796 frostHunterActivityInfoMaxOlympian4796 = this.FrostHunterBundlePulseFusionHero2475;
                int i6 = this.FrostHunterLintTitanVortexQuantum9911 + this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                FrostHunterInterstitialAdForceElite7511 frostHunterInterstitialAdForceElite7511 = new FrostHunterInterstitialAdForceElite7511(frostHunterFlowHyperionVortexDelta5013, frostHunterFirebaseOlympianMax4818);
                SparseArray sparseArray2 = (SparseArray) frostHunterActivityInfoMaxOlympian4796.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterActivityInfoMaxOlympian4796.FrostHunterFlowMaxDragonHero5809 == -1) {
                    FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(sparseArray2.size() == 0);
                    frostHunterActivityInfoMaxOlympian4796.FrostHunterFlowMaxDragonHero5809 = 0;
                }
                if (sparseArray2.size() > 0) {
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i6 >= keyAt);
                    if (keyAt == i6) {
                        ((FrostHunterMaterialCardViewShadowBlazeBlaze3823) frostHunterActivityInfoMaxOlympian4796.FrostHunterKeyframeGammaGamma1197).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                    }
                }
                sparseArray2.append(i6, frostHunterInterstitialAdForceElite7511);
                int i7 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + 1;
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = i7;
                int i8 = this.FrostHunterFlowMaxDragonHero5809;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    FrostHunterMenuHyperShadowInferno4622[] frostHunterMenuHyperShadowInferno4622Arr = new FrostHunterMenuHyperShadowInferno4622[i9];
                    int i10 = this.FrostHunterCameraXTurboCelestialHero5430;
                    int i11 = i8 - i10;
                    System.arraycopy(this.FrostHunterKeyframeGammaGamma1197, i10, jArr2, 0, i11);
                    System.arraycopy(this.FrostHunterLightSensorForceFusion4241, this.FrostHunterCameraXTurboCelestialHero5430, jArr3, 0, i11);
                    System.arraycopy(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterCameraXTurboCelestialHero5430, iArr, 0, i11);
                    System.arraycopy(this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterCameraXTurboCelestialHero5430, iArr2, 0, i11);
                    System.arraycopy(this.FrostHunterScaleAnimationStrikeSpark5059, this.FrostHunterCameraXTurboCelestialHero5430, frostHunterMenuHyperShadowInferno4622Arr, 0, i11);
                    System.arraycopy(this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterCameraXTurboCelestialHero5430, jArr, 0, i11);
                    int i12 = this.FrostHunterCameraXTurboCelestialHero5430;
                    System.arraycopy(this.FrostHunterKeyframeGammaGamma1197, 0, jArr2, i11, i12);
                    System.arraycopy(this.FrostHunterLightSensorForceFusion4241, 0, jArr3, i11, i12);
                    System.arraycopy(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, 0, iArr, i11, i12);
                    System.arraycopy(this.FrostHunterFragmentBetaMegaVortex6025, 0, iArr2, i11, i12);
                    System.arraycopy(this.FrostHunterScaleAnimationStrikeSpark5059, 0, frostHunterMenuHyperShadowInferno4622Arr, i11, i12);
                    System.arraycopy(this.FrostHunterAlertDialogAuroraDelta3200, 0, jArr, i11, i12);
                    this.FrostHunterKeyframeGammaGamma1197 = jArr2;
                    this.FrostHunterLightSensorForceFusion4241 = jArr3;
                    this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = iArr;
                    this.FrostHunterFragmentBetaMegaVortex6025 = iArr2;
                    this.FrostHunterScaleAnimationStrikeSpark5059 = frostHunterMenuHyperShadowInferno4622Arr;
                    this.FrostHunterAlertDialogAuroraDelta3200 = jArr;
                    this.FrostHunterCameraXTurboCelestialHero5430 = 0;
                    this.FrostHunterFlowMaxDragonHero5809 = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.Context.FrostHunterIntentServiceBetaPhoenixSolar4672
    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                this.FrostHunterServiceInfoHyperionSparkMax9966 = false;
                if (!Objects.equals(frostHunterFirebaseOlympianMax4818, this.FrostHunterEditTextPulseHyperion1262)) {
                    if (!(((SparseArray) this.FrostHunterBundlePulseFusionHero2475.FrostHunterAlertDialogAuroraDelta3200).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.FrostHunterBundlePulseFusionHero2475.FrostHunterAlertDialogAuroraDelta3200;
                        if (((FrostHunterInterstitialAdForceElite7511) sparseArray.valueAt(sparseArray.size() - 1)).FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterFirebaseOlympianMax4818)) {
                            SparseArray sparseArray2 = (SparseArray) this.FrostHunterBundlePulseFusionHero2475.FrostHunterAlertDialogAuroraDelta3200;
                            this.FrostHunterEditTextPulseHyperion1262 = ((FrostHunterInterstitialAdForceElite7511) sparseArray2.valueAt(sparseArray2.size() - 1)).FrostHunterAlphaAnimationNeoCosmos5761;
                            boolean z2 = this.FrostHunterDatabaseEliteShadowUltra2452;
                            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = this.FrostHunterEditTextPulseHyperion1262;
                            String str = frostHunterFirebaseOlympianMax48182.FrostHunterScaleAnimationStrikeSpark5059;
                            this.FrostHunterDatabaseEliteShadowUltra2452 = z2 & (FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterLevelListDrawableFusionDragonHero2232(str) != 1 && FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterAlphaAnimationNeoCosmos5761(str, frostHunterFirebaseOlympianMax48182.FrostHunterKeyframeGammaGamma1197));
                            this.FrostHunterCardViewSpectraCyber7714 = false;
                            z = true;
                        }
                    }
                    this.FrostHunterEditTextPulseHyperion1262 = frostHunterFirebaseOlympianMax4818;
                    boolean z22 = this.FrostHunterDatabaseEliteShadowUltra2452;
                    FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax481822 = this.FrostHunterEditTextPulseHyperion1262;
                    String str2 = frostHunterFirebaseOlympianMax481822.FrostHunterScaleAnimationStrikeSpark5059;
                    this.FrostHunterDatabaseEliteShadowUltra2452 = z22 & (FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterLevelListDrawableFusionDragonHero2232(str2) != 1 && FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterAlphaAnimationNeoCosmos5761(str2, frostHunterFirebaseOlympianMax481822.FrostHunterKeyframeGammaGamma1197));
                    this.FrostHunterCardViewSpectraCyber7714 = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FrostHunterBundleCelestialNovaXRogue4240 frostHunterBundleCelestialNovaXRogue4240 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterBundleCelestialNovaXRogue4240 == null || !z) {
            return;
        }
        frostHunterBundleCelestialNovaXRogue4240.FrostHunterDialogFragmentTurboPhoenixDragon7627.post(frostHunterBundleCelestialNovaXRogue4240.FrostHunterMotionSceneAuroraMega2271);
    }

    public final long FrostHunterCameraXPixelTurboCosmos9814(int i) {
        long j = this.FrostHunterMotionSceneAuroraMega2271;
        int i2 = 0;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.FrostHunterLightSensorForceFusion4241[FrostHunterFragmentBetaMegaVortex6025]);
                if ((this.FrostHunterServiceConnectionTurboPhoenixOmega6719[FrostHunterFragmentBetaMegaVortex6025] & 1) != 0) {
                    break;
                }
                FrostHunterFragmentBetaMegaVortex6025--;
                if (FrostHunterFragmentBetaMegaVortex6025 == -1) {
                    FrostHunterFragmentBetaMegaVortex6025 = this.FrostHunterFlowMaxDragonHero5809 - 1;
                }
            }
        }
        this.FrostHunterMotionSceneAuroraMega2271 = Math.max(j, j2);
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 -= i;
        int i4 = this.FrostHunterLintTitanVortexQuantum9911 + i;
        this.FrostHunterLintTitanVortexQuantum9911 = i4;
        int i5 = this.FrostHunterCameraXTurboCelestialHero5430 + i;
        this.FrostHunterCameraXTurboCelestialHero5430 = i5;
        int i6 = this.FrostHunterFlowMaxDragonHero5809;
        if (i5 >= i6) {
            this.FrostHunterCameraXTurboCelestialHero5430 = i5 - i6;
        }
        int i7 = this.FrostHunterResourcesTitanHyperVision5823 - i;
        this.FrostHunterResourcesTitanHyperVision5823 = i7;
        if (i7 < 0) {
            this.FrostHunterResourcesTitanHyperVision5823 = 0;
        }
        FrostHunterActivityInfoMaxOlympian4796 frostHunterActivityInfoMaxOlympian4796 = this.FrostHunterBundlePulseFusionHero2475;
        SparseArray sparseArray = (SparseArray) frostHunterActivityInfoMaxOlympian4796.FrostHunterAlertDialogAuroraDelta3200;
        while (i2 < sparseArray.size() - 1) {
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((FrostHunterMaterialCardViewShadowBlazeBlaze3823) frostHunterActivityInfoMaxOlympian4796.FrostHunterKeyframeGammaGamma1197).accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = frostHunterActivityInfoMaxOlympian4796.FrostHunterFlowMaxDragonHero5809;
            if (i9 > 0) {
                frostHunterActivityInfoMaxOlympian4796.FrostHunterFlowMaxDragonHero5809 = i9 - 1;
            }
            i2 = i8;
        }
        if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != 0) {
            return this.FrostHunterKeyframeGammaGamma1197[this.FrostHunterCameraXTurboCelestialHero5430];
        }
        int i10 = this.FrostHunterCameraXTurboCelestialHero5430;
        if (i10 == 0) {
            i10 = this.FrostHunterFlowMaxDragonHero5809;
        }
        return this.FrostHunterKeyframeGammaGamma1197[i10 - 1] + this.FrostHunterFragmentBetaMegaVortex6025[r11];
    }

    public final synchronized boolean FrostHunterCameraXTurboCelestialHero5430(long j, boolean z) {
        Throwable th;
        FrostHunterFlipAnimationGammaNeo8805 frostHunterFlipAnimationGammaNeo8805;
        FrostHunterFlipAnimationGammaNeo8805 frostHunterFlipAnimationGammaNeo88052;
        long j2;
        int FrostHunterKeyframeGammaGamma1197;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.FrostHunterResourcesTitanHyperVision5823 = 0;
                                FrostHunterAsyncPixelEclipse3110 frostHunterAsyncPixelEclipse3110 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                                frostHunterAsyncPixelEclipse3110.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterAsyncPixelEclipse3110.FrostHunterServiceEliteCelestialThunder1757;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    frostHunterFlipAnimationGammaNeo8805 = this;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                frostHunterFlipAnimationGammaNeo8805 = this;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th = th6;
                        frostHunterFlipAnimationGammaNeo8805 = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025(0);
            long j3 = this.FrostHunterLooperThreadBetaHyperionMax1000;
            long j4 = this.FrostHunterBitmapTurboDeltaNebula8743;
            if (j3 != Long.MIN_VALUE) {
                try {
                    j4 = Math.min(j4, j3);
                } catch (Throwable th8) {
                    th = th8;
                    frostHunterFlipAnimationGammaNeo8805 = this;
                    throw th;
                }
            }
            int i = this.FrostHunterResourcesTitanHyperVision5823;
            int i2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            if (!(i != i2) || j < this.FrostHunterLightSensorForceFusion4241[FrostHunterFragmentBetaMegaVortex6025] || (j > j4 && !z)) {
                return false;
            }
            if (this.FrostHunterDatabaseEliteShadowUltra2452) {
                frostHunterFlipAnimationGammaNeo88052 = this;
                j2 = j;
                FrostHunterKeyframeGammaGamma1197 = frostHunterFlipAnimationGammaNeo88052.FrostHunterAlertDialogAuroraDelta3200(FrostHunterFragmentBetaMegaVortex6025, i2 - i, j2, z);
            } else {
                frostHunterFlipAnimationGammaNeo88052 = this;
                j2 = j;
                FrostHunterKeyframeGammaGamma1197 = frostHunterFlipAnimationGammaNeo88052.FrostHunterKeyframeGammaGamma1197(FrostHunterFragmentBetaMegaVortex6025, i2 - i, j2, true);
            }
            if (FrostHunterKeyframeGammaGamma1197 == -1) {
                return false;
            }
            frostHunterFlipAnimationGammaNeo88052.FrostHunterTextViewDragonStormMega4297 = j2;
            frostHunterFlipAnimationGammaNeo88052.FrostHunterResourcesTitanHyperVision5823 += FrostHunterKeyframeGammaGamma1197;
            return true;
        } catch (Throwable th9) {
            th = th9;
            frostHunterFlipAnimationGammaNeo8805 = this;
            th = th;
            throw th;
        }
    }

    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935) {
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48183 = this.FrostHunterRemoteConfigSpeedSpeed8566;
        boolean z = frostHunterFirebaseOlympianMax48183 == null;
        FrostHunterPaintFlagsDrawFilterPixelUltraMega2835 frostHunterPaintFlagsDrawFilterPixelUltraMega2835 = frostHunterFirebaseOlympianMax48183 == null ? null : frostHunterFirebaseOlympianMax48183.FrostHunterResourcesTitanHyperVision5823;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterFirebaseOlympianMax4818;
        FrostHunterPaintFlagsDrawFilterPixelUltraMega2835 frostHunterPaintFlagsDrawFilterPixelUltraMega28352 = frostHunterFirebaseOlympianMax4818.FrostHunterResourcesTitanHyperVision5823;
        FrostHunterResourcesHyperCelestial7280 frostHunterResourcesHyperCelestial7280 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterResourcesHyperCelestial7280 != null) {
            int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterResourcesHyperCelestial7280.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818);
            FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirebaseOlympianMax4818.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRewardedAdMasterStrike9463 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterFirebaseOlympianMax48182 = new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos5761);
        } else {
            frostHunterFirebaseOlympianMax48182 = frostHunterFirebaseOlympianMax4818;
        }
        frostHunterIntentForceSpeed4935.FrostHunterAlertDialogAuroraDelta3200 = frostHunterFirebaseOlympianMax48182;
        frostHunterIntentForceSpeed4935.FrostHunterFlowMaxDragonHero5809 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterResourcesHyperCelestial7280 == null) {
            return;
        }
        if (z || !Objects.equals(frostHunterPaintFlagsDrawFilterPixelUltraMega2835, frostHunterPaintFlagsDrawFilterPixelUltraMega28352)) {
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterImageAnalysisTurboLegend2497 frostHunterImageAnalysisTurboLegend2497 = this.FrostHunterLifecycleBlazeGammaElite2889;
            FrostHunterSQLiteMasterUltra9956 FrostHunterBundlePulseFusionHero2475 = frostHunterResourcesHyperCelestial7280.FrostHunterBundlePulseFusionHero2475(frostHunterImageAnalysisTurboLegend2497, frostHunterFirebaseOlympianMax4818);
            this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterBundlePulseFusionHero2475;
            frostHunterIntentForceSpeed4935.FrostHunterFlowMaxDragonHero5809 = FrostHunterBundlePulseFusionHero2475;
            if (frostHunterSQLiteMasterUltra9956 != null) {
                frostHunterSQLiteMasterUltra9956.FrostHunterEditTextPulseHyperion1262(frostHunterImageAnalysisTurboLegend2497);
            }
        }
    }

    public final void FrostHunterFlowMaxDragonHero5809() {
        long FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterAsyncPixelEclipse3110 frostHunterAsyncPixelEclipse3110 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        synchronized (this) {
            int i = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            FrostHunterCameraXPixelTurboCosmos9814 = i == 0 ? -1L : FrostHunterCameraXPixelTurboCosmos9814(i);
        }
        frostHunterAsyncPixelEclipse3110.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final int FrostHunterFragmentBetaMegaVortex6025(int i) {
        int i2 = this.FrostHunterCameraXTurboCelestialHero5430 + i;
        int i3 = this.FrostHunterFlowMaxDragonHero5809;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final int FrostHunterKeyframeGammaGamma1197(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.FrostHunterLightSensorForceFusion4241[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.FrostHunterServiceConnectionTurboPhoenixOmega6719[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.FrostHunterFlowMaxDragonHero5809) {
                i = 0;
            }
        }
        return i3;
    }

    @Override // android.content.Context.FrostHunterIntentServiceBetaPhoenixSolar4672
    public final int FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRoomDaoMaxPrimeQuantum2063 frostHunterRoomDaoMaxPrimeQuantum2063, int i, boolean z) {
        FrostHunterAsyncPixelEclipse3110 frostHunterAsyncPixelEclipse3110 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAsyncPixelEclipse3110.FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
        FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse6283 = frostHunterAsyncPixelEclipse3110.FrostHunterLevelListDrawableFusionDragonHero2232;
        FrostHunterVectorDrawableCompatSparkNeoNebula6539 frostHunterVectorDrawableCompatSparkNeoNebula6539 = (FrostHunterVectorDrawableCompatSparkNeoNebula6539) frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterAlertDialogAuroraDelta3200;
        int read = frostHunterRoomDaoMaxPrimeQuantum2063.read(frostHunterVectorDrawableCompatSparkNeoNebula6539.FrostHunterAlphaAnimationNeoCosmos5761, ((int) (frostHunterAsyncPixelEclipse3110.FrostHunterRemoteConfigSpeedSpeed8566 - frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterCameraXPixelTurboCosmos9814)) + frostHunterVectorDrawableCompatSparkNeoNebula6539.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterConstraintSetCloneMasterUltraRogue2633);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = frostHunterAsyncPixelEclipse3110.FrostHunterRemoteConfigSpeedSpeed8566 + read;
        frostHunterAsyncPixelEclipse3110.FrostHunterRemoteConfigSpeedSpeed8566 = j;
        FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse62832 = frostHunterAsyncPixelEclipse3110.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (j == frostHunterRewardedAdPrimeTurboEclipse62832.FrostHunterFlowMaxDragonHero5809) {
            frostHunterAsyncPixelEclipse3110.FrostHunterLevelListDrawableFusionDragonHero2232 = (FrostHunterRewardedAdPrimeTurboEclipse6283) frostHunterRewardedAdPrimeTurboEclipse62832.FrostHunterKeyframeGammaGamma1197;
        }
        return read;
    }

    public final synchronized boolean FrostHunterLightSensorForceFusion4241(boolean z) {
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818;
        int i = this.FrostHunterLintTitanVortexQuantum9911;
        int i2 = this.FrostHunterResourcesTitanHyperVision5823;
        int i3 = i + i2;
        int i4 = this.FrostHunterDialogFragmentTurboPhoenixDragon7627;
        boolean z2 = true;
        if (i4 != -1 && i3 >= i4) {
            return true;
        }
        if (i2 != this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
            if (((FrostHunterInterstitialAdForceElite7511) this.FrostHunterBundlePulseFusionHero2475.FrostHunterServiceEliteCelestialThunder1757(i3)).FrostHunterAlphaAnimationNeoCosmos5761 != this.FrostHunterRemoteConfigSpeedSpeed8566) {
                return true;
            }
            return FrostHunterScaleAnimationStrikeSpark5059(FrostHunterFragmentBetaMegaVortex6025(this.FrostHunterResourcesTitanHyperVision5823));
        }
        if (!z && !this.FrostHunterLooperHyperionForce4133 && ((frostHunterFirebaseOlympianMax4818 = this.FrostHunterEditTextPulseHyperion1262) == null || frostHunterFirebaseOlympianMax4818 == this.FrostHunterRemoteConfigSpeedSpeed8566)) {
            z2 = false;
        }
        return z2;
    }

    public final void FrostHunterLintTitanVortexQuantum9911(boolean z) {
        FrostHunterAsyncPixelEclipse3110 frostHunterAsyncPixelEclipse3110 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = frostHunterAsyncPixelEclipse3110.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse6283 = frostHunterAsyncPixelEclipse3110.FrostHunterServiceEliteCelestialThunder1757;
        if (((FrostHunterVectorDrawableCompatSparkNeoNebula6539) frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterAlertDialogAuroraDelta3200) != null) {
            synchronized (frostHunterTraceHyperionAuroraNebula9947) {
                ((FrostHunterMeteringPointEclipseTitan1504) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197).FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterRewardedAdPrimeTurboEclipse6283);
                FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse62832 = frostHunterRewardedAdPrimeTurboEclipse6283;
                while (frostHunterRewardedAdPrimeTurboEclipse62832 != null) {
                    FrostHunterVectorDrawableCompatSparkNeoNebula6539 frostHunterVectorDrawableCompatSparkNeoNebula6539 = (FrostHunterVectorDrawableCompatSparkNeoNebula6539) frostHunterRewardedAdPrimeTurboEclipse62832.FrostHunterAlertDialogAuroraDelta3200;
                    frostHunterVectorDrawableCompatSparkNeoNebula6539.getClass();
                    frostHunterTraceHyperionAuroraNebula9947.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVectorDrawableCompatSparkNeoNebula6539);
                    frostHunterRewardedAdPrimeTurboEclipse62832 = (FrostHunterRewardedAdPrimeTurboEclipse6283) frostHunterRewardedAdPrimeTurboEclipse62832.FrostHunterKeyframeGammaGamma1197;
                    if (frostHunterRewardedAdPrimeTurboEclipse62832 == null || ((FrostHunterVectorDrawableCompatSparkNeoNebula6539) frostHunterRewardedAdPrimeTurboEclipse62832.FrostHunterAlertDialogAuroraDelta3200) == null) {
                        frostHunterRewardedAdPrimeTurboEclipse62832 = null;
                    }
                }
            }
            frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterAlertDialogAuroraDelta3200 = null;
            frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterKeyframeGammaGamma1197 = null;
        }
        FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse62833 = frostHunterAsyncPixelEclipse3110.FrostHunterServiceEliteCelestialThunder1757;
        int i = frostHunterAsyncPixelEclipse3110.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(((FrostHunterVectorDrawableCompatSparkNeoNebula6539) frostHunterRewardedAdPrimeTurboEclipse62833.FrostHunterAlertDialogAuroraDelta3200) == null);
        frostHunterRewardedAdPrimeTurboEclipse62833.FrostHunterCameraXPixelTurboCosmos9814 = 0L;
        frostHunterRewardedAdPrimeTurboEclipse62833.FrostHunterFlowMaxDragonHero5809 = i;
        FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse62834 = frostHunterAsyncPixelEclipse3110.FrostHunterServiceEliteCelestialThunder1757;
        frostHunterAsyncPixelEclipse3110.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterRewardedAdPrimeTurboEclipse62834;
        frostHunterAsyncPixelEclipse3110.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterRewardedAdPrimeTurboEclipse62834;
        frostHunterAsyncPixelEclipse3110.FrostHunterRemoteConfigSpeedSpeed8566 = 0L;
        synchronized (frostHunterTraceHyperionAuroraNebula9947) {
            ((FrostHunterMeteringPointEclipseTitan1504) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197).FrostHunterBundlePulseFusionHero2475.FrostHunterServiceEliteCelestialThunder1757();
        }
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 0;
        this.FrostHunterLintTitanVortexQuantum9911 = 0;
        this.FrostHunterCameraXTurboCelestialHero5430 = 0;
        this.FrostHunterResourcesTitanHyperVision5823 = 0;
        this.FrostHunterDialogFragmentTurboPhoenixDragon7627 = -1;
        this.FrostHunterMeteringPointBetaCyber9571 = true;
        this.FrostHunterTextViewDragonStormMega4297 = Long.MIN_VALUE;
        this.FrostHunterMotionSceneAuroraMega2271 = Long.MIN_VALUE;
        this.FrostHunterBitmapTurboDeltaNebula8743 = Long.MIN_VALUE;
        this.FrostHunterLooperHyperionForce4133 = false;
        FrostHunterActivityInfoMaxOlympian4796 frostHunterActivityInfoMaxOlympian4796 = this.FrostHunterBundlePulseFusionHero2475;
        SparseArray sparseArray = (SparseArray) frostHunterActivityInfoMaxOlympian4796.FrostHunterAlertDialogAuroraDelta3200;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((FrostHunterMaterialCardViewShadowBlazeBlaze3823) frostHunterActivityInfoMaxOlympian4796.FrostHunterKeyframeGammaGamma1197).accept(sparseArray.valueAt(i2));
        }
        frostHunterActivityInfoMaxOlympian4796.FrostHunterFlowMaxDragonHero5809 = -1;
        sparseArray.clear();
        if (z) {
            this.FrostHunterEditTextPulseHyperion1262 = null;
            this.FrostHunterServiceInfoHyperionSparkMax9966 = true;
            this.FrostHunterDatabaseEliteShadowUltra2452 = true;
        }
    }

    @Override // android.content.Context.FrostHunterIntentServiceBetaPhoenixSolar4672
    public final void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, int i, int i2) {
        while (true) {
            FrostHunterAsyncPixelEclipse3110 frostHunterAsyncPixelEclipse3110 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i <= 0) {
                frostHunterAsyncPixelEclipse3110.getClass();
                return;
            }
            int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAsyncPixelEclipse3110.FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
            FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse6283 = frostHunterAsyncPixelEclipse3110.FrostHunterLevelListDrawableFusionDragonHero2232;
            FrostHunterVectorDrawableCompatSparkNeoNebula6539 frostHunterVectorDrawableCompatSparkNeoNebula6539 = (FrostHunterVectorDrawableCompatSparkNeoNebula6539) frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(frostHunterVectorDrawableCompatSparkNeoNebula6539.FrostHunterAlphaAnimationNeoCosmos5761, ((int) (frostHunterAsyncPixelEclipse3110.FrostHunterRemoteConfigSpeedSpeed8566 - frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterCameraXPixelTurboCosmos9814)) + frostHunterVectorDrawableCompatSparkNeoNebula6539.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterConstraintSetCloneMasterUltraRogue2633);
            i -= FrostHunterConstraintSetCloneMasterUltraRogue2633;
            long j = frostHunterAsyncPixelEclipse3110.FrostHunterRemoteConfigSpeedSpeed8566 + FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterAsyncPixelEclipse3110.FrostHunterRemoteConfigSpeedSpeed8566 = j;
            FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse62832 = frostHunterAsyncPixelEclipse3110.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (j == frostHunterRewardedAdPrimeTurboEclipse62832.FrostHunterFlowMaxDragonHero5809) {
                frostHunterAsyncPixelEclipse3110.FrostHunterLevelListDrawableFusionDragonHero2232 = (FrostHunterRewardedAdPrimeTurboEclipse6283) frostHunterRewardedAdPrimeTurboEclipse62832.FrostHunterKeyframeGammaGamma1197;
            }
        }
    }

    public final boolean FrostHunterScaleAnimationStrikeSpark5059(int i) {
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterSQLiteMasterUltra9956 == null || frostHunterSQLiteMasterUltra9956.FrostHunterResourcesTitanHyperVision5823() == 4) {
            return true;
        }
        if ((this.FrostHunterServiceConnectionTurboPhoenixOmega6719[i] & 1073741824) != 0) {
            return false;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814.getClass();
        return false;
    }

    public final synchronized FrostHunterFirebaseOlympianMax4818 FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        return this.FrostHunterServiceInfoHyperionSparkMax9966 ? null : this.FrostHunterEditTextPulseHyperion1262;
    }
}
