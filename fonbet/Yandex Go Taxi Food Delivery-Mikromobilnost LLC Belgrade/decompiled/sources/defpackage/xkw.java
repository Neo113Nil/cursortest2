package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.payments.data.p;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.preload.e;
import com.yandex.go.shortcuts.impl.interactors.m;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.k;
import com.yandex.go.taxi.order.api.OrderApi;
import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.go.taxi.order.r;
import com.yandex.go.taxi.order.y;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.layers.b;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes8.dex */
public final class xkw implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ xkw(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new k((klw) xvf0Var5.get(), (f) xvf0Var.get(), (a) xvf0Var4.get(), (i) xvf0Var3.get(), (rqo) xvf0Var2.get());
            case 1:
                return new wpw((i6r) xvf0Var5.get(), this.c, (d) xvf0Var4.get(), (rpw) xvf0Var3.get(), (y) xvf0Var2.get());
            case 2:
                return new zux((Context) xvf0Var5.get(), (lx4) xvf0Var.get(), (h0b0) xvf0Var4.get(), (k0b0) xvf0Var3.get(), (n) xvf0Var2.get());
            case 3:
                return new com.yandex.go.zone.interactors.d((o) xvf0Var5.get(), (c) xvf0Var.get(), (tt2) xvf0Var4.get(), (tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get());
            case 4:
                return new ru.yandex.taxi.startup.launch.jobs.a((ru.yandex.taxi.startup.launch.c) xvf0Var5.get(), (h) xvf0Var.get(), (e) xvf0Var4.get(), (tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get());
            case 5:
                return new ru.yandex.taxi.map_common.a((tse) xvf0Var5.get(), (Lifecycle) xvf0Var.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2));
            case 6:
                return new b((ysd0) xvf0Var5.get(), (i6r) xvf0Var.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2));
            case 7:
                return new r((OrderApi) xvf0Var5.get(), (ky2) xvf0Var.get(), (a880) xvf0Var4.get(), (po21) xvf0Var3.get(), i5m.a(xvf0Var2));
            case 8:
                bru0 bru0Var = (bru0) xvf0Var5.get();
                ru.yandex.taxi.locationsdk.core.location_bus.internal.a aVar = (ru.yandex.taxi.locationsdk.core.location_bus.internal.a) xvf0Var.get();
                ru.yandex.taxi.locationsdk.core.input_controller.internal.b bVar = (ru.yandex.taxi.locationsdk.core.input_controller.internal.b) xvf0Var4.get();
                c7z c7zVar = (c7z) xvf0Var3.get();
                rcz rczVar = (rcz) xvf0Var2.get();
                TimestampSelector timestampSelector = ucz.a;
                com.yandex.go.config.h hVar = new com.yandex.go.config.h(new com.yandex.go.config.f(((com.yandex.go.config.i) bru0Var).d));
                TimestampSelector timestampSelector2 = ucz.a;
                kjz kjzVar = new kjz(28, c7zVar, timestampSelector2);
                my80 my80Var = new my80();
                return new ru.yandex.taxi.locationsdk.core.processor_controller.internal.d(new t6f0(0, hVar), kjzVar, new vms(my80Var), aVar, bVar, timestampSelector2, rczVar, new s6f0(0));
            case 9:
                return new kem((tt2) xvf0Var5.get(), (tse) xvf0Var.get(), (g) xvf0Var4.get(), (wmh) xvf0Var3.get(), (djz) xvf0Var2.get());
            case 10:
                return new com.yandex.go.safety.center.lost_item.lcp.a((Lifecycle) xvf0Var5.get(), (n3h) xvf0Var.get(), (tse) xvf0Var4.get(), i5m.a(xvf0Var3), (com.yandex.go.safety.center.lost_item.data.a) xvf0Var2.get());
            case 11:
                return new v300((q4x) xvf0Var5.get(), (ms2) xvf0Var.get(), (rrt0) xvf0Var4.get(), (fva0) xvf0Var3.get(), (MainUiAvailabilityMonitor) xvf0Var2.get());
            case 12:
                ru.yandex.taxi.address.interactor.a aVar2 = (ru.yandex.taxi.address.interactor.a) xvf0Var5.get();
                ru.yandex.taxi.widget.utils.e eVar = (ru.yandex.taxi.widget.utils.e) xvf0Var.get();
                ru.yandex.taxi.delivery.pin.k kVar = (ru.yandex.taxi.delivery.pin.k) xvf0Var4.get();
                return new com.yandex.go.pin.repository.b((nj6) xvf0Var2.get(), (wiq0) xvf0Var3.get(), aVar2, kVar, eVar);
            case 13:
                return new com.yandex.go.shortcuts.impl.interactors.g((m) xvf0Var5.get(), (ru.yandex.taxi.stories.domain.b) xvf0Var.get(), i5m.a(xvf0Var4), (Lifecycle) xvf0Var3.get(), (tse) xvf0Var2.get());
            case 14:
                return new ru.yandex.taxi.masstransit.domain.f((ru.yandex.taxi.widget.utils.e) xvf0Var5.get(), (pwy0) xvf0Var.get(), (tt2) xvf0Var4.get(), (zuj0) xvf0Var3.get(), (ru.yandex.taxi.am.g) xvf0Var2.get());
            case 15:
                return new fq30((Context) xvf0Var5.get(), (pav) xvf0Var.get(), (NotificationStackComponent) xvf0Var4.get(), (tse) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 16:
                return new ru.yandex.taxi.masstransit.promo.b((ru.yandex.taxi.persuggest.source.a) xvf0Var5.get(), (nmx) xvf0Var.get(), (wiq0) xvf0Var4.get(), (ru.yandex.taxi.preorder.source.userposition.b) xvf0Var3.get(), (ru.yandex.taxi.h) xvf0Var2.get());
            case 17:
                return new ru.yandex.taxi.settings.main.k(i5m.a(xvf0Var5), (acz) xvf0Var.get(), (nni0) xvf0Var4.get(), (ru.yandex.taxi.settings.email.a) xvf0Var3.get(), (hit) xvf0Var2.get());
            case 18:
                return new com.yandex.go.messenger_native.a((tse) xvf0Var5.get(), (Lifecycle) xvf0Var.get(), (tt2) xvf0Var4.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2));
            case 19:
                return new nd50((Context) xvf0Var5.get(), (zuj0) xvf0Var.get(), (xk60) xvf0Var4.get(), (y72) xvf0Var3.get(), (pw2) xvf0Var2.get());
            case 20:
                return new lf50((tse) xvf0Var5.get(), (mg50) xvf0Var.get(), (cb50) xvf0Var4.get(), (oc50) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 21:
                return new ru.yandex.taxi.orderforanother.repository.a((yyq0) xvf0Var5.get(), (wiq0) xvf0Var.get(), (tv70) xvf0Var4.get(), (com.yandex.go.route.interactor.c) xvf0Var3.get(), (po21) xvf0Var2.get());
            case 22:
                return new com.yandex.go.taxi.order.factory.a((n20) xvf0Var5.get(), (xwp0) xvf0Var.get(), (xv11) xvf0Var4.get(), (bg5) xvf0Var3.get(), i5m.a(xvf0Var2));
            case 23:
                return new a090((u500) xvf0Var5.get(), (cba0) xvf0Var.get(), (g90) xvf0Var4.get(), (i130) xvf0Var3.get(), (hcs) xvf0Var2.get());
            case 24:
                return new com.yandex.go.domain.interactor.a((com.yandex.go.repositories.e) xvf0Var5.get(), (ru.yandex.taxi.am.m) xvf0Var.get(), (tt2) xvf0Var4.get(), (tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get());
            case 25:
                return new paa0((qea0) xvf0Var5.get(), (p) xvf0Var.get(), (drd) xvf0Var4.get(), (i0) xvf0Var3.get(), (tea0) xvf0Var2.get());
            case 26:
                return new com.yandex.go.payments_widgets.mini.widgets.data.a((hea0) xvf0Var5.get(), (ru.yandex.taxi.am.m) xvf0Var.get(), (com.yandex.go.navigation.screen.c) xvf0Var4.get(), (dea0) xvf0Var3.get(), (zww0) xvf0Var2.get());
            case 27:
                return new rsa0((kse) xvf0Var5.get(), (i6f0) xvf0Var.get(), (wff0) xvf0Var4.get(), (ax80) xvf0Var3.get(), (at2) xvf0Var2.get());
            case 28:
                return new com.yandex.go.inapp_calls.ui.permission.a((Activity) xvf0Var5.get(), (ip11) xvf0Var.get(), (pav) xvf0Var4.get(), (k7x0) xvf0Var3.get(), (q) xvf0Var2.get());
            default:
                return new ru.yandex.taxi.personalstate.data.remote.b((on2) xvf0Var5.get(), (tt2) xvf0Var.get(), (y6b0) xvf0Var4.get(), (as21) xvf0Var3.get(), (ru.yandex.taxi.personalstate.data.remote.a) xvf0Var2.get());
        }
    }
}
