package ru.yandex.taxi.masstransit.stoproute.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.x3l0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lx3l0;", "routeInfo", "", "", "Lru/yandex/taxi/masstransit/model/VariantStyle;", "styles", "", "Ler30;", "<anonymous>", "(Lx3l0;Ljava/util/Map;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteMapController$initMap$2", f = "MtStopRouteMapController.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteMapController$initMap$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteMapController$initMap$2(p pVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = pVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtStopRouteMapController$initMap$2 mtStopRouteMapController$initMap$2 = new MtStopRouteMapController$initMap$2(this.this$0, (Continuation) obj3);
        mtStopRouteMapController$initMap$2.L$0 = (x3l0) obj;
        mtStopRouteMapController$initMap$2.L$1 = (Map) obj2;
        return mtStopRouteMapController$initMap$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x3l0 x3l0Var = (x3l0) this.L$0;
        Map map = (Map) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.masstransit.stoproute.mapper.a aVar = this.this$0.c;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object e = aVar.e(x3l0Var, map, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
