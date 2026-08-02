package ru.yandex.video.m3.ab.interactor.strategy;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.repository.ReadOnlyAbConfigRepository;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/interactor/strategy/MostRecent;", "Lru/yandex/video/m3/ab/interactor/strategy/ReadConfigStrategy;", "()V", "getConfig", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "readOnlyAbConfigRepository", "Lru/yandex/video/m3/ab/repository/ReadOnlyAbConfigRepository;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MostRecent implements ReadConfigStrategy {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.ab.interactor.strategy.ReadConfigStrategy
    public AbConfigWithMeta getConfig(ReadOnlyAbConfigRepository readOnlyAbConfigRepository) {
        return readOnlyAbConfigRepository.getConfig();
    }
}
