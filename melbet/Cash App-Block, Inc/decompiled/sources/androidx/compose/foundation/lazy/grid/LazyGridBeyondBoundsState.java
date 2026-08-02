package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import com.squareup.cash.avatar.components.AvatarKt;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class LazyGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public final LazyGridState state;

    public LazyGridBeyondBoundsState(LazyGridState lazyGridState) {
        this.state = lazyGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getFirstPlacedIndex() {
        return this.state.scrollPosition.index$delegate.getIntValue();
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
        return ((LazyGridMeasuredItem) CollectionsKt.last(this.state.getLayoutInfo().visibleItemsInfo)).index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int itemsPerViewport() {
        int i;
        LazyGridState lazyGridState = this.state;
        if (lazyGridState.getLayoutInfo().visibleItemsInfo.isEmpty()) {
            return 0;
        }
        LazyGridMeasureResult layoutInfo = lazyGridState.getLayoutInfo();
        int m317getViewportSizeYbymL2g = (int) (layoutInfo.orientation == Orientation.Vertical ? layoutInfo.m317getViewportSizeYbymL2g() & BodyPartID.bodyIdMax : layoutInfo.m317getViewportSizeYbymL2g() >> 32);
        int visibleLinesAverageMainAxisSize = AvatarKt.visibleLinesAverageMainAxisSize(lazyGridState.getLayoutInfo());
        if (visibleLinesAverageMainAxisSize != 0 && (i = m317getViewportSizeYbymL2g / visibleLinesAverageMainAxisSize) >= 1) {
            return i;
        }
        return 1;
    }
}
