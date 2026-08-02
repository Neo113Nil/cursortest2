package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes3.dex */
public abstract class Api34StartStylusHandwriting {
    public static final void setEditorBoundsInfo(CursorAnchorInfo.Builder builder, Rect rect) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(ColorKt.toAndroidRectF(rect)).setHandwritingBounds(ColorKt.toAndroidRectF(rect)).build());
    }

    public static void startStylusHandwriting(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
