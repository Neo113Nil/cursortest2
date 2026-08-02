package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.squareup.moshi.Moshi;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.go.navigator.driving.p0;
import com.yandex.go.navigator.driving.r;
import com.yandex.go.navigator.driving.w;
import com.yandex.go.navigator.favorites.f;
import com.yandex.go.navigator.ui.m;
import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.superapp.orders.ui.OrdersListModalView;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.botrequest.d;
import com.yandex.messaging.input.bricks.a;
import com.yandex.messaging.internal.authorized.chat.j;
import com.yandex.messaging.internal.i;
import com.yandex.messaging.internal.t;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.yandex.messaging.internal.view.timeline.l;
import com.yandex.messaging.ui.timeline.b;
import com.yandex.pay.payment.PaymentData;
import java.util.Collections;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.ui.recenter.RecenterButton;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes15.dex */
public final class wj0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;

    public /* synthetic */ wj0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.i;
        xvf0 xvf0Var2 = this.g;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.h;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.d;
        xvf0 xvf0Var7 = this.c;
        xvf0 xvf0Var8 = this.b;
        switch (i) {
            case 0:
                return new w3i((ah00) xvf0Var8.get(), (xm00) xvf0Var7.get(), (Context) xvf0Var6.get(), (yj0) xvf0Var5.get(), this.f, (ze0) xvf0Var2.get(), (uqx) xvf0Var4.get(), (oep0) xvf0Var.get(), 1);
            case 1:
                return new a15((Context) xvf0Var8.get(), (hk3) xvf0Var7.get(), (ar10) xvf0Var6.get(), (d180) xvf0Var5.get(), (PayboxScenario) xvf0Var3.get(), (PaymentData) xvf0Var2.get(), (Region) xvf0Var4.get(), (rzq0) xvf0Var.get());
            case 2:
                Context context = (Context) xvf0Var8.get();
                tt2 tt2Var = (tt2) xvf0Var7.get();
                irs0 irs0Var = (irs0) xvf0Var6.get();
                jgv jgvVar = (jgv) xvf0Var5.get();
                e eVar = (e) xvf0Var3.get();
                bts0 bts0Var = (bts0) xvf0Var2.get();
                pwy0 pwy0Var = (pwy0) xvf0Var4.get();
                return new j4n(context, tt2Var, irs0Var, jgvVar, eVar, bts0Var, pwy0Var);
            case 3:
                return new xx6((to3) xvf0Var8.get(), (kse) xvf0Var7.get(), (lqo) xvf0Var6.get(), (k020) xvf0Var5.get(), (j3u) xvf0Var3.get(), (lwi) xvf0Var2.get(), (doc) xvf0Var4.get(), i5m.a(xvf0Var));
            case 4:
                return new w3i((xf7) xvf0Var8.get(), (bwu) xvf0Var7.get(), (q6v) xvf0Var6.get(), (String) xvf0Var5.get(), (String) xvf0Var3.get(), (Moshi) xvf0Var2.get(), (gsu) xvf0Var4.get(), (SharedPreferences) xvf0Var.get());
            case 5:
                return new a((Activity) xvf0Var8.get(), (u3b) xvf0Var7.get(), (b00) xvf0Var6.get(), (pu31) xvf0Var5.get(), (SelectedMessagesPanel) xvf0Var3.get(), (ChatInputHeightState) xvf0Var2.get(), (ChatRequest) xvf0Var4.get(), (p4t) xvf0Var.get());
            case 6:
                return new l5b((sb7) xvf0Var8.get(), (k020) xvf0Var7.get(), (naz0) xvf0Var6.get(), (o1b0) xvf0Var5.get(), (c8b) xvf0Var3.get(), (fjs) xvf0Var2.get(), (kse) xvf0Var4.get(), (lqo) xvf0Var.get());
            case 7:
                return new b((x22) xvf0Var8.get(), (at2) xvf0Var7.get(), (vse) xvf0Var6.get(), (q6b) xvf0Var5.get(), (ChatRequest) xvf0Var3.get(), (p4t) xvf0Var2.get(), (w270) xvf0Var4.get(), (eil0) xvf0Var.get());
            case 8:
                return new m9b((Activity) xvf0Var8.get(), (pu31) xvf0Var7.get(), (ChatInputHeightState) xvf0Var6.get(), (ChatRequest) xvf0Var5.get(), (cwp0) xvf0Var3.get(), (o9b) xvf0Var2.get(), (p4t) xvf0Var4.get(), (b) xvf0Var.get());
            case 9:
                return new com.yandex.messaging.internal.authorized.textsuggest.b((o1b0) xvf0Var8.get(), (xdf0) xvf0Var7.get(), (lqo) xvf0Var6.get(), (n5t0) xvf0Var5.get(), (qtq0) xvf0Var3.get(), (ouf0) xvf0Var2.get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var4.get(), (w9b) xvf0Var.get());
            case 10:
                c cVar = (c) xvf0Var8.get();
                w030 w030Var = (w030) xvf0Var7.get();
                hu6 hu6Var = (hu6) xvf0Var6.get();
                au6 au6Var = (au6) xvf0Var5.get();
                ru.yandex.taxi.modal.popup.ui.model.a aVar = (ru.yandex.taxi.modal.popup.ui.model.a) xvf0Var3.get();
                return new ru.yandex.taxi.combo.domain.a(cVar, w030Var, hu6Var, au6Var, aVar, this.g, (tse) xvf0Var.get());
            case 11:
                return new d((q6b) xvf0Var8.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var7.get(), (i) xvf0Var6.get(), (com.yandex.messaging.domain.botrequest.a) xvf0Var5.get(), (p4t) xvf0Var3.get(), (com.yandex.messaging.domain.chat.a) xvf0Var2.get(), i5m.a(xvf0Var4), (kse) xvf0Var.get());
            case 12:
                return new w3i((tt2) xvf0Var8.get(), (Context) xvf0Var7.get(), (pwy0) xvf0Var6.get(), (g) xvf0Var5.get(), (cq40) xvf0Var3.get(), (iev0) xvf0Var2.get(), (wiq0) xvf0Var4.get(), (rqo) xvf0Var.get(), 17);
            case 13:
                return new w((com.yandex.go.navigator.notifications.cartech.b) xvf0Var8.get(), (r) xvf0Var7.get(), (p0) xvf0Var6.get(), (yov) xvf0Var5.get(), (zov) xvf0Var3.get(), (dpv) xvf0Var2.get(), (com.yandex.go.navigator.incidents.report.a) xvf0Var4.get(), (tt2) xvf0Var.get());
            case 14:
                return new w3i((Context) xvf0Var8.get(), (qcp0) xvf0Var7.get(), (hwy0) xvf0Var6.get(), (l7x0) xvf0Var5.get(), (dci) xvf0Var3.get(), (jwh) xvf0Var2.get(), (qdc) xvf0Var4.get(), (yuj0) xvf0Var.get());
            case 15:
                return new set((Activity) xvf0Var8.get(), (p4t) xvf0Var7.get(), (c9t) xvf0Var6.get(), (t) xvf0Var5.get(), (tmt0) xvf0Var3.get(), (l) xvf0Var2.get(), (kse) xvf0Var4.get(), (noy0) xvf0Var.get());
            case 16:
                return new sgx((Handler) xvf0Var8.get(), (wff0) xvf0Var7.get(), (w3c) xvf0Var6.get(), (a5e) xvf0Var5.get(), i5m.a(xvf0Var3), (k02) xvf0Var2.get(), (k020) xvf0Var4.get(), (com.yandex.messaging.a) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.preorder.interactor.g((git0) xvf0Var8.get(), (ru.yandex.taxi.search.suggest.i) xvf0Var7.get(), (po21) xvf0Var6.get(), (ru.yandex.taxi.preorder.source.sourcepointzone.a) xvf0Var5.get(), (ru.yandex.taxi.e) xvf0Var3.get(), (com.yandex.go.navigation.screen.c) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var4.get(), (s8z) xvf0Var.get());
            case 18:
                return new j((to3) xvf0Var8.get(), (naz0) xvf0Var7.get(), (oab) xvf0Var6.get(), (k020) xvf0Var5.get(), (lqo) xvf0Var3.get(), (kse) xvf0Var2.get(), (ks10) xvf0Var4.get(), (doc) xvf0Var.get());
            case 19:
                com.yandex.div.core.expression.variables.a aVar2 = (com.yandex.div.core.expression.variables.a) xvf0Var8.get();
                aj30 aj30Var = (aj30) xvf0Var7.get();
                g0p g0pVar = (g0p) xvf0Var6.get();
                mir mirVar = (mir) xvf0Var5.get();
                hpq hpqVar = (hpq) xvf0Var3.get();
                ru.yandex.taxi.masstransit.main.flex.a aVar3 = (ru.yandex.taxi.masstransit.main.flex.a) xvf0Var2.get();
                Context context2 = (Context) xvf0Var4.get();
                w030 w030Var2 = (w030) xvf0Var.get();
                zm5 zm5Var = new zm5(aVar2, 2);
                hdi hdiVar = new hdi(0, w030Var2);
                hpqVar.getClass();
                return mirVar.a(new vlr("Masstransit", zm5Var, aj30Var, g0pVar, new nfh(context2, hdiVar, new vbh(false)), null, null, null, null, null, null, null, null, null, Collections.singletonList(aVar3), null, null, null, null, 1015746));
            case 20:
                return new y050((Integer) xvf0Var8.get(), (com.yandex.go.places.impl.domain.interactors.my.places.a) xvf0Var7.get(), (po21) xvf0Var6.get(), (go80) xvf0Var5.get(), (u050) xvf0Var3.get(), (rac0) xvf0Var2.get(), (pwy0) xvf0Var4.get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) xvf0Var.get());
            case 21:
                return new com.yandex.messaging.internal.authorized.chat.l((Context) xvf0Var8.get(), (o1b0) xvf0Var7.get(), (at2) xvf0Var6.get(), (sb7) xvf0Var5.get(), (oeb) xvf0Var3.get(), (rp21) xvf0Var2.get(), (z5z) xvf0Var4.get(), i5m.a(xvf0Var));
            case 22:
                return new m((Context) xvf0Var8.get(), (com.yandex.go.navigator.providers.a) xvf0Var7.get(), (ah00) xvf0Var6.get(), (re50) xvf0Var5.get(), (bzw) xvf0Var3.get(), (e621) xvf0Var2.get(), (f) xvf0Var4.get(), (pwy0) xvf0Var.get());
            case 23:
                return new com.yandex.go.taxi.order.view.l((tse) xvf0Var8.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var7.get(), (mhf) xvf0Var6.get(), (com.yandex.go.taxi.order.multi.feed.domain.a) xvf0Var5.get(), (jc00) xvf0Var3.get(), (mw40) xvf0Var2.get(), (sa80) xvf0Var4.get(), (y4k0) xvf0Var.get());
            case 24:
                return new OrdersListModalView((Context) xvf0Var8.get(), (tse) xvf0Var7.get(), (oc80) xvf0Var6.get(), (ry70) xvf0Var5.get(), (RecenterButton) xvf0Var3.get(), (gpq) xvf0Var2.get(), i5m.a(xvf0Var4), (jc00) xvf0Var.get());
            case 25:
                return new com.yandex.go.places.impl.domain.interactors.map.f((com.yandex.go.places.impl.domain.interactors.a) xvf0Var8.get(), (nfc0) xvf0Var7.get(), (wbc0) xvf0Var6.get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) xvf0Var5.get(), (mg80) xvf0Var3.get(), (a4j0) xvf0Var2.get(), (dl80) xvf0Var4.get(), (u050) xvf0Var.get());
            case 26:
                return new com.yandex.go.taxi.order.details.v2.analytics.g((o2y0) xvf0Var7.get(), (com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a) xvf0Var6.get(), (com.yandex.go.taxi.order.details.v2.state.d) xvf0Var5.get(), (xbk0) xvf0Var3.get(), (mlk0) xvf0Var2.get(), (yxx0) xvf0Var4.get(), (com.yandex.go.taxi.order.view.l) xvf0Var.get());
            case 27:
                return new com.yandex.go.taxi.order.cost_center.b((b20) xvf0Var8.get(), (ChangeOrderApi) xvf0Var7.get(), (ga9) xvf0Var6.get(), (ysg) xvf0Var5.get(), (cda0) xvf0Var3.get(), (wnt) xvf0Var2.get(), (e2y0) xvf0Var4.get(), (zuj0) xvf0Var.get());
            case 28:
                return new com.yandex.go.scooters.offers.v2.components.bottom.domain.a((Context) xvf0Var8.get(), (e) xvf0Var7.get(), (y5p0) xvf0Var6.get(), (b3n0) xvf0Var5.get(), (z2o0) xvf0Var3.get(), (wrr0) xvf0Var2.get(), (zgo0) xvf0Var4.get(), (hxo0) xvf0Var.get());
            default:
                return new pmp0((mhf) xvf0Var8.get(), (n050) xvf0Var7.get(), (hyb) xvf0Var6.get(), (AddressResolveRepository) xvf0Var5.get(), (fy01) xvf0Var3.get(), (i130) xvf0Var2.get(), (i6r) xvf0Var4.get(), this.i);
        }
    }
}
