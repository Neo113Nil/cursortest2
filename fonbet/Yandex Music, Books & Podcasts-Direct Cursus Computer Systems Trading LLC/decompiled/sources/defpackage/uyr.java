package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class uyr {
    public static final uyr a = new uyr();
    public static final AtomicReference b = new AtomicReference(null);

    public static final DisplayMetrics a(uyr uyrVar, Context context) {
        uyrVar.getClass();
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            jj4.j("null cannot be cast to non-null type android.view.WindowManager");
            return null;
        }
        Rect bounds = ((WindowManager) systemService).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.widthPixels = bounds.width();
        displayMetrics.heightPixels = bounds.height();
        displayMetrics.density = context.getResources().getConfiguration().densityDpi / 160;
        return displayMetrics;
    }

    public static final DisplayMetrics b(uyr uyrVar, Context context) {
        uyrVar.getClass();
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            jj4.j("null cannot be cast to non-null type android.view.WindowManager");
            return null;
        }
        WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        Rect bounds = currentWindowMetrics.getBounds();
        bounds.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.widthPixels = bounds.width();
        displayMetrics.heightPixels = bounds.height();
        displayMetrics.density = currentWindowMetrics.getDensity();
        return displayMetrics;
    }

    public static DisplayMetrics d(Context context) {
        AtomicReference atomicReference = b;
        Object obj = atomicReference.get();
        if (obj == null) {
            synchronized (atomicReference) {
                obj = atomicReference.get();
                if (obj == null) {
                    DisplayMetrics c = a.c(context);
                    atomicReference.set(c);
                    obj = c;
                }
            }
        }
        obj.getClass();
        return (DisplayMetrics) obj;
    }

    public final DisplayMetrics c(Context context) {
        lgq lgqVar;
        lgq lgqVar2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            lgqVar2 = new lgq(1, this, uyr.class, "calcDisplayMetricsSdk34", "calcDisplayMetricsSdk34(Landroid/content/Context;)Landroid/util/DisplayMetrics;", 0, 7);
        } else {
            if (i >= 30) {
                lgqVar = new lgq(1, this, uyr.class, "calcDisplayMetricsSdk30", "calcDisplayMetricsSdk30(Landroid/content/Context;)Landroid/util/DisplayMetrics;", 0, 8);
            } else {
                lgqVar = new lgq(1, this, uyr.class, "calcDisplayMetricsSdk17", "calcDisplayMetricsSdk17(Landroid/content/Context;)Landroid/util/DisplayMetrics;", 0, 9);
            }
            lgqVar2 = lgqVar;
        }
        return (DisplayMetrics) lgqVar2.invoke(context);
    }
}
