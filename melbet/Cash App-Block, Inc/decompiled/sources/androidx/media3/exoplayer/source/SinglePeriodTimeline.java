package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Timeline;
import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.Collections;
import java.util.List;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class SinglePeriodTimeline extends Timeline {
    public static final Object UID = new Object();
    public final boolean isSeekable;
    public final MediaItem.LiveConfiguration liveConfiguration;
    public final MediaItem mediaItem;
    public final long periodDurationUs;
    public final long windowDurationUs;

    static {
        IadFrame iadFrame = new IadFrame();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        List list = Collections.EMPTY_LIST;
        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
        MediaItem.LiveConfiguration.Builder builder = new MediaItem.LiveConfiguration.Builder();
        MediaItem.RequestMetadata requestMetadata = MediaItem.RequestMetadata.EMPTY;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new MediaItem.LocalConfiguration(uri, null, null, list, regularImmutableList2, -9223372036854775807L);
        }
        iadFrame.buildClippingProperties();
        builder.build();
        MediaMetadata mediaMetadata = MediaMetadata.EMPTY;
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, MediaItem mediaItem) {
        MediaItem.LiveConfiguration liveConfiguration = z2 ? mediaItem.liveConfiguration : null;
        this.periodDurationUs = j;
        this.windowDurationUs = j;
        this.isSeekable = z;
        mediaItem.getClass();
        this.mediaItem = mediaItem;
        this.liveConfiguration = liveConfiguration;
    }

    @Override // androidx.media3.common.Timeline
    public final int getIndexOfPeriod(Object obj) {
        return UID != obj ? -1 : 0;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        Trace.checkElementIndex(i, 1);
        Object obj = z ? UID : null;
        period.getClass();
        period.set(null, obj, 0, this.periodDurationUs, 0L, AdPlaybackState.NONE, false);
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final int getPeriodCount() {
        return 1;
    }

    @Override // androidx.media3.common.Timeline
    public final Object getUidOfPeriod(int i) {
        Trace.checkElementIndex(i, 1);
        return UID;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        Trace.checkElementIndex(i, 1);
        Object obj = Timeline.Window.SINGLE_WINDOW_UID;
        window.set(this.mediaItem, this.isSeekable, false, this.liveConfiguration, 0L, this.windowDurationUs);
        return window;
    }

    @Override // androidx.media3.common.Timeline
    public final int getWindowCount() {
        return 1;
    }
}
