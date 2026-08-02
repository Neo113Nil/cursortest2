package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class y4g0 {
    public final z4g0 a;
    public final j2g0 b;

    public y4g0(z4g0 z4g0Var, j2g0 j2g0Var) {
        this.a = z4g0Var;
        this.b = j2g0Var;
    }

    public final void a(z0g0 z0g0Var, boolean z) {
        z4g0 z4g0Var = this.a;
        Set M0 = a.M0(z4g0Var.a.b());
        g4g0 g4g0Var = z4g0Var.a;
        Set M02 = a.M0(g4g0Var.a());
        String a = z0g0Var.a();
        if (z) {
            M0.add(a);
            M02.remove(a);
        } else {
            M0.remove(a);
            M02.add(a);
        }
        sme0 sme0Var = g4g0Var.a;
        kgx[] kgxVarArr = g4g0.d;
        sme0Var.setValue(g4g0Var, kgxVarArr[0], M0);
        g4g0Var.b.setValue(g4g0Var, kgxVarArr[1], M02);
    }

    public final Set b() {
        return this.a.a.b();
    }

    public final boolean c(String str) {
        Set b = b();
        if ((b instanceof Collection) && b.isEmpty()) {
            return false;
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }
}
