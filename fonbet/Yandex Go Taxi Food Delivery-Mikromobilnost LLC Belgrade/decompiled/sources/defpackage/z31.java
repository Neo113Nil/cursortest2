package defpackage;

import android.content.Context;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.fragment.map.AddressMapRouteOverlay$attach$$inlined$safeCollectIn$1;
import ru.yandex.taxi.routes.presentation.c;

/* loaded from: classes5.dex */
public final class z31 extends c {
    public final com.yandex.go.route.interactor.c V;
    public final hbp0 W;

    public z31(tt2 tt2Var, leh lehVar, rqo rqoVar, ah00 ah00Var, el00 el00Var, xm00 xm00Var, lr00 lr00Var, et00 et00Var, cv00 cv00Var, b2l0 b2l0Var, rjt0 rjt0Var, sgu0 sgu0Var, opz0 opz0Var, iqz0 iqz0Var, Context context, com.yandex.go.route.interactor.c cVar, o oVar) {
        super(ah00Var, context, xm00Var, lehVar, b2l0Var, oVar, el00Var, cv00Var, sgu0Var, lr00Var, tt2Var, et00Var, opz0Var, iqz0Var, ((jbh) rqoVar).a(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS), rjt0Var);
        this.V = cVar;
        String str = (2 & 1) != 0 ? null : "address-map-route-overlay";
        this.W = new hbp0(new czo0(14), str == null ? "" : str, null);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void Lg(lgl0 lgl0Var) {
        xm00 xm00Var;
        ap00 ap00Var;
        super.Lg(lgl0Var);
        if (this.S == null || !(!r2.n().isEmpty()) || (xm00Var = this.S) == null || (ap00Var = (ap00) xm00Var.n().get(0)) == null) {
            return;
        }
        ap00Var.i(false);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final tpr Og() {
        return this.V.f();
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void attach() {
        super.attach();
        hbp0 hbp0Var = this.W;
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new AddressMapRouteOverlay$attach$$inlined$safeCollectIn$1(Ng(), null, this), 3);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void detach() {
        super.detach();
        this.W.b();
    }
}
