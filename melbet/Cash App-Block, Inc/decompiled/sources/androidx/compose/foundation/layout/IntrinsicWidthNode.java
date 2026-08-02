package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;

/* loaded from: classes3.dex */
public final class IntrinsicWidthNode extends IntrinsicSizeModifier {
    public boolean enforceIncoming;
    public IntrinsicSize width;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public final long mo268calculateContentConstraintsl58MMJ0(Measurable measurable, long j) {
        int minIntrinsicWidth = this.width == IntrinsicSize.Min ? measurable.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j)) : measurable.maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
        if (minIntrinsicWidth < 0) {
            minIntrinsicWidth = 0;
        }
        if (minIntrinsicWidth < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
        }
        return ConstraintsKt.createConstraints(minIntrinsicWidth, minIntrinsicWidth, 0, Integer.MAX_VALUE);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }
}
