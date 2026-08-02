package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;

/* loaded from: classes3.dex */
public final class LoadControl$Parameters {
    public final long bufferedDurationUs;
    public final MediaSource$MediaPeriodId mediaPeriodId;
    public final float playbackSpeed;
    public final PlayerId playerId;
    public final Timeline timeline;

    public LoadControl$Parameters(PlayerId playerId, Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, float f, boolean z, long j2) {
        this.playerId = playerId;
        this.timeline = timeline;
        this.mediaPeriodId = mediaSource$MediaPeriodId;
        this.bufferedDurationUs = j;
        this.playbackSpeed = f;
    }
}
