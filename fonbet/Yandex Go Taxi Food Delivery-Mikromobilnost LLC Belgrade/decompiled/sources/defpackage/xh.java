package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.yandex.go.accessibility.b;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.payments.data.p;
import com.yandex.go.proxyprovision.j;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.domain.repositories.e;
import com.yandex.go.taxi.order.recenter.n;
import com.yandex.go.taxi.order.y;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.storage.experiments.ExperimentsDatabaseRoom;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.cashback.f;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.masstransit.domain.q;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.preorder.source.domain.a;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.widget.d;

/* loaded from: classes.dex */
public final class xh implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public /* synthetic */ xh(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new b((Context) xvf0Var6.get(), (tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), (rqo) xvf0Var5.get(), (ac20) xvf0Var.get(), (dne0) xvf0Var4.get());
            case 1:
                return new a((com.yandex.go.route.interactor.b) xvf0Var6.get(), (ysd0) xvf0Var3.get(), (caq0) xvf0Var2.get(), (so0) xvf0Var5.get(), (jyd) xvf0Var.get(), (i) xvf0Var4.get());
            case 2:
                return new g51((y9y0) xvf0Var6.get(), (g0j) xvf0Var3.get(), (dsd) xvf0Var2.get(), (tjt0) xvf0Var5.get(), (l3o) xvf0Var.get(), (zuj0) xvf0Var4.get());
            case 3:
                return qb1.d().c((ma1) xvf0Var6.get(), (Context) xvf0Var3.get(), (tt2) xvf0Var2.get(), (kb1) xvf0Var5.get(), i5m.a(xvf0Var), (dp60) xvf0Var4.get());
            case 4:
                return new ru.yandex.taxi.stories.data.caching.a((Context) xvf0Var6.get(), (pav) xvf0Var3.get(), (d) xvf0Var2.get(), (ru.yandex.taxi.communications.common.repository.a) xvf0Var5.get(), (tt2) xvf0Var.get(), ((g9y0) xvf0Var4.get()).a.a());
            case 5:
                return new ru.yandex.taxi.am.internal.b((Application) xvf0Var6.get(), (k) xvf0Var3.get(), (j5z) xvf0Var2.get(), (mrj0) xvf0Var5.get(), (m) xvf0Var.get(), (ru.yandex.taxi.am.token.a) xvf0Var4.get());
            case 6:
                return new com.yandex.go.benefits_center.benefits.router.a((wgr) xvf0Var6.get(), i5m.a(xvf0Var3), (com.yandex.go.benefits_center.benefits.sdk.document.a) xvf0Var2.get(), (bn5) xvf0Var5.get(), (co5) xvf0Var.get(), i5m.a(xvf0Var4));
            case 7:
                return new com.yandex.go.taxi.order.delegates.a((yi7) xvf0Var6.get(), this.c, (s7h) xvf0Var2.get(), (tse) xvf0Var5.get(), (oep0) xvf0Var.get(), (com.yandex.go.taxi.order.domain.a) xvf0Var4.get());
            case 8:
                return new com.yandex.go.taxi.order.paymentmethods.a((y) xvf0Var6.get(), (e) xvf0Var3.get(), i5m.a(xvf0Var2), (ysg) xvf0Var5.get(), (p2y0) xvf0Var.get(), (tt2) xvf0Var4.get());
            case 9:
                return new wqe((lng) xvf0Var6.get(), (f2s0) xvf0Var3.get(), (tlw0) xvf0Var2.get(), (qy2) xvf0Var5.get(), (g) xvf0Var.get(), (o4i) xvf0Var4.get());
            case 10:
                com.ybsdk.common.repositiories.creditlimit.a aVar = (com.ybsdk.common.repositiories.creditlimit.a) xvf0Var6.get();
                com.ybsdk.common.e eVar = (com.ybsdk.common.e) xvf0Var2.get();
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) xvf0Var5.get();
                return new com.ybsdk.common.domain.a(aVar, eVar, appAnalyticsReporter);
            case 11:
                return new ru.yandex.taxi.search.router.a((com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var6.get(), (o) xvf0Var3.get(), (com.yandex.go.route.interactor.b) xvf0Var2.get(), (cyx) xvf0Var5.get(), this.f, (hnb0) xvf0Var4.get());
            case 12:
                return new ysg((fn21) xvf0Var6.get(), (Context) xvf0Var3.get(), (tse) xvf0Var2.get(), (wnt) xvf0Var5.get(), (com.yandex.go.superapp.orders.known.b) xvf0Var.get(), (tt2) xvf0Var4.get());
            case 13:
                return new f(i5m.a(xvf0Var6), (Activity) xvf0Var3.get(), (tse) xvf0Var2.get(), (ru.yandex.taxi.cashback.interactors.i) xvf0Var5.get(), (z0j) xvf0Var.get(), (i130) xvf0Var4.get());
            case 14:
                return new ru.yandex.taxi.am.token.a((po60) xvf0Var6.get(), (qo60) xvf0Var3.get(), (ru.yandex.taxi.am.token.internal.b) xvf0Var2.get(), i5m.a(xvf0Var5), (ru11) xvf0Var.get(), (mo60) xvf0Var4.get());
            case 15:
                return new b7i(i5m.a(xvf0Var6), (u6i) xvf0Var3.get(), (u7i) xvf0Var2.get(), (AppVisibilitySubscriptionImpl) xvf0Var5.get(), (st2) xvf0Var.get(), (yuj0) xvf0Var4.get());
            case 16:
                return new oei((c) xvf0Var6.get(), (t5i) xvf0Var3.get(), this.d, (ru.yandex.taxi.logistics.experiments.k) xvf0Var5.get(), this.f, (qsi) xvf0Var4.get());
            case 17:
                return new com.yandex.go.logistics.cargo_flow.form.address.c((y5i) xvf0Var6.get(), (com.yandex.go.route.interactor.b) xvf0Var3.get(), (com.yandex.go.zone.interactors.b) xvf0Var2.get(), (kr0) xvf0Var5.get(), (j2t) xvf0Var.get(), (tse) xvf0Var4.get());
            case 18:
                return new kni((ru.yandex.taxi.logistics.sdk.dashboard.storage.c) xvf0Var6.get(), (czi0) xvf0Var3.get(), (ru.yandex.taxi.delivery.impl.paid_insurance.d) xvf0Var2.get(), (wdi) xvf0Var5.get(), (o3i) xvf0Var.get(), (wt90) xvf0Var4.get());
            case 19:
                return new yoi((cda0) xvf0Var6.get(), (o8a0) xvf0Var3.get(), (drd) xvf0Var2.get(), (p) xvf0Var5.get(), (xku0) xvf0Var.get(), (tma0) xvf0Var4.get());
            case 20:
                return new ru.yandex.taxi.masstransit.domain.c((tt2) xvf0Var6.get(), (ru.yandex.taxi.masstransit.domain.f) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (q) xvf0Var5.get(), (d0) xvf0Var.get(), (ru.yandex.taxi.masstransit.trains.config.a) xvf0Var4.get());
            case 21:
                final Context context = (Context) xvf0Var6.get();
                final Set set = (Set) xvf0Var3.get();
                final Set set2 = (Set) xvf0Var2.get();
                final com.yandex.div.core.expression.variables.a aVar2 = (com.yandex.div.core.expression.variables.a) xvf0Var5.get();
                final ip11 ip11Var = (ip11) xvf0Var.get();
                final u4l u4lVar = (u4l) xvf0Var4.get();
                return new hir() { // from class: zsl
                    @Override // defpackage.hir
                    public final void a(tjk tjkVar) {
                        tjkVar.j = com.yandex.div.core.expression.variables.a.this;
                        Context context2 = context;
                        tjkVar.h = new mwl(context2);
                        tjkVar.d = u4lVar;
                        Pair pair = new Pair("display", new ttl(context2));
                        ip11 ip11Var2 = ip11Var;
                        tjkVar.i = kotlin.collections.b.i(pair, new Pair("YangoHeadline", new zn51(context2, ip11Var2)), new Pair("YSDisplayCond-Heavy", new lkz(ip11Var2, context2, 2)), new Pair("YSDisplayCond-Bold", new lkz(ip11Var2, context2, 1)), new Pair("YSDisplayCond-Regular", new lkz(ip11Var2, context2, 3)), new Pair("Logotype", new lkz(ip11Var2, context2, 0)), new Pair("Italic", new t0x()), new Pair("YSDisplayCond", new mj51(context2)));
                        tjkVar.B = true;
                        tjkVar.e = new xjd(kotlin.collections.a.J0(set));
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            tjkVar.b((dpk) it.next());
                        }
                    }
                };
            case 22:
                return new com.yandex.go.agreement.deeplink.b((tse) xvf0Var6.get(), (h) xvf0Var3.get(), (ru.yandex.taxi.am.token.a) xvf0Var2.get(), (jj3) xvf0Var5.get(), (gf41) xvf0Var.get(), (zh11) xvf0Var4.get());
            case 23:
                return new com.yandex.messaging.domain.experiments.a((ExperimentsDatabaseRoom) xvf0Var6.get(), (rro) xvf0Var3.get(), (el21) xvf0Var2.get(), (xdf0) xvf0Var5.get(), (qro) xvf0Var.get(), (tgy0) xvf0Var4.get());
            case 24:
                return new eks((hjs) xvf0Var6.get(), (x51) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (w030) xvf0Var5.get(), (rjs) xvf0Var.get(), (mjs) xvf0Var4.get());
            case 25:
                return new com.yandex.messaging.domain.folders.g((com.yandex.messaging.internal.backendconfig.a) xvf0Var6.get(), (u4r) xvf0Var3.get(), (MessengerEnvironment) xvf0Var2.get(), (pxr) xvf0Var5.get(), (w5t) xvf0Var.get(), (kse) xvf0Var4.get());
            case 26:
                return new ru.yandex.taxi.location.lbs.gsm.a((m3u) xvf0Var6.get(), (tt2) xvf0Var3.get(), (ru.yandex.taxi.location.lbs.b) xvf0Var2.get(), (ru.yandex.taxi.location.a) xvf0Var5.get(), (q7y) xvf0Var.get(), (rk0) xvf0Var4.get());
            case 27:
                return new com.yandex.go.inapp_calls.navigation.c((Context) xvf0Var6.get(), (com.yandex.go.inapp_calls.repository.c) xvf0Var3.get(), (com.yandex.go.inapp_calls.experiment.q) xvf0Var2.get(), (tj60) xvf0Var5.get(), (njv) xvf0Var.get(), (j) xvf0Var4.get());
            case 28:
                return new com.yandex.go.inapp_calls.interactor.a((ru.yandex.taxi.am.token.a) xvf0Var6.get(), (fn21) xvf0Var3.get(), (j5z) xvf0Var2.get(), (tj21) xvf0Var5.get(), (com.yandex.go.inapp_calls.experiment.q) xvf0Var.get(), (ju6) xvf0Var4.get());
            default:
                return new com.yandex.go.layers.domain.g((tse) xvf0Var6.get(), (ysd0) xvf0Var3.get(), (com.yandex.go.layers.domain.a) xvf0Var2.get(), (iu8) xvf0Var5.get(), (n) xvf0Var.get(), (ah00) xvf0Var4.get());
        }
    }
}
