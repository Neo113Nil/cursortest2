package androidx.compose.foundation.shape;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.unit.Density;

/* loaded from: classes3.dex */
public final class PxCornerSize implements CornerSize {
    public final float size;

    public PxCornerSize(float f) {
        this.size = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PxCornerSize) && Float.compare(this.size, ((PxCornerSize) obj).size) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public final float mo339toPxTmRCtEA(long j, Density density) {
        return this.size;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.size, ".px)", new StringBuilder("CornerSize(size = "));
    }
}
