package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes4.dex */
public final class EngineKey implements Key {
    public int hashCode;
    public final int height;
    public final Object model;
    public final Options options;
    public final Class resourceClass;
    public final Key signature;
    public final Class transcodeClass;
    public final Map transformations;
    public final int width;

    public EngineKey(Object obj, Key key, int i, int i2, Map map, Class cls, Class cls2, Options options) {
        Util.checkNotNull(obj, "Argument must not be null");
        this.model = obj;
        this.signature = key;
        this.width = i;
        this.height = i2;
        Util.checkNotNull(map, "Argument must not be null");
        this.transformations = map;
        Util.checkNotNull(cls, "Resource class must not be null");
        this.resourceClass = cls;
        Util.checkNotNull(cls2, "Transcode class must not be null");
        this.transcodeClass = cls2;
        Util.checkNotNull(options, "Argument must not be null");
        this.options = options;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof EngineKey) {
            EngineKey engineKey = (EngineKey) obj;
            if (this.model.equals(engineKey.model) && this.signature.equals(engineKey.signature) && this.height == engineKey.height && this.width == engineKey.width && this.transformations.equals(engineKey.transformations) && this.resourceClass.equals(engineKey.resourceClass) && this.transcodeClass.equals(engineKey.transcodeClass) && this.options.equals(engineKey.options)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        if (this.hashCode == 0) {
            int hashCode = this.model.hashCode();
            this.hashCode = hashCode;
            int hashCode2 = ((((this.signature.hashCode() + (hashCode * 31)) * 31) + this.width) * 31) + this.height;
            this.hashCode = hashCode2;
            int hashCode3 = this.transformations.hashCode() + (hashCode2 * 31);
            this.hashCode = hashCode3;
            int hashCode4 = this.resourceClass.hashCode() + (hashCode3 * 31);
            this.hashCode = hashCode4;
            int hashCode5 = this.transcodeClass.hashCode() + (hashCode4 * 31);
            this.hashCode = hashCode5;
            this.hashCode = this.options.values.hashCode() + (hashCode5 * 31);
        }
        return this.hashCode;
    }

    public final String toString() {
        return "EngineKey{model=" + this.model + ", width=" + this.width + ", height=" + this.height + ", resourceClass=" + this.resourceClass + ", transcodeClass=" + this.transcodeClass + ", signature=" + this.signature + ", hashCode=" + this.hashCode + ", transformations=" + this.transformations + ", options=" + this.options + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
