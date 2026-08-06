package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wa {
    public final HashMap GWasM1elztuh = new HashMap();
    public final HashMap Yi7zF1RB1;

    public wa(HashMap hashMap) {
        this.Yi7zF1RB1 = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            l90 l90Var = (l90) entry.getValue();
            List list = (List) this.GWasM1elztuh.get(l90Var);
            if (list == null) {
                list = new ArrayList();
                this.GWasM1elztuh.put(l90Var, list);
            }
            list.add((xa) entry.getKey());
        }
    }

    public static void GWasM1elztuh(List list, t90 t90Var, l90 l90Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                xa xaVar = (xa) list.get(size);
                Method method = xaVar.Yi7zF1RB1;
                try {
                    int i = xaVar.GWasM1elztuh;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, t90Var);
                    } else if (i == 2) {
                        method.invoke(obj, t90Var, l90Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
