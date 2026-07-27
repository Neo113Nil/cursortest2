package kotlin.text;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishGradleMVP extends CatchingFishMVIFirebaseHilt implements CatchingFishRealmAndroidX {
    public final Executor CatchingFishWorkManager;

    public CatchingFishGradleMVP(Executor executor) {
        this.CatchingFishWorkManager = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final void CatchingFishCardViewView(CatchingFishManifestMockk catchingFishManifestMockk, Runnable runnable) {
        try {
            this.CatchingFishWorkManager.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout);
            if (catchingFishRoomViewGson != null) {
                catchingFishRoomViewGson.CatchingFishCoroutine(cancellationException);
            }
            CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
            CatchingFishViewRetrofit.CatchingFishWorkManager.CatchingFishCardViewView(catchingFishManifestMockk, runnable);
        }
    }

    @Override // kotlin.text.CatchingFishRealmAndroidX
    public final void CatchingFishParcelableFlux(long j, CatchingFishKtorMockk catchingFishKtorMockk) {
        Executor executor = this.CatchingFishWorkManager;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            CatchingFishService catchingFishService = new CatchingFishService(28, this, catchingFishKtorMockk, false);
            CatchingFishManifestMockk catchingFishManifestMockk = catchingFishKtorMockk.CatchingFishViewModelFAB;
            try {
                scheduledFuture = scheduledExecutorService.schedule(catchingFishService, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout);
                if (catchingFishRoomViewGson != null) {
                    catchingFishRoomViewGson.CatchingFishCoroutine(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            catchingFishKtorMockk.CatchingFishSpannableWidget(new CatchingFishDaggerKtor(0, scheduledFuture));
        } else {
            CatchingFishViewGlide.CatchingFishOkHttp.CatchingFishParcelableFlux(j, catchingFishKtorMockk);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.CatchingFishWorkManager;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CatchingFishGradleMVP) && ((CatchingFishGradleMVP) obj).CatchingFishWorkManager == this.CatchingFishWorkManager;
    }

    public final int hashCode() {
        return System.identityHashCode(this.CatchingFishWorkManager);
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final String toString() {
        return this.CatchingFishWorkManager.toString();
    }
}
