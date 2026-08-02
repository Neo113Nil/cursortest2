package defpackage;

import android.content.Context;
import com.yandex.go.multimodal_route.store.a;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.taxi.order.change.common.domain.g;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.layers.domain.r;
import ru.yandex.taxi.layers.source.f;
import ru.yandex.taxi.layers.source.factory.componentfactory.a0;
import ru.yandex.taxi.layers.source.k;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.masstransit.overlay.onmap.i;
import ru.yandex.taxi.yaplus.b;

/* loaded from: classes9.dex */
public final class zw30 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public zw30(tc tcVar, su suVar, gga0 gga0Var, c8w c8wVar) {
        this.a = 16;
        this.b = suVar;
        this.c = gga0Var;
        this.d = c8wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new yw30((b611) xvf0Var3.get(), (mb11) xvf0Var2.get(), (ih01) ((qcz0) xvf0Var).get());
            case 1:
                return new e100(15, (yw30) ((zw30) xvf0Var2).get(), (ls30) ((dt00) xvf0Var).get(), (ah00) xvf0Var3.get());
            case 2:
                return new gw40((xcz) xvf0Var2, (a) xvf0Var3.get(), (com.yandex.go.multimodal_route.ui.detailed_card.a) ((lcw) xvf0Var).get());
            case 3:
                return new i((ah00) xvf0Var3.get(), (tt2) xvf0Var2.get(), (y110) ((bsz) xvf0Var).get());
            case 4:
                OkHttpClient okHttpClient = (OkHttpClient) xvf0Var3.get();
                uc ucVar = (uc) ((x) xvf0Var).get();
                gxf0 gxf0Var = (gxf0) xvf0Var2.get();
                OkHttpClient.a b = okHttpClient.b();
                ((qot) gxf0Var).a(b, null);
                b.c.add(ucVar);
                return new OkHttpClient(b);
            case 5:
                return new w660((b1) ((c1) xvf0Var2).get(), (t61) ((qy0) xvf0Var).get(), (yyq0) xvf0Var3.get());
            case 6:
                return new q760((c) xvf0Var3.get(), (u8w) ((c660) xvf0Var2).get(), (co40) ((c660) xvf0Var).get());
            case 7:
                return new k((f) ((zp60) xvf0Var2).get(), (tyx) ((m2g) xvf0Var).get(), (zyx) xvf0Var3.get());
            case 8:
                return new k870((com.yandex.go.taxi.order.details.v1.elements.support.a) ((sku0) xvf0Var).get(), (ko21) xvf0Var3.get(), (fn21) xvf0Var2.get());
            case 9:
                return new g((n20) xvf0Var3.get(), (sb9) ((r10) xvf0Var).get(), (tt2) xvf0Var2.get());
            case 10:
                return new com.yandex.go.taxi.order.analytics.a((mux) xvf0Var3.get(), (yxx0) ((abx0) xvf0Var2).get(), (zf) ((f870) xvf0Var).get());
            case 11:
                return new a0((Context) ((m2g) xvf0Var3).get(), (ru.yandex.taxi.map_common.map.utils.a) ((n2g) xvf0Var2).get(), (ru.yandex.taxi.widget.c) ((m2g) xvf0Var).get());
            case 12:
                return new fc9(i5m.a(xvf0Var3), (xcz) xvf0Var, (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var2.get());
            case 13:
                return new lw90((b8r) xvf0Var3.get(), (g8a0) ((le30) xvf0Var).get(), (i0) xvf0Var2.get());
            case 14:
                return new lz90((zuj0) xvf0Var3.get(), (ry90) xvf0Var2.get(), (syw) ((rqt) xvf0Var).get());
            case 15:
                return new jb7(23, (chh) ((i5g) xvf0Var3).get(), (lca0) ((ec80) xvf0Var2).get(), (com.yandex.go.superapp.order.multi.old.provider.g) ((i5g) xvf0Var).get());
            case 16:
                return new ica0(xvf0Var3, (e5d0) xvf0Var2.get(), (c8w) xvf0Var);
            case 17:
                return new gda0((lz90) ((zw30) xvf0Var2).get(), (jvz) ((kqz) xvf0Var).get(), (boj) xvf0Var3.get());
            case 18:
                return new tda0((com.yandex.go.payments.paymentlist.data.c) ((eqh) xvf0Var3).get(), (com.yandex.go.payments.data.k) ((kpp0) xvf0Var2).get(), (wsx) ((wnw) xvf0Var).get());
            case 19:
                return new efa0((kyz) xvf0Var3.get(), (fj21) xvf0Var2.get(), (c9v) ((bsz) xvf0Var).get());
            case 20:
                return new hxa0((tse) xvf0Var3.get(), (sdi) xvf0Var2.get(), (hdu) ((rqt) xvf0Var).get());
            case 21:
                return new ru.yandex.taxi.logistics.sdk.performer_position.impl.a((ru.yandex.taxi.logistics.sdk.performer_position.impl.data.a) ((g430) xvf0Var).get(), (AppVisibilitySubscriptionImpl) xvf0Var3.get(), (st2) xvf0Var2.get());
            case 22:
                return new y6b0((dqe0) xvf0Var3.get(), (com.yandex.go.route.interactor.c) xvf0Var2.get(), (q7b0) ((i0b0) xvf0Var).get());
            case 23:
                return new udc0((kac0) ((n3w) xvf0Var2).a, (z0j) xvf0Var3.get(), (dgc0) ((egc0) xvf0Var).get());
            case 24:
                return new ru.yandex.taxi.yaplus.a((tse) xvf0Var3.get(), (b) xvf0Var2.get(), (d49) ((o10) xvf0Var).get());
            case 25:
                return new qmd0((mjd0) xvf0Var3.get(), (s3d0) xvf0Var2.get(), (ofa0) ((umt0) xvf0Var).get());
            case 26:
                return new a4e0((ah00) ((m2g) xvf0Var3).get(), (ru.yandex.taxi.map_common.map.process.b) ((n2g) xvf0Var2).get(), (c4e0) ((zw30) xvf0Var).get());
            case 27:
                return new c4e0((r) ((gb0) xvf0Var).get(), (z2e0) xvf0Var3.get(), (p3e0) xvf0Var2.get());
            case 28:
                return new ej1((zrm) ((zth) xvf0Var).get(), (w030) xvf0Var3.get(), (i130) xvf0Var2.get(), 14);
            default:
                return new ru.yandex.taxi.logistics.postcard.presentation.g((tse) xvf0Var3.get(), (oep0) xvf0Var2.get(), (gwb0) xvf0Var);
        }
    }

    public /* synthetic */ zw30(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = v7pVar;
        this.d = xvf0Var;
        this.b = xvf0Var2;
    }

    public /* synthetic */ zw30(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i, boolean z) {
        this.a = i;
        this.d = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public /* synthetic */ zw30(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = v7pVar;
        this.c = xvf0Var2;
    }

    public /* synthetic */ zw30(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ zw30(int i, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var) {
        this.a = i;
        this.c = v7pVar;
        this.b = xvf0Var;
        this.d = v7pVar2;
    }
}
