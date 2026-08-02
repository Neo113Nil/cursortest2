package ru.yandex.video.m3.cache;

import defpackage.pb7;
import defpackage.ra7;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.data.PlaybackParameters;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/cache/CacheProvider;", "", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "Lra7;", "getCache", "(Lru/yandex/video/m3/data/PlaybackParameters;)Lra7;", "Lpb7;", "getCacheKeyFactory", "(Lru/yandex/video/m3/data/PlaybackParameters;)Lpb7;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CacheProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static pb7 getCacheKeyFactory(CacheProvider cacheProvider, PlaybackParameters playbackParameters) {
            return CacheProvider.super.getCacheKeyFactory(playbackParameters);
        }
    }

    static /* synthetic */ ra7 getCache$default(CacheProvider cacheProvider, PlaybackParameters playbackParameters, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: getCache");
            return null;
        }
        if ((i & 1) != 0) {
            playbackParameters = null;
        }
        return cacheProvider.getCache(playbackParameters);
    }

    static /* synthetic */ pb7 getCacheKeyFactory$default(CacheProvider cacheProvider, PlaybackParameters playbackParameters, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: getCacheKeyFactory");
            return null;
        }
        if ((i & 1) != 0) {
            playbackParameters = null;
        }
        return cacheProvider.getCacheKeyFactory(playbackParameters);
    }

    ra7 getCache(PlaybackParameters playbackParameters);

    default pb7 getCacheKeyFactory(PlaybackParameters playbackParameters) {
        return null;
    }
}
