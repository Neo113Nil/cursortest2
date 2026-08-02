package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.cards.data.f;
import com.yandex.go.payments.cards.data.h;
import com.yandex.go.preload.g;
import com.yandex.go.superapp.discovery.map.impl.experiments.s;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.p;
import com.yandex.go.superapp.searchbar.impl.domain.c;
import com.yandex.go.superapp.web.view.a;
import com.yandex.go.zone.interactors.b;
import ru.yandex.taxi.summary.promotions.repository.e;
import ru.yandex.taxi.superapp.address.j;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes10.dex */
public final class rmv0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ rmv0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new qmv0((Lifecycle) xvf0Var2.get(), (e) xvf0Var.get());
            case 1:
                return new env0((wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 2:
                return new j((rvf0) xvf0Var2.get(), (atd0) xvf0Var.get());
            case 3:
                return new s((rqo) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 4:
                return new p((rqo) xvf0Var2.get(), (f5w0) xvf0Var.get());
            case 5:
                return new ru.yandex.taxi.experiments.superapp.j((rqo) xvf0Var2.get(), (qmp) xvf0Var.get());
            case 6:
                return new u0w0((b) xvf0Var2.get(), (hit) xvf0Var.get());
            case 7:
                return new m1w0(i5m.a(xvf0Var2), (k42) xvf0Var.get());
            case 8:
                return new l2w0((pep0) xvf0Var2.get(), xvf0Var);
            case 9:
                return new zxs0(i5m.a(xvf0Var2), (a) xvf0Var.get());
            case 10:
                return xpb1.y((m7w0) xvf0Var2.get(), (w030) xvf0Var.get());
            case 11:
                return new c((qwc) xvf0Var2.get(), (n) xvf0Var.get());
            case 12:
                return new tew0((eex) xvf0Var2.get(), (ky2) xvf0Var.get());
            case 13:
                return new afw0((bfw0) xvf0Var2.get(), (com.yandex.div.core.expression.variables.a) xvf0Var.get());
            case 14:
                return new com.yandex.go.suggest.impl.router.a(xvf0Var2, (com.yandex.go.lifecycle.a) xvf0Var.get());
            case 15:
                return new com.yandex.go.suggest.impl.data.experiments.j((rqo) xvf0Var2.get(), (q1w0) xvf0Var.get());
            case 16:
                return new tms((lhw0) xvf0Var2.get(), (com.yandex.div.core.expression.variables.a) xvf0Var.get());
            case 17:
                return new f((h) xvf0Var2.get(), (ql3) xvf0Var.get());
            case 18:
                return new tiw0((tt2) xvf0Var2.get(), (as21) xvf0Var.get());
            case 19:
                return new zjw0((dne0) xvf0Var2.get(), (crg) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.surge.repository.c((tt2) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 21:
                return new g((axw0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 22:
                return new jyw0((pav) xvf0Var2.get(), xvf0Var);
            case 23:
                return new t((Context) xvf0Var2.get(), (w030) xvf0Var.get(), 10);
            case 24:
                return new jjx0((dqe0) xvf0Var2.get(), (ijj0) xvf0Var.get());
            case 25:
                return new com.yandex.go.taxi.tariffs.analytics.c((tse) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 26:
                return new dox0((dqe0) xvf0Var.get(), (wiq0) xvf0Var2.get());
            case 27:
                return new nrx0((wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 28:
                return new hux0((e2t) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            default:
                return new fwx0(xvf0Var2, (oep0) xvf0Var.get());
        }
    }
}
