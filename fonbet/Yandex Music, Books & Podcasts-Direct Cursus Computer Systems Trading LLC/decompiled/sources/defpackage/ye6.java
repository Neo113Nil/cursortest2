package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ye6 {
    public static final ye6 a = new ye6();

    public static Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    public static xqv c(Context context) {
        context.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        kqv h = kqv.h(null, windowManager.getCurrentWindowMetrics().getWindowInsets());
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new xqv(bounds, h);
    }

    @NotNull
    public final kqv b(@NotNull Context context) {
        context.getClass();
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        windowInsets.getClass();
        return kqv.h(null, windowInsets);
    }
}
