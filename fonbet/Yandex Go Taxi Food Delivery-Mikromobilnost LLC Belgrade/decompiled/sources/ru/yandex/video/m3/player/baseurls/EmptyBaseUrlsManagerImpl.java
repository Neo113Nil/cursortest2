package ru.yandex.video.m3.player.baseurls;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/baseurls/EmptyBaseUrlsManagerImpl;", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "<init>", "()V", "", "baseUrlPostfix", "Lzy11;", "setBaseUrlPostfix", "(Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "", "onChunkLoadError", "()Z", "", "getAvailableBaseUrlsCount", "()I", "", "newBaseUrls", "updateBaseUrls", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/baseurls/BaseUrl;", "restoredBaseUrl", "onBaseUrlRemovedFromBlacklist", "(Lru/yandex/video/m3/player/baseurls/BaseUrl;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EmptyBaseUrlsManagerImpl implements SingleTrackTypeBaseUrlsManager {
    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public int getAvailableBaseUrlsCount() {
        return 0;
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public String getBaseUrl() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlFromBlackListRemovedListener
    public void onBaseUrlRemovedFromBlacklist(BaseUrl restoredBaseUrl) {
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public boolean onChunkLoadError() {
        return false;
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public void setBaseUrlPostfix(String baseUrlPostfix) {
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public void updateBaseUrls(List<String> newBaseUrls) {
    }
}
