package ru.yandex.video.m3.ab.repository.impl;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.database.AbConfigDatabase;
import ru.yandex.video.m3.ab.repository.ReadOnlyAbConfigRepository;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/repository/impl/ReadOnlyAbConfigRepositoryImpl;", "Lru/yandex/video/m3/ab/repository/ReadOnlyAbConfigRepository;", "abConfigDatabase", "Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "(Lru/yandex/video/m3/ab/database/AbConfigDatabase;)V", "getConfig", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReadOnlyAbConfigRepositoryImpl implements ReadOnlyAbConfigRepository {
    public static final int $stable = 8;
    private final AbConfigDatabase abConfigDatabase;

    public ReadOnlyAbConfigRepositoryImpl(AbConfigDatabase abConfigDatabase) {
        this.abConfigDatabase = abConfigDatabase;
    }

    @Override // ru.yandex.video.m3.ab.repository.ReadOnlyAbConfigRepository
    public AbConfigWithMeta getConfig() {
        return this.abConfigDatabase.getConfig();
    }
}
