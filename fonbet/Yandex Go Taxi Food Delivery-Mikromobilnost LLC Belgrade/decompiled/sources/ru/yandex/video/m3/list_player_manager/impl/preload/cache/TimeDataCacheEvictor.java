package ru.yandex.video.m3.list_player_manager.impl.preload.cache;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0011\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/preload/cache/TimeDataCacheEvictor;", "T", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCacheEvictor;", "", "maxCacheTimeMs", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "<init>", "(JLru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "cache", "", "key", "Lzy11;", "evictCache", "(Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Ljava/lang/String;)V", "onSet", "onGet", "onRemove", "(Ljava/lang/String;)V", "J", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Ljava/util/concurrent/ConcurrentHashMap;", "cacheTimestamp", "Ljava/util/concurrent/ConcurrentHashMap;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeDataCacheEvictor<T> implements DataCacheEvictor<T> {
    public static final int $stable = 8;
    private final ConcurrentHashMap<String, Long> cacheTimestamp;
    private final long maxCacheTimeMs;
    private final TimeProvider timeProvider;

    public TimeDataCacheEvictor(long j, TimeProvider timeProvider) {
        this.maxCacheTimeMs = j;
        this.timeProvider = timeProvider;
        this.cacheTimestamp = new ConcurrentHashMap<>();
    }

    private final void evictCache(DataCache<?> cache, String key) {
        onRemove(key);
        cache.remove(key);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCacheEvictor
    public void onGet(DataCache<T> cache, String key) {
        Long l = this.cacheTimestamp.get(key);
        if (l == null || this.timeProvider.currentTimeMillis() - l.longValue() <= this.maxCacheTimeMs) {
            return;
        }
        evictCache(cache, key);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCacheEvictor
    public void onRemove(String key) {
        this.cacheTimestamp.remove(key);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCacheEvictor
    public void onSet(DataCache<T> cache, String key) {
        this.cacheTimestamp.put(key, Long.valueOf(this.timeProvider.currentTimeMillis()));
    }

    public /* synthetic */ TimeDataCacheEvictor(long j, TimeProvider timeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? new SystemTimeProvider() : timeProvider);
    }
}
