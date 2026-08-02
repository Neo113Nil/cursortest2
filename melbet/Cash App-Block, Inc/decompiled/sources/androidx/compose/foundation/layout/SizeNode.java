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
public final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    public boolean enforceIncoming;
    public float maxHeight;
    public float maxWidth;
    public float minHeight;
    public float minWidth;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m293getTargetConstraintsOenEA2s(MeasureScope measureScope) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (Float.isNaN(this.maxWidth)) {
            i = Integer.MAX_VALUE;
        } else {
            i = measureScope.mo230roundToPx0680j_4(this.maxWidth);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.maxHeight)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = measureScope.mo230roundToPx0680j_4(this.maxHeight);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.minWidth)) {
            i3 = measureScope.mo230roundToPx0680j_4(this.minWidth);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.minHeight)) {
            int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(this.minHeight);
            if (mo230roundToPx0680j_4 < 0) {
                mo230roundToPx0680j_4 = 0;
            }
            if (mo230roundToPx0680j_4 > i2) {
                mo230roundToPx0680j_4 = i2;
            }
            if (mo230roundToPx0680j_4 != Integer.MAX_VALUE) {
                i4 = mo230roundToPx0680j_4;
            }
        }
        return ConstraintsKt.Constraints(i3, i, i4, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m293getTargetConstraintsOenEA2s = m293getTargetConstraintsOenEA2s((MeasureScope) intrinsicMeasureScope);
        if (Constraints.m1022getHasFixedHeightimpl(m293getTargetConstraintsOenEA2s)) {
            return Constraints.m1024getMaxHeightimpl(m293getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = ConstraintsKt.m1033constrainWidthK40F9xA(i, m293getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m1032constrainHeightK40F9xA(intrinsicMeasurable.maxIntrinsicHeight(i), m293getTargetConstraintsOenEA2s);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m293getTargetConstraintsOenEA2s = m293getTargetConstraintsOenEA2s((MeasureScope) intrinsicMeasureScope);
        if (Constraints.m1023getHasFixedWidthimpl(m293getTargetConstraintsOenEA2s)) {
            return Constraints.m1025getMaxWidthimpl(m293getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = ConstraintsKt.m1032constrainHeightK40F9xA(i, m293getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m1033constrainWidthK40F9xA(intrinsicMeasurable.maxIntrinsicWidth(i), m293getTargetConstraintsOenEA2s);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int m1027getMinWidthimpl;
        int m1025getMaxWidthimpl;
        int m1026getMinHeightimpl;
        int m1024getMaxHeightimpl;
        long Constraints;
        long m293getTargetConstraintsOenEA2s = m293getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m1031constrainN9IONVI(j, m293getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.minWidth)) {
                m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
                int m1025getMaxWidthimpl2 = Constraints.m1025getMaxWidthimpl(m293getTargetConstraintsOenEA2s);
                if (m1027getMinWidthimpl > m1025getMaxWidthimpl2) {
                    m1027getMinWidthimpl = m1025getMaxWidthimpl2;
                }
            } else {
                m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(m293getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxWidth)) {
                m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                int m1027getMinWidthimpl2 = Constraints.m1027getMinWidthimpl(m293getTargetConstraintsOenEA2s);
                if (m1025getMaxWidthimpl < m1027getMinWidthimpl2) {
                    m1025getMaxWidthimpl = m1027getMinWidthimpl2;
                }
            } else {
                m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(m293getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.minHeight)) {
                m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
                int m1024getMaxHeightimpl2 = Constraints.m1024getMaxHeightimpl(m293getTargetConstraintsOenEA2s);
                if (m1026getMinHeightimpl > m1024getMaxHeightimpl2) {
                    m1026getMinHeightimpl = m1024getMaxHeightimpl2;
                }
            } else {
                m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(m293getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.maxHeight)) {
                m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
                int m1026getMinHeightimpl2 = Constraints.m1026getMinHeightimpl(m293getTargetConstraintsOenEA2s);
                if (m1024getMaxHeightimpl < m1026getMinHeightimpl2) {
                    m1024getMaxHeightimpl = m1026getMinHeightimpl2;
                }
            } else {
                m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(m293getTargetConstraintsOenEA2s);
            }
            Constraints = ConstraintsKt.Constraints(m1027getMinWidthimpl, m1025getMaxWidthimpl, m1026getMinHeightimpl, m1024getMaxHeightimpl);
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 1));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m293getTargetConstraintsOenEA2s = m293getTargetConstraintsOenEA2s((MeasureScope) intrinsicMeasureScope);
        if (Constraints.m1022getHasFixedHeightimpl(m293getTargetConstraintsOenEA2s)) {
            return Constraints.m1024getMaxHeightimpl(m293getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = ConstraintsKt.m1033constrainWidthK40F9xA(i, m293getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m1032constrainHeightK40F9xA(intrinsicMeasurable.minIntrinsicHeight(i), m293getTargetConstraintsOenEA2s);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m293getTargetConstraintsOenEA2s = m293getTargetConstraintsOenEA2s((MeasureScope) intrinsicMeasureScope);
        if (Constraints.m1023getHasFixedWidthimpl(m293getTargetConstraintsOenEA2s)) {
            return Constraints.m1025getMaxWidthimpl(m293getTargetConstraintsOenEA2s);
        }
        if (!this.enforceIncoming) {
            i = ConstraintsKt.m1032constrainHeightK40F9xA(i, m293getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m1033constrainWidthK40F9xA(intrinsicMeasurable.minIntrinsicWidth(i), m293getTargetConstraintsOenEA2s);
    }
}
