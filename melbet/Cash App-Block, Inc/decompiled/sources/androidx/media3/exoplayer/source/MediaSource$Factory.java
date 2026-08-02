package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.room.CoroutinesRoom;

/* loaded from: classes3.dex */
public interface MediaSource$Factory {
    BaseMediaSource createMediaSource(MediaItem mediaItem);

    default void experimentalParseSubtitlesDuringExtraction(boolean z) {
    }

    default void experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
    }

    default void setSubtitleParserFactory(CoroutinesRoom.Companion companion) {
    }
}
