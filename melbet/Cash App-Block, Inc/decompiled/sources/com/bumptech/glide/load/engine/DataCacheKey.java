package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class DataCacheKey implements Key {
    public final Key signature;
    public final Key sourceKey;

    public DataCacheKey(Key key, Key key2) {
        this.sourceKey = key;
        this.signature = key2;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof DataCacheKey) {
            DataCacheKey dataCacheKey = (DataCacheKey) obj;
            if (this.sourceKey.equals(dataCacheKey.sourceKey) && this.signature.equals(dataCacheKey.signature)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.signature.hashCode() + (this.sourceKey.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.sourceKey + ", signature=" + this.signature + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.sourceKey.updateDiskCacheKey(messageDigest);
        this.signature.updateDiskCacheKey(messageDigest);
    }
}
