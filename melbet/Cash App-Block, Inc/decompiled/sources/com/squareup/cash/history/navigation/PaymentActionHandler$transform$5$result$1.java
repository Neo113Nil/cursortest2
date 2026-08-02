package com.squareup.cash.history.navigation;

import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.payments.backend.api.PaymentAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentActionHandler$transform$5$result$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PaymentAction $action;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public FlowCollector L$1;
    public int label;
    public final /* synthetic */ PaymentActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentActionHandler$transform$5$result$1(PaymentActionHandler paymentActionHandler, PaymentAction paymentAction, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = paymentActionHandler;
        this.$action = paymentAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                PaymentActionHandler$transform$5$result$1 paymentActionHandler$transform$5$result$1 = new PaymentActionHandler$transform$5$result$1(this.this$0, this.$action, continuation, 0);
                paymentActionHandler$transform$5$result$1.L$0 = obj;
                return paymentActionHandler$transform$5$result$1;
            default:
                PaymentActionHandler$transform$5$result$1 paymentActionHandler$transform$5$result$12 = new PaymentActionHandler$transform$5$result$1(this.this$0, this.$action, continuation, 1);
                paymentActionHandler$transform$5$result$12.L$0 = obj;
                return paymentActionHandler$transform$5$result$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentActionHandler$transform$5$result$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        if (r1.emit(r2, r18) == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r2 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r1.emit(r2, r18) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r2 == r8) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object completeClientScenario;
        Object route;
        int i = this.$r8$classId;
        PaymentAction paymentAction = this.$action;
        PaymentActionHandler paymentActionHandler = this.this$0;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.L$1 = flowCollector;
                    this.label = 1;
                    completeClientScenario = paymentActionHandler.completeClientScenario((PaymentAction.CompleteClientScenarioAction) paymentAction, this);
                    break;
                } else if (i2 == 1) {
                    flowCollector = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    completeClientScenario = obj;
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                break;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentAction.OpenUrlAction openUrlAction = (PaymentAction.OpenUrlAction) paymentAction;
                    this.L$0 = null;
                    this.L$1 = flowCollector2;
                    this.label = 1;
                    ClientRoute tryParse = ClientRouteParserKt.tryParse(paymentActionHandler.clientRouteParser, openUrlAction.url);
                    if (!(tryParse instanceof ClientRoute.ClientScenario)) {
                        route = new PaymentActionResult.Route(new RoutingParams((Screen) paymentActionHandler.activeArgs.invoke(), null, openUrlAction.exitScreen, null, null, null, 470), openUrlAction.url);
                        break;
                    } else {
                        route = paymentActionHandler.completeClientScenario(new PaymentAction.CompleteClientScenarioAction(RoutesKt.getClientScenarioProto((ClientRoute.ClientScenario) tryParse), openUrlAction.flowToken, openUrlAction.paymentToken), this);
                        break;
                    }
                } else if (i3 == 1) {
                    flowCollector2 = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    route = obj;
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }
}
