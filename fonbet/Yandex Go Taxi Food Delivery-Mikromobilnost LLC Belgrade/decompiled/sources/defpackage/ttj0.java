package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class ttj0 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();

    public final synchronized List a(String str) {
        List list;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            list = (List) this.b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<stj0> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (stj0 stj0Var : list) {
                    if ((stj0Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(stj0Var.b)) && !arrayList.contains(stj0Var.b)) {
                        arrayList.add(stj0Var.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
