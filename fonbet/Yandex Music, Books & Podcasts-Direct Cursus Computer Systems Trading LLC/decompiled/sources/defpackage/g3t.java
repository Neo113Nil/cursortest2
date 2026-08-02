package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class g3t {
    public final knn a;
    public final tf7 b;

    public g3t(knn knnVar, tf7 tf7Var) {
        this.a = knnVar;
        this.b = tf7Var;
    }

    public final Object a(Collection collection, cg6 cg6Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a.b;
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((mqs) it.next()).a);
        }
        List w0 = CollectionsKt.w0(arrayList);
        List list = w0;
        ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add((mqs) concurrentHashMap.get((String) it2.next()));
        }
        ArrayList O = CollectionsKt.O(arrayList2);
        if (O.size() != w0.size()) {
            ArrayList arrayList3 = new ArrayList(v75.o(O, 10));
            Iterator it3 = O.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((mqs) it3.next()).a);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : w0) {
                if (!arrayList3.contains((String) obj)) {
                    arrayList4.add(obj);
                }
            }
            O = null;
        }
        if (O != null) {
            if ((O.size() >= collection.size() ? O : null) != null) {
                return Unit.a;
            }
        }
        collection.getClass();
        Iterator it4 = collection.iterator();
        while (it4.hasNext()) {
            mqs mqsVar = (mqs) it4.next();
            mqsVar.getClass();
            concurrentHashMap.put(mqsVar.a, mqsVar);
        }
        Object i = this.b.i(collection, cg6Var);
        return i == nm6.a ? i : Unit.a;
    }
}
