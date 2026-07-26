package android.content.Context;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPlaceholderSolarPixelElite2112 {
    public Looper FrostHunterAlertDialogAuroraDelta3200;
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterIntentForceSpeed4935 FrostHunterBundlePulseFusionHero2475;
    public FrostHunterBindingAdapterOmegaAurora9082 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterRippleDrawableBlazeBetaStorm6320 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterFlowMaxDragonHero5809;
    public Context FrostHunterKeyframeGammaGamma1197;
    public FrostHunterAlertDialogEliteMasterCosmos7701 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final float FrostHunterLifecycleBlazeGammaElite2889;
    public FrostHunterAssetManagerQuantumRogue9837 FrostHunterRemoteConfigSpeedSpeed8566;
    public final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterPlaceholderSolarPixelElite2112(FrostHunterColorDrawableHyperionEclipse1418 frostHunterColorDrawableHyperionEclipse1418) {
        Context context = frostHunterColorDrawableHyperionEclipse1418.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context;
        FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = frostHunterColorDrawableHyperionEclipse1418.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterIntentForceSpeed4935.getClass();
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterIntentForceSpeed4935;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterColorDrawableHyperionEclipse1418.FrostHunterBundlePulseFusionHero2475;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterColorDrawableHyperionEclipse1418.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterServiceEliteCelestialThunder1757 = context == null ? null : new FrostHunterLayoutInflaterTurboHyperion3832(17, this);
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterColorDrawableHyperionEclipse1418.FrostHunterLifecycleBlazeGammaElite2889;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterAssetManagerQuantumRogue9837.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r0 != r1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrostHunterFirestoreVortexBeta2433 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterFilterTurboPixel9595 frostHunterFilterTurboPixel9595) {
        Context context;
        Context context2;
        Context createDeviceContext;
        int deviceId;
        try {
            int i = frostHunterFilterTurboPixel9595.FrostHunterCameraXPixelTurboCosmos9814;
            int i2 = frostHunterFilterTurboPixel9595.FrostHunterFlowMaxDragonHero5809;
            if (i2 == -1 || (context2 = this.FrostHunterAlphaAnimationNeoCosmos5761) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.FrostHunterKeyframeGammaGamma1197;
                if (context3 != null) {
                    deviceId = context3.getDeviceId();
                }
                createDeviceContext = context2.createDeviceContext(i2);
                this.FrostHunterKeyframeGammaGamma1197 = createDeviceContext;
                context = this.FrostHunterKeyframeGammaGamma1197;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(frostHunterFilterTurboPixel9595.FrostHunterServiceEliteCelestialThunder1757 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : frostHunterFilterTurboPixel9595.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761()).setAudioFormat(new AudioFormat.Builder().setSampleRate(frostHunterFilterTurboPixel9595.FrostHunterConstraintSetCloneMasterUltraRogue2633).setChannelMask(frostHunterFilterTurboPixel9595.FrostHunterBundlePulseFusionHero2475).setEncoding(frostHunterFilterTurboPixel9595.FrostHunterAlphaAnimationNeoCosmos5761).build()).setTransferMode(1).setBufferSizeInBytes(frostHunterFilterTurboPixel9595.FrostHunterLevelListDrawableFusionDragonHero2232).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(frostHunterFilterTurboPixel9595.FrostHunterLifecycleBlazeGammaElite2889);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack build = sessionId.build();
                if (build.getState() == 1) {
                    return new FrostHunterFirestoreVortexBeta2433(build, frostHunterFilterTurboPixel9595, this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterRemoteConfigSpeedSpeed8566);
                }
                try {
                    build.release();
                } catch (Exception unused) {
                }
                throw new FrostHunterWithContextTurboDelta8933();
            } catch (IllegalArgumentException e) {
                e = e;
                throw new FrostHunterWithContextTurboDelta8933(e);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrostHunterFilterTurboPixel9595 FrostHunterBundlePulseFusionHero2475(FrostHunterFCMEpicEpic9637 frostHunterFCMEpicEpic9637) {
        int intValue;
        int i;
        boolean z;
        char c;
        boolean z2;
        int i2;
        int i3;
        double d;
        boolean z3;
        int FrostHunterRemoteConfigSpeedSpeed8566;
        int FrostHunterDialogFragmentTurboPhoenixDragon7627;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = frostHunterFCMEpicEpic9637.FrostHunterAlphaAnimationNeoCosmos5761;
        boolean z4 = frostHunterFCMEpicEpic9637.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411 = frostHunterFCMEpicEpic9637.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterLifecycleBlazeGammaElite2889(frostHunterFCMEpicEpic9637);
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        int i4 = frostHunterFirebaseOlympianMax4818.FrostHunterMediaPlayerCelestialBetaTitan3868;
        int i5 = frostHunterFirebaseOlympianMax4818.FrostHunterTranslateAnimationCyberSolarUltra7101;
        int i6 = frostHunterFirebaseOlympianMax4818.FrostHunterBillingClientFusionVortex9008;
        if (Objects.equals(str, "audio/raw")) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(FrostHunterGyroscopeHeroAlpha1995.FrostHunterLooperHyperionForce4133(i5));
            intValue = FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceConnectionTurboPhoenixOmega6719(i6);
            i = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLightSensorForceFusion4241(i5) * i6;
            z = false;
            c = 0;
        } else {
            FrostHunterSQLiteMaxMaster2053 FrostHunterScaleAnimationStrikeSpark5059 = z4 ? this.FrostHunterBundlePulseFusionHero2475.FrostHunterScaleAnimationStrikeSpark5059(frostHunterFirebaseOlympianMax4818, frostHunterRemoteConfigEpicUltraDragon2411) : FrostHunterSQLiteMaxMaster2053.FrostHunterServiceEliteCelestialThunder1757;
            if (z4 && FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlphaAnimationNeoCosmos5761) {
                str.getClass();
                int FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterConstraintSetCloneMasterUltraRogue2633(str, frostHunterFirebaseOlympianMax4818.FrostHunterKeyframeGammaGamma1197);
                int FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceConnectionTurboPhoenixOmega6719(i6);
                boolean z5 = FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                i5 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
                intValue = FrostHunterServiceConnectionTurboPhoenixOmega6719;
                z = z5;
                i = -1;
                c = 1;
                z2 = true;
                i2 = frostHunterFirebaseOlympianMax4818.FrostHunterAlertDialogAuroraDelta3200;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i2 == -1) {
                    i2 = 768000;
                }
                i3 = frostHunterFCMEpicEpic9637.FrostHunterCameraXPixelTurboCosmos9814;
                if (i3 == -1) {
                    z3 = true;
                } else {
                    int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue, i5);
                    FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(minBufferSize != -2);
                    if (i == -1) {
                        i = 1;
                    }
                    double d2 = z2 ? this.FrostHunterLifecycleBlazeGammaElite2889 : 1.0d;
                    this.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                    if (c == 0) {
                        d = d2;
                        z3 = true;
                        long j = i4;
                        long j2 = 250000 * j;
                        long j3 = i;
                        FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterRemoteConfigSpeedSpeed8566(minBufferSize * 4, FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823((j2 * j3) / 1000000), FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823(((750000 * j) * j3) / 1000000));
                    } else if (c == 1) {
                        d = d2;
                        z3 = true;
                        int FrostHunterDialogFragmentTurboPhoenixDragon76272 = FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterDialogFragmentTurboPhoenixDragon7627(i5);
                        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(FrostHunterDialogFragmentTurboPhoenixDragon76272 != -2147483647);
                        FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823((50000000 * FrostHunterDialogFragmentTurboPhoenixDragon76272) / 1000000);
                    } else {
                        if (c != 2) {
                            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
                            return null;
                        }
                        z3 = true;
                        int i7 = i5 == 5 ? 500000 : i5 == 8 ? 1000000 : 250000;
                        if (i2 != -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterCanvasInfernoVortex4700.FrostHunterMagnetometerFusionTitanium8202(i2, 8);
                        } else {
                            FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterDialogFragmentTurboPhoenixDragon7627(i5);
                            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(FrostHunterDialogFragmentTurboPhoenixDragon7627 != -2147483647);
                        }
                        d = d2;
                        FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823((i7 * FrostHunterDialogFragmentTurboPhoenixDragon7627) / 1000000);
                    }
                    i3 = (((Math.max(minBufferSize, (int) (FrostHunterRemoteConfigSpeedSpeed8566 * d)) + i) - 1) / i) * i;
                }
                FrostHunterDrawableCompatOlympianVortexGamma4702 frostHunterDrawableCompatOlympianVortexGamma4702 = new FrostHunterDrawableCompatOlympianVortexGamma4702();
                FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon24112 = FrostHunterRemoteConfigEpicUltraDragon2411.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterFlowMaxDragonHero5809 = -1;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i4;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterBundlePulseFusionHero2475 = intValue;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterAlphaAnimationNeoCosmos5761 = i5;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterLevelListDrawableFusionDragonHero2232 = i3;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterFCMEpicEpic9637.FrostHunterLifecycleBlazeGammaElite2889;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterRemoteConfigEpicUltraDragon2411;
                boolean z6 = z3;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterLifecycleBlazeGammaElite2889 = c != z6 ? z6 : false;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterServiceEliteCelestialThunder1757 = frostHunterFCMEpicEpic9637.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterAlertDialogAuroraDelta3200 = z2;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterKeyframeGammaGamma1197 = z;
                frostHunterDrawableCompatOlympianVortexGamma4702.FrostHunterFlowMaxDragonHero5809 = frostHunterFCMEpicEpic9637.FrostHunterLevelListDrawableFusionDragonHero2232;
                return new FrostHunterFilterTurboPixel9595(frostHunterDrawableCompatOlympianVortexGamma4702);
            }
            Pair FrostHunterBundlePulseFusionHero2475 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax4818, frostHunterRemoteConfigEpicUltraDragon2411);
            if (FrostHunterBundlePulseFusionHero2475 == null) {
                throw new FrostHunterScrollViewShadowOlympianStrike8701("Unable to configure passthrough for: " + frostHunterFirebaseOlympianMax4818);
            }
            i5 = ((Integer) FrostHunterBundlePulseFusionHero2475.first).intValue();
            intValue = ((Integer) FrostHunterBundlePulseFusionHero2475.second).intValue();
            i = -1;
            z = false;
            c = 2;
        }
        z2 = false;
        i2 = frostHunterFirebaseOlympianMax4818.FrostHunterAlertDialogAuroraDelta3200;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i2 = 768000;
        }
        i3 = frostHunterFCMEpicEpic9637.FrostHunterCameraXPixelTurboCosmos9814;
        if (i3 == -1) {
        }
        FrostHunterDrawableCompatOlympianVortexGamma4702 frostHunterDrawableCompatOlympianVortexGamma47022 = new FrostHunterDrawableCompatOlympianVortexGamma4702();
        FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon241122 = FrostHunterRemoteConfigEpicUltraDragon2411.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterFlowMaxDragonHero5809 = -1;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i4;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterBundlePulseFusionHero2475 = intValue;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterAlphaAnimationNeoCosmos5761 = i5;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterLevelListDrawableFusionDragonHero2232 = i3;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterFCMEpicEpic9637.FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterRemoteConfigEpicUltraDragon2411;
        boolean z62 = z3;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterLifecycleBlazeGammaElite2889 = c != z62 ? z62 : false;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterServiceEliteCelestialThunder1757 = frostHunterFCMEpicEpic9637.FrostHunterRemoteConfigSpeedSpeed8566;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterAlertDialogAuroraDelta3200 = z2;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterKeyframeGammaGamma1197 = z;
        frostHunterDrawableCompatOlympianVortexGamma47022.FrostHunterFlowMaxDragonHero5809 = frostHunterFCMEpicEpic9637.FrostHunterLevelListDrawableFusionDragonHero2232;
        return new FrostHunterFilterTurboPixel9595(frostHunterDrawableCompatOlympianVortexGamma47022);
    }

    public final FrostHunterFragmentTransactionDragonHyperLegend1508 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFCMEpicEpic9637 frostHunterFCMEpicEpic9637) {
        FrostHunterLifecycleBlazeGammaElite2889(frostHunterFCMEpicEpic9637);
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = frostHunterFCMEpicEpic9637.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411 = frostHunterFCMEpicEpic9637.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterSQLiteMaxMaster2053 FrostHunterScaleAnimationStrikeSpark5059 = this.FrostHunterBundlePulseFusionHero2475.FrostHunterScaleAnimationStrikeSpark5059(frostHunterFirebaseOlympianMax4818, frostHunterRemoteConfigEpicUltraDragon2411);
        FrostHunterPagingDataPhoenixMegaPhoenix8056 frostHunterPagingDataPhoenixMegaPhoenix8056 = new FrostHunterPagingDataPhoenixMegaPhoenix8056();
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        int i = frostHunterFirebaseOlympianMax4818.FrostHunterTranslateAnimationCyberSolarUltra7101;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax4818, frostHunterRemoteConfigEpicUltraDragon2411) != null : i == 2) {
            i2 = 2;
        }
        frostHunterPagingDataPhoenixMegaPhoenix8056.FrostHunterServiceEliteCelestialThunder1757 = i2;
        frostHunterPagingDataPhoenixMegaPhoenix8056.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterPagingDataPhoenixMegaPhoenix8056.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterPagingDataPhoenixMegaPhoenix8056.FrostHunterBundlePulseFusionHero2475 = FrostHunterScaleAnimationStrikeSpark5059.FrostHunterBundlePulseFusionHero2475;
        return frostHunterPagingDataPhoenixMegaPhoenix8056.FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232() {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.FrostHunterAlertDialogAuroraDelta3200;
        boolean z = looper == null || looper == myLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (z) {
            this.FrostHunterAlertDialogAuroraDelta3200 = myLooper;
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterFCMEpicEpic9637 frostHunterFCMEpicEpic9637) {
        Context context;
        FrostHunterBindingAdapterOmegaAurora9082 FrostHunterConstraintSetCloneMasterUltraRogue2633;
        AudioDeviceInfo audioDeviceInfo = frostHunterFCMEpicEpic9637.FrostHunterBundlePulseFusionHero2475;
        FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411 = frostHunterFCMEpicEpic9637.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterLevelListDrawableFusionDragonHero2232();
        androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterTransitionManagerOmegaNeoMaster3754 == null && (context = this.FrostHunterAlphaAnimationNeoCosmos5761) != null) {
            androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37542 = new androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754(context, new FrostHunterRippleDrawableMaxElite5227(2, this), frostHunterRemoteConfigEpicUltraDragon2411, audioDeviceInfo);
            this.FrostHunterFlowMaxDragonHero5809 = frostHunterTransitionManagerOmegaNeoMaster37542;
            if (frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterKeyframeGammaGamma1197) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            } else {
                frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterKeyframeGammaGamma1197 = true;
                FrostHunterLayerDragonVortex4557 frostHunterLayerDragonVortex4557 = frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (frostHunterLayerDragonVortex4557 != null) {
                    frostHunterLayerDragonVortex4557.FrostHunterAlphaAnimationNeoCosmos5761.registerContentObserver(frostHunterLayerDragonVortex4557.FrostHunterConstraintSetCloneMasterUltraRogue2633, false, frostHunterLayerDragonVortex4557);
                }
                Context context2 = frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterAlphaAnimationNeoCosmos5761;
                AudioManager FrostHunterMeteringPointBetaCyber9571 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterMeteringPointBetaCyber9571(context2);
                FrostHunterDialogFragmentEpicSparkVortex5100 frostHunterDialogFragmentEpicSparkVortex5100 = frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterServiceEliteCelestialThunder1757;
                Handler handler = frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterBundlePulseFusionHero2475;
                FrostHunterMeteringPointBetaCyber9571.registerAudioDeviceCallback(frostHunterDialogFragmentEpicSparkVortex5100, handler);
                if (Build.VERSION.SDK_INT >= 32 && frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterRemoteConfigSpeedSpeed8566 == null) {
                    frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterAudioManagerNovaNovaXAurora2834(context2, new FrostHunterFilterAlphaSparkSpeed9857(5, frostHunterTransitionManagerOmegaNeoMaster37542), Boolean.valueOf(FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceInfoHyperionSparkMax9966(context2)));
                }
                FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterBindingAdapterOmegaAurora9082.FrostHunterConstraintSetCloneMasterUltraRogue2633(context2, context2.registerReceiver(frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterLifecycleBlazeGammaElite2889, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterAlertDialogAuroraDelta3200, frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterFlowMaxDragonHero5809, frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterAlphaAnimationNeoCosmos5761());
                frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        } else if (frostHunterTransitionManagerOmegaNeoMaster3754 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterFlowMaxDragonHero5809)) {
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterFlowMaxDragonHero5809 = audioDeviceInfo;
                Context context3 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon24112 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlertDialogAuroraDelta3200;
                List FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos7205 = FrostHunterBindingAdapterOmegaAurora9082.FrostHunterLifecycleBlazeGammaElite2889;
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBindingAdapterOmegaAurora9082.FrostHunterConstraintSetCloneMasterUltraRogue2633(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), frostHunterRemoteConfigEpicUltraDragon24112, audioDeviceInfo, FrostHunterAlphaAnimationNeoCosmos5761));
            }
            androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37543 = this.FrostHunterFlowMaxDragonHero5809;
            if (!Objects.equals(frostHunterRemoteConfigEpicUltraDragon2411, frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterAlertDialogAuroraDelta3200)) {
                frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterAlertDialogAuroraDelta3200 = frostHunterRemoteConfigEpicUltraDragon2411;
                Context context4 = frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterAlphaAnimationNeoCosmos5761;
                AudioDeviceInfo audioDeviceInfo2 = frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterFlowMaxDragonHero5809;
                List FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos72052 = FrostHunterBindingAdapterOmegaAurora9082.FrostHunterLifecycleBlazeGammaElite2889;
                frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBindingAdapterOmegaAurora9082.FrostHunterConstraintSetCloneMasterUltraRogue2633(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), frostHunterRemoteConfigEpicUltraDragon2411, audioDeviceInfo2, FrostHunterAlphaAnimationNeoCosmos57612));
            }
        }
        this.FrostHunterCameraXPixelTurboCosmos9814.getClass();
    }

    public final void FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834;
        FrostHunterBarcodeScannerLegendPhantomTurbo1194 frostHunterBarcodeScannerLegendPhantomTurbo1194;
        FrostHunterAlertDialogEliteMasterCosmos7701 frostHunterAlertDialogEliteMasterCosmos7701 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterAlertDialogEliteMasterCosmos7701 != null) {
            frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterServiceEliteCelestialThunder1757();
        }
        androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterTransitionManagerOmegaNeoMaster3754 != null) {
            Context context = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761;
            if (frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterKeyframeGammaGamma1197) {
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXPixelTurboCosmos9814 = null;
                FrostHunterTransitionGammaTitanSpeed7178.FrostHunterMeteringPointBetaCyber9571(context).unregisterAudioDeviceCallback(frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterServiceEliteCelestialThunder1757);
                if (Build.VERSION.SDK_INT >= 32 && (frostHunterAudioManagerNovaNovaXAurora2834 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterRemoteConfigSpeedSpeed8566) != null) {
                    Handler handler = (Handler) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterAlertDialogAuroraDelta3200;
                    Spatializer spatializer = (Spatializer) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterFlowMaxDragonHero5809;
                    if (spatializer != null && (frostHunterBarcodeScannerLegendPhantomTurbo1194 = (FrostHunterBarcodeScannerLegendPhantomTurbo1194) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterKeyframeGammaGamma1197) != null && handler != null) {
                        spatializer.removeOnSpatializerStateChangedListener(frostHunterBarcodeScannerLegendPhantomTurbo1194);
                        handler.removeCallbacksAndMessages(null);
                    }
                    frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterRemoteConfigSpeedSpeed8566 = null;
                }
                context.unregisterReceiver(frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLifecycleBlazeGammaElite2889);
                FrostHunterLayerDragonVortex4557 frostHunterLayerDragonVortex4557 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (frostHunterLayerDragonVortex4557 != null) {
                    frostHunterLayerDragonVortex4557.FrostHunterAlphaAnimationNeoCosmos5761.unregisterContentObserver(frostHunterLayerDragonVortex4557);
                }
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterKeyframeGammaGamma1197 = false;
            }
        }
    }
}
