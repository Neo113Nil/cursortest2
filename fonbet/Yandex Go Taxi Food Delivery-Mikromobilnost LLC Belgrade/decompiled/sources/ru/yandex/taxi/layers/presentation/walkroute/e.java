package ru.yandex.taxi.layers.presentation.walkroute;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.cwa1;
import defpackage.d641;
import defpackage.e3n;
import defpackage.ed5;
import defpackage.jqr;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.o430;
import defpackage.pwy0;
import defpackage.q5c;
import defpackage.rcc;
import defpackage.rk91;
import defpackage.u641;
import defpackage.zzs;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes9.dex */
public abstract class e {
    public final ru.yandex.taxi.walkroute.a a;
    public final q5c b;
    public d641 c;
    public final u641 d;

    public e(ru.yandex.taxi.walkroute.a aVar) {
        this.a = aVar;
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        this.b = new q5c(e3n.m(kp50.U(30, durationUnit), durationUnit), e3n.m(kp50.U(30, DurationUnit.MINUTES), durationUnit));
        this.d = new u641(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        BaseWalkRouteInteractor$focusOnRoute$1 baseWalkRouteInteractor$focusOnRoute$1;
        int i;
        Route route;
        Polyline geometry;
        eVar.getClass();
        if (continuationImpl instanceof BaseWalkRouteInteractor$focusOnRoute$1) {
            baseWalkRouteInteractor$focusOnRoute$1 = (BaseWalkRouteInteractor$focusOnRoute$1) continuationImpl;
            int i2 = baseWalkRouteInteractor$focusOnRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseWalkRouteInteractor$focusOnRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseWalkRouteInteractor$focusOnRoute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseWalkRouteInteractor$focusOnRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    baseWalkRouteInteractor$focusOnRoute$1.L$0 = zzsVar;
                    baseWalkRouteInteractor$focusOnRoute$1.L$1 = zzsVar2;
                    baseWalkRouteInteractor$focusOnRoute$1.label = 1;
                    obj = eVar.c(zzsVar, zzsVar2, baseWalkRouteInteractor$focusOnRoute$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzsVar2 = (zzs) baseWalkRouteInteractor$focusOnRoute$1.L$1;
                    zzsVar = (zzs) baseWalkRouteInteractor$focusOnRoute$1.L$0;
                    kotlin.b.b(obj);
                }
                route = (Route) obj;
                if (route != null || (geometry = route.getGeometry()) == null || (r4 = geometry.getPoints()) == null) {
                    List<Point> list = EmptyList.a;
                }
                ListBuilder a = rcc.a();
                a.add(cwa1.d(zzsVar));
                a.addAll(list);
                a.add(cwa1.d(zzsVar2));
                return rk91.a(a.j());
            }
        }
        baseWalkRouteInteractor$focusOnRoute$1 = new BaseWalkRouteInteractor$focusOnRoute$1(eVar, continuationImpl);
        Object obj3 = baseWalkRouteInteractor$focusOnRoute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseWalkRouteInteractor$focusOnRoute$1.label;
        if (i != 0) {
        }
        route = (Route) obj3;
        if (route != null) {
        }
        List<Point> list2 = EmptyList.a;
        ListBuilder a2 = rcc.a();
        a2.add(cwa1.d(zzsVar));
        a2.addAll(list2);
        a2.add(cwa1.d(zzsVar2));
        return rk91.a(a2.j());
    }

    public q5c b() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        BaseWalkRouteInteractor$getRoute$1 baseWalkRouteInteractor$getRoute$1;
        int i;
        Route route;
        if (continuationImpl instanceof BaseWalkRouteInteractor$getRoute$1) {
            baseWalkRouteInteractor$getRoute$1 = (BaseWalkRouteInteractor$getRoute$1) continuationImpl;
            int i2 = baseWalkRouteInteractor$getRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseWalkRouteInteractor$getRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseWalkRouteInteractor$getRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseWalkRouteInteractor$getRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    baseWalkRouteInteractor$getRoute$1.L$0 = null;
                    baseWalkRouteInteractor$getRoute$1.L$1 = null;
                    baseWalkRouteInteractor$getRoute$1.label = 1;
                    obj = this.a.b(zzsVar, zzsVar2, baseWalkRouteInteractor$getRoute$1);
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
                route = (Route) kotlin.collections.a.R(kotlin.collections.a.x0((Iterable) obj, new ed5()));
                if (route != null && b().b(new Double(nzs.a(route)))) {
                    return route;
                }
                return null;
            }
        }
        baseWalkRouteInteractor$getRoute$1 = new BaseWalkRouteInteractor$getRoute$1(this, continuationImpl);
        Object obj2 = baseWalkRouteInteractor$getRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseWalkRouteInteractor$getRoute$1.label;
        if (i != 0) {
        }
        route = (Route) kotlin.collections.a.R(kotlin.collections.a.x0((Iterable) obj2, new ed5()));
        if (route != null) {
            return route;
        }
        return null;
    }

    public abstract g d(zzs zzsVar, String str);

    public final n e(String str) {
        d641 d641Var = this.c;
        if (d641Var == null) {
            d641Var = null;
        }
        return new n(new b(d641Var.a(str)), new BaseWalkRouteInteractor$onlyObjectTracking$2());
    }

    public final d f(String str, zzs zzsVar, pwy0 pwy0Var) {
        d641 d641Var = this.c;
        if (d641Var == null) {
            d641Var = null;
        }
        n nVar = new n(d641Var.b(), new BaseWalkRouteInteractor$routing$1(null, this));
        d641 d641Var2 = this.c;
        if (d641Var2 == null) {
            d641Var2 = null;
        }
        return new d(new jqr(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.n(nVar, new n(d641Var2.a(str), new BaseWalkRouteInteractor$routing$2(zzsVar, null)), pwy0Var.a(), new BaseWalkRouteInteractor$routing$3()), new BaseWalkRouteInteractor$routing$4(null, this)), new BaseWalkRouteInteractor$routing$5(null, this), 3));
    }

    public final g g(zzs zzsVar, String str) {
        d641 d641Var = this.c;
        if (d641Var == null) {
            d641Var = null;
        }
        n nVar = new n(d641Var.b(), new BaseWalkRouteInteractor$userAndObjectTracking$1(null, this));
        d641 d641Var2 = this.c;
        if (d641Var2 == null) {
            d641Var2 = null;
        }
        return kotlinx.coroutines.flow.e.X(new jqr(new m0(nVar, new n(kotlinx.coroutines.flow.e.t(d641Var2.a(str)), new BaseWalkRouteInteractor$userAndObjectTracking$2(zzsVar, null)), new BaseWalkRouteInteractor$userAndObjectTracking$3()), new BaseWalkRouteInteractor$userAndObjectTracking$4(null, this), 3), new BaseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1(null, this));
    }
}
