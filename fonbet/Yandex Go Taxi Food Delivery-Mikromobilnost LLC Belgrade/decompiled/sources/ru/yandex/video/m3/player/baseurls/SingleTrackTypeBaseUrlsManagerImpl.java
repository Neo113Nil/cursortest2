package ru.yandex.video.m3.player.baseurls;

import defpackage.h5z0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManagerImpl;", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "", "", "baseUrls", "Lru/yandex/video/m3/player/baseurls/BaseUrlInBlacklistAddedListener;", "baseUrlInBlacklistAddedListener", "", "enableLogs", "<init>", "(Ljava/util/List;Lru/yandex/video/m3/player/baseurls/BaseUrlInBlacklistAddedListener;Z)V", "baseUrlPostfix", "Lzy11;", "setBaseUrlPostfix", "(Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "onChunkLoadError", "()Z", "", "getAvailableBaseUrlsCount", "()I", "newBaseUrls", "updateBaseUrls", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/baseurls/BaseUrl;", "restoredBaseUrl", "onBaseUrlRemovedFromBlacklist", "(Lru/yandex/video/m3/player/baseurls/BaseUrl;)V", "delegate", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleTrackTypeBaseUrlsManagerImpl implements SingleTrackTypeBaseUrlsManager {
    public static final int MAX_SEQUENTLY_ATTEMPT_TO_USE_ANYCAST = 3;
    private final SingleTrackTypeBaseUrlsManager delegate;
    public static final int $stable = 8;

    public SingleTrackTypeBaseUrlsManagerImpl(List<String> list, BaseUrlInBlacklistAddedListener baseUrlInBlacklistAddedListener, boolean z) {
        h5z0.a.a("Initialisation started", new Object[0]);
        this.delegate = list.isEmpty() ? new EmptyBaseUrlsManagerImpl() : new NonEmptyBaseUrlsManagerImpl(list, z, baseUrlInBlacklistAddedListener);
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public int getAvailableBaseUrlsCount() {
        return this.delegate.getAvailableBaseUrlsCount();
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public String getBaseUrl() {
        return this.delegate.getBaseUrl();
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlFromBlackListRemovedListener
    public void onBaseUrlRemovedFromBlacklist(BaseUrl restoredBaseUrl) {
        h5z0.a.a("onBaseUrlRemovedFromBlacklist restoredBaseUrl=" + restoredBaseUrl, new Object[0]);
        this.delegate.onBaseUrlRemovedFromBlacklist(restoredBaseUrl);
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public boolean onChunkLoadError() {
        h5z0.a.d("onChunkLoadError", new Object[0]);
        return this.delegate.onChunkLoadError();
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public void setBaseUrlPostfix(String baseUrlPostfix) {
        this.delegate.setBaseUrlPostfix(baseUrlPostfix);
    }

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManager
    public void updateBaseUrls(List<String> newBaseUrls) {
        this.delegate.updateBaseUrls(newBaseUrls);
    }
}
