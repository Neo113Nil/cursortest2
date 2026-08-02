package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.tracing.Trace;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;
    public final MediaSource$MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final boolean isPrecededByTransitionFromSameStream;
    public final long liveStreamStartPositionProjectionUs;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public MediaPeriodInfo(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        Trace.checkArgument(!z5 || z3);
        Trace.checkArgument(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        Trace.checkArgument(z6);
        this.id = mediaSource$MediaPeriodId;
        this.startPositionUs = j;
        this.liveStreamStartPositionProjectionUs = j2;
        this.requestedContentPositionUs = j3;
        this.endPositionUs = j4;
        this.durationUs = j5;
        this.isPrecededByTransitionFromSameStream = z;
        this.isFollowedByTransitionToSameStream = z2;
        this.isLastInTimelinePeriod = z3;
        this.isLastInTimelineWindow = z4;
        this.isFinal = z5;
    }

    public final MediaPeriodInfo copyWithRequestedContentPositionUs(long j) {
        if (j == this.requestedContentPositionUs) {
            return this;
        }
        return new MediaPeriodInfo(this.id, this.startPositionUs, this.liveStreamStartPositionProjectionUs, j, this.endPositionUs, this.durationUs, this.isPrecededByTransitionFromSameStream, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public final MediaPeriodInfo copyWithStartPositionUs(long j, long j2) {
        if (j == this.startPositionUs && j2 == this.liveStreamStartPositionProjectionUs) {
            return this;
        }
        return new MediaPeriodInfo(this.id, j, j2, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isPrecededByTransitionFromSameStream, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaPeriodInfo.class == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isPrecededByTransitionFromSameStream == mediaPeriodInfo.isPrecededByTransitionFromSameStream && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && Objects.equals(this.id, mediaPeriodInfo.id)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.id.hashCode() + 527) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isPrecededByTransitionFromSameStream ? 1 : 0)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
