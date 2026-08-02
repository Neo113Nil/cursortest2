package ru.yandex.video.m3.ab.interactor.strategy;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.repository.ReadOnlyAbConfigRepository;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/ab/interactor/strategy/CachedOnly;", "Lru/yandex/video/m3/ab/interactor/strategy/ReadConfigStrategy;", "abConfigWithMeta", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "(Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "getConfig", "readOnlyAbConfigRepository", "Lru/yandex/video/m3/ab/repository/ReadOnlyAbConfigRepository;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedOnly implements ReadConfigStrategy {
    public static final int $stable = 8;
    private final AbConfigWithMeta abConfigWithMeta;

    public CachedOnly(AbConfigWithMeta abConfigWithMeta) {
        this.abConfigWithMeta = abConfigWithMeta;
    }

    @Override // ru.yandex.video.m3.ab.interactor.strategy.ReadConfigStrategy
    public AbConfigWithMeta getConfig(ReadOnlyAbConfigRepository readOnlyAbConfigRepository) {
        return this.abConfigWithMeta;
    }
}
