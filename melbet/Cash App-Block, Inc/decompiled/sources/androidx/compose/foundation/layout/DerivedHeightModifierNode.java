package androidx.compose.foundation.layout;

import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DerivedHeightModifierNode extends InsetsConsumingModifierNode implements LayoutModifierNode {
    public Drop$$ExternalSyntheticBUOutline0 heightCalc;
    public WindowInsets heightInsets;
    public WindowInsets insets;

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final WindowInsets calculateInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final void insetsInvalidated() {
        this.heightInsets = new ExcludeInsets(this.insets, this.ancestorConsumedInsets);
        super.insetsInvalidated();
        DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = this.heightCalc;
        WindowInsets windowInsets = this.heightInsets;
        drop$$ExternalSyntheticBUOutline0.getClass();
        int bottom = windowInsets.getBottom(measureScope);
        if (bottom == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, new BorderKt$$ExternalSyntheticLambda1(29));
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, bottom, bottom, 3));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, bottom, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 2));
    }
}
