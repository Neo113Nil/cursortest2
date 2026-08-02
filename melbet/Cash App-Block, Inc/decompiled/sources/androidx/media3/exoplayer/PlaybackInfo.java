package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import com.google.common.collect.RegularImmutableList;
import java.util.List;

/* loaded from: classes3.dex */
public final class PlaybackInfo {
    public static final MediaSource$MediaPeriodId PLACEHOLDER_MEDIA_PERIOD_ID = new MediaSource$MediaPeriodId(new Object());
    public volatile long bufferedPositionUs;
    public final long discontinuityStartPositionUs;
    public final boolean isLoading;
    public final MediaSource$MediaPeriodId loadingMediaPeriodId;
    public final MediaSource$MediaPeriodId periodId;
    public final boolean playWhenReady;
    public final int playWhenReadyChangeReason;
    public final ExoPlaybackException playbackError;
    public final PlaybackParameters playbackParameters;
    public final int playbackState;
    public final int playbackSuppressionReason;
    public volatile long positionUpdateTimeMs;
    public volatile long positionUs;
    public final long requestedContentPositionUs;
    public final boolean sleepingForOffload;
    public final List staticMetadata;
    public final Timeline timeline;
    public volatile long totalBufferedDurationUs;
    public final TrackGroupArray trackGroups;
    public final TrackSelectorResult trackSelectorResult;

    public PlaybackInfo(Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List list, MediaSource$MediaPeriodId mediaSource$MediaPeriodId2, boolean z2, int i2, int i3, PlaybackParameters playbackParameters, long j3, long j4, long j5, long j6, boolean z3) {
        this.timeline = timeline;
        this.periodId = mediaSource$MediaPeriodId;
        this.requestedContentPositionUs = j;
        this.discontinuityStartPositionUs = j2;
        this.playbackState = i;
        this.playbackError = exoPlaybackException;
        this.isLoading = z;
        this.trackGroups = trackGroupArray;
        this.trackSelectorResult = trackSelectorResult;
        this.staticMetadata = list;
        this.loadingMediaPeriodId = mediaSource$MediaPeriodId2;
        this.playWhenReady = z2;
        this.playWhenReadyChangeReason = i2;
        this.playbackSuppressionReason = i3;
        this.playbackParameters = playbackParameters;
        this.bufferedPositionUs = j3;
        this.totalBufferedDurationUs = j4;
        this.positionUs = j5;
        this.positionUpdateTimeMs = j6;
        this.sleepingForOffload = z3;
    }

    public static PlaybackInfo createDummy(TrackSelectorResult trackSelectorResult) {
        Timeline.AnonymousClass1 anonymousClass1 = Timeline.EMPTY;
        TrackGroupArray trackGroupArray = TrackGroupArray.EMPTY;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = PLACEHOLDER_MEDIA_PERIOD_ID;
        return new PlaybackInfo(anonymousClass1, mediaSource$MediaPeriodId, -9223372036854775807L, 0L, 1, null, false, trackGroupArray, trackSelectorResult, regularImmutableList, mediaSource$MediaPeriodId, false, 1, 0, playbackParameters, 0L, 0L, 0L, 0L, false);
    }

    public final PlaybackInfo copyWithEstimatedPosition() {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, getEstimatedPositionUs(), SystemClock.elapsedRealtime(), this.sleepingForOffload);
    }

    public final PlaybackInfo copyWithIsLoading(boolean z) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, z, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public final PlaybackInfo copyWithLoadingMediaPeriodId(MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, mediaSource$MediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public final PlaybackInfo copyWithNewPosition(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, long j2, long j3, long j4, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List list) {
        return new PlaybackInfo(this.timeline, mediaSource$MediaPeriodId, j2, j3, this.playbackState, this.playbackError, this.isLoading, trackGroupArray, trackSelectorResult, list, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, j4, j, SystemClock.elapsedRealtime(), this.sleepingForOffload);
    }

    public final PlaybackInfo copyWithPlayWhenReady(int i, int i2, boolean z) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, z, i, i2, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public final PlaybackInfo copyWithPlaybackError(ExoPlaybackException exoPlaybackException) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, exoPlaybackException, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public final PlaybackInfo copyWithPlaybackParameters(PlaybackParameters playbackParameters) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public final PlaybackInfo copyWithPlaybackState(int i) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, i, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public final PlaybackInfo copyWithSleepingForOffload(boolean z) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, z);
    }

    public final PlaybackInfo copyWithTimeline(Timeline timeline) {
        return new PlaybackInfo(timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public final long getEstimatedPositionUs() {
        long j;
        long j2;
        if (!isPlaying()) {
            return this.positionUs;
        }
        do {
            j = this.positionUpdateTimeMs;
            j2 = this.positionUs;
        } while (j != this.positionUpdateTimeMs);
        return Util.msToUs(Util.usToMs(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.playbackParameters.speed)));
    }

    public final boolean isPlaying() {
        return this.playbackState == 3 && this.playWhenReady && this.playbackSuppressionReason == 0;
    }
}
