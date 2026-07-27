package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterSQLiteUltraElite7894 extends FrostHunterInputFilterOmegaBeta3718 implements FrostHunterViewPagerTitanSolar4986, FrostHunterSQLiteNovaXCelestial9743, FrostHunterCoordinatorLayoutSolarVortexMaster1896 {
    public final FrostHunterCountDownTimerRogueTitan5615 FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterTraceCelestialVortexSpark6705 FrostHunterKeyframeGammaGamma1197;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterServiceConnectionTurboPhoenixOmega6719 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterSQLiteUltraElite7894.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterLightSensorForceFusion4241 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterSQLiteUltraElite7894.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterScaleAnimationStrikeSpark5059 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterSQLiteUltraElite7894.class, Object.class, "_parentHandle$volatile");

    public FrostHunterSQLiteUltraElite7894(int i, FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705) {
        super(i);
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterTraceCelestialVortexSpark6705;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterTraceCelestialVortexSpark6705.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = FrostHunterBroadcastReceiverVisionOlympian7097.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public static void FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterAdapterGammaQuantum7174 frostHunterAdapterGammaQuantum7174, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + frostHunterAdapterGammaQuantum7174 + ", already has " + obj).toString());
    }

    public static Object FrostHunterViewPhantomNeo1634(FrostHunterAdapterGammaQuantum7174 frostHunterAdapterGammaQuantum7174, Object obj, int i, FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109) {
        if (obj instanceof FrostHunterImageViewTitaniumVision4682) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (frostHunterDragEventStormHyperion6109 != null || (frostHunterAdapterGammaQuantum7174 instanceof FrostHunterRealtimeDatabaseGammaNebulaCosmos9536)) {
            return new FrostHunterSupervisorJobNeoSparkInferno8385(obj, frostHunterAdapterGammaQuantum7174 instanceof FrostHunterRealtimeDatabaseGammaNebulaCosmos9536 ? (FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) frostHunterAdapterGammaQuantum7174 : null, frostHunterDragEventStormHyperion6109, (Throwable) null, 16);
        }
        return obj;
    }

    public final void FrostHunterAlertDialogAuroraDelta3200(FrostHunterRealtimeDatabaseGammaNebulaCosmos9536 frostHunterRealtimeDatabaseGammaNebulaCosmos9536, Throwable th) {
        try {
            switch (frostHunterRealtimeDatabaseGammaNebulaCosmos9536.FrostHunterAlphaAnimationNeoCosmos5761) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((ScheduledFuture) frostHunterRealtimeDatabaseGammaNebulaCosmos9536.FrostHunterConstraintSetCloneMasterUltraRogue2633).cancel(false);
                    break;
                case 1:
                    ((FrostHunterCombineLegendMegaPrime5473) frostHunterRealtimeDatabaseGammaNebulaCosmos9536.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterAlphaAnimationNeoCosmos5761(th);
                    break;
                default:
                    ((FrostHunterCoroutineScopeNeoMega4482) frostHunterRealtimeDatabaseGammaNebulaCosmos9536.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    break;
            }
        } catch (Throwable th2) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterStateCelestialNovaPixel8414(this.FrostHunterFragmentBetaMegaVortex6025, new FrostHunterLinearLayoutSolarTurboSpark3070("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // android.content.Context.FrostHunterCoordinatorLayoutSolarVortexMaster1896
    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAdapterSpectraVisionThunder5171 frostHunterAdapterSpectraVisionThunder5171, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = FrostHunterServiceConnectionTurboPhoenixOmega6719;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        FrostHunterLooperThreadBetaHyperionMax1000(frostHunterAdapterSpectraVisionThunder5171);
    }

    public final boolean FrostHunterBitmapTurboDeltaNebula8743() {
        if (this.FrostHunterAlertDialogAuroraDelta3200 == 2) {
            return FrostHunterFlowOnUltraInfernoThunder4489.FrostHunterScaleAnimationStrikeSpark5059.get((FrostHunterFlowOnUltraInfernoThunder4489) this.FrostHunterKeyframeGammaGamma1197) != null;
        }
        return false;
    }

    @Override // android.content.Context.FrostHunterInputFilterOmegaBeta3718
    public final FrostHunterTraceCelestialVortexSpark6705 FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterKeyframeGammaGamma1197;
    }

    public final void FrostHunterCameraXTurboCelestialHero5430() {
        FrostHunterCoroutineScopeNeoMega4482 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 == null || (FrostHunterLightSensorForceFusion4241.get(this) instanceof FrostHunterAdapterGammaQuantum7174)) {
            return;
        }
        FrostHunterResourcesTitanHyperVision5823.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        FrostHunterScaleAnimationStrikeSpark5059.set(this, FrostHunterFCMNeoEliteAlpha2432.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final void FrostHunterCardViewSpectraCyber7714(FrostHunterResourceThunderSolarForce1212 frostHunterResourceThunderSolarForce1212) {
        FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705 = this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterFlowOnUltraInfernoThunder4489 frostHunterFlowOnUltraInfernoThunder4489 = frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterFlowOnUltraInfernoThunder4489 ? (FrostHunterFlowOnUltraInfernoThunder4489) frostHunterTraceCelestialVortexSpark6705 : null;
        FrostHunterDatabaseEliteShadowUltra2452(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761, (frostHunterFlowOnUltraInfernoThunder4489 != null ? frostHunterFlowOnUltraInfernoThunder4489.FrostHunterKeyframeGammaGamma1197 : null) == frostHunterResourceThunderSolarForce1212 ? 4 : this.FrostHunterAlertDialogAuroraDelta3200, null);
    }

    @Override // android.content.Context.FrostHunterInputFilterOmegaBeta3718
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLightSensorForceFusion4241;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof FrostHunterAdapterGammaQuantum7174) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Not completed");
                return;
            }
            if (obj instanceof FrostHunterImageViewTitaniumVision4682) {
                return;
            }
            if (!(obj instanceof FrostHunterSupervisorJobNeoSparkInferno8385)) {
                cancellationException2 = cancellationException;
                FrostHunterSupervisorJobNeoSparkInferno8385 frostHunterSupervisorJobNeoSparkInferno8385 = new FrostHunterSupervisorJobNeoSparkInferno8385(obj, (FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) null, (FrostHunterDragEventStormHyperion6109) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, frostHunterSupervisorJobNeoSparkInferno8385)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            FrostHunterSupervisorJobNeoSparkInferno8385 frostHunterSupervisorJobNeoSparkInferno83852 = (FrostHunterSupervisorJobNeoSparkInferno8385) obj;
            if (frostHunterSupervisorJobNeoSparkInferno83852.FrostHunterLifecycleBlazeGammaElite2889 != null) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Must be called at most once");
                return;
            }
            FrostHunterSupervisorJobNeoSparkInferno8385 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterSupervisorJobNeoSparkInferno8385.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterSupervisorJobNeoSparkInferno83852, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, FrostHunterAlphaAnimationNeoCosmos5761)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            FrostHunterRealtimeDatabaseGammaNebulaCosmos9536 frostHunterRealtimeDatabaseGammaNebulaCosmos9536 = frostHunterSupervisorJobNeoSparkInferno83852.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (frostHunterRealtimeDatabaseGammaNebulaCosmos9536 != null) {
                FrostHunterAlertDialogAuroraDelta3200(frostHunterRealtimeDatabaseGammaNebulaCosmos9536, cancellationException);
            }
            FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109 = frostHunterSupervisorJobNeoSparkInferno83852.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterDragEventStormHyperion6109 != null) {
                FrostHunterKeyframeGammaGamma1197(frostHunterDragEventStormHyperion6109, cancellationException, frostHunterSupervisorJobNeoSparkInferno83852.FrostHunterAlphaAnimationNeoCosmos5761);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    public final void FrostHunterDatabaseEliteShadowUltra2452(Object obj, int i, FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLightSensorForceFusion4241;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof FrostHunterAdapterGammaQuantum7174) {
                Object FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634((FrostHunterAdapterGammaQuantum7174) obj2, obj, i, frostHunterDragEventStormHyperion6109);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, FrostHunterViewPhantomNeo1634)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!FrostHunterBitmapTurboDeltaNebula8743()) {
                    FrostHunterLightSensorForceFusion4241();
                }
                FrostHunterScaleAnimationStrikeSpark5059(i);
                return;
            }
            if (obj2 instanceof FrostHunterSoundPoolThunderElite3205) {
                FrostHunterSoundPoolThunderElite3205 frostHunterSoundPoolThunderElite3205 = (FrostHunterSoundPoolThunderElite3205) obj2;
                if (FrostHunterSoundPoolThunderElite3205.FrostHunterBundlePulseFusionHero2475.compareAndSet(frostHunterSoundPoolThunderElite3205, 0, 1)) {
                    if (frostHunterDragEventStormHyperion6109 != null) {
                        FrostHunterKeyframeGammaGamma1197(frostHunterDragEventStormHyperion6109, frostHunterSoundPoolThunderElite3205.FrostHunterAlphaAnimationNeoCosmos5761, obj);
                        return;
                    }
                    return;
                }
            }
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterServiceEliteCelestialThunder1757(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void FrostHunterEditTextPulseHyperion1262() {
        FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705 = this.FrostHunterKeyframeGammaGamma1197;
        Throwable th = null;
        FrostHunterFlowOnUltraInfernoThunder4489 frostHunterFlowOnUltraInfernoThunder4489 = frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterFlowOnUltraInfernoThunder4489 ? (FrostHunterFlowOnUltraInfernoThunder4489) frostHunterTraceCelestialVortexSpark6705 : null;
        if (frostHunterFlowOnUltraInfernoThunder4489 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterFlowOnUltraInfernoThunder4489.FrostHunterScaleAnimationStrikeSpark5059;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(frostHunterFlowOnUltraInfernoThunder4489);
                FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterFragmentBetaMegaVortex6025;
                if (obj == frostHunterWorkManagerMaxTurbo1858) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(frostHunterFlowOnUltraInfernoThunder4489, frostHunterWorkManagerMaxTurbo1858, this)) {
                        if (atomicReferenceFieldUpdater.get(frostHunterFlowOnUltraInfernoThunder4489) != frostHunterWorkManagerMaxTurbo1858) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterServiceEliteCelestialThunder1757(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(frostHunterFlowOnUltraInfernoThunder4489, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(frostHunterFlowOnUltraInfernoThunder4489) != obj) {
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            FrostHunterLightSensorForceFusion4241();
            FrostHunterServiceConnectionTurboPhoenixOmega6719(th);
        }
    }

    public Throwable FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterDelayPhoenixRogueLegend5759 frostHunterDelayPhoenixRogueLegend5759) {
        return frostHunterDelayPhoenixRogueLegend5759.FrostHunterTextViewDragonStormMega4297();
    }

    @Override // android.content.Context.FrostHunterInputFilterOmegaBeta3718
    public final Object FrostHunterFlowMaxDragonHero5809() {
        return FrostHunterLightSensorForceFusion4241.get(this);
    }

    public final void FrostHunterFragmentBetaMegaVortex6025(FrostHunterAdapterSpectraVisionThunder5171 frostHunterAdapterSpectraVisionThunder5171, Throwable th) {
        FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615 = this.FrostHunterFragmentBetaMegaVortex6025;
        int i = FrostHunterServiceConnectionTurboPhoenixOmega6719.get(this) & 536870911;
        if (i == 536870911) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            frostHunterAdapterSpectraVisionThunder5171.FrostHunterRemoteConfigSpeedSpeed8566(i, frostHunterCountDownTimerRogueTitan5615);
        } catch (Throwable th2) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterStateCelestialNovaPixel8414(frostHunterCountDownTimerRogueTitan5615, new FrostHunterLinearLayoutSolarTurboSpark3070("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void FrostHunterKeyframeGammaGamma1197(FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109, Throwable th, Object obj) {
        FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615 = this.FrostHunterFragmentBetaMegaVortex6025;
        try {
            frostHunterDragEventStormHyperion6109.FrostHunterLevelListDrawableFusionDragonHero2232(th, obj, frostHunterCountDownTimerRogueTitan5615);
        } catch (Throwable th2) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterStateCelestialNovaPixel8414(frostHunterCountDownTimerRogueTitan5615, new FrostHunterLinearLayoutSolarTurboSpark3070("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // android.content.Context.FrostHunterInputFilterOmegaBeta3718
    public final Object FrostHunterLevelListDrawableFusionDragonHero2232(Object obj) {
        return obj instanceof FrostHunterSupervisorJobNeoSparkInferno8385 ? ((FrostHunterSupervisorJobNeoSparkInferno8385) obj).FrostHunterAlphaAnimationNeoCosmos5761 : obj;
    }

    @Override // android.content.Context.FrostHunterSQLiteNovaXCelestial9743
    public final FrostHunterSQLiteNovaXCelestial9743 FrostHunterLifecycleBlazeGammaElite2889() {
        FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705 = this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterSQLiteNovaXCelestial9743) {
            return (FrostHunterSQLiteNovaXCelestial9743) frostHunterTraceCelestialVortexSpark6705;
        }
        return null;
    }

    public final void FrostHunterLightSensorForceFusion4241() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterCoroutineScopeNeoMega4482 frostHunterCoroutineScopeNeoMega4482 = (FrostHunterCoroutineScopeNeoMega4482) atomicReferenceFieldUpdater.get(this);
        if (frostHunterCoroutineScopeNeoMega4482 == null) {
            return;
        }
        frostHunterCoroutineScopeNeoMega4482.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        atomicReferenceFieldUpdater.set(this, FrostHunterFCMNeoEliteAlpha2432.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final Object FrostHunterLintTitanVortexQuantum9911() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209;
        boolean FrostHunterBitmapTurboDeltaNebula8743 = FrostHunterBitmapTurboDeltaNebula8743();
        do {
            atomicIntegerFieldUpdater = FrostHunterServiceConnectionTurboPhoenixOmega6719;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Already suspended");
                    return null;
                }
                if (FrostHunterBitmapTurboDeltaNebula8743) {
                    FrostHunterEditTextPulseHyperion1262();
                }
                Object obj = FrostHunterLightSensorForceFusion4241.get(this);
                if (obj instanceof FrostHunterImageViewTitaniumVision4682) {
                    throw ((FrostHunterImageViewTitaniumVision4682) obj).FrostHunterAlphaAnimationNeoCosmos5761;
                }
                int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
                if ((i3 != 1 && i3 != 2) || (frostHunterContentObserverLegendUltraVortex4209 = (FrostHunterContentObserverLegendUltraVortex4209) this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterCardViewSpectraCyber7714)) == null || frostHunterContentObserverLegendUltraVortex4209.FrostHunterAlphaAnimationNeoCosmos5761()) {
                    return FrostHunterLevelListDrawableFusionDragonHero2232(obj);
                }
                CancellationException FrostHunterTextViewDragonStormMega4297 = frostHunterContentObserverLegendUltraVortex4209.FrostHunterTextViewDragonStormMega4297();
                FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterTextViewDragonStormMega4297);
                throw FrostHunterTextViewDragonStormMega4297;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((FrostHunterCoroutineScopeNeoMega4482) FrostHunterScaleAnimationStrikeSpark5059.get(this)) == null) {
            FrostHunterResourcesTitanHyperVision5823();
        }
        if (FrostHunterBitmapTurboDeltaNebula8743) {
            FrostHunterEditTextPulseHyperion1262();
        }
        return FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // android.content.Context.FrostHunterViewPagerTitanSolar4986
    public final void FrostHunterLooperHyperionForce4133(Object obj, FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109) {
        FrostHunterDatabaseEliteShadowUltra2452(obj, this.FrostHunterAlertDialogAuroraDelta3200, frostHunterDragEventStormHyperion6109);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        FrostHunterDialogFragmentTurboPhoenixDragon7627(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterLooperThreadBetaHyperionMax1000(FrostHunterAdapterGammaQuantum7174 frostHunterAdapterGammaQuantum7174) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLightSensorForceFusion4241;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof FrostHunterBroadcastReceiverVisionOlympian7097) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, frostHunterAdapterGammaQuantum7174)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) || (obj instanceof FrostHunterAdapterSpectraVisionThunder5171)) {
                break;
            }
            if (obj instanceof FrostHunterImageViewTitaniumVision4682) {
                FrostHunterImageViewTitaniumVision4682 frostHunterImageViewTitaniumVision4682 = (FrostHunterImageViewTitaniumVision4682) obj;
                if (!FrostHunterImageViewTitaniumVision4682.FrostHunterConstraintSetCloneMasterUltraRogue2633.compareAndSet(frostHunterImageViewTitaniumVision4682, 0, 1)) {
                    FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterAdapterGammaQuantum7174, obj);
                    throw null;
                }
                if (obj instanceof FrostHunterSoundPoolThunderElite3205) {
                    Throwable th = frostHunterImageViewTitaniumVision4682.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (frostHunterAdapterGammaQuantum7174 instanceof FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) {
                        FrostHunterAlertDialogAuroraDelta3200((FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) frostHunterAdapterGammaQuantum7174, th);
                        return;
                    } else {
                        FrostHunterFragmentBetaMegaVortex6025((FrostHunterAdapterSpectraVisionThunder5171) frostHunterAdapterGammaQuantum7174, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof FrostHunterSupervisorJobNeoSparkInferno8385)) {
                if (frostHunterAdapterGammaQuantum7174 instanceof FrostHunterAdapterSpectraVisionThunder5171) {
                    return;
                }
                FrostHunterSupervisorJobNeoSparkInferno8385 frostHunterSupervisorJobNeoSparkInferno8385 = new FrostHunterSupervisorJobNeoSparkInferno8385(obj, (FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) frostHunterAdapterGammaQuantum7174, (FrostHunterDragEventStormHyperion6109) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, frostHunterSupervisorJobNeoSparkInferno8385)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            FrostHunterSupervisorJobNeoSparkInferno8385 frostHunterSupervisorJobNeoSparkInferno83852 = (FrostHunterSupervisorJobNeoSparkInferno8385) obj;
            if (frostHunterSupervisorJobNeoSparkInferno83852.FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
                FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterAdapterGammaQuantum7174, obj);
                throw null;
            }
            if (frostHunterAdapterGammaQuantum7174 instanceof FrostHunterAdapterSpectraVisionThunder5171) {
                return;
            }
            FrostHunterRealtimeDatabaseGammaNebulaCosmos9536 frostHunterRealtimeDatabaseGammaNebulaCosmos9536 = (FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) frostHunterAdapterGammaQuantum7174;
            Throwable th2 = frostHunterSupervisorJobNeoSparkInferno83852.FrostHunterLifecycleBlazeGammaElite2889;
            if (th2 != null) {
                FrostHunterAlertDialogAuroraDelta3200(frostHunterRealtimeDatabaseGammaNebulaCosmos9536, th2);
                return;
            }
            FrostHunterSupervisorJobNeoSparkInferno8385 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterSupervisorJobNeoSparkInferno8385.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterSupervisorJobNeoSparkInferno83852, frostHunterRealtimeDatabaseGammaNebulaCosmos9536, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, FrostHunterAlphaAnimationNeoCosmos5761)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public String FrostHunterMeteringPointBetaCyber9571() {
        return "CancellableContinuation";
    }

    @Override // android.content.Context.FrostHunterViewPagerTitanSolar4986
    public final FrostHunterWorkManagerMaxTurbo1858 FrostHunterMotionSceneAuroraMega2271(Object obj, FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109) {
        FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterCanvasInfernoVortex4700.FrostHunterAlphaAnimationNeoCosmos5761;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLightSensorForceFusion4241;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof FrostHunterAdapterGammaQuantum7174)) {
                return null;
            }
            Object FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634((FrostHunterAdapterGammaQuantum7174) obj2, obj, this.FrostHunterAlertDialogAuroraDelta3200, frostHunterDragEventStormHyperion6109);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, FrostHunterViewPhantomNeo1634)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!FrostHunterBitmapTurboDeltaNebula8743()) {
                FrostHunterLightSensorForceFusion4241();
            }
            return frostHunterWorkManagerMaxTurbo1858;
        }
    }

    @Override // android.content.Context.FrostHunterTraceCelestialVortexSpark6705
    public final void FrostHunterRemoteConfigSpeedSpeed8566(Object obj) {
        Throwable FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterProximitySensorLegendAuroraPrime1541.FrostHunterAlphaAnimationNeoCosmos5761(obj);
        if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
            obj = new FrostHunterImageViewTitaniumVision4682(FrostHunterAlphaAnimationNeoCosmos5761, false);
        }
        FrostHunterDatabaseEliteShadowUltra2452(obj, this.FrostHunterAlertDialogAuroraDelta3200, null);
    }

    public final FrostHunterCoroutineScopeNeoMega4482 FrostHunterResourcesTitanHyperVision5823() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209 = (FrostHunterContentObserverLegendUltraVortex4209) this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterCardViewSpectraCyber7714);
        if (frostHunterContentObserverLegendUltraVortex4209 == null) {
            return null;
        }
        FrostHunterCoroutineScopeNeoMega4482 FrostHunterBitmapTurboDeltaNebula8743 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterBitmapTurboDeltaNebula8743(frostHunterContentObserverLegendUltraVortex4209, true, new FrostHunterResourcesForceSparkCosmos1550(this, 0));
        do {
            atomicReferenceFieldUpdater = FrostHunterScaleAnimationStrikeSpark5059;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, FrostHunterBitmapTurboDeltaNebula8743)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return FrostHunterBitmapTurboDeltaNebula8743;
    }

    public final void FrostHunterScaleAnimationStrikeSpark5059(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = FrostHunterServiceConnectionTurboPhoenixOmega6719;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Already resumed");
                    return;
                }
                boolean z = i == 4;
                FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705 = this.FrostHunterKeyframeGammaGamma1197;
                if (!z && (frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterFlowOnUltraInfernoThunder4489)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.FrostHunterAlertDialogAuroraDelta3200;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        FrostHunterFlowOnUltraInfernoThunder4489 frostHunterFlowOnUltraInfernoThunder4489 = (FrostHunterFlowOnUltraInfernoThunder4489) frostHunterTraceCelestialVortexSpark6705;
                        FrostHunterResourceThunderSolarForce1212 frostHunterResourceThunderSolarForce1212 = frostHunterFlowOnUltraInfernoThunder4489.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterCountDownTimerRogueTitan5615 context = frostHunterFlowOnUltraInfernoThunder4489.FrostHunterFragmentBetaMegaVortex6025.getContext();
                        if (FrostHunterBindingAdapterSpeedNeo6677.FrostHunterMagnetometerFusionTitanium8202(frostHunterResourceThunderSolarForce1212, context)) {
                            FrostHunterBindingAdapterSpeedNeo6677.FrostHunterStateCelestialNovaPixel8414(frostHunterResourceThunderSolarForce1212, context, this);
                            return;
                        }
                        FrostHunterOnLongClickListenerBlazeFusionFusion2658 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterDrawableRogueCelestial1881.FrostHunterAlphaAnimationNeoCosmos5761();
                        if (FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200 >= 4294967296L) {
                            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMagnetometerFusionTitanium8202(this);
                            return;
                        }
                        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterPagingDataTurboTitanium7332(true);
                        try {
                            FrostHunterCardViewHyperionAurora3829.FrostHunterPreviewBlazeAurora1020(this, frostHunterTraceCelestialVortexSpark6705, true);
                            do {
                            } while (FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFCMDeltaQuantumHero8364());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                FrostHunterCardViewHyperionAurora3829.FrostHunterPreviewBlazeAurora1020(this, frostHunterTraceCelestialVortexSpark6705, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // android.content.Context.FrostHunterViewPagerTitanSolar4986
    public final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLightSensorForceFusion4241;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof FrostHunterAdapterGammaQuantum7174)) {
                return false;
            }
            boolean z = (obj instanceof FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) || (obj instanceof FrostHunterAdapterSpectraVisionThunder5171);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            FrostHunterSoundPoolThunderElite3205 frostHunterSoundPoolThunderElite3205 = new FrostHunterSoundPoolThunderElite3205(th2, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, frostHunterSoundPoolThunderElite3205)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            FrostHunterAdapterGammaQuantum7174 frostHunterAdapterGammaQuantum7174 = (FrostHunterAdapterGammaQuantum7174) obj;
            if (frostHunterAdapterGammaQuantum7174 instanceof FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) {
                FrostHunterAlertDialogAuroraDelta3200((FrostHunterRealtimeDatabaseGammaNebulaCosmos9536) obj, th);
            } else if (frostHunterAdapterGammaQuantum7174 instanceof FrostHunterAdapterSpectraVisionThunder5171) {
                FrostHunterFragmentBetaMegaVortex6025((FrostHunterAdapterSpectraVisionThunder5171) obj, th);
            }
            if (!FrostHunterBitmapTurboDeltaNebula8743()) {
                FrostHunterLightSensorForceFusion4241();
            }
            FrostHunterScaleAnimationStrikeSpark5059(this.FrostHunterAlertDialogAuroraDelta3200);
            return true;
        }
    }

    @Override // android.content.Context.FrostHunterInputFilterOmegaBeta3718
    public final Throwable FrostHunterServiceEliteCelestialThunder1757(Object obj) {
        Throwable FrostHunterServiceEliteCelestialThunder1757 = super.FrostHunterServiceEliteCelestialThunder1757(obj);
        if (FrostHunterServiceEliteCelestialThunder1757 != null) {
            return FrostHunterServiceEliteCelestialThunder1757;
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterViewPagerTitanSolar4986
    public final void FrostHunterServiceInfoHyperionSparkMax9966(Object obj) {
        FrostHunterScaleAnimationStrikeSpark5059(this.FrostHunterAlertDialogAuroraDelta3200);
    }

    public final void FrostHunterTextViewDragonStormMega4297(FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473) {
        FrostHunterLooperThreadBetaHyperionMax1000(new FrostHunterRealtimeDatabaseGammaNebulaCosmos9536(1, frostHunterCombineLegendMegaPrime5473));
    }

    @Override // android.content.Context.FrostHunterTraceCelestialVortexSpark6705
    public final FrostHunterCountDownTimerRogueTitan5615 getContext() {
        return this.FrostHunterFragmentBetaMegaVortex6025;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FrostHunterMeteringPointBetaCyber9571());
        sb.append('(');
        sb.append(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRemoteConfigThunderShadow4435(this.FrostHunterKeyframeGammaGamma1197));
        sb.append("){");
        Object obj = FrostHunterLightSensorForceFusion4241.get(this);
        sb.append(obj instanceof FrostHunterAdapterGammaQuantum7174 ? "Active" : obj instanceof FrostHunterSoundPoolThunderElite3205 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterDatabaseEliteShadowUltra2452(this));
        return sb.toString();
    }
}
