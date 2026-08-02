package androidx.window.core;

import android.graphics.Rect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class Bounds {
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    static {
        new Bounds(0, 0, 0, 0);
    }

    public Bounds(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        if (i > i3) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Left must be less than or equal to right, left: ", i, i3, ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("top must be less than or equal to bottom, top: ", i2, i4, ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Bounds.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Bounds bounds = (Bounds) obj;
        return this.left == bounds.left && this.top == bounds.top && this.right == bounds.right && this.bottom == bounds.bottom;
    }

    public final int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.left);
        sb.append(',');
        sb.append(this.top);
        sb.append(',');
        sb.append(this.right);
        sb.append(',');
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bottom, "] }", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bounds(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
