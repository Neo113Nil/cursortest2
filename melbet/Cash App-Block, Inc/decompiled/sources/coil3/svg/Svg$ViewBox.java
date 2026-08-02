package coil3.svg;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class Svg$ViewBox {
    public final float bottom;
    public final float left;
    public final float right;
    public final float top;

    public Svg$ViewBox(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Svg$ViewBox)) {
            return false;
        }
        Svg$ViewBox svg$ViewBox = (Svg$ViewBox) obj;
        return Float.compare(this.left, svg$ViewBox.left) == 0 && Float.compare(this.top, svg$ViewBox.top) == 0 && Float.compare(this.right, svg$ViewBox.right) == 0 && Float.compare(this.bottom, svg$ViewBox.bottom) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.bottom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.right, CameraState$Type$EnumUnboxingLocalUtility.m(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ViewBox(left=", this.left, ", top=", this.top, ", right=");
        m.append(this.right);
        m.append(", bottom=");
        m.append(this.bottom);
        m.append(")");
        return m.toString();
    }
}
