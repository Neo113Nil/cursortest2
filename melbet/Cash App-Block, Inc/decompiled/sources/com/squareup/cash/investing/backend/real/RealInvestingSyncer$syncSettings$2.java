package com.squareup.cash.investing.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.protos.cash.marketdata.GetDiscoveryRequest;
import com.squareup.protos.cash.marketdata.GetDiscoveryResponse;
import com.squareup.protos.cash.marketdata.MarketDataService;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestingSyncer$syncSettings$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealInvestingSyncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInvestingSyncer$syncSettings$2(RealInvestingSyncer realInvestingSyncer, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realInvestingSyncer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealInvestingSyncer realInvestingSyncer = this.this$0;
        switch (i) {
            case 0:
                return new RealInvestingSyncer$syncSettings$2(realInvestingSyncer, continuation, 0);
            default:
                return new RealInvestingSyncer$syncSettings$2(realInvestingSyncer, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealInvestingSyncer$syncSettings$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealInvestingSyncer realInvestingSyncer = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Signal signal = realInvestingSyncer.signOutSignal;
                Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1(realInvestingSyncer, (Continuation) null, 25);
                this.label = 1;
                Object until = StateFlowKt.until(signal, anonymousClass1, this);
                return until == coroutineSingletons ? coroutineSingletons : until;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MarketDataService marketDataService = realInvestingSyncer.marketDataService;
                    GetDiscoveryRequest getDiscoveryRequest = new GetDiscoveryRequest(ByteString.EMPTY);
                    this.label = 1;
                    obj = marketDataService.getDiscovery(getDiscoveryRequest, this);
                    if (obj == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    realInvestingSyncer.discoveryQueries.transactionWithWrapper(new GLSceneScope$$ExternalSyntheticLambda10(18, realInvestingSyncer, (GetDiscoveryResponse) ((ApiResult.Success) apiResult).response));
                }
                return Unit.INSTANCE;
        }
    }
}
