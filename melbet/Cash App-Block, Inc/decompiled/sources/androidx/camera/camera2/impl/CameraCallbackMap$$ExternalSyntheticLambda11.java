package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import coil3.svg.internal.AndroidSvg;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraCallbackMap$$ExternalSyntheticLambda11 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ CameraCallbackMap$$ExternalSyntheticLambda11(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        long j = this.f$2;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((CameraUseCaseAdapter.CaptureCallbackContainer) obj2).captureCallback.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                break;
            case 1:
                ((Request.Listener) obj2).mo29onRequestSequenceCompletedRuT0dZU((RequestMetadata) obj, j);
                break;
            default:
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) ((AndroidSvg) obj2).renderOptions;
                String str = Util.DEVICE_DEBUG_INFO;
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                DefaultAnalyticsCollector defaultAnalyticsCollector = exoPlayerImpl.analyticsCollector;
                AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = defaultAnalyticsCollector.generateReadingMediaPeriodEventTime();
                defaultAnalyticsCollector.sendEvent(generateReadingMediaPeriodEventTime, 26, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(generateReadingMediaPeriodEventTime, obj, j));
                if (exoPlayerImpl.videoOutput == obj) {
                    exoPlayerImpl.listeners.sendEvent(26, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(18));
                    break;
                }
                break;
        }
    }
}
