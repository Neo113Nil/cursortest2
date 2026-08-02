package com.bumptech.glide.load;

import com.bumptech.glide.load.Option;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class Options implements Key {
    public final CachedHashCodeArrayMap values = new CachedHashCodeArrayMap(0);

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.values.equals(((Options) obj).values);
        }
        return false;
    }

    public final Object get(Option option) {
        CachedHashCodeArrayMap cachedHashCodeArrayMap = this.values;
        return cachedHashCodeArrayMap.containsKey(option) ? cachedHashCodeArrayMap.get(option) : option.defaultValue;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.values.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.values + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            CachedHashCodeArrayMap cachedHashCodeArrayMap = this.values;
            if (i >= cachedHashCodeArrayMap.size) {
                return;
            }
            Option option = (Option) cachedHashCodeArrayMap.keyAt(i);
            Object valueAt = this.values.valueAt(i);
            Option.CacheKeyUpdater cacheKeyUpdater = option.cacheKeyUpdater;
            if (option.keyBytes == null) {
                option.keyBytes = option.key.getBytes(Key.CHARSET);
            }
            cacheKeyUpdater.update(option.keyBytes, valueAt, messageDigest);
            i++;
        }
    }
}
