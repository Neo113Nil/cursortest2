package defpackage;

import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.go.taxi.order.map.passenger_detection.a;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverride;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.mapkit.directions.driving.AvoidanceFlags;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.VehicleType;
import com.yandex.mapkit.geometry.Polyline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.styling.f;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class z080 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ z080(c0 c0Var, int i) {
        this.a = i;
        this.b = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f7  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ThemeType themeType;
        yxf0 yxf0Var;
        String id;
        zn11 a;
        nol0 nol0Var;
        k3l0 k3l0Var;
        Object obj2;
        jsq0 jsq0Var;
        int i = this.a;
        Polyline polyline = null;
        int i2 = 0;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        c0 c0Var = this.b;
        switch (i) {
            case 0:
                c0.Ng(c0Var, c0Var.C0, true);
                break;
            case 1:
                w080 w080Var = (w080) obj;
                ah00 ah00Var = c0Var.K;
                c641 c641Var = c0Var.T;
                if (!c641Var.c() || w080Var.b) {
                    c641Var.e(new l080(c0Var, 1), true);
                    break;
                } else {
                    gh00 gh00Var = (gh00) ah00Var;
                    boolean z = c641Var.b(c0Var.L0) != c641Var.b(gh00Var.j());
                    c0Var.L0 = gh00Var.j();
                    if (!w080Var.a || !z) {
                        c641Var.e(new l080(c0Var, 3), false);
                        break;
                    } else {
                        c641Var.e(new l080(c0Var, 2), true);
                        break;
                    }
                }
            case 2:
                Object Xg = c0Var.Xg((mo21) obj, continuation);
                if (Xg == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Pair pair = (Pair) obj;
                e430 e430Var = (e430) pair.getFirst();
                List list = (List) pair.getSecond();
                u0c0 c = ((f) c0Var.d0).c(e430Var.c);
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(sq00.a((sq00) it.next(), c.c, null, null, 8190));
                }
                ((u080) c0Var.Dg()).lb(arrayList);
                ((u080) c0Var.Dg()).G8(c.b);
                break;
            case 4:
                r380 r380Var = (r380) obj;
                c0Var.getClass();
                if (r380Var.b != null) {
                    ((u080) c0Var.Dg()).O7(r380Var.b, new y080(c0Var, i2));
                    break;
                } else {
                    n380 n380Var = r380Var.a;
                    p0c0 p0c0Var = r380Var.c;
                    if (n380Var.equals(n380.e)) {
                        ((u080) c0Var.Dg()).O1(new sq00(p0c0Var, null, false, null, null, null, null, false, false, null, null, 0.0f, 8190));
                        aet0 aet0Var = c0Var.h0;
                        float f = c0Var.C1;
                        r0 r0Var = aet0Var.a;
                        udt0 udt0Var = new udt0(f);
                        r0Var.getClass();
                        r0Var.m(null, udt0Var);
                        break;
                    } else {
                        ((u080) c0Var.Dg()).O7(new sq00(p0c0Var, null, false, null, null, n380Var.a, n380Var.b, n380Var.d, n380Var.c, null, null, 0.0f, 7710), new y080(c0Var, i3));
                        break;
                    }
                }
            case 5:
                rsn rsnVar = (rsn) obj;
                Pair pair2 = (Pair) rsnVar.a;
                Pair pair3 = (Pair) rsnVar.b;
                mo6 mo6Var = (mo6) pair3.c();
                if (pair2 == null || (themeType = (ThemeType) pair2.f()) == null) {
                    themeType = (ThemeType) pair3.f();
                }
                ((u080) c0Var.Dg()).H3(new mo6(mo6Var.a, mo6Var.b, mo6Var.c, mo6Var.d, themeType, (ThemeType) pair3.f()));
                break;
            case 6:
                Pair pair4 = (Pair) obj;
                c0.Ng(c0Var, new t78((v48) pair4.getFirst(), (ObjectAppearanceOverride) pair4.getSecond()), false);
                break;
            case 7:
                c0.Og(c0Var, (List) obj);
                break;
            case 8:
                a aVar = c0Var.u0;
                List<j001> list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                for (j001 j001Var : list3) {
                    arrayList2.add(new sk90(j001Var.getCoordinates().a, j001Var.getCoordinates().b, j001Var.getCoordinates().c, j001Var.getTimestamp().getTime()));
                }
                Object b = aVar.b(arrayList2, continuation);
                if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                l201 l201Var = (l201) obj;
                com.yandex.go.taxi.order.map.route.a aVar2 = (com.yandex.go.taxi.order.map.route.a) c0Var.N.get();
                o2y0 o2y0Var = aVar2.e;
                aVar2.x = l201Var;
                if (l201Var instanceof j201) {
                    o8g0 o8g0Var = aVar2.s;
                    if (o8g0Var != null) {
                        ((plm) aVar2.b).a((ool0) o8g0Var.a);
                        break;
                    } else {
                        j201 j201Var = (j201) l201Var;
                        yxf0Var = new yxf0(j201Var.a, j201Var.b);
                        String str = (String) yxf0Var.a;
                        OrderStatusInfo V = o2y0Var.b().V();
                        V.getClass();
                        id = SimplePersistentBooleanExperiment.TAXIROUTE_ENABLE_ROUTE_CACHE.getId();
                        a = V.getA();
                        if ((a == null ? a.a(id) : false) && str != null) {
                            k3l0Var = (k3l0) aVar2.h.a.get(o2y0Var.b().a);
                            if (k3l0Var != null && jl40.l(k3l0Var.a, str)) {
                                nol0Var = k3l0Var.b;
                                if (nol0Var == null) {
                                    aVar2.s = new o8g0(nol0Var, o2y0Var.c());
                                    aVar2.a();
                                    break;
                                } else {
                                    List list4 = (List) yxf0Var.b;
                                    List list5 = list4;
                                    if (list5 != null && !list5.isEmpty() && list4.size() >= 2) {
                                        polyline = k.l(list4);
                                    }
                                    Polyline polyline2 = polyline;
                                    if (polyline2 == null) {
                                        aVar2.x = i201.a;
                                        break;
                                    } else {
                                        cv00 cv00Var = aVar2.a;
                                        j8l0 j8l0Var = new j8l0(System.currentTimeMillis(), aVar2, true, str, aVar2.s != null);
                                        Double d = aVar2.r;
                                        VehicleType vehicleType = VehicleType.TAXI;
                                        o oVar = (o) cv00Var;
                                        oVar.getClass();
                                        DrivingOptions drivingOptions = new DrivingOptions(d, 1, null, null, null, new AvoidanceFlags(false, false, false, false, false, false, false, false), EmptyList.a);
                                        VehicleOptions vehicleOptions = new VehicleOptions(vehicleType, null, null, null, null, null, null, null, null, null, null);
                                        oVar.e = j8l0Var;
                                        oVar.b.b(new vqy(oVar, polyline2, drivingOptions, vehicleOptions, 2), true);
                                        break;
                                    }
                                }
                            }
                        }
                        nol0Var = null;
                        if (nol0Var == null) {
                        }
                    }
                } else if (l201Var instanceof k201) {
                    k201 k201Var = (k201) l201Var;
                    yxf0Var = new yxf0(k201Var.a, k201Var.b);
                    String str2 = (String) yxf0Var.a;
                    OrderStatusInfo V2 = o2y0Var.b().V();
                    V2.getClass();
                    id = SimplePersistentBooleanExperiment.TAXIROUTE_ENABLE_ROUTE_CACHE.getId();
                    a = V2.getA();
                    if (a == null ? a.a(id) : false) {
                        k3l0Var = (k3l0) aVar2.h.a.get(o2y0Var.b().a);
                        if (k3l0Var != null) {
                            nol0Var = k3l0Var.b;
                            if (nol0Var == null) {
                            }
                        }
                    }
                    nol0Var = null;
                    if (nol0Var == null) {
                    }
                }
                break;
            case 10:
                Object Pg = c0.Pg(c0Var, (yz70) obj, continuation);
                if (Pg == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                yz70 yz70Var = (yz70) obj;
                cgi0 cgi0Var = c0Var.W;
                MapRouteParametersDto o = c0Var.A.b().o();
                if (o == null || (jsq0Var = o.c) == null || jsq0Var.a.isEmpty()) {
                    if (yz70Var.t == null) {
                        c0Var.H1 = false;
                        c0Var.Z.c = c0Var.r0.q(null) ? RecenterType.ALL_ROUTE : RecenterType.DESTINATION;
                    } else if (!c0Var.H1) {
                        c0Var.H1 = true;
                        obj2 = cgi0Var.e(RecenterType.ALTPIN_A_ON_DRIVING, false, continuation);
                    }
                    obj2 = zy11Var;
                } else {
                    c0Var.H1 = false;
                    obj2 = cgi0Var.e(RecenterType.CUSTOM_FROM_ORDER, false, continuation);
                }
                if (obj2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                DriveState driveState = (DriveState) obj;
                c0Var.getClass();
                o2y0 o2y0Var2 = c0Var.A;
                int i4 = x080.a[driveState.ordinal()];
                if (i4 != 1 && i4 != 2 && i4 != 3) {
                    c0Var.ch();
                    c0Var.C.a(o2y0Var2).h();
                } else if (!c0Var.Z.d) {
                    c0Var.ah();
                }
                boolean a2 = ((ooe) c0Var.t0).a(o2y0Var2.b());
                if (driveState == DriveState.DRIVING || ((driveState == DriveState.TRANSPORTING && !o2y0Var2.b().t().b.isEmpty()) || c0Var.Ug() || a2)) {
                    c0Var.bh(driveState);
                } else if (((com.yandex.go.taxi.order.map.route.a) c0Var.N.get()).A) {
                    c0Var.ch();
                }
                c0Var.eh();
                c0Var.Qg();
                c0Var.y1.g(new w080(1));
                break;
            case 13:
                if (!c0Var.N0 && (r0 = c0Var.W.h(continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                ((m1t) c0Var.a0).a().Cc(((Boolean) obj).booleanValue());
                c0Var.W.c();
                break;
            case 15:
                c0.Og(c0Var, (List) obj);
                break;
            default:
                tu70 tu70Var = (tu70) obj;
                c0Var.y1.g(new w080(3));
                if (!c0Var.A0.a()) {
                    q6l0 q6l0Var = tu70Var.e;
                    if (q6l0Var == null) {
                        ((u080) c0Var.Dg()).ec();
                        ((u080) c0Var.Dg()).f2(tu70Var);
                        break;
                    } else {
                        ((u080) c0Var.Dg()).Y2(q6l0Var);
                        break;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
