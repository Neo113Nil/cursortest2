package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.appcompat.widget.Toolbar;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AudioTimestampPoller {
    public final AudioTimestampWrapper audioTimestamp;
    public final Toolbar.AnonymousClass1 errorListener;
    public long initialTimestampPositionFrames;
    public long initialTimestampSystemTimeUs;
    public long initializeSystemTimeUs;
    public long lastTimestampSampleTimeUs;
    public long sampleIntervalUs;
    public final int sampleRate;
    public int state;

    public final class AudioTimestampWrapper {
        public long accumulatedRawTimestampFramePosition;
        public final AudioTimestamp audioTimestamp = new AudioTimestamp();
        public final AudioTrack audioTrack;
        public boolean expectTimestampFramePositionReset;
        public long lastTimestampPositionFrames;
        public long lastTimestampRawPositionFrames;
        public long rawTimestampFramePositionWrapCount;

        public AudioTimestampWrapper(AudioTrack audioTrack) {
            this.audioTrack = audioTrack;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack, Toolbar.AnonymousClass1 anonymousClass1) {
        this.audioTimestamp = new AudioTimestampWrapper(audioTrack);
        this.sampleRate = audioTrack.getSampleRate();
        this.errorListener = anonymousClass1;
        updateState(0);
    }

    public final void updateState(int i) {
        this.state = i;
        if (i == 0) {
            this.lastTimestampSampleTimeUs = 0L;
            this.initialTimestampPositionFrames = -1L;
            this.initialTimestampSystemTimeUs = -9223372036854775807L;
            this.initializeSystemTimeUs = System.nanoTime() / 1000;
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i == 1) {
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.sampleIntervalUs = 10000000L;
        } else if (i == 4) {
            this.sampleIntervalUs = 500000L;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
        }
    }
}
