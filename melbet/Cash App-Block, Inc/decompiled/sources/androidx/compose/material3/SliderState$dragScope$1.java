package androidx.compose.material3;

import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1;
import androidx.compose.material.SliderDraggableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class SliderState$dragScope$1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ SliderState$dragScope$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    public final void dragBy(float f) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                ((SliderState) obj).dispatchRawDelta(f);
                break;
            case 1:
                ((DefaultDraggableState) obj).onDelta.invoke(Float.valueOf(f));
                break;
            case 2:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) obj;
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = (AnchoredDraggableState$anchoredDragScope$1) anchoredDraggableState.anchoredDragScope;
                float newOffsetForDelta$material = anchoredDraggableState.newOffsetForDelta$material(f);
                AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableState$anchoredDragScope$1.this$0;
                ((ParcelableSnapshotMutableFloatState) anchoredDraggableState2.offset$delegate).setFloatValue(newOffsetForDelta$material);
                ((ParcelableSnapshotMutableFloatState) anchoredDraggableState2.lastVelocity$delegate).setFloatValue(RecyclerView.DECELERATION_RATE);
                break;
            default:
                ((SliderDraggableState) obj).onDelta.invoke(Float.valueOf(f));
                break;
        }
    }
}
