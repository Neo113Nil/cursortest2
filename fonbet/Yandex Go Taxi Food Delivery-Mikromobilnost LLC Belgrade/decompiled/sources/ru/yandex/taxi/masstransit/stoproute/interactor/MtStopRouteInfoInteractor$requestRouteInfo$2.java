package ru.yandex.taxi.masstransit.stoproute.interactor;

import com.yandex.mapkit.transport.masstransit.Estimation;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.Periodical;
import com.yandex.mapkit.transport.masstransit.Scheduled;
import com.yandex.mapkit.transport.masstransit.ThreadInfo;
import com.yandex.mapkit.transport.masstransit.Vehicle;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.c4l0;
import defpackage.jgy;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o140;
import defpackage.qoh;
import defpackage.s240;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx3l0;", "<anonymous>", "(Ltse;)Lx3l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteInfoInteractor$requestRouteInfo$2", f = "MtStopRouteInfoInteractor.kt", l = {54, 60, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteInfoInteractor$requestRouteInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ c4l0 $fromStopParams;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteInfoInteractor$requestRouteInfo$2(a aVar, c4l0 c4l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$fromStopParams = c4l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtStopRouteInfoInteractor$requestRouteInfo$2 mtStopRouteInfoInteractor$requestRouteInfo$2 = new MtStopRouteInfoInteractor$requestRouteInfo$2(this.this$0, this.$fromStopParams, continuation);
        mtStopRouteInfoInteractor$requestRouteInfo$2.L$0 = obj;
        return mtStopRouteInfoInteractor$requestRouteInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteInfoInteractor$requestRouteInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0153  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        o140 o140Var;
        List list;
        Object obj2;
        LineAtStop lineAtStop;
        String vehicleId;
        List<Estimation> estimations;
        Estimation estimation;
        Vehicle vehicle;
        LineAtStop lineAtStop2;
        noh nohVar2;
        Estimation estimation2;
        String name;
        Object k;
        Line line;
        s240 s240Var;
        String str;
        ThreadInfo threadInfo;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new MtStopRouteInfoInteractor$requestRouteInfo$2$thread$1(this.this$0, this.$fromStopParams, null), 3);
            ru.yandex.taxi.masstransit.datasource.schedule.b bVar = this.this$0.d;
            String str2 = this.$fromStopParams.a;
            this.L$0 = null;
            this.L$1 = h;
            this.label = 1;
            Object b = bVar.b(str2, this);
            if (b != coroutineSingletons) {
                nohVar = h;
                obj = b;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Line line2 = (Line) this.L$10;
                String str3 = (String) this.L$9;
                String str4 = (String) this.L$8;
                s240 s240Var2 = (s240) this.L$7;
                vehicle = (Vehicle) this.L$5;
                kotlin.b.b(obj);
                line = line2;
                s240Var = s240Var2;
                name = str3;
                str = str4;
                Vehicle vehicle2 = vehicle;
                threadInfo = (ThreadInfo) obj;
                if (threadInfo != null) {
                    return s240Var.a(str, name, line, threadInfo, vehicle2);
                }
                return null;
            }
            lineAtStop2 = (LineAtStop) this.L$3;
            o140Var = (o140) this.L$2;
            nohVar2 = (noh) this.L$1;
            kotlin.b.b(obj);
            noh nohVar3 = nohVar2;
            vehicle = (Vehicle) obj;
            lineAtStop = lineAtStop2;
            nohVar = nohVar3;
            name = o140Var.a.getName();
            s240 s240Var3 = this.this$0.e;
            String str5 = this.$fromStopParams.a;
            Line line3 = lineAtStop.getLine();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = vehicle;
            this.L$6 = null;
            this.L$7 = s240Var3;
            this.L$8 = str5;
            this.L$9 = name;
            this.L$10 = line3;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
                line = line3;
                s240Var = s240Var3;
                str = str5;
                obj = k;
                Vehicle vehicle22 = vehicle;
                threadInfo = (ThreadInfo) obj;
                if (threadInfo != null) {
                }
                return null;
            }
            return coroutineSingletons;
        }
        nohVar = (noh) this.L$1;
        kotlin.b.b(obj);
        o140Var = (o140) obj;
        if (o140Var != null && (list = o140Var.b) != null) {
            c4l0 c4l0Var = this.$fromStopParams;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((LineAtStop) obj2).getLine().getId(), c4l0Var.b)) {
                    break;
                }
            }
            lineAtStop = (LineAtStop) obj2;
            if (lineAtStop != null) {
                Scheduled c = jgy.c(lineAtStop);
                if (c == null || (estimation2 = c.getEstimation()) == null || (vehicleId = estimation2.getVehicleId()) == null) {
                    Periodical a = jgy.a(lineAtStop);
                    vehicleId = (a == null || (estimations = a.getEstimations()) == null || (estimation = (Estimation) kotlin.collections.a.R(estimations)) == null) ? null : estimation.getVehicleId();
                }
                if (vehicleId == null) {
                    vehicle = null;
                    name = o140Var.a.getName();
                    s240 s240Var32 = this.this$0.e;
                    String str52 = this.$fromStopParams.a;
                    Line line32 = lineAtStop.getLine();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = vehicle;
                    this.L$6 = null;
                    this.L$7 = s240Var32;
                    this.L$8 = str52;
                    this.L$9 = name;
                    this.L$10 = line32;
                    this.label = 3;
                    k = nohVar.k(this);
                    if (k != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                ru.yandex.taxi.masstransit.datasource.vehicle.a aVar = this.this$0.c;
                this.L$0 = null;
                this.L$1 = nohVar;
                this.L$2 = o140Var;
                this.L$3 = lineAtStop;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                Object b2 = aVar.b(vehicleId, this);
                if (b2 != coroutineSingletons) {
                    noh nohVar4 = nohVar;
                    lineAtStop2 = lineAtStop;
                    obj = b2;
                    nohVar2 = nohVar4;
                    noh nohVar32 = nohVar2;
                    vehicle = (Vehicle) obj;
                    lineAtStop = lineAtStop2;
                    nohVar = nohVar32;
                    name = o140Var.a.getName();
                    s240 s240Var322 = this.this$0.e;
                    String str522 = this.$fromStopParams.a;
                    Line line322 = lineAtStop.getLine();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = vehicle;
                    this.L$6 = null;
                    this.L$7 = s240Var322;
                    this.L$8 = str522;
                    this.L$9 = name;
                    this.L$10 = line322;
                    this.label = 3;
                    k = nohVar.k(this);
                    if (k != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        return null;
    }
}
