package android.content.Context;

import android.graphics.Typeface;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBottomSheetEclipseUltraShadow6009 implements FrostHunterStateMasterInfernoGamma9701, FrostHunterAnimatorAlphaBetaNeo3591, FrostHunterR8BlazeEpicTurbo1126, FrostHunterAsyncTaskPhantomFusionCelestial9115, FrostHunterPropertyValuesHolderAlphaBetaBlaze1599, FrostHunterProGuardCyberHyper2901, FrostHunterKeyframeRogueStorm7563 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterBottomSheetEclipseUltraShadow6009() {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 3;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final int FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, long j) {
        int i2 = FrostHunterCanvasInfernoVortex4700.FrostHunterRemoteConfigSpeedSpeed8566;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static Typeface FrostHunterLevelListDrawableFusionDragonHero2232(String str, FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597, int i) {
        Typeface create;
        if (i == 0 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterBillingClientRogueThunder4597, FrostHunterBillingClientRogueThunder4597.FrostHunterFragmentBetaMegaVortex6025) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), frostHunterBillingClientRogueThunder4597.FrostHunterCameraXPixelTurboCosmos9814, i == 1);
        return create;
    }

    public static FrostHunterFragmentManagerShadowForceCyber6887 FrostHunterLightSensorForceFusion4241(String str) {
        if (str.equals("http/1.0")) {
            return FrostHunterFragmentManagerShadowForceCyber6887.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return FrostHunterFragmentManagerShadowForceCyber6887.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return FrostHunterFragmentManagerShadowForceCyber6887.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return FrostHunterFragmentManagerShadowForceCyber6887.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return FrostHunterFragmentManagerShadowForceCyber6887.SPDY_3;
        }
        if (str.equals("quic")) {
            return FrostHunterFragmentManagerShadowForceCyber6887.QUIC;
        }
        if (FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(str, "h3", false)) {
            return FrostHunterFragmentManagerShadowForceCyber6887.HTTP_3;
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Unexpected protocol: ".concat(str));
        return null;
    }

    public static MediaCodec FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670) {
        String str = ((FrostHunterStorageNovaXEliteAurora3066) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterAlphaAnimationNeoCosmos5761;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // android.content.Context.FrostHunterR8BlazeEpicTurbo1126
    public void FrostHunterAlertDialogAuroraDelta3200(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, long j, FrostHunterGroupTitanHyper3020 frostHunterGroupTitanHyper3020, int i, boolean z) {
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332;
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha8598 = (FrostHunterVectorDrawableMaxAlpha8598) frostHunterColorStateListOmegaHero9965.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterLiveDataScopePulseBeta1740 frostHunterLiveDataScopePulseBeta1740 = FrostHunterVectorDrawableMaxAlpha8598.FrostHunterPagingSourceEclipseDelta8255;
        ((FrostHunterVectorDrawableMaxAlpha8598) frostHunterColorStateListOmegaHero9965.FrostHunterCameraXPixelTurboCosmos9814).FrostHunterObjectDetectionDeltaHyperEpic7162(FrostHunterVectorDrawableMaxAlpha8598.FrostHunterRewardedAdSpectraElite8288, frostHunterVectorDrawableMaxAlpha8598.FrostHunterFlipAnimationPrimeOlympian7620(j), frostHunterGroupTitanHyper3020, 1, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // android.content.Context.FrostHunterKeyframeRogueStorm7563
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterIntentSpeedCyber8582 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterCoroutineScopeSpeedSparkAlpha3670);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLifecycleBlazeGammaElite2889;
            mediaCodec.configure((MediaFormat) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterBundlePulseFusionHero2475, surface, (MediaCrypto) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLevelListDrawableFusionDragonHero2232, (surface == null && ((FrostHunterStorageNovaXEliteAurora3066) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterCameraXPixelTurboCosmos9814 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new FrostHunterProximitySensorEpicSolar3138(mediaCodec, (FrostHunterTraceHyperionAuroraNebula9947) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterAlphaAnimationNeoCosmos5761);
        } catch (IOException e) {
            e = e;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public void FrostHunterBundlePulseFusionHero2475() {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.Context.FrostHunterR8BlazeEpicTurbo1126
    public boolean FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) {
        FrostHunterFirestoreEliteMasterThunder9916 FrostHunterMotionSceneAuroraMega2271 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMotionSceneAuroraMega2271();
        boolean z = false;
        if (FrostHunterMotionSceneAuroraMega2271 != null && FrostHunterMotionSceneAuroraMega2271.FrostHunterKeyframeGammaGamma1197) {
            z = true;
        }
        return !z;
    }

    @Override // android.content.Context.FrostHunterR8BlazeEpicTurbo1126
    public boolean FrostHunterFlowMaxDragonHero5809(FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637) {
        return false;
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public FrostHunterIntentServiceBetaPhoenixSolar4672 FrostHunterFragmentBetaMegaVortex6025(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.Context.FrostHunterAsyncTaskPhantomFusionCelestial9115
    public Typeface FrostHunterKeyframeGammaGamma1197(FrostHunterTextWatcherNovaForceTitan1238 frostHunterTextWatcherNovaForceTitan1238, FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597, int i) {
        frostHunterTextWatcherNovaForceTitan1238.getClass();
        return FrostHunterLevelListDrawableFusionDragonHero2232("sans-serif", frostHunterBillingClientRogueThunder4597, i);
    }

    @Override // android.content.Context.FrostHunterAsyncTaskPhantomFusionCelestial9115
    public Typeface FrostHunterLifecycleBlazeGammaElite2889(FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597, int i) {
        return FrostHunterLevelListDrawableFusionDragonHero2232(null, frostHunterBillingClientRogueThunder4597, i);
    }

    @Override // android.content.Context.FrostHunterPropertyValuesHolderAlphaBetaBlaze1599
    public void FrostHunterLintTitanVortexQuantum9911(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterGeocoderHyperionTitan2118 frostHunterGeocoderHyperionTitan2118) {
        throw new UnsupportedOperationException();
    }

    public int FrostHunterScaleAnimationStrikeSpark5059(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // android.content.Context.FrostHunterR8BlazeEpicTurbo1126
    public int FrostHunterServiceEliteCelestialThunder1757() {
        return 8;
    }

    @Override // android.content.Context.FrostHunterClipboardManagerMegaRogue2930
    public Object get() {
        FrostHunterAuthPixelSolar5465 frostHunterAuthPixelSolar5465 = new FrostHunterAuthPixelSolar5465();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null flags");
            return null;
        }
        hashMap.put(FrostHunterAnimatorPixelNovaSolar6777.FrostHunterCameraXPixelTurboCosmos9814, new FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318(30000L, 86400000L, set));
        if (set == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null flags");
            return null;
        }
        hashMap.put(FrostHunterAnimatorPixelNovaSolar6777.FrostHunterAlertDialogAuroraDelta3200, new FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318(1000L, 86400000L, set));
        if (set == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null flags");
            return null;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(FrostHunterKotlinEpicNebulaForce5304.FrostHunterFlowMaxDragonHero5809)));
        if (unmodifiableSet == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null flags");
            return null;
        }
        hashMap.put(FrostHunterAnimatorPixelNovaSolar6777.FrostHunterFlowMaxDragonHero5809, new FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= FrostHunterAnimatorPixelNovaSolar6777.values().length) {
            new HashMap();
            return new FrostHunterRoomEliteNovaCelestial5870(frostHunterAuthPixelSolar5465, hashMap);
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Not all priorities have been configured");
        return null;
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 26:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ FrostHunterBottomSheetEclipseUltraShadow6009(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    public FrostHunterBottomSheetEclipseUltraShadow6009(FrostHunterDrawableFusionOmegaAlpha1942 frostHunterDrawableFusionOmegaAlpha1942) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 4;
    }
}
