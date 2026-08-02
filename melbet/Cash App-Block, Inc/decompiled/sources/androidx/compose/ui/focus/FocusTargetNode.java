package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.ContourLayout$matchParentX$1;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutAwareModifierNode, ObserverModifierNode, ModifierLocalModifierNode, DelegatableNode {
    public final int focusability;
    public final boolean isInteropViewHost;
    public boolean isProcessingCustomEnter;
    public boolean isProcessingCustomExit;
    public final Function2 onFocusChange;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/focus/FocusTargetNode$FocusTargetElement", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FocusTargetElement extends ModifierNodeElement {
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node create() {
            return new FocusTargetNode(0, null, 15);
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        }
    }

    public FocusTargetNode(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        function2 = (i2 & 4) != 0 ? null : function2;
        this.isInteropViewHost = z;
        this.onFocusChange = function2;
        this.focusability = i;
    }

    /* renamed from: assignFocus-3ESFkO8, reason: not valid java name */
    public final boolean m607assignFocus3ESFkO8(int i) {
        int ordinal = FocusTraversalKt.m616performCustomRequestFocusMxy_nc0(this, i).ordinal();
        if (ordinal == 0) {
            return FocusTraversalKt.performRequestFocus(this);
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public final void dispatchFocusCallbacks$ui(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        NodeChain nodeChain;
        Function2 function2;
        FocusOwnerImpl focusOwnerImpl = ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).focusOwner;
        FocusTargetNode activeFocusTargetNode = focusOwnerImpl.getActiveFocusTargetNode();
        if (!focusStateImpl.equals(focusStateImpl2) && (function2 = this.onFocusChange) != null) {
            function2.invoke(focusStateImpl, focusStateImpl2);
        }
        Modifier.Node node = getNode();
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(this);
        while (requireLayoutNode != null) {
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui() & 4096) != 0) {
                            DelegatingNode delegatingNode = node2;
                            ?? r5 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNode;
                                    if (activeFocusTargetNode == focusOwnerImpl.getActiveFocusTargetNode()) {
                                        focusEventModifierNode.onFocusEvent(focusStateImpl2);
                                    }
                                } else if ((delegatingNode.getKindSet$ui() & 4096) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNode.delegate;
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                    while (node3 != null) {
                                        if ((node3.getKindSet$ui() & 4096) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                delegatingNode = node3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r5.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r5.add(node3);
                                            }
                                        }
                                        node3 = node3.getChild$ui();
                                        delegatingNode = delegatingNode;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DepthSortedSetKt.access$pop(r5);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node2 = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    public final FocusPropertiesImpl fetchFocusProperties$ui() {
        boolean z;
        NodeChain nodeChain;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.canFocus = true;
        FocusRequester focusRequester = FocusRequester.Default;
        focusPropertiesImpl.next = focusRequester;
        focusPropertiesImpl.previous = focusRequester;
        focusPropertiesImpl.up = focusRequester;
        focusPropertiesImpl.down = focusRequester;
        focusPropertiesImpl.left = focusRequester;
        focusPropertiesImpl.right = focusRequester;
        focusPropertiesImpl.start = focusRequester;
        focusPropertiesImpl.end = focusRequester;
        focusPropertiesImpl.onEnter = FocusPropertiesImpl$onExit$1.INSTANCE$1;
        focusPropertiesImpl.onExit = FocusPropertiesImpl$onExit$1.INSTANCE;
        focusPropertiesImpl.focusRect = FocusProperties.Companion.UnsetFocusRect;
        int i = this.focusability;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((InputMode) ((InputModeManagerImpl) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalInputModeManager)).inputMode$delegate.getValue()).value == 1);
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("Unknown Focusability");
                return null;
            }
            z = false;
        }
        focusPropertiesImpl.canFocus = z;
        Modifier.Node node = getNode();
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(this);
        loop0: while (requireLayoutNode != null) {
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 3072) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 3072) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & 2048) != 0) {
                            ?? r7 = 0;
                            DelegatingNode delegatingNode = node2;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) delegatingNode).applyFocusProperties(focusPropertiesImpl);
                                } else if ((delegatingNode.getKindSet$ui() & 2048) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNode.delegate;
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    r7 = r7;
                                    while (node3 != null) {
                                        if ((node3.getKindSet$ui() & 2048) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
                                                delegatingNode = node3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r7.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r7.add(node3);
                                            }
                                        }
                                        node3 = node3.getChild$ui();
                                        delegatingNode = delegatingNode;
                                        r7 = r7;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DepthSortedSetKt.access$pop(r7);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node2 = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
        return focusPropertiesImpl;
    }

    public final Rect fetchFocusRect$ui(LayoutCoordinates layoutCoordinates) {
        long mo840localPositionOfS_NoaFU;
        Rect rect = fetchFocusProperties$ui().focusRect;
        if (rect == FocusProperties.Companion.UnsetFocusRect) {
            return layoutCoordinates != null ? layoutCoordinates.localBoundingBoxOf(DepthSortedSetKt.requireLayoutCoordinates(this), false) : DBUtil.m1180Recttz77jQw(0L, Countries.m3991toSizeozmzZPI(DepthSortedSetKt.requireLayoutCoordinates(this).measuredSize));
        }
        if (layoutCoordinates == null) {
            return rect;
        }
        mo840localPositionOfS_NoaFU = layoutCoordinates.mo840localPositionOfS_NoaFU(DepthSortedSetKt.requireLayoutCoordinates(this), 0L, (r4 & 4) != 0);
        return rect.m637translatek4lQ0M(mo840localPositionOfS_NoaFU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    public final LazyLayoutBeyondBoundsProviderModifierNode getBeyondBoundsLayoutParent() {
        NodeChain nodeChain;
        Object obj;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = getNode().getParent$ui();
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(this);
        while (true) {
            if (requireLayoutNode == null) {
                break;
            }
            DelegatingNode delegatingNode = parent$ui;
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 8388640) != 0) {
                while (delegatingNode != 0) {
                    if ((delegatingNode.getKindSet$ui() & 8388640) != 0) {
                        if ((8388608 & delegatingNode.getKindSet$ui()) != 0) {
                            if (!(delegatingNode instanceof BeyondBoundsLayoutProviderModifierNode)) {
                                if (delegatingNode instanceof DelegatingNode) {
                                    Modifier.Node node = delegatingNode.delegate;
                                    delegatingNode = 0;
                                    while (node != null) {
                                        if (node instanceof BeyondBoundsLayoutProviderModifierNode) {
                                            delegatingNode = node;
                                        }
                                        node = node.getChild$ui();
                                        delegatingNode = delegatingNode;
                                    }
                                } else {
                                    delegatingNode = 0;
                                }
                            }
                            BeyondBoundsLayoutProviderModifierNode beyondBoundsLayoutProviderModifierNode = (BeyondBoundsLayoutProviderModifierNode) delegatingNode;
                            if (beyondBoundsLayoutProviderModifierNode != null) {
                                return (LazyLayoutBeyondBoundsProviderModifierNode) beyondBoundsLayoutProviderModifierNode;
                            }
                        } else if ((delegatingNode.getKindSet$ui() & 32) == 0) {
                            continue;
                        } else {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                obj = delegatingNode;
                            } else if (delegatingNode instanceof DelegatingNode) {
                                obj = null;
                                for (Modifier.Node node2 = delegatingNode.delegate; node2 != null; node2 = node2.getChild$ui()) {
                                    if (node2 instanceof ModifierLocalModifierNode) {
                                        obj = node2;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) obj;
                            if (modifierLocalModifierNode != null && modifierLocalModifierNode.getProvidedValues().contains$ui(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout())) {
                                return (LazyLayoutBeyondBoundsProviderModifierNode) modifierLocalModifierNode.getProvidedValues().get$ui(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
                            }
                        }
                    }
                    delegatingNode = delegatingNode.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
        return null;
    }

    public final FocusStateImpl getFocusState$1() {
        FocusTargetNode activeFocusTargetNode;
        NodeChain nodeChain;
        if (isAttached() && (activeFocusTargetNode = ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).focusOwner.getActiveFocusTargetNode()) != null) {
            if (this == activeFocusTargetNode) {
                return FocusStateImpl.Active;
            }
            if (activeFocusTargetNode.isAttached()) {
                if (!activeFocusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui = activeFocusTargetNode.getNode().getParent$ui();
                LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(activeFocusTargetNode);
                while (requireLayoutNode != null) {
                    if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 1024) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                                Modifier.Node node = parent$ui;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) node)) {
                                            return FocusStateImpl.ActiveParent;
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
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui();
                    parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
                }
            }
            return FocusStateImpl.Inactive;
        }
        return FocusStateImpl.Inactive;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void invalidateFocus$ui() {
        int ordinal = getFocusState$1().ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DepthSortedSetKt.observeReads(this, new ViewRegistryKt$buildView$1$2$1$1(i, ref$ObjectRef, this));
        Object obj = ref$ObjectRef.element;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
            throw null;
        }
        if (((FocusProperties) obj).getCanFocus()) {
            return;
        }
        ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).focusOwner.clearFocus(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        int ordinal = getFocusState$1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusOwnerImpl focusOwnerImpl = ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).focusOwner;
                FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this);
                if (findActiveFocusNode == null || !findActiveFocusNode.isInteropViewHost) {
                    return;
                }
                focusOwnerImpl.platformFocusOwner.m919requestOwnerFocus7o62pno();
                focusOwnerImpl.focusInvalidationManager.scheduleInvalidation$2();
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        FocusOwnerImpl focusOwnerImpl2 = ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).focusOwner;
        focusOwnerImpl2.m594clearFocusI7lrPNg(8, true, false);
        if (this.isInteropViewHost) {
            focusOwnerImpl2.platformFocusOwner.m919requestOwnerFocus7o62pno();
        }
        focusOwnerImpl2.focusInvalidationManager.scheduleInvalidation$2();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        invalidateFocus$ui();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        if (getFocusState$1().isFocused()) {
            ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).focusOwner.m594clearFocusI7lrPNg(8, true, true);
        }
    }

    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    public final boolean m608requestFocus3ESFkO8(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return fetchFocusProperties$ui().canFocus ? m607assignFocus3ESFkO8(i) : FocusTraversalKt.m611findChildCorrespondingToFocusEnterOMvw8(this, i, new ContourLayout$matchParentX$1(i, 3));
        } finally {
            Trace.endSection();
        }
    }
}
