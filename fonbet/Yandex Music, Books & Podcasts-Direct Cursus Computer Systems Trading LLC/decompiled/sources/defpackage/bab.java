package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class bab {
    public final xba a;
    public final uaa b;

    public bab(xba xbaVar, uaa uaaVar) {
        xbaVar.getClass();
        uaaVar.getClass();
        this.a = xbaVar;
        this.b = uaaVar;
    }

    public final fs a(eca ecaVar) {
        ArrayList a = ecaVar.a();
        boolean isEmpty = a.isEmpty();
        Object obj = x9a.a;
        if (isEmpty) {
            Collection collection = ecaVar.a;
            Set set = ((lja) ((e6q) this.b).e.getValue()).a;
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((mqs) it.next()).a);
            }
            boolean containsAll = set.containsAll(arrayList);
            if (!containsAll) {
                if (containsAll) {
                    b6e.s();
                    return null;
                }
                obj = w9a.a;
            }
        } else {
            wba a2 = this.a.a(a, ecaVar.b);
            if (a2 instanceof tba) {
                obj = v9a.a;
            } else if (a2 instanceof vba) {
                obj = u9a.a;
            } else if (!a2.equals(sba.a) && !a2.equals(uba.a)) {
                b6e.s();
                return null;
            }
        }
        return new fs(15, obj);
    }
}
