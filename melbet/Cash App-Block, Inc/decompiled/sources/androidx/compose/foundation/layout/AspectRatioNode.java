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
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.compose.ui.unit.IntSize;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    public float aspectRatio;
    public boolean matchHeightConstraintsFirst;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (androidx.compose.ui.unit.IntSize.m1055equalsimpl0(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (androidx.compose.ui.unit.IntSize.m1055equalsimpl0(r5, 0) == false) goto L53;
     */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long m253tryMaxHeightJN0ABg;
        if (this.matchHeightConstraintsFirst) {
            m253tryMaxHeightJN0ABg = m253tryMaxHeightJN0ABg(j, true);
            if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                m253tryMaxHeightJN0ABg = m254tryMaxWidthJN0ABg(j, true);
                if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                    m253tryMaxHeightJN0ABg = m255tryMinHeightJN0ABg(j, true);
                    if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                        m253tryMaxHeightJN0ABg = m256tryMinWidthJN0ABg(j, true);
                        if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                            m253tryMaxHeightJN0ABg = m253tryMaxHeightJN0ABg(j, false);
                            if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                                m253tryMaxHeightJN0ABg = m254tryMaxWidthJN0ABg(j, false);
                                if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                                    m253tryMaxHeightJN0ABg = m255tryMinHeightJN0ABg(j, false);
                                    if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                                        m253tryMaxHeightJN0ABg = m256tryMinWidthJN0ABg(j, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            m253tryMaxHeightJN0ABg = m254tryMaxWidthJN0ABg(j, true);
            if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                m253tryMaxHeightJN0ABg = m253tryMaxHeightJN0ABg(j, true);
                if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                    m253tryMaxHeightJN0ABg = m256tryMinWidthJN0ABg(j, true);
                    if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                        m253tryMaxHeightJN0ABg = m255tryMinHeightJN0ABg(j, true);
                        if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                            m253tryMaxHeightJN0ABg = m254tryMaxWidthJN0ABg(j, false);
                            if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                                m253tryMaxHeightJN0ABg = m253tryMaxHeightJN0ABg(j, false);
                                if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                                    m253tryMaxHeightJN0ABg = m256tryMinWidthJN0ABg(j, false);
                                    if (IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
                                        m253tryMaxHeightJN0ABg = m255tryMinHeightJN0ABg(j, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!IntSize.m1055equalsimpl0(m253tryMaxHeightJN0ABg, 0L)) {
            int i = (int) (m253tryMaxHeightJN0ABg >> 32);
            int i2 = (int) (BodyPartID.bodyIdMax & m253tryMaxHeightJN0ABg);
            if (!((i >= 0) & (i2 >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            j = ConstraintsKt.createConstraints(i, i, i2, i2);
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 1));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    public final long m253tryMaxHeightJN0ABg(long j, boolean z) {
        int round;
        int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
        if (m1024getMaxHeightimpl == Integer.MAX_VALUE || (round = Math.round(m1024getMaxHeightimpl * this.aspectRatio)) <= 0) {
            return 0L;
        }
        if (!z || OffsetKt.m271isSatisfiedByNN6EwU(round, m1024getMaxHeightimpl, j)) {
            return (round << 32) | (m1024getMaxHeightimpl & BodyPartID.bodyIdMax);
        }
        return 0L;
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    public final long m254tryMaxWidthJN0ABg(long j, boolean z) {
        int round;
        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
        if (m1025getMaxWidthimpl == Integer.MAX_VALUE || (round = Math.round(m1025getMaxWidthimpl / this.aspectRatio)) <= 0) {
            return 0L;
        }
        if (!z || OffsetKt.m271isSatisfiedByNN6EwU(m1025getMaxWidthimpl, round, j)) {
            return (m1025getMaxWidthimpl << 32) | (round & BodyPartID.bodyIdMax);
        }
        return 0L;
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    public final long m255tryMinHeightJN0ABg(long j, boolean z) {
        int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
        int round = Math.round(m1026getMinHeightimpl * this.aspectRatio);
        if (round <= 0) {
            return 0L;
        }
        if (!z || OffsetKt.m271isSatisfiedByNN6EwU(round, m1026getMinHeightimpl, j)) {
            return (round << 32) | (m1026getMinHeightimpl & BodyPartID.bodyIdMax);
        }
        return 0L;
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    public final long m256tryMinWidthJN0ABg(long j, boolean z) {
        int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
        int round = Math.round(m1027getMinWidthimpl / this.aspectRatio);
        if (round <= 0) {
            return 0L;
        }
        if (!z || OffsetKt.m271isSatisfiedByNN6EwU(m1027getMinWidthimpl, round, j)) {
            return (m1027getMinWidthimpl << 32) | (round & BodyPartID.bodyIdMax);
        }
        return 0L;
    }
}
