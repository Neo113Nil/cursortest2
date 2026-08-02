package P1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2376a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f2377b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f2378c;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = o.f2375a[config.ordinal()];
        int i4 = 1;
        if (i != 1) {
            i4 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i4;
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f2378c == null) {
            synchronized (p.class) {
                try {
                    if (f2378c == null) {
                        f2378c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f2378c;
    }

    public static int g(int i, int i4) {
        return (i4 * 31) + i;
    }

    public static int h(int i, Object obj) {
        return g(obj == null ? 0 : obj.hashCode(), i);
    }

    public static boolean i(int i, int i4) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i4 > 0 || i4 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static void j(Runnable runnable) {
        f().post(runnable);
    }
}
