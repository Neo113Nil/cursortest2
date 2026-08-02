package androidx.compose.ui.node;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.ImageLoader$Builder;
import coil3.memory.MemoryCacheService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class DepthSortedSetKt {
    public static final DepthSortedSetKt$DepthComparator$1 DepthComparator = new DepthSortedSetKt$DepthComparator$1(0);

    public static final void access$addLayoutNodeChildren(MutableVector mutableVector, Modifier.Node node) {
        MutableVector mutableVector2 = requireLayoutNode(node).get_children$ui();
        int i = mutableVector2.size - 1;
        Object[] objArr = mutableVector2.content;
        if (i < objArr.length) {
            while (i >= 0) {
                mutableVector.add((Modifier.Node) ((LayoutNode) objArr[i]).nodes.head);
                i--;
            }
        }
    }

    /* renamed from: access$nextUntil-hw7D004, reason: not valid java name */
    public static final Modifier.Node m863access$nextUntilhw7D004(DelegatableNode delegatableNode, int i) {
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & i) == 0) {
            return null;
        }
        while (child$ui != null) {
            int kindSet$ui = child$ui.getKindSet$ui();
            if ((kindSet$ui & 2) != 0) {
                return null;
            }
            if ((kindSet$ui & i) != 0) {
                return child$ui;
            }
            child$ui = child$ui.getChild$ui();
        }
        return null;
    }

    public static final Modifier.Node access$pop(MutableVector mutableVector) {
        int i;
        if (mutableVector == null || (i = mutableVector.size) == 0) {
            return null;
        }
        return (Modifier.Node) mutableVector.removeAt(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((node.getKindSet$ui() & 2) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node node2 = ((DelegatingNode) node).delegate;
                while (node2 != 0) {
                    if (node2 instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) node2;
                    }
                    node2 = (!(node2 instanceof DelegatingNode) || (node2.getKindSet$ui() & 2) == 0) ? node2.getChild$ui() : ((DelegatingNode) node2).delegate;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object currentValueOf(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, ProvidableCompositionLocal providableCompositionLocal) {
        if (!((Modifier.Node) compositionLocalConsumerModifierNode).getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) requireLayoutNode(compositionLocalConsumerModifierNode).compositionLocalMap;
        persistentCompositionLocalHashMap.getClass();
        return Updater.read(persistentCompositionLocalHashMap, providableCompositionLocal);
    }

    public static final Rect effectiveBoundsInRoot(Modifier.Node node, boolean z, boolean z2) {
        if (!node.getNode().isAttached()) {
            return Rect.Zero;
        }
        if (z) {
            return m864requireCoordinator64DMado(node, 8).touchBoundsInRoot();
        }
        NodeCoordinator m864requireCoordinator64DMado = m864requireCoordinator64DMado(node, 8);
        return ValueInsets.findRootCoordinates(m864requireCoordinator64DMado).localBoundingBoxOf(m864requireCoordinator64DMado, z2);
    }

    public static final TraversableNode findNearestAncestor(Modifier.Node node, Object obj) {
        NodeChain nodeChain;
        if (!node.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = node.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(node);
        while (requireLayoutNode != null) {
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                        Modifier.Node node2 = parent$ui;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) node2;
                                if (obj.equals(traversableNode.getTraverseKey())) {
                                    return traversableNode;
                                }
                            }
                            if ((node2.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0 && (node2 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node node3 = ((DelegatingNode) node2).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                    if ((node3.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node2 = node3;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node2 != null) {
                                                mutableVector.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector.add(node3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node2 = access$pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        if (((Modifier.Node) drawModifierNode).getNode().isAttached()) {
            m864requireCoordinator64DMado(drawModifierNode, 1).invalidateLayer();
        }
    }

    public static final boolean isOutMostLookaheadRoot(LayoutNode layoutNode) {
        if (layoutNode.lookaheadRoot == null) {
            return false;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui != null ? parent$ui.lookaheadRoot : null) == null || layoutNode.layoutDelegate.detachedFromParentLookaheadPass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void observeReads(Modifier.Node node, Function0 function0) {
        ObserverNodeOwnerScope ownerScope$ui = node.getOwnerScope$ui();
        if (ownerScope$ui == null) {
            ownerScope$ui = new ObserverNodeOwnerScope((ObserverModifierNode) node);
            node.setOwnerScope$ui(ownerScope$ui);
        }
        ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) requireOwner(node)).snapshotObserver;
        ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(ownerScope$ui, OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$5, function0);
    }

    public static final void requestAutofill(DelegatableNode delegatableNode) {
        final AndroidAutofillManager androidAutofillManager;
        final LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        if (requireLayoutNode.isCurrentlyCalculatingSemanticsConfiguration || (androidAutofillManager = ((AndroidComposeView) LayoutNodeKt.requireOwner(requireLayoutNode))._autofillManager) == null) {
            return;
        }
        androidAutofillManager.rectManager.rects.withRect(requireLayoutNode.semanticsId, new Function4() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                int intValue3 = ((Number) obj3).intValue();
                int intValue4 = ((Number) obj4).intValue();
                AndroidAutofillManager androidAutofillManager2 = AndroidAutofillManager.this;
                androidAutofillManager2.reusableRect.set(intValue, intValue2, intValue3, intValue4);
                MemoryCacheService memoryCacheService = androidAutofillManager2.platformAutofillManager;
                ((AutofillManager) memoryCacheService.imageLoader).requestAutofill(androidAutofillManager2.view, requireLayoutNode.semanticsId, androidAutofillManager2.reusableRect);
                return Unit.INSTANCE;
            }
        });
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m864requireCoordinator64DMado(DelegatableNode delegatableNode, int i) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        if (coordinator$ui.getTail() != delegatableNode || !NodeKindKt.m907getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator$ui;
        }
        NodeCoordinator nodeCoordinator = coordinator$ui.wrapped;
        nodeCoordinator.getClass();
        return nodeCoordinator;
    }

    public static final NodeCoordinator requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        NodeCoordinator m864requireCoordinator64DMado = m864requireCoordinator64DMado(delegatableNode, 2);
        if (!m864requireCoordinator64DMado.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return m864requireCoordinator64DMado;
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator$ui();
        if (coordinator$ui != null) {
            return coordinator$ui.layoutNode;
        }
        throw Boxes$$ExternalSyntheticOutline1.m1150m("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner = requireLayoutNode(delegatableNode).owner;
        if (owner != null) {
            return owner;
        }
        throw Boxes$$ExternalSyntheticOutline1.m1150m("This node does not have an owner.");
    }

    public static final View requireView(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) LayoutNodeKt.requireOwner(requireLayoutNode(delegatableNode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void traverseAncestors(TraversableNode traversableNode, Function1 function1) {
        NodeChain nodeChain;
        if (!traversableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = traversableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(traversableNode);
        while (requireLayoutNode != null) {
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                        DelegatingNode delegatingNode = parent$ui;
                        ?? r5 = 0;
                        while (delegatingNode != 0) {
                            boolean z = true;
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) delegatingNode;
                                if (Intrinsics.areEqual(traversableNode.getTraverseKey(), traversableNode2.getTraverseKey()) && traversableNode.getClass() == traversableNode2.getClass()) {
                                    z = ((Boolean) function1.invoke(traversableNode2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((delegatingNode.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node = delegatingNode.delegate;
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r5 = r5;
                                while (node != null) {
                                    if ((node.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            delegatingNode = node;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r5.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r5.add(node);
                                        }
                                    }
                                    node = node.getChild$ui();
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = access$pop(r5);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.ui.node.TraversableNode, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void traverseDescendants(TraversableNode traversableNode, Function1 function1) {
        Modifier.Node node = (Modifier.Node) traversableNode;
        if (!node.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(0, new Modifier.Node[16]);
        Modifier.Node child$ui = node.getNode().getChild$ui();
        if (child$ui == null) {
            access$addLayoutNodeChildren(mutableVector, node.getNode());
        } else {
            mutableVector.add(child$ui);
        }
        while (true) {
            int i = mutableVector.size;
            if (i == 0) {
                return;
            }
            Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(i - 1);
            if ((node2.getAggregateChildKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                for (Modifier.Node node3 = node2; node3 != null && node3.isAttached(); node3 = node3.getChild$ui()) {
                    if ((node3.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                        DelegatingNode delegatingNode = node3;
                        ?? r8 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) delegatingNode;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (Intrinsics.areEqual(traversableNode.getTraverseKey(), traversableNode2.getTraverseKey()) && traversableNode.getClass() == traversableNode2.getClass()) ? (TraversableNode$Companion$TraverseDescendantsAction) function1.invoke(traversableNode2) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNode.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node4 = delegatingNode.delegate;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r8 = r8;
                                while (node4 != null) {
                                    if ((node4.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            delegatingNode = node4;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r8.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r8.add(node4);
                                        }
                                    }
                                    node4 = node4.getChild$ui();
                                    delegatingNode = delegatingNode;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = access$pop(r8);
                        }
                    }
                }
            }
            access$addLayoutNodeChildren(mutableVector, node2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void traverseAncestors(DelegatableNode delegatableNode, Object obj, Function1 function1) {
        NodeChain nodeChain;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                        DelegatingNode delegatingNode = parent$ui;
                        ?? r4 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (!(obj.equals(traversableNode.getTraverseKey()) ? ((Boolean) function1.invoke(traversableNode)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((delegatingNode.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node = delegatingNode.delegate;
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r4 = r4;
                                while (node != null) {
                                    if ((node.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            delegatingNode = node;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r4.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r4.add(node);
                                        }
                                    }
                                    node = node.getChild$ui();
                                    delegatingNode = delegatingNode;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = access$pop(r4);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void traverseDescendants(Modifier.Node node, String str, Function1 function1) {
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction;
        if (!node.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(0, new Modifier.Node[16]);
        Modifier.Node child$ui = node.getNode().getChild$ui();
        if (child$ui == null) {
            access$addLayoutNodeChildren(mutableVector, node.getNode());
        } else {
            mutableVector.add(child$ui);
        }
        while (true) {
            int i = mutableVector.size;
            if (i == 0) {
                return;
            }
            Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(i - 1);
            if ((node2.getAggregateChildKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                for (Modifier.Node node3 = node2; node3 != null && node3.isAttached(); node3 = node3.getChild$ui()) {
                    if ((node3.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                        DelegatingNode delegatingNode = node3;
                        ?? r7 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (str.equals(traversableNode.getTraverseKey())) {
                                    traversableNode$Companion$TraverseDescendantsAction = (TraversableNode$Companion$TraverseDescendantsAction) function1.invoke(traversableNode);
                                } else {
                                    traversableNode$Companion$TraverseDescendantsAction = TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNode.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node4 = delegatingNode.delegate;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r7 = r7;
                                while (node4 != null) {
                                    if ((node4.getKindSet$ui() & PKIFailureInfo.transactionIdInUse) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            delegatingNode = node4;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r7.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r7.add(node4);
                                        }
                                    }
                                    node4 = node4.getChild$ui();
                                    delegatingNode = delegatingNode;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = access$pop(r7);
                        }
                    }
                }
            }
            access$addLayoutNodeChildren(mutableVector, node2);
        }
    }
}
