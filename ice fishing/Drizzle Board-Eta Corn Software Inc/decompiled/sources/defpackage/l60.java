package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l60 extends m60 {
    public static List FySoLYna(k60 k60Var) {
        Iterator it = k60Var.iterator();
        if (!it.hasNext()) {
            return wf.NCTxEWno;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ra.FySoLYna(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static k60 I5GHvsYW(Iterator it) {
        it.getClass();
        return new d8(new e6(1, it));
    }

    public static k60 RXQxj5Oe(Object obj, zk zkVar) {
        return obj == null ? yf.qoPGr6Ce : new xb(new e7(9, obj), zkVar, 2);
    }
}
