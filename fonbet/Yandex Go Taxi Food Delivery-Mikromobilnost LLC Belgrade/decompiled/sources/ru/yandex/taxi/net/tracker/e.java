package ru.yandex.taxi.net.tracker;

import com.yandex.go.taxi.order.net.xiva.n;
import com.yandex.go.taxi_order.ws.XivaWsAnalytics$TaxiRoutePollingFallbackReason;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cwa1;
import defpackage.fel0;
import defpackage.h001;
import defpackage.h201;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hby0;
import defpackage.hst;
import defpackage.i201;
import defpackage.j001;
import defpackage.j201;
import defpackage.ja5;
import defpackage.jl40;
import defpackage.jse;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.k201;
import defpackage.ka5;
import defpackage.kel0;
import defpackage.kl3;
import defpackage.l201;
import defpackage.mel0;
import defpackage.mth;
import defpackage.nel0;
import defpackage.ny61;
import defpackage.o201;
import defpackage.oby0;
import defpackage.oel0;
import defpackage.p201;
import defpackage.pel0;
import defpackage.pzt0;
import defpackage.q201;
import defpackage.rel0;
import defpackage.s201;
import defpackage.scc;
import defpackage.te51;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u201;
import defpackage.uyj;
import defpackage.w511;
import defpackage.way0;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.r0;
import kotlinx.coroutines.flow.v;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.net.tracker.models.TrackPoint$Remote$Source;

/* loaded from: classes6.dex */
public abstract class e implements way0, kel0 {
    public final hbp0 A;
    public final jse B;
    public ru.yandex.taxi.net.tracker.v2.a C;
    public final AtomicReference D;
    public final AtomicReference E;
    public final r0 F;
    public final r0 G;
    public h201 H;
    public long I;
    public long J;
    public volatile boolean K;
    public volatile boolean L;
    public float M;
    public TrackerMode N;
    public oby0 O;
    public volatile DrivingRoute P;
    public volatile pzt0 Q;
    public volatile boolean R;
    public volatile BaseSmoothMovementTracker$DataOrigin S;
    public k201 T;
    public final s201 a;
    public final jtq0 b;
    public final yvf0 c;
    public final oel0 w;
    public final h3y x;
    public final h3y y;
    public final u201 z;

