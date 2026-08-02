package androidx.compose.ui.window;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* loaded from: classes3.dex */
public final class Api21Impl {
    public static final Api21Impl INSTANCE = new Api21Impl();

    public final int getMaxDialogHeightExcludingSystemBarInsets(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        int i3 = rect.bottom;
        return i - (i2 + (i3 > i ? i3 - i : 0));
    }
}
