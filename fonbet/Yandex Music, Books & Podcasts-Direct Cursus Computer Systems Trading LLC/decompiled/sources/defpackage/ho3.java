package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ho3 implements do3 {
    public List a;

    @Override // defpackage.do3
    public final boolean a(llo lloVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (n20.o((mo3) it.next(), lloVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return vz1.u(new StringBuilder("not("), this.a, ")");
    }
}
