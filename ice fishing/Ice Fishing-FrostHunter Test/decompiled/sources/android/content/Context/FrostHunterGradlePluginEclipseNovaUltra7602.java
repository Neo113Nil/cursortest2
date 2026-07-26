package android.content.Context;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGradlePluginEclipseNovaUltra7602 implements Executor, Closeable {
    public final long FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterAnimationNebulaThunder2370 FrostHunterFragmentBetaMegaVortex6025;
    public final String FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterLicensingAuroraGamma3507 FrostHunterLightSensorForceFusion4241;
    public final FrostHunterAnimationNebulaThunder2370 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater FrostHunterScaleAnimationStrikeSpark5059 = AtomicLongFieldUpdater.newUpdater(FrostHunterGradlePluginEclipseNovaUltra7602.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = AtomicLongFieldUpdater.newUpdater(FrostHunterGradlePluginEclipseNovaUltra7602.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterLintTitanVortexQuantum9911 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterGradlePluginEclipseNovaUltra7602.class, "_isTerminated$volatile");
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterWorkManagerMaxTurbo1858("NOT_IN_STACK", 3);

    public FrostHunterGradlePluginEclipseNovaUltra7602(int i, int i2, long j, String str) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = i2;
        this.FrostHunterAlertDialogAuroraDelta3200 = j;
        this.FrostHunterKeyframeGammaGamma1197 = str;
        if (i < 1) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterAnimationNebulaThunder2370();
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterAnimationNebulaThunder2370();
        this.FrostHunterLightSensorForceFusion4241 = new FrostHunterLicensingAuroraGamma3507((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public static /* synthetic */ void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra7602, Runnable runnable, int i) {
        frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterServiceEliteCelestialThunder1757(runnable, false, (i & 4) == 0);
    }

    public final boolean FrostHunterAlertDialogAuroraDelta3200() {
        FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra7602;
        FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858;
        int i;
        while (true) {
            long j = FrostHunterScaleAnimationStrikeSpark5059.get(this);
            FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555 = (FrostHunterCountDownTimerOlympianPhoenix8555) this.FrostHunterLightSensorForceFusion4241.FrostHunterConstraintSetCloneMasterUltraRogue2633((int) (2097151 & j));
            if (frostHunterCountDownTimerOlympianPhoenix8555 == null) {
                frostHunterCountDownTimerOlympianPhoenix8555 = null;
                frostHunterGradlePluginEclipseNovaUltra7602 = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object FrostHunterBundlePulseFusionHero2475 = frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterBundlePulseFusionHero2475();
                while (true) {
                    frostHunterWorkManagerMaxTurbo1858 = FrostHunterCameraXTurboCelestialHero5430;
                    if (FrostHunterBundlePulseFusionHero2475 == frostHunterWorkManagerMaxTurbo1858) {
                        i = -1;
                        break;
                    }
                    if (FrostHunterBundlePulseFusionHero2475 == null) {
                        i = 0;
                        break;
                    }
                    FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix85552 = (FrostHunterCountDownTimerOlympianPhoenix8555) FrostHunterBundlePulseFusionHero2475;
                    i = frostHunterCountDownTimerOlympianPhoenix85552.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    if (i != 0) {
                        break;
                    }
                    FrostHunterBundlePulseFusionHero2475 = frostHunterCountDownTimerOlympianPhoenix85552.FrostHunterBundlePulseFusionHero2475();
                    j = j;
                }
                if (i >= 0) {
                    FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra76022 = this;
                    boolean compareAndSet = FrostHunterScaleAnimationStrikeSpark5059.compareAndSet(frostHunterGradlePluginEclipseNovaUltra76022, j, i | j2);
                    frostHunterGradlePluginEclipseNovaUltra7602 = frostHunterGradlePluginEclipseNovaUltra76022;
                    if (compareAndSet) {
                        frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterWorkManagerMaxTurbo1858);
                    }
                    this = frostHunterGradlePluginEclipseNovaUltra7602;
                } else {
                    continue;
                }
            }
            if (frostHunterCountDownTimerOlympianPhoenix8555 == null) {
                return false;
            }
            if (FrostHunterCountDownTimerOlympianPhoenix8555.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.compareAndSet(frostHunterCountDownTimerOlympianPhoenix8555, -1, 0)) {
                LockSupport.unpark(frostHunterCountDownTimerOlympianPhoenix8555);
                return true;
            }
            this = frostHunterGradlePluginEclipseNovaUltra7602;
        }
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        synchronized (this.FrostHunterLightSensorForceFusion4241) {
            try {
                if (FrostHunterLintTitanVortexQuantum9911.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.FrostHunterCameraXPixelTurboCosmos9814) {
                    return 0;
                }
                if (i >= this.FrostHunterFlowMaxDragonHero5809) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.FrostHunterLightSensorForceFusion4241.FrostHunterConstraintSetCloneMasterUltraRogue2633(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555 = new FrostHunterCountDownTimerOlympianPhoenix8555(this, i3);
                this.FrostHunterLightSensorForceFusion4241.FrostHunterBundlePulseFusionHero2475(i3, frostHunterCountDownTimerOlympianPhoenix8555);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                frostHunterCountDownTimerOlympianPhoenix8555.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555, int i, int i2) {
        while (true) {
            long j = FrostHunterScaleAnimationStrikeSpark5059.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object FrostHunterBundlePulseFusionHero2475 = frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterBundlePulseFusionHero2475();
                    while (true) {
                        if (FrostHunterBundlePulseFusionHero2475 == FrostHunterCameraXTurboCelestialHero5430) {
                            i3 = -1;
                            break;
                        }
                        if (FrostHunterBundlePulseFusionHero2475 == null) {
                            i3 = 0;
                            break;
                        }
                        FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix85552 = (FrostHunterCountDownTimerOlympianPhoenix8555) FrostHunterBundlePulseFusionHero2475;
                        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterCountDownTimerOlympianPhoenix85552.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != 0) {
                            i3 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            break;
                        }
                        FrostHunterBundlePulseFusionHero2475 = frostHunterCountDownTimerOlympianPhoenix85552.FrostHunterBundlePulseFusionHero2475();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra7602 = this;
                if (FrostHunterScaleAnimationStrikeSpark5059.compareAndSet(frostHunterGradlePluginEclipseNovaUltra7602, j, i3 | j2)) {
                    return;
                } else {
                    this = frostHunterGradlePluginEclipseNovaUltra7602;
                }
            }
        }
    }

    public final boolean FrostHunterFlowMaxDragonHero5809(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i < i2) {
            int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
            if (FrostHunterAlphaAnimationNeoCosmos5761 == 1 && i2 > 1) {
                FrostHunterAlphaAnimationNeoCosmos5761();
            }
            if (FrostHunterAlphaAnimationNeoCosmos5761 > 0) {
                return true;
            }
        }
        return false;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(Runnable runnable, boolean z, boolean z2) {
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterPaintDeltaMax4526;
        FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero8227;
        FrostHunterServiceConnectionHeroSpeedHyper2872.FrostHunterLevelListDrawableFusionDragonHero2232.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof FrostHunterLiveDataHyperionVisionPixel3775) {
            frostHunterPaintDeltaMax4526 = (FrostHunterLiveDataHyperionVisionPixel3775) runnable;
            frostHunterPaintDeltaMax4526.FrostHunterCameraXPixelTurboCosmos9814 = nanoTime;
            frostHunterPaintDeltaMax4526.FrostHunterFlowMaxDragonHero5809 = z;
        } else {
            frostHunterPaintDeltaMax4526 = new FrostHunterPaintDeltaMax4526(runnable, nanoTime, z);
        }
        boolean z3 = frostHunterPaintDeltaMax4526.FrostHunterFlowMaxDragonHero5809;
        AtomicLongFieldUpdater atomicLongFieldUpdater = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555 = currentThread instanceof FrostHunterCountDownTimerOlympianPhoenix8555 ? (FrostHunterCountDownTimerOlympianPhoenix8555) currentThread : null;
        if (frostHunterCountDownTimerOlympianPhoenix8555 == null || frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterScaleAnimationStrikeSpark5059 != this) {
            frostHunterCountDownTimerOlympianPhoenix8555 = null;
        }
        if (frostHunterCountDownTimerOlympianPhoenix8555 != null && (frostHunterOnItemClickListenerSolarThunderHero8227 = frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterAlertDialogAuroraDelta3200) != FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterFragmentBetaMegaVortex6025 && (frostHunterPaintDeltaMax4526.FrostHunterFlowMaxDragonHero5809 || frostHunterOnItemClickListenerSolarThunderHero8227 != FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterFlowMaxDragonHero5809)) {
            frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterLightSensorForceFusion4241 = true;
            FrostHunterToastCosmosSolar2390 frostHunterToastCosmosSolar2390 = frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterCameraXPixelTurboCosmos9814;
            if (z2) {
                frostHunterPaintDeltaMax4526 = frostHunterToastCosmosSolar2390.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPaintDeltaMax4526);
            } else {
                frostHunterToastCosmosSolar2390.getClass();
                FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel3775 = (FrostHunterLiveDataHyperionVisionPixel3775) FrostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633.getAndSet(frostHunterToastCosmosSolar2390, frostHunterPaintDeltaMax4526);
                frostHunterPaintDeltaMax4526 = frostHunterLiveDataHyperionVisionPixel3775 == null ? null : frostHunterToastCosmosSolar2390.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLiveDataHyperionVisionPixel3775);
            }
        }
        if (frostHunterPaintDeltaMax4526 != null) {
            if (!(frostHunterPaintDeltaMax4526.FrostHunterFlowMaxDragonHero5809 ? this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPaintDeltaMax4526) : this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPaintDeltaMax4526))) {
                throw new RejectedExecutionException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), this.FrostHunterKeyframeGammaGamma1197, " was terminated"));
            }
        }
        if (z3) {
            if (FrostHunterAlertDialogAuroraDelta3200() || FrostHunterFlowMaxDragonHero5809(addAndGet)) {
                return;
            }
            FrostHunterAlertDialogAuroraDelta3200();
            return;
        }
        if (FrostHunterAlertDialogAuroraDelta3200() || FrostHunterFlowMaxDragonHero5809(atomicLongFieldUpdater.get(this))) {
            return;
        }
        FrostHunterAlertDialogAuroraDelta3200();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel3775;
        if (FrostHunterLintTitanVortexQuantum9911.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555 = currentThread instanceof FrostHunterCountDownTimerOlympianPhoenix8555 ? (FrostHunterCountDownTimerOlympianPhoenix8555) currentThread : null;
            if (frostHunterCountDownTimerOlympianPhoenix8555 == null || frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterScaleAnimationStrikeSpark5059 != this) {
                frostHunterCountDownTimerOlympianPhoenix8555 = null;
            }
            synchronized (this.FrostHunterLightSensorForceFusion4241) {
                i = (int) (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object FrostHunterConstraintSetCloneMasterUltraRogue2633 = this.FrostHunterLightSensorForceFusion4241.FrostHunterConstraintSetCloneMasterUltraRogue2633(i2);
                    FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                    FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix85552 = (FrostHunterCountDownTimerOlympianPhoenix8555) FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (frostHunterCountDownTimerOlympianPhoenix85552 != frostHunterCountDownTimerOlympianPhoenix8555) {
                        while (frostHunterCountDownTimerOlympianPhoenix85552.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(frostHunterCountDownTimerOlympianPhoenix85552);
                            frostHunterCountDownTimerOlympianPhoenix85552.join(10000L);
                        }
                        FrostHunterToastCosmosSolar2390 frostHunterToastCosmosSolar2390 = frostHunterCountDownTimerOlympianPhoenix85552.FrostHunterCameraXPixelTurboCosmos9814;
                        FrostHunterAnimationNebulaThunder2370 frostHunterAnimationNebulaThunder2370 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        frostHunterToastCosmosSolar2390.getClass();
                        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37752 = (FrostHunterLiveDataHyperionVisionPixel3775) FrostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633.getAndSet(frostHunterToastCosmosSolar2390, null);
                        if (frostHunterLiveDataHyperionVisionPixel37752 != null) {
                            frostHunterAnimationNebulaThunder2370.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLiveDataHyperionVisionPixel37752);
                        }
                        while (true) {
                            FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                            if (FrostHunterConstraintSetCloneMasterUltraRogue26332 == null) {
                                break;
                            } else {
                                frostHunterAnimationNebulaThunder2370.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26332);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            while (true) {
                if (frostHunterCountDownTimerOlympianPhoenix8555 != null) {
                    frostHunterLiveDataHyperionVisionPixel3775 = frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterAlphaAnimationNeoCosmos5761(true);
                }
                frostHunterLiveDataHyperionVisionPixel3775 = (FrostHunterLiveDataHyperionVisionPixel3775) this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterServiceEliteCelestialThunder1757();
                if (frostHunterLiveDataHyperionVisionPixel3775 == null && (frostHunterLiveDataHyperionVisionPixel3775 = (FrostHunterLiveDataHyperionVisionPixel3775) this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterServiceEliteCelestialThunder1757()) == null) {
                    break;
                }
                try {
                    frostHunterLiveDataHyperionVisionPixel3775.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (frostHunterCountDownTimerOlympianPhoenix8555 != null) {
                frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterFragmentBetaMegaVortex6025);
            }
            FrostHunterScaleAnimationStrikeSpark5059.set(this, 0L);
            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        FrostHunterLevelListDrawableFusionDragonHero2232(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FrostHunterLicensingAuroraGamma3507 frostHunterLicensingAuroraGamma3507 = this.FrostHunterLightSensorForceFusion4241;
        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLicensingAuroraGamma3507.FrostHunterAlphaAnimationNeoCosmos5761();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < FrostHunterAlphaAnimationNeoCosmos5761; i6++) {
            FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555 = (FrostHunterCountDownTimerOlympianPhoenix8555) frostHunterLicensingAuroraGamma3507.FrostHunterConstraintSetCloneMasterUltraRogue2633(i6);
            if (frostHunterCountDownTimerOlympianPhoenix8555 != null) {
                FrostHunterToastCosmosSolar2390 frostHunterToastCosmosSolar2390 = frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterCameraXPixelTurboCosmos9814;
                frostHunterToastCosmosSolar2390.getClass();
                int i7 = FrostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(frostHunterToastCosmosSolar2390) != null ? (FrostHunterToastCosmosSolar2390.FrostHunterBundlePulseFusionHero2475.get(frostHunterToastCosmosSolar2390) - FrostHunterToastCosmosSolar2390.FrostHunterServiceEliteCelestialThunder1757.get(frostHunterToastCosmosSolar2390)) + 1 : FrostHunterToastCosmosSolar2390.FrostHunterBundlePulseFusionHero2475.get(frostHunterToastCosmosSolar2390) - FrostHunterToastCosmosSolar2390.FrostHunterServiceEliteCelestialThunder1757.get(frostHunterToastCosmosSolar2390);
                int ordinal = frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterAlertDialogAuroraDelta3200.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.FrostHunterKeyframeGammaGamma1197);
        sb4.append('@');
        sb4.append(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterDatabaseEliteShadowUltra2452(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.FrostHunterCameraXPixelTurboCosmos9814;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.FrostHunterFlowMaxDragonHero5809);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterBundlePulseFusionHero2475());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
