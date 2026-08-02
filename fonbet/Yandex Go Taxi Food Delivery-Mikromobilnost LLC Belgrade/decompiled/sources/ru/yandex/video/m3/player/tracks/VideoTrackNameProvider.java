package ru.yandex.video.m3.player.tracks;

import kotlin.Metadata;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/tracks/VideoTrackNameProvider;", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "resourceProvider", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "(Lru/yandex/video/m3/player/utils/ResourceProvider;)V", "getResourceProvider", "()Lru/yandex/video/m3/player/utils/ResourceProvider;", "getAdaptiveTrackName", "", "getDisabledTrackName", "getOtherTrackName", "format", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class VideoTrackNameProvider implements PlayerTrackNameProvider {
    public static final int $stable = 8;
    private final ResourceProvider resourceProvider;

    public VideoTrackNameProvider(ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    public String getAdaptiveTrackName() {
        return this.resourceProvider.getString(R.string.player_adaptive_track);
    }

    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    public String getDisabledTrackName() {
        return this.resourceProvider.getString(R.string.player_disable_track);
    }

    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    public String getOtherTrackName(TrackFormat format) {
        StringBuilder sb = new StringBuilder();
        sb.append(format.getHeight());
        sb.append('p');
        return sb.toString();
    }

    public final ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }
}
