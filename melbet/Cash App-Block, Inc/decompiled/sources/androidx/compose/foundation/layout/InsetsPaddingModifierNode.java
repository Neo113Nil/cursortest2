package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes.dex */
public class InsetsPaddingModifierNode extends InsetsConsumingModifierNode implements LayoutModifierNode {
    public WindowInsets insets;

    public InsetsPaddingModifierNode(WindowInsets windowInsets) {
        this.insets = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final WindowInsets calculateInsets(WindowInsets windowInsets) {
        return new UnionInsets(windowInsets, this.insets);
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final void insetsInvalidated() {
        super.insetsInvalidated();
        DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int left = this.consumedInsets.getLeft(measureScope, measureScope.getLayoutDirection()) - this.ancestorConsumedInsets.getLeft(measureScope, measureScope.getLayoutDirection());
        int top = this.consumedInsets.getTop(measureScope) - this.ancestorConsumedInsets.getTop(measureScope);
        int right = (this.consumedInsets.getRight(measureScope, measureScope.getLayoutDirection()) - this.ancestorConsumedInsets.getRight(measureScope, measureScope.getLayoutDirection())) + left;
        int bottom = (this.consumedInsets.getBottom(measureScope) - this.ancestorConsumedInsets.getBottom(measureScope)) + top;
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(-right, -bottom, j));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m1033constrainWidthK40F9xA(mo833measureBRTryo0.width + right, j), ConstraintsKt.m1032constrainHeightK40F9xA(mo833measureBRTryo0.height + bottom, j), new PaddingValuesModifier$$ExternalSyntheticLambda0(left, top, 1, mo833measureBRTryo0));
    }
}
