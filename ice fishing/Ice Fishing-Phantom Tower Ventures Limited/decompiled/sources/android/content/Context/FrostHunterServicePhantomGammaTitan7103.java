package android.content.Context;

import android.content.Context;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterServicePhantomGammaTitan7103 implements FrostHunterRoomEliteInferno4871, FrostHunterProGuardCyberHyper2901, FrostHunterCameraViewVisionMaxCelestial6838, FrostHunterAdapterPixelMax1447, FrostHunterCoroutineScopeSolarTitan6330, FrostHunterLocationManagerEpicAlphaQuantum9711 {
    public final Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;
    public Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterServicePhantomGammaTitan7103(ArrayList arrayList) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 10;
        this.FrostHunterFlowMaxDragonHero5809 = Collections.unmodifiableList(new ArrayList(arrayList));
        this.FrostHunterAlertDialogAuroraDelta3200 = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            FrostHunterVideoCaptureOmegaQuantumSpeed9487 frostHunterVideoCaptureOmegaQuantumSpeed9487 = (FrostHunterVideoCaptureOmegaQuantumSpeed9487) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.FrostHunterAlertDialogAuroraDelta3200;
            jArr[i2] = frostHunterVideoCaptureOmegaQuantumSpeed9487.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            jArr[i2 + 1] = frostHunterVideoCaptureOmegaQuantumSpeed9487.FrostHunterBundlePulseFusionHero2475;
        }
        long[] jArr2 = (long[]) this.FrostHunterAlertDialogAuroraDelta3200;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.FrostHunterKeyframeGammaGamma1197 = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public Object FrostHunterAlertDialogAuroraDelta3200() {
        return this.FrostHunterKeyframeGammaGamma1197;
    }

    @Override // android.content.Context.FrostHunterCameraViewVisionMaxCelestial6838
    /* renamed from: FrostHunterAlphaAnimationNeoCosmos5761 */
    public void mo6FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        FrostHunterPaintCyberPulse5979.FrostHunterTranslateAnimationCyberSolarUltra7101((FrostHunterOnItemClickListenerCelestialPulse9191) this.FrostHunterFlowMaxDragonHero5809, (FrostHunterResourceThunderSolarForce1212) this.FrostHunterAlertDialogAuroraDelta3200, new FrostHunterObjectDetectionBlazeGammaRogue7560(this, obj, (FrostHunterTraceCelestialVortexSpark6705) null), 2);
    }

    public void FrostHunterBundlePulseFusionHero2475() {
        ((ArrayList) this.FrostHunterAlertDialogAuroraDelta3200).clear();
        this.FrostHunterKeyframeGammaGamma1197 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        int i = ((FrostHunterObjectAnimatorNeoStrike7090) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlertDialogAuroraDelta3200;
        while (true) {
            i--;
            FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = (FrostHunterObjectAnimatorNeoStrike7090) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200;
            if (-1 >= i) {
                frostHunterObjectAnimatorNeoStrike7090.FrostHunterRemoteConfigSpeedSpeed8566();
                ((FrostHunterWorkManagerShadowPhoenix8056) frostHunterKotlinQuantumRogue5892.FrostHunterFlowMaxDragonHero5809).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                return;
            }
            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterStateCelestialNovaPixel8414((FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) frostHunterObjectAnimatorNeoStrike7090.FrostHunterCameraXPixelTurboCosmos9814[i]);
        }
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterCameraXPixelTurboCosmos9814(int i, int i2, int i3) {
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = (FrostHunterObjectAnimatorNeoStrike7090) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterWorkManagerShadowPhoenix8056 frostHunterWorkManagerShadowPhoenix8056 = (FrostHunterWorkManagerShadowPhoenix8056) frostHunterKotlinQuantumRogue5892.FrostHunterFlowMaxDragonHero5809;
            Object FrostHunterAlertDialogAuroraDelta3200 = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200(i5);
            frostHunterWorkManagerShadowPhoenix8056.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            ((FrostHunterObjectAnimatorNeoStrike7090) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlphaAnimationNeoCosmos5761(i6, (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) FrostHunterAlertDialogAuroraDelta3200);
            frostHunterWorkManagerShadowPhoenix8056.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332();
        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMeteringPointMegaCyber7955();
        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterDatabaseEliteShadowUltra2452();
    }

    public void FrostHunterCameraXTurboCelestialHero5430(Object obj) {
        long FrostHunterServiceEliteCelestialThunder1757 = FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterServiceEliteCelestialThunder1757();
        if (FrostHunterServiceEliteCelestialThunder1757 == FrostHunterRunnableNovaXCosmos5759.FrostHunterAlphaAnimationNeoCosmos5761) {
            this.FrostHunterKeyframeGammaGamma1197 = obj;
            return;
        }
        synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
            FrostHunterCoordinatorLayoutEliteBlaze9319 frostHunterCoordinatorLayoutEliteBlaze9319 = (FrostHunterCoordinatorLayoutEliteBlaze9319) ((AtomicReference) this.FrostHunterFlowMaxDragonHero5809).get();
            int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCoordinatorLayoutEliteBlaze9319.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceEliteCelestialThunder1757);
            if (FrostHunterAlphaAnimationNeoCosmos5761 < 0) {
                ((AtomicReference) this.FrostHunterFlowMaxDragonHero5809).set(frostHunterCoordinatorLayoutEliteBlaze9319.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder1757, obj));
            } else {
                frostHunterCoordinatorLayoutEliteBlaze9319.FrostHunterBundlePulseFusionHero2475[FrostHunterAlphaAnimationNeoCosmos5761] = obj;
            }
        }
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        long[] jArr = (long[]) this.FrostHunterKeyframeGammaGamma1197;
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761(jArr, j, false);
        if (FrostHunterAlphaAnimationNeoCosmos5761 < jArr.length) {
            return FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return -1;
    }

    public void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = ((FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) this.FrostHunterFlowMaxDragonHero5809).FrostHunterTextViewDragonStormMega4297;
        if (frostHunterFilterSpectraTitan5298 != null) {
            frostHunterFilterSpectraTitan5298.FrostHunterDialogFragmentTurboPhoenixDragon7627();
        }
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public long FrostHunterFlowMaxDragonHero5809(int i) {
        long[] jArr = (long[]) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i >= 0);
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i < jArr.length);
        return jArr[i];
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterKeyframeGammaGamma1197(int i, int i2) {
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (i2 < 0) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterAlphaAnimationNeoCosmos5761("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterStateCelestialNovaPixel8414((FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) ((FrostHunterObjectAnimatorNeoStrike7090) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814[i3]);
            Object FrostHunterAlertDialogAuroraDelta3200 = ((FrostHunterObjectAnimatorNeoStrike7090) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlertDialogAuroraDelta3200(i3);
            ((FrostHunterWorkManagerShadowPhoenix8056) frostHunterKotlinQuantumRogue5892.FrostHunterFlowMaxDragonHero5809).FrostHunterConstraintSetCloneMasterUltraRogue2633();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterLevelListDrawableFusionDragonHero2232() {
        FrostHunterRoomStrikeTitaniumSpark5218 frostHunterRoomStrikeTitaniumSpark5218;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332;
        if (!frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterBillingClientFusionVortex9008()) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterAlphaAnimationNeoCosmos5761("onReuse is only expected on attached node");
        }
        FrostHunterGestureDetectorTitaniumSpeedCosmos2231 frostHunterGestureDetectorTitaniumSpeedCosmos2231 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterLooperThreadBetaHyperionMax1000;
        if (frostHunterGestureDetectorTitaniumSpeedCosmos2231 != null) {
            View view = frostHunterGestureDetectorTitaniumSpeedCosmos2231.FrostHunterFlowMaxDragonHero5809;
            if (view.getParent() != frostHunterGestureDetectorTitaniumSpeedCosmos2231) {
                frostHunterGestureDetectorTitaniumSpeedCosmos2231.addView(view);
            } else {
                frostHunterGestureDetectorTitaniumSpeedCosmos2231.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
        }
        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMeteringPointBetaCyber9571 = false;
        if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPushNotificationStormTitanGamma8999) {
            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPushNotificationStormTitanGamma8999 = false;
        } else {
            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = (FrostHunterOnItemClickListenerBetaPhantom9631) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332.FrostHunterFlowMaxDragonHero5809;
            for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno9637; frostHunterGradientDrawablePulseDragonInferno96372 != null; frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterFragmentBetaMegaVortex6025) {
                if (frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterLooperThreadBetaHyperionMax1000) {
                    frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterCamera2NeoMax8666();
                }
            }
            for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno9637; frostHunterGradientDrawablePulseDragonInferno96373 != null; frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterFragmentBetaMegaVortex6025) {
                if (frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterLooperThreadBetaHyperionMax1000) {
                    frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterDrawableCompatHeroMasterSpectra7412();
                }
            }
            while (frostHunterGradientDrawablePulseDragonInferno9637 != null) {
                if (frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterLooperThreadBetaHyperionMax1000) {
                    frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterTransformNovaBetaNovaX5251();
                }
                frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterFragmentBetaMegaVortex6025;
            }
        }
        int i = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809;
        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809 = FrostHunterMediaPlayerTurboQuantumDragon3360.FrostHunterAlphaAnimationNeoCosmos5761.addAndGet(1);
        FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterTextViewDragonStormMega4297;
        if (frostHunterFilterSpectraTitan5298 != null) {
            frostHunterFilterSpectraTitan5298.m4getLayoutNodes().FrostHunterLevelListDrawableFusionDragonHero2232(i);
            frostHunterFilterSpectraTitan5298.m4getLayoutNodes().FrostHunterRemoteConfigSpeedSpeed8566(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809, frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
        }
        for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96374 = (FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterColorStateListOmegaHero9965.FrostHunterAlertDialogAuroraDelta3200; frostHunterGradientDrawablePulseDragonInferno96374 != null; frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterAnnotationProcessorSolarSpeedNebula4443();
        }
        frostHunterColorStateListOmegaHero9965.FrostHunterAlertDialogAuroraDelta3200();
        if (frostHunterColorStateListOmegaHero9965.FrostHunterCameraXPixelTurboCosmos9814(8)) {
            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterViewPhantomNeo1634();
        }
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterNavigationMasterMegaMax2752(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
        FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan52982 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterTextViewDragonStormMega4297;
        if (frostHunterFilterSpectraTitan52982 != null) {
            if (FrostHunterFilterSpectraTitan5298.FrostHunterLifecycleBlazeGammaElite2889() && (frostHunterRoomStrikeTitaniumSpark5218 = frostHunterFilterSpectraTitan52982.FrostHunterR8MasterNebulaSpark7247) != null) {
                FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan52983 = frostHunterRoomStrikeTitaniumSpark5218.FrostHunterBundlePulseFusionHero2475;
                FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = frostHunterRoomStrikeTitaniumSpark5218.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterVectorDrawableVortexTitanRogue2910 frostHunterVectorDrawableVortexTitanRogue2910 = frostHunterRoomStrikeTitaniumSpark5218.FrostHunterRemoteConfigSpeedSpeed8566;
                if (frostHunterVectorDrawableVortexTitanRogue2910.FrostHunterLifecycleBlazeGammaElite2889(i)) {
                    frostHunterSQLiteMasterUltra9956.FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterFilterSpectraTitan52983, i, false);
                }
                FrostHunterFirestoreEliteMasterThunder9916 FrostHunterMotionSceneAuroraMega2271 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMotionSceneAuroraMega2271();
                if (FrostHunterMotionSceneAuroraMega2271 != null && FrostHunterMotionSceneAuroraMega2271.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBannerAdEliteStrike7333.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
                    frostHunterVectorDrawableVortexTitanRogue2910.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809);
                    frostHunterSQLiteMasterUltra9956.FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterFilterSpectraTitan52983, frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809, true);
                }
            }
            frostHunterFilterSpectraTitan52982.getRectManager().FrostHunterRemoteConfigSpeedSpeed8566(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, true);
        }
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterLifecycleBlazeGammaElite2889(Object obj) {
        ((ArrayList) this.FrostHunterAlertDialogAuroraDelta3200).add(this.FrostHunterKeyframeGammaGamma1197);
        this.FrostHunterKeyframeGammaGamma1197 = obj;
    }

    public boolean FrostHunterLightSensorForceFusion4241() {
        if (((FrostHunterDataBindingStrikeVortex2868) this.FrostHunterFlowMaxDragonHero5809).getValue() != this.FrostHunterKeyframeGammaGamma1197) {
            return true;
        }
        FrostHunterServicePhantomGammaTitan7103 frostHunterServicePhantomGammaTitan7103 = (FrostHunterServicePhantomGammaTitan7103) this.FrostHunterAlertDialogAuroraDelta3200;
        return frostHunterServicePhantomGammaTitan7103 != null && frostHunterServicePhantomGammaTitan7103.FrostHunterLightSensorForceFusion4241();
    }

    public void FrostHunterLintTitanVortexQuantum9911(FrostHunterOnDeviceTranslatorPulseVortexCosmos1931 frostHunterOnDeviceTranslatorPulseVortexCosmos1931) {
        FrostHunterMaterialCardViewShadowBlazeBlaze3823 frostHunterMaterialCardViewShadowBlazeBlaze3823 = new FrostHunterMaterialCardViewShadowBlazeBlaze3823(22);
        FrostHunterRotateAnimationOlympianBlaze7628 frostHunterRotateAnimationOlympianBlaze7628 = (FrostHunterRotateAnimationOlympianBlaze7628) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 = (FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterWindowManagerPrimeHeroMaster3405 frostHunterWindowManagerPrimeHeroMaster3405 = (FrostHunterWindowManagerPrimeHeroMaster3405) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterMaterialButtonGammaNova8333 frostHunterMaterialButtonGammaNova8333 = frostHunterRotateAnimationOlympianBlaze7628.FrostHunterBundlePulseFusionHero2475;
        FrostHunterTraceHyperionAuroraNebula9947 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLooperHyperionForce4133(frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761);
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197 = FrostHunterAnimatorPixelNovaSolar6777.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232();
        FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670 = new FrostHunterCoroutineScopeSpeedSparkAlpha3670();
        frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLevelListDrawableFusionDragonHero2232 = new HashMap();
        frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterServiceEliteCelestialThunder1757 = Long.valueOf(frostHunterRotateAnimationOlympianBlaze7628.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761());
        frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLifecycleBlazeGammaElite2889 = Long.valueOf(frostHunterRotateAnimationOlympianBlaze7628.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761());
        frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterAlphaAnimationNeoCosmos5761 = "FCM_CLIENT_EVENT_LOGGING";
        FrostHunterCameraXCelestialSpeed6839 frostHunterCameraXCelestialSpeed6839 = frostHunterOnDeviceTranslatorPulseVortexCosmos1931.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = FrostHunterLaunchVortexSpectra9933.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterTraceHyperionAuroraNebula9947.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809(frostHunterCameraXCelestialSpeed6839, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterBundlePulseFusionHero2475 = new FrostHunterVideoCaptureElitePhantomTurbo8587(frostHunterWindowManagerPrimeHeroMaster3405, byteArrayOutputStream.toByteArray());
        frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
        frostHunterMaterialButtonGammaNova8333.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterMagnetometerStrikeSolar7622(frostHunterMaterialButtonGammaNova8333, FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterMaterialCardViewShadowBlazeBlaze3823, frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterCameraXPixelTurboCosmos9814()));
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterLooperThreadBetaHyperionMax1000() {
        this.FrostHunterKeyframeGammaGamma1197 = ((ArrayList) this.FrostHunterAlertDialogAuroraDelta3200).remove(r0.size() - 1);
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public /* bridge */ /* synthetic */ void FrostHunterRemoteConfigSpeedSpeed8566(int i, Object obj) {
    }

    public void FrostHunterResourcesTitanHyperVision5823() {
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = (FrostHunterToastHyperTitanThunder2275) this.FrostHunterFlowMaxDragonHero5809;
        String str = (String) this.FrostHunterAlertDialogAuroraDelta3200;
        List list = (List) frostHunterToastHyperTitanThunder2275.FrostHunterKeyframeGammaGamma1197(str);
        if (list != null) {
            list.remove((FrostHunterNotificationGammaBlazePhoenix7595) this.FrostHunterKeyframeGammaGamma1197);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        frostHunterToastHyperTitanThunder2275.FrostHunterServiceConnectionTurboPhoenixOmega6719(str, list);
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public int FrostHunterScaleAnimationStrikeSpark5059() {
        return ((long[]) this.FrostHunterKeyframeGammaGamma1197).length;
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public List FrostHunterServiceConnectionTurboPhoenixOmega6719(long j) {
        List list = (List) this.FrostHunterFlowMaxDragonHero5809;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.FrostHunterAlertDialogAuroraDelta3200;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                FrostHunterVideoCaptureOmegaQuantumSpeed9487 frostHunterVideoCaptureOmegaQuantumSpeed9487 = (FrostHunterVideoCaptureOmegaQuantumSpeed9487) list.get(i);
                FrostHunterConstraintSetPhoenixVision2576 frostHunterConstraintSetPhoenixVision2576 = frostHunterVideoCaptureOmegaQuantumSpeed9487.FrostHunterAlphaAnimationNeoCosmos5761;
                if (frostHunterConstraintSetPhoenixVision2576.FrostHunterLifecycleBlazeGammaElite2889 == -3.4028235E38f) {
                    arrayList2.add(frostHunterVideoCaptureOmegaQuantumSpeed9487);
                } else {
                    arrayList.add(frostHunterConstraintSetPhoenixVision2576);
                }
            }
        }
        Collections.sort(arrayList2, new FrostHunterTextInputLayoutPhantomPhantom6564(19));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            FrostHunterConstraintSetPhoenixVision2576 frostHunterConstraintSetPhoenixVision25762 = ((FrostHunterVideoCaptureOmegaQuantumSpeed9487) arrayList2.get(i3)).FrostHunterAlphaAnimationNeoCosmos5761;
            arrayList.add(new FrostHunterConstraintSetPhoenixVision2576(frostHunterConstraintSetPhoenixVision25762.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterConstraintSetPhoenixVision25762.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterConstraintSetPhoenixVision25762.FrostHunterBundlePulseFusionHero2475, frostHunterConstraintSetPhoenixVision25762.FrostHunterServiceEliteCelestialThunder1757, (-1) - i3, 1, frostHunterConstraintSetPhoenixVision25762.FrostHunterRemoteConfigSpeedSpeed8566, frostHunterConstraintSetPhoenixVision25762.FrostHunterCameraXPixelTurboCosmos9814, frostHunterConstraintSetPhoenixVision25762.FrostHunterFlowMaxDragonHero5809, frostHunterConstraintSetPhoenixVision25762.FrostHunterLightSensorForceFusion4241, frostHunterConstraintSetPhoenixVision25762.FrostHunterScaleAnimationStrikeSpark5059, frostHunterConstraintSetPhoenixVision25762.FrostHunterAlertDialogAuroraDelta3200, frostHunterConstraintSetPhoenixVision25762.FrostHunterKeyframeGammaGamma1197, frostHunterConstraintSetPhoenixVision25762.FrostHunterFragmentBetaMegaVortex6025, frostHunterConstraintSetPhoenixVision25762.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterConstraintSetPhoenixVision25762.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, frostHunterConstraintSetPhoenixVision25762.FrostHunterLintTitanVortexQuantum9911, frostHunterConstraintSetPhoenixVision25762.FrostHunterCameraXTurboCelestialHero5430));
        }
        return arrayList;
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterServiceEliteCelestialThunder1757(int i, Object obj) {
        ((FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) this.FrostHunterKeyframeGammaGamma1197).FrostHunterMeteringPointBetaCyber9571(i, (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) obj);
    }

    @Override // android.content.Context.FrostHunterLocationManagerEpicAlphaQuantum9711
    public void FrostHunterTextViewDragonStormMega4297(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        FrostHunterFlowCollectorMegaTitaniumFusion9321 frostHunterFlowCollectorMegaTitaniumFusion9321 = (FrostHunterFlowCollectorMegaTitaniumFusion9321) this.FrostHunterFlowMaxDragonHero5809;
        String str = (String) this.FrostHunterAlertDialogAuroraDelta3200;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.FrostHunterKeyframeGammaGamma1197;
        synchronized (frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterAlphaAnimationNeoCosmos5761) {
            frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterAlphaAnimationNeoCosmos5761.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // android.content.Context.FrostHunterClipboardManagerMegaRogue2930
    public Object get() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case 1:
                return new FrostHunterTraceHyperionAuroraNebula9947((Context) ((FrostHunterClipboardManagerMegaRogue2930) obj2).get(), ((FrostHunterClipboardManagerMegaRogue2930) obj).get(), ((FrostHunterBottomSheetEclipseUltraShadow6009) this.FrostHunterKeyframeGammaGamma1197).get(), 22);
            case 4:
                long FrostHunterServiceEliteCelestialThunder1757 = FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterServiceEliteCelestialThunder1757();
                if (FrostHunterServiceEliteCelestialThunder1757 == FrostHunterRunnableNovaXCosmos5759.FrostHunterAlphaAnimationNeoCosmos5761) {
                    return this.FrostHunterKeyframeGammaGamma1197;
                }
                FrostHunterCoordinatorLayoutEliteBlaze9319 frostHunterCoordinatorLayoutEliteBlaze9319 = (FrostHunterCoordinatorLayoutEliteBlaze9319) ((AtomicReference) obj2).get();
                int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCoordinatorLayoutEliteBlaze9319.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceEliteCelestialThunder1757);
                if (FrostHunterAlphaAnimationNeoCosmos5761 >= 0) {
                    return frostHunterCoordinatorLayoutEliteBlaze9319.FrostHunterBundlePulseFusionHero2475[FrostHunterAlphaAnimationNeoCosmos5761];
                }
                return null;
            default:
                return new FrostHunterRotateAnimationOlympianBlaze7628(new FrostHunterAuthPixelSolar5465(), new FrostHunterLocationManagerAlphaFusion6480(), (FrostHunterMaterialButtonGammaNova8333) ((FrostHunterOnItemLongClickListenerRogueDeltaStrike7658) obj2).get(), (FrostHunterDelaySolarEclipse1769) ((FrostHunterR8GammaHeroMaster6087) obj).get(), (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) ((FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) this.FrostHunterKeyframeGammaGamma1197).get());
        }
    }

    public FrostHunterServicePhantomGammaTitan7103(FrostHunterOnItemClickListenerCelestialPulse9191 frostHunterOnItemClickListenerCelestialPulse9191, FrostHunterResourceThunderSolarForce1212 frostHunterResourceThunderSolarForce1212, FrostHunterCameraViewVisionMaxCelestial6838 frostHunterCameraViewVisionMaxCelestial6838) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        frostHunterResourceThunderSolarForce1212.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterOnItemClickListenerCelestialPulse9191;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterResourceThunderSolarForce1212;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterCameraViewVisionMaxCelestial6838;
    }

    public FrostHunterServicePhantomGammaTitan7103(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                this.FrostHunterFlowMaxDragonHero5809 = new WeakHashMap();
                this.FrostHunterAlertDialogAuroraDelta3200 = new WeakHashMap();
                this.FrostHunterKeyframeGammaGamma1197 = new WeakHashMap();
                break;
            default:
                this.FrostHunterFlowMaxDragonHero5809 = new AtomicReference(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterLifecycleBlazeGammaElite2889);
                this.FrostHunterAlertDialogAuroraDelta3200 = new Object();
                break;
        }
    }

    public FrostHunterServicePhantomGammaTitan7103(FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, FrostHunterWindowManagerPrimeHeroMaster3405 frostHunterWindowManagerPrimeHeroMaster3405, FrostHunterMaterialCardViewShadowBlazeBlaze3823 frostHunterMaterialCardViewShadowBlazeBlaze3823, FrostHunterRotateAnimationOlympianBlaze7628 frostHunterRotateAnimationOlympianBlaze7628) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 5;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterWindowManagerPrimeHeroMaster3405;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterRotateAnimationOlympianBlaze7628;
    }

    public /* synthetic */ FrostHunterServicePhantomGammaTitan7103(Object obj, Object obj2, Object obj3, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
        this.FrostHunterKeyframeGammaGamma1197 = obj3;
    }

    public FrostHunterServicePhantomGammaTitan7103(FrostHunterDataBindingPhoenixThunderTitan8989 frostHunterDataBindingPhoenixThunderTitan8989, FrostHunterServicePhantomGammaTitan7103 frostHunterServicePhantomGammaTitan7103) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 7;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterDataBindingPhoenixThunderTitan8989;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterServicePhantomGammaTitan7103;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterDataBindingPhoenixThunderTitan8989.getValue();
    }

    public FrostHunterServicePhantomGammaTitan7103(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 9;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439;
        this.FrostHunterAlertDialogAuroraDelta3200 = new ArrayList();
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439;
    }
}
