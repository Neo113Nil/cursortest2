package androidx.compose.foundation.shape;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class DpCornerSize implements CornerSize {
    public final float size;

    public DpCornerSize(float f) {
        this.size = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m1037equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    public final int hashCode() {
        return Float.hashCode(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public final float mo339toPxTmRCtEA(long j, Density density) {
        return density.mo236toPx0680j_4(this.size);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.size, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}
