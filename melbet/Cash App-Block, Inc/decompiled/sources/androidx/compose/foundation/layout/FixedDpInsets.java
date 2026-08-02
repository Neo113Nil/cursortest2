package androidx.compose.foundation.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class FixedDpInsets implements WindowInsets {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedDpInsets) && Dp.m1037equalsimpl0(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) && Dp.m1037equalsimpl0(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) && Dp.m1037equalsimpl0(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) && Dp.m1037equalsimpl0(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density) {
        return density.mo230roundToPx0680j_4(RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo230roundToPx0680j_4(RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo230roundToPx0680j_4(RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density) {
        return density.mo230roundToPx0680j_4(RecyclerView.DECELERATION_RATE);
    }

    public final int hashCode() {
        return Float.hashCode(RecyclerView.DECELERATION_RATE) + CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, Float.hashCode(RecyclerView.DECELERATION_RATE) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) Dp.m1038toStringimpl(RecyclerView.DECELERATION_RATE)) + ", top=" + ((Object) Dp.m1038toStringimpl(RecyclerView.DECELERATION_RATE)) + ", right=" + ((Object) Dp.m1038toStringimpl(RecyclerView.DECELERATION_RATE)) + ", bottom=" + ((Object) Dp.m1038toStringimpl(RecyclerView.DECELERATION_RATE)) + ')';
    }
}
