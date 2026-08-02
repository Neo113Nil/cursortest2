package com.squareup.cash.investing.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.backend.api.InvestingDataRefresher;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class InvestingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Set $investingDataRefreshers;
    public int I$0;
    public Iterator L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1(Set set, Continuation continuation) {
        super(1, continuation);
        this.$investingDataRefreshers = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InvestingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1(this.$investingDataRefreshers, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InvestingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            i = 0;
            it = this.$investingDataRefreshers.iterator();
        } else {
            if (i2 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = this.L$1;
            SafeTrace.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            InvestingDataRefresher investingDataRefresher = (InvestingDataRefresher) it.next();
            this.L$1 = it;
            this.I$0 = i;
            this.label = 1;
            if (investingDataRefresher.refresh(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.INSTANCE;
    }
}
