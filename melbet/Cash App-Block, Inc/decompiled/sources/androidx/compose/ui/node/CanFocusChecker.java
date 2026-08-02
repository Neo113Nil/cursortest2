package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public final class CanFocusChecker implements FocusProperties {
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();
    public static Boolean canFocusValue;

    @Override // androidx.compose.ui.focus.FocusProperties
    public final boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw Boxes$$ExternalSyntheticOutline1.m1150m("canFocus is read before it is written");
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void setCanFocus(boolean z) {
        canFocusValue = Boolean.valueOf(z);
    }
}
