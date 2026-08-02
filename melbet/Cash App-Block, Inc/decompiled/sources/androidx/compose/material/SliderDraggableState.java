package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material3.SliderState$dragScope$1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class SliderDraggableState implements DraggableState {
    public final SliderKt$$ExternalSyntheticLambda3 onDelta;
    public final ParcelableSnapshotMutableState isDragging$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final SliderState$dragScope$1 dragScope = new SliderState$dragScope$1(this, 3);
    public final MutatorMutex scrollMutex = new MutatorMutex();

    public SliderDraggableState(SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda3) {
        this.onDelta = sliderKt$$ExternalSyntheticLambda3;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = JobKt.coroutineScope(new SliderDraggableState$drag$2(this, mutatePriority, function2, null, 0), continuation);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }
}
