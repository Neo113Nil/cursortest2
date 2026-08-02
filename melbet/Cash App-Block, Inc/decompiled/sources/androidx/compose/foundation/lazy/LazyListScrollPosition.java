package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class LazyListScrollPosition {
    public final /* synthetic */ int $r8$classId;
    public boolean hadFirstNotEmptyLayout;
    public final ParcelableSnapshotMutableIntState index$delegate;
    public Object lastKnownFirstItemKey;
    public final LazyLayoutNearestRangeState nearestRangeState;
    public final ParcelableSnapshotMutableIntState scrollOffset$delegate;

    public LazyListScrollPosition(int i, int i2, int i3) {
        this.$r8$classId = i3;
        switch (i3) {
            case 1:
                this.index$delegate = new ParcelableSnapshotMutableIntState(i);
                this.scrollOffset$delegate = new ParcelableSnapshotMutableIntState(i2);
                this.nearestRangeState = new LazyLayoutNearestRangeState(i, 90, 200);
                break;
            default:
                this.index$delegate = new ParcelableSnapshotMutableIntState(i);
                this.scrollOffset$delegate = new ParcelableSnapshotMutableIntState(i2);
                this.nearestRangeState = new LazyLayoutNearestRangeState(i, 30, 100);
                break;
        }
    }

    public final void update(int i, int i2) {
        int i3 = this.$r8$classId;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.scrollOffset$delegate;
        LazyLayoutNearestRangeState lazyLayoutNearestRangeState = this.nearestRangeState;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = this.index$delegate;
        switch (i3) {
            case 0:
                if (i < RecyclerView.DECELERATION_RATE) {
                    InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative (" + i + ')');
                }
                parcelableSnapshotMutableIntState2.setIntValue(i);
                lazyLayoutNearestRangeState.update(i);
                parcelableSnapshotMutableIntState.setIntValue(i2);
                break;
            default:
                if (i < RecyclerView.DECELERATION_RATE) {
                    InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
                }
                parcelableSnapshotMutableIntState2.setIntValue(i);
                lazyLayoutNearestRangeState.update(i);
                parcelableSnapshotMutableIntState.setIntValue(i2);
                break;
        }
    }
}
