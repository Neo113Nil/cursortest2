package com.squareup.cash.money.views;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneyTabToolbarKt$MoneyTabToolbar$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function0 $triggerHaptic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabToolbarKt$MoneyTabToolbar$1$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$triggerHaptic = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoneyTabToolbarKt$MoneyTabToolbar$1$1(this.$triggerHaptic, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoneyTabToolbarKt$MoneyTabToolbar$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.$triggerHaptic.invoke();
        return Unit.INSTANCE;
    }
}
