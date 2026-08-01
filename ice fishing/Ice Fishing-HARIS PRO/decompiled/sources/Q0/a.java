package Q0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f928a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f929b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f930c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f931d = {R.attr.state_selected};
    public static final int[] e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f932f = a.class.getSimpleName();

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return G.a.d(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(e, 0)) != 0) {
            Log.w(f932f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z2 = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }
}
