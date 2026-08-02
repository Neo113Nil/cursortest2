package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public abstract class BitmapTransformation implements Transformation {
    public abstract Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2);

    @Override // com.bumptech.glide.load.Transformation
    public final Resource transform(Context context, Resource resource, int i, int i2) {
        if (!Util.isValidDimensions(i, i2)) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(i, i2, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
            return null;
        }
        BitmapPool bitmapPool = Glide.get(context).bitmapPool;
        Bitmap bitmap = (Bitmap) resource.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap transform = transform(bitmapPool, bitmap, i, i2);
        return bitmap.equals(transform) ? resource : BitmapResource.obtain(transform, bitmapPool);
    }
}
