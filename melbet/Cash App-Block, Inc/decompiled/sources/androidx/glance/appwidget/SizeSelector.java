package androidx.glance.appwidget;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class SizeSelector {
    public final int height;
    public final int width;

    public SizeSelector(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeSelector)) {
            return false;
        }
        SizeSelector sizeSelector = (SizeSelector) obj;
        return this.width == sizeSelector.width && this.height == sizeSelector.height;
    }

    public final int hashCode() {
        return CameraSelector$$ExternalSyntheticOutline0.ordinal(this.height) + (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.width) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + Fragment$5$$ExternalSyntheticOutline0.stringValueOf$3(this.width) + ", height=" + Fragment$5$$ExternalSyntheticOutline0.stringValueOf$3(this.height) + ')';
    }
}
