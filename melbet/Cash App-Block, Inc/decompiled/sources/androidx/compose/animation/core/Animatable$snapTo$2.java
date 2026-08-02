package androidx.compose.animation.core;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Animatable$snapTo$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $targetValue;
    public final /* synthetic */ Animatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable animatable, Object obj, Continuation continuation) {
        super(1, continuation);
        this.this$0 = animatable;
        this.$targetValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Animatable$snapTo$2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Animatable animatable = this.this$0;
        Animatable.access$endAnimation(animatable);
        Object clampToBounds = animatable.clampToBounds(this.$targetValue);
        animatable.internalState.value$delegate.setValue(clampToBounds);
        animatable.targetValue$delegate.setValue(clampToBounds);
        return Unit.INSTANCE;
    }
}
