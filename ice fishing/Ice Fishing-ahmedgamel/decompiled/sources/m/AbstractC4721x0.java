package m;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: m.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4721x0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z3) {
        popupWindow.setIsClippedToScreen(z3);
    }
}
