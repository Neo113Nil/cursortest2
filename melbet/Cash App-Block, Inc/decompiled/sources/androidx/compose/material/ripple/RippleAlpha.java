package androidx.compose.material.ripple;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class RippleAlpha {
    public final float draggedAlpha;
    public final float focusedAlpha;
    public final float hoveredAlpha;
    public final float pressedAlpha;

    public RippleAlpha(float f, float f2, float f3, float f4) {
        this.draggedAlpha = f;
        this.focusedAlpha = f2;
        this.hoveredAlpha = f3;
        this.pressedAlpha = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        return this.draggedAlpha == rippleAlpha.draggedAlpha && this.focusedAlpha == rippleAlpha.focusedAlpha && this.hoveredAlpha == rippleAlpha.hoveredAlpha && this.pressedAlpha == rippleAlpha.pressedAlpha;
    }

    public final int hashCode() {
        return Float.hashCode(this.pressedAlpha) + CameraState$Type$EnumUnboxingLocalUtility.m(this.hoveredAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.focusedAlpha, Float.hashCode(this.draggedAlpha) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.draggedAlpha);
        sb.append(", focusedAlpha=");
        sb.append(this.focusedAlpha);
        sb.append(", hoveredAlpha=");
        sb.append(this.hoveredAlpha);
        sb.append(", pressedAlpha=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.pressedAlpha, ')');
    }
}
