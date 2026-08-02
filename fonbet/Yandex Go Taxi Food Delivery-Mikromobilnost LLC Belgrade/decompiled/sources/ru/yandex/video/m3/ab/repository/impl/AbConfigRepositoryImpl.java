package ru.yandex.video.m3.ab.repository.impl;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.database.AbConfigDatabase;
import ru.yandex.video.m3.ab.repository.AbConfigRepository;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ab/repository/impl/AbConfigRepositoryImpl;", "Lru/yandex/video/m3/ab/repository/AbConfigRepository;", "Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "abConfigDatabase", "<init>", "(Lru/yandex/video/m3/ab/database/AbConfigDatabase;)V", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "getConfig", "()Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "abConfigWithMeta", "Lzy11;", "updateConfig", "(Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "invalidate", "()V", "Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbConfigRepositoryImpl implements AbConfigRepository {
    public static final int $stable = 8;
    private final AbConfigDatabase abConfigDatabase;

    public AbConfigRepositoryImpl(AbConfigDatabase abConfigDatabase) {
        this.abConfigDatabase = abConfigDatabase;
    }

    @Override // ru.yandex.video.m3.ab.repository.ReadOnlyAbConfigRepository
    public AbConfigWithMeta getConfig() {
        return this.abConfigDatabase.getConfig();
    }

    @Override // ru.yandex.video.m3.ab.repository.AbConfigRepository
    public void invalidate() {
        this.abConfigDatabase.invalidate();
    }

    @Override // ru.yandex.video.m3.ab.repository.AbConfigRepository
    public void updateConfig(AbConfigWithMeta abConfigWithMeta) {
        this.abConfigDatabase.updateConfig(abConfigWithMeta);
    }
}
