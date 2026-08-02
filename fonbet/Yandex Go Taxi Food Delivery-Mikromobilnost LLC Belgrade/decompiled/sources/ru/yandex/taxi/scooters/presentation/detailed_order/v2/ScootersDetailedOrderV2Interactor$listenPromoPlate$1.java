package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import defpackage.ea90;
import defpackage.lrj0;
import defpackage.mvg;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.se90;
import defpackage.sqm0;
import defpackage.uh6;
import defpackage.w511;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsqm0;", "activeOrders", "Lzuo0;", "selectedSession", "Lcom/yandex/go/scooters/promotions/api/data/model/ScootersPromotionsScreen;", "<anonymous>", "(Lsqm0;Lzuo0;)Lcom/yandex/go/scooters/promotions/api/data/model/ScootersPromotionsScreen;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Interactor$listenPromoPlate$1", f = "ScootersDetailedOrderV2Interactor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDetailedOrderV2Interactor$listenPromoPlate$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersDetailedOrderV2Interactor$listenPromoPlate$1 scootersDetailedOrderV2Interactor$listenPromoPlate$1 = new ScootersDetailedOrderV2Interactor$listenPromoPlate$1(3, (Continuation) obj3);
        scootersDetailedOrderV2Interactor$listenPromoPlate$1.L$0 = (sqm0) obj;
        scootersDetailedOrderV2Interactor$listenPromoPlate$1.L$1 = (zuo0) obj2;
        return scootersDetailedOrderV2Interactor$listenPromoPlate$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sqm0 sqm0Var = (sqm0) this.L$0;
        zuo0 zuo0Var = (zuo0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zuo0 N = uh6.N(sqm0Var, zuo0Var.getSessionId());
        if ((N instanceof ea90) || (N instanceof lrj0)) {
            return ScootersPromotionsScreen.SCOOTERS_ORDER_RESERVATION;
        }
        if (N instanceof se90) {
            return ScootersPromotionsScreen.SCOOTERS_ORDER_PARKING;
        }
        if (N instanceof nrk0) {
            return ScootersPromotionsScreen.SCOOTERS_ORDER_RIDING;
        }
        if (N == null) {
            return null;
        }
        w511.b();
        return null;
    }
}
