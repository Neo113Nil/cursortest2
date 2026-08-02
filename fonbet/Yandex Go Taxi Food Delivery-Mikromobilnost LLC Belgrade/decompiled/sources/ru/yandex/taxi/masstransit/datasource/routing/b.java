package ru.yandex.taxi.masstransit.datasource.routing;

import com.yandex.mapkit.transport.masstransit.FilterVehicleTypes;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.mapkit.transport.masstransit.TransitOptions;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.f410;
import defpackage.g6u;
import defpackage.j18;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ow30;
import defpackage.pw30;
import defpackage.qw30;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vj;
import defpackage.wj;
import defpackage.zy11;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class b implements ow30 {
    public final f410 a;
    public final jtq0 b;
    public final tt2 c;

    public b(tt2 tt2Var, f410 f410Var, jtq0 jtq0Var) {
        this.a = f410Var;
        this.b = jtq0Var;
        this.c = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r1 == r3) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, pw30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, List list, ContinuationImpl continuationImpl) {
        MtRouteRequesterImpl$requestRoutes$1 mtRouteRequesterImpl$requestRoutes$1;
        int i;
        List list2;
        cl7 cl7Var;
        bVar.getClass();
        if (continuationImpl instanceof MtRouteRequesterImpl$requestRoutes$1) {
            mtRouteRequesterImpl$requestRoutes$1 = (MtRouteRequesterImpl$requestRoutes$1) continuationImpl;
            int i2 = mtRouteRequesterImpl$requestRoutes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRouteRequesterImpl$requestRoutes$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRouteRequesterImpl$requestRoutes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteRequesterImpl$requestRoutes$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f410 f410Var = bVar.a;
                    list2 = list;
                    mtRouteRequesterImpl$requestRoutes$1.L$0 = list2;
                    mtRouteRequesterImpl$requestRoutes$1.label = 1;
                    obj = f410Var.a(mtRouteRequesterImpl$requestRoutes$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    list2 = (List) mtRouteRequesterImpl$requestRoutes$1.L$0;
                    kotlin.b.b(obj);
                }
                MasstransitRouter masstransitRouter = (MasstransitRouter) obj;
                mtRouteRequesterImpl$requestRoutes$1.L$0 = list2;
                mtRouteRequesterImpl$requestRoutes$1.L$1 = masstransitRouter;
                mtRouteRequesterImpl$requestRoutes$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(mtRouteRequesterImpl$requestRoutes$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(23, y);
                cl7Var = new cl7(j18Var, vjVar);
                y.element = new pw30(masstransitRouter.requestRoutes(list2, new TransitOptions(FilterVehicleTypes.NONE.value, new TimeOptions(new Long(bVar.b.d()), null)), new RouteOptions(new FitnessOptions(), false), new qw30(new MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 1);
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 23));
                } else {
                    vjVar.invoke();
                }
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        mtRouteRequesterImpl$requestRoutes$1 = new MtRouteRequesterImpl$requestRoutes$1(bVar, continuationImpl);
        Object obj2 = mtRouteRequesterImpl$requestRoutes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteRequesterImpl$requestRoutes$1.label;
        if (i != 0) {
        }
        MasstransitRouter masstransitRouter2 = (MasstransitRouter) obj2;
        mtRouteRequesterImpl$requestRoutes$1.L$0 = list2;
        mtRouteRequesterImpl$requestRoutes$1.L$1 = masstransitRouter2;
        mtRouteRequesterImpl$requestRoutes$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(mtRouteRequesterImpl$requestRoutes$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(23, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        y2.element = new pw30(masstransitRouter2.requestRoutes(list2, new TransitOptions(FilterVehicleTypes.NONE.value, new TimeOptions(new Long(bVar.b.d()), null)), new RouteOptions(new FitnessOptions(), false), new qw30(new MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 1);
        if (cl7Var.c()) {
        }
        Object s2 = j18Var2.s();
        if (s2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MtRouteRequesterImpl$awaitReady$1 mtRouteRequesterImpl$awaitReady$1;
        int i;
        if (continuationImpl instanceof MtRouteRequesterImpl$awaitReady$1) {
            mtRouteRequesterImpl$awaitReady$1 = (MtRouteRequesterImpl$awaitReady$1) continuationImpl;
            int i2 = mtRouteRequesterImpl$awaitReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRouteRequesterImpl$awaitReady$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRouteRequesterImpl$awaitReady$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteRequesterImpl$awaitReady$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtRouteRequesterImpl$awaitReady$1.label = 1;
                    if (this.a.a(mtRouteRequesterImpl$awaitReady$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtRouteRequesterImpl$awaitReady$1 = new MtRouteRequesterImpl$awaitReady$1(this, continuationImpl);
        Object obj2 = mtRouteRequesterImpl$awaitReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteRequesterImpl$awaitReady$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        MtRouteRequesterImpl$requestRoutesSuspend$1 mtRouteRequesterImpl$requestRoutesSuspend$1;
        int i;
        if (continuationImpl instanceof MtRouteRequesterImpl$requestRoutesSuspend$1) {
            mtRouteRequesterImpl$requestRoutesSuspend$1 = (MtRouteRequesterImpl$requestRoutesSuspend$1) continuationImpl;
            int i2 = mtRouteRequesterImpl$requestRoutesSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRouteRequesterImpl$requestRoutesSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRouteRequesterImpl$requestRoutesSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteRequesterImpl$requestRoutesSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    MtRouteRequesterImpl$requestRoutesSuspend$2 mtRouteRequesterImpl$requestRoutesSuspend$2 = new MtRouteRequesterImpl$requestRoutesSuspend$2(this, list, null);
                    mtRouteRequesterImpl$requestRoutesSuspend$1.L$0 = null;
                    mtRouteRequesterImpl$requestRoutesSuspend$1.label = 1;
                    obj = tje.k0(g6uVar, mtRouteRequesterImpl$requestRoutesSuspend$2, mtRouteRequesterImpl$requestRoutesSuspend$1);
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
                return ((Result) obj).getValue();
            }
        }
        mtRouteRequesterImpl$requestRoutesSuspend$1 = new MtRouteRequesterImpl$requestRoutesSuspend$1(this, continuationImpl);
        Object obj2 = mtRouteRequesterImpl$requestRoutesSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteRequesterImpl$requestRoutesSuspend$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
