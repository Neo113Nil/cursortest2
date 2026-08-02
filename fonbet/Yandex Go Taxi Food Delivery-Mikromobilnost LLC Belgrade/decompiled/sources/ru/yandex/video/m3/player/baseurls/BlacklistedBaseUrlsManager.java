package ru.yandex.video.m3.player.baseurls;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManager;", "", "Lru/yandex/video/m3/player/baseurls/BaseUrl;", "baseUrl", "Lzy11;", "addToBlackList", "(Lru/yandex/video/m3/player/baseurls/BaseUrl;)V", "Lru/yandex/video/m3/player/baseurls/BaseUrlFromBlackListRemovedListener;", "listener", "addListener", "(Lru/yandex/video/m3/player/baseurls/BaseUrlFromBlackListRemovedListener;)V", "removeListener", "release", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BlacklistedBaseUrlsManager {
    void addListener(BaseUrlFromBlackListRemovedListener listener);

    void addToBlackList(BaseUrl baseUrl);

    void release();

    void removeListener(BaseUrlFromBlackListRemovedListener listener);
}
