package ru.yandex.taxi.map_common.map;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/yandex/taxi/map_common/map/TaxiMapView;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.map_common.map.TaxiMapViewInitializerImpl$waitForInitialization$2", f = "TaxiMapViewInitializerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TaxiMapViewInitializerImpl$waitForInitialization$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiMapViewInitializerImpl$waitForInitialization$2 taxiMapViewInitializerImpl$waitForInitialization$2 = new TaxiMapViewInitializerImpl$waitForInitialization$2(2, continuation);
        taxiMapViewInitializerImpl$waitForInitialization$2.L$0 = obj;
        return taxiMapViewInitializerImpl$waitForInitialization$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiMapViewInitializerImpl$waitForInitialization$2) create((TaxiMapView) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiMapView taxiMapView = (TaxiMapView) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(taxiMapView != null);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
