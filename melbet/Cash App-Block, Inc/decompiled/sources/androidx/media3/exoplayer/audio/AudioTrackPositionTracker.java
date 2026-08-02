package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricPrompt;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import app.cash.zipline.CallResult;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class AudioTrackPositionTracker {
    public final AudioTimestampPoller audioTimestampPoller;
    public final AudioTrack audioTrack;
    public float audioTrackPlaybackSpeed;
    public final long bufferSizeUs;
    public final SystemClock clock;
    public long endPlaybackHeadPosition;
    public boolean expectRawPlaybackHeadReset;
    public long forceResetWorkaroundTimeMs;
    public Method getLatencyMethod;
    public final boolean isOutputPcm;
    public long lastLatencySampleTimeUs;
    public long lastPlayheadSampleTimeUs;
    public long lastPositionUs;
    public long lastRawPlaybackHeadPositionSampleTimeMs;
    public long lastSystemTimeUs;
    public long latencyUs;
    public final Toolbar.AnonymousClass1 listener;
    public int nextPlayheadOffsetIndex;
    public long onPositionAdvancingFromPositionUs;
    public final int outputSampleRate;
    public int playheadOffsetCount;
    public final long[] playheadOffsets;
    public long rawPlaybackHeadPosition;
    public long rawPlaybackHeadWrapCount;
    public long smoothedPlayheadOffsetUs;
    public long stopPlaybackHeadPosition;
    public long stopTimestampUs;
    public long sumRawPlaybackHeadPosition;

    public AudioTrackPositionTracker(Toolbar.AnonymousClass1 anonymousClass1, SystemClock systemClock, AudioTrack audioTrack, int i, int i2, int i3) {
        this.listener = anonymousClass1;
        this.clock = systemClock;
        this.audioTrack = audioTrack;
        try {
            this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.playheadOffsets = new long[10];
        this.lastSystemTimeUs = -9223372036854775807L;
        this.lastPositionUs = -9223372036854775807L;
        this.audioTimestampPoller = new AudioTimestampPoller(audioTrack, anonymousClass1);
        int sampleRate = audioTrack.getSampleRate();
        this.outputSampleRate = sampleRate;
        boolean isEncodingLinearPcm = Util.isEncodingLinearPcm(i);
        this.isOutputPcm = isEncodingLinearPcm;
        this.bufferSizeUs = isEncodingLinearPcm ? Util.sampleCountToDurationUs(sampleRate, i3 / i2) : -9223372036854775807L;
        this.rawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.expectRawPlaybackHeadReset = false;
        this.sumRawPlaybackHeadPosition = 0L;
        this.stopTimestampUs = -9223372036854775807L;
        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        this.lastLatencySampleTimeUs = 0L;
        this.latencyUs = 0L;
        this.audioTrackPlaybackSpeed = 1.0f;
        this.onPositionAdvancingFromPositionUs = -9223372036854775807L;
    }

    public final long getPlaybackHeadPosition() {
        if (this.stopTimestampUs != -9223372036854775807L) {
            return Math.min(this.endPlaybackHeadPosition, getSimulatedPlaybackHeadPositionAfterStop());
        }
        this.clock.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.lastRawPlaybackHeadPositionSampleTimeMs >= 5) {
            int playState = this.audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & BodyPartID.bodyIdMax;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.rawPlaybackHeadPosition <= 0 || playState != 3) {
                        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
                    } else if (this.forceResetWorkaroundTimeMs == -9223372036854775807L) {
                        this.forceResetWorkaroundTimeMs = elapsedRealtime;
                    }
                }
                long j = this.rawPlaybackHeadPosition;
                if (j > playbackHeadPosition) {
                    if (this.expectRawPlaybackHeadReset) {
                        this.sumRawPlaybackHeadPosition += j;
                        this.expectRawPlaybackHeadReset = false;
                    } else {
                        this.rawPlaybackHeadWrapCount++;
                    }
                }
                this.rawPlaybackHeadPosition = playbackHeadPosition;
            }
            this.lastRawPlaybackHeadPositionSampleTimeMs = elapsedRealtime;
        }
        return this.rawPlaybackHeadPosition + this.sumRawPlaybackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
    }

    public final long getPlaybackHeadPositionEstimateUs(long j) {
        int i = this.playheadOffsetCount;
        int i2 = this.outputSampleRate;
        long max = Math.max(0L, (i == 0 ? this.stopTimestampUs != -9223372036854775807L ? Util.sampleCountToDurationUs(i2, getSimulatedPlaybackHeadPositionAfterStop()) : Util.sampleCountToDurationUs(i2, getPlaybackHeadPosition()) : Util.getMediaDurationForPlayoutDuration(j + this.smoothedPlayheadOffsetUs, this.audioTrackPlaybackSpeed)) - this.latencyUs);
        return this.stopTimestampUs != -9223372036854775807L ? Math.min(Util.sampleCountToDurationUs(i2, this.endPlaybackHeadPosition), max) : max;
    }

    public final long getSimulatedPlaybackHeadPositionAfterStop() {
        if (this.audioTrack.getPlayState() == 2) {
            return this.stopPlaybackHeadPosition;
        }
        this.clock.getClass();
        return this.stopPlaybackHeadPosition + Util.scaleLargeValue(Util.getMediaDurationForPlayoutDuration(Util.msToUs(android.os.SystemClock.elapsedRealtime()) - this.stopTimestampUs, this.audioTrackPlaybackSpeed), this.outputSampleRate, 1000000L, RoundingMode.UP);
    }

    public final void maybeTriggerOnPositionAdvancingCallback(long j) {
        long j2 = this.onPositionAdvancingFromPositionUs;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long j3 = j - j2;
        float f = this.audioTrackPlaybackSpeed;
        String str = Util.DEVICE_DEBUG_INFO;
        if (f != 1.0f) {
            j3 = Math.round(j3 / f);
        }
        this.clock.getClass();
        final long currentTimeMillis = System.currentTimeMillis() - Util.usToMs(j3);
        this.onPositionAdvancingFromPositionUs = -9223372036854775807L;
        ListenerSet listenerSet = ((AudioTrackAudioOutput) this.listener.this$0).listeners;
        listenerSet.getClass();
        if (Thread.currentThread() == listenerSet.thread) {
            listenerSet.sendEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$PositionTrackerListener$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    BiometricPrompt biometricPrompt;
                    DefaultAudioSink.AudioOutputListener audioOutputListener = (DefaultAudioSink.AudioOutputListener) obj;
                    DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                    if (audioOutputListener == defaultAudioSink.audioOutputListener && (biometricPrompt = defaultAudioSink.listener) != null) {
                        MediaCodecAudioRenderer mediaCodecAudioRenderer = (MediaCodecAudioRenderer) biometricPrompt.mClientFragmentManager;
                        mediaCodecAudioRenderer.hasReportedAudioPositionAdvancing = true;
                        CallResult callResult = mediaCodecAudioRenderer.eventDispatcher;
                        Handler handler = (Handler) callResult.result;
                        if (handler != null) {
                            handler.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(callResult, currentTimeMillis));
                        }
                    }
                }
            });
        }
    }
}
