package ru.yandex.taxi.masstransit.domain;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1j;
import defpackage.pd01;
import defpackage.su30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lsu30;", "route", "Lru/yandex/taxi/masstransit/experiment/f;", "expConfig", "Lpd01;", "trainsConfig", "Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;", "tickets", "Lo1j;", "<anonymous>", "(Lsu30;Lru/yandex/taxi/masstransit/experiment/f;Lpd01;Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;)Lo1j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.DetailRouteStateInteractor$stateFlow$1", f = "DetailRouteStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DetailRouteStateInteractor$stateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        DetailRouteStateInteractor$stateFlow$1 detailRouteStateInteractor$stateFlow$1 = new DetailRouteStateInteractor$stateFlow$1(5, (Continuation) obj5);
        detailRouteStateInteractor$stateFlow$1.L$0 = (su30) obj;
        detailRouteStateInteractor$stateFlow$1.L$1 = (ru.yandex.taxi.masstransit.experiment.f) obj2;
        detailRouteStateInteractor$stateFlow$1.L$2 = (pd01) obj3;
        detailRouteStateInteractor$stateFlow$1.L$3 = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj4;
        return detailRouteStateInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        su30 su30Var = (su30) this.L$0;
        ru.yandex.taxi.masstransit.experiment.f fVar = (ru.yandex.taxi.masstransit.experiment.f) this.L$1;
        pd01 pd01Var = (pd01) this.L$2;
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new o1j(su30Var, fVar, pd01Var, aVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
