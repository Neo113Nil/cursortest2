package defpackage;

import com.yandex.go.superapp.discovery.map.impl.domain.interactors.b;
import com.yandex.go.superapp_favorites.flex.document.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;
import ru.yandex.taxi.requirements.glued.interactor.d;
import ru.yandex.taxi.settings.api.PushSettingsApi;
import ru.yandex.taxi.surge.interactor.s;
import ru.yandex.taxi.surge.repository.c;

/* loaded from: classes14.dex */
public final class uzu0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public uzu0(pcz0 pcz0Var, f8g f8gVar) {
        this.a = 24;
        this.b = f8gVar;
    }

    public static uzu0 a(br00 br00Var) {
        return new uzu0(br00Var, 2);
    }

    public static uzu0 b(rbx0 rbx0Var) {
        return new uzu0(rbx0Var, 13);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new tzu0((PushSettingsApi) ((a6g) xvf0Var).get());
            case 1:
                return new l7s0((b1) ((c1) xvf0Var).get());
            case 2:
                return new b(((br00) xvf0Var).a);
            case 3:
                return new co40((pho) ((iag) xvf0Var).get());
            case 4:
                return ((smp) ((nag) xvf0Var).get()).a();
            case 5:
                return new x770((pho) ((nag) xvf0Var).get());
            case 6:
                return new a((com.yandex.go.superapp_favorites.flex.jason_state.a) ((cys0) xvf0Var).get());
            case 7:
                return ((smp) ((nag) xvf0Var).get()).a();
            case 8:
                c1m0 c1m0Var = (c1m0) ((jjl) ((nag) xvf0Var).get()).a.get();
                q5z.i(c1m0Var);
                return c1m0Var;
            case 9:
                return new piw0((lx4) ((qag) xvf0Var).get());
            case 10:
                return new com.yandex.go.taxi.order.support.data.mappers.b((com.yandex.go.taxi.order.support.data.mappers.a) ((y2s0) xvf0Var).get());
            case 11:
                return new s((c) ((sag) xvf0Var).get());
            case 12:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.tabs.a((q8s) ((p1g) xvf0Var).get());
            case 13:
                return new ubx0((o7r0) ((rbx0) xvf0Var).get());
            case 14:
                return new c1x0((e6t0) ((wun0) xvf0Var).get());
            case 15:
                v920 v920Var = (v920) ((mz70) xvf0Var).get();
                toj0 toj0Var = (toj0) ((h3y) v920Var.a).get();
                ru.yandex.taxi.preorder.summary.tariffpage.requirements.a aVar = (ru.yandex.taxi.preorder.summary.tariffpage.requirements.a) v920Var.b;
                dfj0 dfj0Var = (dfj0) v920Var.c;
                mnc mncVar = (mnc) ((yvf0) v920Var.w).get();
                g580 g580Var = (g580) v920Var.x;
                zkz0 zkz0Var = (zkz0) v920Var.y;
                toj0Var.getClass();
                aVar.getClass();
                dfj0Var.getClass();
                mncVar.getClass();
                g580Var.getClass();
                zkz0Var.getClass();
                return new q6g(toj0Var, aVar, dfj0Var, mncVar, g580Var, zkz0Var);
            case 16:
                return new zkz0((aqj0) ((zni0) xvf0Var).get());
            case 17:
                return new yfx0((d) ((x0z) xvf0Var).get());
            case 18:
                return new ru.yandex.taxi.preorder.summary.selector.analytics.b((pj) ((qy0) xvf0Var).get());
            case 19:
                return new ljg0((lx4) ((x2g) xvf0Var).get());
            case 20:
                return new co40((pho) ((xwf) xvf0Var).get());
            case 21:
                return new o7r0((pho) ((u4g) xvf0Var).get());
            case 22:
                return new bby0(i5m.a((w7y0) xvf0Var));
            case 23:
                return new jhu0((z4m0) ((ubq0) xvf0Var).get());
            case 24:
                return new ocz0((k8g) ((f8g) xvf0Var).get());
            case 25:
                return new jhu0((o61) ((gmh) xvf0Var).get());
            case 26:
                return new gtz0((xfv0) ((mz70) xvf0Var).get());
            case 27:
                return new yvz0((j) ((k4) xvf0Var).get());
            case 28:
                return new x770((pho) ((pcg) xvf0Var).get());
            default:
                return new c1x0((cjw0) ((flx0) xvf0Var).get());
        }
    }

    public /* synthetic */ uzu0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
