package com.squareup.cash.investing.backend.real.metrics;

import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsResponse;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestingMetrics$getMetrics$1$stream$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InvestmentEntityToken $entityToken;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealInvestingMetrics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInvestingMetrics$getMetrics$1$stream$3(int i, RealInvestingMetrics realInvestingMetrics, InvestmentEntityToken investmentEntityToken, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realInvestingMetrics;
        this.$entityToken = investmentEntityToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                RealInvestingMetrics$getMetrics$1$stream$3 realInvestingMetrics$getMetrics$1$stream$3 = new RealInvestingMetrics$getMetrics$1$stream$3(0, this.this$0, this.$entityToken, continuation);
                realInvestingMetrics$getMetrics$1$stream$3.L$0 = obj;
                return realInvestingMetrics$getMetrics$1$stream$3;
            default:
                RealInvestingMetrics$getMetrics$1$stream$3 realInvestingMetrics$getMetrics$1$stream$32 = new RealInvestingMetrics$getMetrics$1$stream$3(1, this.this$0, this.$entityToken, continuation);
                realInvestingMetrics$getMetrics$1$stream$32.L$0 = obj;
                return realInvestingMetrics$getMetrics$1$stream$32;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealInvestingMetrics$getMetrics$1$stream$3) create((GetInvestingMetricsResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealInvestingMetrics$getMetrics$1$stream$3) create((GetETFDetailsResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        InvestmentEntityToken investmentEntityToken = this.$entityToken;
        RealInvestingMetrics realInvestingMetrics = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                realInvestingMetrics.metricsResponses.put(investmentEntityToken, new RealInvestingMetrics.CachedMetricsResponse((GetInvestingMetricsResponse) obj2, realInvestingMetrics.clock.millis()));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                realInvestingMetrics.etfDetailsResponses.put(investmentEntityToken, new RealInvestingMetrics.CachedETFDetailsResponse((GetETFDetailsResponse) obj2, realInvestingMetrics.clock.millis()));
                break;
        }
        return Unit.INSTANCE;
    }
}
