package defpackage;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b4 {
    public static final b4 GWasM1elztuh = new b4();

    public final int GWasM1elztuh(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void X1lG3V04pd(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsTypes(i);
    }

    public final void Yi7zF1RB1(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsSides(i);
    }
}
