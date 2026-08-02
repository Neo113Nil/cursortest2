package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.duh;
import defpackage.mvg;
import defpackage.nth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lhfi;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.deliveries.DeliveriesModel$deliveriesFlow$2$1", f = "DeliveriesModel.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class DeliveriesModel$deliveriesFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ nth $deliveriesEventsSource;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ duh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesModel$deliveriesFlow$2$1(nth nthVar, duh duhVar, Continuation continuation) {
        super(2, continuation);
        this.$deliveriesEventsSource = nthVar;
        this.this$0 = duhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveriesModel$deliveriesFlow$2$1 deliveriesModel$deliveriesFlow$2$1 = new DeliveriesModel$deliveriesFlow$2$1(this.$deliveriesEventsSource, this.this$0, continuation);
        deliveriesModel$deliveriesFlow$2$1.L$0 = obj;
        return deliveriesModel$deliveriesFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveriesModel$deliveriesFlow$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = (tpr) this.$deliveriesEventsSource.d.getValue();
            f fVar = new f(this.this$0, vprVar);
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(fVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
