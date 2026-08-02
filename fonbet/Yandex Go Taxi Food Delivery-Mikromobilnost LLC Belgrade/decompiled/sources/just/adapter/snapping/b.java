package just.adapter.snapping;

import defpackage.a6q0;
import defpackage.n530;
import defpackage.pxl;
import defpackage.rzo;
import defpackage.t1t0;
import defpackage.w511;

/* loaded from: classes9.dex */
public final class b {
    public final n530 a;
    public final a6q0 b;
    public SnappingCallbacksHelper$State c = SnappingCallbacksHelper$State.TERMINAL;
    public t1t0 d;

    public b(n530 n530Var, a6q0 a6q0Var) {
        this.a = n530Var;
        this.b = a6q0Var;
    }

    public final void a() {
        int i = a.a[this.c.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return;
            }
            w511.b();
            return;
        }
        this.c = SnappingCallbacksHelper$State.ENDED;
        pxl pxlVar = (pxl) this.b.invoke();
        if (pxlVar != null) {
            t1t0 t1t0Var = this.d;
            rzo.p(this.a, t1t0Var != null ? t1t0Var.c : null, pxlVar);
        }
    }

    public final void b() {
        int i = a.a[this.c.ordinal()];
        n530 n530Var = this.a;
        a6q0 a6q0Var = this.b;
        if (i == 1) {
            this.c = SnappingCallbacksHelper$State.TERMINAL;
            pxl pxlVar = (pxl) a6q0Var.invoke();
            if (pxlVar != null) {
                t1t0 t1t0Var = this.d;
                rzo.p(n530Var, t1t0Var != null ? t1t0Var.b : null, pxlVar);
            }
            this.d = null;
            return;
        }
        if (i != 2) {
            if (i == 3) {
                return;
            }
            w511.b();
        } else {
            this.c = SnappingCallbacksHelper$State.TERMINAL;
            pxl pxlVar2 = (pxl) a6q0Var.invoke();
            if (pxlVar2 != null) {
                t1t0 t1t0Var2 = this.d;
                rzo.p(n530Var, t1t0Var2 != null ? t1t0Var2.d : null, pxlVar2);
            }
            this.d = null;
        }
    }

    public final void c(t1t0 t1t0Var) {
        int i = a.a[this.c.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                w511.b();
                return;
            }
            this.d = t1t0Var;
            this.c = SnappingCallbacksHelper$State.IN_PROCESS;
            pxl pxlVar = (pxl) this.b.invoke();
            if (pxlVar != null) {
                t1t0 t1t0Var2 = this.d;
                rzo.p(this.a, t1t0Var2 != null ? t1t0Var2.a : null, pxlVar);
            }
        }
    }
}
