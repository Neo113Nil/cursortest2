package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class xhp0 {
    public final goe a;
    public final a2y b;
    public final uip0 c;

    public xhp0(goe goeVar, a2y a2yVar, uip0 uip0Var) {
        this.a = goeVar;
        this.b = a2yVar;
        this.c = uip0Var;
    }

    public final void a(String str) {
        Object value;
        tip0 tip0Var;
        pz40 pz40Var = (pz40) this.a.a.get(str);
        f151 f151Var = pz40Var != null ? (f151) ((r0) pz40Var).getValue() : null;
        if (f151Var != null) {
            int b = m810.b(f151Var.c - this.b.c);
            r0 r0Var = this.c.a;
            do {
                value = r0Var.getValue();
                tip0Var = (tip0) value;
            } while (!r0Var.k(value, new tip0(b, (tip0Var != null ? tip0Var.b : 0) + 1)));
        }
    }
}
