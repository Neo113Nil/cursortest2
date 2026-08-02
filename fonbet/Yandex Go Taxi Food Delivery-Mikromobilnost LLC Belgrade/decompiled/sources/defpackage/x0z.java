package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.navigator.main_screen.experiement.e;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.messaging.input.MessageSelectionActionModeCallback;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.loading_spinner.a;
import ru.yandex.taxi.logistics.deliveries.multiorder.c;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.datasource.routing.f;
import ru.yandex.taxi.masstransit.domain.h0;
import ru.yandex.taxi.masstransit.mapper.g;
import ru.yandex.taxi.requirements.glued.interactor.d;

/* loaded from: classes14.dex */
public final class x0z implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public x0z(br10 br10Var, n3w n3wVar, j3g j3gVar, xvf0 xvf0Var) {
        this.a = 11;
        this.c = br10Var;
        this.b = n3wVar;
        this.d = j3gVar;
        this.e = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new a((u3s) ((n3w) xvf0Var4).a, (u0z) ((eu0) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 1:
                return new ciz((boj0) ((zo0) xvf0Var4).get(), (bsi) xvf0Var3.get(), (c) xvf0Var2.get(), (a301) xvf0Var.get());
            case 2:
                return new wrr((knz) ((i9g) xvf0Var3).get(), (gpc) ((tgb0) xvf0Var2).get(), (hnz) xvf0Var.get(), (o2y0) ((n3w) xvf0Var4).a);
            case 3:
                return new com.yandex.go.lootbox.impl.domain.interactors.activation.a((com.yandex.go.lootbox.impl.data.repository.activation.a) ((e3u) xvf0Var4).get(), (zuj0) ((s2g) xvf0Var3).get(), (wnt) ((s2g) xvf0Var2).get(), (tt2) ((s2g) xvf0Var).get());
            case 4:
                return new apz((u8w) ((sqz) xvf0Var4).get(), (o61) ((sqz) xvf0Var3).get(), (o61) ((sqz) xvf0Var2).get(), (pj) ((sqz) xvf0Var).get());
            case 5:
                return new com.yandex.go.lootbox.impl.data.mapper.content.a((com.yandex.go.lootbox.impl.data.mapper.action.a) ((rut) xvf0Var4).get(), (com.yandex.go.lootbox.impl.data.mapper.gift.a) ((h1t) xvf0Var3).get(), (com.yandex.go.lootbox.impl.data.mapper.button.a) ((h0z) xvf0Var2).get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 6:
                return new gqz((pav) xvf0Var4.get(), (k7x0) ((s2g) xvf0Var3).get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 7:
                return new d((w15) xvf0Var4.get(), (lvp0) xvf0Var3.get(), (ijj0) ((npe0) xvf0Var2).get(), (dqe0) ((w0g) xvf0Var).get());
            case 8:
                return new com.yandex.go.taxi.order.map_objects.a((gz70) ((uc50) xvf0Var4).get(), (vo00) xvf0Var3.get(), (tz1) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 9:
                return new j610((k7x0) xvf0Var4.get(), (i610) xvf0Var3.get(), (qbl0) xvf0Var2.get(), (s0r0) ((m7q0) xvf0Var).get());
            case 10:
                return new MerchantOffersFragment((gc) xvf0Var4, (gzk) ((qo10) xvf0Var3).get(), (sb6) ((qo10) xvf0Var2).get(), (yq10) ((u2g) xvf0Var).get());
            case 11:
                return new com.ybsdk.feature.merchants.internal.screens.a((com.ybsdk.feature.merchants.internal.data.a) ((br10) xvf0Var3).get(), (tw51) ((n3w) xvf0Var4).a, (AppAnalyticsReporter) ((j3g) xvf0Var2).get(), (gr10) xvf0Var.get());
            case 12:
                return new MessageSelectionActionModeCallback((Activity) xvf0Var4.get(), (mp11) xvf0Var3.get(), (a3r0) ((pmn0) xvf0Var2).get(), (lqo) xvf0Var.get());
            case 13:
                return new aj20((to3) xvf0Var4.get(), (k020) xvf0Var3.get(), (v5z) ((h0z) xvf0Var2).get(), i5m.a(xvf0Var));
            case 14:
                return new k((ah00) xvf0Var4.get(), (fvr) xvf0Var3.get(), (b) ((l3g) xvf0Var2).get(), (po21) xvf0Var.get());
            case 15:
                return new aoi((t230) ((bo2) xvf0Var2).get(), (l030) xvf0Var.get(), (s030) ((n3w) xvf0Var4).a);
            case 16:
                return new f28(((v3g) xvf0Var3).get(), xvf0Var2.get(), (w030) xvf0Var4.get(), xvf0Var.get(), 6);
            case 17:
                return new si30((ru.yandex.taxi.discovery.b) xvf0Var4.get(), (ti30) ((di20) xvf0Var3).get(), (wu30) xvf0Var2.get(), xvf0Var);
            case 18:
                return new ru.yandex.taxi.masstransit.ui.discovery.c((ah00) ((f3g) xvf0Var4).get(), (tu30) xvf0Var3.get(), (po21) ((g3g) xvf0Var2).get(), (tt2) xvf0Var.get());
            case 19:
                return new ru.yandex.taxi.masstransit.holder.c((f) xvf0Var4.get(), (tt2) ((u3g) xvf0Var3).get(), (nw8) ((yj30) xvf0Var2).get(), (zuj0) ((v3g) xvf0Var).get());
            case 20:
                return new ea40((b611) xvf0Var4.get(), (ga40) xvf0Var3.get(), (sy00) ((y3g) xvf0Var2).get(), (TransportRouteAnalytics$FlowOrigin) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.masstransit.trains.checkout.conditions.b((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (ie40) xvf0Var2.get(), (fl10) ((wz30) xvf0Var).get());
            case 22:
                Context context = (Context) xvf0Var4.get();
                h410 h410Var = (h410) ((r3g) xvf0Var3).get();
                mj31 mj31Var = (mj31) ((pso0) xvf0Var2).get();
                w030 w030Var = (w030) xvf0Var.get();
                ((od01) h410Var.d.getValue()).getClass();
                return new px41(context, w030Var, mj31Var);
            case 23:
                return new ru.yandex.taxi.masstransit.trains.checkout.tariff.c((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (ru.yandex.taxi.masstransit.trains.checkout.tariff.d) ((h0z) xvf0Var2).get(), (ru.yandex.taxi.masstransit.trains.checkout.tariff.a) ((wz30) xvf0Var).get());
            case 24:
                return new h0((ck31) xvf0Var4.get(), (tu30) xvf0Var3.get(), (pb31) xvf0Var2.get(), (q) ((dby0) xvf0Var).get());
            case 25:
                return new g((Context) xvf0Var4.get(), (ru.yandex.taxi.masstransit.mapper.d) xvf0Var3.get(), (h640) xvf0Var2.get(), (ru.yandex.taxi.masstransit.mapper.c) ((k220) xvf0Var).get());
            case 26:
                return new com.yandex.go.navigator.repository.f((mf50) ((f4g) xvf0Var4).get(), (el00) ((f4g) xvf0Var3).get(), (ru.yandex.taxi.map_common.map.a) ((lk) xvf0Var2).get(), (tt2) ((f4g) xvf0Var).get());
            case 27:
                i650 i650Var = (i650) xvf0Var3.get();
                e51 e51Var = (e51) ((c1) xvf0Var2).get();
                return new ya50(i650Var, e51Var);
            case 28:
                return new com.yandex.go.navigator.gas_stations.providers.a((Context) ((v1g) xvf0Var4).get(), (tt2) ((v1g) xvf0Var3).get(), (zuj0) xvf0Var2.get(), (ru.yandex.taxi.design.utils.b) ((w1g) xvf0Var).get());
            default:
                return new com.yandex.go.navigator.gas_stations.analytics.a((eb50) xvf0Var4.get(), (e) xvf0Var3.get(), (hbp0) xvf0Var2.get(), (fe50) ((wz30) xvf0Var).get());
        }
    }

    public /* synthetic */ x0z(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ x0z(int i, v7p v7pVar, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = i;
        this.c = xvf0Var;
        this.d = v7pVar;
        this.e = xvf0Var2;
        this.b = n3wVar;
    }
}
