package android.content.Context;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAssetManagerLegendGamma4159 {
    public long FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterAlphaAnimationNeoCosmos5761;
    public long FrostHunterBitmapTurboDeltaNebula8743;
    public final long[] FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterTransitionPhantomBeta6269 FrostHunterCameraXPixelTurboCosmos9814;
    public long FrostHunterCameraXTurboCelestialHero5430;
    public final FrostHunterAssetManagerQuantumRogue9837 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public long FrostHunterDialogFragmentTurboPhoenixDragon7627;
    public long FrostHunterEditTextPulseHyperion1262;
    public long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public float FrostHunterFlowMaxDragonHero5809;
    public long FrostHunterFragmentBetaMegaVortex6025;
    public long FrostHunterKeyframeGammaGamma1197;
    public final long FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public long FrostHunterLightSensorForceFusion4241;
    public long FrostHunterLintTitanVortexQuantum9911;
    public long FrostHunterLooperHyperionForce4133;
    public long FrostHunterLooperThreadBetaHyperionMax1000;
    public long FrostHunterMeteringPointBetaCyber9571;
    public long FrostHunterMotionSceneAuroraMega2271;
    public final boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterResourcesTitanHyperVision5823;
    public long FrostHunterScaleAnimationStrikeSpark5059;
    public Method FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final AudioTrack FrostHunterServiceEliteCelestialThunder1757;
    public boolean FrostHunterServiceInfoHyperionSparkMax9966;
    public int FrostHunterTextViewDragonStormMega4297;

    public FrostHunterAssetManagerLegendGamma4159(FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832, FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue9837, AudioTrack audioTrack, int i, int i2, int i3) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLayoutInflaterTurboHyperion3832;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAssetManagerQuantumRogue9837;
        this.FrostHunterServiceEliteCelestialThunder1757 = audioTrack;
        try {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.FrostHunterBundlePulseFusionHero2475 = new long[10];
        this.FrostHunterMeteringPointBetaCyber9571 = -9223372036854775807L;
        this.FrostHunterLooperHyperionForce4133 = -9223372036854775807L;
        this.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterTransitionPhantomBeta6269(audioTrack, frostHunterLayoutInflaterTurboHyperion3832);
        int sampleRate = audioTrack.getSampleRate();
        this.FrostHunterLifecycleBlazeGammaElite2889 = sampleRate;
        boolean FrostHunterLooperHyperionForce4133 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLooperHyperionForce4133(i);
        this.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterLooperHyperionForce4133;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLooperHyperionForce4133 ? FrostHunterGyroscopeHeroAlpha1995.FrostHunterBillingClientFusionVortex9008(sampleRate, i3 / i2) : -9223372036854775807L;
        this.FrostHunterLintTitanVortexQuantum9911 = 0L;
        this.FrostHunterCameraXTurboCelestialHero5430 = 0L;
        this.FrostHunterServiceInfoHyperionSparkMax9966 = false;
        this.FrostHunterEditTextPulseHyperion1262 = 0L;
        this.FrostHunterLooperThreadBetaHyperionMax1000 = -9223372036854775807L;
        this.FrostHunterMotionSceneAuroraMega2271 = -9223372036854775807L;
        this.FrostHunterScaleAnimationStrikeSpark5059 = 0L;
        this.FrostHunterLightSensorForceFusion4241 = 0L;
        this.FrostHunterFlowMaxDragonHero5809 = 1.0f;
        this.FrostHunterAlertDialogAuroraDelta3200 = -9223372036854775807L;
    }

    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        if (this.FrostHunterLooperThreadBetaHyperionMax1000 != -9223372036854775807L) {
            return Math.min(this.FrostHunterDialogFragmentTurboPhoenixDragon7627, FrostHunterBundlePulseFusionHero2475());
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 >= 5) {
            int playState = this.FrostHunterServiceEliteCelestialThunder1757.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.FrostHunterLintTitanVortexQuantum9911 <= 0 || playState != 3) {
                        this.FrostHunterMotionSceneAuroraMega2271 = -9223372036854775807L;
                    } else if (this.FrostHunterMotionSceneAuroraMega2271 == -9223372036854775807L) {
                        this.FrostHunterMotionSceneAuroraMega2271 = elapsedRealtime;
                    }
                }
                long j = this.FrostHunterLintTitanVortexQuantum9911;
                if (j > playbackHeadPosition) {
                    if (this.FrostHunterServiceInfoHyperionSparkMax9966) {
                        this.FrostHunterEditTextPulseHyperion1262 += j;
                        this.FrostHunterServiceInfoHyperionSparkMax9966 = false;
                    } else {
                        this.FrostHunterCameraXTurboCelestialHero5430++;
                    }
                }
                this.FrostHunterLintTitanVortexQuantum9911 = playbackHeadPosition;
            }
            this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = elapsedRealtime;
        }
        return this.FrostHunterLintTitanVortexQuantum9911 + this.FrostHunterEditTextPulseHyperion1262 + (this.FrostHunterCameraXTurboCelestialHero5430 << 32);
    }

    public final long FrostHunterBundlePulseFusionHero2475() {
        if (this.FrostHunterServiceEliteCelestialThunder1757.getPlayState() == 2) {
            return this.FrostHunterBitmapTurboDeltaNebula8743;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
        return this.FrostHunterBitmapTurboDeltaNebula8743 + FrostHunterGyroscopeHeroAlpha1995.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXTurboCelestialHero5430(FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(SystemClock.elapsedRealtime()) - this.FrostHunterLooperThreadBetaHyperionMax1000, this.FrostHunterFlowMaxDragonHero5809), this.FrostHunterLifecycleBlazeGammaElite2889, 1000000L, RoundingMode.UP);
    }

    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        int i = this.FrostHunterTextViewDragonStormMega4297;
        int i2 = this.FrostHunterLifecycleBlazeGammaElite2889;
        long max = Math.max(0L, (i == 0 ? this.FrostHunterLooperThreadBetaHyperionMax1000 != -9223372036854775807L ? FrostHunterGyroscopeHeroAlpha1995.FrostHunterBillingClientFusionVortex9008(i2, FrostHunterBundlePulseFusionHero2475()) : FrostHunterGyroscopeHeroAlpha1995.FrostHunterBillingClientFusionVortex9008(i2, FrostHunterAlphaAnimationNeoCosmos5761()) : FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXTurboCelestialHero5430(j + this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFlowMaxDragonHero5809)) - this.FrostHunterLightSensorForceFusion4241);
        return this.FrostHunterLooperThreadBetaHyperionMax1000 != -9223372036854775807L ? Math.min(FrostHunterGyroscopeHeroAlpha1995.FrostHunterBillingClientFusionVortex9008(i2, this.FrostHunterDialogFragmentTurboPhoenixDragon7627), max) : max;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(long j) {
        long j2 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long j3 = j - j2;
        float f = this.FrostHunterFlowMaxDragonHero5809;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        if (f != 1.0f) {
            j3 = Math.round(j3 / f);
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
        final long currentTimeMillis = System.currentTimeMillis() - FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(j3);
        this.FrostHunterAlertDialogAuroraDelta3200 = -9223372036854775807L;
        FrostHunterAlertDialogEliteMasterCosmos7701 frostHunterAlertDialogEliteMasterCosmos7701 = ((FrostHunterFirestoreVortexBeta2433) this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200;
        frostHunterAlertDialogEliteMasterCosmos7701.getClass();
        if (Thread.currentThread() == frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterAlphaAnimationNeoCosmos5761) {
            frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterLifecycleBlazeGammaElite2889(-1, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterRealtimeDatabaseOmegaPhoenixBeta9800
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
                    FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956;
                    FrostHunterApplicationInfoPhoenixSparkHyperion8666 frostHunterApplicationInfoPhoenixSparkHyperion8666 = (FrostHunterApplicationInfoPhoenixSparkHyperion8666) obj;
                    FrostHunterCoordinatorLayoutAuroraAlpha8847 frostHunterCoordinatorLayoutAuroraAlpha8847 = frostHunterApplicationInfoPhoenixSparkHyperion8666.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (frostHunterApplicationInfoPhoenixSparkHyperion8666 == frostHunterCoordinatorLayoutAuroraAlpha8847.FrostHunterAlertDialogAuroraDelta3200 && (frostHunterSQLiteMasterUltra9956 = frostHunterCoordinatorLayoutAuroraAlpha8847.FrostHunterLightSensorForceFusion4241) != null) {
                        FrostHunterViewModelScopeStormSpeedQuantum8589 frostHunterViewModelScopeStormSpeedQuantum8589 = (FrostHunterViewModelScopeStormSpeedQuantum8589) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809;
                        frostHunterViewModelScopeStormSpeedQuantum8589.FrostHunterMapOlympianNeo8739 = true;
                        FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = frostHunterViewModelScopeStormSpeedQuantum8589.FrostHunterScrollViewCyberPixel8279;
                        Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
                        if (handler != null) {
                            handler.post(new FrostHunterBroadcastSparkMegaHyper6224(frostHunterStorageDeltaInferno9007, currentTimeMillis));
                        }
                    }
                }
            });
        }
    }
}
