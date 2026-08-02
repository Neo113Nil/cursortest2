package com.bumptech.glide.util;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class Util {
    public static volatile Handler mainThreadHandler;
    public static final char[] HEX_CHAR_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] SHA_256_CHARS = new char[64];
    public static final Executors$1 MAIN_THREAD_EXECUTOR = new Executors$1(0);
    public static final Executors$1 DIRECT_EXECUTOR = new Executors$1(2);

    /* renamed from: com.bumptech.glide.util.Util$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void assertMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("You must call this method on the main thread");
    }

    public static boolean bothNullOrEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void checkArgument(String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static int getBitmapByteSize(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static int getBytesPerPixel(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static ArrayList getSnapshot(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler getUiThreadHandler() {
        if (mainThreadHandler == null) {
            synchronized (Util.class) {
                try {
                    if (mainThreadHandler == null) {
                        mainThreadHandler = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return mainThreadHandler;
    }

    public static int hashCode(int i, Object obj) {
        return hashCode(obj == null ? 0 : obj.hashCode(), i);
    }

    public static boolean isValidDimensions(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static void checkNotNull(Object obj) {
        checkNotNull(obj, "Argument must not be null");
    }

    public static int hashCode(int i, int i2) {
        return (i2 * 31) + i;
    }
}
