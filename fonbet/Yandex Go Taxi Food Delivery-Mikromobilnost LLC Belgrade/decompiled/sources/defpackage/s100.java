package defpackage;

import android.content.Context;
import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroRouteOverlay$attach$$inlined$safeCollectIn$1;
import ru.yandex.taxi.routes.presentation.c;

/* loaded from: classes5.dex */
public final class s100 extends c {
    public final com.yandex.go.route.interactor.c V;
    public final hbp0 W;

    public s100(tt2 tt2Var, leh lehVar, rqo rqoVar, ah00 ah00Var, el00 el00Var, xm00 xm00Var, lr00 lr00Var, et00 et00Var, cv00 cv00Var, b2l0 b2l0Var, rjt0 rjt0Var, sgu0 sgu0Var, opz0 opz0Var, iqz0 iqz0Var, Context context, com.yandex.go.route.interactor.c cVar, o oVar) {
        super(ah00Var, context, xm00Var, lehVar, b2l0Var, oVar, el00Var, cv00Var, sgu0Var, lr00Var, tt2Var, et00Var, opz0Var, iqz0Var, ((jbh) rqoVar).a(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS), rjt0Var);
        this.V = cVar;
        this.W = new hbp0(new czo0(14), "", null);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final boolean Ig() {
        return true;
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final boolean Kg() {
        return false;
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void Lg(lgl0 lgl0Var) {
        List<Point> points;
        Point point;
        super.Lg(lgl0Var);
        Polyline a = lgl0Var.a.a();
        if (a == null || (points = a.getPoints()) == null || (point = (Point) a.b0(points)) == null) {
            return;
        }
        ((gh00) ((ah00) this.b)).D(point, 17.0f, 300.0f, null);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final tpr Og() {
        return this.V.f();
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final boolean Pg() {
        return true;
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void attach() {
        super.attach();
        hbp0 hbp0Var = this.W;
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new MaasMetroRouteOverlay$attach$$inlined$safeCollectIn$1(Ng(), null, this), 3);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void detach() {
        super.detach();
        this.W.b();
    }
}
