package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;

/* loaded from: classes6.dex */
public final class xkx0 implements t690, act0 {
    public final lkx0 b;
    public final gfv0 c;

    public xkx0(lkx0 lkx0Var, gfv0 gfv0Var) {
        this.b = lkx0Var;
        this.c = gfv0Var;
    }

    @Override // defpackage.act0
    public final void Y() {
        this.c.Y();
    }

    @Override // defpackage.t690
    public final void a() {
        this.c.a();
    }

    @Override // defpackage.t690
    public final void b() {
        this.c.b();
    }

    @Override // defpackage.t690
    public final void d(String str, String str2, boolean z) {
        lkx0 lkx0Var = this.b;
        h3y h3yVar = lkx0Var.z;
        fnx0 n = ((k) lkx0Var.x).n();
        if (!gwk0.v(str) || n == null) {
            mi31 a = lkx0Var.C.a("");
            if (a != null) {
                ((hgb) h3yVar.get()).a(a, str2, str, z);
                return;
            }
            return;
        }
        mi31 mi31Var = n.a;
        if (!mi31Var.a.K0) {
            g8e.C("not a multiclass", jst.e);
        } else {
            lkx0Var.B.a(str2, mi31Var, z);
            ((hgb) h3yVar.get()).a(mi31Var, str2, str, z);
        }
    }

    @Override // defpackage.t690
    public final void f() {
        lkx0 lkx0Var = this.b;
        pex0 m = ((k) lkx0Var.x).m();
        sgx0 sgx0Var = m != null ? m.J0 : null;
        if (sgx0Var == null) {
            g8e.C("Selected tariff is null. Failed to order taxi", jst.e);
        } else {
            ((ci70) lkx0Var.H).E = Events$Summary$SummaryState.EXPANDED;
            ((jkx0) lkx0Var.Dg()).C7(sgx0Var);
        }
    }

    @Override // defpackage.t690
    public final void i(String str) {
        this.b.Kg(str);
    }

    @Override // defpackage.t690
    public final void j(ikx0 ikx0Var) {
        this.b.Kg(ikx0Var.b.b);
    }

    @Override // defpackage.act0
    public final void x0() {
        this.c.x0();
    }

    @Override // defpackage.act0
    public final void y0() {
        this.c.y0();
    }

    @Override // defpackage.act0
    public final void z0() {
        this.c.z0();
    }
}
