package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1;

/* loaded from: classes.dex */
public interface FocusProperties {

    public final class Companion {
        public static final Rect UnsetFocusRect = new Rect(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    }

    boolean getCanFocus();

    void setCanFocus(boolean z);

    default void setFocusRect(Rect rect) {
    }

    default void setOnEnter(FocusGroupPropertiesNode$onExit$1 focusGroupPropertiesNode$onExit$1) {
    }

    default void setOnExit(FocusGroupPropertiesNode$onExit$1 focusGroupPropertiesNode$onExit$1) {
    }
}
