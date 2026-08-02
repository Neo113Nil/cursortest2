package androidx.compose.foundation.interaction;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class MutableInteractionSourceImpl {
    public final SharedFlowImpl interactions = FlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1);

    public final Object emit(Interaction interaction, Continuation continuation) {
        Object emit = this.interactions.emit(interaction, continuation);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
    }

    public final boolean tryEmit(Interaction interaction) {
        return this.interactions.tryEmit(interaction);
    }
}
