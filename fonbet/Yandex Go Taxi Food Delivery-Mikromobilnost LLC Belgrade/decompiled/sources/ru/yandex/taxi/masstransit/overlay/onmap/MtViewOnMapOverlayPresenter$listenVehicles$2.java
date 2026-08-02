package ru.yandex.taxi.masstransit.overlay.onmap;

import defpackage.k110;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "La631;", "vehiclesInfo", "Lk110;", "experiment", "Lkotlin/Pair;", "", "", "Lru/yandex/taxi/masstransit/model/VariantStyle;", "<anonymous>", "(Ljava/util/List;Lk110;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.MtViewOnMapOverlayPresenter$listenVehicles$2", f = "MtViewOnMapOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtViewOnMapOverlayPresenter$listenVehicles$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtViewOnMapOverlayPresenter$listenVehicles$2 mtViewOnMapOverlayPresenter$listenVehicles$2 = new MtViewOnMapOverlayPresenter$listenVehicles$2(3, (Continuation) obj3);
        mtViewOnMapOverlayPresenter$listenVehicles$2.L$0 = (List) obj;
        mtViewOnMapOverlayPresenter$listenVehicles$2.L$1 = (k110) obj2;
        return mtViewOnMapOverlayPresenter$listenVehicles$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        k110 k110Var = (k110) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(list, k110Var.b());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
