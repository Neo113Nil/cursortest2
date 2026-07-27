package com.anythink.expressad.foundation.g.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anythink.core.common.v.h;
import com.anythink.expressad.foundation.h.p;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a {
    private static Drawable a(Resources resources, Bitmap bitmap) {
        return new BitmapDrawable(resources, bitmap);
    }

    private static InputStream b(Bitmap bitmap) {
        return h.a(bitmap);
    }

    public static Bitmap a(String str) {
        Bitmap bitmap = null;
        if (!p.a(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inDither = true;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e9) {
            e9.printStackTrace();
            System.gc();
            b.a();
            try {
                options.inPreferredConfig = Bitmap.Config.ARGB_4444;
                bitmap = BitmapFactory.decodeFile(str, options);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return bitmap;
            } catch (OutOfMemoryError e10) {
                e10.printStackTrace();
                return bitmap;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int a(BitmapFactory.Options options, int i, int i6) {
        int min;
        double d2 = options.outWidth;
        double d9 = options.outHeight;
        int ceil = i6 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d2 * d9) / i6));
        if (i == -1) {
            min = 128;
        } else {
            double d10 = i;
            min = (int) Math.min(Math.floor(d2 / d10), Math.floor(d9 / d10));
        }
        if (min >= ceil) {
            if (i6 == -1 && i == -1) {
                return 1;
            }
            if (i != -1) {
                return min;
            }
        }
        return ceil;
    }

    private static Bitmap a(Bitmap bitmap) {
        float f3;
        float f9;
        float f10;
        float f11;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f11 = width / 2;
            f10 = width;
            f3 = 0.0f;
            f9 = f10;
        } else {
            f3 = (width - height) / 2;
            f9 = height;
            f10 = width - f3;
            width = height;
            f11 = height / 2;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            int i = (int) f9;
            Rect rect = new Rect((int) f3, 0, (int) f10, i);
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(rect2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f11, f11, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap a(Context context, int i) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeResource(context.getResources(), i);
        } catch (Exception unused) {
            bitmap = null;
            if (bitmap == null) {
            }
        } catch (OutOfMemoryError unused2) {
            System.gc();
            bitmap = null;
            if (bitmap == null) {
            }
        }
        return bitmap == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8) : bitmap;
    }
}
