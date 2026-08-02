package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import coil3.ImageLoader$Builder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class NodeCoordinator$drawBlock$1 extends Lambda implements Function2 {
    public final /* synthetic */ NodeCoordinator$invalidateParentLayer$1 $drawBlockCallToDrawModifiers;
    public final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(NodeCoordinator nodeCoordinator, NodeCoordinator$invalidateParentLayer$1 nodeCoordinator$invalidateParentLayer$1) {
        super(2);
        this.this$0 = nodeCoordinator;
        this.$drawBlockCallToDrawModifiers = nodeCoordinator$invalidateParentLayer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Canvas canvas = (Canvas) obj;
        GraphicsLayer graphicsLayer = (GraphicsLayer) obj2;
        NodeCoordinator nodeCoordinator = this.this$0;
        LayoutNode layoutNode = nodeCoordinator.layoutNode;
        if (layoutNode.isPlaced()) {
            nodeCoordinator.drawBlockCanvas = canvas;
            nodeCoordinator.drawBlockParentLayer = graphicsLayer;
            ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).snapshotObserver;
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.graphicsLayerScope;
            ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(nodeCoordinator, OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$3, this.$drawBlockCallToDrawModifiers);
            nodeCoordinator.lastLayerDrawingWasSkipped = false;
        } else {
            nodeCoordinator.lastLayerDrawingWasSkipped = true;
        }
        return Unit.INSTANCE;
    }
}
