package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class qjd extends of8 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.of8
    public final up8 b(nf8 nf8Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            up8 b = ((of8) it.next()).b(nf8Var);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public final void c(of8 of8Var) {
        this.a.add(of8Var);
    }
}
