package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes11.dex */
public final class uwk0 extends pa90 {
    public final pa90 y;
    public final tx40 z = f.f(0.0f);

    public uwk0(pa90 pa90Var) {
        this.y = pa90Var;
    }

    @Override // defpackage.pa90
    public final long i() {
        return this.y.i();
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        float floatValue = this.z.getFloatValue();
        nfh N = qamVar.N();
        long v = N.v();
        N.q().save();
        try {
            cot cotVar = (cot) N.a;
            cotVar.j(floatValue, cma1.Q(((nfh) cotVar.b).v()));
            pa90.h(this.y, qamVar, qamVar.c(), null, 6);
        } finally {
            b64.C(N, v);
        }
    }
}
