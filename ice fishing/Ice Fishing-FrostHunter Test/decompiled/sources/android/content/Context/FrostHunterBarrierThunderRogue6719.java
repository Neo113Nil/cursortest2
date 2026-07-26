package android.content.Context;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBarrierThunderRogue6719 extends Handler implements Runnable {
    public final long FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public volatile boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final FrostHunterStorageRogueRogue1303 FrostHunterFlowMaxDragonHero5809;
    public IOException FrostHunterFragmentBetaMegaVortex6025;
    public FrostHunterBundleCelestialNovaXRogue4240 FrostHunterKeyframeGammaGamma1197;
    public Thread FrostHunterLightSensorForceFusion4241;
    public final /* synthetic */ FrostHunterTraceHyperionAuroraNebula9947 FrostHunterLintTitanVortexQuantum9911;
    public boolean FrostHunterScaleAnimationStrikeSpark5059;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterBarrierThunderRogue6719(FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947, Looper looper, FrostHunterStorageRogueRogue1303 frostHunterStorageRogueRogue1303, FrostHunterBundleCelestialNovaXRogue4240 frostHunterBundleCelestialNovaXRogue4240, int i, long j) {
        super(looper);
        this.FrostHunterLintTitanVortexQuantum9911 = frostHunterTraceHyperionAuroraNebula9947;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterStorageRogueRogue1303;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterBundleCelestialNovaXRogue4240;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = j;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(boolean z) {
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = z;
        this.FrostHunterFragmentBetaMegaVortex6025 = null;
        if (hasMessages(1)) {
            this.FrostHunterScaleAnimationStrikeSpark5059 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.FrostHunterScaleAnimationStrikeSpark5059 = true;
                    this.FrostHunterFlowMaxDragonHero5809.FrostHunterRemoteConfigSpeedSpeed8566 = true;
                    Thread thread = this.FrostHunterLightSensorForceFusion4241;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.FrostHunterLintTitanVortexQuantum9911.FrostHunterAlertDialogAuroraDelta3200 = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            FrostHunterBundleCelestialNovaXRogue4240 frostHunterBundleCelestialNovaXRogue4240 = this.FrostHunterKeyframeGammaGamma1197;
            frostHunterBundleCelestialNovaXRogue4240.getClass();
            frostHunterBundleCelestialNovaXRogue4240.FrostHunterDialogFragmentTurboPhoenixDragon7627(this.FrostHunterFlowMaxDragonHero5809, elapsedRealtime, elapsedRealtime - this.FrostHunterAlertDialogAuroraDelta3200, true);
            this.FrostHunterKeyframeGammaGamma1197 = null;
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterManifestEpicSpark5297 frostHunterManifestEpicSpark5297;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        FrostHunterBundleCelestialNovaXRogue4240 frostHunterBundleCelestialNovaXRogue4240 = this.FrostHunterKeyframeGammaGamma1197;
        frostHunterBundleCelestialNovaXRogue4240.getClass();
        int i = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        FrostHunterStorageRogueRogue1303 frostHunterStorageRogueRogue1303 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterFocusMeteringActionEpicStrikeCyber5023 frostHunterFocusMeteringActionEpicStrikeCyber5023 = frostHunterStorageRogueRogue1303.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i == 0) {
            FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903 = frostHunterStorageRogueRogue1303.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterManifestEpicSpark5297 = new FrostHunterManifestEpicSpark5297(frostHunterStateListAnimatorQuantumHyperionTitanium1903, frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761, Collections.EMPTY_MAP, elapsedRealtime, 0L);
        } else {
            frostHunterManifestEpicSpark5297 = new FrostHunterManifestEpicSpark5297(frostHunterStorageRogueRogue1303.FrostHunterAlertDialogAuroraDelta3200, frostHunterFocusMeteringActionEpicStrikeCyber5023.FrostHunterAlertDialogAuroraDelta3200, frostHunterFocusMeteringActionEpicStrikeCyber5023.FrostHunterKeyframeGammaGamma1197, elapsedRealtime, frostHunterFocusMeteringActionEpicStrikeCyber5023.FrostHunterFlowMaxDragonHero5809);
        }
        FrostHunterImageAnalysisTurboLegend2497 frostHunterImageAnalysisTurboLegend2497 = frostHunterBundleCelestialNovaXRogue4240.FrostHunterFragmentBetaMegaVortex6025;
        frostHunterImageAnalysisTurboLegend2497.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterAsyncTaskMasterSpeed9902(frostHunterImageAnalysisTurboLegend2497, frostHunterManifestEpicSpark5297, new FrostHunterThemeOverlayTitaniumOmegaBeta4062(-1, null, FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterStorageRogueRogue1303.FrostHunterFlowMaxDragonHero5809), FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterBundleCelestialNovaXRogue4240.FrostHunterStateCelestialNovaPixel8414)), i));
        this.FrostHunterFragmentBetaMegaVortex6025 = null;
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = this.FrostHunterLintTitanVortexQuantum9911;
        FrostHunterRemoteModelManagerVortexOlympianForce8190 frostHunterRemoteModelManagerVortexOlympianForce8190 = (FrostHunterRemoteModelManagerVortexOlympianForce8190) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809;
        FrostHunterBarrierThunderRogue6719 frostHunterBarrierThunderRogue6719 = (FrostHunterBarrierThunderRogue6719) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterBarrierThunderRogue6719.getClass();
        frostHunterRemoteModelManagerVortexOlympianForce8190.execute(frostHunterBarrierThunderRogue6719);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long min;
        long j;
        FrostHunterRoomUltraForce5592 frostHunterRoomUltraForce5592;
        FrostHunterGeocoderHyperionTitan2118 frostHunterGeocoderHyperionTitan2118;
        if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            FrostHunterConstraintSetCloneMasterUltraRogue2633();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.FrostHunterLintTitanVortexQuantum9911.FrostHunterAlertDialogAuroraDelta3200 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterBundleCelestialNovaXRogue4240 frostHunterBundleCelestialNovaXRogue4240 = this.FrostHunterKeyframeGammaGamma1197;
        frostHunterBundleCelestialNovaXRogue4240.getClass();
        if (this.FrostHunterScaleAnimationStrikeSpark5059) {
            frostHunterBundleCelestialNovaXRogue4240.FrostHunterDialogFragmentTurboPhoenixDragon7627(this.FrostHunterFlowMaxDragonHero5809, elapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                frostHunterBundleCelestialNovaXRogue4240.FrostHunterLooperHyperionForce4133(this.FrostHunterFlowMaxDragonHero5809, elapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Unexpected exception handling load completed", e);
                this.FrostHunterLintTitanVortexQuantum9911.FrostHunterKeyframeGammaGamma1197 = new FrostHunterInsetDrawableSpeedInfernoNova6521(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.FrostHunterFragmentBetaMegaVortex6025 = iOException;
        int i3 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719 + 1;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i3;
        FrostHunterStorageRogueRogue1303 frostHunterStorageRogueRogue1303 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterFocusMeteringActionEpicStrikeCyber5023 frostHunterFocusMeteringActionEpicStrikeCyber5023 = frostHunterStorageRogueRogue1303.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterManifestEpicSpark5297 frostHunterManifestEpicSpark5297 = new FrostHunterManifestEpicSpark5297(frostHunterStorageRogueRogue1303.FrostHunterAlertDialogAuroraDelta3200, frostHunterFocusMeteringActionEpicStrikeCyber5023.FrostHunterAlertDialogAuroraDelta3200, frostHunterFocusMeteringActionEpicStrikeCyber5023.FrostHunterKeyframeGammaGamma1197, elapsedRealtime, frostHunterFocusMeteringActionEpicStrikeCyber5023.FrostHunterFlowMaxDragonHero5809);
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterBundleCelestialNovaXRogue4240.FrostHunterKeyframeGammaGamma1197.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof FrostHunterDiffUtilTurboSpark8131) || (th instanceof FileNotFoundException) || (th instanceof FrostHunterRoomEntityMegaLegendThunder8151) || (th instanceof FrostHunterInsetDrawableSpeedInfernoNova6521) || ((th instanceof FrostHunterMotionSceneTitaniumMega7732) && ((FrostHunterMotionSceneTitaniumMega7732) th).FrostHunterCameraXPixelTurboCosmos9814 == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i3 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            frostHunterRoomUltraForce5592 = FrostHunterTraceHyperionAuroraNebula9947.FrostHunterScaleAnimationStrikeSpark5059;
            j = -9223372036854775807L;
        } else {
            int FrostHunterCameraXTurboCelestialHero5430 = frostHunterBundleCelestialNovaXRogue4240.FrostHunterCameraXTurboCelestialHero5430();
            j = -9223372036854775807L;
            int i4 = FrostHunterCameraXTurboCelestialHero5430 > frostHunterBundleCelestialNovaXRogue4240.FrostHunterPushNotificationStormTitanGamma8999 ? 1 : 0;
            if (frostHunterBundleCelestialNovaXRogue4240.FrostHunterNavigationMasterMegaMax2752 || !((frostHunterGeocoderHyperionTitan2118 = frostHunterBundleCelestialNovaXRogue4240.FrostHunterTranslateAnimationCyberSolarUltra7101) == null || frostHunterGeocoderHyperionTitan2118.FrostHunterRemoteConfigSpeedSpeed8566() == -9223372036854775807L)) {
                frostHunterBundleCelestialNovaXRogue4240.FrostHunterPushNotificationStormTitanGamma8999 = FrostHunterCameraXTurboCelestialHero5430;
            } else if (!frostHunterBundleCelestialNovaXRogue4240.FrostHunterViewPhantomNeo1634 || frostHunterBundleCelestialNovaXRogue4240.FrostHunterDatabaseEliteShadowUltra2452()) {
                frostHunterBundleCelestialNovaXRogue4240.FrostHunterRewardedAdMasterStrike9463 = frostHunterBundleCelestialNovaXRogue4240.FrostHunterViewPhantomNeo1634;
                frostHunterBundleCelestialNovaXRogue4240.FrostHunterTransitionListenerPulseVortexCosmos7949 = 0L;
                frostHunterBundleCelestialNovaXRogue4240.FrostHunterPushNotificationStormTitanGamma8999 = 0;
                for (FrostHunterFlipAnimationGammaNeo8805 frostHunterFlipAnimationGammaNeo8805 : frostHunterBundleCelestialNovaXRogue4240.FrostHunterEditTextPulseHyperion1262) {
                    frostHunterFlipAnimationGammaNeo8805.FrostHunterLintTitanVortexQuantum9911(false);
                }
                frostHunterStorageRogueRogue1303.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterAlphaAnimationNeoCosmos5761 = 0L;
                frostHunterStorageRogueRogue1303.FrostHunterFlowMaxDragonHero5809 = 0L;
                frostHunterStorageRogueRogue1303.FrostHunterCameraXPixelTurboCosmos9814 = true;
                frostHunterStorageRogueRogue1303.FrostHunterFragmentBetaMegaVortex6025 = false;
            } else {
                frostHunterBundleCelestialNovaXRogue4240.FrostHunterRemoteConfigThunderShadow4435 = true;
                frostHunterRoomUltraForce5592 = FrostHunterTraceHyperionAuroraNebula9947.FrostHunterLightSensorForceFusion4241;
            }
            frostHunterRoomUltraForce5592 = new FrostHunterRoomUltraForce5592(i4, min);
        }
        int i5 = frostHunterRoomUltraForce5592.FrostHunterAlphaAnimationNeoCosmos5761;
        boolean z = !(i5 == 0 || i5 == 1);
        FrostHunterImageAnalysisTurboLegend2497 frostHunterImageAnalysisTurboLegend2497 = frostHunterBundleCelestialNovaXRogue4240.FrostHunterFragmentBetaMegaVortex6025;
        frostHunterImageAnalysisTurboLegend2497.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterClipboardManagerStormCyberAurora5873(frostHunterImageAnalysisTurboLegend2497, frostHunterManifestEpicSpark5297, new FrostHunterThemeOverlayTitaniumOmegaBeta4062(-1, null, FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterStorageRogueRogue1303.FrostHunterFlowMaxDragonHero5809), FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterBundleCelestialNovaXRogue4240.FrostHunterStateCelestialNovaPixel8414)), iOException, z));
        int i6 = frostHunterRoomUltraForce5592.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i6 == 3) {
            this.FrostHunterLintTitanVortexQuantum9911.FrostHunterKeyframeGammaGamma1197 = this.FrostHunterFragmentBetaMegaVortex6025;
            return;
        }
        if (i6 != 2) {
            if (i6 == 1) {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 1;
            }
            long j3 = frostHunterRoomUltraForce5592.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (j3 == j) {
                j3 = Math.min((this.FrostHunterServiceConnectionTurboPhoenixOmega6719 - 1) * 1000, 5000);
            }
            FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = this.FrostHunterLintTitanVortexQuantum9911;
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(((FrostHunterBarrierThunderRogue6719) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200) == null);
            frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200 = this;
            if (j3 > 0) {
                sendEmptyMessageDelayed(1, j3);
            } else {
                FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.FrostHunterScaleAnimationStrikeSpark5059;
                this.FrostHunterLightSensorForceFusion4241 = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.FrostHunterFlowMaxDragonHero5809.getClass().getSimpleName()));
                try {
                    this.FrostHunterFlowMaxDragonHero5809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.FrostHunterLightSensorForceFusion4241 = null;
                Thread.interrupted();
            }
            if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                return;
            }
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Unexpected exception loading stream", e2);
            obtainMessage(3, new FrostHunterInsetDrawableSpeedInfernoNova6521(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                return;
            }
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("OutOfMemory error loading stream", e3);
            obtainMessage(3, new FrostHunterInsetDrawableSpeedInfernoNova6521(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
