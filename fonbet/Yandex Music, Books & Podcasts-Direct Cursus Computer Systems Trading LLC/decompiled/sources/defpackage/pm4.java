package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class pm4 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public pm4(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            kyf kyfVar = (kyf) entry.getValue();
            List list = (List) this.a.get(kyfVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(kyfVar, list);
            }
            list.add((qm4) entry.getKey());
        }
    }

    public static void a(List list, dzf dzfVar, kyf kyfVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                qm4 qm4Var = (qm4) list.get(size);
                Method method = qm4Var.b;
                try {
                    int i = qm4Var.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, dzfVar);
                    } else if (i == 2) {
                        method.invoke(obj, dzfVar, kyfVar);
                    }
                } catch (IllegalAccessException e) {
                    b6e.q(e);
                    return;
                } catch (InvocationTargetException e2) {
                    kac.k("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
