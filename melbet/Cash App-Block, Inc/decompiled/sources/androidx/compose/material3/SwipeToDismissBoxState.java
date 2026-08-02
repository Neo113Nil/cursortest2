package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class SwipeToDismissBoxState {
    public final AnchoredDraggableState anchoredDraggableState;
    public final Function1 positionalThreshold;

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Function1 function1) {
        this.anchoredDraggableState = new AnchoredDraggableState(swipeToDismissBoxValue);
        this.positionalThreshold = function1;
    }

    public final SwipeToDismissBoxValue getDismissDirection() {
        AnchoredDraggableState anchoredDraggableState = this.anchoredDraggableState;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = anchoredDraggableState.offset$delegate;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = anchoredDraggableState.offset$delegate;
        return (parcelableSnapshotMutableFloatState.getFloatValue() == RecyclerView.DECELERATION_RATE || Float.isNaN(parcelableSnapshotMutableFloatState2.getFloatValue())) ? SwipeToDismissBoxValue.Settled : parcelableSnapshotMutableFloatState2.getFloatValue() > RecyclerView.DECELERATION_RATE ? SwipeToDismissBoxValue.StartToEnd : SwipeToDismissBoxValue.EndToStart;
    }
}
