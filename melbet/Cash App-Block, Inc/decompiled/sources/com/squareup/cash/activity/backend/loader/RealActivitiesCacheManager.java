package com.squareup.cash.activity.backend.loader;

import androidx.collection.LruCache;

/* loaded from: classes.dex */
public final class RealActivitiesCacheManager {
    public final LruCache lruCache = new LruCache(7);
    public final LruCache lruCacheSingle = new LruCache(7);

    public static ActivitiesCache take$default(RealActivitiesCacheManager realActivitiesCacheManager, Object obj) {
        ActivitiesCacheManager$take$1 activitiesCacheManager$take$1 = ActivitiesCacheManager$take$1.INSTANCE;
        realActivitiesCacheManager.getClass();
        obj.getClass();
        LruCache lruCache = realActivitiesCacheManager.lruCache;
        ActivitiesCache activitiesCache = (ActivitiesCache) lruCache.get(obj);
        if (activitiesCache != null) {
            return activitiesCache;
        }
        ActivitiesCache activitiesCache2 = (ActivitiesCache) activitiesCacheManager$take$1.invoke();
        lruCache.put(obj, activitiesCache2);
        return activitiesCache2;
    }
}
