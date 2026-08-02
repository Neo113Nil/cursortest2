package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class qwe extends ad5 {
    public final kwe A;
    public pzt0 B;
    public final lwe x;
    public final an8 y;
    public final hwe z;

    public qwe(lwe lweVar, an8 an8Var, hwe hweVar, kwe kweVar) {
        super(owe.class);
        this.x = lweVar;
        this.y = an8Var;
        this.z = hweVar;
        this.A = kweVar;
    }

    public static final void Kg(qwe qweVar, List list) {
        ((owe) qweVar.Dg()).g3(list);
        List list2 = list;
        boolean z = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = ((jwe) it.next()).e;
                if (!(str == null || evu0.J(str))) {
                    z = false;
                    break;
                }
            }
        }
        ((owe) qweVar.Dg()).setDoneButtonEnabled(z);
    }
}
