package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public interface ybb {
    List a();

    default ArrayList b() {
        List a = a();
        ArrayList arrayList = new ArrayList(v75.o(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add((mqs) ((h0r) it.next()).d.getValue());
        }
        return arrayList;
    }
}
