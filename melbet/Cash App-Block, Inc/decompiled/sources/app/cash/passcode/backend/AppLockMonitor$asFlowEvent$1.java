package app.cash.passcode.backend;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AppLockMonitor$asFlowEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Lifecycle $this_asFlowEvent;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockMonitor$asFlowEvent$1(Lifecycle lifecycle, Continuation continuation) {
        super(2, continuation);
        this.$this_asFlowEvent = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppLockMonitor$asFlowEvent$1 appLockMonitor$asFlowEvent$1 = new AppLockMonitor$asFlowEvent$1(this.$this_asFlowEvent, continuation);
        appLockMonitor$asFlowEvent$1.L$0 = obj;
        return appLockMonitor$asFlowEvent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppLockMonitor$asFlowEvent$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope = (ProducerScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SavedStateRegistryImpl$$ExternalSyntheticLambda0 savedStateRegistryImpl$$ExternalSyntheticLambda0 = new SavedStateRegistryImpl$$ExternalSyntheticLambda0(producerScope, 2);
            Lifecycle lifecycle = this.$this_asFlowEvent;
            lifecycle.addObserver(savedStateRegistryImpl$$ExternalSyntheticLambda0);
            ComponentRegistry$Builder$$ExternalSyntheticLambda3 componentRegistry$Builder$$ExternalSyntheticLambda3 = new ComponentRegistry$Builder$$ExternalSyntheticLambda3(13, lifecycle, savedStateRegistryImpl$$ExternalSyntheticLambda0);
            this.L$0 = null;
            this.label = 1;
            if (TuplesKt.awaitClose(producerScope, componentRegistry$Builder$$ExternalSyntheticLambda3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
