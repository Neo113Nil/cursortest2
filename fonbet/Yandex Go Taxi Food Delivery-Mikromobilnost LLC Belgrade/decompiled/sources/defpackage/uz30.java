package defpackage;

import ru.yandex.taxi.communications.stories.domain.a;

/* loaded from: classes6.dex */
public final class uz30 implements pzr0, rxr0 {
    public final m020 a;
    public final wg30 b;
    public final h3y c;
    public final g3g d;
    public final zuj0 e;
    public final yvf0 f;
    public final oep0 g;

    public uz30(m020 m020Var, wg30 wg30Var, h3y h3yVar, g3g g3gVar, zuj0 zuj0Var, yvf0 yvf0Var, oep0 oep0Var) {
        this.a = m020Var;
        this.b = wg30Var;
        this.c = h3yVar;
        this.d = g3gVar;
        this.e = zuj0Var;
        this.f = yvf0Var;
        this.g = oep0Var;
    }

    @Override // defpackage.pzr0, defpackage.rxr0
    public final g18 b(qxr0 qxr0Var) {
        boolean z = qxr0Var instanceof mwr0;
        dai daiVar = g18.u1;
        if (z) {
            String str = ((mwr0) qxr0Var).a;
            ((a60) ((y50) this.c.get())).c(str, v770.k);
            return daiVar;
        }
        boolean z2 = qxr0Var instanceof gxr0;
        oep0 oep0Var = this.g;
        if (!z2) {
            if (!(qxr0Var instanceof twr0)) {
                super.b(qxr0Var);
                return daiVar;
            }
            ((pep0) oep0Var).f(new zsa(23, (sw30) this.f.get(), this.a, this.b), zy11.a, hxx.a);
            return daiVar;
        }
        gxr0 gxr0Var = (gxr0) qxr0Var;
        String str2 = gxr0Var.a;
        ((pep0) oep0Var).f(new npc((a) this.d.get(), gxr0Var.b, 1), new npu0((x3) new mpu0(str2), "masstransit", Float.valueOf(((avj0) this.e).b(psg0.shortcuts_corners_round)), false, 120), hxx.a);
        return daiVar;
    }

    @Override // defpackage.pzr0
    public final y700 d() {
        return null;
    }
}