    /* JADX WARN: Multi-variable type inference failed */
    public e(s201 s201Var, jtq0 jtq0Var, yvf0 yvf0Var, oel0 oel0Var, h3y h3yVar, h3y h3yVar2, tt2 tt2Var, u201 u201Var) {
        this.a = s201Var;
        this.b = jtq0Var;
        this.c = yvf0Var;
        this.w = oel0Var;
        this.x = h3yVar;
        this.y = h3yVar2;
        this.z = u201Var;
        hbp0 hbp0Var = new hbp0(new ja5(tt2Var, 0), null, 0 == true ? 1 : 0, 6);
        hbp0Var.a();
        this.A = hbp0Var;
        tt2Var.getClass();
        this.B = uyj.a.P(1);
        this.D = new AtomicReference();
        this.E = new AtomicReference();
        this.F = bvf0.c(EmptyList.a);
        this.G = bvf0.c(i201.a);
        this.O = oby0.e;
        this.S = BaseSmoothMovementTracker$DataOrigin.ENDPOINT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0166, code lost:
    
        if (ru.yandex.taxi.map.utils.a.k(r1, r3.get(0)) <= 0.005d) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204 A[LOOP:0: B:85:0x016f->B:94:0x0204, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ae(e eVar, o201 o201Var) {
        h001 h001Var;
        Pair pair;
        double d;
        List<Point> list;
        int i;
        double k;
        double k2;
        hby0 hby0Var;
        hby0 hby0Var2;
        long j;
        TrackPoint$Remote$Source trackPoint$Remote$Source;
        String str;
        e eVar2 = eVar;
        eVar2.getClass();
        l201 l201Var = o201Var.d;
        BaseSmoothMovementTracker$DataOrigin baseSmoothMovementTracker$DataOrigin = eVar2.S;
        BaseSmoothMovementTracker$DataOrigin baseSmoothMovementTracker$DataOrigin2 = BaseSmoothMovementTracker$DataOrigin.WEBSOCKET;
        if (baseSmoothMovementTracker$DataOrigin == baseSmoothMovementTracker$DataOrigin2 && (l201Var instanceof j201) && (str = ((j201) l201Var).a) != null) {
            k201 k201Var = eVar2.T;
            if (!str.equals(k201Var != null ? k201Var.a : null)) {
                u201 u201Var = eVar2.z;
                if (u201Var != null) {
                    te51 te51Var = ((n) u201Var).f;
                    te51Var.getClass();
                    te51Var.a.a("XivaWs.TaxiRouteRouteId.Mismatched", new HashMap(), 1, new HashMap());
                }
                if (!eVar2.R) {
                    hbp0.e(eVar2.A, null, null, new BaseSmoothMovementTracker$forceLoadRouteOnce$1(eVar2, null), 3);
                }
            }
        }
        Object obj = o201Var.d;
        i201 i201Var = i201.a;
        if (jl40.l(obj, i201Var)) {
            eVar2.T = null;
        } else if (obj instanceof j201) {
            k201 k201Var2 = eVar2.T;
            obj = new j201(k201Var2 != null ? k201Var2.a : null, k201Var2 != null ? k201Var2.b : null);
        } else {
            if (!(obj instanceof k201)) {
                w511.b();
                return;
            }
            eVar2.T = (k201) obj;
        }
        Object obj2 = obj;
        p201 p201Var = o201Var.a;
        int i2 = 0;
        boolean z = (obj2.equals(i201Var) || p201Var.i == null || p201Var.h == null || p201Var.k == null) ? false : true;
        boolean z2 = obj2 instanceof k201;
        p201 p201Var2 = o201Var.a;
        zzs zzsVar = p201Var2.i;
        Double d2 = p201Var2.h;
        Date date = p201Var2.k;
        if (zzsVar == null || d2 == null || date == null) {
            h001Var = null;
        } else {
            double doubleValue = d2.doubleValue();
            Long valueOf = Long.valueOf(eVar2.b.d());
            int i3 = ka5.a[eVar2.S.ordinal()];
            if (i3 == 1) {
                trackPoint$Remote$Source = TrackPoint$Remote$Source.WEBSOCKET;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                trackPoint$Remote$Source = TrackPoint$Remote$Source.TAXIROUTE;
            }
            h001Var = new h001(zzsVar, doubleValue, date, valueOf, trackPoint$Remote$Source);
        }
        if (h001Var == null || !z || eVar2.S == baseSmoothMovementTracker$DataOrigin2) {
            List s5 = eVar2.s5();
            j001 j001Var = s5 != null ? (j001) kotlin.collections.a.Z(s5) : null;
            if (!z || j001Var == null || h001Var == null) {
                List list2 = o201Var.c;
                if (list2.isEmpty()) {
                    list2 = scc.h(h001Var);
                }
                pair = new Pair(list2, Boolean.FALSE);
            } else {
                DrivingRoute drivingRoute = eVar2.P;
                rel0 rel0Var = (rel0) eVar2.x.get();
                kl3 kl3Var = eVar2.O.c;
                BaseSmoothMovementTracker$resolveTrack$1 baseSmoothMovementTracker$resolveTrack$1 = new BaseSmoothMovementTracker$resolveTrack$1(1, eVar2, e.class, "reportCarTeleporting", "reportCarTeleporting(Lru/yandex/taxi/net/tracker/analytics/RouteTravelerCarTeleportedEvent;)V", 0);
                rel0Var.getClass();
                if (drivingRoute != null) {
                    Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                    Point d3 = cwa1.d(h001Var.a);
                    List<Point> points = drivingRoute.getGeometry().getPoints();
                    if (points.size() >= 2) {
                        double d4 = 0.005d;
                        if (points.size() != 1) {
                            int size = points.size() - 1;
                            while (i2 < size) {
                                Point point = points.get(i2);
                                i2++;
                                Point point2 = points.get(i2);
                                double longitude = point2.getLongitude() - point.getLongitude();
                                double latitude = point2.getLatitude() - point.getLatitude();
                                if (longitude == 0.0d && latitude == 0.0d) {
                                    k2 = ru.yandex.taxi.map.utils.a.k(d3, point);
                                } else {
                                    double latitude2 = (((d3.getLatitude() - point.getLatitude()) * latitude) + ((d3.getLongitude() - point.getLongitude()) * longitude)) / ((latitude * latitude) + (longitude * longitude));
                                    if (latitude2 < 0.0d) {
                                        k2 = ru.yandex.taxi.map.utils.a.k(d3, point);
                                    } else if (latitude2 > 1.0d) {
                                        k2 = ru.yandex.taxi.map.utils.a.k(d3, point2);
                                    } else {
                                        d = d4;
                                        double latitude3 = (latitude * latitude2) + point.getLatitude();
                                        double longitude2 = point.getLongitude();
                                        double d5 = latitude2 * longitude;
                                        list = points;
                                        i = size;
                                        k = ru.yandex.taxi.map.utils.a.k(d3, new Point(latitude3, d5 + longitude2));
                                        if (k <= d) {
                                            points = list;
                                            size = i;
                                            d4 = d;
                                        }
                                    }
                                }
                                list = points;
                                d = d4;
                                double d6 = k2;
                                i = size;
                                k = d6;
                                if (k <= d) {
                                }
                            }
                        }
                    }
                    if (!z2) {
                        pair = new Pair(Collections.singletonList(h001Var), Boolean.TRUE);
                    } else if (drivingRoute != null && h001Var.c.getTime() >= j001Var.getTimestamp().getTime()) {
                        fel0 fel0Var = (fel0) eVar2.y.get();
                        List<Point> points2 = drivingRoute.getGeometry().getPoints();
                        fel0Var.getClass();
                        pair = new Pair(kotlin.collections.a.q0(fel0.a(j001Var, h001Var, points2)), Boolean.FALSE);
                    } else {
                        List list3 = o201Var.c;
                        if (list3.isEmpty()) {
                            list3 = Collections.singletonList(h001Var);
                        }
                        pair = new Pair(list3, Boolean.FALSE);
                    }
                }
                rel0.a(j001Var.getCoordinates(), j001Var.getTimestamp().getTime(), h001Var.a, h001Var.c.getTime(), kl3Var, baseSmoothMovementTracker$resolveTrack$1);
                if (!z2) {
                }
            }
        } else {
            pair = new Pair(Collections.singletonList(h001Var), Boolean.FALSE);
        }
        List list4 = (List) pair.getFirst();
        if (((Boolean) pair.getSecond()).booleanValue()) {
            hby0Var2 = hby0.b;
        } else {
            if (!z) {
                hby0Var = null;
                if (!list4.isEmpty()) {
                    boolean z3 = o201Var.e;
                    String str2 = o201Var.g;
                    if (eVar2.C == null) {
                        ru.yandex.taxi.net.tracker.v2.a aVar = new ru.yandex.taxi.net.tracker.v2.a(list4, str2, eVar2.c, z3, eVar2, eVar2.O, eVar2.x);
                        eVar2 = eVar2;
                        eVar2.C = aVar;
                        aVar.p = eVar2.N;
                    }
                    ru.yandex.taxi.net.tracker.v2.a aVar2 = eVar2.C;
                    if (aVar2 == null) {
                        ny61.g("Required value was null.");
                        return;
                    }
                    aVar2.b(list4, o201Var.g, o201Var.e, hby0Var);
                }
                eVar2.D.set(o201Var.a);
                eVar2.E.set(o201Var.b);
                eVar2.F.l(list4);
                r0 r0Var = eVar2.G;
                r0Var.getClass();
                r0Var.m(null, obj2);
                eVar2.L = o201Var.e;
                j = o201Var.f;
                if (j <= 0) {
                    eVar2.M = j;
                    return;
                }
                return;
            }
            hby0Var2 = hby0.a;
        }
        hby0Var = hby0Var2;
        if (!list4.isEmpty()) {
        }
        eVar2.D.set(o201Var.a);
        eVar2.E.set(o201Var.b);
        eVar2.F.l(list4);
        r0 r0Var2 = eVar2.G;
        r0Var2.getClass();
        r0Var2.m(null, obj2);
        eVar2.L = o201Var.e;
        j = o201Var.f;
        if (j <= 0) {
        }
    }

    @Override // defpackage.way0
    public final boolean B0() {
        ru.yandex.taxi.net.tracker.v2.a aVar = this.C;
        return aVar != null ? aVar.s : this.L;
    }

    @Override // defpackage.kel0
    public final long Bc() {
        return this.b.d();
    }

    public final void Bg() {
        this.J = this.b.d();
        if (this.S == BaseSmoothMovementTracker$DataOrigin.WEBSOCKET) {
            return;
        }
        hbp0.e(this.A, null, null, new BaseSmoothMovementTracker$loadNewRoute$1(this, null), 3);
    }

    public final void Cg(BaseSmoothMovementTracker$DataOrigin baseSmoothMovementTracker$DataOrigin) {
        if (this.S != baseSmoothMovementTracker$DataOrigin) {
            hst hstVar = jst.e;
        }
        this.S = baseSmoothMovementTracker$DataOrigin;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Dg(ContinuationImpl continuationImpl) {
        BaseSmoothMovementTracker$startWebSocketConsumer$1 baseSmoothMovementTracker$startWebSocketConsumer$1;
        int i;
        boolean z;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof BaseSmoothMovementTracker$startWebSocketConsumer$1) {
            baseSmoothMovementTracker$startWebSocketConsumer$1 = (BaseSmoothMovementTracker$startWebSocketConsumer$1) continuationImpl;
            int i2 = baseSmoothMovementTracker$startWebSocketConsumer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseSmoothMovementTracker$startWebSocketConsumer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseSmoothMovementTracker$startWebSocketConsumer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseSmoothMovementTracker$startWebSocketConsumer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u201 u201Var = this.z;
                    if (u201Var == null) {
                        z = false;
                        if (z) {
                            Cg(BaseSmoothMovementTracker$DataOrigin.WEBSOCKET);
                            this.Q = hbp0.e(this.A, null, null, new BaseSmoothMovementTracker$startWebSocketConsumer$2(this, null), 3);
                            return zy11Var;
                        }
                        u201 u201Var2 = this.z;
                        if (u201Var2 != null) {
                            te51 te51Var = ((n) u201Var2).f;
                            XivaWsAnalytics$TaxiRoutePollingFallbackReason xivaWsAnalytics$TaxiRoutePollingFallbackReason = XivaWsAnalytics$TaxiRoutePollingFallbackReason.Experiment;
                            te51Var.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put(CRLReasonCodeExtension.REASON, xivaWsAnalytics$TaxiRoutePollingFallbackReason.getEventValue());
                            te51Var.a.a("XivaWs.TaxiRouteFallback.Started", hashMap, 1, new HashMap());
                        }
                        return zy11Var;
                    }
                    baseSmoothMovementTracker$startWebSocketConsumer$1.label = 1;
                    obj = ((n) u201Var).c(baseSmoothMovementTracker$startWebSocketConsumer$1);
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
                z = ((Boolean) obj).booleanValue();
                if (z) {
                }
            }
        }
        baseSmoothMovementTracker$startWebSocketConsumer$1 = new BaseSmoothMovementTracker$startWebSocketConsumer$1(this, continuationImpl);
        Object obj2 = baseSmoothMovementTracker$startWebSocketConsumer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseSmoothMovementTracker$startWebSocketConsumer$1.label;
        if (i != 0) {
        }
        z = ((Boolean) obj2).booleanValue();
        if (z) {
        }
    }

    @Override // defpackage.way0
    public boolean Hc() {
        return true;
    }

    @Override // defpackage.way0
    public final q201 I() {
        return (q201) this.E.get();
    }

    @Override // defpackage.kel0
    public final void M1(pel0 pel0Var) {
        int i = pel0Var.a;
        int i2 = pel0Var.b;
        nel0 nel0Var = pel0Var.c;
        mel0 mel0Var = pel0Var.d;
        oel0 oel0Var = this.w;
        oel0Var.getClass();
        HashMap hashMap = new HashMap();
        b64.B(i, hashMap, "distance_difference", i2, "time_difference");
        hashMap.put("start_location_coordinate", nel0Var.c);
        hashMap.put("end_location_coordinate", mel0Var.c);
        oel0Var.a.a("RouteTraveler.Car.Teleported", hashMap, 1, new HashMap());
    }

    @Override // defpackage.way0
    public tpr N3(oby0 oby0Var) {
        jst.e.getClass();
        this.O = oby0Var;
        this.M = 1000.0f;
        return kotlinx.coroutines.flow.e.F(new k(new kotlinx.coroutines.flow.n(new v(new b(com.yandex.go.coroutines.b.l(33L), this), new BaseSmoothMovementTracker$startTracking$2(2, null)), new BaseSmoothMovementTracker$startTracking$3(this, null)), new BaseSmoothMovementTracker$startTracking$4(this, null)), this.B);
    }

    @Override // defpackage.way0
    public final tpr Nb() {
        return kotlinx.coroutines.flow.e.d(this.G);
    }

    @Override // defpackage.way0
    public final p201 Q2() {
        return (p201) this.D.get();
    }

    @Override // defpackage.kel0
    public final void a7() {
        if (this.b.d() - this.J < this.M) {
            return;
        }
        Bg();
    }

    @Override // defpackage.way0
    public final h201 a8() {
        return this.H;
    }

    @Override // defpackage.way0
    public final boolean b9() {
        return true;
    }

    @Override // defpackage.way0
    public final void h() {
        jst.e.getClass();
        this.K = false;
        Cg(BaseSmoothMovementTracker$DataOrigin.ENDPOINT);
        pzt0 pzt0Var = this.Q;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.Q = null;
        this.A.b();
    }

    @Override // defpackage.way0
    public final tpr p6() {
        return new mth(kotlinx.coroutines.flow.e.d(this.F), 6);
    }

    @Override // defpackage.way0
    public final h201 q4() {
        ru.yandex.taxi.net.tracker.v2.a aVar = this.C;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public synchronized void reset() {
        try {
            jst.e.getClass();
            this.H = null;
            this.I = 0L;
            this.J = 0L;
            Cg(BaseSmoothMovementTracker$DataOrigin.ENDPOINT);
            this.R = false;
            pzt0 pzt0Var = this.Q;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.A.f();
            this.Q = null;
            this.C = null;
            this.D.set(null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.way0
    public final List s5() {
        ru.yandex.taxi.net.tracker.v2.a aVar = this.C;
        if (aVar != null) {
            return aVar.i.b;
        }
        return null;
    }
}
