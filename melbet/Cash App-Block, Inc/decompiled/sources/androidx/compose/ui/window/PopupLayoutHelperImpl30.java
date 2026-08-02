package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class PopupLayoutHelperImpl30 extends PopupLayoutHelperImpl29 {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl29
    public final void getWindowBounds(Rect rect, View view) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
