package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class GifDrawableTransformation implements Transformation {
    public final Transformation wrapped;

    public GifDrawableTransformation(Transformation transformation) {
        Util.checkNotNull(transformation, "Argument must not be null");
        this.wrapped = transformation;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof GifDrawableTransformation) {
            return this.wrapped.equals(((GifDrawableTransformation) obj).wrapped);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.wrapped.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource transform(Context context, Resource resource, int i, int i2) {
        GifDrawable gifDrawable = (GifDrawable) resource.get();
        BitmapResource bitmapResource = new BitmapResource(((GifFrameLoader) gifDrawable.state.frameLoader).firstFrame, Glide.get(context).bitmapPool);
        Transformation transformation = this.wrapped;
        Resource transform = transformation.transform(context, bitmapResource, i, i2);
        if (bitmapResource != transform) {
            bitmapResource.recycle();
        }
        ((GifFrameLoader) gifDrawable.state.frameLoader).setFrameTransformation(transformation, (Bitmap) transform.get());
        return resource;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.wrapped.updateDiskCacheKey(messageDigest);
    }
}
