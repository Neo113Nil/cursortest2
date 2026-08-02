package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    public Alignment alignment;
    public float alpha;
    public ColorFilter colorFilter;
    public ContentScale contentScale;
    public Painter painter;
    public boolean sizeToIntrinsics;

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    public static boolean m588hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        return !Size.m639equalsimpl0(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    public static boolean m589hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        return !Size.m639equalsimpl0(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        long mo759getIntrinsicSizeNHjbRc = this.painter.mo759getIntrinsicSizeNHjbRc();
        long floatToRawIntBits = (Float.floatToRawIntBits(m589hasSpecifiedAndFiniteWidthuvyYCjk(mo759getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(m588hasSpecifiedAndFiniteHeightuvyYCjk(mo759getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
        long m861timesUQTWf7w = (Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) == RecyclerView.DECELERATION_RATE || Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) == RecyclerView.DECELERATION_RATE) ? 0L : ValueInsets.m861timesUQTWf7w(floatToRawIntBits, this.contentScale.mo832computeScaleFactorH7hwNQA(floatToRawIntBits, canvasDrawScope.mo753getSizeNHjbRc()));
        long mo584alignKFBX0sM = this.alignment.mo584alignKFBX0sM((Math.round(Float.intBitsToFloat((int) (m861timesUQTWf7w >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (m861timesUQTWf7w & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax), (Math.round(Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax), layoutNodeDrawScope.getLayoutDirection());
        float f = (int) (mo584alignKFBX0sM >> 32);
        float f2 = (int) (mo584alignKFBX0sM & BodyPartID.bodyIdMax);
        ((Extras.Key) canvasDrawScope.drawContext.path).translate(f, f2);
        try {
            this.painter.m762drawx_KDEd0(layoutNodeDrawScope, m861timesUQTWf7w, this.alpha, this.colorFilter);
            ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f, -f2);
            layoutNodeDrawScope.drawContent();
        } catch (Throwable th) {
            ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f, -f2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo759getIntrinsicSizeNHjbRc() != 9205357640488583168L;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long m590modifyConstraintsZezNO4M = m590modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13));
        return Math.max(Constraints.m1026getMinHeightimpl(m590modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long m590modifyConstraintsZezNO4M = m590modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7));
        return Math.max(Constraints.m1027getMinWidthimpl(m590modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(m590modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new PainterNode$measure$1(mo833measureBRTryo0, 0));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long m590modifyConstraintsZezNO4M = m590modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13));
        return Math.max(Constraints.m1026getMinHeightimpl(m590modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long m590modifyConstraintsZezNO4M = m590modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7));
        return Math.max(Constraints.m1027getMinWidthimpl(m590modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    public final long m590modifyConstraintsZezNO4M(long j) {
        boolean z = false;
        boolean z2 = Constraints.m1021getHasBoundedWidthimpl(j) && Constraints.m1020getHasBoundedHeightimpl(j);
        if (Constraints.m1023getHasFixedWidthimpl(j) && Constraints.m1022getHasFixedHeightimpl(j)) {
            z = true;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return Constraints.m1018copyZbe2FdA$default(j, Constraints.m1025getMaxWidthimpl(j), 0, Constraints.m1024getMaxHeightimpl(j), 0, 10);
        }
        long mo759getIntrinsicSizeNHjbRc = this.painter.mo759getIntrinsicSizeNHjbRc();
        int round = m589hasSpecifiedAndFiniteWidthuvyYCjk(mo759getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc >> 32))) : Constraints.m1027getMinWidthimpl(j);
        int round2 = m588hasSpecifiedAndFiniteHeightuvyYCjk(mo759getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax))) : Constraints.m1026getMinHeightimpl(j);
        int m1033constrainWidthK40F9xA = ConstraintsKt.m1033constrainWidthK40F9xA(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(ConstraintsKt.m1032constrainHeightK40F9xA(round2, j)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(m1033constrainWidthK40F9xA) << 32);
        if (getUseIntrinsicSize()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!m589hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo759getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.painter.mo759getIntrinsicSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(!m588hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo759getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (this.painter.mo759getIntrinsicSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == RecyclerView.DECELERATION_RATE || Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)) == RecyclerView.DECELERATION_RATE) ? 0L : ValueInsets.m861timesUQTWf7w(floatToRawIntBits2, this.contentScale.mo832computeScaleFactorH7hwNQA(floatToRawIntBits2, floatToRawIntBits));
        }
        return Constraints.m1018copyZbe2FdA$default(j, ConstraintsKt.m1033constrainWidthK40F9xA(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, ConstraintsKt.m1032constrainHeightK40F9xA(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax))), j), 0, 10);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
