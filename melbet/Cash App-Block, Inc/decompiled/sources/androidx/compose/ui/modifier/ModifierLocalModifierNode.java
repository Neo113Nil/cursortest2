package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TailModifierNode;
import androidx.core.os.BundleKt;
import coil3.Extras;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface ModifierLocalModifierNode extends DelegatableNode {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
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
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.node.DelegatableNode] */
    default Object getCurrent(Extras.Key key) {
        NodeChain nodeChain;
        Modifier.Node node = (Modifier.Node) this;
        if (!node.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        if (!node.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = node.getNode().getParent$ui();
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(this);
        while (requireLayoutNode != null) {
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 32) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 32) != 0) {
                        DelegatingNode delegatingNode = parent$ui;
                        ?? r3 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui(key)) {
                                    return modifierLocalModifierNode.getProvidedValues().get$ui(key);
                                }
                            } else if ((delegatingNode.getKindSet$ui() & 32) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNode.delegate;
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r3 = r3;
                                while (node2 != null) {
                                    if ((node2.getKindSet$ui() & 32) != 0) {
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
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
        return ((Function0) key.f61default).invoke();
    }

    default BundleKt getProvidedValues() {
        return EmptyMap.INSTANCE;
    }
}
