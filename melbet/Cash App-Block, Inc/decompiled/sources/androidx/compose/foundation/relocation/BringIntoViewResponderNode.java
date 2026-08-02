package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import com.datadog.android.Datadog$getInstance$1$1;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public boolean hasBeenPlaced;
    public ContentInViewNode responder;

    public static final Rect bringIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, NodeCoordinator nodeCoordinator, Datadog$getInstance$1$1 datadog$getInstance$1$1) {
        Rect rect;
        if (bringIntoViewResponderNode.isAttached() && bringIntoViewResponderNode.hasBeenPlaced) {
            NodeCoordinator requireLayoutCoordinates = DepthSortedSetKt.requireLayoutCoordinates(bringIntoViewResponderNode);
            if (!nodeCoordinator.isAttached()) {
                nodeCoordinator = null;
            }
            if (nodeCoordinator != null && (rect = (Rect) datadog$getInstance$1$1.invoke()) != null) {
                return rect.m637translatek4lQ0M(requireLayoutCoordinates.localBoundingBoxOf(nodeCoordinator, false).m636getTopLeftF1C5BW0());
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    public final Object bringIntoView(NodeCoordinator nodeCoordinator, Datadog$getInstance$1$1 datadog$getInstance$1$1, ContinuationImpl continuationImpl) {
        Object coroutineScope = JobKt.coroutineScope(new BringIntoViewResponderNode$bringIntoView$2(this, nodeCoordinator, datadog$getInstance$1$1, new LaunchTracker$$ExternalSyntheticLambda0(1, this, nodeCoordinator, datadog$getInstance$1$1), null), continuationImpl);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.hasBeenPlaced = true;
    }
}
