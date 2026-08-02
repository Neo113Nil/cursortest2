package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class CenterCrop extends BitmapTransformation {
    public static final byte[] ID_BYTES = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(Key.CHARSET);

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof CenterCrop;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = TransformationUtils.DEFAULT_PAINT;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width2 = bitmap.getWidth() * i2;
        int height2 = bitmap.getHeight() * i;
        float f = RecyclerView.DECELERATION_RATE;
        if (width2 > height2) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap bitmap2 = bitmapPool.get(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        TransformationUtils.applyMatrix(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
