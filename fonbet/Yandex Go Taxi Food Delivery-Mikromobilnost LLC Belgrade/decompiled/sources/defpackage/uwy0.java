package defpackage;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public abstract class uwy0 {
    public static final void a(Resources.Theme theme, View view) {
        b(theme, view, new TypedValue());
    }

    public static final void b(Resources.Theme theme, View view, TypedValue typedValue) {
        WindowInsetsController windowInsetsController;
        int i = (!theme.resolveAttribute(R.attr.windowLightStatusBar, typedValue, true) || typedValue.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, typedValue, true) && typedValue.data != 0) {
            i |= 16;
        }
        windowInsetsController = view.getWindowInsetsController();
        windowInsetsController.setSystemBarsAppearance(i, 24);
    }
}
