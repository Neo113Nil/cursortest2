package ru.yandex.video.m3.ott.data.repository.impl;

import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.WatchParams;
import ru.yandex.video.m3.ott.data.net.WatchParamsApi;
import ru.yandex.video.m3.ott.data.repository.WatchParamsRepository;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/WatchParamsRepositoryImpl;", "Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", "watchParamsApi", "Lru/yandex/video/m3/ott/data/net/WatchParamsApi;", "(Lru/yandex/video/m3/ott/data/net/WatchParamsApi;)V", "getWatchParams", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/dto/WatchParams;", "contentId", "", "sendWatchParams", "watchParams", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WatchParamsRepositoryImpl implements WatchParamsRepository {
    public static final int $stable = 8;
    private final WatchParamsApi watchParamsApi;

    public WatchParamsRepositoryImpl(WatchParamsApi watchParamsApi) {
        this.watchParamsApi = watchParamsApi;
    }

    @Override // ru.yandex.video.m3.ott.data.repository.WatchParamsRepository
    public Future<WatchParams> getWatchParams(String contentId) {
        return this.watchParamsApi.getWatchParams(contentId);
    }

    @Override // ru.yandex.video.m3.ott.data.repository.WatchParamsRepository
    public Future<?> sendWatchParams(WatchParams watchParams) {
        return this.watchParamsApi.sendWatchParams(watchParams);
    }
}
