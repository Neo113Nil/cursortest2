package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public final class vj60 {
    public final y4g0 a;

    public vj60(y4g0 y4g0Var) {
        this.a = y4g0Var;
    }

    public final String a(Collection collection) {
        Object obj;
        Set b = this.a.b();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (b.contains((String) obj)) {
                break;
            }
        }
        return (String) obj;
    }
}
