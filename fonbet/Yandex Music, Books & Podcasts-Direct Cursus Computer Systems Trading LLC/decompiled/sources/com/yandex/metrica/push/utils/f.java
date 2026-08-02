package com.yandex.metrica.push.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import com.yandex.metrica.push.common.model.BasePushMessage;
import com.yandex.metrica.push.common.utils.CoreUtils;
import java.io.Closeable;
import java.io.InputStream;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f {
    public static Bitmap a(Context context, int i, float f, float f2) {
        float f3 = context.getResources().getDisplayMetrics().density;
        Drawable a = a(context, Integer.valueOf(i));
        if (a == null) {
            return null;
        }
        Rect bounds = a.getBounds();
        float f4 = f * f3;
        float f5 = f2 * f3;
        if (f5 <= 0.0f || f4 <= 0.0f) {
            int intrinsicWidth = a.getIntrinsicWidth();
            int intrinsicHeight = a.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = bounds.width();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = bounds.height();
            }
            if (f5 <= 0.0f && f4 <= 0.0f) {
                f4 = intrinsicWidth;
                f5 = intrinsicHeight;
            } else if (f5 <= 0.0f && f4 > 0.0f && intrinsicWidth > 0) {
                f5 = (intrinsicHeight * f4) / intrinsicWidth;
            } else if (f5 > 0.0f && f4 <= 0.0f && intrinsicHeight > 0) {
                f4 = (intrinsicWidth * f5) / intrinsicHeight;
            }
        }
        if (f4 <= 0.0f || f5 <= 0.0f) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) f4, (int) f5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        a.draw(canvas);
        a.setBounds(bounds);
        return createBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer b(Context context, String str) {
        Integer valueOf;
        InputStream inputStream;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                valueOf = Integer.valueOf(parseInt);
                try {
                    inputStream = context.getResources().openRawResource(parseInt);
                } catch (Resources.NotFoundException unused) {
                    inputStream = null;
                }
            } catch (NumberFormatException unused2) {
                valueOf = Integer.valueOf(CoreUtils.getIdentifierForType(context, str, "raw"));
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.intValue() == 0) {
            return null;
        }
        return valueOf;
    }

    public static <T> T b(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        if (a(r3, r1) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer a(Context context, String str) {
        Integer valueOf;
        if (str != null) {
            try {
                valueOf = Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                int identifierForType = CoreUtils.getIdentifierForType(context, str, "drawable");
                valueOf = identifierForType == 0 ? Integer.valueOf(CoreUtils.getIdentifierForType(context, str, "mipmap")) : Integer.valueOf(identifierForType);
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.intValue() == 0) {
            return null;
        }
        return valueOf;
    }

    private static Drawable a(Context context, Integer num) {
        try {
            if (a(21)) {
                return l.a(context, num);
            }
            return context.getResources().getDrawable(num.intValue());
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static boolean a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int a(int i, boolean z) {
        if (a(31)) {
            return h.a(i, z);
        }
        return a(23) ? g.a(i, z) : i;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static String a(Bundle bundle) {
        try {
            JSONObject root = new BasePushMessage(bundle).getRoot();
            if (root == null || !root.has("a")) {
                return null;
            }
            return root.getString("a");
        } catch (Throwable unused) {
            return null;
        }
    }
}
