package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.material3.SliderState$dragScope$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class DefaultDraggableState implements DraggableState {
    public final Function1 onDelta;
    public final SliderState$dragScope$1 dragScope = new SliderState$dragScope$1(this, 1);
    public final MutatorMutex scrollMutex = new MutatorMutex();

    public DefaultDraggableState(Function1 function1) {
        this.onDelta = function1;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = JobKt.coroutineScope(new SliderDraggableState$drag$2(this, mutatePriority, function2, null, 16), continuation);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }
}
