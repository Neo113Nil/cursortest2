package ru.yandex.taxi.preorder.source.routeoverlay;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.Size;
import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.pin.api.widget.b;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Animation;
import com.yandex.go.taxi.summary.api.map.model.PointsVisiblePriority;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.TollRoad;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.ah00;
import defpackage.azi;
import defpackage.b2l0;
import defpackage.b8r;
import defpackage.bl00;
import defpackage.bzi;
import defpackage.c6l0;
import defpackage.cp10;
import defpackage.cvu0;
import defpackage.czo0;
import defpackage.d0l0;
import defpackage.d6l0;
import defpackage.d6z;
import defpackage.d82;
import defpackage.dfh0;
import defpackage.e1c0;
import defpackage.ep00;
import defpackage.et00;
import defpackage.f1h0;
import defpackage.f4c0;
import defpackage.fbz;
import defpackage.fnx0;
import defpackage.g700;
import defpackage.gh00;
import defpackage.gk00;
import defpackage.h3y;
import defpackage.h6l0;
import defpackage.hbm;
import defpackage.hbp0;
import defpackage.i6l0;
import defpackage.iik0;
import defpackage.is60;
import defpackage.iyb;
import defpackage.j0g;
import defpackage.j63;
import defpackage.j6l0;
import defpackage.j741;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jyb0;
import defpackage.jzi;
import defpackage.k6l0;
import defpackage.kb5;
import defpackage.kdd0;
import defpackage.kf00;
import defpackage.kt00;
import defpackage.kyh0;
import defpackage.lft0;
import defpackage.ljc;
import defpackage.m7x0;
import defpackage.mi31;
import defpackage.mjc;
import defpackage.ney;
import defpackage.ny61;
import defpackage.nyb0;
import defpackage.o190;
import defpackage.o6l0;
import defpackage.ob0;
import defpackage.oyb0;
import defpackage.oyr;
import defpackage.p0c0;
import defpackage.p190;
import defpackage.p6l0;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.q6l0;
import defpackage.qr00;
import defpackage.qv10;
import defpackage.r53;
import defpackage.r8;
import defpackage.rgu0;
import defpackage.rjt0;
import defpackage.roe;
import defpackage.ryb0;
import defpackage.s0c0;
import defpackage.scc;
import defpackage.sgu0;
import defpackage.soe;
import defpackage.sq00;
import defpackage.sxb0;
import defpackage.t3l0;
import defpackage.tac;
import defpackage.tcc;
import defpackage.tje;
import defpackage.toe;
import defpackage.tse;
import defpackage.u0c0;
import defpackage.u8b1;
import defpackage.ugu0;
import defpackage.ulm;
import defpackage.unr0;
import defpackage.uoe;
import defpackage.uxh;
import defpackage.vng;
import defpackage.vyi;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.wjm;
import defpackage.wxb0;
import defpackage.wyi;
import defpackage.xm00;
import defpackage.xq00;
import defpackage.xxb0;
import defpackage.yj2;
import defpackage.ylm;
import defpackage.yvf0;
import defpackage.zg21;
import defpackage.zlm;
import defpackage.zrz0;
import defpackage.zy11;
import defpackage.zzb0;
import defpackage.zzk0;
import defpackage.zzs;
import defpackage.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.analytics.SourceScreenAnalytics$TappedObject;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.wrap.MapObjectAccessibilityPlaceMarkView;
import ru.yandex.taxi.preorder.map.n;
import ru.yandex.taxi.preorder.source.points.RouteOverlayPlacemarkImageProvider$PlacemarkPointType;
import ru.yandex.taxi.preorder.source.points.StopPointsProvider$StopPointPlace;
import ru.yandex.taxi.preorder.source.routeoverlay.a;

/* loaded from: classes6.dex */
public final class a extends r8 implements d6l0 {
    public final ru.yandex.taxi.map_common.style.domain.a A;
    public tac A0;
    public final b2l0 B;
    public final hbp0 B0;
    public final ney C;
    public final toe D;
    public final kt00 E;
    public final rjt0 F;
    public final b G;
    public final f H;
    public final h3y I;
    public final ljc J;
    public final c6l0 K;
    public final ru.yandex.taxi.sdc.route.presentation.f L;
    public final qr00 M;
    public final oyb0 N;
    public final j O;
    public final ru.yandex.taxi.preorder.source.points.a P;
    public final kdd0 Q;
    public final ru.yandex.taxi.preorder.map.interactor.a R;
    public final nyb0 S;
    public final j0g T;
    public final Resources U;
    public final ArrayList V;
    public final ArrayList W;
    public final j741 Z;
    public final j741 a0;
    public final k6l0 b0;
    public final xm00 c;
    public lft0 c0;
    public pzt0 d0;
    public bl00 e0;
    public xm00 f0;
    public zlm g0;
    public xm00 h0;
    public f4c0 i0;
    public f4c0 j0;
    public f4c0 k0;
    public f4c0 l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public final HashMap t0;
    public final j6l0 u0;
    public cp10 v0;
    public final Context w;
    public final yj2 w0;
    public final n x;
    public final xq00 x0;
    public final tse y;
    public final xq00 y0;
    public final s0c0 z;
    public final xq00 z0;

