package defpackage;

import androidx.compose.ui.node.u;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class uh4 extends e530 implements pam, dr60, gnq0 {
    public ehr0 A;
    public ix80 B;
    public long a;
    public ml6 b;
    public float c;
    public ehr0 w;
    public long x;
    public LayoutDirection y;
    public ix80 z;

    @Override // defpackage.gnq0
    public final boolean U() {
        return false;
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        ix80 ix80Var;
        k28 k28Var = c1yVar.a;
        if (this.w == qke.q) {
            if (!ldc.c(this.a, ldc.m)) {
                qam.t0(c1yVar, this.a, 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
            }
            ml6 ml6Var = this.b;
            if (ml6Var != null) {
                qam.t(c1yVar, ml6Var, 0L, 0L, this.c, null, 0, HProv.PP_INFO);
            }
        } else {
            if (cjs0.a(k28Var.c(), this.x) && c1yVar.getLayoutDirection() == this.y && jl40.l(this.A, this.w)) {
                ix80Var = this.z;
            } else {
                u.e(this, new mw2(12, this, c1yVar));
                ix80Var = this.B;
                this.B = null;
            }
            this.z = ix80Var;
            this.x = k28Var.c();
            this.y = c1yVar.getLayoutDirection();
            this.A = this.w;
            if (!ldc.c(this.a, ldc.m)) {
                jd00.e(c1yVar, ix80Var, this.a);
            }
            ml6 ml6Var2 = this.b;
            if (ml6Var2 != null) {
                jd00.d(c1yVar, ix80Var, ml6Var2, this.c, 56);
            }
        }
        c1yVar.a();
    }

    @Override // defpackage.dr60
    public final void e0() {
        this.x = 9205357640488583168L;
        this.y = null;
        this.z = null;
        this.A = null;
        rzo.D(this);
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        f.r(mnq0Var, this.w);
    }
}
