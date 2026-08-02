package coil3.compose.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
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
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import com.squareup.wire.GrpcMethod;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class ContentPainterNode extends Modifier.Node implements DrawModifierNode, LayoutModifierNode, SemanticsModifierNode {
    public Alignment alignment;
    public float alpha;
    public boolean clipToBounds;
    public ColorFilter colorFilter;
    public ConstraintsSizeResolver constraintSizeResolver;
    public String contentDescription;
    public ContentScale contentScale;
    public final AsyncImagePainter painter;

    public ContentPainterNode(AsyncImagePainter asyncImagePainter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, String str, ConstraintsSizeResolver constraintsSizeResolver) {
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
        this.clipToBounds = z;
        this.contentDescription = str;
        this.constraintSizeResolver = constraintsSizeResolver;
        this.painter = asyncImagePainter;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        String str = this.contentDescription;
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
            SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 5);
        }
    }

    /* renamed from: calculateScaledSize-E7KxVPU$1, reason: not valid java name */
    public final long m1452calculateScaledSizeE7KxVPU$1(long j) {
        if (Size.m644isEmptyimpl(j)) {
            return 0L;
        }
        long mo759getIntrinsicSizeNHjbRc = this.painter.mo759getIntrinsicSizeNHjbRc();
        if (mo759getIntrinsicSizeNHjbRc != 9205357640488583168L) {
            float intBitsToFloat = Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc >> 32));
            if (Math.abs(intBitsToFloat) > Float.MAX_VALUE) {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax));
            if (Math.abs(intBitsToFloat2) > Float.MAX_VALUE) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            long mo832computeScaleFactorH7hwNQA = this.contentScale.mo832computeScaleFactorH7hwNQA(floatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (mo832computeScaleFactorH7hwNQA >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & mo832computeScaleFactorH7hwNQA))) <= Float.MAX_VALUE) {
                return ValueInsets.m861timesUQTWf7w(floatToRawIntBits, mo832computeScaleFactorH7hwNQA);
            }
        }
        return j;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        long m1452calculateScaledSizeE7KxVPU$1 = m1452calculateScaledSizeE7KxVPU$1(canvasDrawScope.mo753getSizeNHjbRc());
        long mo584alignKFBX0sM = this.alignment.mo584alignKFBX0sM(UtilsKt.m1454toIntSizeuvyYCjk(m1452calculateScaledSizeE7KxVPU$1), UtilsKt.m1454toIntSizeuvyYCjk(canvasDrawScope.mo753getSizeNHjbRc()), layoutNodeDrawScope.getLayoutDirection());
        int i = (int) (mo584alignKFBX0sM >> 32);
        int i2 = (int) (mo584alignKFBX0sM & BodyPartID.bodyIdMax);
        GrpcMethod grpcMethod = canvasDrawScope.drawContext;
        long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
        grpcMethod.getCanvas().save();
        try {
            Extras.Key key = (Extras.Key) grpcMethod.path;
            if (this.clipToBounds) {
                Extras.Key.m1433clipRectN_I0leg$default(key, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 31);
            }
            key.translate(i, i2);
            this.painter.m762drawx_KDEd0(layoutNodeDrawScope, m1452calculateScaledSizeE7KxVPU$1, this.alpha, this.colorFilter);
            grpcMethod.getCanvas().restore();
            grpcMethod.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
            layoutNodeDrawScope.drawContent();
        } catch (Throwable th) {
            Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
            throw th;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long Constraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m1451setConstraintsBRTryo0(Constraints$default);
        }
        if (this.painter.mo759getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long m1453modifyConstraintsZezNO4M$1 = m1453modifyConstraintsZezNO4M$1(Constraints$default);
        return Math.max(Constraints.m1026getMinHeightimpl(m1453modifyConstraintsZezNO4M$1), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long Constraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m1451setConstraintsBRTryo0(Constraints$default);
        }
        if (this.painter.mo759getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long m1453modifyConstraintsZezNO4M$1 = m1453modifyConstraintsZezNO4M$1(Constraints$default);
        return Math.max(Constraints.m1027getMinWidthimpl(m1453modifyConstraintsZezNO4M$1), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m1451setConstraintsBRTryo0(j);
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(m1453modifyConstraintsZezNO4M$1(j));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long Constraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m1451setConstraintsBRTryo0(Constraints$default);
        }
        if (this.painter.mo759getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long m1453modifyConstraintsZezNO4M$1 = m1453modifyConstraintsZezNO4M$1(Constraints$default);
        return Math.max(Constraints.m1026getMinHeightimpl(m1453modifyConstraintsZezNO4M$1), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long Constraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m1451setConstraintsBRTryo0(Constraints$default);
        }
        if (this.painter.mo759getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long m1453modifyConstraintsZezNO4M$1 = m1453modifyConstraintsZezNO4M$1(Constraints$default);
        return Math.max(Constraints.m1027getMinWidthimpl(m1453modifyConstraintsZezNO4M$1), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    /* renamed from: modifyConstraints-ZezNO4M$1, reason: not valid java name */
    public final long m1453modifyConstraintsZezNO4M$1(long j) {
        float m1027getMinWidthimpl;
        int m1026getMinHeightimpl;
        float coerceIn;
        boolean m1023getHasFixedWidthimpl = Constraints.m1023getHasFixedWidthimpl(j);
        boolean m1022getHasFixedHeightimpl = Constraints.m1022getHasFixedHeightimpl(j);
        if (!m1023getHasFixedWidthimpl || !m1022getHasFixedHeightimpl) {
            boolean z = Constraints.m1021getHasBoundedWidthimpl(j) && Constraints.m1020getHasBoundedHeightimpl(j);
            AsyncImagePainter asyncImagePainter = this.painter;
            long mo759getIntrinsicSizeNHjbRc = asyncImagePainter.mo759getIntrinsicSizeNHjbRc();
            if (mo759getIntrinsicSizeNHjbRc != 9205357640488583168L) {
                if (z && (m1023getHasFixedWidthimpl || m1022getHasFixedHeightimpl)) {
                    m1027getMinWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                    m1026getMinHeightimpl = Constraints.m1024getMaxHeightimpl(j);
                } else {
                    float intBitsToFloat = Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax));
                    if (Math.abs(intBitsToFloat) <= Float.MAX_VALUE) {
                        int i = UtilsKt.$r8$clinit;
                        m1027getMinWidthimpl = RangesKt___RangesKt.coerceIn(intBitsToFloat, Constraints.m1027getMinWidthimpl(j), Constraints.m1025getMaxWidthimpl(j));
                    } else {
                        m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
                    }
                    if (Math.abs(intBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = UtilsKt.$r8$clinit;
                        coerceIn = RangesKt___RangesKt.coerceIn(intBitsToFloat2, Constraints.m1026getMinHeightimpl(j), Constraints.m1024getMaxHeightimpl(j));
                        long m1452calculateScaledSizeE7KxVPU$1 = m1452calculateScaledSizeE7KxVPU$1((Float.floatToRawIntBits(coerceIn) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(m1027getMinWidthimpl) << 32));
                        return Constraints.m1018copyZbe2FdA$default(j, ConstraintsKt.m1033constrainWidthK40F9xA(MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (m1452calculateScaledSizeE7KxVPU$1 >> 32))), j), 0, ConstraintsKt.m1032constrainHeightK40F9xA(MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (m1452calculateScaledSizeE7KxVPU$1 & BodyPartID.bodyIdMax))), j), 0, 10);
                    }
                    m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
                }
                coerceIn = m1026getMinHeightimpl;
                long m1452calculateScaledSizeE7KxVPU$12 = m1452calculateScaledSizeE7KxVPU$1((Float.floatToRawIntBits(coerceIn) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(m1027getMinWidthimpl) << 32));
                return Constraints.m1018copyZbe2FdA$default(j, ConstraintsKt.m1033constrainWidthK40F9xA(MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (m1452calculateScaledSizeE7KxVPU$12 >> 32))), j), 0, ConstraintsKt.m1032constrainHeightK40F9xA(MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (m1452calculateScaledSizeE7KxVPU$12 & BodyPartID.bodyIdMax))), j), 0, 10);
            }
            if (z && ((AsyncImagePainter.State) asyncImagePainter.state.$$delegate_0.getValue()).getPainter() != null) {
                return Constraints.m1018copyZbe2FdA$default(j, Constraints.m1025getMaxWidthimpl(j), 0, Constraints.m1024getMaxHeightimpl(j), 0, 10);
            }
        }
        return j;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        CoroutineScope coroutineScope = getCoroutineScope();
        AsyncImagePainter asyncImagePainter = this.painter;
        asyncImagePainter.scope = coroutineScope;
        asyncImagePainter.onRemembered();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.painter.onForgotten();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        this.painter.set_input$coil_compose_core(null);
    }
}
