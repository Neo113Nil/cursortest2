package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public final class CircleCrop extends BitmapTransformation {
    public static final byte[] ID_BYTES = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(Key.CHARSET);

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof CircleCrop;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return 1101716364;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        Lock lock = TransformationUtils.BITMAP_DRAWABLE_LOCK;
        int min = Math.min(i, i2);
        float f = min;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (config2.equals(bitmap.getConfig())) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmap2).drawBitmap(bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (Paint) null);
        }
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmap3 = bitmapPool.get(min, min, config);
        bitmap3.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap3);
            canvas.drawCircle(f2, f2, f2, TransformationUtils.CIRCLE_CROP_SHAPE_PAINT);
            canvas.drawBitmap(bitmap2, (Rect) null, rectF, TransformationUtils.CIRCLE_CROP_BITMAP_PAINT);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmap2.equals(bitmap)) {
                bitmapPool.put(bitmap2);
            }
            return bitmap3;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
