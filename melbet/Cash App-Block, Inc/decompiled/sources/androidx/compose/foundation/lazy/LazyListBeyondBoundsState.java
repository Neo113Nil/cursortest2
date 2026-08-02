package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public final LazyListState state;

    public LazyListBeyondBoundsState(LazyListState lazyListState) {
        this.state = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getFirstPlacedIndex() {
        return Math.max(0, this.state.scrollPosition.index$delegate.getIntValue());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().visibleItemsInfo.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getItemCount() {
        return this.state.getLayoutInfo().totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((LazyListMeasuredItem) CollectionsKt.last(this.state.getLayoutInfo().visibleItemsInfo)).index);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int itemsPerViewport() {
        int i;
        LazyListState lazyListState = this.state;
        if (lazyListState.getLayoutInfo().visibleItemsInfo.isEmpty()) {
            return 0;
        }
        LazyListMeasureResult layoutInfo = lazyListState.getLayoutInfo();
        int m310getViewportSizeYbymL2g = (int) (layoutInfo.orientation == Orientation.Vertical ? layoutInfo.m310getViewportSizeYbymL2g() & BodyPartID.bodyIdMax : layoutInfo.m310getViewportSizeYbymL2g() >> 32);
        int visibleItemsAverageSize = LazyListLayoutInfoKt.visibleItemsAverageSize(lazyListState.getLayoutInfo());
        if (visibleItemsAverageSize != 0 && (i = m310getViewportSizeYbymL2g / visibleItemsAverageSize) >= 1) {
            return i;
        }
        return 1;
    }
}
