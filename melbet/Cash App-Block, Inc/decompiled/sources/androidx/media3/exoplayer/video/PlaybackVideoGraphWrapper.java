package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.credentials.CredentialManager$$ExternalSyntheticLambda0;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda3;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.tracing.Trace;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class PlaybackVideoGraphWrapper {
    public static final CredentialManager$$ExternalSyntheticLambda0 NO_OP_EXECUTOR = new CredentialManager$$ExternalSyntheticLambda0(1);
    public final SystemClock clock;
    public final Context context;
    public Pair currentSurfaceAndSize;
    public final DefaultVideoSink defaultVideoSink;
    public final long earlyThresholdToDropInputUs;
    public final boolean enablePlaylistMode;
    public SystemHandlerWrapper handler;
    public final SparseArray inputVideoSinks;
    public long lastOutputFramePresentationTimeUs;
    public final CopyOnWriteArraySet listeners;
    public int pendingFlushCount;
    public TimedValueQueue pendingStreamChanges = new TimedValueQueue((byte) 0, 0);
    public int state;
    public int totalVideoInputCount;
    public final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    public final ReflectiveSingleInputVideoGraphFactory videoGraphFactory;

    public final class Builder {
        public boolean built;
        public final Context context;
        public boolean enablePlaylistMode;
        public final VideoFrameReleaseControl videoFrameReleaseControl;
        public ReflectiveSingleInputVideoGraphFactory videoGraphFactory;
        public long lateThresholdToDropInputUs = 15000;
        public final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = new VideoFrameReleaseEarlyTimeForecaster();
        public SystemClock clock = SystemClock.DEFAULT;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }
    }

    public final class InputVideoSink implements VideoSink {
        public int consecutiveDroppedFrames;
        public long inputBufferTimestampAdjustmentUs;
        public Format inputFormat;
        public long lastFramePresentationTimeUs;
        public Executor listenerExecutor;
        public ImmutableList videoEffects;

        public InputVideoSink(Context context) {
            Util.isFrameDropAllowedOnSurfaceInput(context);
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            this.videoEffects = RegularImmutableList.EMPTY;
            this.lastFramePresentationTimeUs = -9223372036854775807L;
            this.listenerExecutor = PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void allowReleaseFirstFrameBeforeStarted() {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.pendingStreamChanges.size() == 0) {
                playbackVideoGraphWrapper.defaultVideoSink.allowReleaseFirstFrameBeforeStarted();
                return;
            }
            TimedValueQueue timedValueQueue = new TimedValueQueue((byte) 0, 0);
            if (playbackVideoGraphWrapper.pendingStreamChanges.size() <= 0) {
                playbackVideoGraphWrapper.pendingStreamChanges = timedValueQueue;
            } else {
                ((StreamChangeInfo) playbackVideoGraphWrapper.pendingStreamChanges.pollFirst()).getClass();
                throw null;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void clearOutputSurfaceInfo() {
            int i = Size.UNKNOWN.width;
            PlaybackVideoGraphWrapper.this.currentSurfaceAndSize = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void flush(boolean z) {
            TimedValueQueue timedValueQueue;
            this.lastFramePresentationTimeUs = -9223372036854775807L;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            DefaultVideoSink defaultVideoSink = playbackVideoGraphWrapper.defaultVideoSink;
            if (playbackVideoGraphWrapper.state == 1) {
                playbackVideoGraphWrapper.pendingFlushCount++;
                defaultVideoSink.flush(z);
                while (true) {
                    int size = playbackVideoGraphWrapper.pendingStreamChanges.size();
                    timedValueQueue = playbackVideoGraphWrapper.pendingStreamChanges;
                    if (size <= 1) {
                        break;
                    } else {
                        timedValueQueue.pollFirst();
                    }
                }
                if (timedValueQueue.size() == 1) {
                    ((StreamChangeInfo) playbackVideoGraphWrapper.pendingStreamChanges.pollFirst()).getClass();
                    throw null;
                }
                playbackVideoGraphWrapper.lastOutputFramePresentationTimeUs = -9223372036854775807L;
                SystemHandlerWrapper systemHandlerWrapper = playbackVideoGraphWrapper.handler;
                systemHandlerWrapper.getClass();
                systemHandlerWrapper.post(new AFd1lSDK$$ExternalSyntheticLambda0(playbackVideoGraphWrapper, 18));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final Surface getInputSurface() {
            Trace.checkState(false);
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean handleInputFrame(long j, MediaCodecVideoRenderer.AnonymousClass2 anonymousClass2) {
            int i;
            Trace.checkState(false);
            long j2 = j + this.inputBufferTimestampAdjustmentUs;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = playbackVideoGraphWrapper.videoFrameReleaseEarlyTimeForecaster;
            long j3 = videoFrameReleaseEarlyTimeForecaster.lastFramePresentationTimeUs == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - r3) * videoFrameReleaseEarlyTimeForecaster.derivativeOfEarlyTime) + videoFrameReleaseEarlyTimeForecaster.lastFrameEarlyUs);
            if (j3 != -9223372036854775807L) {
                long j4 = playbackVideoGraphWrapper.earlyThresholdToDropInputUs;
                if (j4 != -9223372036854775807L && j3 < j4 && (i = this.consecutiveDroppedFrames) < 2) {
                    this.consecutiveDroppedFrames = i + 1;
                    MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                    MediaCodecAdapter mediaCodecAdapter = anonymousClass2.val$codec;
                    int i2 = anonymousClass2.val$bufferIndex;
                    android.os.Trace.beginSection("dropVideoBuffer");
                    mediaCodecAdapter.releaseOutputBuffer(i2);
                    android.os.Trace.endSection();
                    mediaCodecVideoRenderer.updateDroppedBufferCounters(0, 1);
                    return true;
                }
            }
            int i3 = playbackVideoGraphWrapper.totalVideoInputCount;
            if (i3 == -1 || i3 != 0) {
                return false;
            }
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean initialize(Format format2) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            boolean z = true;
            Trace.checkState(playbackVideoGraphWrapper.state == 0);
            ColorInfo colorInfo = format2.colorInfo;
            if (colorInfo == null || !colorInfo.isDataSpaceValid()) {
                colorInfo = ColorInfo.SDR_BT709_LIMITED;
            }
            int i = colorInfo.colorTransfer;
            try {
                if (i == 7) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 < 34) {
                            if (i2 >= 33 && Log.isExtensionSupported("EGL_EXT_gl_colorspace_bt2020_pq")) {
                                SystemClock systemClock = playbackVideoGraphWrapper.clock;
                                Looper myLooper = Looper.myLooper();
                                myLooper.getClass();
                                playbackVideoGraphWrapper.handler = systemClock.createHandler(myLooper, null);
                                playbackVideoGraphWrapper.videoGraphFactory.create();
                                throw null;
                            }
                        }
                    } catch (GlUtil$GlException e) {
                        throw new VideoSink.VideoSinkException(e, format2);
                    }
                }
                playbackVideoGraphWrapper.videoGraphFactory.create();
                throw null;
            } catch (VideoFrameProcessingException e2) {
                throw new VideoSink.VideoSinkException(e2, format2);
            }
            if (i == 6) {
                if (Build.VERSION.SDK_INT < 33 || !Log.isExtensionSupported("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    z = false;
                }
            } else if (i == 7) {
                z = Log.isExtensionSupported("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (!z) {
                Locale locale = Locale.US;
                Log.w("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                ColorInfo colorInfo2 = ColorInfo.SDR_BT709_LIMITED;
            } else if (i == 2 || i == 10) {
                ColorInfo colorInfo3 = ColorInfo.SDR_BT709_LIMITED;
            }
            SystemClock systemClock2 = playbackVideoGraphWrapper.clock;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            playbackVideoGraphWrapper.handler = systemClock2.createHandler(myLooper2, null);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isEnded() {
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isInitialized() {
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isReady(boolean z) {
            return PlaybackVideoGraphWrapper.this.defaultVideoSink.videoFrameReleaseControl.isReady(false);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void join(boolean z) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.enablePlaylistMode) {
                playbackVideoGraphWrapper.defaultVideoSink.join(z);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void onInputStreamChanged(Format format2, long j, int i, List list) {
            Trace.checkState(false);
            this.videoEffects = ImmutableList.copyOf((Collection) list);
            this.inputFormat = format2;
            Format.Builder buildUpon = format2.buildUpon();
            ColorInfo colorInfo = format2.colorInfo;
            if (colorInfo == null || !colorInfo.isDataSpaceValid()) {
                colorInfo = ColorInfo.SDR_BT709_LIMITED;
            }
            buildUpon.colorInfo = colorInfo;
            buildUpon.build();
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void redraw() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void release() {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.state == 2) {
                return;
            }
            SystemHandlerWrapper systemHandlerWrapper = playbackVideoGraphWrapper.handler;
            if (systemHandlerWrapper != null) {
                systemHandlerWrapper.handler.removeCallbacksAndMessages(null);
            }
            playbackVideoGraphWrapper.currentSurfaceAndSize = null;
            playbackVideoGraphWrapper.state = 2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void render(long j, long j2) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.render(j + this.inputBufferTimestampAdjustmentUs, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setBufferTimestampAdjustmentUs(long j) {
            this.inputBufferTimestampAdjustmentUs = j;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setChangeFrameRateStrategy(int i) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.setChangeFrameRateStrategy(i);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setListener(MediaCodecVideoRenderer.AnonymousClass1 anonymousClass1) {
            this.listenerExecutor = DirectExecutor.INSTANCE;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setOutputSurfaceInfo(Surface surface, Size size) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            Pair pair = playbackVideoGraphWrapper.currentSurfaceAndSize;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) playbackVideoGraphWrapper.currentSurfaceAndSize.second).equals(size)) {
                return;
            }
            playbackVideoGraphWrapper.currentSurfaceAndSize = Pair.create(surface, size);
            int i = size.width;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setPlaybackSpeed(float f) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            playbackVideoGraphWrapper.videoFrameReleaseEarlyTimeForecaster.setPlaybackSpeed(f);
            playbackVideoGraphWrapper.defaultVideoSink.setPlaybackSpeed(f);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setVideoEffects(List list) {
            ImmutableList immutableList = this.videoEffects;
            immutableList.getClass();
            if (Maps.equalsImpl(list, immutableList)) {
                return;
            }
            this.videoEffects = ImmutableList.copyOf((Collection) list);
            Format format2 = this.inputFormat;
            if (format2 == null) {
                return;
            }
            Format.Builder buildUpon = format2.buildUpon();
            ColorInfo colorInfo = format2.colorInfo;
            if (colorInfo == null || !colorInfo.isDataSpaceValid()) {
                colorInfo = ColorInfo.SDR_BT709_LIMITED;
            }
            buildUpon.colorInfo = colorInfo;
            buildUpon.build();
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.videoFrameMetadataListener = videoFrameMetadataListener;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void signalEndOfCurrentInputStream() {
            long j = this.lastFramePresentationTimeUs;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.lastOutputFramePresentationTimeUs >= j) {
                playbackVideoGraphWrapper.defaultVideoSink.signalEndOfCurrentInputStream();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void startRendering() {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.enablePlaylistMode) {
                playbackVideoGraphWrapper.defaultVideoSink.startRendering();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void stopRendering() {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.enablePlaylistMode) {
                playbackVideoGraphWrapper.defaultVideoSink.stopRendering();
            }
        }
    }

    public final class ReflectiveDefaultVideoFrameProcessorFactory {
        static {
            Strings.memoize(new ExoPlayer$Builder$$ExternalSyntheticLambda3(2));
        }
    }

    public final class ReflectiveSingleInputVideoGraphFactory {
        public final ReflectiveDefaultVideoFrameProcessorFactory videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory();

        public final void create() {
            try {
                ((ReflectiveSingleInputVideoGraphFactory) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(ReflectiveDefaultVideoFrameProcessorFactory.class).newInstance(this.videoFrameProcessorFactory)).create();
            } catch (Exception e) {
                OptionalProvider$$ExternalSyntheticLambda0.m(e);
            }
        }
    }

    public abstract class StreamChangeInfo {
    }

    public PlaybackVideoGraphWrapper(Builder builder) {
        this.context = builder.context;
        ReflectiveSingleInputVideoGraphFactory reflectiveSingleInputVideoGraphFactory = builder.videoGraphFactory;
        reflectiveSingleInputVideoGraphFactory.getClass();
        this.videoGraphFactory = reflectiveSingleInputVideoGraphFactory;
        this.inputVideoSinks = new SparseArray();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        this.enablePlaylistMode = builder.enablePlaylistMode;
        SystemClock systemClock = builder.clock;
        this.clock = systemClock;
        long j = builder.lateThresholdToDropInputUs;
        this.earlyThresholdToDropInputUs = j != -9223372036854775807L ? -j : -9223372036854775807L;
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = builder.videoFrameReleaseEarlyTimeForecaster;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        this.defaultVideoSink = new DefaultVideoSink(builder.videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster, systemClock);
        this.listeners = new CopyOnWriteArraySet();
        new Format(new Format.Builder());
        this.lastOutputFramePresentationTimeUs = -9223372036854775807L;
        this.totalVideoInputCount = -1;
        this.state = 0;
    }
}
