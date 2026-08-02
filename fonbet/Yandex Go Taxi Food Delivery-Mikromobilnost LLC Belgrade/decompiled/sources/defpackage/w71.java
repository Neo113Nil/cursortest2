package defpackage;

import ru.yandex.taxi.search.address.view.ModalSourceSearchView;

/* loaded from: classes6.dex */
public final class w71 extends h55 {
    public final x51 D;
    public final hjs E;
    public final hnb0 F;

    public w71(x51 x51Var, hjs hjsVar, hnb0 hnb0Var) {
        super(null);
        this.D = x51Var;
        this.E = hjsVar;
        this.F = hnb0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        s71 s71Var = (s71) obj;
        pz20 pz20Var = ModalSourceSearchView.Companion;
        h6g a = this.E.a();
        pz20Var.getClass();
        oz20 oz20Var = new oz20(a);
        oz20Var.B = true;
        boolean z = s71Var.c;
        if (z) {
            oz20Var.q = new e90(2, this, s71Var);
        }
        if (s71Var.d) {
            oz20Var.v = new ryh(14, this);
        }
        if (!s71Var.e) {
            oz20Var.y = new m6(4, this);
        }
        oz20Var.x = z;
        oz20Var.u = s71Var.b;
        oz20Var.n = s71Var.a;
        oz20Var.A = new ddf(12, this);
        C(new y71(oz20Var, (w030) this.D.a.a.get()), new v71(this, 0));
    }
}
