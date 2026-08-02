package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public interface LayoutAwareModifierNode extends MeasuredSizeAwareModifierNode, DelegatableNode {
    default void onPlaced(LayoutCoordinates layoutCoordinates) {
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    default void mo197onRemeasuredozmzZPI(long j) {
    }
}
