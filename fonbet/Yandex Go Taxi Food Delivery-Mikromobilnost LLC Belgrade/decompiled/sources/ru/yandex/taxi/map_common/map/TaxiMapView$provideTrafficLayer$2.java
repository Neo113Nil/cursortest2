package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.traffic.TrafficLayer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/mapkit/MapKit;", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/MapKit;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.TaxiMapView$provideTrafficLayer$2", f = "TaxiMapView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class TaxiMapView$provideTrafficLayer$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $provideAction;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TaxiMapView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiMapView$provideTrafficLayer$2(TaxiMapView taxiMapView, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = taxiMapView;
        this.$provideAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiMapView$provideTrafficLayer$2 taxiMapView$provideTrafficLayer$2 = new TaxiMapView$provideTrafficLayer$2(this.this$0, this.$provideAction, continuation);
        taxiMapView$provideTrafficLayer$2.L$0 = obj;
        return taxiMapView$provideTrafficLayer$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiMapView$provideTrafficLayer$2 taxiMapView$provideTrafficLayer$2 = (TaxiMapView$provideTrafficLayer$2) create((MapKit) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiMapView$provideTrafficLayer$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrafficLayer trafficLayer;
        MapKit mapKit = (MapKit) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        trafficLayer = this.this$0.trafficLayer;
        if (trafficLayer == null) {
            trafficLayer = mapKit.createTrafficLayer(this.this$0.getMapWindow());
            this.this$0.trafficLayer = trafficLayer;
        }
        this.$provideAction.invoke(trafficLayer);
        return zy11.a;
    }
}
