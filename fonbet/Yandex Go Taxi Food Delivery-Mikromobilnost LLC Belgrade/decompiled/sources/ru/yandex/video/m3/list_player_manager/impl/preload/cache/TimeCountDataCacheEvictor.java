package ru.yandex.video.m3.list_player_manager.impl.preload.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u0015\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/preload/cache/TimeCountDataCacheEvictor;", "T", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCacheEvictor;", "", "maxCacheTimeMs", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "", "maxCount", "<init>", "(JLru/yandex/video/m3/player/impl/utils/TimeProvider;I)V", "", "key", "Lzy11;", "updateQueuePosition", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "cache", "evictCache", "(Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Ljava/lang/String;)V", "onSet", "onGet", "onRemove", "J", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", CA20Status.STATUS_USER_I, "Ljava/util/concurrent/ConcurrentHashMap;", "cacheTimestamp", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "cacheQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeCountDataCacheEvictor<T> implements DataCacheEvictor<T> {
    public static final int $stable = 8;
    private final ConcurrentLinkedQueue<String> cacheQueue;
    private final ConcurrentHashMap<String, Long> cacheTimestamp;
    private final long maxCacheTimeMs;
    private final int maxCount;
    private final TimeProvider timeProvider;

    public TimeCountDataCacheEvictor(long j, TimeProvider timeProvider, int i) {
        this.maxCacheTimeMs = j;
        this.timeProvider = timeProvider;
        this.maxCount = i;
        this.cacheTimestamp = new ConcurrentHashMap<>();
        this.cacheQueue = new ConcurrentLinkedQueue<>();
    }

    private final void evictCache(DataCache<?> cache, String key) {
        onRemove(key);
        cache.remove(key);
    }

    private final void updateQueuePosition(String key) {
        this.cacheQueue.remove(key);
        this.cacheQueue.add(key);
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
        this.cacheQueue.remove(key);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCacheEvictor
    public void onSet(DataCache<T> cache, String key) {
        String poll;
        this.cacheTimestamp.put(key, Long.valueOf(this.timeProvider.currentTimeMillis()));
        if (this.cacheQueue.size() >= this.maxCount && (poll = this.cacheQueue.poll()) != null) {
            evictCache(cache, poll);
        }
        updateQueuePosition(key);
    }

    public /* synthetic */ TimeCountDataCacheEvictor(long j, TimeProvider timeProvider, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? new SystemTimeProvider() : timeProvider, i);
    }
}
