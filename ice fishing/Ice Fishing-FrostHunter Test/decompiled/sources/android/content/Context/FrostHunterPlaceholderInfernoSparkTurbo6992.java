package android.content.Context;

import android.view.MotionEvent;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPlaceholderInfernoSparkTurbo6992 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterPlaceholderInfernoSparkTurbo6992(FrostHunterAdapterDelegateForcePixel7159 frostHunterAdapterDelegateForcePixel7159, FrostHunterNestedScrollViewMaxEpicEpic6844 frostHunterNestedScrollViewMaxEpicEpic6844) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 13;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterNestedScrollViewMaxEpicEpic6844;
    }

    private final void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterViewModelScopeFusionNovaEclipse8516 frostHunterViewModelScopeFusionNovaEclipse8516 = (FrostHunterViewModelScopeFusionNovaEclipse8516) this.FrostHunterFlowMaxDragonHero5809;
        synchronized (frostHunterViewModelScopeFusionNovaEclipse8516.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                if (frostHunterViewModelScopeFusionNovaEclipse8516.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                    String.valueOf(frostHunterViewModelScopeFusionNovaEclipse8516.FrostHunterAlertDialogAuroraDelta3200).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    frostHunterViewModelScopeFusionNovaEclipse8516.FrostHunterServiceEliteCelestialThunder1757();
                    if (frostHunterViewModelScopeFusionNovaEclipse8516.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                        frostHunterViewModelScopeFusionNovaEclipse8516.FrostHunterBundlePulseFusionHero2475 = 1;
                        frostHunterViewModelScopeFusionNovaEclipse8516.FrostHunterLifecycleBlazeGammaElite2889();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrostHunterCoroutineScopeQuantumGamma5505 FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long j;
        ILogger iLogger;
        String str;
        Runnable runnable;
        ILogger iLogger2;
        String str2;
        Runnable runnable2;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustTimeoutCallback adjustTimeoutCallback = ((FrostHunterTransitionListenerPrimeMega4104) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809;
                OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(null);
                }
                adjustTimeoutCallback.setOnAdidReadListener(null);
                return;
            case 1:
                AdjustTimeoutCallback adjustTimeoutCallback2 = ((FrostHunterTransitionListenerPrimeMega4104) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809;
                OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback2.getOnAttributionReadListener();
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(null);
                }
                adjustTimeoutCallback2.setOnAttributionReadListener(null);
                return;
            case 2:
                FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = (FrostHunterFilterSpectraTitan5298) this.FrostHunterFlowMaxDragonHero5809;
                frostHunterFilterSpectraTitan5298.removeCallbacks(this);
                MotionEvent motionEvent = frostHunterFilterSpectraTitan5298.FrostHunterItemDecorationPhoenixAlphaVortex8006;
                if (motionEvent != null) {
                    r2 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (r2 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    frostHunterFilterSpectraTitan5298.FrostHunterTranslateAnimationCyberSolarUltra7101(motionEvent, i, frostHunterFilterSpectraTitan5298.FrostHunterDrawableCompatHeroMasterSpectra7412, false);
                    return;
                }
                return;
            case 3:
                ((FrostHunterFontFamilyGammaSpeed1025) this.FrostHunterFlowMaxDragonHero5809).FrostHunterKeyframeGammaGamma1197();
                throw null;
            case 4:
                ((InstallReferrer) this.FrostHunterFlowMaxDragonHero5809).startConnection();
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                FrostHunterBundleCelestialNovaXRogue4240 frostHunterBundleCelestialNovaXRogue4240 = (FrostHunterBundleCelestialNovaXRogue4240) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterFlipAnimationGammaNeo8805[] frostHunterFlipAnimationGammaNeo8805Arr = frostHunterBundleCelestialNovaXRogue4240.FrostHunterEditTextPulseHyperion1262;
                int length = frostHunterFlipAnimationGammaNeo8805Arr.length;
                while (r2 < length) {
                    FrostHunterFlipAnimationGammaNeo8805 frostHunterFlipAnimationGammaNeo8805 = frostHunterFlipAnimationGammaNeo8805Arr[r2];
                    frostHunterFlipAnimationGammaNeo8805.FrostHunterLintTitanVortexQuantum9911(true);
                    FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = frostHunterFlipAnimationGammaNeo8805.FrostHunterCameraXPixelTurboCosmos9814;
                    if (frostHunterSQLiteMasterUltra9956 != null) {
                        frostHunterSQLiteMasterUltra9956.FrostHunterEditTextPulseHyperion1262(frostHunterFlipAnimationGammaNeo8805.FrostHunterLifecycleBlazeGammaElite2889);
                        frostHunterFlipAnimationGammaNeo8805.FrostHunterCameraXPixelTurboCosmos9814 = null;
                        frostHunterFlipAnimationGammaNeo8805.FrostHunterRemoteConfigSpeedSpeed8566 = null;
                    }
                    r2++;
                }
                FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = frostHunterBundleCelestialNovaXRogue4240.FrostHunterTextViewDragonStormMega4297;
                FrostHunterJobSchedulerBlazeCyberMega7710 frostHunterJobSchedulerBlazeCyberMega7710 = (FrostHunterJobSchedulerBlazeCyberMega7710) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterJobSchedulerBlazeCyberMega7710 != null) {
                    frostHunterJobSchedulerBlazeCyberMega7710.FrostHunterAlphaAnimationNeoCosmos5761();
                    frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200 = null;
                }
                frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197 = null;
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                ((SdkClickHandler) this.FrostHunterFlowMaxDragonHero5809).sendNextSdkClickI();
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue7248 = (FrostHunterCoroutineScopeBetaMasterRogue7248) this.FrostHunterFlowMaxDragonHero5809;
                synchronized (frostHunterCoroutineScopeBetaMasterRogue7248) {
                    frostHunterCoroutineScopeBetaMasterRogue7248.FrostHunterRemoteConfigSpeedSpeed8566++;
                    FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterCoroutineScopeBetaMasterRogue7248.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                }
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                do {
                    FrostHunterCoroutineScopeQuantumGamma5505 frostHunterCoroutineScopeQuantumGamma5505 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    try {
                        currentThread.setName(frostHunterCoroutineScopeQuantumGamma5505.FrostHunterAlphaAnimationNeoCosmos5761);
                        Logger logger = ((FrostHunterCoroutineScopeBetaMasterRogue7248) this.FrostHunterFlowMaxDragonHero5809).FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        FrostHunterApplicationInfoUltraInfernoSpectra4401 frostHunterApplicationInfoUltraInfernoSpectra4401 = frostHunterCoroutineScopeQuantumGamma5505.FrostHunterBundlePulseFusionHero2475;
                        frostHunterApplicationInfoUltraInfernoSpectra4401.getClass();
                        boolean isLoggable = logger.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j = System.nanoTime();
                            FrostHunterGraphQuantumSpeed6562.FrostHunterAlphaAnimationNeoCosmos5761(logger, frostHunterCoroutineScopeQuantumGamma5505, frostHunterApplicationInfoUltraInfernoSpectra4401, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            long FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCoroutineScopeQuantumGamma5505.FrostHunterAlphaAnimationNeoCosmos5761();
                            if (isLoggable) {
                                FrostHunterGraphQuantumSpeed6562.FrostHunterAlphaAnimationNeoCosmos5761(logger, frostHunterCoroutineScopeQuantumGamma5505, frostHunterApplicationInfoUltraInfernoSpectra4401, "finished run in " + FrostHunterGraphQuantumSpeed6562.FrostHunterServiceEliteCelestialThunder1757(System.nanoTime() - j));
                            }
                            FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue72482 = (FrostHunterCoroutineScopeBetaMasterRogue7248) this.FrostHunterFlowMaxDragonHero5809;
                            synchronized (frostHunterCoroutineScopeBetaMasterRogue72482) {
                                FrostHunterCoroutineScopeBetaMasterRogue7248.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCoroutineScopeBetaMasterRogue72482, frostHunterCoroutineScopeQuantumGamma5505, FrostHunterAlphaAnimationNeoCosmos5761, true);
                                FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterCoroutineScopeBetaMasterRogue72482.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                FrostHunterGraphQuantumSpeed6562.FrostHunterAlphaAnimationNeoCosmos5761(logger, frostHunterCoroutineScopeQuantumGamma5505, frostHunterApplicationInfoUltraInfernoSpectra4401, "failed a run in " + FrostHunterGraphQuantumSpeed6562.FrostHunterServiceEliteCelestialThunder1757(System.nanoTime() - j));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue72483 = (FrostHunterCoroutineScopeBetaMasterRogue7248) this.FrostHunterFlowMaxDragonHero5809;
                            synchronized (frostHunterCoroutineScopeBetaMasterRogue72483) {
                                FrostHunterCoroutineScopeBetaMasterRogue7248.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCoroutineScopeBetaMasterRogue72483, frostHunterCoroutineScopeQuantumGamma5505, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            currentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (FrostHunterConstraintSetCloneMasterUltraRogue2633 != null);
                currentThread.setName(name);
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                TimerCycle timerCycle = (TimerCycle) this.FrostHunterFlowMaxDragonHero5809;
                iLogger = timerCycle.logger;
                str = timerCycle.name;
                iLogger.verbose("%s fired", str);
                runnable = timerCycle.command;
                runnable.run();
                return;
            case 9:
                TimerOnce timerOnce = (TimerOnce) this.FrostHunterFlowMaxDragonHero5809;
                iLogger2 = timerOnce.logger;
                str2 = timerOnce.name;
                iLogger2.verbose("%s fired", str2);
                runnable2 = timerOnce.command;
                runnable2.run();
                timerOnce.waitingTask = null;
                return;
            case 10:
                ((FrostHunterFlowEpicDragon7641) this.FrostHunterFlowMaxDragonHero5809).FrostHunterCameraXPixelTurboCosmos9814();
                return;
            case 11:
                FrostHunterAdapterHeroEclipseHyper5814 frostHunterAdapterHeroEclipseHyper5814 = ((FrostHunterFlowEpicDragon7641) ((FrostHunterPlaceholderHeroDragonCyber3593) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761).FrostHunterServiceEliteCelestialThunder1757;
                frostHunterAdapterHeroEclipseHyper5814.FrostHunterServiceEliteCelestialThunder1757(frostHunterAdapterHeroEclipseHyper5814.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 12:
                ((FrostHunterDatabaseNebulaSpectraNebula7977) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633(new ConnectionResult(4));
                return;
            case 13:
                throw null;
            case 14:
                FrostHunterAlphaAnimationNeoCosmos5761();
                return;
            case 15:
                ((FrostHunterIntentBetaElite8730) this.FrostHunterFlowMaxDragonHero5809).FrostHunterConstraintSetCloneMasterUltraRogue2633(new IOException("TIMEOUT"));
                return;
            default:
                synchronized (((FrostHunterServiceConnectionGammaMax9245) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200) {
                    ((FrostHunterFlatMapVisionVortex6512) ((FrostHunterServiceConnectionGammaMax9245) this.FrostHunterFlowMaxDragonHero5809).FrostHunterKeyframeGammaGamma1197).FrostHunterAlphaAnimationNeoCosmos5761();
                }
                return;
        }
    }

    public /* synthetic */ FrostHunterPlaceholderInfernoSparkTurbo6992(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }
}
