package ru.yandex.video.m3.ab.interactor.strategy;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00070\u0002¢\u0006\u0002\b\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toImpl", "Lru/yandex/video/m3/ab/interactor/strategy/ReadConfigStrategy;", "", "Lru/yandex/video/m3/ab/UpdateAbConfigStrategy;", "abConfigWithMeta", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilKt {
    public static final ReadConfigStrategy toImpl(int i, AbConfigWithMeta abConfigWithMeta) {
        return i != 0 ? i != 1 ? new CachedOnly(abConfigWithMeta) : new MostRecent() : new OneTimeRead(abConfigWithMeta);
    }
}
