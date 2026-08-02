package ru.yandex.video.m3.player.baseurls;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManagerFactory;", "", "create", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "baseUrls", "", "", "baseUrlInBlacklistAddedListener", "Lru/yandex/video/m3/player/baseurls/BaseUrlInBlacklistAddedListener;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SingleTrackTypeBaseUrlsManagerFactory {
    SingleTrackTypeBaseUrlsManager create(List<String> baseUrls, BaseUrlInBlacklistAddedListener baseUrlInBlacklistAddedListener);
}
