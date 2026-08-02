package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class vwy0 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final int[] b = {-16842910};
    public static final int[] c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_checked};
    public static final int[] f = new int[0];
    public static final int[] g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n4i0.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(n4i0.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(int i, Context context) {
        ColorStateList d2 = d(i, context);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return lhc.f(c(i, context), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(int i, Context context) {
        int[] iArr = g;
        iArr[0] = i;
        dfz0 f2 = dfz0.f(context, null, iArr);
        try {
            return f2.b.getColor(0, 0);
        } finally {
            f2.g();
        }
    }

    public static ColorStateList d(int i, Context context) {
        int[] iArr = g;
        iArr[0] = i;
        dfz0 f2 = dfz0.f(context, null, iArr);
        try {
            return f2.a(0);
        } finally {
            f2.g();
        }
    }
}
