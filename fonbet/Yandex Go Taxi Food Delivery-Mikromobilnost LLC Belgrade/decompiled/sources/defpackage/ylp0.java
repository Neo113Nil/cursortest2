package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.communications.stories.domain.a;

/* loaded from: classes10.dex */
public final class ylp0 {
    public final yvf0 a;
    public final oep0 b;
    public final c c;
    public final ulp0 d;
    public boolean e;

    public ylp0(vw2 vw2Var, oep0 oep0Var, c cVar, ulp0 ulp0Var) {
        this.a = vw2Var;
        this.b = oep0Var;
        this.c = cVar;
        this.d = ulp0Var;
        this.e = ((Boolean) ulp0Var.a.getValue(ulp0Var, ulp0.b[0])).booleanValue();
    }

    public final void a(vmn0 vmn0Var, Runnable runnable) {
        if (evu0.J(vmn0Var.n())) {
            b(vmn0Var, runnable);
            return;
        }
        String n = vmn0Var.n();
        xlp0 xlp0Var = new xlp0(0, this, vmn0Var, runnable);
        c.l(this.c, n, "sdc_unavailable", null, new v3n0(29, xlp0Var), new tb(10, n, xlp0Var), 4);
    }

    public final void b(vmn0 vmn0Var, Runnable runnable) {
        if (this.e) {
            runnable.run();
            return;
        }
        String m = vmn0Var.m();
        if (m == null || evu0.J(m)) {
            jst.e.s(new IllegalArgumentException("Can't extract sdc action's onboarding_promo_id"));
            runnable.run();
            return;
        }
        String m2 = vmn0Var.m();
        int i = 9;
        ((pep0) this.b).f(new rwo0(i, (a) this.a.get(), new nao0(16, this, runnable)), new npu0((x3) new mpu0(m2), "#none#", (Float) null, false, HProv.PP_SAME_MEDIA), hxx.a);
    }
}
