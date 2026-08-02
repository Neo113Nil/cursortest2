package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.unit.Constraints;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class FlowLayoutOverflowState {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.Clip;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, FlowLayoutOverflow$OverflowType.Clip.hashCode() * 31, 31);
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m262setOverflowMeasurableshBUhpc$foundation_layout(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, long j) {
        long m269constructorimpl = OffsetKt.m269constructorimpl(j, LayoutOrientation.Horizontal);
        if (intrinsicMeasurable != null) {
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(m269constructorimpl));
            new IntIntPair(IntIntPair.m128constructorimpl(minIntrinsicWidth, intrinsicMeasurable.minIntrinsicHeight(minIntrinsicWidth)));
        }
        if (intrinsicMeasurable2 != null) {
            int minIntrinsicWidth2 = intrinsicMeasurable2.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(m269constructorimpl));
            new IntIntPair(IntIntPair.m128constructorimpl(minIntrinsicWidth2, intrinsicMeasurable2.minIntrinsicHeight(minIntrinsicWidth2)));
        }
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + FlowLayoutOverflow$OverflowType.Clip + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
