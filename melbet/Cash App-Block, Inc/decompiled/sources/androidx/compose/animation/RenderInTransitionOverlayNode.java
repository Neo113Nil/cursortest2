package androidx.compose.animation;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.size.SizeKt;
import com.squareup.util.cash.Countries;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class RenderInTransitionOverlayNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public boolean enabled;
    public LayerWithRenderer layerWithRenderer;
    public SharedTransitionScope$skipToLookaheadSize$1 renderInOverlay;
    public SharedTransitionScopeImpl sharedScope;
    public final ParcelableSnapshotMutableFloatState zIndexInOverlay$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public long positionInOverlay = 0;

    public final class LayerWithRenderer implements LayerRenderer {
        public final GraphicsLayer layer;

        public LayerWithRenderer(GraphicsLayer graphicsLayer) {
            this.layer = graphicsLayer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public final void drawInOverlay(LayoutNodeDrawScope layoutNodeDrawScope) {
            CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
            RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this;
            if (renderInTransitionOverlayNode.enabled) {
                float intBitsToFloat = Float.intBitsToFloat((int) (renderInTransitionOverlayNode.positionInOverlay >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (renderInTransitionOverlayNode.positionInOverlay & BodyPartID.bodyIdMax));
                ((Extras.Key) canvasDrawScope.drawContext.path).translate(intBitsToFloat, intBitsToFloat2);
                try {
                    SizeKt.drawLayer(layoutNodeDrawScope, this.layer);
                } finally {
                    ((Extras.Key) canvasDrawScope.drawContext.path).translate(-intBitsToFloat, -intBitsToFloat2);
                }
            }
        }

        @Override // androidx.compose.animation.LayerRenderer
        public final float getZIndex() {
            return RenderInTransitionOverlayNode.this.zIndexInOverlay$delegate.getFloatValue();
        }
    }

    public RenderInTransitionOverlayNode(SharedTransitionScopeImpl sharedTransitionScopeImpl, SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1) {
        this.sharedScope = sharedTransitionScopeImpl;
        this.renderInOverlay = sharedTransitionScope$skipToLookaheadSize$1;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        GraphicsLayer graphicsLayer = layerWithRenderer != null ? layerWithRenderer.layer : null;
        if (graphicsLayer == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Error: layer never initialized");
            return;
        }
        layoutNodeDrawScope.m876recordJVtK1S4(Countries.m3990toIntSizeuvyYCjk(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc()), graphicsLayer, new SharedBoundsNode$draw$2(layoutNodeDrawScope));
        if (this.enabled) {
            return;
        }
        SizeKt.drawLayer(layoutNodeDrawScope, graphicsLayer);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new BoundsAnimation$animate$2(2, measureScope, this, mo833measureBRTryo0));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        LayerWithRenderer layerWithRenderer = new LayerWithRenderer(((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).graphicsContext.createGraphicsLayer());
        this.sharedScope.renderers.add(layerWithRenderer);
        this.layerWithRenderer = layerWithRenderer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            this.sharedScope.renderers.remove(layerWithRenderer);
            ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).graphicsContext.releaseGraphicsLayer(layerWithRenderer.layer);
        }
    }
}
