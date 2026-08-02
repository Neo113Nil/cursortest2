package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import coil3.ImageLoader$Builder;

/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {
    public int childrenAccessingCoordinatesDuringPlacement;
    public int childrenAccessingLookaheadCoordinatesDuringPlacement;
    public boolean coordinatesAccessedDuringModifierPlacement;
    public boolean coordinatesAccessedDuringPlacement;
    public boolean detachedFromParentLookaheadPass;
    public boolean detachedFromParentLookaheadPlacement;
    public final LayoutNode layoutNode;
    public boolean lookaheadCoordinatesAccessedDuringModifierPlacement;
    public boolean lookaheadCoordinatesAccessedDuringPlacement;
    public boolean lookaheadLayoutPending;
    public boolean lookaheadLayoutPendingForAlignment;
    public boolean lookaheadMeasurePending;
    public LookaheadPassDelegate lookaheadPassDelegate;
    public int nextChildLookaheadPlaceOrder;
    public int nextChildPlaceOrder;
    public LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;
    public final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate(this);

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public final NodeCoordinator getOuterCoordinator() {
        return (NodeCoordinator) this.layoutNode.nodes.outerCoordinator;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState = this.layoutNode.layoutDelegate.layoutState;
        if (layoutState == LayoutNode.LayoutState.LayingOut || layoutState == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.layingOutChildren) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.layingOutChildren) {
                setLookaheadCoordinatesAccessedDuringModifierPlacement(true);
            } else {
                setLookaheadCoordinatesAccessedDuringPlacement(true);
            }
        }
    }

    /* renamed from: performLookaheadMeasure-BRTryo0$ui, reason: not valid java name */
    public final void m877performLookaheadMeasureBRTryo0$ui(long j) {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = lookaheadPassDelegate.layoutNodeLayoutDelegate;
            layoutNodeLayoutDelegate.layoutState = layoutState;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
            layoutNodeLayoutDelegate.lookaheadMeasurePending = false;
            lookaheadPassDelegate.performMeasureConstraints = j;
            ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).snapshotObserver;
            LookaheadPassDelegate$layoutChildrenBlock$1 lookaheadPassDelegate$layoutChildrenBlock$1 = lookaheadPassDelegate.performMeasureBlock;
            ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(layoutNode, (OwnerSnapshotObserver$onCommitAffectingLayout$1) imageLoader$Builder.defaults, lookaheadPassDelegate$layoutChildrenBlock$1);
            layoutNodeLayoutDelegate.lookaheadLayoutPending = true;
            layoutNodeLayoutDelegate.lookaheadLayoutPendingForAlignment = true;
            boolean isOutMostLookaheadRoot = DepthSortedSetKt.isOutMostLookaheadRoot(layoutNode);
            MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.measurePassDelegate;
            if (isOutMostLookaheadRoot) {
                measurePassDelegate.layoutPending = true;
                measurePassDelegate.layoutPendingForAlignment = true;
            } else {
                measurePassDelegate.measurePending = true;
            }
            layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.Idle;
        }
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode parent$ui = this.layoutNode.getParent$ui();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = parent$ui != null ? parent$ui.layoutDelegate : null;
            if (layoutNodeLayoutDelegate != null) {
                int i3 = layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement;
                if (i == 0) {
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(i3 - 1);
                } else {
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(i3 + 1);
                }
            }
        }
    }

    public final void setChildrenAccessingLookaheadCoordinatesDuringPlacement(int i) {
        int i2 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode parent$ui = this.layoutNode.getParent$ui();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = parent$ui != null ? parent$ui.layoutDelegate : null;
            if (layoutNodeLayoutDelegate != null) {
                int i3 = layoutNodeLayoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement;
                if (i == 0) {
                    layoutNodeLayoutDelegate.setChildrenAccessingLookaheadCoordinatesDuringPlacement(i3 - 1);
                } else {
                    layoutNodeLayoutDelegate.setChildrenAccessingLookaheadCoordinatesDuringPlacement(i3 + 1);
                }
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.coordinatesAccessedDuringModifierPlacement != z) {
            this.coordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setLookaheadCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setLookaheadCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void updateParentData() {
        MeasurePassDelegate measurePassDelegate = this.measurePassDelegate;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = measurePassDelegate.layoutNodeLayoutDelegate;
        Object obj = measurePassDelegate.parentData;
        LayoutNode layoutNode = this.layoutNode;
        if ((obj != null || layoutNodeLayoutDelegate.getOuterCoordinator().getParentData() != null) && measurePassDelegate.parentDataDirty) {
            measurePassDelegate.parentDataDirty = false;
            measurePassDelegate.parentData = layoutNodeLayoutDelegate.getOuterCoordinator().getParentData();
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui != null) {
                LayoutNode.requestRemeasure$ui$default(parent$ui, false, 7);
            }
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = lookaheadPassDelegate.layoutNodeLayoutDelegate;
            if (lookaheadPassDelegate.parentData == null) {
                LookaheadDelegate lookaheadDelegate = layoutNodeLayoutDelegate2.getOuterCoordinator().getLookaheadDelegate();
                lookaheadDelegate.getClass();
                if (lookaheadDelegate.coordinator.getParentData() == null) {
                    return;
                }
            }
            if (lookaheadPassDelegate.parentDataDirty) {
                lookaheadPassDelegate.parentDataDirty = false;
                LookaheadDelegate lookaheadDelegate2 = layoutNodeLayoutDelegate2.getOuterCoordinator().getLookaheadDelegate();
                lookaheadDelegate2.getClass();
                lookaheadPassDelegate.parentData = lookaheadDelegate2.coordinator.getParentData();
                if (DepthSortedSetKt.isOutMostLookaheadRoot(layoutNode)) {
                    LayoutNode parent$ui2 = layoutNode.getParent$ui();
                    if (parent$ui2 != null) {
                        LayoutNode.requestRemeasure$ui$default(parent$ui2, false, 7);
                        return;
                    }
                    return;
                }
                LayoutNode parent$ui3 = layoutNode.getParent$ui();
                if (parent$ui3 != null) {
                    LayoutNode.requestLookaheadRemeasure$ui$default(parent$ui3, false, 7);
                }
            }
        }
    }
}
