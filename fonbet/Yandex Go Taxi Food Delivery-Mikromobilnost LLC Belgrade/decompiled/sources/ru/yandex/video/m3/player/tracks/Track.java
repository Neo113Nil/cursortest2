package ru.yandex.video.m3.player.tracks;

import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/tracks/Track;", "", "Lzy11;", "update", "()V", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "", "getSelectedTrackName", "(Lru/yandex/video/m3/player/utils/ResourceProvider;)Ljava/lang/String;", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "getSelectedTrackFormat", "()Lru/yandex/video/m3/player/tracks/TrackFormat;", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "trackVariant", "", "selectTrack", "(Lru/yandex/video/m3/player/tracks/TrackVariant;)Z", "", "getAvailableTrackVariants", "()Ljava/util/List;", "getSelectedTrackVariant", "()Lru/yandex/video/m3/player/tracks/TrackVariant;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Track {
    List<TrackVariant> getAvailableTrackVariants();

    TrackFormat getSelectedTrackFormat();

    String getSelectedTrackName(ResourceProvider resourceProvider);

    TrackVariant getSelectedTrackVariant();

    boolean selectTrack(TrackVariant trackVariant);

    void update();
}
