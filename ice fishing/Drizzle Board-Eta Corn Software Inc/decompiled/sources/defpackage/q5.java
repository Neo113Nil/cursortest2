package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q5 {
    public final HashMap NCTxEWno;
    public final HashMap qoPGr6Ce = new HashMap();

    public q5(HashMap hashMap) {
        this.NCTxEWno = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            oo ooVar = (oo) entry.getValue();
            List list = (List) this.qoPGr6Ce.get(ooVar);
            if (list == null) {
                list = new ArrayList();
                this.qoPGr6Ce.put(ooVar, list);
            }
            list.add((r5) entry.getKey());
        }
    }

    public static void qoPGr6Ce(List list, vo voVar, oo ooVar, uo uoVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                r5 r5Var = (r5) list.get(size);
                Method method = r5Var.NCTxEWno;
                try {
                    int i = r5Var.qoPGr6Ce;
                    if (i == 0) {
                        method.invoke(uoVar, null);
                    } else if (i == 1) {
                        method.invoke(uoVar, voVar);
                    } else if (i == 2) {
                        method.invoke(uoVar, voVar, ooVar);
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
