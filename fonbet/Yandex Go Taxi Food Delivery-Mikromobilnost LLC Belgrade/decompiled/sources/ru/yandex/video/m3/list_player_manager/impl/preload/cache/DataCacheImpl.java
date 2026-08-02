package ru.yandex.video.m3.list_player_manager.impl.preload.cache;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCacheImpl;", "T", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCacheEvictor;", "cacheEvictor", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCacheEvictor;)V", "", "key", Constants.KEY_DATA, "Lzy11;", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "remove", "(Ljava/lang/String;)V", "", "contains", "(Ljava/lang/String;)Z", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCacheEvictor;", "Ljava/util/concurrent/ConcurrentHashMap;", "cachedData", "Ljava/util/concurrent/ConcurrentHashMap;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataCacheImpl<T> implements DataCache<T> {
    public static final int $stable = 8;
    private final DataCacheEvictor<T> cacheEvictor;
    private final ConcurrentHashMap<String, T> cachedData = new ConcurrentHashMap<>();

    public DataCacheImpl(DataCacheEvictor<T> dataCacheEvictor) {
        this.cacheEvictor = dataCacheEvictor;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache
    public boolean contains(String key) {
        return this.cachedData.contains(key);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache
    public T get(String key) {
        this.cacheEvictor.onGet(this, key);
        return this.cachedData.get(key);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache
    public void remove(String key) {
        this.cacheEvictor.onRemove(key);
        this.cachedData.remove(key);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache
    public void set(String key, T data) {
        this.cacheEvictor.onSet(this, key);
        this.cachedData.put(key, data);
    }
}
