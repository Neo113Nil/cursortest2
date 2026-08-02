package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class DefaultScrollableState implements ScrollableState {
    public final ParcelableSnapshotMutableState isLastScrollBackwardState;
    public final ParcelableSnapshotMutableState isLastScrollForwardState;
    public final ParcelableSnapshotMutableState isScrollingState;
    public final Function1 onDelta;
    public final DefaultScrollableState$scrollScope$1 scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public final float scrollBy(float f) {
            if (Float.isNaN(f)) {
                return RecyclerView.DECELERATION_RATE;
            }
            DefaultScrollableState defaultScrollableState = DefaultScrollableState.this;
            float floatValue = ((Number) defaultScrollableState.onDelta.invoke(Float.valueOf(f))).floatValue();
            defaultScrollableState.isLastScrollForwardState.setValue(Boolean.valueOf(floatValue > RecyclerView.DECELERATION_RATE));
            defaultScrollableState.isLastScrollBackwardState.setValue(Boolean.valueOf(floatValue < RecyclerView.DECELERATION_RATE));
            return floatValue;
        }
    };
    public final MutatorMutex scrollMutex = new MutatorMutex();

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1] */
    public DefaultScrollableState(Function1 function1) {
        this.onDelta = function1;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = Updater.mutableStateOf$default(bool);
        this.isLastScrollForwardState = Updater.mutableStateOf$default(bool);
        this.isLastScrollBackwardState = Updater.mutableStateOf$default(bool);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float f) {
        return ((Number) this.onDelta.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return ((Boolean) this.isScrollingState.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = JobKt.coroutineScope(new DataStoreImpl$data$1(this, mutatePriority, function2, null, 4), continuation);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }
}
