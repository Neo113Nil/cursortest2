package defpackage;

import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class nm {
    public static int AvO7iQsrTN(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int EljAMC1QTz(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static Handler GWasM1elztuh(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static int OOA6hdeuvCS(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int X1lG3V04pd(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static List Yi7zF1RB1(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int xqGvceK5x(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }
}
