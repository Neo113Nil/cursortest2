package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.collection.ArrayMap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy$2;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$None;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Util;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class BaseRequestOptions implements Cloneable {
    public int fields;
    public boolean isAutoCloneEnabled;
    public boolean isLocked;
    public boolean isTransformationRequired;
    public Resources.Theme theme;
    public boolean useAnimationPool;
    public DiskCacheStrategy$2 diskCacheStrategy = DiskCacheStrategy$2.AUTOMATIC;
    public Priority priority = Priority.NORMAL;
    public boolean isCacheable = true;
    public int overrideHeight = -1;
    public int overrideWidth = -1;
    public Key signature = EmptySignature.EMPTY_KEY;
    public Options options = new Options();
    public CachedHashCodeArrayMap transformations = new CachedHashCodeArrayMap(0);
    public Class resourceClass = Object.class;
    public boolean isScaleOnlyOrNoTransform = true;

    public static boolean isSet(int i, int i2) {
        return (i & i2) != 0;
    }

    public BaseRequestOptions apply(BaseRequestOptions baseRequestOptions) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().apply(baseRequestOptions);
        }
        int i = baseRequestOptions.fields;
        if (isSet(baseRequestOptions.fields, PKIFailureInfo.badCertTemplate)) {
            this.useAnimationPool = baseRequestOptions.useAnimationPool;
        }
        if (isSet(baseRequestOptions.fields, 4)) {
            this.diskCacheStrategy = baseRequestOptions.diskCacheStrategy;
        }
        if (isSet(baseRequestOptions.fields, 8)) {
            this.priority = baseRequestOptions.priority;
        }
        if (isSet(baseRequestOptions.fields, 16)) {
            this.fields &= -33;
        }
        if (isSet(baseRequestOptions.fields, 32)) {
            this.fields &= -17;
        }
        if (isSet(baseRequestOptions.fields, 64)) {
            this.fields &= -129;
        }
        if (isSet(baseRequestOptions.fields, 128)) {
            this.fields &= -65;
        }
        if (isSet(baseRequestOptions.fields, 256)) {
            this.isCacheable = baseRequestOptions.isCacheable;
        }
        if (isSet(baseRequestOptions.fields, 512)) {
            this.overrideWidth = baseRequestOptions.overrideWidth;
            this.overrideHeight = baseRequestOptions.overrideHeight;
        }
        if (isSet(baseRequestOptions.fields, 1024)) {
            this.signature = baseRequestOptions.signature;
        }
        if (isSet(baseRequestOptions.fields, 4096)) {
            this.resourceClass = baseRequestOptions.resourceClass;
        }
        if (isSet(baseRequestOptions.fields, PKIFailureInfo.certRevoked)) {
            this.fields &= -16385;
        }
        if (isSet(baseRequestOptions.fields, 16384)) {
            this.fields &= -8193;
        }
        if (isSet(baseRequestOptions.fields, 32768)) {
            this.theme = baseRequestOptions.theme;
        }
        if (isSet(baseRequestOptions.fields, PKIFailureInfo.unsupportedVersion)) {
            this.isTransformationRequired = baseRequestOptions.isTransformationRequired;
        }
        if (isSet(baseRequestOptions.fields, 2048)) {
            this.transformations.putAll((Map) baseRequestOptions.transformations);
            this.isScaleOnlyOrNoTransform = baseRequestOptions.isScaleOnlyOrNoTransform;
        }
        this.fields |= baseRequestOptions.fields;
        this.options.values.putAll((ArrayMap) baseRequestOptions.options.values);
        selfOrThrowIfLocked();
        return this;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BaseRequestOptions mo1909clone() {
        try {
            BaseRequestOptions baseRequestOptions = (BaseRequestOptions) super.clone();
            Options options = new Options();
            baseRequestOptions.options = options;
            options.values.putAll((ArrayMap) this.options.values);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap(0);
            baseRequestOptions.transformations = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll((Map) this.transformations);
            baseRequestOptions.isLocked = false;
            baseRequestOptions.isAutoCloneEnabled = false;
            return baseRequestOptions;
        } catch (CloneNotSupportedException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public final BaseRequestOptions decode(Class cls) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().decode(cls);
        }
        this.resourceClass = cls;
        this.fields |= 4096;
        selfOrThrowIfLocked();
        return this;
    }

    public final BaseRequestOptions diskCacheStrategy(DiskCacheStrategy$2 diskCacheStrategy$2) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().diskCacheStrategy(diskCacheStrategy$2);
        }
        this.diskCacheStrategy = diskCacheStrategy$2;
        this.fields |= 4;
        selfOrThrowIfLocked();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BaseRequestOptions) {
            return isEquivalentTo((BaseRequestOptions) obj);
        }
        return false;
    }

    public int hashCode() {
        return Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(0, Util.hashCode(0, Util.hashCode(1, Util.hashCode(this.isTransformationRequired ? 1 : 0, Util.hashCode(this.overrideWidth, Util.hashCode(this.overrideHeight, Util.hashCode(this.isCacheable ? 1 : 0, Util.hashCode(Util.hashCode(0, Util.hashCode(Util.hashCode(0, Util.hashCode(Util.hashCode(0, Util.hashCode(Float.floatToIntBits(1.0f), 17)), (Object) null)), (Object) null)), (Object) null)))))))), this.diskCacheStrategy), this.priority), this.options), this.transformations), this.resourceClass), this.signature), this.theme);
    }

    public final boolean isEquivalentTo(BaseRequestOptions baseRequestOptions) {
        baseRequestOptions.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.isCacheable == baseRequestOptions.isCacheable && this.overrideHeight == baseRequestOptions.overrideHeight && this.overrideWidth == baseRequestOptions.overrideWidth && this.isTransformationRequired == baseRequestOptions.isTransformationRequired && this.diskCacheStrategy.equals(baseRequestOptions.diskCacheStrategy) && this.priority == baseRequestOptions.priority && this.options.equals(baseRequestOptions.options) && this.transformations.equals(baseRequestOptions.transformations) && this.resourceClass.equals(baseRequestOptions.resourceClass) && this.signature.equals(baseRequestOptions.signature) && Util.bothNullOrEqual(this.theme, baseRequestOptions.theme);
    }

    public final BaseRequestOptions optionalTransform(DownsampleStrategy$None downsampleStrategy$None, BitmapTransformation bitmapTransformation) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().optionalTransform(downsampleStrategy$None, bitmapTransformation);
        }
        set(DownsampleStrategy$None.OPTION, downsampleStrategy$None);
        return transform(bitmapTransformation, false);
    }

    public final BaseRequestOptions override(int i, int i2) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().override(i, i2);
        }
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.fields |= 512;
        selfOrThrowIfLocked();
        return this;
    }

    public final BaseRequestOptions priority() {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().priority();
        }
        this.priority = Priority.LOW;
        this.fields |= 8;
        selfOrThrowIfLocked();
        return this;
    }

    public final BaseRequestOptions removeOption(Option option) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().removeOption(option);
        }
        this.options.values.remove(option);
        selfOrThrowIfLocked();
        return this;
    }

    public final void selfOrThrowIfLocked() {
        if (this.isLocked) {
            a$$ExternalSyntheticBUOutline0.m$1("You cannot modify locked T, consider clone()");
        }
    }

    public final BaseRequestOptions set(Option option, Object obj) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().set(option, obj);
        }
        Util.checkNotNull(option);
        Util.checkNotNull(obj);
        this.options.values.put(option, obj);
        selfOrThrowIfLocked();
        return this;
    }

    public final BaseRequestOptions signature(Key key) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().signature(key);
        }
        this.signature = key;
        this.fields |= 1024;
        selfOrThrowIfLocked();
        return this;
    }

    public final BaseRequestOptions skipMemoryCache() {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().skipMemoryCache();
        }
        this.isCacheable = false;
        this.fields |= 256;
        selfOrThrowIfLocked();
        return this;
    }

    public final BaseRequestOptions theme(Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().theme(theme);
        }
        this.theme = theme;
        int i = this.fields;
        if (theme != null) {
            this.fields = i | 32768;
            return set(ResourceDrawableDecoder.THEME, theme);
        }
        this.fields = (-32769) & i;
        return removeOption(ResourceDrawableDecoder.THEME);
    }

    public final BaseRequestOptions transform(Transformation transformation, boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().transform(transformation, z);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z);
        transform(Bitmap.class, transformation, z);
        transform(Drawable.class, drawableTransformation, z);
        transform(BitmapDrawable.class, drawableTransformation, z);
        transform(GifDrawable.class, new GifDrawableTransformation(transformation), z);
        selfOrThrowIfLocked();
        return this;
    }

    public final BaseRequestOptions useAnimationPool() {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().useAnimationPool();
        }
        this.useAnimationPool = true;
        this.fields |= PKIFailureInfo.badCertTemplate;
        selfOrThrowIfLocked();
        return this;
    }

    public final BaseRequestOptions transform(CircleCrop circleCrop) {
        DownsampleStrategy$None downsampleStrategy$None = DownsampleStrategy$None.CENTER_INSIDE;
        if (this.isAutoCloneEnabled) {
            return mo1909clone().transform(circleCrop);
        }
        set(DownsampleStrategy$None.OPTION, downsampleStrategy$None);
        return transform(circleCrop, true);
    }

    public final BaseRequestOptions transform(Class cls, Transformation transformation, boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().transform(cls, transformation, z);
        }
        Util.checkNotNull(transformation);
        this.transformations.put(cls, transformation);
        int i = this.fields;
        this.fields = 67584 | i;
        this.isScaleOnlyOrNoTransform = false;
        if (z) {
            this.fields = i | 198656;
            this.isTransformationRequired = true;
        }
        selfOrThrowIfLocked();
        return this;
    }
}
