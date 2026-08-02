package ru.yandex.video.m3.player.impl.tracking.utils;

import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH&¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "", "inflateManifestUrl", "", "vsid", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "contentId", "startPosition", "", "autoPlay", "", "sourceIndex", "", "isOffline", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ManifestUrlInflater {
    String inflateManifestUrl(String vsid, VideoData videoData, String contentId, long startPosition, boolean autoPlay, int sourceIndex, boolean isOffline);
}
