package com.squareup.cash.benefits.views;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class BenefitsHubViewKt$BenefitsHub$1$1$4 extends SuspendLambda implements Function3 {
    public /* synthetic */ int I$0;
    public /* synthetic */ int I$1;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        BenefitsHubViewKt$BenefitsHub$1$1$4 benefitsHubViewKt$BenefitsHub$1$1$4 = new BenefitsHubViewKt$BenefitsHub$1$1$4(3, (Continuation) obj3);
        benefitsHubViewKt$BenefitsHub$1$1$4.I$0 = intValue;
        benefitsHubViewKt$BenefitsHub$1$1$4.I$1 = intValue2;
        return benefitsHubViewKt$BenefitsHub$1$1$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        int i2 = this.I$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (i < i2) {
            i = i2;
        }
        return new Integer(i);
    }
}
