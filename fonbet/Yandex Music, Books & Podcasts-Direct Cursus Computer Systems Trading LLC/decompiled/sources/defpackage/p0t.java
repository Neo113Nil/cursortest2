package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class p0t {
    public final jyr a = l18.b.b(hag.I(r1l.class), true);

    public final void a(Collection collection, boolean z) {
        collection.getClass();
        r1l r1lVar = (r1l) this.a.getValue();
        r1lVar.getClass();
        Collection collection2 = collection;
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            r1lVar.b((mqs) it.next(), z);
        }
        ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((mqs) it2.next()).a);
        }
        r1lVar.c.a(arrayList);
    }
}
