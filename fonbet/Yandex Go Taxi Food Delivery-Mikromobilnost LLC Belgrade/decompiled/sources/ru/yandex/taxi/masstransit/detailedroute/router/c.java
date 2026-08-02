package ru.yandex.taxi.masstransit.detailedroute.router;

import android.graphics.Color;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.transport.masstransit.Fitness;
import com.yandex.mapkit.transport.masstransit.FitnessType;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.RouteStop;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import com.yandex.mapkit.transport.masstransit.Weight;
import defpackage.a3l0;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.bs30;
import defpackage.cdc;
import defpackage.dpb;
import defpackage.evu0;
import defpackage.f0o0;
import defpackage.gf30;
import defpackage.gh00;
import defpackage.gv30;
import defpackage.gz30;
import defpackage.h73;
import defpackage.hg30;
import defpackage.hj40;
import defpackage.hw30;
import defpackage.hz30;
import defpackage.iw30;
import defpackage.jf30;
import defpackage.jl40;
import defpackage.jm30;
import defpackage.k141;
import defpackage.kf30;
import defpackage.kw30;
import defpackage.kyh0;
import defpackage.l141;
import defpackage.l540;
import defpackage.lj40;
import defpackage.m810;
import defpackage.m950;
import defpackage.mz30;
import defpackage.ng30;
import defpackage.nk31;
import defpackage.nw30;
import defpackage.nzs;
import defpackage.og30;
import defpackage.oyr;
import defpackage.pd01;
import defpackage.pg30;
import defpackage.pi30;
import defpackage.q5z;
import defpackage.qu;
import defpackage.r440;
import defpackage.s5r;
import defpackage.scc;
import defpackage.su30;
import defpackage.sy60;
import defpackage.t7s;
import defpackage.tbo;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ubo;
import defpackage.vi30;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.xm00;
import defpackage.yi40;
import defpackage.yp30;
import defpackage.yvf0;
import defpackage.zi40;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.experiment.f;
import ru.yandex.taxi.masstransit.model.EssentialPoint$Type;

/* loaded from: classes6.dex */
public final class c extends BaseRootNavigationRouter implements og30 {
    public final ru.yandex.taxi.masstransit.datasource.routing.a D;
    public final yp30 E;
    public final a3v F;
    public final yvf0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final com.yandex.go.navigation.screen.c K;
    public final yvf0 L;
    public final d0 M;
    public final ru.yandex.taxi.masstransit.trains.config.a N;
    public final zuj0 O;
    public final ah00 P;
    public final k141 Q;
    public final a3l0 R;
    public final f0o0 S;
    public xm00 U;
    public final pg30 T = new pg30(this, 0);
    public final mz30 V = new mz30();
    public jf30 W = gf30.a;

