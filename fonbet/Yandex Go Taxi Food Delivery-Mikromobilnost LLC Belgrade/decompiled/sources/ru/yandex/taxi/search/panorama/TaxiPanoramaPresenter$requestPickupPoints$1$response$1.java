package ru.yandex.taxi.search.panorama;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9j0;
import defpackage.tse;
import defpackage.wb90;
import defpackage.wls;
import defpackage.y8y0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.source.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lu6r;", "<anonymous>", "(Ltse;)Lu6r;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.panorama.TaxiPanoramaPresenter$requestPickupPoints$1$response$1", f = "TaxiPanoramaPresenter.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiPanoramaPresenter$requestPickupPoints$1$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ wb90 $panoramaInfo;
    int label;
    final /* synthetic */ y8y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPanoramaPresenter$requestPickupPoints$1$response$1(y8y0 y8y0Var, wb90 wb90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y8y0Var;
        this.$panoramaInfo = wb90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiPanoramaPresenter$requestPickupPoints$1$response$1(this.this$0, this.$panoramaInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiPanoramaPresenter$requestPickupPoints$1$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        y8y0 y8y0Var = this.this$0;
        g gVar = y8y0Var.E;
        String str = y8y0Var.y.c;
        RoutePointType routePointType = RoutePointType.POINT_A;
        if (!jl40.l(str, routePointType.getType())) {
            routePointType = RoutePointType.POINT_B;
        }
        o9j0 o9j0Var = new o9j0(routePointType, this.$panoramaInfo.a, null, false, false, null, null, null, null, PositionInitAction.PANORAMA, null, 2908);
        this.label = 1;
        Object a = g.a(gVar, o9j0Var, null, this, 6);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
