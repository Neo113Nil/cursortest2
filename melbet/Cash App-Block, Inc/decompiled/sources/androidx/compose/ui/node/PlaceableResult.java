package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;

/* loaded from: classes.dex */
public final class PlaceableResult implements OwnerScope {
    public final LookaheadCapablePlaceable placeable;
    public MeasureResult result;

    public PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.result = measureResult;
        this.placeable = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return this.placeable.getCoordinates().isAttached();
    }
}
