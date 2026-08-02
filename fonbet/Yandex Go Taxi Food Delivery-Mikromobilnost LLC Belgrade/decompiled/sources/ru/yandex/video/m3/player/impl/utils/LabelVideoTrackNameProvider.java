package ru.yandex.video.m3.player.impl.utils;

import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.ManifestVideoTrackNameProvider;
import ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.VideoTrackNameProvider;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/LabelVideoTrackNameProvider;", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "resourceProvider", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "manifestVideoTrackNameProvider", "Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "(Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;)V", "videoTrackNameProvider", "Lru/yandex/video/m3/player/tracks/VideoTrackNameProvider;", "getAdaptiveTrackName", "", "getDisabledTrackName", "getOtherTrackName", "format", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LabelVideoTrackNameProvider implements PlayerTrackNameProvider {
    public static final int $stable = 0;
    private final ManifestVideoTrackNameProvider manifestVideoTrackNameProvider;
    private final VideoTrackNameProvider videoTrackNameProvider;

    public LabelVideoTrackNameProvider(ResourceProvider resourceProvider, ManifestVideoTrackNameProvider manifestVideoTrackNameProvider) {
        this.manifestVideoTrackNameProvider = manifestVideoTrackNameProvider;
        this.videoTrackNameProvider = new VideoTrackNameProvider(resourceProvider);
    }

    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    public String getAdaptiveTrackName() {
        return this.videoTrackNameProvider.getAdaptiveTrackName();
    }

    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    public String getDisabledTrackName() {
        return this.videoTrackNameProvider.getDisabledTrackName();
    }

    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    public String getOtherTrackName(TrackFormat format) {
        String trackName = this.manifestVideoTrackNameProvider.getTrackName(format);
        return trackName == null ? this.videoTrackNameProvider.getOtherTrackName(format) : trackName;
    }
}
