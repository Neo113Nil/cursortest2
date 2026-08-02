package com.airbnb.lottie.model;

import androidx.collection.LruCache;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes3.dex */
public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final LruCache cache = new LruCache(20);

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.cache.trimToSize(-1);
    }

    public LottieComposition get(String str) {
        if (str == null) {
            return null;
        }
        return (LottieComposition) this.cache.get(str);
    }

    public void put(String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.cache.put(str, lottieComposition);
    }

    public void resize(int i) {
        LruCache lruCache = this.cache;
        lruCache.getClass();
        if (i <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("maxSize <= 0");
            return;
        }
        synchronized (lruCache.lock) {
            lruCache.maxSize = i;
        }
        lruCache.trimToSize(i);
    }
}
