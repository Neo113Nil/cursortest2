package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class rrj0 implements qrj0 {
    public final tvw a;
    public final dqe0 b;
    public final h3y c;

    public rrj0(tvw tvwVar, dqe0 dqe0Var, h3y h3yVar) {
        this.a = tvwVar;
        this.b = dqe0Var;
        this.c = h3yVar;
    }

    public final Preorder a() {
        Preorder preorder = new Preorder(0);
        d0l0 k = this.b.a.G.k(EmptyList.a);
        kpi0 kpi0Var = (kpi0) this.c.get();
        preorder.l(k);
        kpi0Var.b();
        preorder.i(kpi0Var.a());
        preorder.j(kpi0Var.c.a.e());
        this.a.a(preorder);
        return preorder;
    }
}
