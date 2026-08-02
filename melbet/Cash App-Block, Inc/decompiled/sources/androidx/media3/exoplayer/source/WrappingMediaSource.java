package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;

/* loaded from: classes3.dex */
public abstract class WrappingMediaSource extends CompositeMediaSource {
    public final BaseMediaSource mediaSource;

    public WrappingMediaSource(BaseMediaSource baseMediaSource) {
        this.mediaSource = baseMediaSource;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final Timeline getInitialTimeline() {
        return this.mediaSource.getInitialTimeline();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource$MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Object obj, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        return getMediaPeriodIdForChildMediaPeriodId(mediaSource$MediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final long getMediaTimeForChildMediaTime(Object obj, long j) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(int i, Object obj) {
        return i;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final boolean isSingleWindow() {
        return this.mediaSource.isSingleWindow();
    }

    public abstract void onChildSourceInfoRefreshed(Timeline timeline);

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        onChildSourceInfoRefreshed(timeline);
    }

    public final void prepareChildSource() {
        prepareChildSource(null, this.mediaSource);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void prepareSourceInternal(DefaultBandwidthMeter defaultBandwidthMeter) {
        this.mediaTransferListener = defaultBandwidthMeter;
        this.eventHandler = Util.createHandlerForCurrentLooper(null);
        prepareSourceInternal();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.mediaSource.updateMediaItem(mediaItem);
    }

    public MediaSource$MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        return mediaSource$MediaPeriodId;
    }

    public void prepareSourceInternal() {
        prepareChildSource();
    }
}
