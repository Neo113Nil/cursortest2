package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class trb {
    public oig a;
    public final r0 b;
    public final gci0 c;

    public trb() {
        r0 c = bvf0.c(kkg.a);
        this.b = c;
        this.c = e.d(c);
    }

    public final void a(lkg lkgVar) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
        } while (!r0Var.k(value, lkgVar));
        if (lkgVar instanceof jkg) {
            this.a = ((jkg) lkgVar).a;
        }
    }
}
