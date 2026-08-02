package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;

/* loaded from: classes3.dex */
public final class IntrinsicHeightNode extends IntrinsicSizeModifier {
    public boolean enforceIncoming;
    public IntrinsicSize height;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    public final long mo268calculateContentConstraintsl58MMJ0(Measurable measurable, long j) {
        int minIntrinsicHeight = this.height == IntrinsicSize.Min ? measurable.minIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j)) : measurable.maxIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j));
        if (minIntrinsicHeight < 0) {
            minIntrinsicHeight = 0;
        }
        if (minIntrinsicHeight < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
        }
        return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, minIntrinsicHeight, minIntrinsicHeight);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.height == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.height == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }
}
