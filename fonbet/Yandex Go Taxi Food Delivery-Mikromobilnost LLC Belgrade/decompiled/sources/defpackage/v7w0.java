package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.f;
import com.yandex.go.search.router.Origin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class v7w0 implements isd {
    public final /* synthetic */ f a;
    public final /* synthetic */ AdditionalAction b;
    public final /* synthetic */ String c;

    public v7w0(f fVar, AdditionalAction additionalAction, String str) {
        this.a = fVar;
        this.b = additionalAction;
        this.c = str;
    }

    @Override // defpackage.isd
    public final void X0(boolean z, dw1 dw1Var) {
        String str = this.c;
        AdditionalAction additionalAction = this.b;
        f fVar = this.a;
        if (dw1Var == null) {
            f.P(fVar, additionalAction, str);
            return;
        }
        String str2 = dw1Var.a;
        String str3 = dw1Var.b;
        String str4 = dw1Var.c;
        ti80 qi80Var = (str2 == null || !l9e.f(str2) || str3 == null || evu0.J(str3)) ? (str2 == null || !l9e.f(str2)) ? (str3 == null || evu0.J(str3)) ? null : new qi80(str3, str4) : new ri80(str2, str4) : new si80(str2, str3, str4);
        if (qi80Var != null) {
            ((hcc0) ((gcc0) fVar.I.get())).b(new xl80(qvj.b, qi80Var, kg80.b, null, null, false, null, null, null, null, null, null, null, 8176), new sj00(fVar, additionalAction, str));
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        f fVar = this.a;
        fVar.K.a.a = false;
        fVar.i();
    }

    @Override // defpackage.isd
    public final void h(PointType pointType, Address address, pv0 pv0Var) {
        Object sziVar;
        PointType pointType2 = PointType.DESTINATION;
        f fVar = this.a;
        if (pointType != pointType2) {
            fVar.E((m950) fVar.L.get(), new yef(kyh0.new_point_selection_screen_starting_point_title_statement, address != null ? address.B() : null, Origin.SUGGEST), new u7w0(fVar), hxx.a);
            return;
        }
        if (pv0Var != null) {
            fVar.F.c().b();
            sziVar = new uzi(pv0Var, RouteSelectorOpenReason.ADDRESS);
        } else {
            sziVar = new szi(null, RouteSelectorOpenReason.ADDRESS, 1);
        }
        fVar.A((m950) fVar.M.get(), sziVar, new t7w0(fVar, this.b, this.c));
    }

    @Override // defpackage.isd
    public final void o(String str) {
        ((a60) this.a.D).c(str, v770.c);
    }

    @Override // defpackage.isd
    public final void x0(pv0 pv0Var, PointType pointType) {
        h(pointType, pv0Var != null ? pv0Var.a : null, pv0Var);
    }
}
