package androidx.compose.ui.focus;

import androidx.camera.video.Recorder;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout$BeyondBoundsScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.platform.AndroidComposeView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public abstract class FocusOwnerImplKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1) {
        int ordinal = focusTargetNode.getFocusState$1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
                if (activeChild == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = activeChild.getFocusState$1().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return false;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (backwardFocusSearch(activeChild, focusOwnerImpl$focusSearch$1) || m600generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, 2, focusOwnerImpl$focusSearch$1) || (activeChild.fetchFocusProperties$ui().canFocus && ((Boolean) focusOwnerImpl$focusSearch$1.invoke(activeChild)).booleanValue())) {
                        return true;
                    }
                }
                return m600generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, 2, focusOwnerImpl$focusSearch$1);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return false;
                }
                if (!pickChildForBackwardSearch(focusTargetNode, focusOwnerImpl$focusSearch$1)) {
                    if (!(focusTargetNode.fetchFocusProperties$ui().canFocus ? ((Boolean) focusOwnerImpl$focusSearch$1.invoke(focusTargetNode)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return pickChildForBackwardSearch(focusTargetNode, focusOwnerImpl$focusSearch$1);
    }

    public static final Modifier focusProperties(Function1 function1) {
        return new FocusPropertiesElement(new FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(function1));
    }

    public static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1) {
        int ordinal = focusTargetNode.getFocusState$1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
                if (activeChild != null) {
                    return forwardFocusSearch(activeChild, focusOwnerImpl$focusSearch$1) || m600generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, 1, focusOwnerImpl$focusSearch$1);
                }
                a$$ExternalSyntheticBUOutline0.m$1("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return focusTargetNode.fetchFocusProperties$ui().canFocus ? ((Boolean) focusOwnerImpl$focusSearch$1.invoke(focusTargetNode)).booleanValue() : pickChildForForwardSearch(focusTargetNode, focusOwnerImpl$focusSearch$1);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
        }
        return pickChildForForwardSearch(focusTargetNode, focusOwnerImpl$focusSearch$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x008c, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean freeFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        Modifier.Node node = ((Modifier.Node) focusRequesterModifierNode).getNode();
        MutableVector mutableVector = null;
        while (true) {
            if (node != null) {
                if (node instanceof FocusTargetNode) {
                    if (FocusTraversalKt.freeFocus((FocusTargetNode) node)) {
                        break;
                    }
                } else if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                    int i = 0;
                    for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                        if ((node2.getKindSet$ui() & 1024) != 0) {
                            i++;
                            if (i == 1) {
                                node = node2;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                }
                                if (node != null) {
                                    mutableVector.add(node);
                                    node = null;
                                }
                                mutableVector.add(node2);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DepthSortedSetKt.access$pop(mutableVector);
            } else {
                Modifier.Node node3 = (Modifier.Node) focusRequesterModifierNode;
                if (!node3.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                Modifier.Node child$ui = node3.getNode().getChild$ui();
                if (child$ui == null) {
                    DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector2, node3.getNode());
                } else {
                    mutableVector2.add(child$ui);
                }
                loop2: while (true) {
                    int i2 = mutableVector2.size;
                    if (i2 == 0) {
                        return false;
                    }
                    Modifier.Node node4 = (Modifier.Node) mutableVector2.removeAt(i2 - 1);
                    if ((node4.getAggregateChildKindSet$ui() & 1024) == 0) {
                        DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector2, node4);
                    } else {
                        while (true) {
                            if (node4 == null) {
                                break;
                            }
                            if ((node4.getKindSet$ui() & 1024) != 0) {
                                MutableVector mutableVector3 = null;
                                while (node4 != null) {
                                    if (node4 instanceof FocusTargetNode) {
                                        if (FocusTraversalKt.freeFocus((FocusTargetNode) node4)) {
                                            break loop2;
                                        }
                                    } else if ((node4.getKindSet$ui() & 1024) != 0 && (node4 instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node node5 = ((DelegatingNode) node4).delegate; node5 != null; node5 = node5.getChild$ui()) {
                                            if ((node5.getKindSet$ui() & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    node4 = node5;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node4 != null) {
                                                        mutableVector3.add(node4);
                                                        node4 = null;
                                                    }
                                                    mutableVector3.add(node5);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    node4 = DepthSortedSetKt.access$pop(mutableVector3);
                                }
                            } else {
                                node4 = node4.getChild$ui();
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m600generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1) {
        if (m604searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, focusOwnerImpl$focusSearch$1)) {
            return true;
        }
        Boolean bool = (Boolean) m603searchBeyondBoundsOMvw8(focusTargetNode, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.getActiveFocusTargetNode(), focusTargetNode, focusTargetNode2, i, focusOwnerImpl$focusSearch$1, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m601is1dFocusSearch3ESFkO8(int i) {
        return i == 1 || i == 2;
    }

    public static final Modifier onFocusChanged(Modifier modifier, Function1 function1) {
        return modifier.then(new FocusChangedElement(function1));
    }

    public static final Modifier onFocusEvent(Modifier modifier, Function1 function1) {
        return modifier.then(new FocusEventElement(function1));
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m602oneDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1) {
        if (i == 1) {
            return forwardFocusSearch(focusTargetNode, focusOwnerImpl$focusSearch$1);
        }
        if (i == 2) {
            return backwardFocusSearch(focusTargetNode, focusOwnerImpl$focusSearch$1);
        }
        a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 1-D focus search");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1) {
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(0, new Modifier.Node[16]);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, focusTargetNode.getNode());
        } else {
            mutableVector.add(child$ui);
        }
        int i = 0;
        while (true) {
            int i2 = mutableVector.size;
            if (i2 == 0) {
                break;
            }
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(i2 - 1);
            if ((node.getAggregateChildKindSet$ui() & 1024) == 0) {
                DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                int i3 = i + 1;
                                if (focusTargetNodeArr.length < i3) {
                                    int length = focusTargetNodeArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(focusTargetNodeArr, 0, r10, 0, length);
                                    focusTargetNodeArr = r10;
                                }
                                focusTargetNodeArr[i] = focusTargetNode2;
                                i = i3;
                            } else if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                    if ((node2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            node = node2;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector2.add(node);
                                                node = null;
                                            }
                                            mutableVector2.add(node2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            node = DepthSortedSetKt.access$pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(focusTargetNodeArr, 0, i, FocusableChildrenComparator.INSTANCE);
        int i5 = i - 1;
        if (i5 < focusTargetNodeArr.length) {
            while (i5 >= 0) {
                FocusTargetNode focusTargetNode3 = focusTargetNodeArr[i5];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && backwardFocusSearch(focusTargetNode3, focusOwnerImpl$focusSearch$1)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1) {
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(0, new Modifier.Node[16]);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, focusTargetNode.getNode());
        } else {
            mutableVector.add(child$ui);
        }
        int i = 0;
        while (true) {
            int i2 = mutableVector.size;
            if (i2 == 0) {
                break;
            }
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(i2 - 1);
            if ((node.getAggregateChildKindSet$ui() & 1024) == 0) {
                DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                int i3 = i + 1;
                                if (focusTargetNodeArr.length < i3) {
                                    int length = focusTargetNodeArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(focusTargetNodeArr, 0, r10, 0, length);
                                    focusTargetNodeArr = r10;
                                }
                                focusTargetNodeArr[i] = focusTargetNode2;
                                i = i3;
                            } else if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                    if ((node2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            node = node2;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector2.add(node);
                                                node = null;
                                            }
                                            mutableVector2.add(node2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            node = DepthSortedSetKt.access$pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(focusTargetNodeArr, 0, i, FocusableChildrenComparator.INSTANCE);
        for (int i5 = 0; i5 < i; i5++) {
            FocusTargetNode focusTargetNode3 = focusTargetNodeArr[i5];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, focusOwnerImpl$focusSearch$1)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final Object m603searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i, Function1 function1) {
        int i2;
        final int i3;
        Object obj;
        Modifier.Node node;
        final LazyLayoutBeyondBoundsProviderModifierNode beyondBoundsLayoutParent;
        NodeChain nodeChain;
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                        node = parent$ui;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                    if ((node2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            node = node2;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(node2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            node = DepthSortedSetKt.access$pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
        if ((focusTargetNode2 == null || !Intrinsics.areEqual(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) && (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) != null) {
            int i5 = 5;
            if (i != 5) {
                i5 = 6;
                if (i != 6) {
                    i5 = 3;
                    if (i != 3) {
                        i5 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i3 = 2;
                            } else if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("Unsupported direction for beyond bounds layout");
                            }
                            if (beyondBoundsLayoutParent.state.getItemCount() > 0 || !beyondBoundsLayoutParent.state.getHasVisibleItems() || !beyondBoundsLayoutParent.isAttached()) {
                                return function1.invoke(LazyLayoutBeyondBoundsProviderModifierNode.emptyBeyondBoundsScope);
                            }
                            boolean m319isForward4vf7U8o = beyondBoundsLayoutParent.m319isForward4vf7U8o(i3);
                            LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState = beyondBoundsLayoutParent.state;
                            int lastPlacedIndex = m319isForward4vf7U8o ? lazyLayoutBeyondBoundsState.getLastPlacedIndex() : lazyLayoutBeyondBoundsState.getFirstPlacedIndex();
                            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            Recorder.AnonymousClass6 anonymousClass6 = beyondBoundsLayoutParent.beyondBoundsInfo;
                            anonymousClass6.getClass();
                            LazyLayoutBeyondBoundsInfo$Interval lazyLayoutBeyondBoundsInfo$Interval = new LazyLayoutBeyondBoundsInfo$Interval(lastPlacedIndex, lastPlacedIndex);
                            ((MutableVector) anonymousClass6.this$0).add(lazyLayoutBeyondBoundsInfo$Interval);
                            ref$ObjectRef.element = lazyLayoutBeyondBoundsInfo$Interval;
                            int itemsPerViewport = beyondBoundsLayoutParent.state.itemsPerViewport() * 2;
                            int itemCount = beyondBoundsLayoutParent.state.getItemCount();
                            if (itemsPerViewport > itemCount) {
                                itemsPerViewport = itemCount;
                            }
                            while (obj == null && beyondBoundsLayoutParent.m318hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo$Interval) ref$ObjectRef.element, i3) && i2 < itemsPerViewport) {
                                LazyLayoutBeyondBoundsInfo$Interval lazyLayoutBeyondBoundsInfo$Interval2 = (LazyLayoutBeyondBoundsInfo$Interval) ref$ObjectRef.element;
                                int i6 = lazyLayoutBeyondBoundsInfo$Interval2.start;
                                int i7 = lazyLayoutBeyondBoundsInfo$Interval2.end;
                                if (beyondBoundsLayoutParent.m319isForward4vf7U8o(i3)) {
                                    i7++;
                                } else {
                                    i6--;
                                }
                                Recorder.AnonymousClass6 anonymousClass62 = beyondBoundsLayoutParent.beyondBoundsInfo;
                                anonymousClass62.getClass();
                                LazyLayoutBeyondBoundsInfo$Interval lazyLayoutBeyondBoundsInfo$Interval3 = new LazyLayoutBeyondBoundsInfo$Interval(i6, i7);
                                ((MutableVector) anonymousClass62.this$0).add(lazyLayoutBeyondBoundsInfo$Interval3);
                                ((MutableVector) beyondBoundsLayoutParent.beyondBoundsInfo.this$0).remove((LazyLayoutBeyondBoundsInfo$Interval) ref$ObjectRef.element);
                                ref$ObjectRef.element = lazyLayoutBeyondBoundsInfo$Interval3;
                                i2++;
                                DepthSortedSetKt.requireLayoutNode(beyondBoundsLayoutParent).forceRemeasure();
                                obj = function1.invoke(new BeyondBoundsLayout$BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode$layout$2
                                    @Override // androidx.compose.ui.layout.BeyondBoundsLayout$BeyondBoundsScope
                                    public final boolean getHasMoreContent() {
                                        return LazyLayoutBeyondBoundsProviderModifierNode.this.m318hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo$Interval) ref$ObjectRef.element, i3);
                                    }
                                });
                            }
                            ((MutableVector) beyondBoundsLayoutParent.beyondBoundsInfo.this$0).remove((LazyLayoutBeyondBoundsInfo$Interval) ref$ObjectRef.element);
                            DepthSortedSetKt.requireLayoutNode(beyondBoundsLayoutParent).forceRemeasure();
                            return obj;
                        }
                    }
                }
            }
            i3 = i5;
            if (beyondBoundsLayoutParent.state.getItemCount() > 0) {
            }
            return function1.invoke(LazyLayoutBeyondBoundsProviderModifierNode.emptyBeyondBoundsScope);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9 A[EDGE_INSN: B:151:0x01c9->B:132:0x01c9 BREAK  A[LOOP:5: B:91:0x014e->B:146:0x014e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0150  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m604searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1) {
        Modifier.Node node;
        LayoutNode requireLayoutNode;
        NodeChain nodeChain;
        if (focusTargetNode.getFocusState$1() != FocusStateImpl.ActiveParent) {
            a$$ExternalSyntheticBUOutline0.m$1("This function should only be used within a parent that has focus.");
            return false;
        }
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(0, new Modifier.Node[16]);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, focusTargetNode.getNode());
        } else {
            mutableVector.add(child$ui);
        }
        int i2 = 0;
        while (true) {
            int i3 = mutableVector.size;
            node = null;
            if (i3 == 0) {
                break;
            }
            Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(i3 - 1);
            if ((node2.getAggregateChildKindSet$ui() & 1024) == 0) {
                DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, node2);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                                int i4 = i2 + 1;
                                if (focusTargetNodeArr.length < i4) {
                                    int length = focusTargetNodeArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(focusTargetNodeArr, 0, r11, 0, length);
                                    focusTargetNodeArr = r11;
                                }
                                focusTargetNodeArr[i2] = focusTargetNode3;
                                i2 = i4;
                            } else if ((node2.getKindSet$ui() & 1024) != 0 && (node2 instanceof DelegatingNode)) {
                                int i5 = 0;
                                for (Modifier.Node node3 = ((DelegatingNode) node2).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                    if ((node3.getKindSet$ui() & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            node2 = node3;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node2 != null) {
                                                mutableVector2.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector2.add(node3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            node2 = DepthSortedSetKt.access$pop(mutableVector2);
                        }
                    } else {
                        node2 = node2.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(focusTargetNodeArr, 0, i2, FocusableChildrenComparator.INSTANCE);
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 1-D focus search");
                return false;
            }
            IntRange until = RangesKt___RangesKt.until(0, i2);
            int i6 = until.first;
            int i7 = until.last;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode4 = focusTargetNodeArr[i7];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && backwardFocusSearch(focusTargetNode4, focusOwnerImpl$focusSearch$1)) {
                            break;
                        }
                    }
                    if (Intrinsics.areEqual(focusTargetNodeArr[i7], focusTargetNode2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
                return true;
            }
            if (i != 1) {
                if (!focusTargetNode.getNode().isAttached()) {
                }
                Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
                requireLayoutNode = DepthSortedSetKt.requireLayoutNode(focusTargetNode);
                loop5: while (true) {
                    if (requireLayoutNode == null) {
                    }
                }
                if (node != null) {
                }
            }
            return false;
        }
        IntRange until2 = RangesKt___RangesKt.until(0, i2);
        int i8 = until2.first;
        int i9 = until2.last;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    FocusTargetNode focusTargetNode5 = focusTargetNodeArr[i8];
                    if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode5) && forwardFocusSearch(focusTargetNode5, focusOwnerImpl$focusSearch$1)) {
                        break;
                    }
                }
                if (Intrinsics.areEqual(focusTargetNodeArr[i8], focusTargetNode2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && focusTargetNode.fetchFocusProperties$ui().canFocus) {
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui2 = focusTargetNode.getNode().getParent$ui();
            requireLayoutNode = DepthSortedSetKt.requireLayoutNode(focusTargetNode);
            loop5: while (true) {
                if (requireLayoutNode == null) {
                    break;
                }
                if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui2 != null) {
                        if ((parent$ui2.getKindSet$ui() & 1024) != 0) {
                            Modifier.Node node4 = parent$ui2;
                            MutableVector mutableVector3 = null;
                            while (node4 != null) {
                                if (node4 instanceof FocusTargetNode) {
                                    node = node4;
                                    break loop5;
                                }
                                if ((node4.getKindSet$ui() & 1024) != 0 && (node4 instanceof DelegatingNode)) {
                                    int i10 = 0;
                                    for (Modifier.Node node5 = ((DelegatingNode) node4).delegate; node5 != null; node5 = node5.getChild$ui()) {
                                        if ((node5.getKindSet$ui() & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                node4 = node5;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (node4 != null) {
                                                    mutableVector3.add(node4);
                                                    node4 = null;
                                                }
                                                mutableVector3.add(node5);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                node4 = DepthSortedSetKt.access$pop(mutableVector3);
                            }
                        }
                        parent$ui2 = parent$ui2.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                parent$ui2 = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
            }
            if (node != null) {
                return ((Boolean) focusOwnerImpl$focusSearch$1.invoke(focusTargetNode)).booleanValue();
            }
        }
        return false;
    }
}
