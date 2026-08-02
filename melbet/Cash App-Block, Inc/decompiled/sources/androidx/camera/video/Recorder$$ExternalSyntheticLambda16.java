package androidx.camera.video;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.core.view.ContentInfoCompat;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import com.google.common.util.concurrent.ListenableFuture;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.core.MibiData;
import kotlin.Result;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda16 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda16(Recorder recorder, SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = recorder;
        this.f$1 = surfaceRequest;
        this.f$2 = timebase;
        this.f$3 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object failure;
        switch (this.$r8$classId) {
            case 0:
                Recorder recorder = (Recorder) this.f$0;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f$1;
                Timebase timebase = (Timebase) this.f$2;
                boolean z = this.f$3;
                SurfaceRequest surfaceRequest2 = recorder.mLatestSurfaceRequest;
                if (surfaceRequest2 != null && !surfaceRequest2.mSurfaceFuture.delegate.isDone()) {
                    recorder.mLatestSurfaceRequest.willNotProvideSurface();
                }
                recorder.mHasGlProcessing = z;
                recorder.mLatestSurfaceRequest = surfaceRequest;
                recorder.mVideoSourceTimebase = timebase;
                recorder.configureInternal(surfaceRequest, timebase, true);
                return;
            case 1:
                Context context = (Context) this.f$0;
                boolean z2 = this.f$3;
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f$1;
                PlayerId playerId = (PlayerId) this.f$2;
                MediaMetricsListener create = MediaMetricsListener.create(context);
                if (create == null) {
                    Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z2) {
                    DefaultAnalyticsCollector defaultAnalyticsCollector = exoPlayerImpl.analyticsCollector;
                    defaultAnalyticsCollector.getClass();
                    defaultAnalyticsCollector.listeners.add(create);
                }
                LogSessionId logSessionId = create.getLogSessionId();
                synchronized (playerId) {
                    ContentInfoCompat.Compat31Impl compat31Impl = playerId.logSessionIdApi31;
                    compat31Impl.getClass();
                    compat31Impl.setLogSessionId(logSessionId);
                }
                return;
            default:
                CameraWrapper cameraWrapper = (CameraWrapper) this.f$0;
                boolean z3 = this.f$3;
                Function1 function1 = (Function1) this.f$1;
                ListenableFuture listenableFuture = (ListenableFuture) this.f$2;
                listenableFuture.getClass();
                try {
                    Result.Companion companion = Result.Companion;
                    failure = (Void) listenableFuture.get();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                boolean z4 = failure instanceof Result.Failure;
                boolean z5 = !z4;
                MibiData.Session session = cameraWrapper.r;
                if (z4) {
                    session.addUxpEvent("ECWTE", new String[0]);
                } else {
                    session.addUxpEvent("SCWTE", String.valueOf(z3));
                }
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z5));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ Recorder$$ExternalSyntheticLambda16(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = z;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
