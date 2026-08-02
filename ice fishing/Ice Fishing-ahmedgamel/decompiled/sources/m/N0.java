package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.AbstractC4528a;

/* loaded from: classes.dex */
public abstract class N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f39105a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f39106b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f39107c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f39108d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f39109e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f39110f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f39111g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC4528a.f37558j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d9 = d(context, i);
        if (d9 != null && d9.isStateful()) {
            return d9.getColorForState(f39106b, d9.getDefaultColor());
        }
        ThreadLocal threadLocal = f39105a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return G.c.d(c(context, i), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(Context context, int i) {
        int[] iArr = f39111g;
        iArr[0] = i;
        l4.g r9 = l4.g.r(context, null, iArr);
        try {
            return ((TypedArray) r9.f38917v).getColor(0, 0);
        } finally {
            r9.t();
        }
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = f39111g;
        iArr[0] = i;
        l4.g r9 = l4.g.r(context, null, iArr);
        try {
            return r9.h(0);
        } finally {
            r9.t();
        }
    }
}
