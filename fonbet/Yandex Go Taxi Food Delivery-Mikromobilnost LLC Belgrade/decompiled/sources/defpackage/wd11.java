package defpackage;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class wd11 {
    public final vd11 a;

    public wd11(vd11 vd11Var) {
        this.a = vd11Var;
    }

    public final int a() {
        return this.a.b.size();
    }

    public final int b(Object obj) {
        Iterator it = this.a.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (jl40.l(((vd11) it.next()).a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
