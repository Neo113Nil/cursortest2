package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.media3.extractor.text.CueEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public abstract class DrawableToBitmapConverter {
    public static final AnonymousClass1 NO_RECYCLE_BITMAP_POOL = new AnonymousClass1(18);

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter$1, reason: invalid class name */
    public final class AnonymousClass1 extends CueEncoder {
        @Override // androidx.media3.extractor.text.CueEncoder, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
        public final void put(Bitmap bitmap) {
        }
    }

    public static BitmapResource convert(BitmapPool bitmapPool, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = TransformationUtils.BITMAP_DRAWABLE_LOCK;
                    lock.lock();
                    Bitmap bitmap2 = bitmapPool.get(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmap2);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmap2;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            bitmapPool = NO_RECYCLE_BITMAP_POOL;
        }
        return BitmapResource.obtain(bitmap, bitmapPool);
    }
}
