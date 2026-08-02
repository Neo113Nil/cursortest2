package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes.dex */
public final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    public float minHeight;
    public float minWidth;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
        int mo230roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo230roundToPx0680j_4(this.minHeight) : 0;
        return maxIntrinsicHeight < mo230roundToPx0680j_4 ? mo230roundToPx0680j_4 : maxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
        int mo230roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo230roundToPx0680j_4(this.minWidth) : 0;
        return maxIntrinsicWidth < mo230roundToPx0680j_4 ? mo230roundToPx0680j_4 : maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int m1027getMinWidthimpl;
        int m1026getMinHeightimpl;
        if (Float.isNaN(this.minWidth) || Constraints.m1027getMinWidthimpl(j) != 0) {
            m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
        } else {
            int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(this.minWidth);
            m1027getMinWidthimpl = Constraints.m1025getMaxWidthimpl(j);
            if (mo230roundToPx0680j_4 < 0) {
                mo230roundToPx0680j_4 = 0;
            }
            if (mo230roundToPx0680j_4 <= m1027getMinWidthimpl) {
                m1027getMinWidthimpl = mo230roundToPx0680j_4;
            }
        }
        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        if (Float.isNaN(this.minHeight) || Constraints.m1026getMinHeightimpl(j) != 0) {
            m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
        } else {
            int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(this.minHeight);
            m1026getMinHeightimpl = Constraints.m1024getMaxHeightimpl(j);
            int i = mo230roundToPx0680j_42 >= 0 ? mo230roundToPx0680j_42 : 0;
            if (i <= m1026getMinHeightimpl) {
                m1026getMinHeightimpl = i;
            }
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(ConstraintsKt.Constraints(m1027getMinWidthimpl, m1025getMaxWidthimpl, m1026getMinHeightimpl, Constraints.m1024getMaxHeightimpl(j)));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i);
        int mo230roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo230roundToPx0680j_4(this.minHeight) : 0;
        return minIntrinsicHeight < mo230roundToPx0680j_4 ? mo230roundToPx0680j_4 : minIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i);
        int mo230roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo230roundToPx0680j_4(this.minWidth) : 0;
        return minIntrinsicWidth < mo230roundToPx0680j_4 ? mo230roundToPx0680j_4 : minIntrinsicWidth;
    }
}
