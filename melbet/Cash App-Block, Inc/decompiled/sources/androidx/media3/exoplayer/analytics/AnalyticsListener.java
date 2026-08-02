package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import app.cash.zipline.CallResult;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface AnalyticsListener {

    public final class EventTime {
        public final MediaSource$MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;
        public final MediaSource$MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j, Timeline timeline, int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j2, Timeline timeline2, int i2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId2, long j3, long j4) {
            this.realtimeMs = j;
            this.timeline = timeline;
            this.windowIndex = i;
            this.mediaPeriodId = mediaSource$MediaPeriodId;
            this.eventPlaybackPositionMs = j2;
            this.currentTimeline = timeline2;
            this.currentWindowIndex = i2;
            this.currentMediaPeriodId = mediaSource$MediaPeriodId2;
            this.currentPlaybackPositionMs = j3;
            this.totalBufferedDurationMs = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTime.class != obj.getClass()) {
                return false;
            }
            EventTime eventTime = (EventTime) obj;
            return this.realtimeMs == eventTime.realtimeMs && this.windowIndex == eventTime.windowIndex && this.eventPlaybackPositionMs == eventTime.eventPlaybackPositionMs && this.currentWindowIndex == eventTime.currentWindowIndex && this.currentPlaybackPositionMs == eventTime.currentPlaybackPositionMs && this.totalBufferedDurationMs == eventTime.totalBufferedDurationMs && this.timeline.equals(eventTime.timeline) && Objects.equals(this.mediaPeriodId, eventTime.mediaPeriodId) && Objects.equals(this.currentTimeline, eventTime.currentTimeline) && Objects.equals(this.currentMediaPeriodId, eventTime.currentMediaPeriodId);
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.realtimeMs), this.timeline, Integer.valueOf(this.windowIndex), this.mediaPeriodId, Long.valueOf(this.eventPlaybackPositionMs), this.currentTimeline, Integer.valueOf(this.currentWindowIndex), this.currentMediaPeriodId, Long.valueOf(this.currentPlaybackPositionMs), Long.valueOf(this.totalBufferedDurationMs));
        }
    }

    default void onAudioInputFormatChanged(EventTime eventTime, Format format2) {
    }

    default void onBandwidthEstimate(EventTime eventTime, int i, long j) {
    }

    default void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void onEvents(Player player, CallResult callResult) {
    }

    default void onIsPlayingChanged(EventTime eventTime, boolean z) {
    }

    void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException);

    default void onPlaybackStateChanged(EventTime eventTime, int i) {
    }

    void onPlayerError(EventTime eventTime, PlaybackException playbackException);

    default void onPositionDiscontinuity(int i) {
    }

    default void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }
}
