package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.tracing.Trace;

/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$SemanticsSource$1 implements NodeCoordinator.HitTestSource {
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    /* renamed from: childHitTest-qzLsGqo */
    public final void mo905childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeChain nodeChain = layoutNode.nodes;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.graphicsLayerScope;
        ((NodeCoordinator) nodeChain.outerCoordinator).m898hitTestqzLsGqo(NodeCoordinator.SemanticsSource, nodeCoordinator.m893fromParentPosition8S9VItk(j, true), hitTestResult, 1, z);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    /* renamed from: entityType-OLwlOKw */
    public final int mo906entityTypeOLwlOKw() {
        return 8;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
        return false;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode) {
        return false;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean shouldHitTest(Modifier.Node node) {
        return SemanticsOwnerKt.isImportantForAccessibility(Trace.SemanticsNode(DepthSortedSetKt.requireLayoutNode(node), false));
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean shouldHitTestChildren(LayoutNode layoutNode) {
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        boolean z = false;
        if (semanticsConfiguration != null && semanticsConfiguration.isClearingSemantics) {
            z = true;
        }
        return !z;
    }
}
