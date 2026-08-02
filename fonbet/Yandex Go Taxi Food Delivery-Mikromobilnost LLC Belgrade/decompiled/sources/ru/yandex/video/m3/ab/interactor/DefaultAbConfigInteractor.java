package ru.yandex.video.m3.ab.interactor;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.interactor.strategy.ReadConfigStrategy;
import ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler;
import ru.yandex.video.m3.ab.repository.AbConfigRepository;
import ru.yandex.video.m3.ab.util.VsidToAbConfigHolder;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/ab/interactor/DefaultAbConfigInteractor;", "Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;", "Lru/yandex/video/m3/ab/repository/AbConfigRepository;", "abConfigRepository", "Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateScheduler;", "abConfigUpdateScheduler", "Lru/yandex/video/m3/ab/interactor/strategy/ReadConfigStrategy;", "readConfigStrategy", "Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;", "vsidToConfigHolder", "<init>", "(Lru/yandex/video/m3/ab/repository/AbConfigRepository;Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateScheduler;Lru/yandex/video/m3/ab/interactor/strategy/ReadConfigStrategy;Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;)V", "", "vsid", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "tryToGetCachedByVsidConfig", "(Ljava/lang/String;)Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "Lzy11;", "startUpdates$video_player_internalRelease", "()V", "startUpdates", "stopUpdates$video_player_internalRelease", "stopUpdates", "getConfig$video_player_internalRelease", "getConfig", "Lru/yandex/video/m3/ab/repository/AbConfigRepository;", "Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateScheduler;", "Lru/yandex/video/m3/ab/interactor/strategy/ReadConfigStrategy;", "Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAbConfigInteractor extends AbConfigInteractor {
    public static final int $stable = 8;
    private final AbConfigRepository abConfigRepository;
    private final AbConfigUpdateScheduler abConfigUpdateScheduler;
    private final ReadConfigStrategy readConfigStrategy;
    private final VsidToAbConfigHolder vsidToConfigHolder;

    public DefaultAbConfigInteractor(AbConfigRepository abConfigRepository, AbConfigUpdateScheduler abConfigUpdateScheduler, ReadConfigStrategy readConfigStrategy, VsidToAbConfigHolder vsidToAbConfigHolder) {
        this.abConfigRepository = abConfigRepository;
        this.abConfigUpdateScheduler = abConfigUpdateScheduler;
        this.readConfigStrategy = readConfigStrategy;
        this.vsidToConfigHolder = vsidToAbConfigHolder;
        abConfigUpdateScheduler.forceUpdate();
    }

    @Override // ru.yandex.video.m3.ab.interactor.AbConfigInteractor
    public synchronized AbConfigWithMeta getConfig$video_player_internalRelease(String vsid) {
        AbConfigWithMeta tryToGetCachedByVsidConfig;
        tryToGetCachedByVsidConfig = tryToGetCachedByVsidConfig(vsid);
        if (tryToGetCachedByVsidConfig == null) {
            tryToGetCachedByVsidConfig = this.readConfigStrategy.getConfig(this.abConfigRepository);
            if (!canUseConfig(tryToGetCachedByVsidConfig.getFetchTimestamp())) {
                this.abConfigRepository.invalidate();
                tryToGetCachedByVsidConfig = AbConfigWithMeta.INSTANCE.getDEFAULT();
            }
            this.vsidToConfigHolder.set(vsid, tryToGetCachedByVsidConfig);
        }
        return tryToGetCachedByVsidConfig;
    }

    @Override // ru.yandex.video.m3.ab.interactor.AbConfigInteractor
    public void startUpdates$video_player_internalRelease() {
        this.abConfigUpdateScheduler.startUpdates();
    }

    @Override // ru.yandex.video.m3.ab.interactor.AbConfigInteractor
    public void stopUpdates$video_player_internalRelease() {
        this.abConfigUpdateScheduler.stopUpdates();
    }

    @Override // ru.yandex.video.m3.ab.interactor.AbConfigInteractor
    public AbConfigWithMeta tryToGetCachedByVsidConfig(String vsid) {
        return this.vsidToConfigHolder.get(vsid);
    }
}
