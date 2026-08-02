package androidx.compose.foundation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes3.dex */
public final class BorderStroke {
    public final SolidColor brush;
    public final float width;

    public BorderStroke(float f, SolidColor solidColor) {
        this.width = f;
        this.brush = solidColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return Dp.m1037equalsimpl0(this.width, borderStroke.width) && this.brush.equals(borderStroke.brush);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m172getWidthD9Ej5fM() {
        return this.width;
    }

    public final int hashCode() {
        return this.brush.hashCode() + (Float.hashCode(this.width) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.width, ", brush=", sb);
        sb.append(this.brush);
        sb.append(')');
        return sb.toString();
    }
}
