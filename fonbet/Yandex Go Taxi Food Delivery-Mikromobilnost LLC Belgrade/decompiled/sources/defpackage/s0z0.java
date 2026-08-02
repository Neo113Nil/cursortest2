package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.images.utils.ScaleMode;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes11.dex */
public abstract class s0z0 {
    public static final Paint a = new Paint(3);

    public static Bitmap a(Context context, Uri uri) {
        Bitmap decodeStream;
        Bitmap bitmap;
        int i;
        int k = d5b1.k(context, uri);
        Point j = d5b1.j(context, uri, k);
        int i2 = j.x;
        double d = 1000000.0f / (i2 * j.y);
        int min = Math.min(i2, (int) Math.round(Math.max(1.0d, Math.sqrt(d) * i2)));
        int i3 = j.y;
        int min2 = Math.min(i3, (int) Math.round(Math.max(1.0d, Math.sqrt(d) * i3)));
        int l = d5b1.l(j.x, j.y, min, min2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = l;
        try {
            if ("file".equals(uri.getScheme())) {
                bitmap = BitmapFactory.decodeFile(uri.getPath(), options);
            } else {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                    } finally {
                    }
                } else {
                    decodeStream = null;
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
                bitmap = decodeStream;
            }
            if (bitmap == null) {
                throw new IOException("Can't decode bitmap");
            }
            switch (k) {
                case 3:
                case 4:
                    i = SubsamplingScaleImageView.ORIENTATION_180;
                    break;
                case 5:
                case 6:
                    i = 90;
                    break;
                case 7:
                case 8:
                    i = SubsamplingScaleImageView.ORIENTATION_270;
                    break;
                default:
                    i = 0;
                    break;
            }
            try {
                return b(bitmap, min, min2, i, null, ScaleMode.FIT_CENTER);
            } catch (OutOfMemoryError e) {
                dac.g("Out of memory while extracting thumbnail", e);
                return null;
            }
        } catch (OutOfMemoryError e2) {
            dac.g("Out of memory while creating bitmap", e2);
            return null;
        }
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2, int i3, Matrix matrix, ScaleMode scaleMode) {
        boolean z = i3 % SubsamplingScaleImageView.ORIENTATION_180 != 0;
        int height = z ? bitmap.getHeight() : bitmap.getWidth();
        int width = z ? bitmap.getWidth() : bitmap.getHeight();
        if (scaleMode == ScaleMode.FIT_CENTER) {
            float f = height;
            float f2 = width;
            float min = Math.min(i / f, i2 / f2);
            if (min <= 1.0f) {
                height = Math.round(f * min);
                width = Math.round(f2 * min);
            }
        } else {
            if (scaleMode != ScaleMode.CENTER_CROP) {
                ny61.r("Unreachable");
                return null;
            }
            float f3 = i / i2;
            if (height / width < f3) {
                int min2 = Math.min(height, i);
                height = min2;
                width = Math.round(min2 / f3);
            } else {
                int min3 = Math.min(width, i2);
                width = min3;
                height = Math.round(min3 * f3);
            }
        }
        Matrix c = c(bitmap, height, width, i3);
        if (matrix != null) {
            c.preConcat(matrix);
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(height, width, config);
        new Canvas(createBitmap).drawBitmap(bitmap, c, a);
        return createBitmap;
    }

    public static Matrix c(Bitmap bitmap, int i, int i2, int i3) {
        boolean z = i3 % SubsamplingScaleImageView.ORIENTATION_180 != 0;
        float height = z ? bitmap.getHeight() : bitmap.getWidth();
        float width = z ? bitmap.getWidth() : bitmap.getHeight();
        float f = height / width;
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        Matrix matrix = new Matrix();
        float f5 = f > f4 ? f3 / width : f2 / height;
        matrix.postScale(f5, f5);
        matrix.postTranslate((-((bitmap.getWidth() * f5) - f2)) / 2.0f, (-((f5 * bitmap.getHeight()) - f3)) / 2.0f);
        if (i3 != 0) {
            matrix.postRotate(i3, f2 / 2.0f, f3 / 2.0f);
        }
        return matrix;
    }
}
