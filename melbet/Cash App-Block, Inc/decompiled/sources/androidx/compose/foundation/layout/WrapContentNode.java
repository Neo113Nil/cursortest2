package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    public Function2 alignmentCallback;
    public Direction direction;
    public boolean unbounded;

    public WrapContentNode(Direction direction, boolean z, Function2 function2) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = function2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int m1027getMinWidthimpl = direction != direction2 ? 0 : Constraints.m1027getMinWidthimpl(j);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.Constraints(m1027getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m1025getMaxWidthimpl(j) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m1026getMinHeightimpl(j) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m1024getMaxHeightimpl(j) : Integer.MAX_VALUE));
        int coerceIn = RangesKt___RangesKt.coerceIn(mo833measureBRTryo0.width, Constraints.m1027getMinWidthimpl(j), Constraints.m1025getMaxWidthimpl(j));
        int coerceIn2 = RangesKt___RangesKt.coerceIn(mo833measureBRTryo0.height, Constraints.m1026getMinHeightimpl(j), Constraints.m1024getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, coerceIn, coerceIn2, new WrapContentNode$$ExternalSyntheticLambda0(this, coerceIn, mo833measureBRTryo0, coerceIn2, measureScope));
    }

    public final void setAlignmentCallback(Function2 function2) {
        this.alignmentCallback = function2;
    }

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z) {
        this.unbounded = z;
    }
}
