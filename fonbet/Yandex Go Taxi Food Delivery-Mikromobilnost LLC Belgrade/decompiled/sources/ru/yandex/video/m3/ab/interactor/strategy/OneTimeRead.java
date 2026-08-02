package ru.yandex.video.m3.ab.interactor.strategy;

import defpackage.jl40;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.repository.ReadOnlyAbConfigRepository;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/ab/interactor/strategy/OneTimeRead;", "Lru/yandex/video/m3/ab/interactor/strategy/ReadConfigStrategy;", "initialAbConfig", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "(Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "abConfig", "canUpdateAbConfig", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getConfig", "readOnlyAbConfigRepository", "Lru/yandex/video/m3/ab/repository/ReadOnlyAbConfigRepository;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OneTimeRead implements ReadConfigStrategy {
    public static final int $stable = 8;
    private volatile AbConfigWithMeta abConfig;
    private final AtomicBoolean canUpdateAbConfig = new AtomicBoolean(true);

    public OneTimeRead(AbConfigWithMeta abConfigWithMeta) {
        this.abConfig = abConfigWithMeta;
    }

    @Override // ru.yandex.video.m3.ab.interactor.strategy.ReadConfigStrategy
    public synchronized AbConfigWithMeta getConfig(ReadOnlyAbConfigRepository readOnlyAbConfigRepository) {
        try {
            if (this.canUpdateAbConfig.get()) {
                AbConfigWithMeta config = readOnlyAbConfigRepository.getConfig();
                if (!jl40.l(config, this.abConfig)) {
                    this.abConfig = config;
                    this.canUpdateAbConfig.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.abConfig;
    }
}
