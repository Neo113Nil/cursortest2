package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.Result;

/* loaded from: classes7.dex */
public abstract class sj71 {
    public static final am81 a = new am81();

    public static final int a(float f, int i) {
        int i2 = (int) (((100.0f - f) * 255.0f) / 100.0f);
        if (255 <= i2) {
            i2 = 255;
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final int b(View view) {
        int i;
        if (view == null || !view.isShown() || (i = a.a(view).a) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (i * 100) / (height * width);
    }

    public static final float c(float f, int i) {
        return ((i + 0.0f) / f) + 0.5f;
    }

    public static final int d(Context context) {
        return (int) c(context.getResources().getDisplayMetrics().density, f(context));
    }

    public static final boolean e(View view) {
        return !view.isShown() || view.getAlpha() == 0.0f;
    }

    public static final int f(Context context) {
        Object failure;
        int i;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a2 = a081Var2.a(context);
        if (a2 == null || !a2.F0) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                i = bounds.height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                i = displayMetrics.heightPixels;
            }
            failure = Integer.valueOf(i);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object valueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
        if (failure instanceof Result.Failure) {
            failure = valueOf;
        }
        return ((Number) failure).intValue();
    }

    public static final int g(Context context) {
        return (int) c(context.getResources().getDisplayMetrics().density, context.getResources().getDisplayMetrics().widthPixels);
    }
}
