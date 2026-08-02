package ru.yandex.video.m3.player.provider;

import kotlin.Metadata;
import ru.yandex.video.m3.player.tracks.TrackFormat;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "", "getTrackName", "", "format", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ManifestVideoTrackNameProvider {
    String getTrackName(TrackFormat format);
}
