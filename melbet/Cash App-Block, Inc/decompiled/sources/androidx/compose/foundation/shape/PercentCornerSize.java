package androidx.compose.foundation.shape;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class PercentCornerSize implements CornerSize {
    public final float percent;

    public PercentCornerSize(float f) {
        this.percent = f;
        if (f < RecyclerView.DECELERATION_RATE || f > 100.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.percent, ((PercentCornerSize) obj).percent) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.percent);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public final float mo339toPxTmRCtEA(long j, Density density) {
        return (this.percent / 100.0f) * Size.m642getMinDimensionimpl(j);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.percent, "%)", new StringBuilder("CornerSize(size = "));
    }
}
