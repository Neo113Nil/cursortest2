package defpackage;

import android.content.Context;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.routes.presentation.c;
import ru.yandex.taxi.sdc.route.presentation.f;

/* loaded from: classes5.dex */
public final class t9l0 extends c {
    public final com.yandex.go.route.interactor.c V;
    public final f W;
    public final j741 Z;
    public final hbp0 a0;

    public t9l0(com.yandex.go.route.interactor.c cVar, f fVar, j741 j741Var, Context context, ah00 ah00Var, o oVar, com.yandex.go.zone.repository.o oVar2, el00 el00Var, xm00 xm00Var, b2l0 b2l0Var, leh lehVar, sgu0 sgu0Var, lr00 lr00Var, tt2 tt2Var, et00 et00Var, rqo rqoVar, opz0 opz0Var, iqz0 iqz0Var, rjt0 rjt0Var) {
        super(ah00Var, context, xm00Var, lehVar, b2l0Var, oVar2, el00Var, oVar, sgu0Var, lr00Var, tt2Var, et00Var, opz0Var, iqz0Var, ((jbh) rqoVar).a(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS), rjt0Var);
        this.V = cVar;
        this.W = fVar;
        this.Z = j741Var;
        this.a0 = new hbp0(new czo0(14), "route-selector-overlay", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.routes.presentation.c
    public final void Lg(lgl0 lgl0Var) {
        List<Point> points;
        super.Lg(lgl0Var);
        a4l0 a4l0Var = lgl0Var.a;
        Polyline a = a4l0Var.a();
        if (a == null || (points = a.getPoints()) == null) {
            return;
        }
        List list = a4l0Var.c;
        if (points.size() <= 2 || list == null) {
            return;
        }
        ((ru.yandex.taxi.map.c) this.Z).d(new WalkingRouteUiState(scc.g(a.Z(list), a.Z(points)), null, 0.0f, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD));
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final tpr Og() {
        return this.V.f();
    }
}
