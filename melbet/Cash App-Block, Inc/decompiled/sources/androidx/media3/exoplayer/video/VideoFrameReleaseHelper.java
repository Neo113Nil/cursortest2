package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import android.view.Surface;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.FixedFrameRateEstimator;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class VideoFrameReleaseHelper {
    public int changeFrameRateStrategy;
    public final Context context;
    public float formatFrameRate;
    public long frameIndex;
    public final FixedFrameRateEstimator frameRateEstimator;
    public long lastAdjustedFrameIndex;
    public long lastAdjustedPresentationTimeUs;
    public long lastAdjustedReleaseTimeNs;
    public long lastVsyncHysteresisOffsetNs;
    public long pendingLastAdjustedFrameIndex;
    public long pendingLastAdjustedReleaseTimeNs;
    public long pendingLastPresentationTimeUs;
    public long pendingVsyncHysteresisOffsetNs;
    public float playbackSpeed;
    public boolean started;
    public Surface surface;
    public float surfaceMediaFrameRate;
    public float surfacePlaybackFrameRate;
    public VSyncSampler vsyncSampler;

    public abstract class VSyncSampler implements DisplayManager.DisplayListener {
        public final Choreographer choreographer;
        public final DisplayManager displayManager;
        public volatile long sampledVsyncTimeNs = -9223372036854775807L;
        public volatile long vsyncDurationNs = -9223372036854775807L;

        public VSyncSampler(Choreographer choreographer, DisplayManager displayManager) {
            this.choreographer = choreographer;
            this.displayManager = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }

        public abstract void register();

        public abstract void unregister();
    }

    public final class VSyncSamplerBase extends VSyncSampler implements Choreographer.FrameCallback {
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            this.choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            long j;
            if (i == 0) {
                this.choreographer.postFrameCallback(this);
                if (this.displayManager.getDisplay(0) != null) {
                    j = (long) (1.0E9d / r5.getRefreshRate());
                } else {
                    Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                    j = -9223372036854775807L;
                }
                this.vsyncDurationNs = j;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public final void register() {
            long j;
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper(null));
            this.choreographer.postFrameCallback(this);
            if (this.displayManager.getDisplay(0) != null) {
                j = (long) (1.0E9d / r0.getRefreshRate());
            } else {
                Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j = -9223372036854775807L;
            }
            this.vsyncDurationNs = j;
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public final void unregister() {
            this.displayManager.unregisterDisplayListener(this);
            this.choreographer.removeFrameCallback(this);
            this.sampledVsyncTimeNs = -9223372036854775807L;
            this.vsyncDurationNs = -9223372036854775807L;
        }
    }

    public final class VSyncSamplerV33 extends VSyncSampler implements Choreographer$VsyncCallback {
        public final Handler handler;

        public VSyncSamplerV33(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
            this.handler = Util.createHandlerForCurrentLooper(null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                this.choreographer.postVsyncCallback(this);
            }
        }

        public final void onVsync(Choreographer.FrameData frameData) {
            this.sampledVsyncTimeNs = frameData.getFrameTimeNanos();
            Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
            if (frameTimelines.length >= 2) {
                long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
                this.vsyncDurationNs = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
            } else {
                this.vsyncDurationNs = -9223372036854775807L;
            }
            this.handler.postDelayed(new AFd1lSDK$$ExternalSyntheticLambda0(this, 19), 500L);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public final void register() {
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper(null));
            this.choreographer.postVsyncCallback(this);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public final void unregister() {
            this.displayManager.unregisterDisplayListener(this);
            this.handler.removeCallbacksAndMessages(null);
            this.choreographer.removeVsyncCallback(this);
            this.sampledVsyncTimeNs = -9223372036854775807L;
            this.vsyncDurationNs = -9223372036854775807L;
        }
    }

    public VideoFrameReleaseHelper(Context context) {
        this.context = context;
        FixedFrameRateEstimator fixedFrameRateEstimator = new FixedFrameRateEstimator();
        fixedFrameRateEstimator.currentMatcher = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.candidateMatcher = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.lastFramePresentationTimeNs = -9223372036854775807L;
        this.frameRateEstimator = fixedFrameRateEstimator;
        this.formatFrameRate = -1.0f;
        this.playbackSpeed = 1.0f;
        this.changeFrameRateStrategy = 0;
    }

    public final void clearSurfaceFrameRate() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == RecyclerView.DECELERATION_RATE || !surface.isValid()) {
            return;
        }
        this.surfacePlaybackFrameRate = RecyclerView.DECELERATION_RATE;
        WindowCompat$Api35Impl.setSurfaceFrameRate(this.surface, RecyclerView.DECELERATION_RATE);
    }

    public final void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
        this.lastVsyncHysteresisOffsetNs = 0L;
        this.pendingVsyncHysteresisOffsetNs = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateSurfaceMediaFrameRate() {
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.surface == null) {
            return;
        }
        FixedFrameRateEstimator fixedFrameRateEstimator = this.frameRateEstimator;
        if (!((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).isSynced()) {
            f = this.formatFrameRate;
        } else if (((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).isSynced()) {
            f = (float) (1.0E9d / (((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).matchingFrameCount != 0 ? r2.matchingFrameDurationSumNs / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.surfaceMediaFrameRate;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).isSynced()) {
                if ((((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).isSynced() ? ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).matchingFrameDurationSumNs : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.1f;
                    if (Math.abs(f - this.surfaceMediaFrameRate) < f2) {
                        return;
                    }
                }
            }
            f2 = 1.0f;
            if (Math.abs(f - this.surfaceMediaFrameRate) < f2) {
            }
        } else if (f == -1.0f && fixedFrameRateEstimator.framesWithoutSyncCount < 30) {
            return;
        }
        this.surfaceMediaFrameRate = f;
        updateSurfacePlaybackFrameRate(false);
    }

    public final void updateSurfacePlaybackFrameRate(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.started) {
            float f2 = this.surfaceMediaFrameRate;
            if (f2 != -1.0f) {
                f = f2 * this.playbackSpeed;
                if (z && this.surfacePlaybackFrameRate == f) {
                    return;
                }
                this.surfacePlaybackFrameRate = f;
                WindowCompat$Api35Impl.setSurfaceFrameRate(this.surface, f);
            }
        }
        f = RecyclerView.DECELERATION_RATE;
        if (z) {
        }
        this.surfacePlaybackFrameRate = f;
        WindowCompat$Api35Impl.setSurfaceFrameRate(this.surface, f);
    }
}
