package ru.yandex.video.m3.player.baseurls;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManagerFactoryImpl;", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManagerFactory;", "()V", "create", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "baseUrls", "", "", "baseUrlInBlacklistAddedListener", "Lru/yandex/video/m3/player/baseurls/BaseUrlInBlacklistAddedListener;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleTrackTypeBaseUrlsManagerFactoryImpl implements SingleTrackTypeBaseUrlsManagerFactory {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.baseurls.SingleTrackTypeBaseUrlsManagerFactory
    public SingleTrackTypeBaseUrlsManager create(List<String> baseUrls, BaseUrlInBlacklistAddedListener baseUrlInBlacklistAddedListener) {
        return new SingleTrackTypeBaseUrlsManagerImpl(baseUrls, baseUrlInBlacklistAddedListener, false);
    }
}
