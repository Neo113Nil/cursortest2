package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.MapKit;
import defpackage.fgw0;
import defpackage.fva0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/mapkit/MapKit;", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/MapKit;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.TaxiMapViewInitializerImpl$initialize$1", f = "TaxiMapViewInitializerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TaxiMapViewInitializerImpl$initialize$1 extends SuspendLambda implements wls {
    final /* synthetic */ MapViewInflateStrategy $inflateStrategy;
    final /* synthetic */ String $reason;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiMapViewInitializerImpl$initialize$1(p pVar, MapViewInflateStrategy mapViewInflateStrategy, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$inflateStrategy = mapViewInflateStrategy;
        this.$reason = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiMapViewInitializerImpl$initialize$1(this.this$0, this.$inflateStrategy, this.$reason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiMapViewInitializerImpl$initialize$1 taxiMapViewInitializerImpl$initialize$1 = (TaxiMapViewInitializerImpl$initialize$1) create((MapKit) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiMapViewInitializerImpl$initialize$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p pVar = this.this$0;
        fva0 fva0Var = pVar.c;
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Inflate;
        fgw0 fgw0Var = new fgw0(2, this.$inflateStrategy, this.$reason);
        fva0Var.getClass();
        fva0.f(fva0Var, "TaxiMapView", performanceAnalytics$Type, 0L, 4);
        pVar.getValue();
        fva0Var.a("TaxiMapView", performanceAnalytics$Type, fgw0Var);
        return zy11.a;
    }
}
