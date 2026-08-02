package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes.dex */
public final class FillNode extends Modifier.Node implements LayoutModifierNode {
    public Direction direction;
    public float fraction;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int m1027getMinWidthimpl;
        int m1025getMaxWidthimpl;
        int i;
        int i2;
        if (!Constraints.m1021getHasBoundedWidthimpl(j) || this.direction == Direction.Vertical) {
            m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
            m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        } else {
            int round = Math.round(Constraints.m1025getMaxWidthimpl(j) * this.fraction);
            int m1027getMinWidthimpl2 = Constraints.m1027getMinWidthimpl(j);
            m1027getMinWidthimpl = Constraints.m1025getMaxWidthimpl(j);
            if (round < m1027getMinWidthimpl2) {
                round = m1027getMinWidthimpl2;
            }
            if (round <= m1027getMinWidthimpl) {
                m1027getMinWidthimpl = round;
            }
            m1025getMaxWidthimpl = m1027getMinWidthimpl;
        }
        if (!Constraints.m1020getHasBoundedHeightimpl(j) || this.direction == Direction.Horizontal) {
            int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
            int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
            i = m1026getMinHeightimpl;
            i2 = m1024getMaxHeightimpl;
        } else {
            int round2 = Math.round(Constraints.m1024getMaxHeightimpl(j) * this.fraction);
            int m1026getMinHeightimpl2 = Constraints.m1026getMinHeightimpl(j);
            i = Constraints.m1024getMaxHeightimpl(j);
            if (round2 < m1026getMinHeightimpl2) {
                round2 = m1026getMinHeightimpl2;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.Constraints(m1027getMinWidthimpl, m1025getMaxWidthimpl, i, i2));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 0));
    }
}
