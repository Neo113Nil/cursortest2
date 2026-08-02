package defpackage;

import com.yandex.go.places.map.ui.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class tzb0 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public final mwb0 a(kn00 kn00Var) {
        String id = kn00Var.getId();
        HashMap hashMap = this.a;
        Object obj = hashMap.get(id);
        if (obj == null) {
            obj = new szb0(kn00Var);
            hashMap.put(id, obj);
        }
        return (mwb0) obj;
    }

    public final qzb0 b(kn00 kn00Var) {
        String id = kn00Var.getId();
        HashMap hashMap = this.b;
        rzb0 rzb0Var = (rzb0) hashMap.get(id);
        if (rzb0Var != null && rzb0Var.a == kn00Var) {
            return rzb0Var.b;
        }
        qzb0 qzb0Var = new qzb0(a(kn00Var), (float) kn00Var.a(), b.b(kn00Var.getGeometry()), null, 56);
        hashMap.put(kn00Var.getId(), new rzb0(kn00Var, qzb0Var));
        return qzb0Var;
    }

    public final void c(List list) {
        boolean isEmpty = list.isEmpty();
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.a;
        if (isEmpty) {
            hashMap2.clear();
            hashMap.clear();
            return;
        }
        HashSet hashSet = new HashSet(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((kn00) it.next()).getId());
        }
        hashMap2.keySet().retainAll(hashSet);
        hashMap.keySet().retainAll(hashSet);
    }
}
