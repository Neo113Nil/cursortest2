package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.credentials.CredentialManager$$ExternalSyntheticLambda0;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoFrameReleaseHelper;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.google.common.util.concurrent.DirectExecutor;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DefaultVideoSink implements VideoSink {
    public Format inputFormat;
    public VideoSink.Listener listener;
    public Executor listenerExecutor;
    public Surface outputSurface;
    public long streamStartPositionUs;
    public final ArrayDeque videoFrameHandlers;
    public VideoFrameMetadataListener videoFrameMetadataListener;
    public final VideoFrameReleaseControl videoFrameReleaseControl;
    public final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    public final VideoFrameRenderControl videoFrameRenderControl;

    public DefaultVideoSink(VideoFrameReleaseControl videoFrameReleaseControl, VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster, SystemClock systemClock) {
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        videoFrameReleaseControl.clock = systemClock;
        CallResult callResult = new CallResult();
        callResult.serviceNames = this;
        this.videoFrameRenderControl = new VideoFrameRenderControl(callResult, videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster);
        this.videoFrameHandlers = new ArrayDeque();
        this.inputFormat = new Format(new Format.Builder());
        this.streamStartPositionUs = -9223372036854775807L;
        this.listener = VideoSink.Listener.NO_OP;
        this.listenerExecutor = new CredentialManager$$ExternalSyntheticLambda0(1);
        this.videoFrameMetadataListener = new DefaultVideoSink$$ExternalSyntheticLambda1();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void allowReleaseFirstFrameBeforeStarted() {
        VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
        if (videoFrameReleaseControl.firstFrameState == 0) {
            videoFrameReleaseControl.firstFrameState = 1;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void clearOutputSurfaceInfo() {
        this.outputSurface = null;
        this.videoFrameReleaseControl.setOutputSurface(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void flush(boolean z) {
        if (z) {
            VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
            videoFrameReleaseControl.frameReleaseHelper.resetAdjustment();
            videoFrameReleaseControl.lastPresentationTimeUs = -9223372036854775807L;
            videoFrameReleaseControl.initialPositionUs = -9223372036854775807L;
            videoFrameReleaseControl.firstFrameState = Math.min(videoFrameReleaseControl.firstFrameState, 1);
            videoFrameReleaseControl.joiningDeadlineMs = -9223372036854775807L;
            videoFrameReleaseControl.frameReadyWithoutSurface = false;
        }
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        VideoFrameRenderControl videoFrameRenderControl = this.videoFrameRenderControl;
        TimedValueQueue timedValueQueue = videoFrameRenderControl.videoSizes;
        LongArrayQueue longArrayQueue = videoFrameRenderControl.presentationTimestampsUs;
        longArrayQueue.headIndex = 0;
        longArrayQueue.tailIndex = -1;
        longArrayQueue.size = 0;
        videoFrameRenderControl.latestInputPresentationTimeUs = -9223372036854775807L;
        videoFrameRenderControl.latestOutputPresentationTimeUs = -9223372036854775807L;
        videoFrameRenderControl.lastPresentationTimeUs = -9223372036854775807L;
        TimedValueQueue timedValueQueue2 = videoFrameRenderControl.streamStartPositionsUs;
        if (timedValueQueue2.size() > 0) {
            Trace.checkArgument(timedValueQueue2.size() > 0);
            while (timedValueQueue2.size() > 1) {
                timedValueQueue2.pollFirst();
            }
            Object pollFirst = timedValueQueue2.pollFirst();
            pollFirst.getClass();
            videoFrameRenderControl.outputStreamStartPositionUs = ((Long) pollFirst).longValue();
        }
        if (timedValueQueue.size() > 0) {
            Trace.checkArgument(timedValueQueue.size() > 0);
            while (timedValueQueue.size() > 1) {
                timedValueQueue.pollFirst();
            }
            Object pollFirst2 = timedValueQueue.pollFirst();
            pollFirst2.getClass();
            timedValueQueue.add((VideoSize) pollFirst2, 0L);
        }
        this.videoFrameHandlers.clear();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final Surface getInputSurface() {
        Surface surface = this.outputSurface;
        surface.getClass();
        return surface;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean handleInputFrame(long j, MediaCodecVideoRenderer.AnonymousClass2 anonymousClass2) {
        this.videoFrameHandlers.add(anonymousClass2);
        VideoFrameRenderControl videoFrameRenderControl = this.videoFrameRenderControl;
        LongArrayQueue longArrayQueue = videoFrameRenderControl.presentationTimestampsUs;
        int i = longArrayQueue.size;
        long[] jArr = (long[]) longArrayQueue.data;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                Path$$ExternalSyntheticBUOutline0.m();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = longArrayQueue.headIndex;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) longArrayQueue.data, 0, jArr2, i3, i2);
            longArrayQueue.headIndex = 0;
            longArrayQueue.tailIndex = longArrayQueue.size - 1;
            longArrayQueue.data = jArr2;
            longArrayQueue.wrapAroundMask = length - 1;
        }
        int i4 = (longArrayQueue.tailIndex + 1) & longArrayQueue.wrapAroundMask;
        longArrayQueue.tailIndex = i4;
        ((long[]) longArrayQueue.data)[i4] = j;
        longArrayQueue.size++;
        videoFrameRenderControl.latestInputPresentationTimeUs = j;
        videoFrameRenderControl.lastPresentationTimeUs = -9223372036854775807L;
        this.listenerExecutor.execute(new AFd1lSDK$$ExternalSyntheticLambda0(this, 17));
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean initialize(Format format2) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean isEnded() {
        VideoFrameRenderControl videoFrameRenderControl = this.videoFrameRenderControl;
        long j = videoFrameRenderControl.lastPresentationTimeUs;
        return j != -9223372036854775807L && videoFrameRenderControl.latestOutputPresentationTimeUs == j;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean isReady(boolean z) {
        return this.videoFrameReleaseControl.isReady(z);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void join(boolean z) {
        this.videoFrameReleaseControl.join(z);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void onInputStreamChanged(Format format2, long j, int i, List list) {
        Trace.checkState(list.isEmpty());
        int i2 = format2.width;
        int i3 = format2.height;
        Format format3 = this.inputFormat;
        int i4 = format3.width;
        VideoFrameRenderControl videoFrameRenderControl = this.videoFrameRenderControl;
        if (i2 != i4 || i3 != format3.height) {
            TimedValueQueue timedValueQueue = videoFrameRenderControl.videoSizes;
            long j2 = videoFrameRenderControl.latestInputPresentationTimeUs;
            timedValueQueue.add(new VideoSize(i2, i3), j2 == -9223372036854775807L ? 0L : j2 + 1);
        }
        float f = format2.frameRate;
        if (f != this.inputFormat.frameRate) {
            this.videoFrameReleaseControl.setFrameRate(f);
        }
        this.inputFormat = format2;
        if (j != this.streamStartPositionUs) {
            if (videoFrameRenderControl.presentationTimestampsUs.size == 0) {
                videoFrameRenderControl.videoFrameReleaseControl.onStreamChanged(i);
                videoFrameRenderControl.outputStreamStartPositionUs = j;
            } else {
                TimedValueQueue timedValueQueue2 = videoFrameRenderControl.streamStartPositionsUs;
                long j3 = videoFrameRenderControl.latestInputPresentationTimeUs;
                timedValueQueue2.add(Long.valueOf(j), j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1);
            }
            this.streamStartPositionUs = j;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void redraw() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void render(long j, long j2) {
        try {
            this.videoFrameRenderControl.render(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink.VideoSinkException(e, this.inputFormat);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setBufferTimestampAdjustmentUs(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setChangeFrameRateStrategy(int i) {
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.videoFrameReleaseControl.frameReleaseHelper;
        if (videoFrameReleaseHelper.changeFrameRateStrategy == i) {
            return;
        }
        videoFrameReleaseHelper.changeFrameRateStrategy = i;
        videoFrameReleaseHelper.updateSurfacePlaybackFrameRate(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setListener(MediaCodecVideoRenderer.AnonymousClass1 anonymousClass1) {
        this.listener = anonymousClass1;
        this.listenerExecutor = DirectExecutor.INSTANCE;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setOutputSurfaceInfo(Surface surface, Size size) {
        this.outputSurface = surface;
        this.videoFrameReleaseControl.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setPlaybackSpeed(float f) {
        this.videoFrameReleaseControl.setPlaybackSpeed(f);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setVideoEffects(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void signalEndOfCurrentInputStream() {
        VideoFrameRenderControl videoFrameRenderControl = this.videoFrameRenderControl;
        if (videoFrameRenderControl.latestInputPresentationTimeUs == -9223372036854775807L) {
            videoFrameRenderControl.latestInputPresentationTimeUs = Long.MIN_VALUE;
            videoFrameRenderControl.latestOutputPresentationTimeUs = Long.MIN_VALUE;
        }
        videoFrameRenderControl.lastPresentationTimeUs = videoFrameRenderControl.latestInputPresentationTimeUs;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void startRendering() {
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameReleaseControl.onStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void stopRendering() {
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
        videoFrameReleaseControl.started = false;
        videoFrameReleaseControl.joiningDeadlineMs = -9223372036854775807L;
        VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.frameReleaseHelper;
        videoFrameReleaseHelper.started = false;
        VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.unregister();
        }
        videoFrameReleaseHelper.clearSurfaceFrameRate();
    }
}
