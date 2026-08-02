package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class rds {
    public CopyOnWriteArrayList a;

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((wds) it.next()).getClass();
        }
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xds) it.next()).getClass();
            arrayList.add(xds.a);
        }
        return arrayList;
    }
}
