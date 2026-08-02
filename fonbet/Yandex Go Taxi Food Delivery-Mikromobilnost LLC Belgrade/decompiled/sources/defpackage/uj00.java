package defpackage;

import android.graphics.Rect;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.navigator.events.e;
import com.yandex.go.navigator.f;
import com.yandex.go.navigator.favorites.repository.b;
import com.yandex.go.navigator.map_interactions.MapInteractionsRouter$onAttach$$inlined$safeCollectIn$1;
import com.yandex.go.navigator.map_interactions.MapInteractionsRouter$onAttach$$inlined$safeCollectIn$2;
import com.yandex.go.navigator.map_interactions.MapInteractionsRouter$onAttach$$inlined$safeCollectIn$3;
import com.yandex.go.navigator.map_interactions.c;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes12.dex */
public final class uj00 extends h55 {
    public final f D;
    public final c E;
    public final e F;
    public final yvf0 G;
    public final h3y H;
    public final yvf0 I;
    public final yvf0 J;
    public final h3y K;
    public final com.yandex.go.navigator.events.f L;
    public final yvf0 M;
    public final ah00 N;
    public final wb50 O;
    public final yvf0 P;
    public final lgq0 Q;
    public final ru.yandex.taxi.deeplinks.e R;
    public final b S;
    public final oc50 T;
    public final Map U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj00(f fVar, c cVar, e eVar, yvf0 yvf0Var, h3y h3yVar, yvf0 yvf0Var2, yvf0 yvf0Var3, h3y h3yVar2, com.yandex.go.navigator.events.f fVar2, yvf0 yvf0Var4, ah00 ah00Var, wb50 wb50Var, yvf0 yvf0Var5, lgq0 lgq0Var, ru.yandex.taxi.deeplinks.e eVar2, b bVar, oc50 oc50Var) {
        super(null);
        MapWindow mapWindow;
        Map map = null;
        this.D = fVar;
        this.E = cVar;
        this.F = eVar;
        this.G = yvf0Var;
        this.H = h3yVar;
        this.I = yvf0Var2;
        this.J = yvf0Var3;
        this.K = h3yVar2;
        this.L = fVar2;
        this.M = yvf0Var4;
        this.N = ah00Var;
        this.O = wb50Var;
        this.P = yvf0Var5;
        this.Q = lgq0Var;
        this.R = eVar2;
        this.S = bVar;
        this.T = oc50Var;
        TaxiMapView h = ((gh00) ah00Var).h();
        if (h != null && (mapWindow = h.getMapWindow()) != null) {
            map = mapWindow.getMap();
        }
        this.U = map;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new MapInteractionsRouter$onAttach$$inlined$safeCollectIn$1(this.E.f, null, this), 3);
        tje.N(o(), null, null, new MapInteractionsRouter$onAttach$$inlined$safeCollectIn$2(this.D.h, null, this), 3);
        this.L.b(new k200(7, this), true);
        tje.N(o(), null, null, new MapInteractionsRouter$onAttach$$inlined$safeCollectIn$3(new mth((gci0) this.Q.b, 6), null, this), 3);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        Map map = this.U;
        if (map != null) {
            map.deselectGeoObject();
        }
        this.Q.l(null);
    }

    public final void P(PlainAddress plainAddress, ti80 ti80Var, lg80 lg80Var, sls slsVar) {
        ((oj00) n()).a.invoke();
        wb50 wb50Var = this.O;
        wb50Var.c();
        int i = ofp0.c;
        wb50Var.h(new Rect(0, 0, ofp0.b, i - (i / 2)));
        dh00.a(this.N, cwa1.d(plainAddress.B()), 0.0f, null, null, HProv.PP_DELETE_SAVED_PASSWD);
        j(new fpb(this));
        m950 m950Var = (m950) this.M.get();
        je80 je80Var = je80.u;
        he80 he80Var = new he80();
        he80Var.c = false;
        he80Var.f = true;
        he80Var.g = true;
        he80Var.d = true;
        A(m950Var, new xl80(uuj.b, ti80Var, lg80Var, null, null, false, null, null, he80Var.a(), null, null, null, null, 7896), new sj00(this, plainAddress, slsVar));
    }
}
