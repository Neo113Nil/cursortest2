package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public final int beyondViewportPageCount;
    public final PagerState state;

    public PagerBeyondBoundsState(PagerState pagerState, int i) {
        this.state = pagerState;
        this.beyondViewportPageCount = i;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getFirstPlacedIndex() {
        return Math.max(0, this.state.firstVisiblePage - this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().visiblePagesInfo.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getItemCount() {
        return this.state.getPageCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getLastPlacedIndex() {
        return Math.min(r0.getPageCount() - 1, ((MeasuredPage) CollectionsKt.last(this.state.getLayoutInfo().visiblePagesInfo)).index + this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int itemsPerViewport() {
        int i;
        PagerState pagerState = this.state;
        if (pagerState.getLayoutInfo().visiblePagesInfo.size() == 0) {
            return 0;
        }
        int mainAxisViewportSize = PagerLayoutInfoKt.getMainAxisViewportSize(pagerState.getLayoutInfo());
        int i2 = pagerState.getLayoutInfo().pageSize + pagerState.getLayoutInfo().pageSpacing;
        if (i2 != 0 && (i = mainAxisViewportSize / i2) >= 1) {
            return i;
        }
        return 1;
    }
}
