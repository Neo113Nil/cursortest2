package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class PreferredChildSize {
    public final Size childSizeToScale;
    public final Rect cropRectBeforeScaling;
    public final Size originalSelectedChildSize;

    public PreferredChildSize(Rect rect, Size size, Size size2) {
        size.getClass();
        size2.getClass();
        this.cropRectBeforeScaling = rect;
        this.childSizeToScale = size;
        this.originalSelectedChildSize = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferredChildSize)) {
            return false;
        }
        PreferredChildSize preferredChildSize = (PreferredChildSize) obj;
        return this.cropRectBeforeScaling.equals(preferredChildSize.cropRectBeforeScaling) && Intrinsics.areEqual(this.childSizeToScale, preferredChildSize.childSizeToScale) && Intrinsics.areEqual(this.originalSelectedChildSize, preferredChildSize.originalSelectedChildSize);
    }

    public final int hashCode() {
        return this.originalSelectedChildSize.hashCode() + ((this.childSizeToScale.hashCode() + (this.cropRectBeforeScaling.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.cropRectBeforeScaling + ", childSizeToScale=" + this.childSizeToScale + ", originalSelectedChildSize=" + this.originalSelectedChildSize + ')';
    }
}
