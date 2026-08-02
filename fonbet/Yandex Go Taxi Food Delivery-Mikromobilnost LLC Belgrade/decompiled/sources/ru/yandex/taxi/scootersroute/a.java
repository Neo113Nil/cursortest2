package ru.yandex.taxi.scootersroute;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.transport.masstransit.BicycleRouterV2;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import defpackage.dvw;
import defpackage.el00;
import defpackage.huo0;
import defpackage.irt;
import defpackage.iuo0;
import defpackage.j18;
import defpackage.ny61;
import defpackage.scc;
import defpackage.yo5;
import defpackage.zzs;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes6.dex */
public final class a implements huo0 {
    public final yo5 a;
    public final el00 b;
    public final TimeOptions c = new TimeOptions(null, null);

    public a(yo5 yo5Var, el00 el00Var) {
        this.a = yo5Var;
        this.b = el00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        ScootersRouteRepositoryImpl$getRequestPoints$1 scootersRouteRepositoryImpl$getRequestPoints$1;
        Object obj;
        int i;
        Object[] objArr;
        Object obj2;
        int i2;
        zzs zzsVar3;
        Object[] objArr2;
        Object m;
        Object[] objArr3;
        Object[] objArr4;
        if (continuationImpl instanceof ScootersRouteRepositoryImpl$getRequestPoints$1) {
            scootersRouteRepositoryImpl$getRequestPoints$1 = (ScootersRouteRepositoryImpl$getRequestPoints$1) continuationImpl;
            int i3 = scootersRouteRepositoryImpl$getRequestPoints$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersRouteRepositoryImpl$getRequestPoints$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = scootersRouteRepositoryImpl$getRequestPoints$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouteRepositoryImpl$getRequestPoints$1.label;
                el00 el00Var = this.b;
                int i4 = 1;
                if (i != 0) {
                    b.b(obj3);
                    objArr = new RequestPoint[2];
                    RequestPointType requestPointType = RequestPointType.WAYPOINT;
                    scootersRouteRepositoryImpl$getRequestPoints$1.L$0 = null;
                    scootersRouteRepositoryImpl$getRequestPoints$1.L$1 = zzsVar2;
                    scootersRouteRepositoryImpl$getRequestPoints$1.L$2 = objArr;
                    scootersRouteRepositoryImpl$getRequestPoints$1.L$3 = objArr;
                    scootersRouteRepositoryImpl$getRequestPoints$1.I$0 = 0;
                    scootersRouteRepositoryImpl$getRequestPoints$1.label = 1;
                    Object m2 = k.m(el00Var, zzsVar, requestPointType, null, scootersRouteRepositoryImpl$getRequestPoints$1);
                    if (m2 != obj) {
                        obj2 = m2;
                        i2 = 0;
                        zzsVar3 = zzsVar2;
                        objArr2 = objArr;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = scootersRouteRepositoryImpl$getRequestPoints$1.I$0;
                    Object[] objArr5 = (RequestPoint[]) scootersRouteRepositoryImpl$getRequestPoints$1.L$3;
                    objArr3 = (RequestPoint[]) scootersRouteRepositoryImpl$getRequestPoints$1.L$2;
                    b.b(obj3);
                    m = ((Result) obj3).getValue();
                    objArr4 = objArr5;
                    b.b(m);
                    objArr4[i4] = m;
                    return scc.g(objArr3);
                }
                i2 = scootersRouteRepositoryImpl$getRequestPoints$1.I$0;
                objArr2 = (RequestPoint[]) scootersRouteRepositoryImpl$getRequestPoints$1.L$3;
                Object[] objArr6 = (RequestPoint[]) scootersRouteRepositoryImpl$getRequestPoints$1.L$2;
                zzsVar3 = (zzs) scootersRouteRepositoryImpl$getRequestPoints$1.L$1;
                b.b(obj3);
                obj2 = ((Result) obj3).getValue();
                objArr = objArr6;
                b.b(obj2);
                objArr2[i2] = obj2;
                RequestPointType requestPointType2 = RequestPointType.WAYPOINT;
                scootersRouteRepositoryImpl$getRequestPoints$1.L$0 = null;
                scootersRouteRepositoryImpl$getRequestPoints$1.L$1 = null;
                scootersRouteRepositoryImpl$getRequestPoints$1.L$2 = objArr;
                scootersRouteRepositoryImpl$getRequestPoints$1.L$3 = objArr;
                scootersRouteRepositoryImpl$getRequestPoints$1.I$0 = 1;
                scootersRouteRepositoryImpl$getRequestPoints$1.label = 2;
                m = k.m(el00Var, zzsVar3, requestPointType2, null, scootersRouteRepositoryImpl$getRequestPoints$1);
                if (m != obj) {
                    Object[] objArr7 = objArr;
                    objArr3 = objArr7;
                    objArr4 = objArr7;
                    b.b(m);
                    objArr4[i4] = m;
                    return scc.g(objArr3);
                }
                return obj;
            }
        }
        scootersRouteRepositoryImpl$getRequestPoints$1 = new ScootersRouteRepositoryImpl$getRequestPoints$1(this, continuationImpl);
        Object obj32 = scootersRouteRepositoryImpl$getRequestPoints$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouteRepositoryImpl$getRequestPoints$1.label;
        el00 el00Var2 = this.b;
        int i42 = 1;
        if (i != 0) {
        }
        b.b(obj2);
        objArr2[i2] = obj2;
        RequestPointType requestPointType22 = RequestPointType.WAYPOINT;
        scootersRouteRepositoryImpl$getRequestPoints$1.L$0 = null;
        scootersRouteRepositoryImpl$getRequestPoints$1.L$1 = null;
        scootersRouteRepositoryImpl$getRequestPoints$1.L$2 = objArr;
        scootersRouteRepositoryImpl$getRequestPoints$1.L$3 = objArr;
        scootersRouteRepositoryImpl$getRequestPoints$1.I$0 = 1;
        scootersRouteRepositoryImpl$getRequestPoints$1.label = 2;
        m = k.m(el00Var2, zzsVar3, requestPointType22, null, scootersRouteRepositoryImpl$getRequestPoints$1);
        if (m != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, zzs zzsVar2, TimeOptions timeOptions, ContinuationImpl continuationImpl) {
        ScootersRouteRepositoryImpl$getScootersRoute$2 scootersRouteRepositoryImpl$getScootersRoute$2;
        Object obj;
        int i;
        Object a;
        BicycleRouterV2 bicycleRouterV2;
        TimeOptions timeOptions2;
        if (continuationImpl instanceof ScootersRouteRepositoryImpl$getScootersRoute$2) {
            scootersRouteRepositoryImpl$getScootersRoute$2 = (ScootersRouteRepositoryImpl$getScootersRoute$2) continuationImpl;
            int i2 = scootersRouteRepositoryImpl$getScootersRoute$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouteRepositoryImpl$getScootersRoute$2.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersRouteRepositoryImpl$getScootersRoute$2.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouteRepositoryImpl$getScootersRoute$2.label;
                if (i != 0) {
                    b.b(obj2);
                    scootersRouteRepositoryImpl$getScootersRoute$2.L$0 = zzsVar;
                    scootersRouteRepositoryImpl$getScootersRoute$2.L$1 = zzsVar2;
                    scootersRouteRepositoryImpl$getScootersRoute$2.L$2 = timeOptions;
                    scootersRouteRepositoryImpl$getScootersRoute$2.label = 1;
                    obj2 = this.a.a(scootersRouteRepositoryImpl$getScootersRoute$2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj2);
                            return obj2;
                        }
                        bicycleRouterV2 = (BicycleRouterV2) scootersRouteRepositoryImpl$getScootersRoute$2.L$3;
                        timeOptions2 = (TimeOptions) scootersRouteRepositoryImpl$getScootersRoute$2.L$2;
                        b.b(obj2);
                        List<RequestPoint> list = (List) obj2;
                        scootersRouteRepositoryImpl$getScootersRoute$2.L$0 = null;
                        scootersRouteRepositoryImpl$getScootersRoute$2.L$1 = null;
                        scootersRouteRepositoryImpl$getScootersRoute$2.L$2 = timeOptions2;
                        scootersRouteRepositoryImpl$getScootersRoute$2.L$3 = bicycleRouterV2;
                        scootersRouteRepositoryImpl$getScootersRoute$2.L$4 = list;
                        scootersRouteRepositoryImpl$getScootersRoute$2.label = 3;
                        j18 j18Var = new j18(1, dvw.b(scootersRouteRepositoryImpl$getScootersRoute$2));
                        j18Var.u();
                        j18Var.w(new irt(bicycleRouterV2.requestRoutes(list, timeOptions2, new RouteOptions(new FitnessOptions(), false), new iuo0(j18Var)), 1));
                        Object s = j18Var.s();
                        return s != obj ? obj : s;
                    }
                    timeOptions = (TimeOptions) scootersRouteRepositoryImpl$getScootersRoute$2.L$2;
                    zzsVar2 = (zzs) scootersRouteRepositoryImpl$getScootersRoute$2.L$1;
                    zzsVar = (zzs) scootersRouteRepositoryImpl$getScootersRoute$2.L$0;
                    b.b(obj2);
                }
                BicycleRouterV2 bicycleRouterV22 = (BicycleRouterV2) obj2;
                scootersRouteRepositoryImpl$getScootersRoute$2.L$0 = null;
                scootersRouteRepositoryImpl$getScootersRoute$2.L$1 = null;
                scootersRouteRepositoryImpl$getScootersRoute$2.L$2 = timeOptions;
                scootersRouteRepositoryImpl$getScootersRoute$2.L$3 = bicycleRouterV22;
                scootersRouteRepositoryImpl$getScootersRoute$2.label = 2;
                a = a(zzsVar, zzsVar2, scootersRouteRepositoryImpl$getScootersRoute$2);
                if (a != obj) {
                    obj2 = a;
                    bicycleRouterV2 = bicycleRouterV22;
                    timeOptions2 = timeOptions;
                    List<RequestPoint> list2 = (List) obj2;
                    scootersRouteRepositoryImpl$getScootersRoute$2.L$0 = null;
                    scootersRouteRepositoryImpl$getScootersRoute$2.L$1 = null;
                    scootersRouteRepositoryImpl$getScootersRoute$2.L$2 = timeOptions2;
                    scootersRouteRepositoryImpl$getScootersRoute$2.L$3 = bicycleRouterV2;
                    scootersRouteRepositoryImpl$getScootersRoute$2.L$4 = list2;
                    scootersRouteRepositoryImpl$getScootersRoute$2.label = 3;
                    j18 j18Var2 = new j18(1, dvw.b(scootersRouteRepositoryImpl$getScootersRoute$2));
                    j18Var2.u();
                    j18Var2.w(new irt(bicycleRouterV2.requestRoutes(list2, timeOptions2, new RouteOptions(new FitnessOptions(), false), new iuo0(j18Var2)), 1));
                    Object s2 = j18Var2.s();
                    if (s2 != obj) {
                    }
                }
            }
        }
        scootersRouteRepositoryImpl$getScootersRoute$2 = new ScootersRouteRepositoryImpl$getScootersRoute$2(this, continuationImpl);
        Object obj22 = scootersRouteRepositoryImpl$getScootersRoute$2.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouteRepositoryImpl$getScootersRoute$2.label;
        if (i != 0) {
        }
        BicycleRouterV2 bicycleRouterV222 = (BicycleRouterV2) obj22;
        scootersRouteRepositoryImpl$getScootersRoute$2.L$0 = null;
        scootersRouteRepositoryImpl$getScootersRoute$2.L$1 = null;
        scootersRouteRepositoryImpl$getScootersRoute$2.L$2 = timeOptions;
        scootersRouteRepositoryImpl$getScootersRoute$2.L$3 = bicycleRouterV222;
        scootersRouteRepositoryImpl$getScootersRoute$2.label = 2;
        a = a(zzsVar, zzsVar2, scootersRouteRepositoryImpl$getScootersRoute$2);
        if (a != obj) {
        }
    }
}
