package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.NodeCoordinator;

/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$PointerInputSource$1 implements NodeCoordinator.HitTestSource {
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    /* renamed from: childHitTest-qzLsGqo, reason: not valid java name */
    public final void mo905childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z) {
        layoutNode.m872hitTest6fMxITs$ui(j, hitTestResult, i, z);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    /* renamed from: entityType-OLwlOKw, reason: not valid java name */
    public final int mo906entityTypeOLwlOKw() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
        ?? r0 = 0;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents();
            } else if ((node.getKindSet$ui() & 16) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node node2 = node.delegate;
                int i = 0;
                r0 = r0;
                node = node;
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 16) != 0) {
                        i++;
                        r0 = r0;
                        if (i == 1) {
                            node = node2;
                        } else {
                            if (r0 == 0) {
                                r0 = new MutableVector(0, new Modifier.Node[16]);
                            }
                            if (node != 0) {
                                r0.add(node);
                                node = 0;
                            }
                            r0.add(node2);
                        }
                    }
                    node2 = node2.getChild$ui();
                    r0 = r0;
                    node = node;
                }
                if (i == 1) {
                }
            }
            node = DepthSortedSetKt.access$pop(r0);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode) {
        NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutNode.nodes.outerCoordinator;
        nodeCoordinator.getClass();
        Modifier.Node headNode = nodeCoordinator.headNode(NodeKindKt.m907getIncludeSelfInTraversalH91voCI(16));
        if (headNode != null && headNode.isAttached()) {
            if (!headNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node = headNode.getNode();
            if ((node.getAggregateChildKindSet$ui() & 16) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & 16) != 0) {
                        DelegatingNode delegatingNode = node;
                        ?? r3 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) delegatingNode).sharePointerInputWithSiblings()) {
                                    hitTestResult.hitDepth = hitTestResult.values._size - 1;
                                    return true;
                                }
                            } else if ((delegatingNode.getKindSet$ui() & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNode.delegate;
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r3 = r3;
                                while (node2 != null) {
                                    if ((node2.getKindSet$ui() & 16) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            delegatingNode = node2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r3.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r3.add(node2);
                                        }
                                    }
                                    node2 = node2.getChild$ui();
                                    delegatingNode = delegatingNode;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = DepthSortedSetKt.access$pop(r3);
                        }
                    }
                    node = node.getChild$ui();
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean shouldHitTestChildren(LayoutNode layoutNode) {
        return true;
    }
}
