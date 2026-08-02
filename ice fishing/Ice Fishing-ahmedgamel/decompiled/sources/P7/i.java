package P7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.C5125p;

/* loaded from: classes2.dex */
public abstract class i extends d6.c {
    public static List A(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return C5125p.f41221n;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Z2.d.n(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
