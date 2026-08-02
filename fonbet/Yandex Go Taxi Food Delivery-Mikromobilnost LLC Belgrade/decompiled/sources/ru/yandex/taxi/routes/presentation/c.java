package ru.yandex.taxi.routes.presentation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.go.address.models.Address;
import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.TollRoad;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a4l0;
import defpackage.ah00;
import defpackage.b2l0;
import defpackage.b64;
import defpackage.bf60;
import defpackage.c0h0;
import defpackage.cv00;
import defpackage.d0l0;
import defpackage.d6w;
import defpackage.el00;
import defpackage.et00;
import defpackage.f1h0;
import defpackage.f4c0;
import defpackage.g6u;
import defpackage.hx1;
import defpackage.iqz0;
import defpackage.jst;
import defpackage.leh;
import defpackage.lgl0;
import defpackage.lr00;
import defpackage.nol0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.opz0;
import defpackage.q6l0;
import defpackage.qlm;
import defpackage.qqo;
import defpackage.r8;
import defpackage.rjt0;
import defpackage.scc;
import defpackage.sgu0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u0c0;
import defpackage.u8b1;
import defpackage.ugu0;
import defpackage.ulm;
import defpackage.uyj;
import defpackage.w4e0;
import defpackage.xm00;
import defpackage.y6i0;
import defpackage.zrz0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.maas.impl.ride.exitchoice.d;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.preorder.source.points.StopPointsProvider$StopPointPlace;

/* loaded from: classes6.dex */
public abstract class c extends r8 {
    public final cv00 A;
    public final sgu0 B;
    public final lr00 C;
    public final tt2 D;
    public final et00 E;
    public final opz0 F;
    public final qqo G;
    public final rjt0 H;
    public f4c0 I;
    public f4c0 J;
    public w4e0 K;
    public w4e0 L;
    public w4e0 M;
    public f4c0 N;
    public final u0c0 O;
    public final ImageProvider P;
    public final ImageProvider Q;
    public final ImageProvider R;
    public xm00 S;
    public final HashMap T;
    public final qlm U;
    public final xm00 c;
    public final leh w;
    public final b2l0 x;
    public final o y;
    public final el00 z;

