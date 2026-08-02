package ru.yandex.taxi.masstransit.geopayment.tickets;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsRepository$pollTickets$1", f = "MtPaymentTicketsRepository.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtPaymentTicketsRepository$pollTickets$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtPaymentTicketsRepository$pollTickets$1 mtPaymentTicketsRepository$pollTickets$1 = new MtPaymentTicketsRepository$pollTickets$1(2, continuation);
        mtPaymentTicketsRepository$pollTickets$1.L$0 = obj;
        return mtPaymentTicketsRepository$pollTickets$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtPaymentTicketsRepository$pollTickets$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b;
            ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar2 = ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(aVar2, this) == coroutineSingletons) {
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
