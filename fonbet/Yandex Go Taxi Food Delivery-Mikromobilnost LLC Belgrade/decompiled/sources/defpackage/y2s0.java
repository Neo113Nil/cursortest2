package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.ui.notifications.favorites.a;
import com.yandex.go.summary.interactor.common.state.h;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.z;
import com.yandex.go.taxi.order.domain.interactors.i;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.logistics.ndd_map.walkroute.b;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c;
import ru.yandex.taxi.masstransit.geopayment.stopselector.e;
import ru.yandex.taxi.summary.solid.interactor.t;

/* loaded from: classes14.dex */
public final class y2s0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ y2s0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new x2s0(i5m.a((eqh) xvf0Var3), (uio0) ((u6o0) xvf0Var2).get(), (hwo0) ((elo0) xvf0Var).get());
            case 1:
                return new c6s0((qcp0) ((w9g) xvf0Var3).get(), (f6s0) xvf0Var2.get(), (b6s0) ((ywf) xvf0Var).get());
            case 2:
                return new amp0((String) xvf0Var3.get(), (gzh) xvf0Var2.get(), (cjm0) ((elo0) xvf0Var).get());
            case 3:
                Context context = (Context) ((x4g) xvf0Var3).get();
                return new a((pav) xvf0Var.get(), (tj60) ((x4g) xvf0Var2).get(), context);
            case 4:
                return new b((z541) ((o4g) xvf0Var3).get(), (ru.yandex.taxi.logistics.ndd_map.walkroute.a) ((elo0) xvf0Var2).get(), (hj50) xvf0Var.get());
            case 5:
                return new yys0((c) ((y9g) xvf0Var3).get(), (c) ((y9g) xvf0Var2).get(), (y30) ((y9g) xvf0Var).get());
            case 6:
                y030 y030Var = (y030) ((z9g) xvf0Var3).get();
                fva0 fva0Var = (fva0) ((z9g) xvf0Var2).get();
                scg a = ((gf41) ((z9g) xvf0Var).get()).a();
                return new gg41(y030Var.a(ContentContainer$ZOrder.IMPORTANT), fva0Var, a.c(), (zf41) a.e.get());
            case 7:
                return new u8u0((pit) ((dag) xvf0Var3).get(), (com.yandex.go.taxi.order.provider.a) ((f4g) xvf0Var2).get(), (i) ((jc60) xvf0Var).get());
            case 8:
                return new jdu0((to3) xvf0Var3.get(), (wff0) xvf0Var2.get(), (pcu0) ((cys0) xvf0Var).get());
            case 9:
                return new ru.yandex.taxi.masstransit.stopbubble.factory.a((Context) xvf0Var3.get(), (kj40) ((i020) xvf0Var2).get(), (com.yandex.go.pin.api.widget.b) xvf0Var.get());
            case 10:
                return new tiu0((ge30) xvf0Var3.get(), (e) ((sit0) xvf0Var2).get(), (wu30) xvf0Var.get());
            case 11:
                return new ru.yandex.taxi.settings.domain.factory.b((e3g0) ((pqd0) xvf0Var3).get(), (g5g0) ((a6g) xvf0Var2).get(), (tt2) ((a6g) xvf0Var).get());
            case 12:
                return new vt6(2, (com.yandex.go.preorder.confirm.a) xvf0Var3.get(), (ste0) ((ii9) xvf0Var2).get(), (bc) ((t4) xvf0Var).get());
            case 13:
                return new ffv0((fva0) xvf0Var3.get(), (vev0) xvf0Var2.get(), (i1g) ((f1g) xvf0Var).get());
            case 14:
                return new jfv0((zuj0) xvf0Var3.get(), (t) ((t4v0) xvf0Var2).get(), (kg00) xvf0Var.get());
            case 15:
                return new com.yandex.go.summary.interactor.a((tt2) xvf0Var3.get(), (h) ((l9t0) xvf0Var2).get(), (com.yandex.go.summary.interactor.mapcontent.state.a) ((e3u) xvf0Var).get());
            case 16:
                return new zuv0((ky2) ((iag) xvf0Var3).get(), (k0b0) xvf0Var2.get(), (w7j0) ((jag) xvf0Var).get());
            case 17:
                return new com.yandex.go.superapp.discovery.map.impl.ui.search.a((atd0) xvf0Var3.get(), (com.yandex.go.route.interactor.b) ((jag) xvf0Var2).get(), (com.yandex.go.zone.interactors.b) ((iag) xvf0Var).get());
            case 18:
                return new c2n0(4, (iag) xvf0Var3, (ru.yandex.taxi.search.suggest.i) ((iag) xvf0Var2).get(), (z) xvf0Var.get());
            case 19:
                return new com.yandex.go.superapp.discovery.map.impl.domain.interactors.flex.c((wnt) ((iag) xvf0Var3).get(), (e2t) ((iag) xvf0Var2).get(), (ktv0) xvf0Var.get());
            case 20:
                return new i9w0((o3l0) xvf0Var3.get(), (p9w0) ((n3w) xvf0Var2).a, i5m.a((p7w0) xvf0Var));
            case 21:
                return new com.yandex.go.superapp_carts.ui.preview.b(i5m.a(xvf0Var3), (tt2) ((jag) xvf0Var2).get(), (zuj0) ((nag) xvf0Var).get());
            case 22:
                ru.yandex.taxi.widget.c cVar = (ru.yandex.taxi.widget.c) ((qag) xvf0Var3).get();
                return new com.yandex.go.taxi.order.support.data.mappers.a((pdc) ((qag) xvf0Var).get(), (k7x0) ((qag) xvf0Var2).get(), cVar);
            case 23:
                return new hhs0((trv0) xvf0Var3.get(), (jhu0) ((miv0) xvf0Var2).get(), (tse) ((y0g) xvf0Var).get());
            case 24:
                return new cjw0((Context) ((t0g) xvf0Var3).get(), (wiq0) ((w0g) xvf0Var2).get(), (tt2) xvf0Var.get());
            case 25:
                return new com.yandex.go.taxi.summary.router.a((vqv0) xvf0Var3.get(), (tse) ((y0g) xvf0Var2).get(), (biv0) ((b1g) xvf0Var).get());
            case 26:
                return new cjw0((wiq0) ((izf) xvf0Var3).get(), (n3a) ((gmh) xvf0Var2).get(), (zuj0) ((izf) xvf0Var).get());
            case 27:
                return new fjx0((yow0) ((miv0) xvf0Var3).get(), (ru.yandex.taxi.styling.c) xvf0Var2.get(), (dqe0) ((w0g) xvf0Var).get());
            case 28:
                return new ilx0((nlx0) xvf0Var3.get(), (llx0) ((sit0) xvf0Var2).get(), (jlx0) xvf0Var.get());
            default:
                return new com.yandex.go.order.tariffs_suggest.router.a((ge50) xvf0Var3, (p2y0) xvf0Var2.get(), (epz) ((q720) xvf0Var).get());
        }
    }
}
