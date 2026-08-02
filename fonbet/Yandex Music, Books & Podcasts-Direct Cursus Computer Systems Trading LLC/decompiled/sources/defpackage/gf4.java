package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class gf4 {
    public final cvl a;
    public final List b;
    public final r1u c;
    public final ff d;

    public gf4(ff ffVar, cvl cvlVar, r1u r1uVar, List list) {
        list.getClass();
        this.a = cvlVar;
        this.b = list;
        this.c = r1uVar;
        this.d = ffVar;
    }

    public final ArrayList a() {
        List list = this.b;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rf4) it.next()).b);
        }
        return arrayList;
    }
}
