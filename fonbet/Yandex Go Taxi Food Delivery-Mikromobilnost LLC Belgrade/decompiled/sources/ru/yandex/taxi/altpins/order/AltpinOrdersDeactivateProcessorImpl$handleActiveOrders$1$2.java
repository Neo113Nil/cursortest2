package ru.yandex.taxi.altpins.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.order.AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2", f = "AltpinOrdersDeactivateProcessorImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2 extends SuspendLambda implements wls {
    int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2(Continuation continuation, i iVar) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2 altpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2 = new AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2(continuation, this.this$0);
        altpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2.L$0 = obj;
        return altpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AltpinOrdersDeactivateProcessorImpl$handleActiveOrders$1$2) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            OrderStatusInfo.AlternativeDestination alternativeDestination = taxiOrder.V().j0;
            int i2 = alternativeDestination != null ? alternativeDestination.e : 0;
            this.L$0 = taxiOrder;
            this.I$0 = i2;
            this.label = 1;
            if (kotlinx.coroutines.a.i(i2 * 1000, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        i iVar = this.this$0;
        iVar.getClass();
        if (taxiOrder.l.getA()) {
            iVar.b.k(taxiOrder, false);
        }
        return zy11.a;
    }
}
