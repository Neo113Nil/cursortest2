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
    public static final ThreadLocal f39304a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f39305b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f39306c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f39307d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f39308e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f39309f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f39310g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC4518a.f37826j);
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
            return d2.getColorForState(f39305b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f39304a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f6 = typedValue.getFloat();
        return G.c.d(c(context, i), Math.round(Color.alpha(r4) * f6));
    }

    public static int c(Context context, int i) {
        int[] iArr = f39310g;
        iArr[0] = i;
        Q0 o9 = Q0.o(context, null, iArr);
        try {
            return ((TypedArray) o9.f39326c).getColor(0, 0);
        } finally {
            o9.q();
        }
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = f39310g;
        iArr[0] = i;
        Q0 o9 = Q0.o(context, null, iArr);
        try {
            return o9.f(0);
        } finally {
            o9.q();
        }
    }
}
