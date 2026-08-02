package app.cash.redwood.treehouse;

import android.view.Choreographer;
import androidx.camera.camera2.pipe.internal.FrameImpl;
import app.cash.redwood.protocol.host.VersionKt;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$rotateDragFlow$2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class RealAppLifecycleHost implements AppLifecycle$Host {
    public final AppLifecycle$Companion$Adapter$GeneratedOutboundService appLifecycle;
    public final ZiplineCodeSession codeSession;
    public final SVG eventPublisher;
    public final FrameImpl frameClock;

    public RealAppLifecycleHost(AppLifecycle$Companion$Adapter$GeneratedOutboundService appLifecycle$Companion$Adapter$GeneratedOutboundService, FrameImpl frameImpl, SVG svg, ZiplineCodeSession ziplineCodeSession) {
        ziplineCodeSession.getClass();
        this.appLifecycle = appLifecycle$Companion$Adapter$GeneratedOutboundService;
        this.frameClock = frameImpl;
        this.eventPublisher = svg;
        this.codeSession = ziplineCodeSession;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        Object obj = this.frameClock;
        if (obj instanceof AutoCloseable) {
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return;
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    /* renamed from: getHostProtocolVersion-7jYel6c */
    public final String mo1388getHostProtocolVersion7jYel6c() {
        return VersionKt.hostRedwoodVersion;
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    public final void handleUncaughtException(Throwable th) {
        this.codeSession.handleUncaughtException(th);
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    /* renamed from: onUnknownEvent-_LM6m-c */
    public final void mo1389onUnknownEvent_LM6mc(int i, int i2) {
        EventListener eventListener = (EventListener) this.eventPublisher.rootElement;
        eventListener.getClass();
        eventListener.mo1392unknownEvent_LM6mc(i, i2);
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    /* renamed from: onUnknownEventNode-1ccMwuE */
    public final void mo1390onUnknownEventNode1ccMwuE(int i, int i2) {
        EventListener eventListener = (EventListener) this.eventPublisher.rootElement;
        eventListener.getClass();
        eventListener.mo1393unknownEventNode1ccMwuE(i, i2);
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    public final void requestFrame() {
        final FrameImpl frameImpl = this.frameClock;
        Choreographer choreographer = (Choreographer) frameImpl.frameState;
        final AppLifecycle$Companion$Adapter$GeneratedOutboundService appLifecycle$Companion$Adapter$GeneratedOutboundService = this.appLifecycle;
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: app.cash.redwood.treehouse.AndroidChoreographerFrameClock$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                FrameImpl frameImpl2 = FrameImpl.this;
                JobKt.launch$default((CoroutineScope) frameImpl2.imageStreams, ((AndroidTreehouseDispatchers) frameImpl2.closed).zipline, null, new Hero3DCardViewKt$rotateDragFlow$2(appLifecycle$Companion$Adapter$GeneratedOutboundService, j, null, 2), 2);
            }
        });
    }
}
