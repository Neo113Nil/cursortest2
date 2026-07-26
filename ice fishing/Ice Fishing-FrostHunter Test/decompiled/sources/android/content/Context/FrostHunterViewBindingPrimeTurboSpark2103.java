package android.content.Context;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterViewBindingPrimeTurboSpark2103 extends FrostHunterOnLongClickListenerBlazeFusionFusion2658 implements FrostHunterPushNotificationPhoenixOlympian6533 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterLightSensorForceFusion4241 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterViewBindingPrimeTurboSpark2103.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterScaleAnimationStrikeSpark5059 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterViewBindingPrimeTurboSpark2103.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterViewBindingPrimeTurboSpark2103.class, "_isCompleted$volatile");

    @Override // android.content.Context.FrostHunterPushNotificationPhoenixOlympian6533
    public final void FrostHunterDatabaseEliteShadowUltra2452(long j, FrostHunterSQLiteUltraElite7894 frostHunterSQLiteUltraElite7894) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            FrostHunterCameraXLegendLegend5387 frostHunterCameraXLegendLegend5387 = new FrostHunterCameraXLegendLegend5387(this, j2 + nanoTime, frostHunterSQLiteUltraElite7894);
            FrostHunterRemoteConfigThunderShadow4435(nanoTime, frostHunterCameraXLegendLegend5387);
            frostHunterSQLiteUltraElite7894.FrostHunterLooperThreadBetaHyperionMax1000(new FrostHunterRealtimeDatabaseGammaNebulaCosmos9536(2, frostHunterCameraXLegendLegend5387));
        }
    }

    public FrostHunterCoroutineScopeNeoMega4482 FrostHunterFlowMaxDragonHero5809(long j, FrostHunterButtonStrikeThunderSolar3297 frostHunterButtonStrikeThunderSolar3297, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        return FrostHunterViewBindingSpeedPixelSpark4156.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809(j, frostHunterButtonStrikeThunderSolar3297, frostHunterCountDownTimerRogueTitan5615);
    }

    @Override // android.content.Context.FrostHunterResourceThunderSolarForce1212
    public final void FrostHunterMeteringPointMegaCyber7955(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Runnable runnable) {
        FrostHunterRewardedAdMasterStrike9463(runnable);
    }

    public abstract Thread FrostHunterNavigationMasterMegaMax2752();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterPagingSourceEclipseDelta8255(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLightSensorForceFusion4241;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof FrostHunterFlowOnNovaXBetaPrime6639)) {
                        if (obj != FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceEliteCelestialThunder1757) {
                            FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime6639 = new FrostHunterFlowOnNovaXBetaPrime6639(8, true);
                            frostHunterFlowOnNovaXBetaPrime6639.FrostHunterAlphaAnimationNeoCosmos5761((Runnable) obj);
                            frostHunterFlowOnNovaXBetaPrime6639.FrostHunterAlphaAnimationNeoCosmos5761(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, frostHunterFlowOnNovaXBetaPrime6639)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime66392 = (FrostHunterFlowOnNovaXBetaPrime6639) obj;
                    int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFlowOnNovaXBetaPrime66392.FrostHunterAlphaAnimationNeoCosmos5761(runnable);
                    if (FrostHunterAlphaAnimationNeoCosmos5761 == 0) {
                        break;
                    }
                    if (FrostHunterAlphaAnimationNeoCosmos5761 == 1) {
                        FrostHunterFlowOnNovaXBetaPrime6639 FrostHunterBundlePulseFusionHero2475 = frostHunterFlowOnNovaXBetaPrime66392.FrostHunterBundlePulseFusionHero2475();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, FrostHunterBundlePulseFusionHero2475) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (FrostHunterAlphaAnimationNeoCosmos5761 == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
    }

    public final void FrostHunterPermissionInfoAlphaDelta6279() {
        FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296;
        FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora3363 = (FrostHunterVectorDrawableNovaAurora3363) FrostHunterScaleAnimationStrikeSpark5059.get(this);
        if (frostHunterVectorDrawableNovaAurora3363 == null || FrostHunterRunnableFusionInfernoSolar5363.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(frostHunterVectorDrawableNovaAurora3363) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (frostHunterVectorDrawableNovaAurora3363) {
                try {
                    FrostHunterGradientDrawableBetaVortex4296[] frostHunterGradientDrawableBetaVortex4296Arr = frostHunterVectorDrawableNovaAurora3363.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex42962 = frostHunterGradientDrawableBetaVortex4296Arr != null ? frostHunterGradientDrawableBetaVortex4296Arr[0] : null;
                    if (frostHunterGradientDrawableBetaVortex42962 != null) {
                        frostHunterGradientDrawableBetaVortex4296 = ((nanoTime - frostHunterGradientDrawableBetaVortex42962.FrostHunterCameraXPixelTurboCosmos9814) > 0L ? 1 : ((nanoTime - frostHunterGradientDrawableBetaVortex42962.FrostHunterCameraXPixelTurboCosmos9814) == 0L ? 0 : -1)) >= 0 ? FrostHunterPagingSourceEclipseDelta8255(frostHunterGradientDrawableBetaVortex42962) : false ? frostHunterVectorDrawableNovaAurora3363.FrostHunterConstraintSetCloneMasterUltraRogue2633(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (frostHunterGradientDrawableBetaVortex4296 != null);
    }

    @Override // android.content.Context.FrostHunterOnLongClickListenerBlazeFusionFusion2658
    public final long FrostHunterR8MasterNebulaSpark7247() {
        Runnable runnable;
        FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296;
        FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceEliteCelestialThunder1757;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLightSensorForceFusion4241;
        if (!FrostHunterFCMDeltaQuantumHero8364()) {
            FrostHunterPermissionInfoAlphaDelta6279();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof FrostHunterFlowOnNovaXBetaPrime6639)) {
                    if (obj != frostHunterWorkManagerMaxTurbo1858) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime6639 = (FrostHunterFlowOnNovaXBetaPrime6639) obj;
                Object FrostHunterServiceEliteCelestialThunder1757 = frostHunterFlowOnNovaXBetaPrime6639.FrostHunterServiceEliteCelestialThunder1757();
                if (FrostHunterServiceEliteCelestialThunder1757 != FrostHunterFlowOnNovaXBetaPrime6639.FrostHunterRemoteConfigSpeedSpeed8566) {
                    runnable = (Runnable) FrostHunterServiceEliteCelestialThunder1757;
                    break;
                }
                FrostHunterFlowOnNovaXBetaPrime6639 FrostHunterBundlePulseFusionHero2475 = frostHunterFlowOnNovaXBetaPrime6639.FrostHunterBundlePulseFusionHero2475();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, FrostHunterBundlePulseFusionHero2475) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            FrostHunterAccelerometerNeoAurora1913 frostHunterAccelerometerNeoAurora1913 = this.FrostHunterFragmentBetaMegaVortex6025;
            if (((frostHunterAccelerometerNeoAurora1913 == null || frostHunterAccelerometerNeoAurora1913.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof FrostHunterFlowOnNovaXBetaPrime6639) {
                        long j = FrostHunterFlowOnNovaXBetaPrime6639.FrostHunterLevelListDrawableFusionDragonHero2232.get((FrostHunterFlowOnNovaXBetaPrime6639) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == frostHunterWorkManagerMaxTurbo1858) {
                        return Long.MAX_VALUE;
                    }
                }
                FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora3363 = (FrostHunterVectorDrawableNovaAurora3363) FrostHunterScaleAnimationStrikeSpark5059.get(this);
                if (frostHunterVectorDrawableNovaAurora3363 != null) {
                    synchronized (frostHunterVectorDrawableNovaAurora3363) {
                        FrostHunterGradientDrawableBetaVortex4296[] frostHunterGradientDrawableBetaVortex4296Arr = frostHunterVectorDrawableNovaAurora3363.FrostHunterAlphaAnimationNeoCosmos5761;
                        frostHunterGradientDrawableBetaVortex4296 = frostHunterGradientDrawableBetaVortex4296Arr != null ? frostHunterGradientDrawableBetaVortex4296Arr[0] : null;
                    }
                    if (frostHunterGradientDrawableBetaVortex4296 != null) {
                        long nanoTime = frostHunterGradientDrawableBetaVortex4296.FrostHunterCameraXPixelTurboCosmos9814 - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public final void FrostHunterRemoteConfigThunderShadow4435(long j, FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296) {
        int FrostHunterAlphaAnimationNeoCosmos5761;
        Thread FrostHunterNavigationMasterMegaMax2752;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterScaleAnimationStrikeSpark5059;
        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(this) == 1) {
            FrostHunterAlphaAnimationNeoCosmos5761 = 1;
        } else {
            FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora3363 = (FrostHunterVectorDrawableNovaAurora3363) atomicReferenceFieldUpdater.get(this);
            if (frostHunterVectorDrawableNovaAurora3363 == null) {
                FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora33632 = new FrostHunterVectorDrawableNovaAurora3363();
                frostHunterVectorDrawableNovaAurora33632.FrostHunterBundlePulseFusionHero2475 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, frostHunterVectorDrawableNovaAurora33632) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                frostHunterVectorDrawableNovaAurora3363 = (FrostHunterVectorDrawableNovaAurora3363) obj;
            }
            FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterGradientDrawableBetaVortex4296.FrostHunterAlphaAnimationNeoCosmos5761(j, frostHunterVectorDrawableNovaAurora3363, this);
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761 != 0) {
            if (FrostHunterAlphaAnimationNeoCosmos5761 == 1) {
                FrostHunterRewardedAdSpectraElite8288(j, frostHunterGradientDrawableBetaVortex4296);
                return;
            } else {
                if (FrostHunterAlphaAnimationNeoCosmos5761 == 2) {
                    return;
                }
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("unexpected result");
                return;
            }
        }
        FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora33633 = (FrostHunterVectorDrawableNovaAurora3363) atomicReferenceFieldUpdater.get(this);
        if (frostHunterVectorDrawableNovaAurora33633 != null) {
            synchronized (frostHunterVectorDrawableNovaAurora33633) {
                FrostHunterGradientDrawableBetaVortex4296[] frostHunterGradientDrawableBetaVortex4296Arr = frostHunterVectorDrawableNovaAurora33633.FrostHunterAlphaAnimationNeoCosmos5761;
                r2 = frostHunterGradientDrawableBetaVortex4296Arr != null ? frostHunterGradientDrawableBetaVortex4296Arr[0] : null;
            }
        }
        if (r2 != frostHunterGradientDrawableBetaVortex4296 || Thread.currentThread() == (FrostHunterNavigationMasterMegaMax2752 = FrostHunterNavigationMasterMegaMax2752())) {
            return;
        }
        LockSupport.unpark(FrostHunterNavigationMasterMegaMax2752);
    }

    public void FrostHunterRewardedAdMasterStrike9463(Runnable runnable) {
        FrostHunterPermissionInfoAlphaDelta6279();
        if (!FrostHunterPagingSourceEclipseDelta8255(runnable)) {
            FrostHunterMeteringPointEclipseGammaSolar6263.FrostHunterLintTitanVortexQuantum9911.FrostHunterRewardedAdMasterStrike9463(runnable);
            return;
        }
        Thread FrostHunterNavigationMasterMegaMax2752 = FrostHunterNavigationMasterMegaMax2752();
        if (Thread.currentThread() != FrostHunterNavigationMasterMegaMax2752) {
            LockSupport.unpark(FrostHunterNavigationMasterMegaMax2752);
        }
    }

    public void FrostHunterRewardedAdSpectraElite8288(long j, FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296) {
        FrostHunterMeteringPointEclipseGammaSolar6263.FrostHunterLintTitanVortexQuantum9911.FrostHunterRemoteConfigThunderShadow4435(j, frostHunterGradientDrawableBetaVortex4296);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((android.content.Context.FrostHunterRunnableFusionInfernoSolar5363.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterTransitionListenerPulseVortexCosmos7949() {
        FrostHunterAccelerometerNeoAurora1913 frostHunterAccelerometerNeoAurora1913 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterAccelerometerNeoAurora1913 != null ? frostHunterAccelerometerNeoAurora1913.isEmpty() : true) {
            FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora3363 = (FrostHunterVectorDrawableNovaAurora3363) FrostHunterScaleAnimationStrikeSpark5059.get(this);
            if (frostHunterVectorDrawableNovaAurora3363 != null) {
            }
            Object obj = FrostHunterLightSensorForceFusion4241.get(this);
            if (obj != null) {
                if (obj instanceof FrostHunterFlowOnNovaXBetaPrime6639) {
                    long j = FrostHunterFlowOnNovaXBetaPrime6639.FrostHunterLevelListDrawableFusionDragonHero2232.get((FrostHunterFlowOnNovaXBetaPrime6639) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceEliteCelestialThunder1757) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.content.Context.FrostHunterOnLongClickListenerBlazeFusionFusion2658
    public void shutdown() {
        FrostHunterGradientDrawableBetaVortex4296 FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterDrawableRogueCelestial1881.FrostHunterAlphaAnimationNeoCosmos5761.set(null);
        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.set(this, 1);
        FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceEliteCelestialThunder1757;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLightSensorForceFusion4241;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof FrostHunterFlowOnNovaXBetaPrime6639)) {
                    if (obj != frostHunterWorkManagerMaxTurbo1858) {
                        FrostHunterFlowOnNovaXBetaPrime6639 frostHunterFlowOnNovaXBetaPrime6639 = new FrostHunterFlowOnNovaXBetaPrime6639(8, true);
                        frostHunterFlowOnNovaXBetaPrime6639.FrostHunterAlphaAnimationNeoCosmos5761((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, frostHunterFlowOnNovaXBetaPrime6639)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((FrostHunterFlowOnNovaXBetaPrime6639) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, frostHunterWorkManagerMaxTurbo1858)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (FrostHunterR8MasterNebulaSpark7247() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora3363 = (FrostHunterVectorDrawableNovaAurora3363) FrostHunterScaleAnimationStrikeSpark5059.get(this);
            if (frostHunterVectorDrawableNovaAurora3363 == null) {
                return;
            }
            synchronized (frostHunterVectorDrawableNovaAurora3363) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterRunnableFusionInfernoSolar5363.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(frostHunterVectorDrawableNovaAurora3363) > 0 ? frostHunterVectorDrawableNovaAurora3363.FrostHunterConstraintSetCloneMasterUltraRogue2633(0) : null;
            }
            if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                return;
            } else {
                FrostHunterRewardedAdSpectraElite8288(nanoTime, FrostHunterConstraintSetCloneMasterUltraRogue2633);
            }
        }
    }
}
