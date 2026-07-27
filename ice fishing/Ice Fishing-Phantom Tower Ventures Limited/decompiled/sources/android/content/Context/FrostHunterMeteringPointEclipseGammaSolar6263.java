package android.content.Context;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMeteringPointEclipseGammaSolar6263 extends FrostHunterViewBindingPrimeTurboSpark2103 implements Runnable {
    public static final long FrostHunterCameraXTurboCelestialHero5430;
    public static final FrostHunterMeteringPointEclipseGammaSolar6263 FrostHunterLintTitanVortexQuantum9911;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        FrostHunterMeteringPointEclipseGammaSolar6263 frostHunterMeteringPointEclipseGammaSolar6263 = new FrostHunterMeteringPointEclipseGammaSolar6263();
        FrostHunterLintTitanVortexQuantum9911 = frostHunterMeteringPointEclipseGammaSolar6263;
        frostHunterMeteringPointEclipseGammaSolar6263.FrostHunterPagingDataTurboTitanium7332(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        FrostHunterCameraXTurboCelestialHero5430 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // android.content.Context.FrostHunterViewBindingPrimeTurboSpark2103, android.content.Context.FrostHunterPushNotificationPhoenixOlympian6533
    public final FrostHunterCoroutineScopeNeoMega4482 FrostHunterFlowMaxDragonHero5809(long j, FrostHunterButtonStrikeThunderSolar3297 frostHunterButtonStrikeThunderSolar3297, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return FrostHunterFCMNeoEliteAlpha2432.FrostHunterCameraXPixelTurboCosmos9814;
        }
        long nanoTime = System.nanoTime();
        FrostHunterCardViewUltraEliteThunder1407 frostHunterCardViewUltraEliteThunder1407 = new FrostHunterCardViewUltraEliteThunder1407(j2 + nanoTime, frostHunterButtonStrikeThunderSolar3297);
        FrostHunterRemoteConfigThunderShadow4435(nanoTime, frostHunterCardViewUltraEliteThunder1407);
        return frostHunterCardViewUltraEliteThunder1407;
    }

    @Override // android.content.Context.FrostHunterViewBindingPrimeTurboSpark2103
    public final Thread FrostHunterNavigationMasterMegaMax2752() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(FrostHunterLintTitanVortexQuantum9911.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    public final synchronized void FrostHunterPushNotificationStormTitanGamma8999() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            FrostHunterViewBindingPrimeTurboSpark2103.FrostHunterLightSensorForceFusion4241.set(this, null);
            FrostHunterViewBindingPrimeTurboSpark2103.FrostHunterScaleAnimationStrikeSpark5059.set(this, null);
            notifyAll();
        }
    }

    @Override // android.content.Context.FrostHunterViewBindingPrimeTurboSpark2103
    public final void FrostHunterRewardedAdMasterStrike9463(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.FrostHunterRewardedAdMasterStrike9463(runnable);
    }

    @Override // android.content.Context.FrostHunterViewBindingPrimeTurboSpark2103
    public final void FrostHunterRewardedAdSpectraElite8288(long j, FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean FrostHunterTransitionListenerPulseVortexCosmos7949;
        FrostHunterDrawableRogueCelestial1881.FrostHunterAlphaAnimationNeoCosmos5761.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (FrostHunterTransitionListenerPulseVortexCosmos7949) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long FrostHunterR8MasterNebulaSpark7247 = FrostHunterR8MasterNebulaSpark7247();
                    if (FrostHunterR8MasterNebulaSpark7247 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = FrostHunterCameraXTurboCelestialHero5430 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            FrostHunterPushNotificationStormTitanGamma8999();
                            if (FrostHunterTransitionListenerPulseVortexCosmos7949()) {
                                return;
                            }
                            FrostHunterNavigationMasterMegaMax2752();
                            return;
                        }
                        if (FrostHunterR8MasterNebulaSpark7247 > j2) {
                            FrostHunterR8MasterNebulaSpark7247 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (FrostHunterR8MasterNebulaSpark7247 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            FrostHunterPushNotificationStormTitanGamma8999();
                            if (FrostHunterTransitionListenerPulseVortexCosmos7949()) {
                                return;
                            }
                            FrostHunterNavigationMasterMegaMax2752();
                            return;
                        }
                        LockSupport.parkNanos(this, FrostHunterR8MasterNebulaSpark7247);
                    }
                }
            }
        } finally {
            _thread = null;
            FrostHunterPushNotificationStormTitanGamma8999();
            if (!FrostHunterTransitionListenerPulseVortexCosmos7949()) {
                FrostHunterNavigationMasterMegaMax2752();
            }
        }
    }

    @Override // android.content.Context.FrostHunterViewBindingPrimeTurboSpark2103, android.content.Context.FrostHunterOnLongClickListenerBlazeFusionFusion2658
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // android.content.Context.FrostHunterResourceThunderSolarForce1212
    public final String toString() {
        return "DefaultExecutor";
    }
}
