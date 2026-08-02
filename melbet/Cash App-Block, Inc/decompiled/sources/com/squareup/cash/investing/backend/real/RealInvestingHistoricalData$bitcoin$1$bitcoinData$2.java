package com.squareup.cash.investing.backend.real;

import app.cash.api.ApiResult;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestingHistoricalData$bitcoin$1$bitcoinData$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealInvestingHistoricalData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInvestingHistoricalData$bitcoin$1$bitcoinData$2(RealInvestingHistoricalData realInvestingHistoricalData, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realInvestingHistoricalData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealInvestingHistoricalData realInvestingHistoricalData = this.this$0;
        switch (i) {
            case 0:
                RealInvestingHistoricalData$bitcoin$1$bitcoinData$2 realInvestingHistoricalData$bitcoin$1$bitcoinData$2 = new RealInvestingHistoricalData$bitcoin$1$bitcoinData$2(realInvestingHistoricalData, continuation, 0);
                realInvestingHistoricalData$bitcoin$1$bitcoinData$2.L$0 = obj;
                return realInvestingHistoricalData$bitcoin$1$bitcoinData$2;
            case 1:
                RealInvestingHistoricalData$bitcoin$1$bitcoinData$2 realInvestingHistoricalData$bitcoin$1$bitcoinData$22 = new RealInvestingHistoricalData$bitcoin$1$bitcoinData$2(realInvestingHistoricalData, continuation, 1);
                realInvestingHistoricalData$bitcoin$1$bitcoinData$22.L$0 = obj;
                return realInvestingHistoricalData$bitcoin$1$bitcoinData$22;
            default:
                RealInvestingHistoricalData$bitcoin$1$bitcoinData$2 realInvestingHistoricalData$bitcoin$1$bitcoinData$23 = new RealInvestingHistoricalData$bitcoin$1$bitcoinData$2(realInvestingHistoricalData, continuation, 2);
                realInvestingHistoricalData$bitcoin$1$bitcoinData$23.L$0 = obj;
                return realInvestingHistoricalData$bitcoin$1$bitcoinData$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ApiResult apiResult = (ApiResult) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealInvestingHistoricalData$bitcoin$1$bitcoinData$2) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        NetworkStatus networkStatus = NetworkStatus.Available.INSTANCE;
        RealInvestingHistoricalData realInvestingHistoricalData = this.this$0;
        ApiResult apiResult = (ApiResult) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = realInvestingHistoricalData.bitcoinNetworkStatus;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        NetworkStatus networkStatus2 = (NetworkStatus) stateFlowImpl.getValue();
                        networkStatus = (networkStatus2 instanceof NetworkStatus.Unavailable ? (NetworkStatus.Unavailable) networkStatus2 : null) != null ? new NetworkStatus.Unavailable(((NetworkStatus.Unavailable) networkStatus2).sinceMillis) : new NetworkStatus.Unavailable(realInvestingHistoricalData.clock.millis());
                    }
                }
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, networkStatus);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl2 = realInvestingHistoricalData.entityNetworkStatus;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        NetworkStatus networkStatus3 = (NetworkStatus) stateFlowImpl2.getValue();
                        networkStatus = (networkStatus3 instanceof NetworkStatus.Unavailable ? (NetworkStatus.Unavailable) networkStatus3 : null) != null ? new NetworkStatus.Unavailable(((NetworkStatus.Unavailable) networkStatus3).sinceMillis) : new NetworkStatus.Unavailable(realInvestingHistoricalData.clock.millis());
                    }
                }
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, networkStatus);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl3 = realInvestingHistoricalData.portfolioNetworkStatus;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        NetworkStatus networkStatus4 = (NetworkStatus) stateFlowImpl3.getValue();
                        networkStatus = (networkStatus4 instanceof NetworkStatus.Unavailable ? (NetworkStatus.Unavailable) networkStatus4 : null) != null ? new NetworkStatus.Unavailable(((NetworkStatus.Unavailable) networkStatus4).sinceMillis) : new NetworkStatus.Unavailable(realInvestingHistoricalData.clock.millis());
                    }
                }
                stateFlowImpl3.getClass();
                stateFlowImpl3.updateState(null, networkStatus);
                break;
        }
        return null;
    }
}
