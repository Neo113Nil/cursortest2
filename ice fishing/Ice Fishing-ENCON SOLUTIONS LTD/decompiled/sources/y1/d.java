package y1;

import a.AbstractC0083a;
import i1.p;
import i1.r;
import i1.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class d extends e {
    public static c B(Iterator it) {
        i.e(it, "<this>");
        return new a(new p(1, it));
    }

    public static List C(c cVar) {
        Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return r.f3416a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0083a.m(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set D(c cVar) {
        Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return t.f3418a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Set singleton = Collections.singleton(next);
            i.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
