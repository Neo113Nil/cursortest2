package ru.yandex.taxi.masstransit.stoproute.interactor;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00040\u00012\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "", "", "Lru/yandex/taxi/masstransit/model/VariantStyle;", "selectedVehicleId", "vehicleRouteIds", "styles"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteMapController$initMap$9", f = "MtStopRouteMapController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteMapController$initMap$9 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MtStopRouteMapController$initMap$9 mtStopRouteMapController$initMap$9 = new MtStopRouteMapController$initMap$9(4, (Continuation) obj4);
        mtStopRouteMapController$initMap$9.L$0 = (String) obj;
        mtStopRouteMapController$initMap$9.L$1 = (List) obj2;
        mtStopRouteMapController$initMap$9.L$2 = (Map) obj3;
        return mtStopRouteMapController$initMap$9.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        List list = (List) this.L$1;
        Map map = (Map) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Triple(str, list, map);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
