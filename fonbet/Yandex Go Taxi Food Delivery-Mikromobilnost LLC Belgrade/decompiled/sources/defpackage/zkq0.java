package defpackage;

import androidx.compose.foundation.text.selection.g;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.runtime.f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class zkq0 {
    public static final tig0 l = new tig0(new arm0(19), new tyo0(28));
    public boolean a;
    public final ArrayList b;
    public final gy40 c;
    public final AtomicLong d;
    public hkq0 e;
    public alb0 f;
    public wkq0 g;
    public g h;
    public hkq0 i;
    public hkq0 j;
    public final oz40 k;

    public zkq0(long j) {
        this.b = new ArrayList();
        this.c = zlz.a();
        this.d = new AtomicLong(j);
        this.k = f.j(zlz.a);
    }

    public final gy40 a() {
        return (gy40) this.k.getValue();
    }

    public final boolean b(rzx rzxVar, long j, long j2, dkq0 dkq0Var, boolean z) {
        wkq0 wkq0Var = this.g;
        if (wkq0Var == null) {
            return true;
        }
        i iVar = wkq0Var.a;
        long a = iVar.a(rzxVar, j);
        long a2 = iVar.a(rzxVar, j2);
        iVar.l(z);
        return iVar.n(a, a2, false, dkq0Var);
    }

    public final ArrayList c(rzx rzxVar) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            xcc.q(arrayList, new oe7(10, new e3o0(15, rzxVar)));
            this.a = true;
        }
        return arrayList;
    }

    public final void d(ho40 ho40Var) {
        long j = ho40Var.a;
        gy40 gy40Var = this.c;
        if (gy40Var.b(j)) {
            this.b.remove(ho40Var);
            gy40Var.g(j);
            hkq0 hkq0Var = this.j;
            if (hkq0Var != null) {
                hkq0Var.invoke(Long.valueOf(j));
            }
        }
    }

    public zkq0() {
        this(1L);
    }
}
