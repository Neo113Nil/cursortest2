package ru.yandex.taxi.masstransit.stoproute.interactor;

import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.ThreadInfo;
import com.yandex.mapkit.transport.masstransit.Vehicle;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o140;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx3l0;", "<anonymous>", "(Ltse;)Lx3l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteInfoInteractor$routeInfoByStop$2", f = "MtStopRouteInfoInteractor.kt", l = {HProv.PP_CIPHEROID, 102}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteInfoInteractor$routeInfoByStop$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $lineId;
    final /* synthetic */ String $stopId;
    final /* synthetic */ Vehicle $vehicle;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteInfoInteractor$routeInfoByStop$2(a aVar, String str, Vehicle vehicle, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$stopId = str;
        this.$vehicle = vehicle;
        this.$lineId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtStopRouteInfoInteractor$routeInfoByStop$2 mtStopRouteInfoInteractor$routeInfoByStop$2 = new MtStopRouteInfoInteractor$routeInfoByStop$2(this.this$0, this.$stopId, this.$vehicle, this.$lineId, continuation);
        mtStopRouteInfoInteractor$routeInfoByStop$2.L$0 = obj;
        return mtStopRouteInfoInteractor$routeInfoByStop$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteInfoInteractor$routeInfoByStop$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        List list;
        Object obj2;
        String str;
        String str2;
        Line line;
        s240 s240Var;
        ThreadInfo threadInfo;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, null, new MtStopRouteInfoInteractor$routeInfoByStop$2$thread$1(this.this$0, this.$vehicle, null), 3);
            ru.yandex.taxi.masstransit.datasource.schedule.b bVar = this.this$0.d;
            String str3 = this.$stopId;
            this.L$0 = null;
            this.L$1 = h;
            this.label = 1;
            obj = bVar.b(str3, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Line line2 = (Line) this.L$7;
                String str4 = (String) this.L$6;
                String str5 = (String) this.L$5;
                s240 s240Var2 = (s240) this.L$4;
                kotlin.b.b(obj);
                line = line2;
                str = str4;
                str2 = str5;
                s240Var = s240Var2;
                threadInfo = (ThreadInfo) obj;
                if (threadInfo != null) {
                    return s240Var.a(str2, str, line, threadInfo, this.$vehicle);
                }
                return null;
            }
            h = (noh) this.L$1;
            kotlin.b.b(obj);
        }
        o140 o140Var = (o140) obj;
        if (o140Var != null && (list = o140Var.b) != null) {
            String str6 = this.$lineId;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((LineAtStop) obj2).getLine().getId(), str6)) {
                    break;
                }
            }
            LineAtStop lineAtStop = (LineAtStop) obj2;
            if (lineAtStop != null) {
                s240 s240Var3 = this.this$0.e;
                String str7 = this.$stopId;
                String name = o140Var.a.getName();
                Line line3 = lineAtStop.getLine();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = s240Var3;
                this.L$5 = str7;
                this.L$6 = name;
                this.L$7 = line3;
                this.label = 2;
                Object k = h.k(this);
                if (k != coroutineSingletons) {
                    str = name;
                    obj = k;
                    str2 = str7;
                    line = line3;
                    s240Var = s240Var3;
                    threadInfo = (ThreadInfo) obj;
                    if (threadInfo != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        return null;
    }
}
