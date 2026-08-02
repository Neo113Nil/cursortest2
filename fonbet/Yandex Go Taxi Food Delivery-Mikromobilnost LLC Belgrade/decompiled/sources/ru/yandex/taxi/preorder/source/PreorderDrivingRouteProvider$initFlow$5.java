package ru.yandex.taxi.preorder.source;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingRouteMetadata;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.cqe0;
import defpackage.d0l0;
import defpackage.grz0;
import defpackage.hst;
import defpackage.in91;
import defpackage.j73;
import defpackage.jst;
import defpackage.ktj0;
import defpackage.mqz0;
import defpackage.mtj0;
import defpackage.mvg;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.wls;
import defpackage.xpe0;
import defpackage.ylm;
import defpackage.zlm;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxpe0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lxpe0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.PreorderDrivingRouteProvider$initFlow$5", f = "PreorderDrivingRouteProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PreorderDrivingRouteProvider$initFlow$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cqe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderDrivingRouteProvider$initFlow$5(cqe0 cqe0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cqe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreorderDrivingRouteProvider$initFlow$5 preorderDrivingRouteProvider$initFlow$5 = new PreorderDrivingRouteProvider$initFlow$5(this.this$0, continuation);
        preorderDrivingRouteProvider$initFlow$5.L$0 = obj;
        return preorderDrivingRouteProvider$initFlow$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PreorderDrivingRouteProvider$initFlow$5 preorderDrivingRouteProvider$initFlow$5 = (PreorderDrivingRouteProvider$initFlow$5) create((xpe0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        preorderDrivingRouteProvider$initFlow$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i = 0;
        xpe0 xpe0Var = (xpe0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        mqz0 mqz0Var = this.this$0.g;
        d0l0 d0l0Var = xpe0Var.b;
        ntj0 ntj0Var = xpe0Var.c;
        ru.yandex.taxi.preorder.tollroad.data.e eVar = mqz0Var.a;
        d0l0 d0l0Var2 = eVar.k;
        r0 r0Var = eVar.c;
        r0 r0Var2 = eVar.d;
        if (!d0l0Var.g(d0l0Var2)) {
            r0Var2.getClass();
            r0Var2.m(null, 0);
            r0Var.getClass();
            r0Var.m(null, 0);
            eVar.k = d0l0Var;
            eVar.i.l(RoadRestriction.NONE);
            eVar.f.l(grz0.c);
            if (!((Boolean) eVar.h.getValue()).booleanValue()) {
                eVar.e(false, TollRoadSetReason.NEW_ROUTE_FROM_MAPKIT);
            }
        }
        ntj0Var.getClass();
        if (ntj0Var instanceof ktj0) {
            List list = (List) ((ktj0) ntj0Var).b;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (in91.e((DrivingRoute) obj2)) {
                    break;
                }
            }
            DrivingRoute drivingRoute = (DrivingRoute) obj2;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (in91.d((DrivingRoute) obj3)) {
                    break;
                }
            }
            DrivingRoute drivingRoute2 = (DrivingRoute) obj3;
            List A = j73.A(new DrivingRoute[]{drivingRoute, drivingRoute2});
            mtj0 mtj0Var = ntj0.a;
            eVar.d(new ktj0(A));
            if (drivingRoute2 != null && ((Number) r0Var2.getValue()).intValue() == 0) {
                Integer valueOf = Integer.valueOf(((int) Math.ceil(drivingRoute2.getMetadata().getWeight().getTimeWithTraffic().getValue() / 60.0d)) * 60);
                r0Var2.getClass();
                r0Var2.m(null, valueOf);
            }
            if (drivingRoute != null && ((Number) r0Var.getValue()).intValue() == 0) {
                Integer valueOf2 = Integer.valueOf(((int) Math.ceil(drivingRoute.getMetadata().getWeight().getTimeWithTraffic().getValue() / 60.0d)) * 60);
                r0Var.getClass();
                r0Var.m(null, valueOf2);
            }
        } else {
            eVar.d(ntj0Var);
        }
        cqe0 cqe0Var = this.this$0;
        zlm zlmVar = xpe0Var.a;
        cqe0Var.getClass();
        List a = zlmVar.a.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it3 = a.iterator();
        while (it3.hasNext()) {
            arrayList.add(((Address) it3.next()).d());
        }
        hst hstVar = jst.e;
        String.format("%s, %s", Arrays.copyOf(new Object[]{"mapkit_route", kotlin.collections.a.X(arrayList, "->", null, null, null, 62)}, 2));
        hstVar.getClass();
        String.format("%s, routes count %s", Arrays.copyOf(new Object[]{"mapkit_route", Integer.valueOf(zlmVar.b().size())}, 2));
        int f = scc.f(zlmVar.b());
        if (f >= 0) {
            while (true) {
                DrivingRouteMetadata metadata = ((ylm) zlmVar.b().get(i)).b.getMetadata();
                int i2 = i + 1;
                unr0.C(new Object[]{"mapkit_route", Integer.valueOf(i2), Boolean.valueOf(metadata.getFlags().getHasTolls()), metadata.getWeight().getTimeWithTraffic().getText()}, 4, "%s, route №%s, has tolls %s, route time %s", jst.e);
                if (i == f) {
                    break;
                }
                i = i2;
            }
        }
        return zy11.a;
    }
}
