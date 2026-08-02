package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class qo61 {
    public final Object a = new Object();
    public final WeakHashMap b = new WeakHashMap();

    public final void a() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.b.keySet());
            this.b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fy71 fy71Var = (fy71) it.next();
            if (fy71Var != null) {
                fy71Var.a();
            }
        }
    }
}
