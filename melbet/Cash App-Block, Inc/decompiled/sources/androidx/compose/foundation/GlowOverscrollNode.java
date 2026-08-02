package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {
    public final EdgeEffectWrapper edgeEffectWrapper;
    public final PaddingValues glowDrawPadding;
    public final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public GlowOverscrollNode(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, PaddingValues paddingValues) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.glowDrawPadding = paddingValues;
        delegate(suspendingPointerInputModifierNodeImpl);
    }

    /* renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    public static boolean m174drawWithRotationAndOffsetubNVwUQ(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        boolean z;
        char c;
        long j;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        long mo753getSizeNHjbRc = canvasDrawScope.mo753getSizeNHjbRc();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.overscrollEffect;
        androidEdgeEffectOverscrollEffect.m171updateSizeuvyYCjk$foundation(mo753getSizeNHjbRc);
        if (Size.m644isEmptyimpl(canvasDrawScope.mo753getSizeNHjbRc())) {
            layoutNodeDrawScope.drawContent();
            return;
        }
        layoutNodeDrawScope.drawContent();
        androidEdgeEffectOverscrollEffect.redrawSignal.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvasDrawScope.drawContext.getCanvas());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean isAnimating = EdgeEffectWrapper.isAnimating(edgeEffectWrapper.leftEffect);
        PaddingValues paddingValues = this.glowDrawPadding;
        if (isAnimating) {
            EdgeEffect orCreateLeftEffect = edgeEffectWrapper.getOrCreateLeftEffect();
            float f = -Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
            z = m174drawWithRotationAndOffsetubNVwUQ(270.0f, (Float.floatToRawIntBits(layoutNodeDrawScope.mo236toPx0680j_4(paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutNodeDrawScope.getLayoutDirection()))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32), orCreateLeftEffect, nativeCanvas);
        } else {
            z = false;
        }
        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.topEffect)) {
            c = ' ';
            j = 4294967295L;
            z = m174drawWithRotationAndOffsetubNVwUQ(RecyclerView.DECELERATION_RATE, (((long) Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE)) << 32) | (((long) Float.floatToRawIntBits(layoutNodeDrawScope.mo236toPx0680j_4(paddingValues.mo267calculateTopPaddingD9Ej5fM()))) & BodyPartID.bodyIdMax), edgeEffectWrapper.getOrCreateTopEffect(), nativeCanvas) || z;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.rightEffect)) {
            z = m174drawWithRotationAndOffsetubNVwUQ(90.0f, (((long) Float.floatToRawIntBits(layoutNodeDrawScope.mo236toPx0680j_4(paddingValues.mo266calculateRightPaddingu2uoSUM(layoutNodeDrawScope.getLayoutDirection())) + (-((float) MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> c))))))) & j) | (((long) Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE)) << c), edgeEffectWrapper.getOrCreateRightEffect(), nativeCanvas) || z;
        }
        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.bottomEffect)) {
            EdgeEffect orCreateBottomEffect = edgeEffectWrapper.getOrCreateBottomEffect();
            z = m174drawWithRotationAndOffsetubNVwUQ(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & j))) + layoutNodeDrawScope.mo236toPx0680j_4(paddingValues.mo264calculateBottomPaddingD9Ej5fM()))) & j), orCreateBottomEffect, nativeCanvas) || z;
        }
        if (z) {
            androidEdgeEffectOverscrollEffect.invalidateOverscroll$foundation();
        }
    }
}
