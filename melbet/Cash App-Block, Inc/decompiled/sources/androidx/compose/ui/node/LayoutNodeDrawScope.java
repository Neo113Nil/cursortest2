package androidx.compose.ui.node;

import androidx.compose.animation.BoundsAnimation$animate$2;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope {
    public final CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
    public DrawModifierNode drawNode;

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public final void mo724drawArcillE91I(Brush brush, long j, long j2, DrawStyle drawStyle) {
        this.canvasDrawScope.mo724drawArcillE91I(brush, j, j2, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public final void mo725drawArcyD3GUKo(long j, float f, float f2, long j2, long j3, float f3, Stroke stroke) {
        this.canvasDrawScope.mo725drawArcyD3GUKo(j, f, f2, j2, j3, f3, stroke);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public final void mo726drawCircleVaOC9Bg(long j, float f, long j2, DrawStyle drawStyle, int i) {
        this.canvasDrawScope.mo726drawCircleVaOC9Bg(j, f, j2, drawStyle, i);
    }

    public final void drawContent() {
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        Canvas canvas = canvasDrawScope.drawContext.getCanvas();
        DelegatableNode delegatableNode = this.drawNode;
        if (delegatableNode == null) {
            throw Boxes$$ExternalSyntheticOutline1.m1150m("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        Modifier.Node node = (Modifier.Node) delegatableNode;
        Modifier.Node child$ui = node.getNode().getChild$ui();
        if (child$ui != null && (child$ui.getAggregateChildKindSet$ui() & 4) != 0) {
            while (child$ui != null && (child$ui.getKindSet$ui() & 2) == 0) {
                if ((child$ui.getKindSet$ui() & 4) != 0) {
                    break;
                } else {
                    child$ui = child$ui.getChild$ui();
                }
            }
        }
        child$ui = null;
        if (child$ui == null) {
            NodeCoordinator m864requireCoordinator64DMado = DepthSortedSetKt.m864requireCoordinator64DMado(delegatableNode, 4);
            if (m864requireCoordinator64DMado.getTail() == node.getNode()) {
                m864requireCoordinator64DMado = m864requireCoordinator64DMado.wrapped;
                m864requireCoordinator64DMado.getClass();
            }
            m864requireCoordinator64DMado.performDraw(canvas, (GraphicsLayer) canvasDrawScope.drawContext.requestAdapter);
            return;
        }
        MutableVector mutableVector = null;
        while (child$ui != null) {
            if (child$ui instanceof DrawModifierNode) {
                DrawModifierNode drawModifierNode = (DrawModifierNode) child$ui;
                GraphicsLayer graphicsLayer = (GraphicsLayer) canvasDrawScope.drawContext.requestAdapter;
                NodeCoordinator m864requireCoordinator64DMado2 = DepthSortedSetKt.m864requireCoordinator64DMado(drawModifierNode, 4);
                long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(m864requireCoordinator64DMado2.measuredSize);
                LayoutNode layoutNode = m864requireCoordinator64DMado2.layoutNode;
                layoutNode.getClass();
                ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).sharedDrawScope.m874drawDirecteZhPAX0$ui(canvas, m3991toSizeozmzZPI, m864requireCoordinator64DMado2, drawModifierNode, graphicsLayer);
            } else if ((child$ui.getKindSet$ui() & 4) != 0 && (child$ui instanceof DelegatingNode)) {
                int i = 0;
                for (Modifier.Node node2 = ((DelegatingNode) child$ui).delegate; node2 != null; node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & 4) != 0) {
                        i++;
                        if (i == 1) {
                            child$ui = node2;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(0, new Modifier.Node[16]);
                            }
                            if (child$ui != null) {
                                mutableVector.add(child$ui);
                                child$ui = null;
                            }
                            mutableVector.add(node2);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            child$ui = DepthSortedSetKt.access$pop(mutableVector);
        }
    }

    /* renamed from: drawDirect-eZhPAX0$ui, reason: not valid java name */
    public final void m874drawDirecteZhPAX0$ui(Canvas canvas, long j, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        LayoutDirection layoutDirection = nodeCoordinator.layoutNode.layoutDirection;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        Density density = canvasDrawScope.drawContext.getDensity();
        GrpcMethod grpcMethod = canvasDrawScope.drawContext;
        LayoutDirection layoutDirection2 = grpcMethod.getLayoutDirection();
        Canvas canvas2 = grpcMethod.getCanvas();
        long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = (GraphicsLayer) grpcMethod.requestAdapter;
        grpcMethod.setDensity(nodeCoordinator);
        grpcMethod.setLayoutDirection(layoutDirection);
        grpcMethod.setCanvas(canvas);
        grpcMethod.m4000setSizeuvyYCjk(j);
        grpcMethod.requestAdapter = graphicsLayer;
        canvas.save();
        try {
            drawModifierNode.draw(this);
            canvas.restore();
            grpcMethod.setDensity(density);
            grpcMethod.setLayoutDirection(layoutDirection2);
            grpcMethod.setCanvas(canvas2);
            grpcMethod.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
            grpcMethod.requestAdapter = graphicsLayer2;
            this.drawNode = drawModifierNode2;
        } catch (Throwable th) {
            canvas.restore();
            grpcMethod.setDensity(density);
            grpcMethod.setLayoutDirection(layoutDirection2);
            grpcMethod.setCanvas(canvas2);
            grpcMethod.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
            grpcMethod.requestAdapter = graphicsLayer2;
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public final void mo727drawImageAZ2fEMs(AndroidImageBitmap androidImageBitmap, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i, int i2) {
        this.canvasDrawScope.mo727drawImageAZ2fEMs(androidImageBitmap, j, j2, j3, j4, f, colorFilter, i, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public final void mo728drawImagegbVJVH8(AndroidImageBitmap androidImageBitmap, long j, float f, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo728drawImagegbVJVH8(androidImageBitmap, j, f, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public final void mo729drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2) {
        this.canvasDrawScope.mo729drawLineNGM6Ib0(j, j2, j3, f, i, pathEffect, f2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public final void mo730drawOvalnJ9OG0(long j, long j2, long j3, DrawStyle drawStyle) {
        this.canvasDrawScope.mo730drawOvalnJ9OG0(j, j2, j3, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public final void mo731drawPathGBMwjPU(AndroidPath androidPath, Brush brush, float f, DrawStyle drawStyle, int i) {
        this.canvasDrawScope.mo731drawPathGBMwjPU(androidPath, brush, f, drawStyle, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public final void mo732drawPathLG529CI(AndroidPath androidPath, long j, float f, DrawStyle drawStyle) {
        this.canvasDrawScope.mo732drawPathLG529CI(androidPath, j, f, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public final void mo733drawPointsF8ZwMP8(ArrayList arrayList, long j, float f) {
        this.canvasDrawScope.mo733drawPointsF8ZwMP8(arrayList, j, f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public final void mo734drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo734drawRectAsUm42w(brush, j, j2, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public final void mo735drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo735drawRectnJ9OG0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public final void m875drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle) {
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        Canvas canvas = canvasDrawScope.drawParams.canvas;
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        canvas.drawRoundRect(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)), canvasDrawScope.m723configurePaintswdJneE(brush, drawStyle, f, null, 3, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public final void mo736drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle) {
        this.canvasDrawScope.mo736drawRoundRectuAw5IA(j, j2, j3, j4, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public final long mo752getCenterF1C5BW0() {
        return this.canvasDrawScope.mo752getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final GrpcMethod getDrawContext() {
        return this.canvasDrawScope.drawContext;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.drawParams.layoutDirection;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public final long mo753getSizeNHjbRc() {
        return this.canvasDrawScope.mo753getSizeNHjbRc();
    }

    /* renamed from: record-JVtK1S4, reason: not valid java name */
    public final void m876recordJVtK1S4(long j, GraphicsLayer graphicsLayer, Function1 function1) {
        graphicsLayer.m754recordmLhObY(this, getLayoutDirection(), j, new BoundsAnimation$animate$2(5, this, this.drawNode, function1));
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo229roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.mo229roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo230roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo230roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public final float mo231toDpGaN1DYA(long j) {
        return this.canvasDrawScope.mo231toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo232toDpu2uoSUM(float f) {
        return f / this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo234toDpSizekrfVVM(long j) {
        return this.canvasDrawScope.mo234toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo235toPxR2X_6o(long j) {
        return this.canvasDrawScope.mo235toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo236toPx0680j_4(float f) {
        return this.canvasDrawScope.getDensity() * f;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo237toSizeXkaWNTQ(long j) {
        return this.canvasDrawScope.mo237toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public final long mo238toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo238toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo239toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo239toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo233toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo233toDpu2uoSUM(i);
    }
}
