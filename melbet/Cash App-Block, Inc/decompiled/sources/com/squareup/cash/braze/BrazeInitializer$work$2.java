package com.squareup.cash.braze;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class BrazeInitializer$work$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BrazeInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInitializer$work$2(BrazeInitializer brazeInitializer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = brazeInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BrazeInitializer$work$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BrazeInitializer$work$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Braze.Companion.enableDelayedInitialization$default(Braze.INSTANCE, this.this$0.context, null, 2, null);
        return Unit.INSTANCE;
    }
}
