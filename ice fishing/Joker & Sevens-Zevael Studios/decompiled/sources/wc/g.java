package wc;

import bc.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g extends h {
    public static List r(e eVar) {
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return v.f1067g;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return i7.b.z(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
