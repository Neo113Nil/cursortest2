package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import java.util.Collections;

/* loaded from: classes.dex */
public final class t870 implements s870 {
    public final yvf0 a;
    public final paq0 b;
    public final dqe0 c;
    public final arv0 d;
    public final lgv0 e;
    public final kpi0 f;
    public final oep0 g;

    public t870(yvf0 yvf0Var, paq0 paq0Var, dqe0 dqe0Var, arv0 arv0Var, lgv0 lgv0Var, kpi0 kpi0Var, oep0 oep0Var) {
        this.a = yvf0Var;
        this.b = paq0Var;
        this.c = dqe0Var;
        this.d = arv0Var;
        this.e = lgv0Var;
        this.f = kpi0Var;
        this.g = oep0Var;
    }

    public final void a(Address address, String str, boolean z, ynv0 ynv0Var, khv0 khv0Var) {
        Preorder preorder = new Preorder(0);
        d0l0 d0l0Var = this.c.a.G;
        if (address != null) {
            d0l0Var = d0l0Var.k(Collections.singletonList(address));
        }
        preorder.l(d0l0Var);
        this.f.b();
        preorder.i(this.f.a());
        preorder.j(this.f.c.a.e());
        if (z) {
            this.b.a();
        }
        ((a7t0) this.d).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
        Address h = preorder.G.h();
        Address b = preorder.G.b();
        zzs B = h != null ? h.B() : null;
        zzs B2 = b != null ? b.B() : null;
        mgv0 mgv0Var = this.e.b;
        mgv0Var.d = true;
        mgv0Var.e = B;
        mgv0Var.f = B2;
        ((pep0) this.g).f((m950) this.a.get(), new lre0(preorder, str, ynv0Var, khv0Var), hxx.a);
    }
}
