package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.FixedFrameRateEstimator;
import androidx.media3.exoplayer.video.VideoFrameReleaseHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.EocdRecord;

/* loaded from: classes3.dex */
public final class VideoFrameReleaseControl {
    public final long allowedJoiningTimeMs;
    public boolean frameReadyWithoutSurface;
    public final VideoFrameReleaseHelper frameReleaseHelper;
    public final MediaCodecVideoRenderer frameTimingEvaluator;
    public boolean hasOutputSurface;
    public boolean joiningRenderNextFrameImmediately;
    public long lastReleaseRealtimeUs;
    public boolean started;
    public int firstFrameState = 0;
    public long initialPositionUs = -9223372036854775807L;
    public long lastPresentationTimeUs = -9223372036854775807L;
    public long joiningDeadlineMs = -9223372036854775807L;
    public float playbackSpeed = 1.0f;
    public SystemClock clock = SystemClock.DEFAULT;
    public final boolean requiresOutputSurface = true;

    public VideoFrameReleaseControl(Context context, MediaCodecVideoRenderer mediaCodecVideoRenderer, long j) {
        this.frameTimingEvaluator = mediaCodecVideoRenderer;
        this.allowedJoiningTimeMs = j;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0178, code lost:
    
        if (r3 > 100000) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0186, code lost:
    
        if (r33 >= r37) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0086, code lost:
    
        if ((r9 == 0 ? false : r7.recentFrameOutlierFlags[(int) ((r9 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getFrameReleaseAction(long j, long j2, long j3, long j4, boolean z, boolean z2, EocdRecord eocdRecord) {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        boolean z4;
        float f;
        float f2;
        long j13;
        eocdRecord.entryCount = -9223372036854775807L;
        eocdRecord.centralDirectoryOffset = -9223372036854775807L;
        if (this.started && this.initialPositionUs == -9223372036854775807L) {
            this.initialPositionUs = j2;
        }
        if (this.lastPresentationTimeUs != j) {
            VideoFrameReleaseHelper videoFrameReleaseHelper = this.frameReleaseHelper;
            j5 = -9223372036854775807L;
            long j14 = videoFrameReleaseHelper.pendingLastAdjustedFrameIndex;
            if (j14 != -1) {
                videoFrameReleaseHelper.lastAdjustedFrameIndex = j14;
                videoFrameReleaseHelper.lastAdjustedReleaseTimeNs = videoFrameReleaseHelper.pendingLastAdjustedReleaseTimeNs;
                videoFrameReleaseHelper.lastAdjustedPresentationTimeUs = videoFrameReleaseHelper.pendingLastPresentationTimeUs;
                videoFrameReleaseHelper.lastVsyncHysteresisOffsetNs = videoFrameReleaseHelper.pendingVsyncHysteresisOffsetNs;
            }
            videoFrameReleaseHelper.frameIndex++;
            FixedFrameRateEstimator fixedFrameRateEstimator = videoFrameReleaseHelper.frameRateEstimator;
            j6 = 1000;
            long j15 = j * 1000;
            ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).onNextFrame(j15);
            if (((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).isSynced()) {
                fixedFrameRateEstimator.candidateMatcherActive = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (fixedFrameRateEstimator.lastFramePresentationTimeNs != -9223372036854775807L) {
                    if (fixedFrameRateEstimator.candidateMatcherActive) {
                        FixedFrameRateEstimator.Matcher matcher = (FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.candidateMatcher;
                        long j16 = matcher.frameCount;
                    }
                    ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.candidateMatcher).reset();
                    ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.candidateMatcher).onNextFrame(fixedFrameRateEstimator.lastFramePresentationTimeNs);
                    fixedFrameRateEstimator.candidateMatcherActive = true;
                    ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.candidateMatcher).onNextFrame(j15);
                }
            }
            if (fixedFrameRateEstimator.candidateMatcherActive && ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.candidateMatcher).isSynced()) {
                FixedFrameRateEstimator.Matcher matcher2 = (FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher;
                fixedFrameRateEstimator.currentMatcher = (FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.candidateMatcher;
                fixedFrameRateEstimator.candidateMatcher = matcher2;
                fixedFrameRateEstimator.candidateMatcherActive = false;
            }
            fixedFrameRateEstimator.lastFramePresentationTimeNs = j15;
            fixedFrameRateEstimator.framesWithoutSyncCount = ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).isSynced() ? 0 : fixedFrameRateEstimator.framesWithoutSyncCount + 1;
            videoFrameReleaseHelper.updateSurfaceMediaFrameRate();
            this.lastPresentationTimeUs = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long j17 = (long) ((j - j2) / this.playbackSpeed);
        if (this.started) {
            this.clock.getClass();
            j17 -= Util.msToUs(android.os.SystemClock.elapsedRealtime()) - j3;
        }
        eocdRecord.entryCount = j17;
        if (!z || z2) {
            if (this.hasOutputSurface || !this.requiresOutputSurface) {
                if (!this.requiresOutputSurface) {
                    this.frameReadyWithoutSurface = true;
                }
                if (this.joiningDeadlineMs == j5 || this.joiningRenderNextFrameImmediately) {
                    int i5 = this.firstFrameState;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i = 3;
                            i2 = 5;
                        } else if (i5 == 2) {
                            i = 3;
                            i2 = 5;
                        } else {
                            if (i5 != 3) {
                                Path$$ExternalSyntheticBUOutline0.m();
                                return 0;
                            }
                            this.clock.getClass();
                            i = 3;
                            i2 = 5;
                            long msToUs = Util.msToUs(android.os.SystemClock.elapsedRealtime()) - this.lastReleaseRealtimeUs;
                            if (this.started) {
                                long j18 = this.initialPositionUs;
                                if (j18 != j5) {
                                    if (j18 != j2) {
                                        if (j17 < -30000) {
                                        }
                                    }
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        i = 3;
                        i2 = 5;
                        z3 = this.started;
                    }
                    if (!z3) {
                        return 0;
                    }
                    if (this.started && j2 != this.initialPositionUs) {
                        this.clock.getClass();
                        long nanoTime = System.nanoTime();
                        VideoFrameReleaseHelper videoFrameReleaseHelper2 = this.frameReleaseHelper;
                        long j19 = (eocdRecord.entryCount * j6) + nanoTime;
                        if (videoFrameReleaseHelper2.lastAdjustedFrameIndex != -1) {
                            if (((FixedFrameRateEstimator.Matcher) videoFrameReleaseHelper2.frameRateEstimator.currentMatcher).isSynced()) {
                                FixedFrameRateEstimator fixedFrameRateEstimator2 = videoFrameReleaseHelper2.frameRateEstimator;
                                if (((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator2.currentMatcher).isSynced()) {
                                    FixedFrameRateEstimator.Matcher matcher3 = (FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator2.currentMatcher;
                                    i4 = 2;
                                    long j20 = matcher3.matchingFrameCount;
                                    i3 = 1;
                                    j13 = j20 == j7 ? j7 : matcher3.matchingFrameDurationSumNs / j20;
                                } else {
                                    i3 = 1;
                                    i4 = 2;
                                    j13 = j5;
                                }
                                j8 = -30000;
                                f = (videoFrameReleaseHelper2.frameIndex - videoFrameReleaseHelper2.lastAdjustedFrameIndex) * j13;
                                f2 = videoFrameReleaseHelper2.playbackSpeed;
                            } else {
                                i3 = 1;
                                i4 = 2;
                                j8 = -30000;
                                f = (j - videoFrameReleaseHelper2.lastAdjustedPresentationTimeUs) * j6;
                                f2 = videoFrameReleaseHelper2.playbackSpeed;
                            }
                            long j21 = videoFrameReleaseHelper2.lastAdjustedReleaseTimeNs + ((long) (f / f2));
                            if (Math.abs(j19 - j21) <= 20000000) {
                                j19 = j21;
                            } else {
                                videoFrameReleaseHelper2.resetAdjustment();
                            }
                        } else {
                            i3 = 1;
                            i4 = 2;
                            j8 = -30000;
                        }
                        videoFrameReleaseHelper2.pendingLastAdjustedFrameIndex = videoFrameReleaseHelper2.frameIndex;
                        videoFrameReleaseHelper2.pendingLastAdjustedReleaseTimeNs = j19;
                        videoFrameReleaseHelper2.pendingLastPresentationTimeUs = j;
                        VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper2.vsyncSampler;
                        if (vSyncSampler != null) {
                            long j22 = vSyncSampler.sampledVsyncTimeNs;
                            long j23 = videoFrameReleaseHelper2.vsyncSampler.vsyncDurationNs;
                            if (j22 != j5 && j23 != j5) {
                                long j24 = (((j19 - j22) / j23) * j23) + j22;
                                if (j19 <= j24) {
                                    j9 = j24 - j23;
                                } else {
                                    j24 += j23;
                                    j9 = j24;
                                }
                                long j25 = j24 - j19;
                                long j26 = j19 - j9;
                                long abs = Math.abs(j25 - j26);
                                if (abs < j23 / 2) {
                                    j10 = j9;
                                    long j27 = j23 / 4;
                                    if (abs < j27) {
                                        j11 = nanoTime;
                                        long j28 = videoFrameReleaseHelper2.lastVsyncHysteresisOffsetNs;
                                        if (j28 != j7) {
                                            videoFrameReleaseHelper2.pendingVsyncHysteresisOffsetNs = j28;
                                        } else {
                                            if (j25 < j26) {
                                                j27 = -j27;
                                            }
                                            videoFrameReleaseHelper2.pendingVsyncHysteresisOffsetNs = j27;
                                        }
                                    } else {
                                        j11 = nanoTime;
                                        videoFrameReleaseHelper2.pendingVsyncHysteresisOffsetNs = j7;
                                    }
                                } else {
                                    j10 = j9;
                                    j11 = nanoTime;
                                    videoFrameReleaseHelper2.pendingVsyncHysteresisOffsetNs = videoFrameReleaseHelper2.lastVsyncHysteresisOffsetNs;
                                }
                                if (j25 + videoFrameReleaseHelper2.pendingVsyncHysteresisOffsetNs >= j26) {
                                    j24 = j10;
                                }
                                j19 = j24 - ((j23 * 80) / 100);
                                eocdRecord.centralDirectoryOffset = j19;
                                j12 = (j19 - j11) / j6;
                                eocdRecord.entryCount = j12;
                                z4 = (this.joiningDeadlineMs != j5 || this.joiningRenderNextFrameImmediately) ? 0 : i3;
                                if (!this.frameTimingEvaluator.shouldIgnoreFrame(j12, j2, z2, z4)) {
                                    return 4;
                                }
                                long j29 = eocdRecord.entryCount;
                                if (j29 < j8 && !z2) {
                                    return z4 != 0 ? i : i4;
                                }
                                if (j29 <= 50000) {
                                    return i3;
                                }
                            }
                        }
                        j11 = nanoTime;
                        eocdRecord.centralDirectoryOffset = j19;
                        j12 = (j19 - j11) / j6;
                        eocdRecord.entryCount = j12;
                        if (this.joiningDeadlineMs != j5) {
                        }
                        if (!this.frameTimingEvaluator.shouldIgnoreFrame(j12, j2, z2, z4)) {
                        }
                    }
                    return i2;
                }
                i = 3;
                i2 = 5;
                z3 = false;
                if (!z3) {
                }
            } else {
                if (this.frameTimingEvaluator.shouldIgnoreFrame(j17, j2, z2, true)) {
                    return 4;
                }
                if (!this.started || eocdRecord.entryCount >= 30000) {
                    this.frameReadyWithoutSurface = true;
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean isReady(boolean z) {
        if (z && (this.firstFrameState == 3 || (this.frameReadyWithoutSurface && (!this.hasOutputSurface || !this.requiresOutputSurface)))) {
            this.joiningDeadlineMs = -9223372036854775807L;
            return true;
        }
        if (this.joiningDeadlineMs == -9223372036854775807L) {
            return false;
        }
        this.clock.getClass();
        if (android.os.SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = -9223372036854775807L;
        return false;
    }

    public final void join(boolean z) {
        long j;
        this.joiningRenderNextFrameImmediately = z;
        long j2 = this.allowedJoiningTimeMs;
        if (j2 > 0) {
            this.clock.getClass();
            j = android.os.SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.joiningDeadlineMs = j;
    }

    public final void onStarted() {
        this.started = true;
        this.clock.getClass();
        this.lastReleaseRealtimeUs = Util.msToUs(android.os.SystemClock.elapsedRealtime());
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.frameReleaseHelper;
        videoFrameReleaseHelper.started = true;
        videoFrameReleaseHelper.resetAdjustment();
        DisplayManager displayManager = (DisplayManager) videoFrameReleaseHelper.context.getSystemService("display");
        VideoFrameReleaseHelper.VSyncSampler vSyncSampler = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                vSyncSampler = Build.VERSION.SDK_INT >= 33 ? new VideoFrameReleaseHelper.VSyncSamplerV33(choreographer, displayManager) : new VideoFrameReleaseHelper.VSyncSamplerBase(choreographer, displayManager);
            } catch (RuntimeException e) {
                Log.w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        videoFrameReleaseHelper.vsyncSampler = vSyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.register();
        }
        videoFrameReleaseHelper.updateSurfacePlaybackFrameRate(false);
    }

    public final void onStreamChanged(int i) {
        if (i == 0) {
            this.firstFrameState = 1;
        } else if (i == 1) {
            this.firstFrameState = 0;
        } else {
            if (i != 2) {
                Path$$ExternalSyntheticBUOutline0.m();
                return;
            }
            this.firstFrameState = Math.min(this.firstFrameState, 2);
        }
        this.frameReleaseHelper.resetAdjustment();
    }

    public final void setFrameRate(float f) {
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.frameReleaseHelper;
        videoFrameReleaseHelper.formatFrameRate = f;
        FixedFrameRateEstimator fixedFrameRateEstimator = videoFrameReleaseHelper.frameRateEstimator;
        ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.currentMatcher).reset();
        ((FixedFrameRateEstimator.Matcher) fixedFrameRateEstimator.candidateMatcher).reset();
        fixedFrameRateEstimator.candidateMatcherActive = false;
        fixedFrameRateEstimator.lastFramePresentationTimeNs = -9223372036854775807L;
        fixedFrameRateEstimator.framesWithoutSyncCount = 0;
        videoFrameReleaseHelper.updateSurfaceMediaFrameRate();
    }

    public final void setOutputSurface(Surface surface) {
        this.hasOutputSurface = surface != null;
        this.frameReadyWithoutSurface = false;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.frameReleaseHelper;
        if (videoFrameReleaseHelper.surface != surface) {
            videoFrameReleaseHelper.clearSurfaceFrameRate();
            videoFrameReleaseHelper.surface = surface;
            videoFrameReleaseHelper.updateSurfacePlaybackFrameRate(true);
        }
        this.firstFrameState = Math.min(this.firstFrameState, 1);
    }

    public final void setPlaybackSpeed(float f) {
        Trace.checkArgument(f > RecyclerView.DECELERATION_RATE);
        if (f == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.frameReleaseHelper;
        videoFrameReleaseHelper.playbackSpeed = f;
        videoFrameReleaseHelper.updateSurfacePlaybackFrameRate(false);
    }
}
