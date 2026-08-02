package androidx.compose.ui.window;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes3.dex */
public class PopupLayoutHelperImpl29 {
    public void getWindowBounds(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
