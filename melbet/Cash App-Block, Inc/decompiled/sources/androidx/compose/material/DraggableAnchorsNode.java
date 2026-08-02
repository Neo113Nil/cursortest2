package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class DraggableAnchorsNode extends Modifier.Node implements LayoutModifierNode {
    public HintHandler$$ExternalSyntheticLambda0 anchors;
    public boolean didLookahead;
    public Orientation orientation;
    public AnchoredDraggableState state;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        if (!measureScope.isLookingAhead() || !this.didLookahead) {
            Pair pair = (Pair) this.anchors.invoke(new IntSize((mo833measureBRTryo0.height & BodyPartID.bodyIdMax) | (mo833measureBRTryo0.width << 32)), new Constraints(j));
            AnchoredDraggableState anchoredDraggableState = this.state;
            MapDraggableAnchors mapDraggableAnchors = (MapDraggableAnchors) pair.first;
            Object obj = pair.second;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) anchoredDraggableState.dragTarget$delegate;
            if (!Intrinsics.areEqual(anchoredDraggableState.getAnchors(), mapDraggableAnchors)) {
                ((ParcelableSnapshotMutableState) anchoredDraggableState.anchors$delegate).setValue(mapDraggableAnchors);
                MutexImpl mutexImpl = ((InternalMutatorMutex) anchoredDraggableState.dragMutex).mutex;
                boolean tryLock = mutexImpl.tryLock(null);
                if (tryLock) {
                    try {
                        AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = (AnchoredDraggableState$anchoredDragScope$1) anchoredDraggableState.anchoredDragScope;
                        float positionOf = anchoredDraggableState.getAnchors().positionOf(obj);
                        if (!Float.isNaN(positionOf)) {
                            AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableState$anchoredDragScope$1.this$0;
                            ((ParcelableSnapshotMutableFloatState) anchoredDraggableState2.offset$delegate).setFloatValue(positionOf);
                            ((ParcelableSnapshotMutableFloatState) anchoredDraggableState2.lastVelocity$delegate).setFloatValue(RecyclerView.DECELERATION_RATE);
                            parcelableSnapshotMutableState.setValue(null);
                        }
                        anchoredDraggableState.setCurrentValue(obj);
                        mutexImpl.unlock(null);
                    } catch (Throwable th) {
                        mutexImpl.unlock(null);
                        throw th;
                    }
                }
                if (!tryLock) {
                    parcelableSnapshotMutableState.setValue(obj);
                }
            }
        }
        this.didLookahead = measureScope.isLookingAhead() || this.didLookahead;
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new MenuKt$$ExternalSyntheticLambda0(17, measureScope, this, mo833measureBRTryo0));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.didLookahead = false;
    }
}
