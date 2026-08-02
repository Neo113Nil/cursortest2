package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public Modifier.Node delegate;
    public final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    public final void delegate(DelegatableNode delegatableNode) {
        Modifier.Node node = delegatableNode.getNode();
        if (node != delegatableNode) {
            Modifier.Node node2 = delegatableNode instanceof Modifier.Node ? (Modifier.Node) delegatableNode : null;
            Modifier.Node parent$ui = node2 != null ? node2.getParent$ui() : null;
            if (node == getNode() && Intrinsics.areEqual(parent$ui, this)) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Cannot delegate to an already delegated node");
            return;
        }
        if (node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui(getNode());
        int kindSet$ui = getKindSet$ui();
        int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
        node.setKindSet$ui(calculateNodeKindSetFromIncludingDelegates);
        int kindSet$ui2 = getKindSet$ui();
        int i = calculateNodeKindSetFromIncludingDelegates & 2;
        if (i != 0 && (kindSet$ui2 & 2) != 0 && !(this instanceof LayoutModifierNode)) {
            InlineClassHelperKt.throwIllegalStateException("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
        node.setChild$ui(this.delegate);
        this.delegate = node;
        node.setParent$ui(this);
        updateNodeKindSet(calculateNodeKindSetFromIncludingDelegates | getKindSet$ui(), false);
        if (isAttached()) {
            if (i == 0 || (kindSet$ui & 2) != 0) {
                updateCoordinator$ui(getCoordinator$ui());
            } else {
                NodeChain nodeChain = DepthSortedSetKt.requireLayoutNode(this).nodes;
                getNode().updateCoordinator$ui(null);
                nodeChain.syncCoordinators();
            }
            node.markAsAttached$ui();
            node.runAttachLifecycle$ui();
            NodeKindKt.autoInvalidateInsertedNode(node);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void markAsAttached$ui() {
        super.markAsAttached$ui();
        for (Modifier.Node node = this.delegate; node != null; node = node.getChild$ui()) {
            node.updateCoordinator$ui(getCoordinator$ui());
            if (!node.isAttached()) {
                node.markAsAttached$ui();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void markAsDetached$ui() {
        for (Modifier.Node node = this.delegate; node != null; node = node.getChild$ui()) {
            node.markAsDetached$ui();
        }
        super.markAsDetached$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void reset$ui() {
        super.reset$ui();
        for (Modifier.Node node = this.delegate; node != null; node = node.getChild$ui()) {
            node.reset$ui();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void runAttachLifecycle$ui() {
        for (Modifier.Node node = this.delegate; node != null; node = node.getChild$ui()) {
            node.runAttachLifecycle$ui();
        }
        super.runAttachLifecycle$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void runDetachLifecycle$ui() {
        super.runDetachLifecycle$ui();
        for (Modifier.Node node = this.delegate; node != null; node = node.getChild$ui()) {
            node.runDetachLifecycle$ui();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void setAsDelegateTo$ui(Modifier.Node node) {
        super.setAsDelegateTo$ui(node);
        for (Modifier.Node node2 = this.delegate; node2 != null; node2 = node2.getChild$ui()) {
            node2.setAsDelegateTo$ui(node);
        }
    }

    public final void undelegate(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.delegate; node2 != null; node2 = node2.getChild$ui()) {
            if (node2 == delegatableNode) {
                if (node2.isAttached()) {
                    MutableObjectIntMap mutableObjectIntMap = NodeKindKt.classToKindSetMap;
                    if (!node2.isAttached()) {
                        InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
                    }
                    NodeKindKt.autoInvalidateNodeIncludingDelegates(node2, -1, 2);
                    node2.runDetachLifecycle$ui();
                    node2.markAsDetached$ui();
                }
                node2.setAsDelegateTo$ui(node2);
                node2.setAggregateChildKindSet$ui(0);
                if (node == null) {
                    this.delegate = node2.getChild$ui();
                } else {
                    node.setChild$ui(node2.getChild$ui());
                }
                node2.setChild$ui(null);
                node2.setParent$ui(null);
                int kindSet$ui = getKindSet$ui();
                int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                updateNodeKindSet(calculateNodeKindSetFromIncludingDelegates, true);
                if (isAttached() && (kindSet$ui & 2) != 0 && (calculateNodeKindSetFromIncludingDelegates & 2) == 0) {
                    NodeChain nodeChain = DepthSortedSetKt.requireLayoutNode(this).nodes;
                    getNode().updateCoordinator$ui(null);
                    nodeChain.syncCoordinators();
                    return;
                }
                return;
            }
            node = node2;
        }
        Path$$ExternalSyntheticBUOutline0.m$1(delegatableNode, "Could not find delegate: ");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void updateCoordinator$ui(NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui(nodeCoordinator);
        for (Modifier.Node node = this.delegate; node != null; node = node.getChild$ui()) {
            node.updateCoordinator$ui(nodeCoordinator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void updateNodeKindSet(int i, boolean z) {
        Modifier.Node child$ui;
        int kindSet$ui = getKindSet$ui();
        setKindSet$ui(i);
        if (kindSet$ui != i) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui(i);
            }
            if (isAttached()) {
                Modifier.Node node = getNode();
                ?? r2 = this;
                while (r2 != 0) {
                    i |= r2.getKindSet$ui();
                    r2.setKindSet$ui(i);
                    if (r2 == node) {
                        break;
                    } else {
                        r2 = r2.getParent$ui();
                    }
                }
                if (z && r2 == node) {
                    i = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui(i);
                }
                int aggregateChildKindSet$ui = i | ((r2 == 0 || (child$ui = r2.getChild$ui()) == null) ? 0 : child$ui.getAggregateChildKindSet$ui());
                for (Modifier.Node node2 = r2; node2 != null; node2 = node2.getParent$ui()) {
                    aggregateChildKindSet$ui |= node2.getKindSet$ui();
                    node2.setAggregateChildKindSet$ui(aggregateChildKindSet$ui);
                }
            }
        }
    }
}
