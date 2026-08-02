package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class ResourceCacheKey implements Key {
    public static final LruCache RESOURCE_CLASS_BYTES = new LruCache(50);
    public final LruArrayPool arrayPool;
    public final Class decodedResourceClass;
    public final int height;
    public final Options options;
    public final Key signature;
    public final Key sourceKey;
    public final Transformation transformation;
    public final int width;

    public ResourceCacheKey(LruArrayPool lruArrayPool, Key key, Key key2, int i, int i2, Transformation transformation, Class cls, Options options) {
        this.arrayPool = lruArrayPool;
        this.sourceKey = key;
        this.signature = key2;
        this.width = i;
        this.height = i2;
        this.transformation = transformation;
        this.decodedResourceClass = cls;
        this.options = options;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof ResourceCacheKey) {
            ResourceCacheKey resourceCacheKey = (ResourceCacheKey) obj;
            if (this.height == resourceCacheKey.height && this.width == resourceCacheKey.width && Util.bothNullOrEqual(this.transformation, resourceCacheKey.transformation) && this.decodedResourceClass.equals(resourceCacheKey.decodedResourceClass) && this.sourceKey.equals(resourceCacheKey.sourceKey) && this.signature.equals(resourceCacheKey.signature) && this.options.equals(resourceCacheKey.options)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        int hashCode = ((((this.signature.hashCode() + (this.sourceKey.hashCode() * 31)) * 31) + this.width) * 31) + this.height;
        Transformation transformation = this.transformation;
        if (transformation != null) {
            hashCode = (hashCode * 31) + transformation.hashCode();
        }
        int hashCode2 = this.decodedResourceClass.hashCode();
        return this.options.values.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.sourceKey + ", signature=" + this.signature + ", width=" + this.width + ", height=" + this.height + ", decodedResourceClass=" + this.decodedResourceClass + ", transformation='" + this.transformation + "', options=" + this.options + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Object forKey;
        LruArrayPool lruArrayPool = this.arrayPool;
        synchronized (lruArrayPool) {
            LruArrayPool.KeyPool keyPool = (LruArrayPool.KeyPool) lruArrayPool.keyPool;
            Poolable poolable = (Poolable) ((ArrayDeque) keyPool.data).poll();
            if (poolable == null) {
                poolable = keyPool.create();
            }
            LruArrayPool.Key key = (LruArrayPool.Key) poolable;
            key.size = 8;
            key.arrayClass = byte[].class;
            forKey = lruArrayPool.getForKey(key, byte[].class);
        }
        byte[] bArr = (byte[]) forKey;
        ByteBuffer.wrap(bArr).putInt(this.width).putInt(this.height).array();
        this.signature.updateDiskCacheKey(messageDigest);
        this.sourceKey.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        Transformation transformation = this.transformation;
        if (transformation != null) {
            transformation.updateDiskCacheKey(messageDigest);
        }
        this.options.updateDiskCacheKey(messageDigest);
        LruCache lruCache = RESOURCE_CLASS_BYTES;
        Class cls = this.decodedResourceClass;
        byte[] bArr2 = (byte[]) lruCache.get(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(Key.CHARSET);
            lruCache.put(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.arrayPool.put(bArr);
    }
}
