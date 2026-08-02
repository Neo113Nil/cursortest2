package com.squareup.cash.plaid.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.link.Plaid;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPlaidEventListener$events$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealPlaidEventListener$events$1 realPlaidEventListener$events$1 = new RealPlaidEventListener$events$1(2, continuation);
        realPlaidEventListener$events$1.L$0 = obj;
        return realPlaidEventListener$events$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealPlaidEventListener$events$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope = (ProducerScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Plaid.setLinkEventListener(new UtilsKt$$ExternalSyntheticLambda0(producerScope, 22));
            DateScrubber$$ExternalSyntheticLambda0 dateScrubber$$ExternalSyntheticLambda0 = new DateScrubber$$ExternalSyntheticLambda0(2);
            this.L$0 = null;
            this.label = 1;
            if (TuplesKt.awaitClose(producerScope, dateScrubber$$ExternalSyntheticLambda0, this) == coroutineSingletons) {
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
