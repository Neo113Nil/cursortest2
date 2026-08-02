package ru.yandex.video.m3.ab.interactor;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.repository.ReadOnlyAbConfigRepository;
import ru.yandex.video.m3.ab.util.VsidToAbConfigHolder;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/ab/interactor/SimpleInteractor;", "Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;", "Lru/yandex/video/m3/ab/repository/ReadOnlyAbConfigRepository;", "readOnlyAbConfigRepository", "Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;", "vsidToConfigHolder", "<init>", "(Lru/yandex/video/m3/ab/repository/ReadOnlyAbConfigRepository;Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;)V", "", "vsid", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "tryToGetCachedByVsidConfig", "(Ljava/lang/String;)Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "Lzy11;", "startUpdates$video_player_internalRelease", "()V", "startUpdates", "stopUpdates$video_player_internalRelease", "stopUpdates", "getConfig$video_player_internalRelease", "getConfig", "Lru/yandex/video/m3/ab/repository/ReadOnlyAbConfigRepository;", "Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimpleInteractor extends AbConfigInteractor {
    public static final int $stable = 8;
    private final ReadOnlyAbConfigRepository readOnlyAbConfigRepository;
    private final VsidToAbConfigHolder vsidToConfigHolder;

    public SimpleInteractor(ReadOnlyAbConfigRepository readOnlyAbConfigRepository, VsidToAbConfigHolder vsidToAbConfigHolder) {
        this.readOnlyAbConfigRepository = readOnlyAbConfigRepository;
        this.vsidToConfigHolder = vsidToAbConfigHolder;
    }

    @Override // ru.yandex.video.m3.ab.interactor.AbConfigInteractor
    public synchronized AbConfigWithMeta getConfig$video_player_internalRelease(String vsid) {
        AbConfigWithMeta tryToGetCachedByVsidConfig;
        tryToGetCachedByVsidConfig = tryToGetCachedByVsidConfig(vsid);
        if (tryToGetCachedByVsidConfig == null) {
            tryToGetCachedByVsidConfig = this.readOnlyAbConfigRepository.getConfig();
            if (!canUseConfig(tryToGetCachedByVsidConfig.getFetchTimestamp())) {
                tryToGetCachedByVsidConfig = AbConfigWithMeta.INSTANCE.getDEFAULT();
            }
            this.vsidToConfigHolder.set(vsid, tryToGetCachedByVsidConfig);
        }
        return tryToGetCachedByVsidConfig;
    }

    @Override // ru.yandex.video.m3.ab.interactor.AbConfigInteractor
    public void startUpdates$video_player_internalRelease() {
    }

    @Override // ru.yandex.video.m3.ab.interactor.AbConfigInteractor
    public void stopUpdates$video_player_internalRelease() {
    }

    @Override // ru.yandex.video.m3.ab.interactor.AbConfigInteractor
    public AbConfigWithMeta tryToGetCachedByVsidConfig(String vsid) {
        return this.vsidToConfigHolder.get(vsid);
    }
}
