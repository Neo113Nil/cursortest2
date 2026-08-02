package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.io.LinesSequence;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/RenderInTransitionOverlayNode;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RenderInTransitionOverlayNodeElement extends ModifierNodeElement {
    public final SharedTransitionScope$skipToLookaheadSize$1 renderInOverlay;
    public final SharedTransitionScopeImpl sharedTransitionScope;

    public RenderInTransitionOverlayNodeElement(SharedTransitionScopeImpl sharedTransitionScopeImpl, SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
        this.renderInOverlay = sharedTransitionScope$skipToLookaheadSize$1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new RenderInTransitionOverlayNode(this.sharedTransitionScope, this.renderInOverlay);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RenderInTransitionOverlayNodeElement) {
            RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
            if (this.sharedTransitionScope == renderInTransitionOverlayNodeElement.sharedTransitionScope && this.renderInOverlay == renderInTransitionOverlayNodeElement.renderInOverlay) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(RecyclerView.DECELERATION_RATE) + ((this.renderInOverlay.hashCode() + (this.sharedTransitionScope.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "renderInSharedTransitionOverlay";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.sharedTransitionScope, "sharedTransitionScope");
        linesSequence.set(this.renderInOverlay, "renderInOverlay");
        linesSequence.set(Float.valueOf(RecyclerView.DECELERATION_RATE), "zIndexInOverlay");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        RenderInTransitionOverlayNode renderInTransitionOverlayNode = (RenderInTransitionOverlayNode) node;
        renderInTransitionOverlayNode.sharedScope = this.sharedTransitionScope;
        renderInTransitionOverlayNode.renderInOverlay = this.renderInOverlay;
        renderInTransitionOverlayNode.zIndexInOverlay$delegate.setFloatValue(RecyclerView.DECELERATION_RATE);
    }
}
