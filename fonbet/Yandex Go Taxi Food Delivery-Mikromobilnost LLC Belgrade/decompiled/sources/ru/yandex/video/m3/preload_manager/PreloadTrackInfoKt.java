package ru.yandex.video.m3.preload_manager;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"debugPrint", "", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadTrackInfoKt {
    public static final String debugPrint(PreloadTrackInfo preloadTrackInfo) {
        ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo = (ExoPlayerPreloadTrackInfo) preloadTrackInfo;
        return "Format=" + exoPlayerPreloadTrackInfo.getFormat() + ", p=" + exoPlayerPreloadTrackInfo.getStreamKey().periodIndex + ", g=" + exoPlayerPreloadTrackInfo.getStreamKey().groupIndex + ", i=" + exoPlayerPreloadTrackInfo.getStreamKey().streamIndex;
    }
}