    public c(ah00 ah00Var, Context context, xm00 xm00Var, leh lehVar, b2l0 b2l0Var, o oVar, el00 el00Var, cv00 cv00Var, sgu0 sgu0Var, lr00 lr00Var, tt2 tt2Var, et00 et00Var, opz0 opz0Var, iqz0 iqz0Var, qqo qqoVar, rjt0 rjt0Var) {
        super(5, ah00Var);
        this.c = xm00Var;
        this.w = lehVar;
        this.x = b2l0Var;
        this.y = oVar;
        this.z = el00Var;
        this.A = cv00Var;
        this.B = sgu0Var;
        this.C = lr00Var;
        this.D = tt2Var;
        this.E = et00Var;
        this.F = opz0Var;
        this.G = qqoVar;
        this.H = rjt0Var;
        this.O = u0c0.d;
        this.T = new HashMap();
        this.U = new qlm();
        Drawable drawable = context.getDrawable(f1h0.route_start_point);
        if (drawable != null) {
            this.Q = ImageProvider.fromBitmap(u8b1.g(drawable));
        }
        Drawable drawable2 = context.getDrawable(c0h0.ic_order_map_destination_pin);
        if (drawable2 != null) {
            this.R = ImageProvider.fromBitmap(u8b1.g(drawable2));
        }
        Drawable drawable3 = context.getDrawable(iqz0Var.a());
        if (drawable3 != null) {
            this.P = ImageProvider.fromBitmap(u8b1.g(drawable3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        if (r9.a(r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Hg(c cVar, d0l0 d0l0Var, Optional optional, ContinuationImpl continuationImpl) {
        CommonRouteOverlay$getRouteInfo$1 commonRouteOverlay$getRouteInfo$1;
        int i;
        Address h;
        cVar.getClass();
        if (continuationImpl instanceof CommonRouteOverlay$getRouteInfo$1) {
            commonRouteOverlay$getRouteInfo$1 = (CommonRouteOverlay$getRouteInfo$1) continuationImpl;
            int i2 = commonRouteOverlay$getRouteInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonRouteOverlay$getRouteInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonRouteOverlay$getRouteInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonRouteOverlay$getRouteInfo$1.label;
                Polyline polyline = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    el00 el00Var = cVar.z;
                    commonRouteOverlay$getRouteInfo$1.L$0 = d0l0Var;
                    commonRouteOverlay$getRouteInfo$1.L$1 = optional;
                    commonRouteOverlay$getRouteInfo$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    optional = (Optional) commonRouteOverlay$getRouteInfo$1.L$1;
                    d0l0Var = (d0l0) commonRouteOverlay$getRouteInfo$1.L$0;
                    kotlin.b.b(obj);
                }
                h = d0l0Var.h();
                List list = d0l0Var.b;
                if (h != null) {
                    return new lgl0(new a4l0(polyline, 15), null);
                }
                if (list.isEmpty()) {
                    return new lgl0(new a4l0(h.B()), null);
                }
                if (optional.isPresent()) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ru.yandex.taxi.map.utils.a.F(((Address) it.next()).B()));
                    }
                    return new lgl0(new a4l0(null, null, arrayList, (q6l0) optional.get()), null);
                }
                cVar.D.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                CommonRouteOverlay$getRouteInfo$3 commonRouteOverlay$getRouteInfo$3 = new CommonRouteOverlay$getRouteInfo$3(cVar, d0l0Var, null);
                commonRouteOverlay$getRouteInfo$1.L$0 = null;
                commonRouteOverlay$getRouteInfo$1.L$1 = null;
                commonRouteOverlay$getRouteInfo$1.L$2 = null;
                commonRouteOverlay$getRouteInfo$1.label = 2;
                Object k0 = tje.k0(g6uVar, commonRouteOverlay$getRouteInfo$3, commonRouteOverlay$getRouteInfo$1);
                return k0 == coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        commonRouteOverlay$getRouteInfo$1 = new CommonRouteOverlay$getRouteInfo$1(cVar, continuationImpl);
        Object obj2 = commonRouteOverlay$getRouteInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonRouteOverlay$getRouteInfo$1.label;
        Polyline polyline2 = null;
        if (i != 0) {
        }
        h = d0l0Var.h();
        List list3 = d0l0Var.b;
        if (h != null) {
        }
    }

    public boolean Ig() {
        return ((Boolean) this.G.b()).booleanValue();
    }

    public final void Jg() {
        w4e0 w4e0Var = this.L;
        if (w4e0Var != null) {
            Qg().o(w4e0Var);
        }
        this.L = null;
        w4e0 w4e0Var2 = this.M;
        if (w4e0Var2 != null) {
            Qg().o(w4e0Var2);
        }
        this.M = null;
        f4c0 f4c0Var = this.N;
        if (f4c0Var != null) {
            Qg().o(f4c0Var);
        }
        this.N = null;
    }

    public boolean Kg() {
        return !(this instanceof d);
    }

    public void Lg(lgl0 lgl0Var) {
        et00 et00Var;
        String str;
        DrivingRoute drivingRoute;
        a4l0 a4l0Var = lgl0Var.a;
        a4l0 a4l0Var2 = lgl0Var.b;
        DrivingRoute drivingRoute2 = a4l0Var.a;
        q6l0 q6l0Var = a4l0Var.d;
        Polyline a = a4l0Var.a();
        EmptyList emptyList = EmptyList.a;
        rjt0 rjt0Var = this.H;
        if (a == null) {
            rjt0Var.c(emptyList);
            jst.e.getClass();
            return;
        }
        List<Point> points = a.getPoints();
        List list = a4l0Var.c;
        if (list == null) {
            list = emptyList;
        }
        if (points.isEmpty()) {
            rjt0Var.c(emptyList);
            jst.e.getClass();
            return;
        }
        if (this.I == null) {
            this.I = Qg().r(points.get(0));
        }
        f4c0 f4c0Var = this.I;
        String str2 = "Required value was null.";
        if (f4c0Var == null) {
            ny61.g("Required value was null.");
            return;
        }
        ImageProvider imageProvider = this.Q;
        if (imageProvider != null) {
            f4c0Var.y(imageProvider);
        }
        if (points.size() < 2) {
            jst.e.getClass();
            rjt0Var.c(emptyList);
            return;
        }
        w4e0 w4e0Var = this.K;
        if (w4e0Var == null) {
            this.K = Qg().s(a);
        } else {
            w4e0Var.o(a);
        }
        w4e0 w4e0Var2 = this.K;
        if (w4e0Var2 == null) {
            ny61.g("Required value was null.");
            return;
        }
        w4e0Var2.k(1.0f);
        f4c0Var.k(2.0f);
        int size = points.size() - 1;
        w4e0 w4e0Var3 = this.K;
        if (w4e0Var3 != null) {
            if (q6l0Var != null) {
                this.x.b(w4e0Var3, q6l0Var.b, q6l0Var.c, q6l0Var.d, q6l0Var.f, q6l0Var.h);
            } else {
                this.w.getClass();
                boolean a2 = leh.a(this.y);
                b2l0 b2l0Var = this.x;
                if (a2) {
                    b2l0Var.a(w4e0Var3);
                    w4e0Var3.w(drivingRoute2 != null ? new nol0(drivingRoute2) : null);
                } else {
                    ((bf60) b2l0Var.a.getValue()).b(w4e0Var3, size);
                }
            }
        }
        et00 et00Var2 = this.E;
        if (q6l0Var != null) {
            et00Var2.d();
        } else {
            et00Var2.e();
        }
        HashMap hashMap = this.T;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            f4c0 f4c0Var2 = (f4c0) hashMap.get((Point) it.next());
            if (f4c0Var2 != null) {
                Qg().o(f4c0Var2);
            }
        }
        hashMap.clear();
        d6w n = y6i0.n(0, scc.f(list));
        int i = n.a;
        int i2 = n.b;
        if (i <= i2) {
            while (true) {
                Point point = (Point) list.get(i);
                f4c0 r = Qg().r(point);
                hashMap.put(point, r);
                et00Var = et00Var2;
                int i3 = i + 1;
                HashMap hashMap2 = hashMap;
                List list2 = list;
                str = str2;
                Bitmap b = ((ugu0) this.B).b(i3, this.O.c.a, true, StopPointsProvider$StopPointPlace.MAP);
                r.o(point);
                r.x(b);
                if (i == i2) {
                    break;
                }
                i = i3;
                et00Var2 = et00Var;
                hashMap = hashMap2;
                list = list2;
                str2 = str;
            }
        } else {
            et00Var = et00Var2;
            str = "Required value was null.";
        }
        if (Kg()) {
            f4c0 f4c0Var3 = this.J;
            if (f4c0Var3 == null) {
                this.J = Qg().r((Point) b64.c(1, points));
            } else {
                f4c0Var3.o(points.get(points.size() - 1));
            }
            f4c0 f4c0Var4 = this.J;
            if (f4c0Var4 != null) {
                ImageProvider imageProvider2 = this.R;
                if (imageProvider2 == null) {
                    ny61.g(str);
                    return;
                }
                f4c0Var4.y(imageProvider2);
            }
        }
        Jg();
        List<TollRoad> tollRoads = drivingRoute2 != null ? drivingRoute2.getTollRoads() : null;
        if (tollRoads != null && !tollRoads.isEmpty() && a4l0Var2 == null) {
            Mg(a4l0Var);
        } else if (a4l0Var2 != null) {
            q6l0 q6l0Var2 = a4l0Var2.d;
            Polyline a3 = a4l0Var2.a();
            if (a3 != null) {
                w4e0 w4e0Var4 = this.L;
                if (w4e0Var4 == null) {
                    this.L = Qg().s(a3);
                } else {
                    w4e0Var4.o(a3);
                }
                w4e0 w4e0Var5 = this.L;
                if (w4e0Var5 == null) {
                    ny61.g(str);
                    return;
                }
                w4e0Var5.k(0.0f);
                w4e0 w4e0Var6 = this.L;
                if (w4e0Var6 != null) {
                    b2l0 b2l0Var2 = this.x;
                    if (q6l0Var2 != null) {
                        b2l0Var2.b(w4e0Var6, q6l0Var2.b, q6l0Var2.c, q6l0Var2.d, q6l0Var2.f, q6l0Var2.h);
                    } else {
                        ((hx1) b2l0Var2.b.getValue()).a(w4e0Var6);
                    }
                }
                Mg(a4l0Var2);
                if (q6l0Var2 != null) {
                    et00Var.d();
                } else {
                    et00Var.e();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (drivingRoute2 != null) {
            arrayList.add(new ulm(drivingRoute2, q6l0Var));
        }
        if (a4l0Var2 != null && (drivingRoute = a4l0Var2.a) != null) {
            arrayList.add(new ulm(drivingRoute, a4l0Var2.d));
        }
        rjt0Var.c(arrayList);
    }

    public final void Mg(a4l0 a4l0Var) {
        List list;
        Point n;
        Polyline a = a4l0Var.a();
        if (a == null) {
            return;
        }
        w4e0 w4e0Var = this.M;
        if (w4e0Var == null) {
            this.M = Qg().s(a);
        } else {
            w4e0Var.o(a);
        }
        w4e0 w4e0Var2 = this.M;
        if (w4e0Var2 == null) {
            return;
        }
        DrivingRoute drivingRoute = a4l0Var.a;
        ArrayList<Subpolyline> arrayList = null;
        List<TollRoad> tollRoads = drivingRoute != null ? drivingRoute.getTollRoads() : null;
        if (tollRoads != null) {
            List<TollRoad> list2 = tollRoads;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TollRoad) it.next()).getPosition());
            }
            arrayList = arrayList2;
        }
        List<TollRoad> list3 = tollRoads;
        if (list3 == null || list3.isEmpty() || arrayList == null) {
            return;
        }
        int size = ((Polyline) w4e0Var2.h).getPoints().size() - 2;
        if (size < 0) {
            list = EmptyList.a;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Subpolyline subpolyline : arrayList) {
                arrayList3.add(new Subpolyline(new PolylinePosition(i, 0.0d), new PolylinePosition(subpolyline.getBegin().getSegmentIndex(), 1.0d)));
                i = subpolyline.getEnd().getSegmentIndex();
            }
            arrayList3.add(new Subpolyline(new PolylinePosition(i, 0.0d), new PolylinePosition(size, 1.0d)));
            list = arrayList3;
        }
        w4e0Var2.r(list);
        w4e0Var2.k(-1.0f);
        ((zrz0) this.x.f.getValue()).a(w4e0Var2);
        TollRoad tollRoad = (TollRoad) kotlin.collections.a.R(tollRoads);
        if (tollRoad != null) {
            List<Point> points = a.getPoints();
            int segmentIndex = tollRoad.getPosition().getBegin().getSegmentIndex();
            int segmentIndex2 = tollRoad.getPosition().getEnd().getSegmentIndex();
            Polyline g = (segmentIndex2 < segmentIndex || segmentIndex2 >= points.size()) ? k.g() : k.i(points.subList(segmentIndex, segmentIndex2));
            if (g == null || (n = ru.yandex.taxi.map.utils.a.n(g)) == null) {
                return;
            }
            if (this.N == null) {
                this.N = Qg().r(n);
            }
            f4c0 f4c0Var = this.N;
            if (f4c0Var != null) {
                f4c0Var.o(n);
                ImageProvider imageProvider = this.P;
                if (imageProvider != null) {
                    f4c0Var.y(imageProvider);
                }
                f4c0Var.k(2.0f);
            }
        }
    }

    public final m0 Ng() {
        return new m0(Og(), new b(((com.yandex.go.route.interactor.a) this.C).b()), new CommonRouteOverlay$getRoute$2(this, null));
    }

    public abstract tpr Og();

    public boolean Pg() {
        return this.F.d().getB();
    }

    public final xm00 Qg() {
        xm00 xm00Var = this.S;
        if (xm00Var != null) {
            return xm00Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public void attach() {
        xm00 xm00Var = this.S;
        if (xm00Var != null) {
            xm00Var.d();
        }
        this.S = this.c.p();
    }

    public void detach() {
        this.K = null;
        Jg();
        this.I = null;
        this.J = null;
        xm00 xm00Var = this.S;
        if (xm00Var != null) {
            xm00Var.d();
        }
        this.S = null;
    }
}
