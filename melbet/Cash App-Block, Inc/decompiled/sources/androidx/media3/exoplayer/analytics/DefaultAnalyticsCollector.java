package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda25;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda4;
import androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda3;
import androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda4;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.tracing.Trace;
import com.fillr.e0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;
import java.util.List;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class DefaultAnalyticsCollector implements Player.Listener, MediaSourceEventListener, DrmSessionEventListener {
    public final SystemClock clock;
    public final SparseArray eventTimes;
    public SystemHandlerWrapper handler;
    public boolean isSeeking;
    public ListenerSet listeners;
    public final e0 mediaPeriodQueueTracker;
    public final Timeline.Period period;
    public Player player;
    public final Timeline.Window window;

    public DefaultAnalyticsCollector(SystemClock systemClock) {
        systemClock.getClass();
        this.clock = systemClock;
        String str = Util.DEVICE_DEBUG_INFO;
        Looper myLooper = Looper.myLooper();
        this.listeners = new ListenerSet((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        Timeline.Period period = new Timeline.Period();
        this.period = period;
        this.window = new Timeline.Window();
        this.mediaPeriodQueueTracker = new e0(period);
        this.eventTimes = new SparseArray();
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime((MediaSource$MediaPeriodId) this.mediaPeriodQueueTracker.i);
    }

    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = timeline.isEmpty() ? null : mediaSource$MediaPeriodId;
        this.clock.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z = timeline.equals(((ExoPlayerImpl) this.player).getCurrentTimeline()) && i == ((ExoPlayerImpl) this.player).getCurrentMediaItemIndex();
        long j = 0;
        if (mediaSource$MediaPeriodId2 == null || !mediaSource$MediaPeriodId2.isAd()) {
            if (z) {
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.player;
                exoPlayerImpl.verifyApplicationThread();
                j = exoPlayerImpl.getContentPositionInternal(exoPlayerImpl.playbackInfo);
            } else if (!timeline.isEmpty()) {
                j = Util.usToMs(timeline.getWindow(i, this.window, 0L).defaultPositionUs);
            }
        } else if (z && ((ExoPlayerImpl) this.player).getCurrentAdGroupIndex() == mediaSource$MediaPeriodId2.adGroupIndex && ((ExoPlayerImpl) this.player).getCurrentAdIndexInAdGroup() == mediaSource$MediaPeriodId2.adIndexInAdGroup) {
            j = ((ExoPlayerImpl) this.player).getCurrentPosition();
        }
        long j2 = j;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = (MediaSource$MediaPeriodId) this.mediaPeriodQueueTracker.i;
        Timeline currentTimeline = ((ExoPlayerImpl) this.player).getCurrentTimeline();
        int currentMediaItemIndex = ((ExoPlayerImpl) this.player).getCurrentMediaItemIndex();
        long currentPosition = ((ExoPlayerImpl) this.player).getCurrentPosition();
        ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) this.player;
        exoPlayerImpl2.verifyApplicationThread();
        return new AnalyticsListener.EventTime(elapsedRealtime, timeline, i, mediaSource$MediaPeriodId2, j2, currentTimeline, currentMediaItemIndex, mediaSource$MediaPeriodId3, currentPosition, Util.usToMs(exoPlayerImpl2.playbackInfo.totalBufferedDurationUs));
    }

    public final AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        this.player.getClass();
        if (mediaSource$MediaPeriodId != null) {
            return ((Timeline) ((RegularImmutableMap) this.mediaPeriodQueueTracker.c).get(mediaSource$MediaPeriodId)) != null ? generateEventTime(mediaSource$MediaPeriodId) : generateEventTime(Timeline.EMPTY, i, mediaSource$MediaPeriodId);
        }
        Timeline currentTimeline = ((ExoPlayerImpl) this.player).getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i, null);
    }

    public final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime((MediaSource$MediaPeriodId) this.mediaPeriodQueueTracker.h);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(int i) {
        sendEvent(generateReadingMediaPeriodEventTime(), 21, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(16));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAvailableCommandsChanged(Player.Commands commands) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 13, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(22));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(CueGroup cueGroup) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 27, new Id3Peeker$$ExternalSyntheticBUOutline0(2));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaSource$MediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1004, new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(14, generateMediaPeriodEventTime, mediaLoadData));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onEvents(ExoPlayerImpl exoPlayerImpl, Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 3, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(20));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(final boolean z) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda19
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsPlayingChanged(AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        sendEvent(generateMediaPeriodEventTime(i, mediaSource$MediaPeriodId), IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(25));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        sendEvent(generateMediaPeriodEventTime(i, mediaSource$MediaPeriodId), IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(26));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadError(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaSource$MediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE, new DefaultTrackSelector$$ExternalSyntheticLambda4(generateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadStarted(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        sendEvent(generateMediaPeriodEventTime(i, mediaSource$MediaPeriodId), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(24));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(MediaItem mediaItem, int i) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 1, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(24));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 14, new Id3Peeker$$ExternalSyntheticBUOutline0(3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(Metadata metadata) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 28, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(27));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(int i, boolean z) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 5, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(4));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 12, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(29));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 4, new ExoPlayerImpl$$ExternalSyntheticLambda4(generateCurrentPlayerMediaPeriodEventTime, i, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 6, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = (!(playbackException instanceof ExoPlaybackException) || (mediaSource$MediaPeriodId = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaSource$MediaPeriodId);
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 10, new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(12, generateCurrentPlayerMediaPeriodEventTime, playbackException));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
        sendEvent((!(playbackException instanceof ExoPlaybackException) || (mediaSource$MediaPeriodId = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaSource$MediaPeriodId), 10, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(int i, boolean z) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), -1, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(26));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
        if (i == 1) {
            this.isSeeking = false;
        }
        Player player = this.player;
        player.getClass();
        e0 e0Var = this.mediaPeriodQueueTracker;
        e0Var.i = e0.findCurrentPlayerMediaPeriodInQueue(player, (ImmutableList) e0Var.b, (MediaSource$MediaPeriodId) e0Var.f, (Timeline.Period) e0Var.a);
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 11, new ExoPlayerImpl$$ExternalSyntheticLambda25(generateCurrentPlayerMediaPeriodEventTime, i, positionInfo, positionInfo2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(int i) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 8, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(23));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean z) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 9, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(22));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z) {
        sendEvent(generateReadingMediaPeriodEventTime(), 23, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(19));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(int i, int i2) {
        sendEvent(generateReadingMediaPeriodEventTime(), 24, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(9));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(int i) {
        Player player = this.player;
        player.getClass();
        e0 e0Var = this.mediaPeriodQueueTracker;
        e0Var.i = e0.findCurrentPlayerMediaPeriodInQueue(player, (ImmutableList) e0Var.b, (MediaSource$MediaPeriodId) e0Var.f, (Timeline.Period) e0Var.a);
        e0Var.updateMediaPeriodTimelines(((ExoPlayerImpl) player).getCurrentTimeline());
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 0, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(23));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 19, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(28));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        sendEvent(generateCurrentPlayerMediaPeriodEventTime(), 2, new Id3Peeker$$ExternalSyntheticBUOutline0(1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 25, new ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4(generateReadingMediaPeriodEventTime, videoSize));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f) {
        sendEvent(generateReadingMediaPeriodEventTime(), 22, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(28));
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int i, ListenerSet.Event event) {
        this.eventTimes.put(i, eventTime);
        this.listeners.sendEvent(i, event);
    }

    public final void setPlayer(ExoPlayerImpl exoPlayerImpl, Looper looper) {
        Trace.checkState(this.player == null || ((ImmutableList) this.mediaPeriodQueueTracker.b).isEmpty());
        exoPlayerImpl.getClass();
        this.player = exoPlayerImpl;
        this.handler = this.clock.createHandler(looper, null);
        ListenerSet listenerSet = this.listeners;
        CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 = new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(11, this, exoPlayerImpl);
        listenerSet.getClass();
        SystemClock systemClock = this.clock;
        Trace.checkState(systemClock != null);
        this.listeners = new ListenerSet(listenerSet.listeners, looper, looper.getThread(), systemClock, captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0, listenerSet.throwsWhenUsingWrongThread);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(List list) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda3(generateCurrentPlayerMediaPeriodEventTime, list));
    }

    public final AnalyticsListener.EventTime generateEventTime(MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        this.player.getClass();
        Timeline timeline = mediaSource$MediaPeriodId == null ? null : (Timeline) ((RegularImmutableMap) this.mediaPeriodQueueTracker.c).get(mediaSource$MediaPeriodId);
        if (mediaSource$MediaPeriodId != null && timeline != null) {
            return generateEventTime(timeline, timeline.getPeriodByUid(mediaSource$MediaPeriodId.periodUid, this.period).windowIndex, mediaSource$MediaPeriodId);
        }
        int currentMediaItemIndex = ((ExoPlayerImpl) this.player).getCurrentMediaItemIndex();
        Timeline currentTimeline = ((ExoPlayerImpl) this.player).getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }
}
