package ru.yandex.taxi.scooters.presentation.route_navigation.domain;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.TransportOptions;
import com.yandex.mapkit.transport.masstransit.FilterVehicleTypes;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.mapkit.transport.masstransit.TransitOptions;
import defpackage.dvw;
import defpackage.el00;
import defpackage.g311;
import defpackage.j18;
import defpackage.jl40;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.po21;
import defpackage.scc;
import defpackage.tj;
import defpackage.uh6;
import defpackage.vto0;
import defpackage.zuo0;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.domain.model.ScootersUnableCreateRouteException;

/* loaded from: classes6.dex */
public final class a {
    public final po21 a;
    public final g b;
    public final el00 c;
    public final g311 d;

    public a(po21 po21Var, g gVar, el00 el00Var, g311 g311Var) {
        this.a = po21Var;
        this.b = gVar;
        this.c = el00Var;
        this.d = g311Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Navigation navigation, String str, zzs zzsVar, ContinuationImpl continuationImpl) {
        ScootersRouteNavigationInteractor$getNavigationRoute$1 scootersRouteNavigationInteractor$getNavigationRoute$1;
        int i;
        zzs zzsVar2;
        Navigation navigation2;
        if (continuationImpl instanceof ScootersRouteNavigationInteractor$getNavigationRoute$1) {
            scootersRouteNavigationInteractor$getNavigationRoute$1 = (ScootersRouteNavigationInteractor$getNavigationRoute$1) continuationImpl;
            int i2 = scootersRouteNavigationInteractor$getNavigationRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouteNavigationInteractor$getNavigationRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRouteNavigationInteractor$getNavigationRoute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouteNavigationInteractor$getNavigationRoute$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$0 = navigation;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$1 = null;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$2 = zzsVar;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.label = 1;
                    obj = c(str, scootersRouteNavigationInteractor$getNavigationRoute$1);
                } else if (i == 1) {
                    zzsVar = (zzs) scootersRouteNavigationInteractor$getNavigationRoute$1.L$2;
                    navigation = (Navigation) scootersRouteNavigationInteractor$getNavigationRoute$1.L$0;
                    b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        Iterator it = ((List) obj).iterator();
                        if (!it.hasNext()) {
                            return null;
                        }
                        Object next = it.next();
                        if (!it.hasNext()) {
                            return next;
                        }
                        double a = nzs.a((Route) next);
                        do {
                            Object next2 = it.next();
                            double a2 = nzs.a((Route) next2);
                            if (Double.compare(a, a2) > 0) {
                                next = next2;
                                a = a2;
                            }
                        } while (it.hasNext());
                        return next;
                    }
                    navigation2 = (Navigation) scootersRouteNavigationInteractor$getNavigationRoute$1.L$0;
                    b.b(obj);
                    List<RequestPoint> list = (List) obj;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$0 = navigation2;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$1 = null;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$2 = null;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$3 = null;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$4 = list;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.label = 3;
                    j18 j18Var = new j18(1, dvw.b(scootersRouteNavigationInteractor$getNavigationRoute$1));
                    j18Var.u();
                    vto0 vto0Var = new vto0(j18Var, navigation2);
                    navigation2.addListener(vto0Var);
                    j18Var.w(new tj(24, navigation2, vto0Var));
                    navigation2.requestRoutes(list, new TransportOptions(new TransitOptions(FilterVehicleTypes.NONE.value, new TimeOptions(null, null)), null));
                    obj = j18Var.s();
                }
                zzsVar2 = (zzs) obj;
                if (zzsVar2 != null) {
                    throw new ScootersUnableCreateRouteException("Unable to create route because startLocation is null");
                }
                scootersRouteNavigationInteractor$getNavigationRoute$1.L$0 = navigation;
                scootersRouteNavigationInteractor$getNavigationRoute$1.L$1 = null;
                scootersRouteNavigationInteractor$getNavigationRoute$1.L$2 = null;
                scootersRouteNavigationInteractor$getNavigationRoute$1.L$3 = null;
                scootersRouteNavigationInteractor$getNavigationRoute$1.label = 2;
                obj = b(zzsVar2, zzsVar, scootersRouteNavigationInteractor$getNavigationRoute$1);
                if (obj != obj2) {
                    navigation2 = navigation;
                    List<RequestPoint> list2 = (List) obj;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$0 = navigation2;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$1 = null;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$2 = null;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$3 = null;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.L$4 = list2;
                    scootersRouteNavigationInteractor$getNavigationRoute$1.label = 3;
                    j18 j18Var2 = new j18(1, dvw.b(scootersRouteNavigationInteractor$getNavigationRoute$1));
                    j18Var2.u();
                    vto0 vto0Var2 = new vto0(j18Var2, navigation2);
                    navigation2.addListener(vto0Var2);
                    j18Var2.w(new tj(24, navigation2, vto0Var2));
                    navigation2.requestRoutes(list2, new TransportOptions(new TransitOptions(FilterVehicleTypes.NONE.value, new TimeOptions(null, null)), null));
                    obj = j18Var2.s();
                }
                return obj2;
            }
        }
        scootersRouteNavigationInteractor$getNavigationRoute$1 = new ScootersRouteNavigationInteractor$getNavigationRoute$1(this, continuationImpl);
        Object obj3 = scootersRouteNavigationInteractor$getNavigationRoute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouteNavigationInteractor$getNavigationRoute$1.label;
        if (i != 0) {
        }
        zzsVar2 = (zzs) obj3;
        if (zzsVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        ScootersRouteNavigationInteractor$getRequestPoints$1 scootersRouteNavigationInteractor$getRequestPoints$1;
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
        if (continuationImpl instanceof ScootersRouteNavigationInteractor$getRequestPoints$1) {
            scootersRouteNavigationInteractor$getRequestPoints$1 = (ScootersRouteNavigationInteractor$getRequestPoints$1) continuationImpl;
            int i3 = scootersRouteNavigationInteractor$getRequestPoints$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersRouteNavigationInteractor$getRequestPoints$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = scootersRouteNavigationInteractor$getRequestPoints$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouteNavigationInteractor$getRequestPoints$1.label;
                el00 el00Var = this.c;
                int i4 = 1;
                if (i != 0) {
                    b.b(obj3);
                    objArr = new RequestPoint[2];
                    RequestPointType requestPointType = RequestPointType.WAYPOINT;
                    scootersRouteNavigationInteractor$getRequestPoints$1.L$0 = null;
                    scootersRouteNavigationInteractor$getRequestPoints$1.L$1 = zzsVar2;
                    scootersRouteNavigationInteractor$getRequestPoints$1.L$2 = objArr;
                    scootersRouteNavigationInteractor$getRequestPoints$1.L$3 = objArr;
                    scootersRouteNavigationInteractor$getRequestPoints$1.I$0 = 0;
                    scootersRouteNavigationInteractor$getRequestPoints$1.label = 1;
                    Object m2 = k.m(el00Var, zzsVar, requestPointType, null, scootersRouteNavigationInteractor$getRequestPoints$1);
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
                    i4 = scootersRouteNavigationInteractor$getRequestPoints$1.I$0;
                    Object[] objArr5 = (RequestPoint[]) scootersRouteNavigationInteractor$getRequestPoints$1.L$3;
                    objArr3 = (RequestPoint[]) scootersRouteNavigationInteractor$getRequestPoints$1.L$2;
                    b.b(obj3);
                    m = ((Result) obj3).getValue();
                    objArr4 = objArr5;
                    b.b(m);
                    objArr4[i4] = m;
                    return scc.g(objArr3);
                }
                i2 = scootersRouteNavigationInteractor$getRequestPoints$1.I$0;
                objArr2 = (RequestPoint[]) scootersRouteNavigationInteractor$getRequestPoints$1.L$3;
                Object[] objArr6 = (RequestPoint[]) scootersRouteNavigationInteractor$getRequestPoints$1.L$2;
                zzsVar3 = (zzs) scootersRouteNavigationInteractor$getRequestPoints$1.L$1;
                b.b(obj3);
                obj2 = ((Result) obj3).getValue();
                objArr = objArr6;
                b.b(obj2);
                objArr2[i2] = obj2;
                RequestPointType requestPointType2 = RequestPointType.WAYPOINT;
                scootersRouteNavigationInteractor$getRequestPoints$1.L$0 = null;
                scootersRouteNavigationInteractor$getRequestPoints$1.L$1 = null;
                scootersRouteNavigationInteractor$getRequestPoints$1.L$2 = objArr;
                scootersRouteNavigationInteractor$getRequestPoints$1.L$3 = objArr;
                scootersRouteNavigationInteractor$getRequestPoints$1.I$0 = 1;
                scootersRouteNavigationInteractor$getRequestPoints$1.label = 2;
                m = k.m(el00Var, zzsVar3, requestPointType2, null, scootersRouteNavigationInteractor$getRequestPoints$1);
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
        scootersRouteNavigationInteractor$getRequestPoints$1 = new ScootersRouteNavigationInteractor$getRequestPoints$1(this, continuationImpl);
        Object obj32 = scootersRouteNavigationInteractor$getRequestPoints$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouteNavigationInteractor$getRequestPoints$1.label;
        el00 el00Var2 = this.c;
        int i42 = 1;
        if (i != 0) {
        }
        b.b(obj2);
        objArr2[i2] = obj2;
        RequestPointType requestPointType22 = RequestPointType.WAYPOINT;
        scootersRouteNavigationInteractor$getRequestPoints$1.L$0 = null;
        scootersRouteNavigationInteractor$getRequestPoints$1.L$1 = null;
        scootersRouteNavigationInteractor$getRequestPoints$1.L$2 = objArr;
        scootersRouteNavigationInteractor$getRequestPoints$1.L$3 = objArr;
        scootersRouteNavigationInteractor$getRequestPoints$1.I$0 = 1;
        scootersRouteNavigationInteractor$getRequestPoints$1.label = 2;
        m = k.m(el00Var2, zzsVar3, requestPointType22, null, scootersRouteNavigationInteractor$getRequestPoints$1);
        if (m != obj) {
        }
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:34|35))(3:36|37|(1:39))|12|(4:19|(2:20|(2:22|(1:24)(1:30))(2:31|32))|25|(2:27|28)(1:29))(2:16|17)))|47|6|7|(0)(0)|12|(1:14)|19|(3:20|(0)(0)|30)|25|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004b, code lost:
    
        if ((r7 instanceof ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004d, code lost:
    
        r7 = r7.getFallbackUserLocation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0054, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ScootersRouteNavigationInteractor$getStartLocation$1 scootersRouteNavigationInteractor$getStartLocation$1;
        int i;
        mo21 mo21Var;
        Iterator it;
        Object obj;
        zuo0 zuo0Var;
        if (continuationImpl instanceof ScootersRouteNavigationInteractor$getStartLocation$1) {
            scootersRouteNavigationInteractor$getStartLocation$1 = (ScootersRouteNavigationInteractor$getStartLocation$1) continuationImpl;
            int i2 = scootersRouteNavigationInteractor$getStartLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRouteNavigationInteractor$getStartLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersRouteNavigationInteractor$getStartLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRouteNavigationInteractor$getStartLocation$1.label;
                if (i != 0) {
                    b.b(obj2);
                    po21 po21Var = this.a;
                    scootersRouteNavigationInteractor$getStartLocation$1.L$0 = str;
                    scootersRouteNavigationInteractor$getStartLocation$1.label = 1;
                    obj2 = ((e) po21Var).f(scootersRouteNavigationInteractor$getStartLocation$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersRouteNavigationInteractor$getStartLocation$1.L$0;
                    b.b(obj2);
                }
                mo21Var = (mo21) obj2;
                if (mo21Var == null && !mo21Var.i) {
                    return mo21Var.a();
                }
                it = uh6.C(this.b.a()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((zuo0) obj).getSessionId(), str)) {
                        break;
                    }
                }
                zuo0Var = (zuo0) obj;
                if (zuo0Var == null) {
                    return zuo0Var.r();
                }
                return null;
            }
        }
        scootersRouteNavigationInteractor$getStartLocation$1 = new ScootersRouteNavigationInteractor$getStartLocation$1(this, continuationImpl);
        Object obj22 = scootersRouteNavigationInteractor$getStartLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRouteNavigationInteractor$getStartLocation$1.label;
        if (i != 0) {
        }
        mo21Var = (mo21) obj22;
        if (mo21Var == null) {
        }
        it = uh6.C(this.b.a()).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        zuo0Var = (zuo0) obj;
        if (zuo0Var == null) {
        }
    }
}
