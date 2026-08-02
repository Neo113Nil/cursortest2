package l1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f38862a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public static final L7.b f38863b = new L7.b(9);

    /* renamed from: c, reason: collision with root package name */
    public static final L7.b f38864c = new L7.b(10);

    /* renamed from: d, reason: collision with root package name */
    public static final L7.b f38865d = new L7.b(11);

    /* renamed from: e, reason: collision with root package name */
    public static final L7.b f38866e = new L7.b(12);

    /* renamed from: f, reason: collision with root package name */
    public static final float f38867f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f2, float f9, float f10) {
        PathMeasure pathMeasure = (PathMeasure) f38863b.get();
        Path path2 = (Path) f38864c.get();
        Path path3 = (Path) f38865d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f2 == 1.0f && f9 == 0.0f) && length >= 1.0f && Math.abs((f9 - f2) - 1.0f) >= 0.01d) {
            float f11 = f2 * length;
            float f12 = f9 * length;
            float f13 = f10 * length;
            float min = Math.min(f11, f12) + f13;
            float max = Math.max(f11, f12) + f13;
            if (min >= length && max >= length) {
                min = AbstractC4672g.d(min, length);
                max = AbstractC4672g.d(max, length);
            }
            if (min < 0.0f) {
                min = AbstractC4672g.d(min, length);
            }
            if (max < 0.0f) {
                max = AbstractC4672g.d(max, length);
            }
            if (min == max) {
                path.reset();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e9) {
            throw e9;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i4) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i4) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i4, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
