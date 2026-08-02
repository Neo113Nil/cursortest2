package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class rin {
    public final dn9 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public rin(dn9 dn9Var) {
        this.a = dn9Var;
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wm9 wm9Var = (wm9) it.next();
            arrayList2.add(new qin(wm9Var.getMessage(), wm9Var));
        }
        return arrayList2;
    }
}