    /* JADX WARN: Type inference failed for: r2v21, types: [k6l0] */
    public a(ah00 ah00Var, yvf0 yvf0Var, xm00 xm00Var, Context context, n nVar, tse tseVar, s0c0 s0c0Var, ru.yandex.taxi.map_common.style.domain.a aVar, b2l0 b2l0Var, ney neyVar, toe toeVar, kt00 kt00Var, rjt0 rjt0Var, b bVar, f fVar, h3y h3yVar, ljc ljcVar, c6l0 c6l0Var, ru.yandex.taxi.sdc.route.presentation.f fVar2, qr00 qr00Var, oyb0 oyb0Var, j jVar, ru.yandex.taxi.preorder.source.points.a aVar2, kdd0 kdd0Var, ru.yandex.taxi.preorder.map.interactor.a aVar3, nyb0 nyb0Var, j0g j0gVar) {
        super(5, ah00Var);
        this.c = xm00Var;
        this.w = context;
        this.x = nVar;
        this.y = tseVar;
        this.z = s0c0Var;
        this.A = aVar;
        this.B = b2l0Var;
        this.C = neyVar;
        this.D = toeVar;
        this.E = kt00Var;
        this.F = rjt0Var;
        this.G = bVar;
        this.H = fVar;
        this.I = h3yVar;
        this.J = ljcVar;
        this.K = c6l0Var;
        this.L = fVar2;
        this.M = qr00Var;
        this.N = oyb0Var;
        this.O = jVar;
        this.P = aVar2;
        this.Q = kdd0Var;
        this.R = aVar3;
        this.S = nyb0Var;
        this.T = j0gVar;
        this.U = context.getResources();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.Z = (j741) yvf0Var.get();
        this.a0 = (j741) yvf0Var.get();
        this.b0 = new zzv() { // from class: k6l0
            @Override // defpackage.zzv
            public final void c(Point point) {
                PointF pointF;
                lft0 lft0Var;
                a aVar4 = a.this;
                ah00 ah00Var2 = (ah00) aVar4.b;
                Resources resources = aVar4.U;
                f4c0 f4c0Var = aVar4.j0;
                if (f4c0Var == null || !f4c0Var.b) {
                    return;
                }
                IconStyle iconStyle = f4c0Var.m;
                if (iconStyle == null || (pointF = iconStyle.getAnchor()) == null) {
                    pointF = new PointF();
                }
                float dimension = resources.getDimension(wtg0.source_pin_width);
                gh00 gh00Var = (gh00) ah00Var2;
                ScreenPoint e = gh00Var.e.e(point);
                ScreenPoint e2 = gh00Var.e.e((Point) f4c0Var.h);
                if (e == null || e2 == null) {
                    return;
                }
                float f = -dimension;
                float x = e2.getX() + (pointF.x * f);
                float y = e2.getY() + (pointF.y * f);
                float dimension2 = (resources.getDimension(wtg0.source_pin_distance_start) * 2.0f) + y + dimension + dimension;
                double x2 = e.getX();
                double d = x + dimension;
                if (x - 1.0E-4d >= x2 || x2 >= d + 1.0E-4d) {
                    return;
                }
                double d2 = y;
                double y2 = e.getY();
                double d3 = dimension2;
                if (d2 - 1.0E-4d >= y2 || y2 >= d3 + 1.0E-4d || (lft0Var = aVar4.c0) == null) {
                    return;
                }
                lft0Var.h();
            }

            @Override // defpackage.zzv
            public final void d(Point point) {
            }
        };
        this.m0 = true;
        this.q0 = true;
        this.r0 = true;
        this.t0 = new HashMap();
        this.u0 = new j6l0(this, 1);
        this.w0 = new yj2();
        this.x0 = new xq00(0);
        this.y0 = new xq00(0);
        this.z0 = new xq00(0);
        this.B0 = new hbp0(new czo0(14), "", null);
    }

    public final void Hg() {
        TaxiMapView taxiMapView;
        j63 j63Var = this.w0.a;
        j63Var.getClass();
        r53 r53Var = new r53(j63Var);
        while (r53Var.hasNext()) {
            Animator animator = (Animator) r53Var.next();
            animator.removeAllListeners();
            animator.cancel();
        }
        xm00 xm00Var = this.f0;
        if (xm00Var != null) {
            this.x0.b = null;
            f4c0 f4c0Var = this.j0;
            if (f4c0Var != null) {
                PlacemarkAnimation placemarkAnimation = f4c0Var.l;
                if (placemarkAnimation != null) {
                    placemarkAnimation.stop();
                }
                f4c0Var.l = null;
            }
            this.y0.b = null;
            f4c0 f4c0Var2 = this.k0;
            if (f4c0Var2 != null) {
                PlacemarkAnimation placemarkAnimation2 = f4c0Var2.l;
                if (placemarkAnimation2 != null) {
                    placemarkAnimation2.stop();
                }
                f4c0Var2.l = null;
            }
            this.z0.b = null;
            Ig(0);
            this.c.o(xm00Var);
            this.f0 = null;
            this.h0 = null;
            this.j0 = null;
            this.k0 = null;
            this.l0 = null;
            this.i0 = null;
            ((gh00) ((ah00) this.b)).t(this.b0);
        }
        nyb0 nyb0Var = this.S;
        nyb0Var.b();
        nyb0Var.c.b = null;
        f4c0 f4c0Var3 = nyb0Var.e;
        if (f4c0Var3 != null) {
            f4c0Var3.d();
        }
        f4c0 f4c0Var4 = nyb0Var.f;
        if (f4c0Var4 != null) {
            f4c0Var4.d();
        }
        nyb0Var.d = null;
        nyb0Var.e = null;
        nyb0Var.f = null;
        wyi wyiVar = (wyi) this.T.a;
        f4c0 f4c0Var5 = wyiVar.d;
        if (f4c0Var5 != null && (taxiMapView = wyiVar.b) != null) {
            f4c0Var5.u(taxiMapView);
        }
        wyiVar.b = null;
        Kg();
        Jg();
        this.g0 = null;
    }