    public c(ru.yandex.taxi.masstransit.datasource.routing.a aVar, yp30 yp30Var, a3v a3vVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, com.yandex.go.navigation.screen.c cVar, yvf0 yvf0Var5, d0 d0Var, ru.yandex.taxi.masstransit.trains.config.a aVar2, zuj0 zuj0Var, ah00 ah00Var, k141 k141Var, a3l0 a3l0Var, f0o0 f0o0Var) {
        this.D = aVar;
        this.E = yp30Var;
        this.F = a3vVar;
        this.G = yvf0Var;
        this.H = yvf0Var2;
        this.I = yvf0Var3;
        this.J = yvf0Var4;
        this.K = cVar;
        this.L = yvf0Var5;
        this.M = d0Var;
        this.N = aVar2;
        this.O = zuj0Var;
        this.P = ah00Var;
        this.Q = k141Var;
        this.R = a3l0Var;
        this.S = f0o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x057b, code lost:
    
        if (r32 == null) goto L242;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0550 A[LOOP:4: B:209:0x054a->B:211:0x0550, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0656 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    @Override // defpackage.h55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Object obj) {
        boolean equals;
        Route route;
        List list;
        ru.yandex.taxi.masstransit.trains.config.a aVar;
        d0 d0Var;
        ng30 ng30Var;
        c cVar;
        su30 j;
        su30 su30Var;
        boolean isEnabled;
        ah00 ah00Var;
        Time time;
        Route route2;
        Object obj2;
        Route route3;
        Route route4;
        double d;
        RouteMetadata metadata;
        Weight weight;
        LocalizedValue time2;
        Polyline geometry;
        Time arrivalTime;
        Time departureTime;
        Time arrivalTime2;
        Time departureTime2;
        ru.yandex.taxi.masstransit.trains.config.a aVar2;
        d0 d0Var2;
        Route route5;
        long j2;
        zuj0 zuj0Var;
        Ref$IntRef ref$IntRef;
        Object obj3;
        long j3;
        String str;
        int i;
        Time time3;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        Integer num2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String h;
        String c;
        String c2;
        String str11;
        String c3;
        String c4;
        Ref$IntRef ref$IntRef2;
        Iterator<T> it;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Time arrivalTime3;
        Time departureTime3;
        Time arrivalTime4;
        Time departureTime4;
        Route route6;
        Iterator it2;
        String str17;
        FitnessType type;
        Object nk31Var;
        RouteMetadata metadata2;
        TravelEstimation estimation;
        ng30 ng30Var2 = (ng30) obj;
        String str18 = ng30Var2.j;
        Route route7 = ng30Var2.e;
        List list2 = ng30Var2.g;
        f0o0 f0o0Var = this.S;
        if (str18 == null) {
            f0o0Var.getClass();
        } else {
            String str19 = f0o0Var.a;
            if (str19 != null) {
                equals = evu0.Q("mm_route_", str19).equals(str18);
                if (equals) {
                    f0o0Var.a = null;
                }
                if (!equals) {
                    r(new qu(9));
                    return;
                }
                boolean isEmpty = list2.isEmpty();
                ru.yandex.taxi.masstransit.trains.config.a aVar3 = this.N;
                d0 d0Var3 = this.M;
                int i2 = 1;
                if (isEmpty) {
                    route = route7;
                    list = list2;
                    aVar = aVar3;
                    d0Var = d0Var3;
                    ng30Var = ng30Var2;
                    cVar = this;
                    j = cVar.D.j(ng30Var.a, ng30Var.b, d0Var.a(), aVar.b(), 0L);
                } else {
                    List list3 = ng30Var2.b;
                    f a = d0Var3.a();
                    pd01 b = aVar3.b();
                    yp30 yp30Var = this.E;
                    zuj0 zuj0Var2 = yp30Var.c;
                    Address address = (Address) kotlin.collections.a.R(list3);
                    if (address != null) {
                        List J = kotlin.collections.a.J(list3, 1);
                        List list4 = !J.isEmpty() ? J : null;
                        if (list4 != null) {
                            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                            List list5 = list2;
                            Iterator it3 = list5.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    time = null;
                                    break;
                                }
                                Route route8 = ((nw30) it3.next()).getRoute();
                                Time departureTime5 = (route8 == null || (metadata2 = route8.getMetadata()) == null || (estimation = metadata2.getEstimation()) == null) ? null : estimation.getDepartureTime();
                                if (departureTime5 != null) {
                                    time = departureTime5;
                                    break;
                                }
                            }
                            long value = time != null ? time.getValue() : 0L;
                            ArrayList arrayList = new ArrayList();
                            Iterator it4 = list5.iterator();
                            long j4 = value;
                            int i3 = 0;
                            while (true) {
                                if (it4.hasNext()) {
                                    int i4 = i3 + 1;
                                    int i5 = i2;
                                    nw30 nw30Var = (nw30) it4.next();
                                    Ref$IntRef ref$IntRef4 = ref$IntRef3;
                                    Route route9 = nw30Var.getRoute();
                                    if (route9 == null) {
                                        route5 = route7;
                                        aVar2 = aVar3;
                                        d0Var2 = d0Var3;
                                        zuj0Var = zuj0Var2;
                                        ref$IntRef = ref$IntRef4;
                                    } else {
                                        aVar2 = aVar3;
                                        d0Var2 = d0Var3;
                                        long a2 = (long) nzs.a(route9);
                                        route5 = route7;
                                        boolean z = nw30Var instanceof kw30;
                                        if (z || (nw30Var instanceof hw30) || (nw30Var instanceof iw30)) {
                                            j2 = a2;
                                            zuj0Var = zuj0Var2;
                                            ref$IntRef = ref$IntRef4;
                                            Iterator it5 = route9.getSections().iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    obj3 = null;
                                                    break;
                                                }
                                                Object next = it5.next();
                                                Fitness fitness = ((Section) next).getMetadata().getData().getFitness();
                                                if (fitness == null || (type = fitness.getType()) == null) {
                                                    it2 = it5;
                                                    str17 = null;
                                                } else {
                                                    String name = type.name();
                                                    it2 = it5;
                                                    str17 = name;
                                                }
                                                if (jl40.l(str17, "BICYCLE")) {
                                                    obj3 = next;
                                                    break;
                                                }
                                                it5 = it2;
                                            }
                                            Section section = (Section) obj3;
                                            if (section != null) {
                                                long j5 = j4;
                                                String a3 = time != null ? yp30Var.a(j5, time) : null;
                                                if (a3 == null) {
                                                    a3 = "";
                                                }
                                                j3 = j5;
                                                String a4 = time != null ? yp30Var.a(j3 + j2, time) : null;
                                                if (a4 == null) {
                                                    a4 = "";
                                                }
                                                nw30 nw30Var2 = (nw30) kotlin.collections.a.S(i4, list2);
                                                if (nw30Var2 == null || (route6 = nw30Var2.getRoute()) == null || (str = (String) kotlin.collections.a.R(yp30.b(route6))) == null || evu0.J(str)) {
                                                    str = null;
                                                }
                                                i = i4;
                                                int i6 = ref$IntRef.element + 1;
                                                ref$IntRef.element = i6;
                                                if (z) {
                                                    time3 = time;
                                                    str2 = ((kw30) nw30Var).c;
                                                } else {
                                                    time3 = time;
                                                    str2 = nw30Var instanceof hw30 ? ((hw30) nw30Var).c : nw30Var instanceof iw30 ? ((iw30) nw30Var).c : null;
                                                }
                                                if (z) {
                                                    str3 = str2;
                                                    str4 = ((kw30) nw30Var).d;
                                                } else {
                                                    str3 = str2;
                                                    str4 = nw30Var instanceof hw30 ? ((hw30) nw30Var).d : nw30Var instanceof iw30 ? ((iw30) nw30Var).d : null;
                                                }
                                                if (z) {
                                                    str5 = str4;
                                                    num2 = ((kw30) nw30Var).e;
                                                } else {
                                                    str5 = str4;
                                                    if (nw30Var instanceof hw30) {
                                                        num2 = ((hw30) nw30Var).e;
                                                    } else if (nw30Var instanceof iw30) {
                                                        num2 = ((iw30) nw30Var).e;
                                                    } else {
                                                        num = null;
                                                        if (!z) {
                                                            str7 = ((kw30) nw30Var).f;
                                                        } else if (nw30Var instanceof hw30) {
                                                            str7 = ((hw30) nw30Var).f;
                                                        } else if (nw30Var instanceof iw30) {
                                                            str7 = ((iw30) nw30Var).f;
                                                        } else {
                                                            str6 = null;
                                                            if (z) {
                                                                str9 = ((kw30) nw30Var).h;
                                                            } else if (nw30Var instanceof hw30) {
                                                                str9 = ((hw30) nw30Var).g;
                                                            } else {
                                                                str8 = null;
                                                                kw30 kw30Var = !z ? (kw30) nw30Var : null;
                                                                Integer num3 = kw30Var == null ? kw30Var.i : null;
                                                                if (!z) {
                                                                    h = ((avj0) zuj0Var).h(kyh0.mobility_hub_multimodality_scooter);
                                                                } else if (nw30Var instanceof hw30) {
                                                                    h = ((avj0) zuj0Var).h(kyh0.mobility_hub_multimodality_bike);
                                                                } else if (nw30Var instanceof iw30) {
                                                                    h = ((avj0) zuj0Var).h(kyh0.mobility_hub_multimodality_electrobike);
                                                                } else {
                                                                    str10 = null;
                                                                    TravelEstimation estimation2 = section.getMetadata().getEstimation();
                                                                    c = (estimation2 != null || (departureTime4 = estimation2.getDepartureTime()) == null) ? null : yp30Var.c(departureTime4);
                                                                    if (c == null) {
                                                                        c = "";
                                                                    }
                                                                    TravelEstimation estimation3 = section.getMetadata().getEstimation();
                                                                    c2 = (estimation3 != null || (arrivalTime4 = estimation3.getArrivalTime()) == null) ? null : yp30Var.c(arrivalTime4);
                                                                    if (c2 == null) {
                                                                        c2 = "";
                                                                    }
                                                                    TravelEstimation estimation4 = route9.getMetadata().getEstimation();
                                                                    str11 = c;
                                                                    c3 = (estimation4 != null || (departureTime3 = estimation4.getDepartureTime()) == null) ? null : yp30Var.c(departureTime3);
                                                                    if (c3 == null) {
                                                                        c3 = "";
                                                                    }
                                                                    TravelEstimation estimation5 = route9.getMetadata().getEstimation();
                                                                    String str20 = c3;
                                                                    c4 = (estimation5 != null || (arrivalTime3 = estimation5.getArrivalTime()) == null) ? null : yp30Var.c(arrivalTime3);
                                                                    if (c4 == null) {
                                                                        c4 = "";
                                                                    }
                                                                    String str21 = c4;
                                                                    List<RouteStop> stops = section.getStops();
                                                                    ref$IntRef2 = ref$IntRef;
                                                                    ArrayList arrayList2 = new ArrayList(tcc.n(stops, 10));
                                                                    it = stops.iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList2.add(((RouteStop) it.next()).getMetadata().getStop().getName());
                                                                    }
                                                                    ArrayList b2 = yp30.b(route9);
                                                                    Address address2 = (Address) kotlin.collections.a.R(list3);
                                                                    if (str3 != null) {
                                                                        if (evu0.J(str3)) {
                                                                            str3 = null;
                                                                        }
                                                                    }
                                                                    str3 = (String) kotlin.collections.a.R(arrayList2);
                                                                    if (str3 != null || evu0.J(str3)) {
                                                                        str3 = null;
                                                                    }
                                                                    if (str3 == null) {
                                                                        str3 = (String) kotlin.collections.a.R(b2);
                                                                        if (str3 == null || evu0.J(str3)) {
                                                                            str3 = null;
                                                                        }
                                                                        if (str3 == null) {
                                                                            str3 = address2 != null ? q5z.F(address2) : null;
                                                                        }
                                                                    }
                                                                    if (str5 != null) {
                                                                        if (evu0.J(str5)) {
                                                                            str5 = null;
                                                                        }
                                                                        if (str5 != null) {
                                                                            str13 = str5;
                                                                            str14 = str11.length() <= 0 ? str11 : null;
                                                                            if (str14 == null) {
                                                                                str14 = str20.length() > 0 ? str20 : null;
                                                                                if (str14 == null) {
                                                                                    str15 = a3;
                                                                                    if (c2.length() <= 0) {
                                                                                        c2 = null;
                                                                                    }
                                                                                    if (c2 == null) {
                                                                                        String str22 = str21.length() > 0 ? str21 : null;
                                                                                        str16 = str22 == null ? a4 : str22;
                                                                                    } else {
                                                                                        str16 = c2;
                                                                                    }
                                                                                    Point point = (Point) kotlin.collections.a.R(route9.getGeometry().getPoints());
                                                                                    Point point2 = (Point) kotlin.collections.a.b0(route9.getGeometry().getPoints());
                                                                                    Point point3 = point2 == null ? point : point2;
                                                                                    arrayList.add(new gz30(new cdc(-204800), section.getMetadata().getWeight().getTime().getText(), num, str6, str8, null, str3, str13, str15, str16, (point != null || point3 == null) ? EmptyList.a : scc.g(new hj40(str3 == null ? "" : str3, null, oyr.i(i6, "scooter_start_"), point, null), new hj40(str13 == null ? "" : str13, null, oyr.i(i6, "scooter_end_"), point3, null)), num3, str10, section.getGeometry(), section.getMetadata().getWeight().getTime().getValue(), i6));
                                                                                    time = time3;
                                                                                    j4 = j3 + j2;
                                                                                    zuj0Var2 = zuj0Var;
                                                                                    ref$IntRef3 = ref$IntRef2;
                                                                                    i3 = i;
                                                                                }
                                                                            }
                                                                            str15 = str14;
                                                                            if (c2.length() <= 0) {
                                                                            }
                                                                            if (c2 == null) {
                                                                            }
                                                                            Point point4 = (Point) kotlin.collections.a.R(route9.getGeometry().getPoints());
                                                                            Point point22 = (Point) kotlin.collections.a.b0(route9.getGeometry().getPoints());
                                                                            if (point22 == null) {
                                                                            }
                                                                            if (point4 != null) {
                                                                            }
                                                                            arrayList.add(new gz30(new cdc(-204800), section.getMetadata().getWeight().getTime().getText(), num, str6, str8, null, str3, str13, str15, str16, (point4 != null || point3 == null) ? EmptyList.a : scc.g(new hj40(str3 == null ? "" : str3, null, oyr.i(i6, "scooter_start_"), point4, null), new hj40(str13 == null ? "" : str13, null, oyr.i(i6, "scooter_end_"), point3, null)), num3, str10, section.getGeometry(), section.getMetadata().getWeight().getTime().getValue(), i6));
                                                                            time = time3;
                                                                            j4 = j3 + j2;
                                                                            zuj0Var2 = zuj0Var;
                                                                            ref$IntRef3 = ref$IntRef2;
                                                                            i3 = i;
                                                                        }
                                                                    }
                                                                    str12 = (String) kotlin.collections.a.b0(arrayList2);
                                                                    if (str12 != null || evu0.J(str12)) {
                                                                        str12 = null;
                                                                    }
                                                                    if (str12 == null) {
                                                                        String str23 = (String) kotlin.collections.a.b0(b2);
                                                                        if (str23 == null || evu0.J(str23)) {
                                                                            str23 = null;
                                                                        }
                                                                        str13 = str23 == null ? (str == null || evu0.J(str)) ? null : str : str23;
                                                                    } else {
                                                                        str13 = str12;
                                                                    }
                                                                    if (str11.length() <= 0) {
                                                                    }
                                                                    if (str14 == null) {
                                                                    }
                                                                    str15 = str14;
                                                                    if (c2.length() <= 0) {
                                                                    }
                                                                    if (c2 == null) {
                                                                    }
                                                                    Point point42 = (Point) kotlin.collections.a.R(route9.getGeometry().getPoints());
                                                                    Point point222 = (Point) kotlin.collections.a.b0(route9.getGeometry().getPoints());
                                                                    if (point222 == null) {
                                                                    }
                                                                    if (point42 != null) {
                                                                    }
                                                                    arrayList.add(new gz30(new cdc(-204800), section.getMetadata().getWeight().getTime().getText(), num, str6, str8, null, str3, str13, str15, str16, (point42 != null || point3 == null) ? EmptyList.a : scc.g(new hj40(str3 == null ? "" : str3, null, oyr.i(i6, "scooter_start_"), point42, null), new hj40(str13 == null ? "" : str13, null, oyr.i(i6, "scooter_end_"), point3, null)), num3, str10, section.getGeometry(), section.getMetadata().getWeight().getTime().getValue(), i6));
                                                                    time = time3;
                                                                    j4 = j3 + j2;
                                                                    zuj0Var2 = zuj0Var;
                                                                    ref$IntRef3 = ref$IntRef2;
                                                                    i3 = i;
                                                                }
                                                                str10 = h;
                                                                TravelEstimation estimation22 = section.getMetadata().getEstimation();
                                                                if (estimation22 != null) {
                                                                }
                                                                if (c == null) {
                                                                }
                                                                TravelEstimation estimation32 = section.getMetadata().getEstimation();
                                                                if (estimation32 != null) {
                                                                }
                                                                if (c2 == null) {
                                                                }
                                                                TravelEstimation estimation42 = route9.getMetadata().getEstimation();
                                                                str11 = c;
                                                                if (estimation42 != null) {
                                                                }
                                                                if (c3 == null) {
                                                                }
                                                                TravelEstimation estimation52 = route9.getMetadata().getEstimation();
                                                                String str202 = c3;
                                                                if (estimation52 != null) {
                                                                }
                                                                if (c4 == null) {
                                                                }
                                                                String str212 = c4;
                                                                List<RouteStop> stops2 = section.getStops();
                                                                ref$IntRef2 = ref$IntRef;
                                                                ArrayList arrayList22 = new ArrayList(tcc.n(stops2, 10));
                                                                it = stops2.iterator();
                                                                while (it.hasNext()) {
                                                                }
                                                                ArrayList b22 = yp30.b(route9);
                                                                Address address22 = (Address) kotlin.collections.a.R(list3);
                                                                if (str3 != null) {
                                                                }
                                                                str3 = (String) kotlin.collections.a.R(arrayList22);
                                                                if (str3 != null) {
                                                                }
                                                                str3 = null;
                                                                if (str3 == null) {
                                                                }
                                                                if (str5 != null) {
                                                                }
                                                                str12 = (String) kotlin.collections.a.b0(arrayList22);
                                                                if (str12 != null) {
                                                                }
                                                                str12 = null;
                                                                if (str12 == null) {
                                                                }
                                                                if (str11.length() <= 0) {
                                                                }
                                                                if (str14 == null) {
                                                                }
                                                                str15 = str14;
                                                                if (c2.length() <= 0) {
                                                                }
                                                                if (c2 == null) {
                                                                }
                                                                Point point422 = (Point) kotlin.collections.a.R(route9.getGeometry().getPoints());
                                                                Point point2222 = (Point) kotlin.collections.a.b0(route9.getGeometry().getPoints());
                                                                if (point2222 == null) {
                                                                }
                                                                if (point422 != null) {
                                                                }
                                                                arrayList.add(new gz30(new cdc(-204800), section.getMetadata().getWeight().getTime().getText(), num, str6, str8, null, str3, str13, str15, str16, (point422 != null || point3 == null) ? EmptyList.a : scc.g(new hj40(str3 == null ? "" : str3, null, oyr.i(i6, "scooter_start_"), point422, null), new hj40(str13 == null ? "" : str13, null, oyr.i(i6, "scooter_end_"), point3, null)), num3, str10, section.getGeometry(), section.getMetadata().getWeight().getTime().getValue(), i6));
                                                                time = time3;
                                                                j4 = j3 + j2;
                                                                zuj0Var2 = zuj0Var;
                                                                ref$IntRef3 = ref$IntRef2;
                                                                i3 = i;
                                                            }
                                                            str8 = str9;
                                                            if (!z) {
                                                            }
                                                            if (kw30Var == null) {
                                                            }
                                                            if (!z) {
                                                            }
                                                            str10 = h;
                                                            TravelEstimation estimation222 = section.getMetadata().getEstimation();
                                                            if (estimation222 != null) {
                                                            }
                                                            if (c == null) {
                                                            }
                                                            TravelEstimation estimation322 = section.getMetadata().getEstimation();
                                                            if (estimation322 != null) {
                                                            }
                                                            if (c2 == null) {
                                                            }
                                                            TravelEstimation estimation422 = route9.getMetadata().getEstimation();
                                                            str11 = c;
                                                            if (estimation422 != null) {
                                                            }
                                                            if (c3 == null) {
                                                            }
                                                            TravelEstimation estimation522 = route9.getMetadata().getEstimation();
                                                            String str2022 = c3;
                                                            if (estimation522 != null) {
                                                            }
                                                            if (c4 == null) {
                                                            }
                                                            String str2122 = c4;
                                                            List<RouteStop> stops22 = section.getStops();
                                                            ref$IntRef2 = ref$IntRef;
                                                            ArrayList arrayList222 = new ArrayList(tcc.n(stops22, 10));
                                                            it = stops22.iterator();
                                                            while (it.hasNext()) {
                                                            }
                                                            ArrayList b222 = yp30.b(route9);
                                                            Address address222 = (Address) kotlin.collections.a.R(list3);
                                                            if (str3 != null) {
                                                            }
                                                            str3 = (String) kotlin.collections.a.R(arrayList222);
                                                            if (str3 != null) {
                                                            }
                                                            str3 = null;
                                                            if (str3 == null) {
                                                            }
                                                            if (str5 != null) {
                                                            }
                                                            str12 = (String) kotlin.collections.a.b0(arrayList222);
                                                            if (str12 != null) {
                                                            }
                                                            str12 = null;
                                                            if (str12 == null) {
                                                            }
                                                            if (str11.length() <= 0) {
                                                            }
                                                            if (str14 == null) {
                                                            }
                                                            str15 = str14;
                                                            if (c2.length() <= 0) {
                                                            }
                                                            if (c2 == null) {
                                                            }
                                                            Point point4222 = (Point) kotlin.collections.a.R(route9.getGeometry().getPoints());
                                                            Point point22222 = (Point) kotlin.collections.a.b0(route9.getGeometry().getPoints());
                                                            if (point22222 == null) {
                                                            }
                                                            if (point4222 != null) {
                                                            }
                                                            arrayList.add(new gz30(new cdc(-204800), section.getMetadata().getWeight().getTime().getText(), num, str6, str8, null, str3, str13, str15, str16, (point4222 != null || point3 == null) ? EmptyList.a : scc.g(new hj40(str3 == null ? "" : str3, null, oyr.i(i6, "scooter_start_"), point4222, null), new hj40(str13 == null ? "" : str13, null, oyr.i(i6, "scooter_end_"), point3, null)), num3, str10, section.getGeometry(), section.getMetadata().getWeight().getTime().getValue(), i6));
                                                            time = time3;
                                                            j4 = j3 + j2;
                                                            zuj0Var2 = zuj0Var;
                                                            ref$IntRef3 = ref$IntRef2;
                                                            i3 = i;
                                                        }
                                                        str6 = str7;
                                                        if (z) {
                                                        }
                                                        str8 = str9;
                                                        if (!z) {
                                                        }
                                                        if (kw30Var == null) {
                                                        }
                                                        if (!z) {
                                                        }
                                                        str10 = h;
                                                        TravelEstimation estimation2222 = section.getMetadata().getEstimation();
                                                        if (estimation2222 != null) {
                                                        }
                                                        if (c == null) {
                                                        }
                                                        TravelEstimation estimation3222 = section.getMetadata().getEstimation();
                                                        if (estimation3222 != null) {
                                                        }
                                                        if (c2 == null) {
                                                        }
                                                        TravelEstimation estimation4222 = route9.getMetadata().getEstimation();
                                                        str11 = c;
                                                        if (estimation4222 != null) {
                                                        }
                                                        if (c3 == null) {
                                                        }
                                                        TravelEstimation estimation5222 = route9.getMetadata().getEstimation();
                                                        String str20222 = c3;
                                                        if (estimation5222 != null) {
                                                        }
                                                        if (c4 == null) {
                                                        }
                                                        String str21222 = c4;
                                                        List<RouteStop> stops222 = section.getStops();
                                                        ref$IntRef2 = ref$IntRef;
                                                        ArrayList arrayList2222 = new ArrayList(tcc.n(stops222, 10));
                                                        it = stops222.iterator();
                                                        while (it.hasNext()) {
                                                        }
                                                        ArrayList b2222 = yp30.b(route9);
                                                        Address address2222 = (Address) kotlin.collections.a.R(list3);
                                                        if (str3 != null) {
                                                        }
                                                        str3 = (String) kotlin.collections.a.R(arrayList2222);
                                                        if (str3 != null) {
                                                        }
                                                        str3 = null;
                                                        if (str3 == null) {
                                                        }
                                                        if (str5 != null) {
                                                        }
                                                        str12 = (String) kotlin.collections.a.b0(arrayList2222);
                                                        if (str12 != null) {
                                                        }
                                                        str12 = null;
                                                        if (str12 == null) {
                                                        }
                                                        if (str11.length() <= 0) {
                                                        }
                                                        if (str14 == null) {
                                                        }
                                                        str15 = str14;
                                                        if (c2.length() <= 0) {
                                                        }
                                                        if (c2 == null) {
                                                        }
                                                        Point point42222 = (Point) kotlin.collections.a.R(route9.getGeometry().getPoints());
                                                        Point point222222 = (Point) kotlin.collections.a.b0(route9.getGeometry().getPoints());
                                                        if (point222222 == null) {
                                                        }
                                                        if (point42222 != null) {
                                                        }
                                                        arrayList.add(new gz30(new cdc(-204800), section.getMetadata().getWeight().getTime().getText(), num, str6, str8, null, str3, str13, str15, str16, (point42222 != null || point3 == null) ? EmptyList.a : scc.g(new hj40(str3 == null ? "" : str3, null, oyr.i(i6, "scooter_start_"), point42222, null), new hj40(str13 == null ? "" : str13, null, oyr.i(i6, "scooter_end_"), point3, null)), num3, str10, section.getGeometry(), section.getMetadata().getWeight().getTime().getValue(), i6));
                                                        time = time3;
                                                        j4 = j3 + j2;
                                                        zuj0Var2 = zuj0Var;
                                                        ref$IntRef3 = ref$IntRef2;
                                                        i3 = i;
                                                    }
                                                }
                                                num = num2;
                                                if (!z) {
                                                }
                                                str6 = str7;
                                                if (z) {
                                                }
                                                str8 = str9;
                                                if (!z) {
                                                }
                                                if (kw30Var == null) {
                                                }
                                                if (!z) {
                                                }
                                                str10 = h;
                                                TravelEstimation estimation22222 = section.getMetadata().getEstimation();
                                                if (estimation22222 != null) {
                                                }
                                                if (c == null) {
                                                }
                                                TravelEstimation estimation32222 = section.getMetadata().getEstimation();
                                                if (estimation32222 != null) {
                                                }
                                                if (c2 == null) {
                                                }
                                                TravelEstimation estimation42222 = route9.getMetadata().getEstimation();
                                                str11 = c;
                                                if (estimation42222 != null) {
                                                }
                                                if (c3 == null) {
                                                }
                                                TravelEstimation estimation52222 = route9.getMetadata().getEstimation();
                                                String str202222 = c3;
                                                if (estimation52222 != null) {
                                                }
                                                if (c4 == null) {
                                                }
                                                String str212222 = c4;
                                                List<RouteStop> stops2222 = section.getStops();
                                                ref$IntRef2 = ref$IntRef;
                                                ArrayList arrayList22222 = new ArrayList(tcc.n(stops2222, 10));
                                                it = stops2222.iterator();
                                                while (it.hasNext()) {
                                                }
                                                ArrayList b22222 = yp30.b(route9);
                                                Address address22222 = (Address) kotlin.collections.a.R(list3);
                                                if (str3 != null) {
                                                }
                                                str3 = (String) kotlin.collections.a.R(arrayList22222);
                                                if (str3 != null) {
                                                }
                                                str3 = null;
                                                if (str3 == null) {
                                                }
                                                if (str5 != null) {
                                                }
                                                str12 = (String) kotlin.collections.a.b0(arrayList22222);
                                                if (str12 != null) {
                                                }
                                                str12 = null;
                                                if (str12 == null) {
                                                }
                                                if (str11.length() <= 0) {
                                                }
                                                if (str14 == null) {
                                                }
                                                str15 = str14;
                                                if (c2.length() <= 0) {
                                                }
                                                if (c2 == null) {
                                                }
                                                Point point422222 = (Point) kotlin.collections.a.R(route9.getGeometry().getPoints());
                                                Point point2222222 = (Point) kotlin.collections.a.b0(route9.getGeometry().getPoints());
                                                if (point2222222 == null) {
                                                }
                                                if (point422222 != null) {
                                                }
                                                arrayList.add(new gz30(new cdc(-204800), section.getMetadata().getWeight().getTime().getText(), num, str6, str8, null, str3, str13, str15, str16, (point422222 != null || point3 == null) ? EmptyList.a : scc.g(new hj40(str3 == null ? "" : str3, null, oyr.i(i6, "scooter_start_"), point422222, null), new hj40(str13 == null ? "" : str13, null, oyr.i(i6, "scooter_end_"), point3, null)), num3, str10, section.getGeometry(), section.getMetadata().getWeight().getTime().getValue(), i6));
                                                time = time3;
                                                j4 = j3 + j2;
                                                zuj0Var2 = zuj0Var;
                                                ref$IntRef3 = ref$IntRef2;
                                                i3 = i;
                                            }
                                        } else {
                                            zuj0Var = zuj0Var2;
                                            su30 j6 = yp30Var.a.j(route9, list3, a, b, 0L);
                                            if (j6 == null) {
                                                ref$IntRef = ref$IntRef4;
                                            } else {
                                                for (hz30 hz30Var : j6.a) {
                                                    long j7 = a2;
                                                    int i7 = ref$IntRef4.element + 1;
                                                    ref$IntRef4.element = i7;
                                                    if (hz30Var instanceof bs30) {
                                                        bs30 bs30Var = (bs30) hz30Var;
                                                        nk31Var = new bs30(bs30Var.a, bs30Var.b, bs30Var.c, bs30Var.d, i7);
                                                    } else if (hz30Var instanceof gz30) {
                                                        gz30 gz30Var = (gz30) hz30Var;
                                                        nk31Var = new gz30(gz30Var.a, gz30Var.b, gz30Var.c, gz30Var.d, gz30Var.e, gz30Var.f, gz30Var.g, gz30Var.h, gz30Var.i, gz30Var.j, gz30Var.k, gz30Var.l, gz30Var.m, gz30Var.n, gz30Var.o, i7);
                                                    } else if (hz30Var instanceof yi40) {
                                                        yi40 yi40Var = (yi40) hz30Var;
                                                        nk31Var = new yi40(yi40Var.a, yi40Var.b, yi40Var.c, i7);
                                                    } else if (hz30Var instanceof zi40) {
                                                        zi40 zi40Var = (zi40) hz30Var;
                                                        nk31Var = new zi40(zi40Var.a, zi40Var.b, zi40Var.c, zi40Var.d, zi40Var.e, zi40Var.f, zi40Var.g, zi40Var.h, zi40Var.i, zi40Var.j, i7);
                                                    } else if (hz30Var instanceof lj40) {
                                                        lj40 lj40Var = (lj40) hz30Var;
                                                        nk31Var = new lj40(lj40Var.a, lj40Var.b, lj40Var.c, lj40Var.d, lj40Var.e, lj40Var.f, lj40Var.g, lj40Var.h, lj40Var.i, lj40Var.j, lj40Var.k, lj40Var.l, lj40Var.m, lj40Var.n, i7, lj40Var.p);
                                                    } else if (hz30Var instanceof jm30) {
                                                        jm30 jm30Var = (jm30) hz30Var;
                                                        nk31Var = new jm30(jm30Var.a, jm30Var.b, jm30Var.c, jm30Var.d, jm30Var.e, jm30Var.f, jm30Var.g, jm30Var.h, jm30Var.i, jm30Var.j, jm30Var.k, i7, jm30Var.m);
                                                    } else if (hz30Var instanceof r440) {
                                                        r440 r440Var = (r440) hz30Var;
                                                        nk31Var = new r440(r440Var.a, r440Var.b, r440Var.c, r440Var.d, r440Var.e, r440Var.f, r440Var.g, r440Var.h, r440Var.i, r440Var.j, i7, r440Var.l);
                                                    } else if (hz30Var instanceof l540) {
                                                        l540 l540Var = (l540) hz30Var;
                                                        nk31Var = new l540(l540Var.a, l540Var.b, l540Var.c, l540Var.d, i7, l540Var.f, l540Var.g, l540Var.h, l540Var.i, l540Var.j, l540Var.k);
                                                    } else if (!(hz30Var instanceof nk31)) {
                                                        w511.b();
                                                        return;
                                                    } else {
                                                        nk31 nk31Var2 = (nk31) hz30Var;
                                                        nk31Var = new nk31(nk31Var2.a, nk31Var2.b, nk31Var2.c, nk31Var2.d, i7);
                                                    }
                                                    arrayList.add(nk31Var);
                                                    a2 = j7;
                                                }
                                                j2 = a2;
                                                i = i4;
                                                ref$IntRef2 = ref$IntRef4;
                                                j3 = j4;
                                                time3 = time;
                                                time = time3;
                                                j4 = j3 + j2;
                                                zuj0Var2 = zuj0Var;
                                                ref$IntRef3 = ref$IntRef2;
                                                i3 = i;
                                            }
                                        }
                                        i2 = i5;
                                        aVar3 = aVar2;
                                        d0Var3 = d0Var2;
                                        route7 = route5;
                                    }
                                    zuj0Var2 = zuj0Var;
                                    i3 = i4;
                                    ref$IntRef3 = ref$IntRef;
                                    i2 = i5;
                                    aVar3 = aVar2;
                                    d0Var3 = d0Var2;
                                    route7 = route5;
                                } else {
                                    route = route7;
                                    aVar = aVar3;
                                    d0Var = d0Var3;
                                    int i8 = i2;
                                    zuj0 zuj0Var3 = zuj0Var2;
                                    if (!arrayList.isEmpty()) {
                                        Iterator it6 = list5.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                route2 = ((nw30) it6.next()).getRoute();
                                                if (route2 != null) {
                                                    break;
                                                }
                                            } else {
                                                route2 = null;
                                                break;
                                            }
                                        }
                                        if (route2 != null) {
                                            ListIterator listIterator = list2.listIterator(list2.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    obj2 = listIterator.previous();
                                                    if (((nw30) obj2).getRoute() != null) {
                                                        break;
                                                    }
                                                } else {
                                                    obj2 = null;
                                                    break;
                                                }
                                            }
                                            nw30 nw30Var3 = (nw30) obj2;
                                            if (nw30Var3 == null || (route3 = nw30Var3.getRoute()) == null) {
                                                route3 = route2;
                                            }
                                            TravelEstimation estimation6 = route2.getMetadata().getEstimation();
                                            String c5 = (estimation6 == null || (departureTime2 = estimation6.getDepartureTime()) == null) ? null : yp30Var.c(departureTime2);
                                            String str24 = c5 == null ? "" : c5;
                                            TravelEstimation estimation7 = route3.getMetadata().getEstimation();
                                            String c6 = (estimation7 == null || (arrivalTime2 = estimation7.getArrivalTime()) == null) ? null : yp30Var.c(arrivalTime2);
                                            String str25 = c6 != null ? c6 : "";
                                            tbo tboVar = new tbo(q5z.F(address), str24, EssentialPoint$Type.SOURCE, address.B(), address.getAddress().n);
                                            Address address3 = (Address) kotlin.collections.a.Z(list4);
                                            String str26 = str25;
                                            tbo tboVar2 = new tbo(q5z.F(address3), str26, EssentialPoint$Type.DESTINATION, address3.B(), null);
                                            TravelEstimation estimation8 = route2.getMetadata().getEstimation();
                                            Long valueOf = (estimation8 == null || (departureTime = estimation8.getDepartureTime()) == null) ? null : Long.valueOf(departureTime.getValue());
                                            TravelEstimation estimation9 = route3.getMetadata().getEstimation();
                                            Long valueOf2 = (estimation9 == null || (arrivalTime = estimation9.getArrivalTime()) == null) ? null : Long.valueOf(arrivalTime.getValue());
                                            if (valueOf == null || valueOf2 == null) {
                                                route4 = route2;
                                                Iterator it7 = list2.iterator();
                                                double d2 = 0.0d;
                                                while (it7.hasNext()) {
                                                    Route route10 = ((nw30) it7.next()).getRoute();
                                                    d2 += (route10 == null || (metadata = route10.getMetadata()) == null || (weight = metadata.getWeight()) == null || (time2 = weight.getTime()) == null) ? 0.0d : time2.getValue();
                                                }
                                                d = d2;
                                            } else {
                                                long longValue = valueOf2.longValue();
                                                long longValue2 = valueOf.longValue();
                                                route4 = route2;
                                                d = longValue - longValue2;
                                            }
                                            ng30Var = ng30Var2;
                                            TimeUnit timeUnit = TimeUnit.SECONDS;
                                            vi30 vi30Var = new vi30(m810.a(d / 60.0d), t7s.g(zuj0Var3, timeUnit.toMillis((long) d)));
                                            s5r s5rVar = new s5r(kotlin.sequences.b.g(new h73(i8, arrayList), new pi30(13)));
                                            long j8 = 0;
                                            while (s5rVar.hasNext()) {
                                                j8 += (long) ((hz30) s5rVar.next()).getDuration();
                                                list2 = list2;
                                                arrayList = arrayList;
                                            }
                                            list = list2;
                                            ArrayList arrayList3 = arrayList;
                                            vi30 vi30Var2 = new vi30((int) (j8 / 60), t7s.g(zuj0Var3, timeUnit.toMillis(j8)));
                                            String routeId = route4.getMetadata().getRouteId();
                                            ArrayList arrayList4 = new ArrayList();
                                            Iterator it8 = list.iterator();
                                            while (it8.hasNext()) {
                                                Route route11 = ((nw30) it8.next()).getRoute();
                                                List<Point> points = (route11 == null || (geometry = route11.getGeometry()) == null) ? null : geometry.getPoints();
                                                if (points != null) {
                                                    arrayList4.add(points);
                                                }
                                            }
                                            ArrayList o = tcc.o(arrayList4);
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator it9 = o.iterator();
                                            while (it9.hasNext()) {
                                                Point point5 = (Point) it9.next();
                                                Point point6 = (Point) kotlin.collections.a.b0(arrayList5);
                                                if (point6 == null || point6.getLatitude() != point5.getLatitude() || point6.getLongitude() != point5.getLongitude()) {
                                                    arrayList5.add(point5);
                                                }
                                            }
                                            Polyline l = arrayList5.size() < 2 ? null : k.l(arrayList5);
                                            if (l == null) {
                                                l = route4.getGeometry();
                                            }
                                            j = new su30(arrayList3, l, vi30Var, vi30Var2, routeId, new gv30(str24, str26), new ubo(tboVar, tboVar2));
                                        }
                                    }
                                    ng30Var = ng30Var2;
                                    list = list2;
                                    j = null;
                                }
                            }
                        }
                    }
                    route = route7;
                    list = list2;
                    j = null;
                    aVar = aVar3;
                    d0Var = d0Var3;
                    ng30Var = ng30Var2;
                    cVar = this;
                }
                su30 su30Var2 = j;
                if (su30Var2 == null) {
                    cVar.r(new qu(9));
                    return;
                }
                cVar.K.i(ng30Var.c);
                kf30 kf30Var = new kf30(cVar.W);
                tpr tprVar = ng30Var.f;
                if (route != null && !list.isEmpty()) {
                    su30 j9 = cVar.D.j(ng30Var.a, ng30Var.b, d0Var.a(), aVar.b(), 0L);
                    if (j9 != null) {
                        su30Var = j9;
                        cVar.A((m950) cVar.G.get(), new hg30(su30Var, su30Var == su30Var2 ? su30Var2 : null, null, kf30Var, cVar.V, ng30Var.k, null, tprVar, route == null, false, null, 1600), sy60.Q2);
                        tje.N(cVar.o(), null, null, new MtDetailedRouteRouterImpl$onAttach$1(kf30Var, cVar, su30Var2, null), 3);
                        cVar.F.b8(cVar);
                        isEnabled = cVar.R.a.isEnabled();
                        ah00Var = cVar.P;
                        if (!isEnabled || ((l141) cVar.Q).a()) {
                            ((gh00) ah00Var).I(true);
                        }
                        if (route == null) {
                            xm00 p = ((gh00) ah00Var).i.p();
                            cVar.U = p;
                            w4e0 s = p.s(route.getGeometry());
                            s.C(Integer.valueOf(Color.parseColor("#02CB52")));
                            s.p(4.5f);
                            s.v(false);
                            return;
                        }
                        return;
                    }
                }
                su30Var = su30Var2;
                cVar.A((m950) cVar.G.get(), new hg30(su30Var, su30Var == su30Var2 ? su30Var2 : null, null, kf30Var, cVar.V, ng30Var.k, null, tprVar, route == null, false, null, 1600), sy60.Q2);
                tje.N(cVar.o(), null, null, new MtDetailedRouteRouterImpl$onAttach$1(kf30Var, cVar, su30Var2, null), 3);
                cVar.F.b8(cVar);
                isEnabled = cVar.R.a.isEnabled();
                ah00Var = cVar.P;
                if (!isEnabled) {
                }
                ((gh00) ah00Var).I(true);
                if (route == null) {
                }
            }
        }
        equals = false;
        if (!equals) {
        }
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
        this.F.a0(this);
        if (this.R.a.isEnabled() || ((l141) this.Q).a()) {
            gh00 gh00Var = (gh00) this.P;
            gh00Var.I(false);
            gh00Var.v();
        }
        xm00 xm00Var = this.U;
        if (xm00Var != null) {
            xm00Var.d();
        }
        this.U = null;
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    }

    public final void Q(int i) {
        zuj0 zuj0Var = this.O;
        int u = tje.u(24, ((avj0) zuj0Var).a) + i;
        int u2 = tje.u(24, ((avj0) zuj0Var).a);
        this.F.q3(this, u2, tje.u(80, ((avj0) zuj0Var).a), u2, u);
    }
}
