package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class StandaloneMediaClock implements MediaClock {
    public long baseElapsedMs;
    public long baseUs;
    public final SystemClock clock;
    public PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
    public boolean started;

    public StandaloneMediaClock(SystemClock systemClock) {
        this.clock = systemClock;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long getPositionUs() {
        long j = this.baseUs;
        if (!this.started) {
            return j;
        }
        this.clock.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.baseElapsedMs;
        return (this.playbackParameters.speed == 1.0f ? Util.msToUs(elapsedRealtime) : elapsedRealtime * r6.scaledUsPerMs) + j;
    }

    public final void resetPosition(long j) {
        this.baseUs = j;
        if (this.started) {
            this.clock.getClass();
            this.baseElapsedMs = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (this.started) {
            resetPosition(getPositionUs());
        }
        this.playbackParameters = playbackParameters;
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.clock.getClass();
        this.baseElapsedMs = android.os.SystemClock.elapsedRealtime();
        this.started = true;
    }
}
