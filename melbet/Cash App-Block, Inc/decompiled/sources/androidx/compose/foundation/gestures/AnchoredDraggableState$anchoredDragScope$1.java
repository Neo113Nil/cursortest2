package androidx.compose.foundation.gestures;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes3.dex */
public final class AnchoredDraggableState$anchoredDragScope$1 {
    public float distance = Float.NaN;
    public Object leftBound;
    public Object rightBound;
    public final /* synthetic */ AnchoredDraggableState this$0;

    public AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
    }

    public final void dragTo(float f, float f2) {
        AnchoredDraggableState anchoredDraggableState = this.this$0;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = anchoredDraggableState.offset$delegate;
        float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
        parcelableSnapshotMutableFloatState.setFloatValue(f);
        anchoredDraggableState.lastVelocity$delegate.setFloatValue(f2);
        if (Float.isNaN(floatValue)) {
            return;
        }
        boolean z = f >= floatValue;
        DefaultDraggableAnchors anchors = anchoredDraggableState.getAnchors();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = anchoredDraggableState.currentValue$delegate;
        if (parcelableSnapshotMutableFloatState.getFloatValue() == anchors.positionOf(parcelableSnapshotMutableState.getValue())) {
            Object closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue() + (z ? 1.0f : -1.0f), z);
            if (closestAnchor == null) {
                closestAnchor = parcelableSnapshotMutableState.getValue();
            }
            if (z) {
                this.leftBound = parcelableSnapshotMutableState.getValue();
                this.rightBound = closestAnchor;
            } else {
                this.leftBound = closestAnchor;
                this.rightBound = parcelableSnapshotMutableState.getValue();
            }
        } else {
            Object closestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue(), false);
            if (closestAnchor2 == null) {
                closestAnchor2 = parcelableSnapshotMutableState.getValue();
            }
            Object closestAnchor3 = anchoredDraggableState.getAnchors().closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue(), true);
            if (closestAnchor3 == null) {
                closestAnchor3 = parcelableSnapshotMutableState.getValue();
            }
            this.leftBound = closestAnchor2;
            this.rightBound = closestAnchor3;
        }
        DefaultDraggableAnchors anchors2 = anchoredDraggableState.getAnchors();
        Object obj = this.leftBound;
        obj.getClass();
        float positionOf = anchors2.positionOf(obj);
        DefaultDraggableAnchors anchors3 = anchoredDraggableState.getAnchors();
        Object obj2 = this.rightBound;
        obj2.getClass();
        this.distance = Math.abs(positionOf - anchors3.positionOf(obj2));
        if (Math.abs(parcelableSnapshotMutableFloatState.getFloatValue() - anchoredDraggableState.getAnchors().positionOf(parcelableSnapshotMutableState.getValue())) >= this.distance / 2.0f) {
            Object obj3 = z ? this.rightBound : this.leftBound;
            if (obj3 == null) {
                obj3 = parcelableSnapshotMutableState.getValue();
            }
            if (((Boolean) anchoredDraggableState.confirmValueChange.invoke(obj3)).booleanValue()) {
                anchoredDraggableState.setCurrentValue(obj3);
            }
        }
    }
}
