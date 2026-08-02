package ru.yandex.video.m3.ott.ott;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactoryImpl;", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "drmServiceConfig", "Lru/yandex/video/m3/ott/ott/DrmServiceConfig;", "(Lru/yandex/video/m3/ott/ott/DrmServiceConfig;)V", "create", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "drmConfig", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttMediaDrmCallbackDelegateFactoryImpl implements OttMediaDrmCallbackDelegateFactory {
    public static final int $stable = 0;
    private final DrmServiceConfig drmServiceConfig;

    public OttMediaDrmCallbackDelegateFactoryImpl(DrmServiceConfig drmServiceConfig) {
        this.drmServiceConfig = drmServiceConfig;
    }

    @Override // ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory
    public MediaDrmCallbackDelegate create(DrmProxy drmConfig) {
        return new OttMediaDrmCallbackDelegate(this.drmServiceConfig, drmConfig);
    }
}
