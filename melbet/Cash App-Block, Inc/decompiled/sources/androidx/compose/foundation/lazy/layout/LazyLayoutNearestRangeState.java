package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class LazyLayoutNearestRangeState implements State {
    public final int extraItemCount;
    public int lastFirstVisibleItem;
    public final int slidingWindowSize;
    public final ParcelableSnapshotMutableState value$delegate;

    public LazyLayoutNearestRangeState(int i, int i2, int i3) {
        this.slidingWindowSize = i2;
        this.extraItemCount = i3;
        int i4 = (i / i2) * i2;
        this.value$delegate = new ParcelableSnapshotMutableState(RangesKt___RangesKt.until(Math.max(i4 - i3, 0), i4 + i2 + i3), NeverEqualPolicy.INSTANCE$3);
        this.lastFirstVisibleItem = i;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return (IntRange) this.value$delegate.getValue();
    }

    public final void update(int i) {
        if (i != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i;
            int i2 = this.slidingWindowSize;
            int i3 = (i / i2) * i2;
            int i4 = this.extraItemCount;
            this.value$delegate.setValue(RangesKt___RangesKt.until(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }
}
