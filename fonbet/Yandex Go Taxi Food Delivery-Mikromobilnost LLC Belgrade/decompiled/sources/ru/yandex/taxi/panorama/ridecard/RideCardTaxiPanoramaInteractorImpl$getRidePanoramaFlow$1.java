package ru.yandex.taxi.panorama.ridecard;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "taxiOrder", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.panorama.ridecard.RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$1", f = "RideCardTaxiPanoramaInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$1 rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$1 = new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$1(3, (Continuation) obj3);
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$1.L$0 = (TaxiOrder) obj;
        return rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return taxiOrder;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
