package ru.yandex.taxi.masstransit.stoproute.interactor;

import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.LineInfo;
import com.yandex.mapkit.transport.masstransit.ThreadInfo;
import com.yandex.mapkit.transport.masstransit.ThreadStop;
import com.yandex.mapkit.transport.masstransit.Vehicle;
import defpackage.en30;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s240;
import defpackage.tcc;
import defpackage.tse;
import defpackage.uel0;
import defpackage.v3l0;
import defpackage.wls;
import defpackage.x3l0;
import defpackage.zpb1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.model.RouteType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx3l0;", "<anonymous>", "(Ltse;)Lx3l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteInfoInteractor$routeInfoByLine$2", f = "MtStopRouteInfoInteractor.kt", l = {108}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteInfoInteractor$routeInfoByLine$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $lineId;
    final /* synthetic */ Vehicle $vehicle;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteInfoInteractor$routeInfoByLine$2(a aVar, String str, Vehicle vehicle, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$lineId = str;
        this.$vehicle = vehicle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopRouteInfoInteractor$routeInfoByLine$2(this.this$0, this.$lineId, this.$vehicle, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteInfoInteractor$routeInfoByLine$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            en30 en30Var = this.this$0.f;
            String str = this.$lineId;
            this.label = 1;
            obj = ((ru.yandex.taxi.masstransit.datasource.line.a) en30Var).b(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        LineInfo lineInfo = (LineInfo) obj;
        if (lineInfo != null) {
            s240 s240Var = this.this$0.e;
            Vehicle vehicle = this.$vehicle;
            s240Var.getClass();
            Iterator<T> it = lineInfo.getThreads().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ThreadInfo threadInfo = (ThreadInfo) obj2;
                if (vehicle == null || jl40.l(threadInfo.getThread().getId(), vehicle.getThreadId())) {
                    break;
                }
            }
            ThreadInfo threadInfo2 = (ThreadInfo) obj2;
            if (threadInfo2 != null) {
                uel0 uel0Var = RouteType.Companion;
                String mapkitType = zpb1.a(lineInfo.getLine().getVehicleTypes()).b.getMapkitType();
                uel0Var.getClass();
                RouteType a = uel0.a(mapkitType);
                List<ThreadStop> stops = threadInfo2.getStops();
                ArrayList arrayList = new ArrayList(tcc.n(stops, 10));
                for (ThreadStop threadStop : stops) {
                    arrayList.add(new v3l0(threadStop.getStop().getId(), threadStop.getStop().getName(), false, null, threadStop.getPosition()));
                }
                String name = lineInfo.getLine().getName();
                Line.Style style = lineInfo.getLine().getStyle();
                return new x3l0(a, name, arrayList, style != null ? style.getColor() : null, threadInfo2.getStages(), vehicle != null ? vehicle.getId() : null, Collections.singletonList(lineInfo.getLine().getId()));
            }
        }
        return null;
    }
}
