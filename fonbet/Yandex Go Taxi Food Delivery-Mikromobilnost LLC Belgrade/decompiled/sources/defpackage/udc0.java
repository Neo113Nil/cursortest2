package defpackage;

import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.experiments.map.pin_war_v2.o;
import com.yandex.go.places.impl.navigation.d;
import com.yandex.go.places.impl.navigation.deeplink.helpers.a;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes13.dex */
public final class udc0 extends t75 {
    public final kac0 I;
    public d J;

    public udc0(kac0 kac0Var, z0j z0jVar, dgc0 dgc0Var) {
        super(dgc0Var, z0jVar);
        this.I = kac0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        dm80 dm80Var = (dm80) obj;
        super.R(dm80Var);
        PlacesNavigationMode placesNavigationMode = this.F;
        if (placesNavigationMode == null) {
            ny61.r("Never should happen - navigationMode type is always non nullable");
            return;
        }
        PlacesMapMode Q = Q();
        ncg ncgVar = this.I.a;
        d dVar = new d(placesNavigationMode, Q, (w030) ncgVar.a.get(), (b) ncgVar.b.get(), (dl80) ncgVar.c.get(), (a) ncgVar.d.get(), (i6r) ncgVar.e.get(), (j) ncgVar.f.get(), (o) ncgVar.g.get(), (com.yandex.go.places.experiments.tabbar.b) ncgVar.h.get(), (kcc0) ncgVar.i.get(), (com.yandex.go.places.experiments.map.social_pin.b) ncgVar.j.get(), (rac0) ncgVar.k.get(), (l4c0) ncgVar.l.get(), (c2x0) ncgVar.m.get(), (com.yandex.go.places.experiments.flex.b) ncgVar.n.get(), (kn80) ncgVar.o.get(), (vgc0) ncgVar.p.get(), (n3h) ncgVar.q.get(), (com.yandex.go.morphlex.router.b) ncgVar.r.get(), (z0j) ncgVar.s.get(), (m9c0) ncgVar.t.get(), i5m.a((xvf0) ncgVar.u), (com.yandex.go.places.complaint.impl.navigation.a) ncgVar.v.get(), (kc50) ncgVar.w.get(), (jj3) ncgVar.x.get(), (acc0) ((jk0) ncgVar.y).get(), (z0j) ncgVar.z.get());
        this.J = dVar;
        s75 s75Var = new s75(this, dm80Var, dVar);
        this.H = s75Var;
        E(s75Var, zy11.a, new r75(7, this), hxx.a);
        jst.e.n("[Places] main flow router launched with mapMode=" + Q());
    }

    @Override // defpackage.t75
    public final void P() {
        this.J = null;
        super.P();
    }

    @Override // defpackage.t75
    public final void R(dm80 dm80Var) {
        throw null;
    }
}
