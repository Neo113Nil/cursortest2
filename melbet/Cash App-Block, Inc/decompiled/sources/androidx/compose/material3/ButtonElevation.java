package androidx.compose.material3;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ButtonElevation {
    public final float defaultElevation;
    public final float focusedElevation;
    public final float hoveredElevation;
    public final float pressedElevation;

    public ButtonElevation(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        return Dp.m1037equalsimpl0(this.defaultElevation, buttonElevation.defaultElevation) && Dp.m1037equalsimpl0(this.pressedElevation, buttonElevation.pressedElevation) && Dp.m1037equalsimpl0(this.focusedElevation, buttonElevation.focusedElevation) && Dp.m1037equalsimpl0(this.hoveredElevation, buttonElevation.hoveredElevation) && Dp.m1037equalsimpl0(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    public final int hashCode() {
        return Float.hashCode(RecyclerView.DECELERATION_RATE) + CameraState$Type$EnumUnboxingLocalUtility.m(this.hoveredElevation, CameraState$Type$EnumUnboxingLocalUtility.m(this.focusedElevation, CameraState$Type$EnumUnboxingLocalUtility.m(this.pressedElevation, Float.hashCode(this.defaultElevation) * 31, 31), 31), 31);
    }
}