    public final void Ig(int i) {
        ArrayList arrayList = this.W;
        int size = arrayList.size() - 1;
        if (i > size) {
            return;
        }
        while (true) {
            ((f4c0) arrayList.get(size)).d();
            arrayList.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public final void Jg() {
        HashMap hashMap = this.t0;
        for (p190 p190Var : hashMap.values()) {
            p190Var.n = null;
            w4e0 w4e0Var = p190Var.k;
            if (w4e0Var != null) {
                p190Var.a.o(w4e0Var);
                p190Var.k = null;
                p190Var.l = null;
            }
            xm00 xm00Var = p190Var.s;
            if (xm00Var != null) {
                xm00Var.m();
            }
            p190Var.j.cancel();
            ValueAnimator valueAnimator = p190Var.g.c;
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        hashMap.clear();
        this.F.c(EmptyList.a);
    }

    public final void Kg() {
        ((c) this.Z).a();
        ((c) this.a0).a();
    }

    public final void Lg() {
        ah00 ah00Var = (ah00) this.b;
        if (this.f0 == null) {
            Point point = new Point(0.0d, 0.0d);
            xm00 p = this.c.p();
            this.f0 = p;
            p.i(this.m0);
            p.k(20.0f);
            this.h0 = p.p();
            f4c0 r = p.r(point);
            this.j0 = r;
            r.i(false);
            r.g(this.u0);
            this.x0.b = r;
            f4c0 r2 = p.r(point);
            this.k0 = r2;
            this.y0.b = r2;
            f4c0 r3 = p.r(point);
            this.l0 = r3;
            r3.i(false);
            r3.g(new j6l0(this, 0));
            this.z0.b = r3;
            gh00 gh00Var = (gh00) ah00Var;
            gh00Var.d(this.b0);
            TaxiMapView h = gh00Var.h();
            if (h != null) {
                nyb0 nyb0Var = this.S;
                jyb0 jyb0Var = nyb0Var.c;
                if (tje.J(jyb0Var.a)) {
                    jyb0Var.b = h;
                }
                Point point2 = new Point(0.0d, 0.0d);
                nyb0Var.d = r;
                nyb0Var.e = p.r(point2);
                nyb0Var.f = p.r(point2);
                nyb0Var.d(false);
                this.T.c(h);
                Tg();
            }
        }
    }

    public final void Mg() {
        f4c0 f4c0Var;
        f4c0 f4c0Var2;
        f4c0 f4c0Var3;
        Lg();
        this.i0 = null;
        ArrayList arrayList = this.V;
        int i = 0;
        if (arrayList.isEmpty()) {
            Ig(0);
            return;
        }
        xm00 xm00Var = this.h0;
        if (xm00Var == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzs zzsVar = (zzs) it.next();
            ArrayList arrayList2 = this.W;
            if (i < arrayList2.size()) {
                f4c0Var3 = (f4c0) arrayList2.get(i);
                f4c0Var3.o(ru.yandex.taxi.map.utils.a.F(zzsVar));
            } else {
                f4c0 r = xm00Var.r(ru.yandex.taxi.map.utils.a.F(zzsVar));
                arrayList2.add(r);
                f4c0Var3 = r;
            }
            Ug(f4c0Var3, i);
            i++;
        }
        Ig(i);
        Ng();
        Lg();
        if (arrayList.size() > 1 && (f4c0Var = this.k0) != null) {
            Point F = ru.yandex.taxi.map.utils.a.F((zzs) kotlin.collections.a.Z(arrayList));
            if (!ru.yandex.taxi.map.utils.a.y(F, (Point) f4c0Var.h) && (f4c0Var2 = this.k0) != null) {
                f4c0Var2.o(F);
            }
            int size = arrayList.size() - 2;
            Tg();
            f4c0Var.g(new h6l0(this, size, 1));
        }
    }

    public final void Ng() {
        f4c0 f4c0Var;
        Lg();
        xm00 xm00Var = this.f0;
        ArrayList arrayList = this.V;
        qv10.B(xm00Var != null && xm00Var.b && this.o0 && this.n0 && !arrayList.isEmpty(), this.x.r, null);
        f4c0 f4c0Var2 = this.i0;
        if (f4c0Var2 != null) {
            f4c0Var2.i(this.o0 && !arrayList.isEmpty());
        }
        if (arrayList.isEmpty() || (f4c0Var = this.j0) == null) {
            return;
        }
        Point F = ru.yandex.taxi.map.utils.a.F((zzs) arrayList.get(0));
        if (ru.yandex.taxi.map.utils.a.y(F, (Point) f4c0Var.h)) {
            return;
        }
        f4c0 f4c0Var3 = this.j0;
        if (f4c0Var3 != null) {
            f4c0Var3.o(F);
        }
        nyb0 nyb0Var = this.S;
        f4c0 f4c0Var4 = nyb0Var.e;
        if (f4c0Var4 != null) {
            f4c0Var4.o(F);
        }
        f4c0 f4c0Var5 = nyb0Var.f;
        if (f4c0Var5 != null) {
            f4c0Var5.o(F);
        }
        nyb0Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Og(float f) {
        f4c0 f4c0Var;
        j jVar;
        mjc mjcVar;
        pex0 m;
        String str;
        pex0 pex0Var;
        is60 is60Var;
        List list;
        Iterator it;
        Object obj;
        ServiceLevel.Branding branding;
        Float f2;
        gh00 gh00Var = (gh00) ((ah00) this.b);
        wjm i = gh00Var.i();
        f4c0 f4c0Var2 = this.j0;
        boolean z = f4c0Var2 != null && i.f((Point) f4c0Var2.h);
        f4c0 f4c0Var3 = this.k0;
        boolean z2 = f4c0Var3 != null && i.f((Point) f4c0Var3.h);
        n nVar = this.x;
        r0 r0Var = nVar.v;
        r0 r0Var2 = nVar.u;
        iyb iybVar = (iyb) nVar.J.a.getValue();
        float floatValue = (iybVar == null || (f2 = iybVar.a) == null) ? 0.0f : f2.floatValue();
        if (iybVar != null) {
            PointsVisiblePriority pointsVisiblePriority = iybVar.b;
            if (f >= floatValue) {
                if (z && z2) {
                    PointsVisiblePriority pointsVisiblePriority2 = PointsVisiblePriority.BOTH;
                    qv10.B(pointsVisiblePriority == pointsVisiblePriority2 || pointsVisiblePriority == PointsVisiblePriority.SOURCE, r0Var2, null);
                    qv10.B(pointsVisiblePriority == pointsVisiblePriority2 || pointsVisiblePriority == PointsVisiblePriority.DESTINATION, r0Var, null);
                } else {
                    Boolean bool = Boolean.TRUE;
                    r0Var2.getClass();
                    r0Var2.m(null, bool);
                    r0Var.getClass();
                    r0Var.m(null, bool);
                }
                VisibleRegion a = gh00Var.e.a();
                BoundingBox boundingBox = new BoundingBox(a.getBottomLeft(), a.getTopRight());
                f4c0Var = this.l0;
                if (f4c0Var != null && f4c0Var.k != null && ru.yandex.taxi.map.utils.a.t(boundingBox, (Point) f4c0Var.h)) {
                    mjcVar = (mjc) this.J;
                    m = ((k) mjcVar.c).m();
                    if (m != null && (list = m.S) != null) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (((ServiceLevel.Branding) obj).c == ServiceLevel.Branding.Type.COMBO_INNER_PIN) {
                                    break;
                                }
                            }
                        }
                        branding = (ServiceLevel.Branding) obj;
                        if (branding != null) {
                            str = branding.e;
                            mi31 d = b8r.d(mjcVar.d, "combo", null, 6);
                            String a2 = (d != null || (pex0Var = d.a) == null || (is60Var = pex0Var.J0.b) == null) ? null : is60Var.a();
                            if (!mjcVar.e) {
                                kf00 kf00Var = (kf00) mjcVar.a.b;
                                HashMap A = oyr.A(kf00Var);
                                if (a2 != null) {
                                    A.put("offer_id", a2);
                                }
                                if (str != null) {
                                    A.put("title", str);
                                }
                                kf00Var.a.a("Map.ComboBubble.Shown", A, 1, new HashMap());
                                mjcVar.e = true;
                            }
                        }
                    }
                    str = null;
                    mi31 d2 = b8r.d(mjcVar.d, "combo", null, 6);
                    if (d2 != null) {
                    }
                    if (!mjcVar.e) {
                    }
                }
                jVar = this.O;
                if (jl40.l(jVar.j.a(), ryb0.a)) {
                    r0 r0Var3 = jVar.l.d;
                    Float valueOf = Float.valueOf(f);
                    r0Var3.getClass();
                    r0Var3.m(null, valueOf);
                    return;
                }
                return;
            }
        }
        Boolean bool2 = Boolean.FALSE;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
        r0Var.getClass();
        r0Var.m(null, bool2);
        VisibleRegion a3 = gh00Var.e.a();
        BoundingBox boundingBox2 = new BoundingBox(a3.getBottomLeft(), a3.getTopRight());
        f4c0Var = this.l0;
        if (f4c0Var != null) {
            mjcVar = (mjc) this.J;
            m = ((k) mjcVar.c).m();
            if (m != null) {
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                branding = (ServiceLevel.Branding) obj;
                if (branding != null) {
                }
            }
            str = null;
            mi31 d22 = b8r.d(mjcVar.d, "combo", null, 6);
            if (d22 != null) {
            }
            if (!mjcVar.e) {
            }
        }
        jVar = this.O;
        if (jl40.l(jVar.j.a(), ryb0.a)) {
        }
    }

    public final void Pg(t3l0 t3l0Var, f4c0 f4c0Var) {
        boolean b = t3l0Var.b();
        gk00 gk00Var = t3l0Var.b;
        f4c0Var.i(b);
        bl00 bl00Var = t3l0Var.a;
        if (bl00Var != null) {
            f4c0Var.z(bl00Var.a, bl00Var.b);
            Tg();
            return;
        }
        if (gk00Var == null) {
            PlacemarkAnimation placemarkAnimation = f4c0Var.l;
            if (placemarkAnimation != null) {
                placemarkAnimation.stop();
            }
            f4c0Var.l = null;
            return;
        }
        f4c0Var.B(gk00Var.a);
        f4c0Var.D(gk00Var.b);
        PlacemarkAnimation placemarkAnimation2 = f4c0Var.l;
        if (placemarkAnimation2 != null) {
            placemarkAnimation2.play();
        }
        Tg();
    }

    public final void Qg(t3l0 t3l0Var, t3l0 t3l0Var2, f4c0 f4c0Var, xq00 xq00Var) {
        if (f4c0Var == null) {
            return;
        }
        boolean z = false;
        boolean z2 = t3l0Var != null && t3l0Var.c == t3l0Var2.c;
        if (t3l0Var != null && t3l0Var.b() && t3l0Var2.b()) {
            z = true;
        }
        if (t3l0Var == null || (z && z2)) {
            Pg(t3l0Var2, f4c0Var);
            f4c0Var.i(t3l0Var2.b());
            return;
        }
        xq00Var.b();
        boolean a = t3l0Var2.a();
        yj2 yj2Var = this.w0;
        if (a) {
            xq00Var.f(new i6l0(this, t3l0Var2, f4c0Var, 2));
            xq00Var.c().start();
            yj2Var.a(xq00Var.c());
        } else if (t3l0Var.a()) {
            Sg(t3l0Var2, f4c0Var, xq00Var);
        } else {
            xq00Var.f(new i6l0(this, t3l0Var2, f4c0Var, 1));
            xq00Var.e(yj2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x044f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Rg(zlm zlmVar, boolean z) {
        boolean z2;
        Polyline a;
        ArrayList arrayList;
        boolean z3;
        a aVar;
        ArrayList arrayList2;
        ylm ylmVar;
        d0l0 d0l0Var;
        ArrayList arrayList3;
        rjt0 rjt0Var;
        Iterator it;
        EmptyList emptyList;
        List<Point> list;
        Polyline a2;
        Object obj;
        String str;
        CopterOrderFlowExperiment.RoutePointSettings.RoutePoint routePoint;
        Point n;
        f4c0 f4c0Var;
        d0l0 d0l0Var2;
        a aVar2 = this;
        zlm zlmVar2 = aVar2.g0;
        HashMap hashMap = aVar2.t0;
        if (zlmVar2 != null && (d0l0Var2 = zlmVar2.a) != null && d0l0Var2.g(zlmVar.a)) {
            ArrayList b = zlmVar.b();
            if (hashMap.size() == b.size()) {
                Iterator it2 = b.iterator();
                while (it2.hasNext()) {
                    ylm ylmVar2 = (ylm) it2.next();
                    p190 p190Var = (p190) hashMap.get(ylmVar2.b.getRouteId());
                    if (p190Var != null) {
                        ylm ylmVar3 = p190Var.n;
                        if ((ylmVar3 != null ? ylmVar3.g : null) != ylmVar2.g) {
                        }
                    }
                }
                z2 = false;
                aVar2.g0 = zlmVar;
                aVar2.Lg();
                aVar2.Lg();
                zlm zlmVar3 = aVar2.g0;
                a = zlmVar3 == null ? zlmVar3.a() : null;
                arrayList = aVar2.V;
                if (arrayList.size() > 1 && a != null && !a.getPoints().isEmpty()) {
                    n = ru.yandex.taxi.map.utils.a.n(a);
                    f4c0 f4c0Var2 = aVar2.l0;
                    Point point = f4c0Var2 == null ? (Point) f4c0Var2.h : null;
                    if (n != null && point != null && !ru.yandex.taxi.map.utils.a.y(n, point) && (f4c0Var = aVar2.l0) != null) {
                        f4c0Var.o(n);
                    }
                }
                z3 = zlmVar.c;
                d0l0 d0l0Var3 = zlmVar.a;
                boolean z4 = !z3;
                aVar2.q0 = z4;
                aVar2.r0 = z4;
                if (z3) {
                    aVar2.s0 = false;
                } else {
                    aVar2.s0 = true;
                    uoe uoeVar = (uoe) aVar2.D;
                    roe roeVar = uoeVar.a;
                    pex0 m = ((k) uoeVar.b).m();
                    String str2 = m != null ? m.b : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Iterator it3 = roeVar.a().e.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it3.next();
                            if (jl40.l(((CopterOrderFlowExperiment.RoutePointSettings) obj).a, str2)) {
                                break;
                            }
                        }
                    }
                    CopterOrderFlowExperiment.RoutePointSettings routePointSettings = (CopterOrderFlowExperiment.RoutePointSettings) obj;
                    CopterOrderFlowExperiment.RoutePointSettings.RoutePoint.Pin pin = (routePointSettings == null || (routePoint = routePointSettings.d) == null) ? null : routePoint.b;
                    if (pin == null || (str = pin.c) == null || str.length() == 0) {
                        str = null;
                    }
                    String Y = (pin != null ? pin.a : null) != null ? d6z.Y(roeVar.a(), pin.a) : null;
                    if (Y == null) {
                        Y = "";
                    }
                    String Y2 = (pin != null ? pin.b : null) != null ? d6z.Y(roeVar.a(), pin.b) : null;
                    soe soeVar = (soe) kotlin.collections.a.R(Collections.singletonList(new soe(str, Y, Y2 != null ? Y2 : "")));
                    if (soeVar != null) {
                        p0c0 p0c0Var = ((u0c0) aVar2.Q.d).c;
                        String str3 = soeVar.a;
                        String str4 = soeVar.b;
                        String str5 = soeVar.c;
                        sq00 sq00Var = new sq00(p0c0Var, zzb0.a, true, null, str3, str4, str5, false, !(str5.length() == 0), null, null, 0.0f, 7680);
                        pzt0 pzt0Var = aVar2.d0;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        aVar2.d0 = tje.N(aVar2.y, null, null, new RouteOverlayImplV1$fetchIntermediatePointPinImage$1(aVar2, sq00Var, null), 3);
                    }
                }
                int i = 2;
                if (aVar2.L.a()) {
                    rjt0 rjt0Var2 = aVar2.F;
                    if (z2) {
                        aVar2.Jg();
                        ArrayList b2 = zlmVar.b();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = b2.iterator();
                        while (it4.hasNext()) {
                            ylm ylmVar4 = (ylm) it4.next();
                            xm00 xm00Var = aVar2.f0;
                            if (xm00Var == null) {
                                ny61.g("Required value was null.");
                                return;
                            }
                            lft0 lft0Var = aVar2.c0;
                            et00 et00Var = (et00) aVar2.I.get();
                            qr00 qr00Var = aVar2.M;
                            yj2 yj2Var = aVar2.w0;
                            b2l0 b2l0Var = aVar2.B;
                            Context context = aVar2.w;
                            p190 p190Var2 = new p190(xm00Var, yj2Var, b2l0Var, lft0Var, context, et00Var, qr00Var);
                            p190Var2.n = ylmVar4;
                            Polyline a3 = ylmVar4.a();
                            DrivingRoute drivingRoute = ylmVar4.b;
                            q6l0 q6l0Var = ylmVar4.g;
                            if (a3.getPoints().size() >= i) {
                                w4e0 s = xm00Var.s(a3);
                                p190Var2.k = s;
                                p190Var2.l = null;
                                s.g(new ep00(p190Var2, SourceScreenAnalytics$TappedObject.ROUTE));
                                w4e0 w4e0Var = p190Var2.k;
                                if (w4e0Var != null) {
                                    w4e0Var.k(-1.0f);
                                }
                            }
                            rjt0 rjt0Var3 = rjt0Var2;
                            if (ylmVar4.e) {
                                int i2 = p190Var2.r;
                                ylmVar = ylmVar4;
                                int i3 = ylmVar.f;
                                if (i2 != i3) {
                                    p190Var2.r = i3;
                                    Drawable t = vng.t(i3, context);
                                    p190Var2.p = t != null ? ImageProvider.fromBitmap(u8b1.g(t)) : null;
                                }
                                ylm ylmVar5 = p190Var2.n;
                                if (ylmVar5 != null) {
                                    String str6 = ylmVar5.d;
                                    DrivingRoute drivingRoute2 = ylmVar5.b;
                                    if (!drivingRoute2.getTollRoads().isEmpty() && ylmVar5.g == null) {
                                        Polyline a4 = ylmVar5.a();
                                        if (a4.getPoints().size() >= 2) {
                                            p190Var2.b();
                                            List<TollRoad> tollRoads = drivingRoute2.getTollRoads();
                                            xm00 xm00Var2 = p190Var2.s;
                                            EmptyList emptyList2 = EmptyList.a;
                                            if (xm00Var2 == null) {
                                                it = it4;
                                                arrayList3 = arrayList;
                                                d0l0Var = d0l0Var3;
                                                rjt0Var = rjt0Var3;
                                            } else {
                                                List<TollRoad> list2 = tollRoads;
                                                it = it4;
                                                rjt0Var = rjt0Var3;
                                                ArrayList arrayList5 = new ArrayList(tcc.n(list2, 10));
                                                Iterator<T> it5 = list2.iterator();
                                                while (it5.hasNext()) {
                                                    arrayList5.add(((TollRoad) it5.next()).getPosition());
                                                }
                                                w4e0 s2 = xm00Var2.s(a4);
                                                s2.k(-1.2f);
                                                int size = a4.getPoints().size() - 2;
                                                if (size < 0) {
                                                    arrayList3 = arrayList;
                                                    d0l0Var = d0l0Var3;
                                                    emptyList = emptyList2;
                                                } else {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Iterator it6 = arrayList5.iterator();
                                                    int i4 = 0;
                                                    while (it6.hasNext()) {
                                                        Subpolyline subpolyline = (Subpolyline) it6.next();
                                                        arrayList6.add(new Subpolyline(new PolylinePosition(i4, 0.0d), new PolylinePosition(subpolyline.getBegin().getSegmentIndex(), 1.0d)));
                                                        i4 = subpolyline.getEnd().getSegmentIndex();
                                                        arrayList = arrayList;
                                                        it6 = it6;
                                                        d0l0Var3 = d0l0Var3;
                                                    }
                                                    arrayList3 = arrayList;
                                                    d0l0Var = d0l0Var3;
                                                    arrayList6.add(new Subpolyline(new PolylinePosition(i4, 0.0d), new PolylinePosition(size, 1.0d)));
                                                    emptyList = arrayList6;
                                                }
                                                s2.r(emptyList);
                                                ((zrz0) p190Var2.c.f.getValue()).a(s2);
                                                p190Var2.l = s2;
                                            }
                                            TollRoad tollRoad = tollRoads.get(0);
                                            int segmentIndex = tollRoad.getPosition().getBegin().getSegmentIndex();
                                            int segmentIndex2 = tollRoad.getPosition().getEnd().getSegmentIndex();
                                            ylm ylmVar6 = p190Var2.n;
                                            if (ylmVar6 == null || (a2 = ylmVar6.a()) == null || (list = a2.getPoints()) == null) {
                                                list = emptyList2;
                                            }
                                            Polyline g = (segmentIndex2 < segmentIndex || segmentIndex2 >= list.size()) ? ru.yandex.taxi.map_common.map.k.g() : ru.yandex.taxi.map_common.map.k.i(list.subList(segmentIndex, segmentIndex2));
                                            if (g != null) {
                                                Point n2 = ru.yandex.taxi.map.utils.a.n(g);
                                                if (n2 != null) {
                                                    p190Var2.b();
                                                    xm00 xm00Var3 = p190Var2.s;
                                                    if (xm00Var3 != null) {
                                                        f4c0 r = xm00Var3.r(n2);
                                                        r.k(-0.9f);
                                                        ImageProvider imageProvider = p190Var2.p;
                                                        if (imageProvider != null) {
                                                            r.y(imageProvider);
                                                        }
                                                    }
                                                    xm00 xm00Var4 = p190Var2.s;
                                                    if (xm00Var4 != null) {
                                                        f4c0 r2 = xm00Var4.r(n2);
                                                        p190Var2.m = r2;
                                                        r2.k(-0.9f);
                                                        f4c0 f4c0Var3 = p190Var2.m;
                                                        if (f4c0Var3 != null) {
                                                            f4c0Var3.g(new ep00(p190Var2, SourceScreenAnalytics$TappedObject.BUBBLE));
                                                        }
                                                    }
                                                    if (str6 != null && str6.length() != 0) {
                                                        p190Var2.c(str6);
                                                    }
                                                }
                                                xm00 xm00Var5 = p190Var2.s;
                                                if (xm00Var5 != null) {
                                                    xm00Var5.i(false);
                                                }
                                            }
                                            p190Var2.d(ylmVar);
                                            if (!z) {
                                                w4e0 w4e0Var2 = p190Var2.k;
                                                ValueAnimator valueAnimator = p190Var2.j;
                                                if (w4e0Var2 != null) {
                                                    int size2 = ((Polyline) w4e0Var2.h).getPoints().size();
                                                    PolylinePosition polylinePosition = new PolylinePosition(size2 - 2, 1.0d);
                                                    p190Var2.o = polylinePosition;
                                                    w4e0Var2.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), polylinePosition)));
                                                    valueAnimator.setIntValues(0, size2 - 1);
                                                    p190Var2.q = 0;
                                                }
                                                MapRouteAppearance$Animation mapRouteAppearance$Animation = q6l0Var != null ? q6l0Var.e : null;
                                                TimeInterpolator timeInterpolator = p190Var2.h;
                                                if (mapRouteAppearance$Animation != null) {
                                                    valueAnimator.setDuration(mapRouteAppearance$Animation.b);
                                                    int i5 = o190.b[mapRouteAppearance$Animation.a.ordinal()];
                                                    if (i5 == 1) {
                                                        timeInterpolator = p190Var2.i;
                                                    } else if (i5 != 2) {
                                                        w511.b();
                                                        return;
                                                    }
                                                    valueAnimator.setInterpolator(timeInterpolator);
                                                } else {
                                                    valueAnimator.setDuration(OperationProgressView.ROTATION_ANIMATION_DURATION);
                                                    valueAnimator.setInterpolator(timeInterpolator);
                                                }
                                                valueAnimator.start();
                                                p190Var2.b.a(valueAnimator);
                                            }
                                            hashMap.put(drivingRoute.getRouteId(), p190Var2);
                                            arrayList4.add(new ulm(drivingRoute, q6l0Var));
                                            it4 = it;
                                            rjt0Var2 = rjt0Var;
                                            arrayList = arrayList3;
                                            d0l0Var3 = d0l0Var;
                                            i = 2;
                                            aVar2 = this;
                                        }
                                    }
                                }
                            } else {
                                ylmVar = ylmVar4;
                            }
                            it = it4;
                            arrayList3 = arrayList;
                            d0l0Var = d0l0Var3;
                            rjt0Var = rjt0Var3;
                            p190Var2.d(ylmVar);
                            if (!z) {
                            }
                            hashMap.put(drivingRoute.getRouteId(), p190Var2);
                            arrayList4.add(new ulm(drivingRoute, q6l0Var));
                            it4 = it;
                            rjt0Var2 = rjt0Var;
                            arrayList = arrayList3;
                            d0l0Var3 = d0l0Var;
                            i = 2;
                            aVar2 = this;
                        }
                        rjt0 rjt0Var4 = rjt0Var2;
                        ArrayList arrayList7 = arrayList;
                        zzk0 zzk0Var = d0l0.Companion;
                        List d = d0l0Var3.d(false, false);
                        arrayList7.clear();
                        arrayList2 = arrayList7;
                        arrayList2.addAll(d);
                        Mg();
                        aVar = this;
                        zlm zlmVar4 = aVar.g0;
                        if (zlmVar4 != null) {
                            Iterator it7 = zlmVar4.b().iterator();
                            while (it7.hasNext()) {
                                if (!((ylm) it7.next()).b.getTollRoads().isEmpty()) {
                                    aVar.p0 = true;
                                    break;
                                }
                            }
                        }
                        aVar.p0 = false;
                        aVar.x.I.g(zy11.a);
                        rjt0Var4.c(arrayList4);
                    } else {
                        aVar = aVar2;
                        arrayList2 = arrayList;
                        ArrayList b3 = zlmVar.b();
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it8 = b3.iterator();
                        while (it8.hasNext()) {
                            ylm ylmVar7 = (ylm) it8.next();
                            p190 p190Var3 = (p190) hashMap.get(ylmVar7.b.getRouteId());
                            if (p190Var3 != null) {
                                p190Var3.d(ylmVar7);
                                arrayList8.add(new ulm(ylmVar7.b, ylmVar7.g));
                            } else {
                                unr0.z(jst.e, "no overlayRouteHolder but expected");
                            }
                        }
                        rjt0Var2.c(arrayList8);
                    }
                } else {
                    aVar = aVar2;
                    arrayList2 = arrayList;
                    zzk0 zzk0Var2 = d0l0.Companion;
                    List d2 = d0l0Var3.d(false, false);
                    arrayList2.clear();
                    arrayList2.addAll(d2);
                    aVar.Mg();
                }
                if (aVar.r0) {
                    aVar.Kg();
                    return;
                }
                zlm zlmVar5 = aVar.g0;
                if (zlmVar5 == null) {
                    aVar.Kg();
                    return;
                }
                Polyline a5 = zlmVar5.a();
                List<Point> points = a5 != null ? a5.getPoints() : null;
                if (points == null || points.size() < 3) {
                    aVar.Kg();
                    return;
                }
                if (arrayList2.size() < 2) {
                    aVar.Kg();
                    return;
                }
                WalkingRouteUiState walkingRouteUiState = new WalkingRouteUiState(scc.g(ru.yandex.taxi.map.utils.a.F((zzs) arrayList2.get(0)), points.get(0)), null, 0.0f, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD);
                c cVar = (c) aVar.Z;
                cVar.d(walkingRouteUiState);
                cVar.c(aVar.m0);
                WalkingRouteUiState walkingRouteUiState2 = new WalkingRouteUiState(scc.g(ru.yandex.taxi.map.utils.a.F((zzs) kotlin.collections.a.Z(arrayList2)), kotlin.collections.a.Z(points)), null, 0.0f, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD);
                c cVar2 = (c) aVar.a0;
                cVar2.d(walkingRouteUiState2);
                cVar2.c(aVar.m0);
                return;
            }
        }
        z2 = true;
        aVar2.g0 = zlmVar;
        aVar2.Lg();
        aVar2.Lg();
        zlm zlmVar32 = aVar2.g0;
        if (zlmVar32 == null) {
        }
        arrayList = aVar2.V;
        if (arrayList.size() > 1) {
            n = ru.yandex.taxi.map.utils.a.n(a);
            f4c0 f4c0Var22 = aVar2.l0;
            if (f4c0Var22 == null) {
            }
            if (n != null) {
                f4c0Var.o(n);
            }
        }
        z3 = zlmVar.c;
        d0l0 d0l0Var32 = zlmVar.a;
        boolean z42 = !z3;
        aVar2.q0 = z42;
        aVar2.r0 = z42;
        if (z3) {
        }
        int i6 = 2;
        if (aVar2.L.a()) {
        }
        if (aVar.r0) {
        }
    }

    public final void Sg(t3l0 t3l0Var, f4c0 f4c0Var, xq00 xq00Var) {
        i6l0 i6l0Var = new i6l0(this, t3l0Var, f4c0Var, 0);
        xq00Var.getClass();
        xq00Var.d().addListener(new AnimUtils$AnimationStartEndListener(new fbz(16, new g700(11, xq00Var, i6l0Var)), new d82(1)));
        xq00Var.d().start();
        this.w0.a(xq00Var.d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Tg() {
        Integer num;
        TaxiMapView taxiMapView;
        Bitmap bitmap;
        Integer valueOf = Integer.valueOf(dfh0.btn_cashback);
        nyb0 nyb0Var = this.S;
        nyb0Var.g = valueOf;
        nyb0Var.f();
        f4c0 f4c0Var = this.k0;
        if (f4c0Var != null) {
            f4c0 f4c0Var2 = nyb0Var.f;
            if (f4c0Var2 != null) {
                MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView = f4c0Var2.r;
                num = mapObjectAccessibilityPlaceMarkView != null ? Integer.valueOf(mapObjectAccessibilityPlaceMarkView.getId()) : null;
            }
            num = nyb0Var.g;
            int intValue = num != null ? num.intValue() : dfh0.btn_cashback;
            iik0 iik0Var = new iik0(9, this);
            j0g j0gVar = this.T;
            wyi wyiVar = (wyi) j0gVar.a;
            String str = wyiVar.c;
            if (str != null) {
                String str2 = wyiVar.e ? str : null;
                if (str2 != null) {
                    azi aziVar = (azi) ((bzi) j0gVar.b).a.b();
                    String v = cvu0.v(d6z.Y(aziVar, aziVar.e), "$ARRIVAL_TIME$", str2, false);
                    ImageProvider imageProvider = f4c0Var.k;
                    Size size = new Size((imageProvider == null || (bitmap = imageProvider.get$image()) == null) ? 0 : bitmap.getWidth(), (int) f4c0Var.q());
                    Integer valueOf2 = Integer.valueOf(kyh0.common_edit);
                    Context context = wyiVar.a;
                    if (tje.J(context) && (taxiMapView = wyiVar.b) != null) {
                        wyiVar.d = f4c0Var;
                        if (taxiMapView.worldToScreen((Point) f4c0Var.h) != null) {
                            f4c0Var.E(context, taxiMapView, size, new uxh(11, iik0Var));
                            MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView2 = f4c0Var.r;
                            if (mapObjectAccessibilityPlaceMarkView2 != null) {
                                mapObjectAccessibilityPlaceMarkView2.setContentDescription(v);
                            }
                            vyi vyiVar = new vyi(0, valueOf2);
                            MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView3 = f4c0Var.r;
                            if (mapObjectAccessibilityPlaceMarkView3 != null) {
                                androidx.core.view.b.p(mapObjectAccessibilityPlaceMarkView3, vyiVar);
                            }
                        }
                    }
                    MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView4 = f4c0Var.r;
                    if (mapObjectAccessibilityPlaceMarkView4 != null) {
                        mapObjectAccessibilityPlaceMarkView4.setAccessibilityTraversalAfter(intValue);
                    }
                    j0gVar.B(f4c0Var);
                    return;
                }
            }
            TaxiMapView taxiMapView2 = wyiVar.b;
            if (taxiMapView2 != null) {
                f4c0Var.u(taxiMapView2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        if (r2.a((ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState) ((com.yandex.go.taxi.tariffs.internal.repository.k) r2.d).j.c.getValue(), ((com.yandex.go.taxi.tariffs.internal.repository.k) r2.c).n()) == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Ug(f4c0 f4c0Var, int i) {
        ImageProvider fromBitmap;
        jzi jziVar;
        e1c0 e1c0Var;
        o6l0 o6l0Var = RouteOverlayPlacemarkImageProvider$PlacemarkPointType.Companion;
        int size = this.V.size();
        o6l0Var.getClass();
        RouteOverlayPlacemarkImageProvider$PlacemarkPointType routeOverlayPlacemarkImageProvider$PlacemarkPointType = i == 0 ? RouteOverlayPlacemarkImageProvider$PlacemarkPointType.SOURCE : i == size - 1 ? RouteOverlayPlacemarkImageProvider$PlacemarkPointType.DESTINATION : RouteOverlayPlacemarkImageProvider$PlacemarkPointType.MIDDLE;
        bl00 bl00Var = this.e0;
        boolean z = routeOverlayPlacemarkImageProvider$PlacemarkPointType == RouteOverlayPlacemarkImageProvider$PlacemarkPointType.MIDDLE && this.s0 && bl00Var != null;
        if (z) {
            f4c0Var.z(bl00Var.a, bl00Var.b);
        } else {
            if (routeOverlayPlacemarkImageProvider$PlacemarkPointType == RouteOverlayPlacemarkImageProvider$PlacemarkPointType.DESTINATION) {
                if (!((Boolean) this.x.v.getValue()).booleanValue()) {
                    ru.yandex.taxi.preorder.map.interactor.a aVar = this.R;
                }
            }
            kdd0 kdd0Var = this.Q;
            kdd0Var.getClass();
            int i2 = p6l0.a[routeOverlayPlacemarkImageProvider$PlacemarkPointType.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    fromBitmap = ImageProvider.fromBitmap(((ugu0) ((sgu0) ((h3y) kdd0Var.b).get())).b(i, ((u0c0) kdd0Var.d).c.a, true, StopPointsProvider$StopPointPlace.MAP));
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return;
                    }
                    ru.yandex.taxi.preorder.source.points.a aVar2 = (ru.yandex.taxi.preorder.source.points.a) kdd0Var.a;
                    fnx0 n = ((k) aVar2.e).n();
                    kb5 kb5Var = n != null ? n.e : null;
                    if (kb5Var != null && (e1c0Var = aVar2.m) != null) {
                        for (xxb0 xxb0Var : e1c0Var.g) {
                            if (xxb0Var instanceof sxb0) {
                                sxb0 sxb0Var = (sxb0) xxb0Var;
                                if (sxb0Var.a.contains(kb5Var.b)) {
                                    jziVar = sxb0Var.c;
                                    break;
                                }
                            }
                            if (xxb0Var instanceof wxb0) {
                                wxb0 wxb0Var = (wxb0) xxb0Var;
                                if (wxb0Var.a.contains(kb5Var.a)) {
                                    jziVar = wxb0Var.c;
                                    break;
                                }
                            }
                        }
                    }
                    jziVar = null;
                    if (jziVar == null || !jziVar.b) {
                        String str = jziVar != null ? jziVar.a : null;
                        LinkedHashMap linkedHashMap = aVar2.k;
                        if (str == null || str.length() == 0 || kb5Var == null) {
                            fromBitmap = null;
                        } else {
                            rgu0 rgu0Var = new rgu0(kb5Var.a, kb5Var.b, aVar2.j.getThemeType());
                            WeakReference weakReference = (WeakReference) linkedHashMap.get(rgu0Var);
                            fromBitmap = weakReference != null ? (ImageProvider) weakReference.get() : null;
                            if (fromBitmap == null) {
                                fromBitmap = new zg21(aVar2.g, ((m7x0) aVar2.h).a(str), new ob0(14, aVar2));
                                linkedHashMap.put(rgu0Var, new WeakReference(fromBitmap));
                            }
                        }
                        if (fromBitmap == null) {
                            fromBitmap = aVar2.d.a() ? aVar2.b() : ImageProvider.fromBitmap(((ugu0) ((sgu0) aVar2.i.get())).b(-1, aVar2.l.b.a, true, StopPointsProvider$StopPointPlace.MAP));
                        }
                    }
                }
                if (fromBitmap != null) {
                    f4c0Var.y(fromBitmap);
                }
                if (routeOverlayPlacemarkImageProvider$PlacemarkPointType != RouteOverlayPlacemarkImageProvider$PlacemarkPointType.SOURCE) {
                    f4c0Var.j(routeOverlayPlacemarkImageProvider$PlacemarkPointType != RouteOverlayPlacemarkImageProvider$PlacemarkPointType.DESTINATION ? fromBitmap != null || z : fromBitmap != null && this.q0, new Animation(Animation.Type.SMOOTH, 0.3f), null);
                    f4c0Var.g(new h6l0(this, i - 1, 0));
                    return;
                } else {
                    f4c0Var.i(this.n0);
                    f4c0Var.g(this.u0);
                    this.i0 = f4c0Var;
                    return;
                }
            }
            hbm hbmVar = (hbm) kdd0Var.c;
            Drawable a = hbmVar.a(((u0c0) kdd0Var.d).a.a, vng.t(f1h0.route_start_point, hbmVar.a));
            if (a != null) {
                fromBitmap = ImageProvider.fromBitmap(u8b1.g(a));
                if (fromBitmap != null) {
                }
                if (routeOverlayPlacemarkImageProvider$PlacemarkPointType != RouteOverlayPlacemarkImageProvider$PlacemarkPointType.SOURCE) {
                }
            }
        }
        fromBitmap = null;
        if (fromBitmap != null) {
        }
        if (routeOverlayPlacemarkImageProvider$PlacemarkPointType != RouteOverlayPlacemarkImageProvider$PlacemarkPointType.SOURCE) {
        }
    }
}
