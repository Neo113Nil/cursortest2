package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.AbstractC4518a;

/* loaded from: classes.dex */
public abstract class N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f39037a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f39038b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f39039c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f39040d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f39041e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f39042f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f39043g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC4518a.f37596j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d2 = d(context, i);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f39038b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f39037a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        return G.c.d(c(context, i), Math.round(Color.alpha(r4) * f3));
    }

    public static int c(Context context, int i) {
        int[] iArr = f39043g;
        iArr[0] = i;
        j4.g r9 = j4.g.r(context, null, iArr);
        try {
            return ((TypedArray) r9.f38405v).getColor(0, 0);
        } finally {
            r9.t();
        }
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = f39043g;
        iArr[0] = i;
        j4.g r9 = j4.g.r(context, null, iArr);
        try {
            return r9.h(0);
        } finally {
            r9.t();
        }
    }
}
