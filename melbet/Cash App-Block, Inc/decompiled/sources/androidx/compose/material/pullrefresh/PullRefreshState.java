package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class PullRefreshState {
    public final ParcelableSnapshotMutableFloatState _refreshingOffset$delegate;
    public final ParcelableSnapshotMutableFloatState _threshold$delegate;
    public final CoroutineScope animationScope;
    public final MutableState onRefreshState;
    public final DerivedSnapshotState adjustedDistancePulled$delegate = Updater.derivedStateOf(new PullRefreshState$$ExternalSyntheticLambda0(this, 0));
    public final ParcelableSnapshotMutableState _refreshing$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableFloatState _position$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final ParcelableSnapshotMutableFloatState distancePulled$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final MutatorMutex mutatorMutex = new MutatorMutex();

    public PullRefreshState(CoroutineScope coroutineScope, MutableState mutableState, float f, float f2) {
        this.animationScope = coroutineScope;
        this.onRefreshState = mutableState;
        this._threshold$delegate = new ParcelableSnapshotMutableFloatState(f2);
        this._refreshingOffset$delegate = new ParcelableSnapshotMutableFloatState(f);
    }

    public final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled$delegate.getValue()).floatValue();
    }

    public final boolean get_refreshing() {
        return ((Boolean) this._refreshing$delegate.getValue()).booleanValue();
    }
}
