package ru.yandex.taxi.masstransit.stoproute.ui;

import defpackage.ij40;
import defpackage.ms30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.x3l0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx3l0;", "routeInfo", "Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;", "tickets", "Lcu30;", "<anonymous>", "(Lx3l0;Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;)Lcu30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.ui.MtStopRouteUiStateInteractor$initializeData$8", f = "MtStopRouteUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteUiStateInteractor$initializeData$8 extends SuspendLambda implements zls {
    final /* synthetic */ ms30 $purchaseConfig;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteUiStateInteractor$initializeData$8(g gVar, ms30 ms30Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
        this.$purchaseConfig = ms30Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtStopRouteUiStateInteractor$initializeData$8 mtStopRouteUiStateInteractor$initializeData$8 = new MtStopRouteUiStateInteractor$initializeData$8(this.this$0, this.$purchaseConfig, (Continuation) obj3);
        mtStopRouteUiStateInteractor$initializeData$8.L$0 = (x3l0) obj;
        mtStopRouteUiStateInteractor$initializeData$8.L$1 = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj2;
        return mtStopRouteUiStateInteractor$initializeData$8.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x3l0 x3l0Var = (x3l0) this.L$0;
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        MtPurchaseMapper mtPurchaseMapper = this.this$0.l;
        ms30 ms30Var = this.$purchaseConfig;
        ij40 ij40Var = MtTransportType.Companion;
        String type = x3l0Var.a.getType();
        ij40Var.getClass();
        return MtPurchaseMapper.d(mtPurchaseMapper, ms30Var, Collections.singletonList(ij40.a(type)), aVar);
    }
}
