package ru.yandex.taxi.delivery.experiments;

import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Le4a0;", "selectedPayments", "Lfnx0;", "selectedTariff", "", "<anonymous>", "(Ljava/util/List;Lfnx0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.experiments.PayOnDeliveryExperimentInteractor$enabledFlow$1", f = "PayOnDeliveryExperimentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PayOnDeliveryExperimentInteractor$enabledFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayOnDeliveryExperimentInteractor$enabledFlow$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PayOnDeliveryExperimentInteractor$enabledFlow$1 payOnDeliveryExperimentInteractor$enabledFlow$1 = new PayOnDeliveryExperimentInteractor$enabledFlow$1(this.this$0, (Continuation) obj3);
        payOnDeliveryExperimentInteractor$enabledFlow$1.L$0 = (List) obj;
        payOnDeliveryExperimentInteractor$enabledFlow$1.L$1 = (fnx0) obj2;
        return payOnDeliveryExperimentInteractor$enabledFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        fnx0 fnx0Var = (fnx0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pex0 pex0Var = fnx0Var.c;
        String str = pex0Var.b;
        return Boolean.valueOf(this.this$0.c(pex0Var.u0, str, list));
    }
}
