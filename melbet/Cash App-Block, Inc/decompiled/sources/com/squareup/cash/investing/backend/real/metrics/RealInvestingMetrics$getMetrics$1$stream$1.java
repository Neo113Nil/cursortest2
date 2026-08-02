package com.squareup.cash.investing.backend.real.metrics;

import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestingMetrics$getMetrics$1$stream$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ InvestmentEntityToken $entityToken;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealInvestingMetrics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInvestingMetrics$getMetrics$1$stream$1(int i, RealInvestingMetrics realInvestingMetrics, InvestmentEntityToken investmentEntityToken, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realInvestingMetrics;
        this.$entityToken = investmentEntityToken;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                return new RealInvestingMetrics$getMetrics$1$stream$1(0, this.this$0, this.$entityToken, continuation).invokeSuspend(Unit.INSTANCE);
            default:
                return new RealInvestingMetrics$getMetrics$1$stream$1(1, this.this$0, this.$entityToken, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        InvestmentEntityToken investmentEntityToken = this.$entityToken;
        RealInvestingMetrics realInvestingMetrics = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                realInvestingMetrics.activeMetricStreams.remove(investmentEntityToken);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                realInvestingMetrics.activeETFDetailsStreams.remove(investmentEntityToken);
                break;
        }
        return Unit.INSTANCE;
    }
}
