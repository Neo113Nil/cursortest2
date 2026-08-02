package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public class z610 {
    public static TypedValue a(int i, Context context) {
        return b(context.getTheme(), i);
    }

    public static TypedValue b(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean c(Resources.Theme theme, int i, boolean z) {
        TypedValue b = b(theme, i);
        return (b == null || b.type != 18) ? z : b.data != 0;
    }

    public static int d(Context context) {
        int i = eng0.minTouchTargetSize;
        int i2 = org0.mtrl_min_touch_target_size;
        Resources.Theme theme = context.getTheme();
        TypedValue b = b(theme, i);
        float dimension = (b == null || b.type != 5) ? Float.NaN : b.getDimension(theme.getResources().getDisplayMetrics());
        return Float.isNaN(dimension) ? (int) context.getResources().getDimension(i2) : (int) dimension;
    }

    public static TypedValue e(int i, View view) {
        return f(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static TypedValue f(Context context, int i, String str) {
        TypedValue a = a(i, context);
        if (a != null) {
            return a;
        }
        kbs.o("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }
}
