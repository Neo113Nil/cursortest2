package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ic0 {
    public static final ThreadLocal qoPGr6Ce = new ThreadLocal();
    public static final int[] NCTxEWno = {-16842910};
    public static final int[] MdtA4re8 = {R.attr.state_focused};
    public static final int[] wxUZMvaN = {R.attr.state_pressed};
    public static final int[] VgvYg0wo = {R.attr.state_checked};
    public static final int[] P7K7Inc8 = new int[0];
    public static final int[] b2ZJblxo = new int[1];

    public static int MdtA4re8(Context context, int i) {
        int[] iArr = b2ZJblxo;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int NCTxEWno(Context context, int i) {
        ColorStateList wxUZMvaN2 = wxUZMvaN(context, i);
        if (wxUZMvaN2 != null && wxUZMvaN2.isStateful()) {
            return wxUZMvaN2.getColorForState(NCTxEWno, wxUZMvaN2.getDefaultColor());
        }
        ThreadLocal threadLocal = qoPGr6Ce;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return g6.wxUZMvaN(MdtA4re8(context, i), Math.round(Color.alpha(r4) * f));
    }

    public static void qoPGr6Ce(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z00.eVhOlqcC);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList wxUZMvaN(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = b2ZJblxo;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = w30.RXQxj5Oe(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
