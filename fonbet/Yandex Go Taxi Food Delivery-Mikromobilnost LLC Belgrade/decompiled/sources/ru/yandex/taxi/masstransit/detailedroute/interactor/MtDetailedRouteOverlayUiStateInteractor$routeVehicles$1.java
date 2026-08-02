package ru.yandex.taxi.masstransit.detailedroute.interactor;

import defpackage.l5r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.su30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;
import ru.yandex.taxi.masstransit.experiment.f;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/f;", "summaryExp", "", "La631;", "<anonymous>", "(Lru/yandex/taxi/masstransit/experiment/f;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.interactor.MtDetailedRouteOverlayUiStateInteractor$routeVehicles$1", f = "MtDetailedRouteOverlayUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteOverlayUiStateInteractor$routeVehicles$1 extends SuspendLambda implements wls {
    final /* synthetic */ su30 $route;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteOverlayUiStateInteractor$routeVehicles$1(a aVar, su30 su30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$route = su30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDetailedRouteOverlayUiStateInteractor$routeVehicles$1 mtDetailedRouteOverlayUiStateInteractor$routeVehicles$1 = new MtDetailedRouteOverlayUiStateInteractor$routeVehicles$1(this.this$0, this.$route, continuation);
        mtDetailedRouteOverlayUiStateInteractor$routeVehicles$1.L$0 = obj;
        return mtDetailedRouteOverlayUiStateInteractor$routeVehicles$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteOverlayUiStateInteractor$routeVehicles$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar = (f) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType liveTagsFilterType = fVar.l.b.a;
        l5r l5rVar = this.this$0.e;
        su30 su30Var = this.$route;
        l5rVar.getClass();
        return l5r.a(su30Var, liveTagsFilterType);
    }
}
