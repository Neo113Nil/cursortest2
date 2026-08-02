package androidx.window.layout;

import android.graphics.Rect;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class WindowMetrics {
    public final Bounds _bounds;
    public final float density;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect rect, float f) {
        this(new Bounds(rect), f);
        rect.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WindowMetrics.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        return Intrinsics.areEqual(this._bounds, windowMetrics._bounds) && this.density == windowMetrics.density;
    }

    public final Rect getBounds() {
        Bounds bounds = this._bounds;
        bounds.getClass();
        return new Rect(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public final int hashCode() {
        return Float.hashCode(this.density) + (this._bounds.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this._bounds);
        sb.append(", density=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.density, ')');
    }

    public WindowMetrics(Bounds bounds, float f) {
        this._bounds = bounds;
        this.density = f;
    }
}
