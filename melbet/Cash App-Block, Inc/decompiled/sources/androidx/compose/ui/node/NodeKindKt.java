package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusInvalidationManager;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnPlacedNode;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.work.impl.WorkLauncherImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class NodeKindKt {
    public static final MutableObjectIntMap classToKindSetMap;

    static {
        MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.EmptyObjectIntMap;
        classToKindSetMap = new MutableObjectIntMap();
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i, int i2) {
        if (!(node instanceof DelegatingNode)) {
            autoInvalidateNodeSelf(node, i & node.getKindSet$ui(), i2);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int i3 = delegatingNode.selfKindSet;
        autoInvalidateNodeSelf(node, i3 & i, i2);
        int i4 = (~i3) & i;
        for (Modifier.Node node2 = delegatingNode.delegate; node2 != null; node2 = node2.getChild$ui()) {
            autoInvalidateNodeIncludingDelegates(node2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void autoInvalidateNodeSelf(Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((i & 2) != 0 && (node instanceof LayoutModifierNode)) {
                DepthSortedSetKt.requireLayoutNode((LayoutModifierNode) node).invalidateMeasurements$ui();
                if (i2 == 2) {
                    DepthSortedSetKt.m864requireCoordinator64DMado(node, 2).onRelease();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                DepthSortedSetKt.requireLayoutNode(node).invalidateMeasurements$ui();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                DepthSortedSetKt.requireLayoutNode(node).requestRelayout$ui(false);
            }
            if ((i & 256) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
                if (i2 == 1) {
                    LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(node);
                    requireLayoutNode.setGloballyPositionedObservers(requireLayoutNode.globallyPositionedObservers + 1);
                } else if (i2 == 2) {
                    DepthSortedSetKt.requireLayoutNode(node).setGloballyPositionedObservers(r0.globallyPositionedObservers - 1);
                }
                if (i2 != 2) {
                    LayoutNode requireLayoutNode2 = DepthSortedSetKt.requireLayoutNode(node);
                    if (requireLayoutNode2.globallyPositionedObservers != 0 && !requireLayoutNode2.getLayoutPending$ui() && !requireLayoutNode2.getMeasurePending$ui() && !requireLayoutNode2.needsOnGloballyPositionedDispatch) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(requireLayoutNode2);
                        WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) androidComposeView.measureAndLayoutDelegate.createdAtMillis;
                        workLauncherImpl.getClass();
                        if (requireLayoutNode2.globallyPositionedObservers > 0) {
                            ((MutableVector) workLauncherImpl.processor).add(requireLayoutNode2);
                            requireLayoutNode2.needsOnGloballyPositionedDispatch = true;
                        }
                        androidComposeView.scheduleMeasureAndLayout(null);
                    }
                }
            }
            if ((i & 4) != 0 && (node instanceof DrawModifierNode)) {
                DepthSortedSetKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((i & 8) != 0 && (node instanceof SemanticsModifierNode)) {
                DepthSortedSetKt.requireLayoutNode(node).isSemanticsInvalidated = true;
            }
            if ((i & 64) != 0 && (node instanceof ParentDataModifierNode)) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = DepthSortedSetKt.requireLayoutNode((ParentDataModifierNode) node).layoutDelegate;
                layoutNodeLayoutDelegate.measurePassDelegate.parentDataDirty = true;
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.parentDataDirty = true;
                }
            }
            if ((i & 2048) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                CanFocusChecker.canFocusValue = null;
                focusPropertiesModifierNode.applyFocusProperties(CanFocusChecker.INSTANCE);
                if (CanFocusChecker.canFocusValue != null) {
                    Modifier.Node node2 = (Modifier.Node) focusPropertiesModifierNode;
                    if (!node2.getNode().isAttached()) {
                        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                    }
                    MutableVector mutableVector = new MutableVector(0, new Modifier.Node[16]);
                    Modifier.Node child$ui = node2.getNode().getChild$ui();
                    if (child$ui == null) {
                        DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, node2.getNode());
                    } else {
                        mutableVector.add(child$ui);
                    }
                    while (true) {
                        int i3 = mutableVector.size;
                        if (i3 == 0) {
                            break;
                        }
                        Modifier.Node node3 = (Modifier.Node) mutableVector.removeAt(i3 - 1);
                        if ((node3.getAggregateChildKindSet$ui() & 1024) == 0) {
                            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, node3);
                        } else {
                            while (true) {
                                if (node3 == null) {
                                    break;
                                }
                                if ((node3.getKindSet$ui() & 1024) != 0) {
                                    MutableVector mutableVector2 = null;
                                    while (node3 != null) {
                                        if (node3 instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) node3;
                                            FocusInvalidationManager focusInvalidationManager = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.focusInvalidationManager;
                                            if (focusInvalidationManager.focusTargetNodes.add(focusTargetNode)) {
                                                focusInvalidationManager.scheduleInvalidation$2();
                                            }
                                        } else if ((node3.getKindSet$ui() & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                            int i4 = 0;
                                            for (Modifier.Node node4 = ((DelegatingNode) node3).delegate; node4 != null; node4 = node4.getChild$ui()) {
                                                if ((node4.getKindSet$ui() & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        node3 = node4;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                                        }
                                                        if (node3 != null) {
                                                            mutableVector2.add(node3);
                                                            node3 = null;
                                                        }
                                                        mutableVector2.add(node4);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        node3 = DepthSortedSetKt.access$pop(mutableVector2);
                                    }
                                } else {
                                    node3 = node3.getChild$ui();
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (node instanceof FocusEventModifierNode)) {
                FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) node;
                FocusInvalidationManager focusInvalidationManager2 = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusEventModifierNode)).focusOwner.focusInvalidationManager;
                if (focusInvalidationManager2.focusEventNodes.add(focusEventModifierNode)) {
                    focusInvalidationManager2.scheduleInvalidation$2();
                }
            }
            if ((i & PKIFailureInfo.badSenderNonce) != 0 && (node instanceof IndirectPointerInputModifierNode) && i2 == 2) {
                ((IndirectPointerInputModifierNode) node).onCancelIndirectPointerInput();
            }
        }
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        int i;
        if (node.getKindSet$ui() != 0) {
            return node.getKindSet$ui();
        }
        Class<?> cls = node.getClass();
        MutableObjectIntMap mutableObjectIntMap = classToKindSetMap;
        int findKeyIndex = mutableObjectIntMap.findKeyIndex(cls);
        if (findKeyIndex >= 0) {
            return mutableObjectIntMap.values[findKeyIndex];
        }
        int i2 = node instanceof LayoutModifierNode ? 3 : 1;
        if (node instanceof DrawModifierNode) {
            i2 |= 4;
        }
        if (node instanceof SemanticsModifierNode) {
            i2 |= 8;
        }
        if (node instanceof PointerInputModifierNode) {
            i2 |= 16;
        }
        if (node instanceof ModifierLocalModifierNode) {
            i2 |= 32;
        }
        if (node instanceof ParentDataModifierNode) {
            i2 |= 64;
        }
        if (node instanceof OnPlacedNode) {
            i = 4194304;
        } else {
            if (!(node instanceof LayoutAwareModifierNode)) {
                if (node instanceof MeasuredSizeAwareModifierNode) {
                    i2 |= 128;
                }
                if (node instanceof GlobalPositionAwareModifierNode) {
                    i2 |= 256;
                }
                if (node instanceof ApproachLayoutModifierNode) {
                    i2 |= 512;
                }
                if (node instanceof FocusTargetNode) {
                    i2 |= 1024;
                }
                if (node instanceof FocusPropertiesModifierNode) {
                    i2 |= 2048;
                }
                if (node instanceof FocusEventModifierNode) {
                    i2 |= 4096;
                }
                if (node instanceof KeyInputModifierNode) {
                    i2 |= PKIFailureInfo.certRevoked;
                }
                if (node instanceof AndroidComposeView.RootModifierNode) {
                    i2 |= 16384;
                }
                if (node instanceof CompositionLocalConsumerModifierNode) {
                    i2 |= 32768;
                }
                if (node instanceof TraversableNode) {
                    i2 |= PKIFailureInfo.transactionIdInUse;
                }
                if (node instanceof BringIntoViewModifierNode) {
                    i2 |= PKIFailureInfo.signerNotTrusted;
                }
                if (node instanceof UnplacedAwareModifierNode) {
                    i2 |= PKIFailureInfo.badCertTemplate;
                }
                if (node instanceof IndirectPointerInputModifierNode) {
                    i2 |= PKIFailureInfo.badSenderNonce;
                }
                if (node instanceof BeyondBoundsLayoutProviderModifierNode) {
                    i2 |= 8388608;
                }
                mutableObjectIntMap.set(i2, cls);
                return i2;
            }
            i = 4194432;
        }
        i2 |= i;
        if (node instanceof GlobalPositionAwareModifierNode) {
        }
        if (node instanceof ApproachLayoutModifierNode) {
        }
        if (node instanceof FocusTargetNode) {
        }
        if (node instanceof FocusPropertiesModifierNode) {
        }
        if (node instanceof FocusEventModifierNode) {
        }
        if (node instanceof KeyInputModifierNode) {
        }
        if (node instanceof AndroidComposeView.RootModifierNode) {
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
        }
        if (node instanceof TraversableNode) {
        }
        if (node instanceof BringIntoViewModifierNode) {
        }
        if (node instanceof UnplacedAwareModifierNode) {
        }
        if (node instanceof IndirectPointerInputModifierNode) {
        }
        if (node instanceof BeyondBoundsLayoutProviderModifierNode) {
        }
        mutableObjectIntMap.set(i2, cls);
        return i2;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return calculateNodeKindSetFrom(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int i = delegatingNode.selfKindSet;
        for (Modifier.Node node2 = delegatingNode.delegate; node2 != null; node2 = node2.getChild$ui()) {
            i |= calculateNodeKindSetFromIncludingDelegates(node2);
        }
        return i;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m907getIncludeSelfInTraversalH91voCI(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int i = element instanceof LayoutModifier ? 3 : 1;
        if (element instanceof DrawModifier) {
            i |= 4;
        }
        if (element instanceof SemanticsModifier) {
            i |= 8;
        }
        if (element instanceof PointerInteropFilter) {
            i |= 16;
        }
        if (element instanceof TextFieldMagnifierNodeImpl28) {
            i |= 256;
        }
        if (element instanceof ParentDataModifier) {
            i |= 64;
        }
        return element instanceof BringIntoViewModifierNode ? 524288 | i : i;
    }
}
