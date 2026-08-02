package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import com.squareup.wire.GrpcMethod;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class StretchOverscrollNode extends DelegatingNode implements DrawModifierNode {
    public RenderNode _renderNode;
    public final EdgeEffectWrapper edgeEffectWrapper;
    public final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public StretchOverscrollNode(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        delegate(suspendingPointerInputModifierNodeImpl);
    }

    public static boolean drawWithRotation(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == RecyclerView.DECELERATION_RATE) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        boolean z;
        boolean z2;
        char c;
        float f;
        float f2;
        float f3;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        long mo753getSizeNHjbRc = canvasDrawScope.mo753getSizeNHjbRc();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.overscrollEffect;
        androidEdgeEffectOverscrollEffect.m171updateSizeuvyYCjk$foundation(mo753getSizeNHjbRc);
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvasDrawScope.drawContext.getCanvas());
        androidEdgeEffectOverscrollEffect.redrawSignal.getValue();
        if (Size.m644isEmptyimpl(canvasDrawScope.mo753getSizeNHjbRc())) {
            layoutNodeDrawScope.drawContent();
            return;
        }
        boolean isHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        if (!isHardwareAccelerated) {
            EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = edgeEffectWrapper.topEffectNegation;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = edgeEffectWrapper.bottomEffectNegation;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = edgeEffectWrapper.leftEffectNegation;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = edgeEffectWrapper.rightEffectNegation;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            layoutNodeDrawScope.drawContent();
            return;
        }
        float mo236toPx0680j_4 = layoutNodeDrawScope.mo236toPx0680j_4(30.0f);
        boolean z3 = EdgeEffectWrapper.isAnimating(edgeEffectWrapper.topEffect) || EdgeEffectWrapper.isStretched(edgeEffectWrapper.topEffectNegation) || EdgeEffectWrapper.isAnimating(edgeEffectWrapper.bottomEffect) || EdgeEffectWrapper.isStretched(edgeEffectWrapper.bottomEffectNegation);
        boolean z4 = EdgeEffectWrapper.isAnimating(edgeEffectWrapper.leftEffect) || EdgeEffectWrapper.isStretched(edgeEffectWrapper.leftEffectNegation) || EdgeEffectWrapper.isAnimating(edgeEffectWrapper.rightEffect) || EdgeEffectWrapper.isStretched(edgeEffectWrapper.rightEffectNegation);
        if (z3 && z4) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (z3) {
            getRenderNode().setPosition(0, 0, (MathKt__MathJVMKt.roundToInt(mo236toPx0680j_4) * 2) + nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else {
            if (!z4) {
                layoutNodeDrawScope.drawContent();
                return;
            }
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), (MathKt__MathJVMKt.roundToInt(mo236toPx0680j_4) * 2) + nativeCanvas.getHeight());
        }
        RecordingCanvas beginRecording = getRenderNode().beginRecording();
        if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.leftEffectNegation)) {
            EdgeEffect edgeEffect9 = edgeEffectWrapper.leftEffectNegation;
            if (edgeEffect9 == null) {
                edgeEffect9 = edgeEffectWrapper.createEdgeEffect(Orientation.Horizontal);
                edgeEffectWrapper.leftEffectNegation = edgeEffect9;
            }
            drawWithRotation(90.0f, edgeEffect9, beginRecording);
            edgeEffect9.finish();
        }
        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.leftEffect)) {
            EdgeEffect orCreateLeftEffect = edgeEffectWrapper.getOrCreateLeftEffect();
            z2 = drawWithRotation(270.0f, orCreateLeftEffect, beginRecording);
            if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.leftEffect)) {
                z = z4;
                float intBitsToFloat = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.m166displacementF1C5BW0$foundation() & BodyPartID.bodyIdMax));
                EdgeEffect edgeEffect10 = edgeEffectWrapper.leftEffectNegation;
                if (edgeEffect10 == null) {
                    edgeEffect10 = edgeEffectWrapper.createEdgeEffect(Orientation.Horizontal);
                    edgeEffectWrapper.leftEffectNegation = edgeEffect10;
                }
                CanvasKt.onPullDistanceCompat(edgeEffect10, CanvasKt.getDistanceCompat(orCreateLeftEffect), 1.0f - intBitsToFloat);
            } else {
                z = z4;
            }
        } else {
            z = z4;
            z2 = false;
        }
        if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.topEffectNegation)) {
            EdgeEffect edgeEffect11 = edgeEffectWrapper.topEffectNegation;
            if (edgeEffect11 == null) {
                edgeEffect11 = edgeEffectWrapper.createEdgeEffect(Orientation.Vertical);
                edgeEffectWrapper.topEffectNegation = edgeEffect11;
            }
            drawWithRotation(180.0f, edgeEffect11, beginRecording);
            edgeEffect11.finish();
        }
        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.topEffect)) {
            EdgeEffect orCreateTopEffect = edgeEffectWrapper.getOrCreateTopEffect();
            z2 = drawWithRotation(RecyclerView.DECELERATION_RATE, orCreateTopEffect, beginRecording) || z2;
            c = ' ';
            if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.topEffect)) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.m166displacementF1C5BW0$foundation() >> 32));
                EdgeEffect edgeEffect12 = edgeEffectWrapper.topEffectNegation;
                if (edgeEffect12 == null) {
                    edgeEffect12 = edgeEffectWrapper.createEdgeEffect(Orientation.Vertical);
                    edgeEffectWrapper.topEffectNegation = edgeEffect12;
                }
                CanvasKt.onPullDistanceCompat(edgeEffect12, CanvasKt.getDistanceCompat(orCreateTopEffect), intBitsToFloat2);
            }
        } else {
            c = ' ';
        }
        if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.rightEffectNegation)) {
            EdgeEffect edgeEffect13 = edgeEffectWrapper.rightEffectNegation;
            if (edgeEffect13 == null) {
                edgeEffect13 = edgeEffectWrapper.createEdgeEffect(Orientation.Horizontal);
                edgeEffectWrapper.rightEffectNegation = edgeEffect13;
            }
            drawWithRotation(270.0f, edgeEffect13, beginRecording);
            edgeEffect13.finish();
        }
        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.rightEffect)) {
            EdgeEffect orCreateRightEffect = edgeEffectWrapper.getOrCreateRightEffect();
            z2 = drawWithRotation(90.0f, orCreateRightEffect, beginRecording) || z2;
            if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.rightEffect)) {
                float intBitsToFloat3 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.m166displacementF1C5BW0$foundation() & BodyPartID.bodyIdMax));
                EdgeEffect edgeEffect14 = edgeEffectWrapper.rightEffectNegation;
                if (edgeEffect14 == null) {
                    edgeEffect14 = edgeEffectWrapper.createEdgeEffect(Orientation.Horizontal);
                    edgeEffectWrapper.rightEffectNegation = edgeEffect14;
                }
                CanvasKt.onPullDistanceCompat(edgeEffect14, CanvasKt.getDistanceCompat(orCreateRightEffect), intBitsToFloat3);
            }
        }
        if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.bottomEffectNegation)) {
            EdgeEffect edgeEffect15 = edgeEffectWrapper.bottomEffectNegation;
            if (edgeEffect15 == null) {
                edgeEffect15 = edgeEffectWrapper.createEdgeEffect(Orientation.Vertical);
                edgeEffectWrapper.bottomEffectNegation = edgeEffect15;
            }
            f = RecyclerView.DECELERATION_RATE;
            drawWithRotation(RecyclerView.DECELERATION_RATE, edgeEffect15, beginRecording);
            edgeEffect15.finish();
        } else {
            f = RecyclerView.DECELERATION_RATE;
        }
        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.bottomEffect)) {
            EdgeEffect orCreateBottomEffect = edgeEffectWrapper.getOrCreateBottomEffect();
            boolean z5 = drawWithRotation(180.0f, orCreateBottomEffect, beginRecording) || z2;
            if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.bottomEffect)) {
                float intBitsToFloat4 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.m166displacementF1C5BW0$foundation() >> c));
                EdgeEffect edgeEffect16 = edgeEffectWrapper.bottomEffectNegation;
                if (edgeEffect16 == null) {
                    edgeEffect16 = edgeEffectWrapper.createEdgeEffect(Orientation.Vertical);
                    edgeEffectWrapper.bottomEffectNegation = edgeEffect16;
                }
                CanvasKt.onPullDistanceCompat(edgeEffect16, CanvasKt.getDistanceCompat(orCreateBottomEffect), 1.0f - intBitsToFloat4);
            }
            z2 = z5;
        }
        if (z2) {
            androidEdgeEffectOverscrollEffect.invalidateOverscroll$foundation();
        }
        float f4 = z ? f : mo236toPx0680j_4;
        if (z3) {
            mo236toPx0680j_4 = f;
        }
        LayoutDirection layoutDirection = layoutNodeDrawScope.getLayoutDirection();
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.internalCanvas = beginRecording;
        long mo753getSizeNHjbRc2 = canvasDrawScope.mo753getSizeNHjbRc();
        Density density = canvasDrawScope.drawContext.getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.drawContext.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas = canvasDrawScope.drawContext.getCanvas();
        long m3999getSizeNHjbRc = canvasDrawScope.drawContext.m3999getSizeNHjbRc();
        GrpcMethod grpcMethod = canvasDrawScope.drawContext;
        GraphicsLayer graphicsLayer = (GraphicsLayer) grpcMethod.requestAdapter;
        grpcMethod.setDensity(layoutNodeDrawScope);
        grpcMethod.setLayoutDirection(layoutDirection);
        grpcMethod.setCanvas(androidCanvas);
        grpcMethod.m4000setSizeuvyYCjk(mo753getSizeNHjbRc2);
        grpcMethod.requestAdapter = null;
        androidCanvas.save();
        try {
            ((Extras.Key) canvasDrawScope.drawContext.path).translate(f4, mo236toPx0680j_4);
            try {
                layoutNodeDrawScope.drawContent();
                androidCanvas.restore();
                GrpcMethod grpcMethod2 = canvasDrawScope.drawContext;
                grpcMethod2.setDensity(density);
                grpcMethod2.setLayoutDirection(layoutDirection2);
                grpcMethod2.setCanvas(canvas);
                grpcMethod2.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
                grpcMethod2.requestAdapter = graphicsLayer;
                getRenderNode().endRecording();
                int save = nativeCanvas.save();
                nativeCanvas.translate(f2, f3);
                nativeCanvas.drawRenderNode(getRenderNode());
                nativeCanvas.restoreToCount(save);
            } finally {
                ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f4, -mo236toPx0680j_4);
            }
        } catch (Throwable th) {
            androidCanvas.restore();
            GrpcMethod grpcMethod3 = canvasDrawScope.drawContext;
            grpcMethod3.setDensity(density);
            grpcMethod3.setLayoutDirection(layoutDirection2);
            grpcMethod3.setCanvas(canvas);
            grpcMethod3.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
            grpcMethod3.requestAdapter = graphicsLayer;
            throw th;
        }
    }

    public final RenderNode getRenderNode() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNode2;
        return renderNode2;
    }
}
