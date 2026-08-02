package androidx.media3.exoplayer.audio;

import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioTimestampPoller;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.fillr.n;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AudioTrackAudioOutput {
    public static int pendingReleaseCount;
    public static ScheduledExecutorService releaseExecutor;
    public static final Object releaseExecutorLock = new Object();
    public final AudioTrack audioTrack;
    public final AudioTrackPositionTracker audioTrackPositionTracker;
    public final Recorder.AnonymousClass6 capabilityChangeListener;
    public final AudioOutputProvider.OutputConfig config;
    public int framesPerEncodedSample;
    public boolean hasBeenStopped;
    public final boolean isOutputPcm;
    public long lastTunnelingAvSyncPresentationTimeUs;
    public int lastUnderrunCount;
    public final ListenerSet listeners = new ListenerSet(Thread.currentThread());
    public final float maxPlaybackSpeed;
    public final Recorder.AnonymousClass3 offloadStreamEventCallbackV29;
    public n onRoutingChangedListener;
    public final int pcmFrameSize;
    public long writtenEncodedFrames;
    public long writtenPcmBytes;

    public final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public AudioTrackAudioOutput(AudioTrack audioTrack, AudioOutputProvider.OutputConfig outputConfig, Recorder.AnonymousClass6 anonymousClass6, float f, SystemClock systemClock) {
        this.audioTrack = audioTrack;
        this.config = outputConfig;
        this.maxPlaybackSpeed = f;
        this.capabilityChangeListener = anonymousClass6;
        boolean isEncodingLinearPcm = Util.isEncodingLinearPcm(outputConfig.f880encoding);
        this.isOutputPcm = isEncodingLinearPcm;
        if (isEncodingLinearPcm) {
            this.pcmFrameSize = Util.getByteDepth(outputConfig.f880encoding) * Integer.bitCount(outputConfig.channelMask);
        } else {
            this.pcmFrameSize = -1;
        }
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new Toolbar.AnonymousClass1(this), systemClock, audioTrack, outputConfig.f880encoding, this.pcmFrameSize, outputConfig.bufferSize);
        if (anonymousClass6 != null) {
            final n nVar = new n();
            nVar.a = audioTrack;
            nVar.b = anonymousClass6;
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(null);
            nVar.c = createHandlerForCurrentLooper;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    n nVar2 = n.this;
                    if (((AudioTrackAudioOutput$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0) nVar2.d) == null) {
                        return;
                    }
                    Log.get().execute(new DispatchQueue$$ExternalSyntheticLambda0(25, nVar2, audioRouting));
                }
            };
            nVar.d = onRoutingChangedListener;
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, createHandlerForCurrentLooper);
            this.onRoutingChangedListener = nVar;
        }
        this.offloadStreamEventCallbackV29 = audioTrack.isOffloadedPlayback() ? new Recorder.AnonymousClass3(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getPositionUs() {
        AudioTrackPositionTracker audioTrackPositionTracker;
        SystemClock systemClock;
        AudioTrack audioTrack;
        long j;
        boolean z;
        boolean z2;
        AudioTrackPositionTracker audioTrackPositionTracker2;
        long playbackHeadPositionEstimateUs;
        int playState;
        int i;
        long j2;
        boolean z3;
        AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper;
        boolean timestamp;
        long j3;
        float f;
        boolean z4;
        AudioTimestamp audioTimestamp;
        AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper2;
        int i2;
        int i3;
        Method method;
        Method method2;
        Integer num;
        AudioTrackPositionTracker audioTrackPositionTracker3 = this.audioTrackPositionTracker;
        SystemClock systemClock2 = audioTrackPositionTracker3.clock;
        AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker3.audioTimestampPoller;
        AudioTrack audioTrack2 = audioTrackPositionTracker3.audioTrack;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = audioTrackPositionTracker3.playheadOffsets;
            systemClock2.getClass();
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - audioTrackPositionTracker3.lastPlayheadSampleTimeUs >= 30000) {
                j = 1000;
                long sampleCountToDurationUs = Util.sampleCountToDurationUs(audioTrackPositionTracker3.outputSampleRate, audioTrackPositionTracker3.getPlaybackHeadPosition());
                if (sampleCountToDurationUs != 0) {
                    int i4 = audioTrackPositionTracker3.nextPlayheadOffsetIndex;
                    float f2 = audioTrackPositionTracker3.audioTrackPlaybackSpeed;
                    if (f2 != 1.0f) {
                        sampleCountToDurationUs = Math.round(sampleCountToDurationUs / f2);
                    }
                    jArr[i4] = sampleCountToDurationUs - nanoTime;
                    audioTrackPositionTracker3.nextPlayheadOffsetIndex = (audioTrackPositionTracker3.nextPlayheadOffsetIndex + 1) % 10;
                    int i5 = audioTrackPositionTracker3.playheadOffsetCount;
                    if (i5 < 10) {
                        audioTrackPositionTracker3.playheadOffsetCount = i5 + 1;
                    }
                    audioTrackPositionTracker3.lastPlayheadSampleTimeUs = nanoTime;
                    audioTrackPositionTracker3.smoothedPlayheadOffsetUs = 0L;
                    int i6 = 0;
                    while (true) {
                        int i7 = audioTrackPositionTracker3.playheadOffsetCount;
                        if (i6 >= i7) {
                            break;
                        }
                        audioTrackPositionTracker3.smoothedPlayheadOffsetUs = (jArr[i6] / i7) + audioTrackPositionTracker3.smoothedPlayheadOffsetUs;
                        i6++;
                    }
                }
                audioTrackPositionTracker = audioTrackPositionTracker3;
                systemClock = systemClock2;
                audioTrack = audioTrack2;
            } else {
                j = 1000;
            }
            long j4 = audioTrackPositionTracker3.latencyUs;
            if (!audioTrackPositionTracker3.isOutputPcm || (method = audioTrackPositionTracker3.getLatencyMethod) == null) {
                j2 = 500000;
            } else {
                j2 = 500000;
                if (nanoTime - audioTrackPositionTracker3.lastLatencySampleTimeUs >= 500000) {
                    try {
                        num = (Integer) method.invoke(audioTrack2, null);
                        String str = Util.DEVICE_DEBUG_INFO;
                    } catch (Exception unused) {
                        method2 = null;
                    }
                    try {
                        long intValue = (num.intValue() * j) - audioTrackPositionTracker3.bufferSizeUs;
                        audioTrackPositionTracker3.latencyUs = intValue;
                        long max = Math.max(intValue, 0L);
                        audioTrackPositionTracker3.latencyUs = max;
                        if (max > 10000000) {
                            Log.w("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + max);
                            audioTrackPositionTracker3.latencyUs = 0L;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                        audioTrackPositionTracker3.getLatencyMethod = method2;
                        audioTrackPositionTracker3.lastLatencySampleTimeUs = nanoTime;
                        if (j4 == audioTrackPositionTracker3.latencyUs) {
                        }
                        float f3 = audioTrackPositionTracker3.audioTrackPlaybackSpeed;
                        long playbackHeadPositionEstimateUs2 = audioTrackPositionTracker3.getPlaybackHeadPositionEstimateUs(nanoTime);
                        audioTimestampWrapper = audioTimestampPoller.audioTimestamp;
                        AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper3 = audioTimestampPoller.audioTimestamp;
                        int i8 = audioTimestampPoller.sampleRate;
                        if (!z3) {
                        }
                        audioTimestampPoller.lastTimestampSampleTimeUs = nanoTime;
                        AudioTrack audioTrack3 = audioTimestampWrapper.audioTrack;
                        AudioTimestamp audioTimestamp2 = audioTimestampWrapper.audioTimestamp;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                        if (timestamp) {
                        }
                        if (timestamp) {
                        }
                        i3 = audioTimestampPoller.state;
                        if (i3 != 0) {
                        }
                        systemClock.getClass();
                        long nanoTime2 = System.nanoTime() / j;
                        if (audioTimestampPoller.state == 2) {
                        }
                        if (z2) {
                        }
                        long j5 = playbackHeadPositionEstimateUs;
                        playState = audioTrack.getPlayState();
                        if (playState == 3) {
                        }
                        return j5;
                    }
                    audioTrackPositionTracker3.lastLatencySampleTimeUs = nanoTime;
                }
            }
            z3 = j4 == audioTrackPositionTracker3.latencyUs;
            float f32 = audioTrackPositionTracker3.audioTrackPlaybackSpeed;
            long playbackHeadPositionEstimateUs22 = audioTrackPositionTracker3.getPlaybackHeadPositionEstimateUs(nanoTime);
            audioTimestampWrapper = audioTimestampPoller.audioTimestamp;
            AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper32 = audioTimestampPoller.audioTimestamp;
            int i82 = audioTimestampPoller.sampleRate;
            if (!z3 || nanoTime - audioTimestampPoller.lastTimestampSampleTimeUs >= audioTimestampPoller.sampleIntervalUs) {
                audioTimestampPoller.lastTimestampSampleTimeUs = nanoTime;
                AudioTrack audioTrack32 = audioTimestampWrapper.audioTrack;
                AudioTimestamp audioTimestamp22 = audioTimestampWrapper.audioTimestamp;
                timestamp = audioTrack32.getTimestamp(audioTimestamp22);
                if (timestamp) {
                    audioTrackPositionTracker = audioTrackPositionTracker3;
                    systemClock = systemClock2;
                    j3 = playbackHeadPositionEstimateUs22;
                } else {
                    audioTrackPositionTracker = audioTrackPositionTracker3;
                    systemClock = systemClock2;
                    long j6 = audioTimestamp22.framePosition;
                    j3 = playbackHeadPositionEstimateUs22;
                    long j7 = audioTimestampWrapper.lastTimestampRawPositionFrames;
                    if (j7 > j6) {
                        if (audioTimestampWrapper.expectTimestampFramePositionReset) {
                            audioTimestampWrapper.accumulatedRawTimestampFramePosition += j7;
                            audioTimestampWrapper.expectTimestampFramePositionReset = false;
                        } else {
                            audioTimestampWrapper.rawTimestampFramePositionWrapCount++;
                        }
                    }
                    audioTimestampWrapper.lastTimestampRawPositionFrames = j6;
                    audioTimestampWrapper.lastTimestampPositionFrames = j6 + audioTimestampWrapper.accumulatedRawTimestampFramePosition + (audioTimestampWrapper.rawTimestampFramePositionWrapCount << 32);
                }
                if (timestamp) {
                    audioTrack = audioTrack2;
                    f = f32;
                    z4 = timestamp;
                    audioTimestamp = audioTimestamp22;
                    audioTimestampWrapper2 = audioTimestampWrapper32;
                    i2 = 4;
                } else {
                    Toolbar.AnonymousClass1 anonymousClass1 = audioTimestampPoller.errorListener;
                    long j8 = audioTimestamp22.nanoTime / j;
                    z4 = timestamp;
                    audioTimestamp = audioTimestamp22;
                    long mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(nanoTime - (audioTimestampWrapper32.audioTimestamp.nanoTime / j), f32) + Util.sampleCountToDurationUs(i82, audioTimestampWrapper32.lastTimestampPositionFrames);
                    if (Math.abs(j8 - nanoTime) > 5000000) {
                        long j9 = audioTimestampWrapper.lastTimestampPositionFrames;
                        anonymousClass1.getClass();
                        StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                        sb.append(j9);
                        sb.append(", ");
                        sb.append(j8);
                        Boxes$$ExternalSyntheticOutline1.m1151m(nanoTime, ", ", ", ", sb);
                        sb.append(j3);
                        sb.append(", ");
                        sb.append(((AudioTrackAudioOutput) anonymousClass1.this$0).getWrittenFrames());
                        Log.w("AudioTrackAudioOutput", sb.toString());
                        i2 = 4;
                        audioTimestampPoller.updateState(4);
                        audioTrack = audioTrack2;
                        f = f32;
                        audioTimestampWrapper2 = audioTimestampWrapper32;
                    } else {
                        long j10 = j3;
                        if (Math.abs(mediaDurationForPlayoutDuration - j10) > 5000000) {
                            f = f32;
                            long j11 = audioTimestampWrapper.lastTimestampPositionFrames;
                            anonymousClass1.getClass();
                            audioTrack = audioTrack2;
                            audioTimestampWrapper2 = audioTimestampWrapper32;
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(j11);
                            sb2.append(", ");
                            sb2.append(j8);
                            Boxes$$ExternalSyntheticOutline1.m1151m(nanoTime, ", ", ", ", sb2);
                            sb2.append(j10);
                            sb2.append(", ");
                            sb2.append(((AudioTrackAudioOutput) anonymousClass1.this$0).getWrittenFrames());
                            Log.w("AudioTrackAudioOutput", sb2.toString());
                            i2 = 4;
                            audioTimestampPoller.updateState(4);
                        } else {
                            audioTrack = audioTrack2;
                            f = f32;
                            audioTimestampWrapper2 = audioTimestampWrapper32;
                            i2 = 4;
                            if (audioTimestampPoller.state == 4) {
                                audioTimestampPoller.updateState(0);
                            }
                        }
                    }
                }
                i3 = audioTimestampPoller.state;
                if (i3 != 0) {
                    AudioTimestamp audioTimestamp3 = audioTimestamp;
                    z = false;
                    if (z4) {
                        long j12 = audioTimestamp3.nanoTime;
                        if (j12 / j >= audioTimestampPoller.initializeSystemTimeUs) {
                            audioTimestampPoller.initialTimestampPositionFrames = audioTimestampWrapper.lastTimestampPositionFrames;
                            audioTimestampPoller.initialTimestampSystemTimeUs = j12 / j;
                            audioTimestampPoller.updateState(1);
                        }
                    } else if (nanoTime - audioTimestampPoller.initializeSystemTimeUs > j2) {
                        audioTimestampPoller.updateState(3);
                    }
                } else if (i3 == 1) {
                    AudioTimestamp audioTimestamp4 = audioTimestamp;
                    if (z4) {
                        long j13 = audioTimestampWrapper.lastTimestampPositionFrames;
                        long j14 = audioTimestampPoller.initialTimestampPositionFrames;
                        if (j13 > j14) {
                            float f4 = f;
                            AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper4 = audioTimestampWrapper2;
                            if (Math.abs((Util.getMediaDurationForPlayoutDuration(nanoTime - (audioTimestampWrapper4.audioTimestamp.nanoTime / j), f4) + Util.sampleCountToDurationUs(i82, audioTimestampWrapper4.lastTimestampPositionFrames)) - (Util.getMediaDurationForPlayoutDuration(nanoTime - audioTimestampPoller.initialTimestampSystemTimeUs, f4) + Util.sampleCountToDurationUs(i82, j14))) < j) {
                                audioTimestampPoller.updateState(2);
                            }
                        }
                        if (nanoTime - audioTimestampPoller.initializeSystemTimeUs > 2000000) {
                            audioTimestampPoller.updateState(3);
                        } else {
                            audioTimestampPoller.initialTimestampPositionFrames = audioTimestampWrapper.lastTimestampPositionFrames;
                            audioTimestampPoller.initialTimestampSystemTimeUs = audioTimestamp4.nanoTime / j;
                        }
                    } else {
                        z = false;
                        audioTimestampPoller.updateState(0);
                    }
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != i2) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return 0L;
                        }
                    } else if (z4) {
                        z = false;
                        audioTimestampPoller.updateState(0);
                    }
                } else if (!z4) {
                    audioTimestampPoller.updateState(0);
                }
                systemClock.getClass();
                long nanoTime22 = System.nanoTime() / j;
                z2 = audioTimestampPoller.state == 2 ? true : z;
                if (z2) {
                    audioTrackPositionTracker2 = audioTrackPositionTracker;
                    float f5 = audioTrackPositionTracker2.audioTrackPlaybackSpeed;
                    AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper5 = audioTimestampPoller.audioTimestamp;
                    playbackHeadPositionEstimateUs = Util.getMediaDurationForPlayoutDuration(nanoTime22 - (audioTimestampWrapper5.audioTimestamp.nanoTime / j), f5) + Util.sampleCountToDurationUs(audioTimestampPoller.sampleRate, audioTimestampWrapper5.lastTimestampPositionFrames);
                } else {
                    audioTrackPositionTracker2 = audioTrackPositionTracker;
                    playbackHeadPositionEstimateUs = audioTrackPositionTracker2.getPlaybackHeadPositionEstimateUs(nanoTime22);
                }
                long j52 = playbackHeadPositionEstimateUs;
                playState = audioTrack.getPlayState();
                if (playState == 3) {
                    if (z2 || ((i = audioTimestampPoller.state) != 0 && i != 1)) {
                        audioTrackPositionTracker2.maybeTriggerOnPositionAdvancingCallback(j52);
                    }
                    long j15 = audioTrackPositionTracker2.lastSystemTimeUs;
                    if (j15 != -9223372036854775807L) {
                        long j16 = j52 - audioTrackPositionTracker2.lastPositionUs;
                        long mediaDurationForPlayoutDuration2 = Util.getMediaDurationForPlayoutDuration(nanoTime22 - j15, audioTrackPositionTracker2.audioTrackPlaybackSpeed);
                        long j17 = audioTrackPositionTracker2.lastPositionUs + mediaDurationForPlayoutDuration2;
                        long abs = Math.abs(j17 - j52);
                        if (j16 != 0 && abs < 1000000) {
                            long j18 = (mediaDurationForPlayoutDuration2 * 10) / 100;
                            j52 = Util.constrainValue(j52, j17 - j18, j17 + j18);
                        }
                    }
                    audioTrackPositionTracker2.lastSystemTimeUs = nanoTime22;
                    audioTrackPositionTracker2.lastPositionUs = j52;
                } else if (playState == 1) {
                    audioTrackPositionTracker2.maybeTriggerOnPositionAdvancingCallback(j52);
                }
                return j52;
            }
            audioTrackPositionTracker = audioTrackPositionTracker3;
            systemClock = systemClock2;
            audioTrack = audioTrack2;
        } else {
            audioTrackPositionTracker = audioTrackPositionTracker3;
            systemClock = systemClock2;
            audioTrack = audioTrack2;
            j = 1000;
        }
        z = false;
        systemClock.getClass();
        long nanoTime222 = System.nanoTime() / j;
        if (audioTimestampPoller.state == 2) {
        }
        if (z2) {
        }
        long j522 = playbackHeadPositionEstimateUs;
        playState = audioTrack.getPlayState();
        if (playState == 3) {
        }
        return j522;
    }

    public final long getWrittenFrames() {
        if (!this.isOutputPcm) {
            return this.writtenEncodedFrames;
        }
        long j = this.writtenPcmBytes;
        long j2 = this.pcmFrameSize;
        String str = Util.DEVICE_DEBUG_INFO;
        return ((j + j2) - 1) / j2;
    }

    public final void setPlayerId(PlayerId playerId) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionId2 = playerId.getLogSessionId();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        this.audioTrack.setLogSessionId(logSessionId2);
    }

    public final boolean write(int i, long j, ByteBuffer byteBuffer) {
        int write;
        boolean z;
        Recorder.AnonymousClass6 anonymousClass6;
        AudioTrackAudioOutputProvider audioTrackAudioOutputProvider;
        AudioCapabilitiesReceiver audioCapabilitiesReceiver;
        AudioOutputProvider.OutputConfig outputConfig = this.config;
        boolean z2 = this.isOutputPcm;
        if (!z2 && this.framesPerEncodedSample == 0) {
            this.framesPerEncodedSample = DefaultAudioSink.getFramesPerEncodedSample(outputConfig.f880encoding, byteBuffer);
        }
        ListenerSet listenerSet = this.listeners;
        listenerSet.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = listenerSet.thread;
        AudioTrack audioTrack = this.audioTrack;
        if (currentThread == thread) {
            getWrittenFrames();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.lastUnderrunCount;
            this.lastUnderrunCount = underrunCount;
            if (z3) {
                listenerSet.sendEvent(-1, new Id3Peeker$$ExternalSyntheticBUOutline0(7));
            }
        }
        int remaining = byteBuffer.remaining();
        if (outputConfig.isTunneling) {
            if (j == Long.MIN_VALUE) {
                j = this.lastTunnelingAvSyncPresentationTimeUs;
            } else {
                this.lastTunnelingAvSyncPresentationTimeUs = j;
            }
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j * 1000);
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write >= 0) {
            z = write == remaining;
            if (z2) {
                this.writtenPcmBytes += write;
                return z;
            }
            if (z) {
                this.writtenEncodedFrames = (this.framesPerEncodedSample * i) + this.writtenEncodedFrames;
            }
            return z;
        }
        z = write == -6 || write == -32;
        if (z && (anonymousClass6 = this.capabilityChangeListener) != null && (audioCapabilitiesReceiver = (audioTrackAudioOutputProvider = (AudioTrackAudioOutputProvider) anonymousClass6.this$0).audioCapabilitiesReceiver) != null) {
            AudioCapabilities audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            audioTrackAudioOutputProvider.audioCapabilities = audioCapabilities;
            audioCapabilitiesReceiver.onNewAudioCapabilities(audioCapabilities);
        }
        throw new AudioOutput$WriteException(write, z);
    }
}
