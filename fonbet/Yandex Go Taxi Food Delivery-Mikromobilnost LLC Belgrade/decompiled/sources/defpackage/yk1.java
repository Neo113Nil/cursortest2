package defpackage;

import com.yandex.go.agreement.interactor.a;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class yk1 extends ad5 {
    public final k7x0 A;
    public final bk1 B;
    public final zuj0 C;
    public final bd x;
    public final xcs0 y;
    public final ed z;

    public yk1(bd bdVar, xcs0 xcs0Var, ed edVar, k7x0 k7x0Var, bk1 bk1Var, zuj0 zuj0Var) {
        super(mk1.class);
        this.x = bdVar;
        this.y = xcs0Var;
        this.z = edVar;
        this.A = k7x0Var;
        this.B = bk1Var;
        this.C = zuj0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((a) this.B).a(this.x);
    }

    public final void Kg(tj1 tj1Var) {
        boolean l = jl40.l(tj1Var, qj1.a);
        int i = 14;
        bk1 bk1Var = this.B;
        xcs0 xcs0Var = this.y;
        bd bdVar = this.x;
        ed edVar = this.z;
        if (l) {
            ((fd) edVar).e(bdVar);
            ((a) bk1Var).a(bdVar);
            xcs0Var.a.r(new ukr0(i));
            return;
        }
        if (jl40.l(tj1Var, oj1.a)) {
            ((fd) edVar).c(bdVar);
            return;
        }
        if (jl40.l(tj1Var, rj1.a)) {
            ((fd) edVar).d(bdVar, null);
            ((a) bk1Var).a(bdVar);
            String str = bdVar.j;
            if (str == null || evu0.J(str)) {
                xcs0Var.a.r(new ukr0(i));
                return;
            } else {
                xcs0Var.a.r(new g8r0(str, 5));
                return;
            }
        }
        if (jl40.l(tj1Var, pj1.a)) {
            ((fd) edVar).e(bdVar);
            ((a) bk1Var).a(bdVar);
            xcs0Var.a.r(new ukr0(i));
        } else {
            if (!(tj1Var instanceof sj1)) {
                w511.b();
                return;
            }
            String str2 = ((sj1) tj1Var).a;
            ((fd) edVar).f(bdVar, null);
            xcs0Var.getClass();
            CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
            aVar.b = str2;
            UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, true, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194170, null);
            f28 f28Var = xcs0Var.a;
            ((w030) f28Var.F).s(vf41.a(((gf41) f28Var.H).a().c(), uiWebViewConfig, null, null, null, 254), true);
        }
    }
}
