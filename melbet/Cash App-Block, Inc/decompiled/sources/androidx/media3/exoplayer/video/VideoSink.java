package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Size;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import java.util.List;

/* loaded from: classes3.dex */
public interface VideoSink {

    public interface Listener {
        public static final AnonymousClass1 NO_OP = new AnonymousClass1();

        /* renamed from: androidx.media3.exoplayer.video.VideoSink$Listener$1, reason: invalid class name */
        public final class AnonymousClass1 implements Listener {
        }

        default void onFirstFrameRendered() {
        }

        default void onFrameAvailableForRendering() {
        }

        default void onFrameDropped() {
        }

        default void onVideoSizeChanged(VideoSize videoSize) {
        }
    }

    public final class VideoSinkException extends Exception {

        /* renamed from: format, reason: collision with root package name */
        public final Format f886format;

        public VideoSinkException(Exception exc, Format format2) {
            super(exc);
            this.f886format = format2;
        }
    }

    void allowReleaseFirstFrameBeforeStarted();

    void clearOutputSurfaceInfo();

    void flush(boolean z);

    Surface getInputSurface();

    boolean handleInputFrame(long j, MediaCodecVideoRenderer.AnonymousClass2 anonymousClass2);

    boolean initialize(Format format2);

    boolean isEnded();

    boolean isInitialized();

    boolean isReady(boolean z);

    void join(boolean z);

    void onInputStreamChanged(Format format2, long j, int i, List list);

    void redraw();

    void release();

    void render(long j, long j2);

    void setBufferTimestampAdjustmentUs(long j);

    void setChangeFrameRateStrategy(int i);

    void setListener(MediaCodecVideoRenderer.AnonymousClass1 anonymousClass1);

    void setOutputSurfaceInfo(Surface surface, Size size);

    void setPlaybackSpeed(float f);

    void setVideoEffects(List list);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void signalEndOfCurrentInputStream();

    void startRendering();

    void stopRendering();
}
