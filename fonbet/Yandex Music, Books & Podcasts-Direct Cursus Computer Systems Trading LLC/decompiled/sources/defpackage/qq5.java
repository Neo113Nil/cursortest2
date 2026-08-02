package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class qq5 implements ef {
    public final List a;

    public qq5(ef... efVarArr) {
        this.a = uz0.c(efVarArr);
    }

    @Override // defpackage.ef
    public final df a(md mdVar, g3a g3aVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            df a = ((ef) it.next()).a(mdVar, g3aVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // defpackage.ef
    public final df b(md mdVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            df b = ((ef) it.next()).b(mdVar);
            if (b != null) {
                return b;
            }
        }
        return null;
    }
}
