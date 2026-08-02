package defpackage;

import android.content.Context;
import com.yandex.go.image.domain.a;
import com.yandex.go.mainscreen.superapp.impl.header.domain.h;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.am.f;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.logistics.order.g;
import ru.yandex.taxi.startup.launch.k;
import ru.yandex.taxi.startup.launch.response.e;
import ru.yandex.taxi.systemrequeirements.location.d;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.zalogin.j;

/* loaded from: classes9.dex */
public final class w7u implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ w7u(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        switch (i) {
            case 0:
                return new v7u((n20) xvf0Var.get(), (y7u) xvf0Var4.get(), (hem) xvf0Var3.get(), (rqo) xvf0Var2.get());
            case 1:
                return new csu((w4o) xvf0Var.get(), (b) xvf0Var4.get(), (r9y) xvf0Var3.get(), (dj4) xvf0Var2.get());
            case 2:
                return new a((Context) xvf0Var.get(), new kq2(xvf0Var4, 12), new kq2(xvf0Var3, 13), new ppr(12, (za90) xvf0Var2.get()));
            case 3:
                return new c9w((d9w) xvf0Var.get(), (wiq0) xvf0Var4.get(), (vp21) xvf0Var3.get(), (zuj0) xvf0Var2.get());
            case 4:
                return new o9w((dsd) xvf0Var.get(), (hpw) xvf0Var4.get(), (lmw) xvf0Var3.get(), (zuj0) xvf0Var2.get());
            case 5:
                return new acw((ifw) xvf0Var.get(), (com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (com.yandex.go.route.interactor.b) xvf0Var2.get());
            case 6:
                return new com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.b((com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var.get(), (c) xvf0Var4.get(), (b8r) xvf0Var3.get(), (xdf) xvf0Var2.get());
            case 7:
                return new gpw((w030) xvf0Var.get(), (udw) xvf0Var4.get(), (zjw) xvf0Var3.get(), (c2x0) xvf0Var2.get());
            case 8:
                return new nmx(i5m.a(xvf0Var), (n20) xvf0Var4.get(), (ol9) xvf0Var3.get(), (g) xvf0Var2.get());
            case 9:
                return new e(i5m.a(xvf0Var), i5m.a(xvf0Var4), (k) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 10:
                return new gzx((ah00) xvf0Var.get(), (no21) xvf0Var4.get(), (Context) xvf0Var3.get(), (vgf) xvf0Var2.get());
            case 11:
                return new sjy((f) xvf0Var.get(), (j) xvf0Var4.get(), (fhz) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 12:
                tt2 tt2Var = (tt2) xvf0Var.get();
                tse tseVar = (tse) xvf0Var4.get();
                com.yandex.go.superapp.order.multi.old.provider.g gVar = (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var3.get();
                return new ioy(tt2Var, tseVar, gVar.h(), (wmh) xvf0Var2.get());
            case 13:
                return new d((j7j0) xvf0Var.get(), (z9z) xvf0Var4.get(), (tt2) xvf0Var3.get(), (tse) xvf0Var2.get());
            case 14:
                return new ru.yandex.taxi.preorder.source.userposition.repository.f((hsx) xvf0Var.get(), (ai4) xvf0Var4.get(), (ru.yandex.taxi.map_common.map.d) xvf0Var3.get(), (ccz) xvf0Var2.get());
            case 15:
                return new com.yandex.go.sdk.a((ru.yandex.taxi.locationsdk.core.location_bus.internal.a) xvf0Var.get(), (ru.yandex.taxi.locationsdk.core.input_controller.internal.b) xvf0Var4.get(), (ru.yandex.taxi.locationsdk.core.processor_controller.internal.d) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 16:
                return new ru.yandex.taxi.logistics.deliveries.multiorder.d((tt2) xvf0Var.get(), i5m.a(xvf0Var4), (aiz) xvf0Var3.get(), (y7u) xvf0Var2.get());
            case 17:
                return new ru.yandex.taxi.logistics.deliveries.order.c((ru.yandex.taxi.logistics.sdk.management.f) xvf0Var.get(), (tt2) xvf0Var4.get(), (ru.yandex.taxi.delivery.b) xvf0Var3.get(), (zuj0) xvf0Var2.get());
            case 18:
                return new cxq0((a30) xvf0Var.get(), (tma0) xvf0Var4.get(), (eq51) xvf0Var3.get(), (u0a0) xvf0Var2.get(), 26);
            case 19:
                return new ru.yandex.taxi.maas.impl.deeplink.a((com.yandex.go.lifecycle.a) xvf0Var.get(), xvf0Var4, (ru.yandex.taxi.superapp.orders.multi.a) xvf0Var3.get(), xvf0Var2);
            case 20:
                return new q500((zuj0) xvf0Var.get(), (ru.yandex.taxi.settings.support.g) xvf0Var4.get(), (qw6) xvf0Var3.get(), (com.yandex.go.payments.shared.a) xvf0Var2.get());
            case 21:
                return new y4c0(this.b, (gf41) xvf0Var4.get(), (vpc) xvf0Var3.get(), (MapNotificationsMuteRepository) xvf0Var2.get(), 9);
            case 22:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a((sas0) xvf0Var.get(), (vc00) xvf0Var4.get(), (wc00) xvf0Var3.get(), (yc00) xvf0Var2.get());
            case 23:
                return new com.yandex.go.external_service.preloader.domain.g((ne00) xvf0Var.get(), (d7u0) xvf0Var4.get(), (ru.yandex.taxi.experiments.superapp.j) xvf0Var3.get(), (rqo) xvf0Var2.get());
            case 24:
                return new ru.yandex.taxi.order.analytics.marknotify.a((com.yandex.go.shortcuts.impl.interactors.e) xvf0Var.get(), (ru.yandex.taxi.order.analytics.marknotify.b) xvf0Var4.get(), (ru.yandex.taxi.jobs.b) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 25:
                return new j010(i5m.a(xvf0Var), i5m.a(xvf0Var4), (x111) xvf0Var3.get(), (oep0) xvf0Var2.get());
            case 26:
                return new ru.yandex.taxi.masstransit.orders.b((tse) xvf0Var.get(), (com.yandex.go.masstransit.sdk.order.impl.orders.k) xvf0Var4.get(), (m) xvf0Var3.get(), (qy2) xvf0Var2.get());
            case 27:
                return new ru.yandex.taxi.widget.utils.e((Context) xvf0Var.get(), (pav) xvf0Var4.get(), (pdc) xvf0Var3.get(), (c) xvf0Var2.get());
            case 28:
                return new h((com.yandex.go.repositories.e) xvf0Var.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var4.get(), (ru.yandex.taxi.am.g) xvf0Var3.get(), (usv0) xvf0Var2.get());
            default:
                return new ks20((ums0) xvf0Var.get(), (exu0) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (pdc) xvf0Var2.get(), 0);
        }
    }
}
