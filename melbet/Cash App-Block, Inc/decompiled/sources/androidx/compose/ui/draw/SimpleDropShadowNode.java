package androidx.compose.ui.draw;

import androidx.camera.video.Recorder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidGraphicsContext;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SimpleDropShadowNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    public Shadow shadow;
    public DropShadowPainter shadowPainter;
    public Shape shape;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        DropShadowPainter dropShadowPainter;
        DropShadowPainter dropShadowPainter2 = this.shadowPainter;
        if (dropShadowPainter2 == null) {
            AndroidGraphicsContext androidGraphicsContext = ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).graphicsContext;
            Recorder.AnonymousClass4 anonymousClass4 = androidGraphicsContext.shadowCache;
            if (anonymousClass4 == null) {
                anonymousClass4 = zzaer.ShadowContext();
                androidGraphicsContext.shadowCache = anonymousClass4;
            }
            DropShadowPainter dropShadowPainter3 = new DropShadowPainter(this.shape, this.shadow, anonymousClass4);
            this.shadowPainter = dropShadowPainter3;
            dropShadowPainter = dropShadowPainter3;
        } else {
            dropShadowPainter = dropShadowPainter2;
        }
        Painter.m761drawx_KDEd0$default(dropShadowPainter, layoutNodeDrawScope, layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc(), RecyclerView.DECELERATION_RATE, null, 6, null);
        layoutNodeDrawScope.drawContent();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SimpleDropShadowNode)) {
            return false;
        }
        SimpleDropShadowNode simpleDropShadowNode = (SimpleDropShadowNode) obj;
        return Intrinsics.areEqual(this.shape, simpleDropShadowNode.shape) && Intrinsics.areEqual(this.shadow, simpleDropShadowNode.shadow);
    }

    public final int hashCode() {
        return this.shadow.hashCode() + (this.shape.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.shadowPainter = null;
        DepthSortedSetKt.invalidateDraw(this);
    }
}
