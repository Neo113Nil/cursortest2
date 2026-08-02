package androidx.compose.ui.text.style;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class TextGeometricTransform {
    public static final TextGeometricTransform None = new TextGeometricTransform(1.0f, RecyclerView.DECELERATION_RATE);
    public final float scaleX;
    public final float skewX;

    public TextGeometricTransform(float f, float f2) {
        this.scaleX = f;
        this.skewX = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX;
    }

    public final int hashCode() {
        return Float.hashCode(this.skewX) + (Float.hashCode(this.scaleX) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.scaleX);
        sb.append(", skewX=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.skewX, ')');
    }
}
