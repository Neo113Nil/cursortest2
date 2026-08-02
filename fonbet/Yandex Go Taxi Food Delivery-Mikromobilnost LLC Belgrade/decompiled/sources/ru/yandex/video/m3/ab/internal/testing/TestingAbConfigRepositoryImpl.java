package ru.yandex.video.m3.ab.internal.testing;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.internal.SticknessHolderImpl;
import ru.yandex.video.m3.ab.repository.AbConfigRepository;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/ab/internal/testing/TestingAbConfigRepositoryImpl;", "Lru/yandex/video/m3/ab/repository/AbConfigRepository;", "actualRepository", "Lru/yandex/video/m3/ab/internal/SticknessHolderImpl;", "sticknessHolderImpl", "<init>", "(Lru/yandex/video/m3/ab/repository/AbConfigRepository;Lru/yandex/video/m3/ab/internal/SticknessHolderImpl;)V", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "getConfig", "()Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "Lzy11;", "invalidate", "()V", "abConfigWithMeta", "updateConfig", "(Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "Lru/yandex/video/m3/ab/repository/AbConfigRepository;", "Lru/yandex/video/m3/ab/internal/SticknessHolderImpl;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TestingAbConfigRepositoryImpl implements AbConfigRepository {
    public static final int $stable = 8;
    private final AbConfigRepository actualRepository;
    private final SticknessHolderImpl sticknessHolderImpl;

    public TestingAbConfigRepositoryImpl(AbConfigRepository abConfigRepository, SticknessHolderImpl sticknessHolderImpl) {
        this.actualRepository = abConfigRepository;
        this.sticknessHolderImpl = sticknessHolderImpl;
    }

    @Override // ru.yandex.video.m3.ab.repository.ReadOnlyAbConfigRepository
    public AbConfigWithMeta getConfig() {
        return this.actualRepository.getConfig();
    }

    @Override // ru.yandex.video.m3.ab.repository.AbConfigRepository
    public void invalidate() {
        this.actualRepository.invalidate();
    }

    @Override // ru.yandex.video.m3.ab.repository.AbConfigRepository
    public void updateConfig(AbConfigWithMeta abConfigWithMeta) {
        this.actualRepository.updateConfig(abConfigWithMeta);
        this.sticknessHolderImpl.onTestidsUpdated$video_player_internalRelease(abConfigWithMeta.getInternalAbConfig().getTestIds());
    }
}
