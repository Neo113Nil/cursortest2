package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.f;
import com.yandex.go.payments.domain.r0;
import com.yandex.go.shortcuts.impl.router.a;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.d;
import com.yandex.go.superapp.discovery.map.impl.experiments.s;
import com.yandex.go.telemetry.ui.TelemetryReportModalView;
import com.yandex.go.tips.ui.selector_v1.TipsSelectorModalView;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widgets.data.repository.t;

/* loaded from: classes10.dex */
public final class yvr0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ yvr0(v7p v7pVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = v7pVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new xvr0((t) xvf0Var2.get(), (pw40) ((q9g) xvf0Var).get());
            case 1:
                return new a(i5m.a(xvf0Var2), (syr0) ((kpp0) xvf0Var).get());
            case 2:
                return new b((z541) xvf0Var2.get(), (ru.yandex.taxi.layers.presentation.walkroute.simple.a) ((kpp0) xvf0Var).get());
            case 3:
                return new t8u0((m) ((sii) xvf0Var).get(), (gh60) xvf0Var2.get());
            case 4:
                return new w6v0((h6v0) ((kxl0) xvf0Var).get(), (e0w0) xvf0Var2.get());
            case 5:
                return new yfv0((wiq0) xvf0Var2.get(), (vfv0) ((wjr0) xvf0Var).get());
            case 6:
                return new hhs0(12, (wiq0) xvf0Var2.get(), (r0) ((g931) xvf0Var).get());
            case 7:
                return new com.yandex.go.superapp_carts.data.a((awp0) xvf0Var, (com.yandex.go.lifecycle.a) xvf0Var2.get());
            case 8:
                return new tig0((lx4) xvf0Var2.get(), (x770) ((miv0) xvf0Var).get());
            case 9:
                return new f((tt00) ((bvx) xvf0Var).get(), (tse) xvf0Var2.get());
            case 10:
                return new com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.a((s) xvf0Var2.get(), (d) ((rxm0) xvf0Var).get());
            case 11:
                return new tig0((com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.f) xvf0Var2.get(), (nfh) ((m5v0) xvf0Var).get());
            case 12:
                xcv0 xcv0Var = (xcv0) ((vrt0) xvf0Var).get();
                return new jlx0(xcv0Var);
            case 13:
                return new zxs0((zuj0) xvf0Var2.get(), (nw8) ((w7y0) xvf0Var).get());
            case 14:
                return new zc((w030) xvf0Var2.get(), (hlx0) ((qxu0) xvf0Var).get(), 13);
            case 15:
                return new n9y0((lx4) xvf0Var2.get(), (jc4) ((hro) xvf0Var).get());
            case 16:
                return new zc((w030) xvf0Var2.get(), (TelemetryReportModalView) ((yvr0) xvf0Var).get(), 14);
            case 17:
                return new TelemetryReportModalView((Context) xvf0Var2.get(), (udy0) ((kxl0) xvf0Var).get());
            case 18:
                return new com.yandex.go.payments.promo.navigation.a((fx60) xvf0Var2.get(), (ci3) xvf0Var);
            case 19:
                return new TipsSelectorModalView((Context) xvf0Var2.get(), (xgz0) ((egx0) xvf0Var).get());
            case 20:
                return new hwz0((pav) ((u9g) xvf0Var).get(), (c) ((u9g) xvf0Var2).get());
            case 21:
                return new kcz0((c4g) ((yti) xvf0Var).get(), (z501) xvf0Var2.get());
            case 22:
                return new f601((h601) xvf0Var2.get(), (jc60) xvf0Var);
            case 23:
                return new a201(2, (kcz0) ((yvr0) xvf0Var2).get(), (c4g) ((yti) xvf0Var).get());
            case 24:
                return new ru.yandex.taxi.translations.a((ru.yandex.taxi.translations.interactor.a) ((dby0) xvf0Var).get(), (hit) xvf0Var2.get());
            case 25:
                return new oz01((zuj0) xvf0Var2.get(), (z2b0) ((le30) xvf0Var).get());
            case 26:
                return new zh11((jtq0) ((nup0) xvf0Var).get(), (dne0) xvf0Var2.get());
            case 27:
                return new com.yandex.go.scooters.data.mapper.f((wnt) xvf0Var2.get(), i5m.a((e8b0) xvf0Var));
            case 28:
                return new rfw0((Activity) xvf0Var2.get(), (y631) ((bi4) xvf0Var).get());
            default:
                return new com.yandex.delivery.libs.imageupload.impl.domain.b((com.yandex.delivery.libs.imageupload.impl.data.a) ((d701) xvf0Var).get());
        }
    }

    public /* synthetic */ yvr0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
