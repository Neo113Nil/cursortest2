package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;

/* loaded from: classes.dex */
public final class LookaheadScopeImpl implements LookaheadScope {
    @Override // androidx.compose.ui.layout.LookaheadScope
    public final LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates2 = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates2 != null) {
            return lookaheadLayoutCoordinates2;
        }
        NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.lookaheadLayoutCoordinates) == null) ? nodeCoordinator : lookaheadLayoutCoordinates;
    }
}
