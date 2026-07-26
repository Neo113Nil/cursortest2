package android.content.Context;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCountDownTimerOlympianPhoenix8555 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterCountDownTimerOlympianPhoenix8555.class, "workerCtl$volatile");
    public FrostHunterOnItemClickListenerSolarThunderHero8227 FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterToastCosmosSolar2390 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterVibratorMegaNovaX1236 FrostHunterFlowMaxDragonHero5809;
    public long FrostHunterFragmentBetaMegaVortex6025;
    public long FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterLightSensorForceFusion4241;
    public final /* synthetic */ FrostHunterGradlePluginEclipseNovaUltra7602 FrostHunterScaleAnimationStrikeSpark5059;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public FrostHunterCountDownTimerOlympianPhoenix8555(FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra7602, int i) {
        this.FrostHunterScaleAnimationStrikeSpark5059 = frostHunterGradlePluginEclipseNovaUltra7602;
        setDaemon(true);
        setContextClassLoader(FrostHunterGradlePluginEclipseNovaUltra7602.class.getClassLoader());
        this.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterToastCosmosSolar2390();
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterVibratorMegaNovaX1236();
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterKeyframeGammaGamma1197;
        this.nextParkedWorker = FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterCameraXTurboCelestialHero5430;
        int nanoTime = (int) System.nanoTime();
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = nanoTime == 0 ? 42 : nanoTime;
        FrostHunterLevelListDrawableFusionDragonHero2232(i);
    }

    public final FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterAlphaAnimationNeoCosmos5761(boolean z) {
        FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterLifecycleBlazeGammaElite28892;
        long j;
        FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero8227 = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra7602 = this.FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel3775 = null;
        FrostHunterToastCosmosSolar2390 frostHunterToastCosmosSolar2390 = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero82272 = FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterOnItemClickListenerSolarThunderHero8227 != frostHunterOnItemClickListenerSolarThunderHero82272) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            do {
                j = atomicLongFieldUpdater.get(frostHunterGradlePluginEclipseNovaUltra7602);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    frostHunterToastCosmosSolar2390.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37752 = (FrostHunterLiveDataHyperionVisionPixel3775) atomicReferenceFieldUpdater.get(frostHunterToastCosmosSolar2390);
                        if (frostHunterLiveDataHyperionVisionPixel37752 != null && frostHunterLiveDataHyperionVisionPixel37752.FrostHunterFlowMaxDragonHero5809) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(frostHunterToastCosmosSolar2390, frostHunterLiveDataHyperionVisionPixel37752, null)) {
                                if (atomicReferenceFieldUpdater.get(frostHunterToastCosmosSolar2390) != frostHunterLiveDataHyperionVisionPixel37752) {
                                    break;
                                }
                            }
                            frostHunterLiveDataHyperionVisionPixel3775 = frostHunterLiveDataHyperionVisionPixel37752;
                            break loop1;
                        }
                    }
                    int i = FrostHunterToastCosmosSolar2390.FrostHunterServiceEliteCelestialThunder1757.get(frostHunterToastCosmosSolar2390);
                    int i2 = FrostHunterToastCosmosSolar2390.FrostHunterBundlePulseFusionHero2475.get(frostHunterToastCosmosSolar2390);
                    while (true) {
                        if (i == i2 || FrostHunterToastCosmosSolar2390.FrostHunterLifecycleBlazeGammaElite2889.get(frostHunterToastCosmosSolar2390) == 0) {
                            break;
                        }
                        i2--;
                        FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterBundlePulseFusionHero2475 = frostHunterToastCosmosSolar2390.FrostHunterBundlePulseFusionHero2475(i2, true);
                        if (FrostHunterBundlePulseFusionHero2475 != null) {
                            frostHunterLiveDataHyperionVisionPixel3775 = FrostHunterBundlePulseFusionHero2475;
                            break;
                        }
                    }
                    if (frostHunterLiveDataHyperionVisionPixel3775 != null) {
                        return frostHunterLiveDataHyperionVisionPixel3775;
                    }
                    FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37753 = (FrostHunterLiveDataHyperionVisionPixel3775) frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterServiceEliteCelestialThunder1757();
                    return frostHunterLiveDataHyperionVisionPixel37753 == null ? FrostHunterFlowMaxDragonHero5809(1) : frostHunterLiveDataHyperionVisionPixel37753;
                }
            } while (!FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.compareAndSet(frostHunterGradlePluginEclipseNovaUltra7602, j, j - 4398046511104L));
            this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterOnItemClickListenerSolarThunderHero82272;
        }
        if (z) {
            boolean z2 = FrostHunterServiceEliteCelestialThunder1757(frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterCameraXPixelTurboCosmos9814 * 2) == 0;
            if (z2 && (FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterLifecycleBlazeGammaElite2889()) != null) {
                return FrostHunterLifecycleBlazeGammaElite28892;
            }
            frostHunterToastCosmosSolar2390.getClass();
            FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37754 = (FrostHunterLiveDataHyperionVisionPixel3775) FrostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633.getAndSet(frostHunterToastCosmosSolar2390, null);
            if (frostHunterLiveDataHyperionVisionPixel37754 == null) {
                frostHunterLiveDataHyperionVisionPixel37754 = frostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
            if (frostHunterLiveDataHyperionVisionPixel37754 != null) {
                return frostHunterLiveDataHyperionVisionPixel37754;
            }
            if (!z2 && (FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889()) != null) {
                return FrostHunterLifecycleBlazeGammaElite2889;
            }
        } else {
            FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterLifecycleBlazeGammaElite28893 = FrostHunterLifecycleBlazeGammaElite2889();
            if (FrostHunterLifecycleBlazeGammaElite28893 != null) {
                return FrostHunterLifecycleBlazeGammaElite28893;
            }
        }
        return FrostHunterFlowMaxDragonHero5809(3);
    }

    public final Object FrostHunterBundlePulseFusionHero2475() {
        return this.nextParkedWorker;
    }

    public final boolean FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero8227) {
        FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero82272 = this.FrostHunterAlertDialogAuroraDelta3200;
        boolean z = frostHunterOnItemClickListenerSolarThunderHero82272 == FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterCameraXPixelTurboCosmos9814;
        if (z) {
            FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.addAndGet(this.FrostHunterScaleAnimationStrikeSpark5059, 4398046511104L);
        }
        if (frostHunterOnItemClickListenerSolarThunderHero82272 != frostHunterOnItemClickListenerSolarThunderHero8227) {
            this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterOnItemClickListenerSolarThunderHero8227;
        }
        return z;
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this.indexInArray;
    }

    public final FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterFlowMaxDragonHero5809(int i) {
        long j;
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel3775;
        long j2;
        long j3;
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37752;
        AtomicLongFieldUpdater atomicLongFieldUpdater = FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra7602 = this.FrostHunterScaleAnimationStrikeSpark5059;
        int i2 = (int) (atomicLongFieldUpdater.get(frostHunterGradlePluginEclipseNovaUltra7602) & 2097151);
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37753 = null;
        if (i2 < 2) {
            return null;
        }
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(i2);
        int i3 = 0;
        long j4 = Long.MAX_VALUE;
        while (i3 < i2) {
            FrostHunterServiceEliteCelestialThunder1757++;
            if (FrostHunterServiceEliteCelestialThunder1757 > i2) {
                FrostHunterServiceEliteCelestialThunder1757 = 1;
            }
            FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555 = (FrostHunterCountDownTimerOlympianPhoenix8555) frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterLightSensorForceFusion4241.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder1757);
            if (frostHunterCountDownTimerOlympianPhoenix8555 != null && frostHunterCountDownTimerOlympianPhoenix8555 != this) {
                FrostHunterToastCosmosSolar2390 frostHunterToastCosmosSolar2390 = frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterCameraXPixelTurboCosmos9814;
                if (i == 3) {
                    frostHunterLiveDataHyperionVisionPixel3775 = frostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    j = 0;
                } else {
                    frostHunterToastCosmosSolar2390.getClass();
                    int i4 = FrostHunterToastCosmosSolar2390.FrostHunterServiceEliteCelestialThunder1757.get(frostHunterToastCosmosSolar2390);
                    int i5 = FrostHunterToastCosmosSolar2390.FrostHunterBundlePulseFusionHero2475.get(frostHunterToastCosmosSolar2390);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || FrostHunterToastCosmosSolar2390.FrostHunterLifecycleBlazeGammaElite2889.get(frostHunterToastCosmosSolar2390) != 0) {
                            int i6 = i4 + 1;
                            frostHunterLiveDataHyperionVisionPixel3775 = frostHunterToastCosmosSolar2390.FrostHunterBundlePulseFusionHero2475(i4, z);
                            if (frostHunterLiveDataHyperionVisionPixel3775 != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    frostHunterLiveDataHyperionVisionPixel3775 = frostHunterLiveDataHyperionVisionPixel37753;
                }
                FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX1236 = this.FrostHunterFlowMaxDragonHero5809;
                if (frostHunterLiveDataHyperionVisionPixel3775 != null) {
                    frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterLiveDataHyperionVisionPixel3775;
                    frostHunterLiveDataHyperionVisionPixel37752 = frostHunterLiveDataHyperionVisionPixel37753;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterToastCosmosSolar2390.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37754 = (FrostHunterLiveDataHyperionVisionPixel3775) atomicReferenceFieldUpdater.get(frostHunterToastCosmosSolar2390);
                        if (frostHunterLiveDataHyperionVisionPixel37754 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((frostHunterLiveDataHyperionVisionPixel37754.FrostHunterFlowMaxDragonHero5809 ? 1 : 2) & i) == 0) {
                            break;
                        }
                        FrostHunterServiceConnectionHeroSpeedHyper2872.FrostHunterLevelListDrawableFusionDragonHero2232.getClass();
                        FrostHunterToastCosmosSolar2390 frostHunterToastCosmosSolar23902 = frostHunterToastCosmosSolar2390;
                        long nanoTime = System.nanoTime() - frostHunterLiveDataHyperionVisionPixel37754.FrostHunterCameraXPixelTurboCosmos9814;
                        long j5 = FrostHunterServiceConnectionHeroSpeedHyper2872.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            frostHunterLiveDataHyperionVisionPixel37752 = null;
                            break;
                        }
                        do {
                            frostHunterLiveDataHyperionVisionPixel37752 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(frostHunterToastCosmosSolar23902, frostHunterLiveDataHyperionVisionPixel37754, null)) {
                                frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterLiveDataHyperionVisionPixel37754;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(frostHunterToastCosmosSolar23902) == frostHunterLiveDataHyperionVisionPixel37754);
                        frostHunterToastCosmosSolar2390 = frostHunterToastCosmosSolar23902;
                        frostHunterLiveDataHyperionVisionPixel37753 = null;
                    }
                    j3 = -2;
                    frostHunterLiveDataHyperionVisionPixel37752 = frostHunterLiveDataHyperionVisionPixel37753;
                }
                if (j3 == j2) {
                    FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37755 = (FrostHunterLiveDataHyperionVisionPixel3775) frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814;
                    frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterLiveDataHyperionVisionPixel37752;
                    return frostHunterLiveDataHyperionVisionPixel37755;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            frostHunterLiveDataHyperionVisionPixel37753 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.FrostHunterFragmentBetaMegaVortex6025 = j4;
        return null;
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterKeyframeGammaGamma1197);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterLifecycleBlazeGammaElite2889() {
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(2);
        FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra7602 = this.FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterAnimationNebulaThunder2370 frostHunterAnimationNebulaThunder2370 = frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        FrostHunterAnimationNebulaThunder2370 frostHunterAnimationNebulaThunder23702 = frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFragmentBetaMegaVortex6025;
        if (FrostHunterServiceEliteCelestialThunder1757 == 0) {
            FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel3775 = (FrostHunterLiveDataHyperionVisionPixel3775) frostHunterAnimationNebulaThunder23702.FrostHunterServiceEliteCelestialThunder1757();
            return frostHunterLiveDataHyperionVisionPixel3775 != null ? frostHunterLiveDataHyperionVisionPixel3775 : (FrostHunterLiveDataHyperionVisionPixel3775) frostHunterAnimationNebulaThunder2370.FrostHunterServiceEliteCelestialThunder1757();
        }
        FrostHunterLiveDataHyperionVisionPixel3775 frostHunterLiveDataHyperionVisionPixel37752 = (FrostHunterLiveDataHyperionVisionPixel3775) frostHunterAnimationNebulaThunder2370.FrostHunterServiceEliteCelestialThunder1757();
        return frostHunterLiveDataHyperionVisionPixel37752 != null ? frostHunterLiveDataHyperionVisionPixel37752 : (FrostHunterLiveDataHyperionVisionPixel3775) frostHunterAnimationNebulaThunder23702.FrostHunterServiceEliteCelestialThunder1757();
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final int FrostHunterServiceEliteCelestialThunder1757(int i) {
        int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterLintTitanVortexQuantum9911.get(this.FrostHunterScaleAnimationStrikeSpark5059) != 1) {
                FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero8227 = this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero82272 = FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterFragmentBetaMegaVortex6025;
                if (frostHunterOnItemClickListenerSolarThunderHero8227 == frostHunterOnItemClickListenerSolarThunderHero82272) {
                    break loop0;
                }
                FrostHunterLiveDataHyperionVisionPixel3775 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterLightSensorForceFusion4241);
                if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                    this.FrostHunterFragmentBetaMegaVortex6025 = 0L;
                    FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra7602 = this.FrostHunterScaleAnimationStrikeSpark5059;
                    this.FrostHunterKeyframeGammaGamma1197 = 0L;
                    if (this.FrostHunterAlertDialogAuroraDelta3200 == FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterAlertDialogAuroraDelta3200) {
                        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterFlowMaxDragonHero5809;
                    }
                    if (FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809) {
                        if (FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterFlowMaxDragonHero5809) && !frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterAlertDialogAuroraDelta3200() && !frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFlowMaxDragonHero5809(FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(frostHunterGradlePluginEclipseNovaUltra7602))) {
                            frostHunterGradlePluginEclipseNovaUltra7602.FrostHunterAlertDialogAuroraDelta3200();
                        }
                        try {
                            FrostHunterAlphaAnimationNeoCosmos5761.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.addAndGet(frostHunterGradlePluginEclipseNovaUltra7602, -2097152L);
                        if (this.FrostHunterAlertDialogAuroraDelta3200 != frostHunterOnItemClickListenerSolarThunderHero82272) {
                            this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterKeyframeGammaGamma1197;
                        }
                    } else {
                        try {
                            FrostHunterAlphaAnimationNeoCosmos5761.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.FrostHunterLightSensorForceFusion4241 = false;
                    if (this.FrostHunterFragmentBetaMegaVortex6025 == 0) {
                        Object obj = this.nextParkedWorker;
                        FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterCameraXTurboCelestialHero5430;
                        if (obj != frostHunterWorkManagerMaxTurbo1858) {
                            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.set(this, -1);
                            while (this.nextParkedWorker != FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterCameraXTurboCelestialHero5430) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra76022 = this.FrostHunterScaleAnimationStrikeSpark5059;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterLintTitanVortexQuantum9911;
                                    if (atomicIntegerFieldUpdater2.get(frostHunterGradlePluginEclipseNovaUltra76022) == 1) {
                                        break;
                                    }
                                    FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero82273 = this.FrostHunterAlertDialogAuroraDelta3200;
                                    FrostHunterOnItemClickListenerSolarThunderHero8227 frostHunterOnItemClickListenerSolarThunderHero82274 = FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterFragmentBetaMegaVortex6025;
                                    if (frostHunterOnItemClickListenerSolarThunderHero82273 == frostHunterOnItemClickListenerSolarThunderHero82274) {
                                        break;
                                    }
                                    FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterAlertDialogAuroraDelta3200);
                                    Thread.interrupted();
                                    if (this.FrostHunterKeyframeGammaGamma1197 == 0) {
                                        j = 2097151;
                                        this.FrostHunterKeyframeGammaGamma1197 = System.nanoTime() + this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlertDialogAuroraDelta3200;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlertDialogAuroraDelta3200);
                                    if (System.nanoTime() - this.FrostHunterKeyframeGammaGamma1197 >= 0) {
                                        this.FrostHunterKeyframeGammaGamma1197 = 0L;
                                        FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra76023 = this.FrostHunterScaleAnimationStrikeSpark5059;
                                        synchronized (frostHunterGradlePluginEclipseNovaUltra76023.FrostHunterLightSensorForceFusion4241) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(frostHunterGradlePluginEclipseNovaUltra76023) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                                                    if (((int) (atomicLongFieldUpdater.get(frostHunterGradlePluginEclipseNovaUltra76023) & j)) > frostHunterGradlePluginEclipseNovaUltra76023.FrostHunterCameraXPixelTurboCosmos9814) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            FrostHunterLevelListDrawableFusionDragonHero2232(0);
                                                            frostHunterGradlePluginEclipseNovaUltra76023.FrostHunterCameraXPixelTurboCosmos9814(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(frostHunterGradlePluginEclipseNovaUltra76023) & j);
                                                            if (andDecrement != i) {
                                                                Object FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterGradlePluginEclipseNovaUltra76023.FrostHunterLightSensorForceFusion4241.FrostHunterConstraintSetCloneMasterUltraRogue2633(andDecrement);
                                                                FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                                                                FrostHunterCountDownTimerOlympianPhoenix8555 frostHunterCountDownTimerOlympianPhoenix8555 = (FrostHunterCountDownTimerOlympianPhoenix8555) FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                                                frostHunterGradlePluginEclipseNovaUltra76023.FrostHunterLightSensorForceFusion4241.FrostHunterBundlePulseFusionHero2475(i, frostHunterCountDownTimerOlympianPhoenix8555);
                                                                frostHunterCountDownTimerOlympianPhoenix8555.FrostHunterLevelListDrawableFusionDragonHero2232(i);
                                                                frostHunterGradlePluginEclipseNovaUltra76023.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCountDownTimerOlympianPhoenix8555, andDecrement, i);
                                                            }
                                                            frostHunterGradlePluginEclipseNovaUltra76023.FrostHunterLightSensorForceFusion4241.FrostHunterBundlePulseFusionHero2475(andDecrement, null);
                                                            this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterOnItemClickListenerSolarThunderHero82274;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra76024 = this.FrostHunterScaleAnimationStrikeSpark5059;
                            if (this.nextParkedWorker == frostHunterWorkManagerMaxTurbo1858) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterScaleAnimationStrikeSpark5059;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(frostHunterGradlePluginEclipseNovaUltra76024);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = frostHunterGradlePluginEclipseNovaUltra76024.FrostHunterLightSensorForceFusion4241.FrostHunterConstraintSetCloneMasterUltraRogue2633((int) (j2 & 2097151));
                                    FrostHunterGradlePluginEclipseNovaUltra7602 frostHunterGradlePluginEclipseNovaUltra76025 = frostHunterGradlePluginEclipseNovaUltra76024;
                                    if (FrostHunterGradlePluginEclipseNovaUltra7602.FrostHunterScaleAnimationStrikeSpark5059.compareAndSet(frostHunterGradlePluginEclipseNovaUltra76025, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        frostHunterGradlePluginEclipseNovaUltra76024 = frostHunterGradlePluginEclipseNovaUltra76025;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterAlertDialogAuroraDelta3200);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.FrostHunterFragmentBetaMegaVortex6025);
                        this.FrostHunterFragmentBetaMegaVortex6025 = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnItemClickListenerSolarThunderHero8227.FrostHunterFragmentBetaMegaVortex6025);
    }
}
