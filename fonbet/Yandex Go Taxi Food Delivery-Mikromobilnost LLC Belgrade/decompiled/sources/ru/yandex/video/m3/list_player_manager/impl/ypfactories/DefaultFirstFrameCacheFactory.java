package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCacheEvictor;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCacheImpl;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.TimeDataCacheEvictor;
import ru.yandex.video.m3.list_player_manager.model.FirstFrameData;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultFirstFrameCacheFactory;", "", "cacheEvictor", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCacheEvictor;", "Lru/yandex/video/m3/list_player_manager/model/FirstFrameData;", "(Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCacheEvictor;)V", "create", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultFirstFrameCacheFactory {

    @Deprecated
    public static final long DEFAULT_CACHE_TIME_MS = 3600000;
    private final DataCacheEvictor<FirstFrameData> cacheEvictor;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ DefaultFirstFrameCacheFactory(DataCacheEvictor dataCacheEvictor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TimeDataCacheEvictor(3600000L, null, 2, null) : dataCacheEvictor);
    }

    public final DataCache<FirstFrameData> create() {
        return new DataCacheImpl(this.cacheEvictor);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultFirstFrameCacheFactory$Companion;", "", "()V", "DEFAULT_CACHE_TIME_MS", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultFirstFrameCacheFactory(DataCacheEvictor<FirstFrameData> dataCacheEvictor) {
        this.cacheEvictor = dataCacheEvictor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultFirstFrameCacheFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
