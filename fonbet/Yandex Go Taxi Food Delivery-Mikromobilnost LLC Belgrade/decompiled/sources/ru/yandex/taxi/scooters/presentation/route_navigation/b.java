package ru.yandex.taxi.scooters.presentation.route_navigation;

import android.graphics.PointF;
import com.yandex.mapkit.map.CameraBounds;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.auo0;
import defpackage.bwn0;
import defpackage.cjm0;
import defpackage.co40;
import defpackage.cuo0;
import defpackage.duo0;
import defpackage.ehs0;
import defpackage.euo0;
import defpackage.fn6;
import defpackage.fva0;
import defpackage.g8e;
import defpackage.gh00;
import defpackage.h55;
import defpackage.j311;
import defpackage.krl0;
import defpackage.lf2;
import defpackage.lyn;
import defpackage.m7g;
import defpackage.ney;
import defpackage.oto0;
import defpackage.po21;
import defpackage.pto0;
import defpackage.qto0;
import defpackage.rx4;
import defpackage.scc;
import defpackage.tje;
import defpackage.v0o0;
import defpackage.vam0;
import defpackage.w0o0;
import defpackage.xto0;
import defpackage.xvf0;
import defpackage.yto0;
import defpackage.yvf0;
import defpackage.zto0;
import defpackage.zuo0;
import defpackage.zzs;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.data.k;
import ru.yandex.taxi.scooters.domain.g;

/* loaded from: classes6.dex */
public final class b extends h55 {
    public final MainActivity D;
    public final yvf0 E;
    public final zto0 F;
    public final cuo0 G;
    public final pto0 H;
    public final v0o0 I;
    public final yvf0 J;
    public yto0 K;
    public cjm0 L;

    public b(MainActivity mainActivity, m7g m7gVar, zto0 zto0Var, cuo0 cuo0Var, pto0 pto0Var, v0o0 v0o0Var, oto0 oto0Var) {
        super(null);
        this.D = mainActivity;
        this.E = m7gVar;
        this.F = zto0Var;
        this.G = cuo0Var;
        this.H = pto0Var;
        this.I = v0o0Var;
        this.J = oto0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        CameraBounds cameraBounds;
        this.D.getWindow().clearFlags(128);
        cjm0 cjm0Var = this.L;
        if (cjm0Var != null) {
            co40 co40Var = (co40) cjm0Var.b;
            String str = (String) cjm0Var.c;
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("order_id", str);
            co40Var.a.a("ScootersNavigator.Closed", hashMap, 1, new HashMap());
        }
        yto0 yto0Var = this.K;
        if (yto0Var != null) {
            yto0Var.x.Cg();
            ((gh00) ((ah00) yto0Var.b)).I(yto0Var.A);
            CameraPosition cameraPosition = ((gh00) ((ah00) yto0Var.b)).e.c;
            ((gh00) ((ah00) yto0Var.b)).x(null);
            Map map = ((gh00) ((ah00) yto0Var.b)).b;
            if (map != null) {
                map.setBuildingsHeightScale(1.0f, 1.0f);
            }
            ah00 ah00Var = (ah00) yto0Var.b;
            EmptyList emptyList = EmptyList.a;
            Map map2 = ((gh00) ah00Var).b;
            if (map2 != null && (cameraBounds = map2.getCameraBounds()) != null) {
                cameraBounds.setTiltFunction(emptyList);
            }
            ((gh00) ((ah00) yto0Var.b)).H(new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, 0.0f));
            NavigationLayer navigationLayer = yto0Var.B;
            if (navigationLayer != null) {
                navigationLayer.removeFromMap();
            }
            yto0Var.B = null;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        CameraBounds cameraBounds;
        auo0 auo0Var = (auo0) obj;
        String m = auo0Var.c.m();
        co40 co40Var = (co40) ((bwn0) this.H.a.b).get();
        this.L = new cjm0(12, co40Var, m);
        co40Var.a.a("ScootersNavigator.Shown", g8e.u("order_id", m, "open_reason", auo0Var.b.getReason()), 1, new HashMap());
        zzs zzsVar = auo0Var.a;
        zuo0 zuo0Var = auo0Var.c;
        vam0 vam0Var = new vam0(28, this, auo0Var);
        fn6 fn6Var = this.G.a;
        a aVar = new a((ney) ((xvf0) fn6Var.a).get(), (ah00) ((xvf0) fn6Var.d).get(), (a3v) ((xvf0) fn6Var.e).get(), (fva0) ((xvf0) fn6Var.f).get(), (po21) ((xvf0) fn6Var.b).get(), (ehs0) ((xvf0) fn6Var.c).get(), (qto0) ((xvf0) fn6Var.h).get(), (ru.yandex.taxi.scooters.presentation.route_navigation.domain.a) ((rx4) fn6Var.i).get(), (g) ((xvf0) fn6Var.j).get(), (euo0) ((xvf0) fn6Var.k).get(), (k) ((xvf0) fn6Var.g).get(), (v0o0) ((xvf0) fn6Var.l).get(), zzsVar, vam0Var, zuo0Var);
        duo0 duo0Var = new duo0(this, 0);
        duo0 duo0Var2 = new duo0(this, 1);
        lf2 lf2Var = this.F.a;
        ah00 ah00Var = (ah00) lf2Var.b.get();
        yto0 yto0Var = new yto0(ah00Var, duo0Var, duo0Var2, aVar, (j311) lf2Var.c.get(), (w0o0) lf2Var.a.a);
        gh00 gh00Var = (gh00) ah00Var;
        yto0Var.A = gh00Var.o();
        gh00Var.x(null);
        gh00Var.L(null);
        gh00Var.I(true);
        Map map = gh00Var.b;
        if (map != null) {
            map.setBuildingsHeightScale(0.2f, 0.2f);
        }
        List<PointF> g = scc.g(new PointF(16.0f, 0.0f), new PointF(21.0f, 90.0f));
        Map map2 = gh00Var.b;
        if (map2 != null && (cameraBounds = map2.getCameraBounds()) != null) {
            cameraBounds.setTiltFunction(g);
        }
        xto0 xto0Var = new xto0(yto0Var);
        fva0.f(aVar.C, "ScootersNavigation", PerformanceAnalytics$Type.Loading, 0L, 4);
        aVar.Bg(xto0Var);
        r0 r0Var = aVar.I.a;
        r0Var.getClass();
        r0Var.m(null, lyn.a);
        aVar.E.a(new krl0(aVar));
        tje.N(aVar.Jg(), null, null, new ScootersRouteNavigationPresenter$attachView$1(aVar, xto0Var, null), 3);
        this.K = yto0Var;
        this.D.getWindow().addFlags(128);
        tje.N(o(), null, null, new ScootersRouteNavigationRouter$onLaunch$$inlined$collectIn$1(this.I.f, null, this), 3);
    }
}
