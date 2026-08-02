package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;

/* loaded from: classes3.dex */
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {
    public final MediaItem updatedMediaItem;

    public TimelineWithUpdatedMediaItem(Timeline timeline, MediaItem mediaItem) {
        super(timeline);
        this.updatedMediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        super.getWindow(i, window, j);
        MediaItem mediaItem = this.updatedMediaItem;
        window.mediaItem = mediaItem;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        return window;
    }
}
