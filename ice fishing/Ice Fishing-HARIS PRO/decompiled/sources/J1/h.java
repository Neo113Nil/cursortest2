package J1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u1.o;

/* loaded from: classes.dex */
public abstract class h extends i {
    public static f e0(Iterator it) {
        D1.i.e(it, "<this>");
        return new a(new d(1, it));
    }

    public static f f0(Object obj, C1.l lVar) {
        return obj == null ? b.f355a : new l(new j(0, obj), lVar);
    }

    public static List g0(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return o.f4473a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return h0.f.s(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
