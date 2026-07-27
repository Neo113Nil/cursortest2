package android.content.Context;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterNavigationSparkNeoTitan8957 extends FrostHunterAsyncSparkInferno6218 implements FrostHunterPushNotificationPhoenixOlympian6533 {
    public final Executor FrostHunterAlertDialogAuroraDelta3200;

    public FrostHunterNavigationSparkNeoTitan8957(Executor executor) {
        Method method;
        this.FrostHunterAlertDialogAuroraDelta3200 = executor;
        Method method2 = FrostHunterFlipAnimationSparkHyper5926.FrostHunterAlphaAnimationNeoCosmos5761;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = FrostHunterFlipAnimationSparkHyper5926.FrostHunterAlphaAnimationNeoCosmos5761) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.Context.FrostHunterPushNotificationPhoenixOlympian6533
    public final void FrostHunterDatabaseEliteShadowUltra2452(long j, FrostHunterSQLiteUltraElite7894 frostHunterSQLiteUltraElite7894) {
        Executor executor = this.FrostHunterAlertDialogAuroraDelta3200;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        boolean z = false;
        Object[] objArr = 0;
        if (scheduledExecutorService != null) {
            FrostHunterActivityRogueFusionRogue5543 frostHunterActivityRogueFusionRogue5543 = new FrostHunterActivityRogueFusionRogue5543(22, this, frostHunterSQLiteUltraElite7894, z);
            FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615 = frostHunterSQLiteUltraElite7894.FrostHunterFragmentBetaMegaVortex6025;
            try {
                scheduledFuture = scheduledExecutorService.schedule(frostHunterActivityRogueFusionRogue5543, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                FrostHunterBindingAdapterSpeedNeo6677.FrostHunterAlertDialogAuroraDelta3200(frostHunterCountDownTimerRogueTitan5615, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            frostHunterSQLiteUltraElite7894.FrostHunterLooperThreadBetaHyperionMax1000(new FrostHunterRealtimeDatabaseGammaNebulaCosmos9536(objArr == true ? 1 : 0, scheduledFuture));
        } else {
            FrostHunterMeteringPointEclipseGammaSolar6263.FrostHunterLintTitanVortexQuantum9911.FrostHunterDatabaseEliteShadowUltra2452(j, frostHunterSQLiteUltraElite7894);
        }
    }

    @Override // android.content.Context.FrostHunterPushNotificationPhoenixOlympian6533
    public final FrostHunterCoroutineScopeNeoMega4482 FrostHunterFlowMaxDragonHero5809(long j, FrostHunterButtonStrikeThunderSolar3297 frostHunterButtonStrikeThunderSolar3297, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        Executor executor = this.FrostHunterAlertDialogAuroraDelta3200;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(frostHunterButtonStrikeThunderSolar3297, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                FrostHunterBindingAdapterSpeedNeo6677.FrostHunterAlertDialogAuroraDelta3200(frostHunterCountDownTimerRogueTitan5615, cancellationException);
            }
        }
        return scheduledFuture != null ? new FrostHunterDrawableCelestialFusionSpeed6970(scheduledFuture) : FrostHunterMeteringPointEclipseGammaSolar6263.FrostHunterLintTitanVortexQuantum9911.FrostHunterFlowMaxDragonHero5809(j, frostHunterButtonStrikeThunderSolar3297, frostHunterCountDownTimerRogueTitan5615);
    }

    @Override // android.content.Context.FrostHunterResourceThunderSolarForce1212
    public final void FrostHunterMeteringPointMegaCyber7955(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Runnable runnable) {
        try {
            this.FrostHunterAlertDialogAuroraDelta3200.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            FrostHunterBindingAdapterSpeedNeo6677.FrostHunterAlertDialogAuroraDelta3200(frostHunterCountDownTimerRogueTitan5615, cancellationException);
            FrostHunterFragmentTransactionBetaUltra7746 frostHunterFragmentTransactionBetaUltra7746 = FrostHunterInsetDrawableOmegaForce2390.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterColorStateListOlympianHyperion9583.FrostHunterAlertDialogAuroraDelta3200.FrostHunterMeteringPointMegaCyber7955(frostHunterCountDownTimerRogueTitan5615, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.FrostHunterAlertDialogAuroraDelta3200;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FrostHunterNavigationSparkNeoTitan8957) && ((FrostHunterNavigationSparkNeoTitan8957) obj).FrostHunterAlertDialogAuroraDelta3200 == this.FrostHunterAlertDialogAuroraDelta3200;
    }

    public final int hashCode() {
        return System.identityHashCode(this.FrostHunterAlertDialogAuroraDelta3200);
    }

    @Override // android.content.Context.FrostHunterResourceThunderSolarForce1212
    public final String toString() {
        return this.FrostHunterAlertDialogAuroraDelta3200.toString();
    }
}
