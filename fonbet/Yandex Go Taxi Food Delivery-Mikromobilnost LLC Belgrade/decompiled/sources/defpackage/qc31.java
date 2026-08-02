package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.c;
import com.yandex.go.taxi.tariffs.interactor.r;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class qc31 extends a {
    public final w030 F;
    public final jl00 G;
    public final oc31 H;
    public final kc31 I;
    public final b J;
    public final h3y K;
    public final yvf0 L;
    public final i3y M;

    public qc31(w030 w030Var, jl00 jl00Var, oc31 oc31Var, kc31 kc31Var, b bVar, h3y h3yVar, h3g h3gVar) {
        super(null);
        this.F = w030Var;
        this.G = jl00Var;
        this.H = oc31Var;
        this.I = kc31Var;
        this.J = bVar;
        this.K = h3yVar;
        this.L = h3gVar;
        this.M = kotlin.a.a(new ec31(1, this));
    }

    public static final void T(qc31 qc31Var, PointType pointType) {
        SourcePicker sourcePicker;
        i3y i3yVar = qc31Var.M;
        qc31Var.j(new epb((ksd) i3yVar.getValue()));
        ksd ksdVar = (ksd) i3yVar.getValue();
        int i = pc31.a[pointType.ordinal()];
        if (i == 1) {
            sourcePicker = SourcePicker.A_FROM_SUMMARY;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            sourcePicker = SourcePicker.B_FROM_SUMMARY;
        }
        SourcePicker sourcePicker2 = sourcePicker;
        o501 o501Var = new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14);
        qc31Var.A(ksdVar, new jsd(pointType, sourcePicker2, false, new q501(o501Var, o501Var), qc31Var.J.c().b(), "order_summary", null, 1792), new k0i(qc31Var, 6));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        z((m950) this.G.get(), sy60.Q2);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        ac31 ac31Var = (ac31) obj;
        Boolean bool = ac31Var.b;
        yb31 yb31Var = ac31Var.a;
        c1x0 c1x0Var = new c1x0(this);
        ik0 ik0Var = this.H.a;
        c cVar = new c(c1x0Var, (String) ((xvf0) ik0Var.a).get(), (HubOpenReason) ((xvf0) ik0Var.b).get(), (zuj0) ((xvf0) ik0Var.c).get(), (ck31) ((xvf0) ik0Var.d).get(), (a3v) ((xvf0) ik0Var.e).get(), (o7r0) ((qcz0) ik0Var.f).get(), (cyu) ((xvf0) ik0Var.g).get(), (b8r) ((xvf0) ik0Var.h).get(), (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.c) ((ut) ik0Var.i).get(), (uc31) ((xvf0) ik0Var.j).get(), (hpi0) ((xvf0) ik0Var.k).get(), (ag31) ((xvf0) ik0Var.l).get(), (k) ((x0z) ik0Var.m).get(), (c4r0) ((xvf0) ik0Var.n).get(), (v0v) ((xvf0) ik0Var.o).get(), (r) ((xvf0) ik0Var.p).get());
        int i = 6;
        if (bool == null ? yb31Var.a : bool.booleanValue()) {
            i = 3;
        }
        int i2 = i;
        int i3 = yb31Var.b;
        vx0 vx0Var = this.I.a;
        return new VerticalHubV1ModalView(i2, cVar, i3, (pav) vx0Var.a.get(), (Context) vx0Var.b.get(), (lk31) vx0Var.c.get());
    }
}
