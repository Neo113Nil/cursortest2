package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.analytics.b;
import com.yandex.go.flex.main_screen.interactors.t;
import com.yandex.go.mainscreen.superapp.orders.domain.h;
import com.yandex.go.scooters.domain.u;
import com.yandex.go.scooters.ignition.data.d;
import com.yandex.go.scooters.ignition.data.i;
import com.yandex.go.scooters.live.domain.c;
import com.yandex.go.yb.domain.j;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.contacts.g;
import ru.yandex.taxi.scooters.data.a;
import ru.yandex.taxi.scooters.data.p;
import ru.yandex.taxi.superapp.f;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.themes.experiments.e;

/* loaded from: classes9.dex */
public final class rxm0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public rxm0(epp0 epp0Var, vrt0 vrt0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 10;
        this.b = vrt0Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
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
                return new a((vp21) xvf0Var4.get(), (fvt) xvf0Var3.get(), (po21) xvf0Var2.get(), (kb20) xvf0Var.get());
            case 1:
                return new jsn0((c1n0) xvf0Var4.get(), (n) xvf0Var3.get(), (m2o0) xvf0Var2.get(), (ugo0) xvf0Var.get());
            case 2:
                return new i((com.yandex.go.scooters.ignition.analytics.a) xvf0Var4.get(), (brn0) xvf0Var3.get(), (d) xvf0Var2.get(), (vqn0) xvf0Var.get());
            case 3:
                return new c((Context) xvf0Var4.get(), (tt2) xvf0Var3.get(), (b) xvf0Var2.get(), (com.yandex.go.scooters.live.domain.b) xvf0Var.get());
            case 4:
                return new fxn0((tse) xvf0Var4.get(), (b) xvf0Var3.get(), (com.yandex.go.scooters.live.domain.b) xvf0Var2.get(), (c) xvf0Var.get());
            case 5:
                return new u((tse) xvf0Var4.get(), (ycq0) xvf0Var3.get(), (com.yandex.go.scooters.payments.data.c) xvf0Var2.get(), (p) xvf0Var.get());
            case 6:
                return new o2o0((Context) xvf0Var4.get(), (zuj0) xvf0Var3.get(), (xk60) xvf0Var2.get(), (y72) xvf0Var.get());
            case 7:
                ru.yandex.taxi.launch.c cVar = (ru.yandex.taxi.launch.c) xvf0Var4.get();
                a aVar = (a) xvf0Var3.get();
                h3y a = i5m.a(xvf0Var2);
                return new ru.yandex.taxi.scooters.data.data_source.c(cVar, aVar, a);
            case 8:
                return new com.yandex.go.scooters.zones.legend.a((w030) xvf0Var4.get(), (fva0) xvf0Var3.get(), (map0) xvf0Var2.get(), (qap0) xvf0Var.get());
            case 9:
                return new j((Lifecycle) xvf0Var4.get(), i5m.a(xvf0Var3), (hit) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 10:
                return new com.ybsdk.utils.a((ppc) xvf0Var4.get(), (pxn) xvf0Var3.get(), (owk0) xvf0Var2.get(), (AppAnalyticsReporter) xvf0Var.get());
            case 11:
                return new g((Context) xvf0Var4.get(), (y50) xvf0Var3.get(), (ru.yandex.taxi.activity.g) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 12:
                return new com.yandex.go.flex.common.facade.routers.b((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (yhr) xvf0Var2.get(), (e2x0) xvf0Var.get());
            case 13:
                return new ru.yandex.taxi.push.handlers.c((wnt) xvf0Var4.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 14:
                return new com.yandex.go.splash.domain.a((tse) xvf0Var4.get(), (com.yandex.go.lifecycle.a) xvf0Var3.get(), (b400) xvf0Var2.get(), (com.yandex.go.splash.domain.c) xvf0Var.get());
            case 15:
                com.yandex.go.splash.domain.a aVar2 = (com.yandex.go.splash.domain.a) xvf0Var4.get();
                return new com.yandex.go.splash.domain.b(aVar2, (com.yandex.go.lifecycle.a) xvf0Var2.get(), (tse) xvf0Var.get());
            case 16:
                return new kcu0(i5m.a(xvf0Var4), (k020) xvf0Var3.get(), (odu0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 17:
                return new t((geu0) xvf0Var4.get(), (tyz0) xvf0Var3.get(), (yla0) xvf0Var2.get(), (zbw0) xvf0Var.get());
            case 18:
                return new com.yandex.go.styling.interactor.a((e) xvf0Var4.get(), (pay0) xvf0Var3.get(), i5m.a(xvf0Var2), (tt2) xvf0Var.get());
            case 19:
                return new com.yandex.go.preorder.suggested.menu.ui.c((com.yandex.go.pin.api.widget.a) xvf0Var4.get(), (r0c0) xvf0Var3.get(), (ru.yandex.taxi.zonemodes.j) xvf0Var2.get(), (s0c0) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.summary.promotions.models.b((k7x0) xvf0Var4.get(), (ru.yandex.taxi.widget.c) xvf0Var3.get(), (tt2) xvf0Var2.get(), (oxu0) xvf0Var.get());
            case 21:
                return new y4c0((f09) xvf0Var4.get(), (g09) xvf0Var3.get(), (tt2) xvf0Var2.get(), (fc5) xvf0Var.get(), 16);
            case 22:
                return new h((tt2) xvf0Var4.get(), (r551) xvf0Var3.get(), (j551) xvf0Var2.get(), (com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.e) xvf0Var.get());
            case 23:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.domain.g((z3w0) xvf0Var4.get(), (jc00) xvf0Var3.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.domain.e) xvf0Var2.get(), (mjv0) xvf0Var.get());
            case 24:
                return new com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.d((po21) xvf0Var4.get(), (com.yandex.go.superapp.discovery.map.impl.data.repositories.state.settlement.a) xvf0Var3.get(), (a7w0) xvf0Var2.get(), (dtv0) xvf0Var.get());
            case 25:
                return new com.yandex.go.external_service.auth.a((m) xvf0Var4.get(), (tse) xvf0Var3.get(), (f) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 26:
                return new y4c0((ru.yandex.taxi.am.g) xvf0Var4.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2), (rit) xvf0Var.get(), 17);
            case 27:
                return new xew0((ru.yandex.taxi.stories.domain.b) xvf0Var4.get(), (gnu0) xvf0Var3.get(), xvf0Var2, (zuj0) xvf0Var.get());
            case 28:
                return new rww0((y72) xvf0Var4.get(), i5m.a(xvf0Var3), (ng60) xvf0Var2.get(), (mg60) xvf0Var.get());
            default:
                return new com.yandex.go.account.am.domain.a((ip90) xvf0Var4.get(), (ep90) xvf0Var3.get(), (k) xvf0Var2.get(), (u02) xvf0Var.get());
        }
    }

    public /* synthetic */ rxm0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }
}
