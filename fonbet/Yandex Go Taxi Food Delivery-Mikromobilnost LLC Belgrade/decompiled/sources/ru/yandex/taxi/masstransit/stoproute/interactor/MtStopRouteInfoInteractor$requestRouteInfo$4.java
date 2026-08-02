package ru.yandex.taxi.masstransit.stoproute.interactor;

import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.mapkit.transport.masstransit.Vehicle;
import com.yandex.mapkit.transport.masstransit.VehicleStop;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.d4l0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.x3l0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx3l0;", "<anonymous>", "(Ltse;)Lx3l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteInfoInteractor$requestRouteInfo$4", f = "MtStopRouteInfoInteractor.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, 81, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteInfoInteractor$requestRouteInfo$4 extends SuspendLambda implements wls {
    final /* synthetic */ d4l0 $fromVehicleParams;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteInfoInteractor$requestRouteInfo$4(a aVar, d4l0 d4l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$fromVehicleParams = d4l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopRouteInfoInteractor$requestRouteInfo$4(this.this$0, this.$fromVehicleParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteInfoInteractor$requestRouteInfo$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r13 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r13 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0044, code lost:
    
        if (r13 == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<VehicleStop> stops;
        VehicleStop vehicleStop;
        Stop stop;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.masstransit.datasource.vehicle.a aVar = this.this$0.c;
            String str = this.$fromVehicleParams.a;
            this.label = 1;
            obj = aVar.b(str, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return (x3l0) obj;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (x3l0) obj;
            }
            kotlin.b.b(obj);
        }
        Vehicle vehicle = (Vehicle) obj;
        String id = (vehicle == null || (stops = vehicle.getStops()) == null || (vehicleStop = (VehicleStop) kotlin.collections.a.R(stops)) == null || (stop = vehicleStop.getStop()) == null) ? null : stop.getId();
        a aVar2 = this.this$0;
        d4l0 d4l0Var = this.$fromVehicleParams;
        if (id != null) {
            String str2 = d4l0Var.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            aVar2.a.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new MtStopRouteInfoInteractor$routeInfoByStop$2(aVar2, id, vehicle, str2, null), this);
        } else {
            String str3 = d4l0Var.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            aVar2.a.getClass();
            sjh sjhVar2 = uyj.a;
            obj = tje.k0(mdh.b, new MtStopRouteInfoInteractor$routeInfoByLine$2(aVar2, str3, vehicle, null), this);
        }
        return coroutineSingletons;
    }
}
