package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f649a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f650b;

    public b(HashMap hashMap) {
        this.f650b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            o oVar = (o) entry.getValue();
            List list = (List) this.f649a.get(oVar);
            if (list == null) {
                list = new ArrayList();
                this.f649a.put(oVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, u uVar, o oVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f661b;
                try {
                    int i10 = cVar.f660a;
                    if (i10 == 0) {
                        method.invoke(obj, null);
                    } else if (i10 == 1) {
                        method.invoke(obj, uVar);
                    } else if (i10 == 2) {
                        method.invoke(obj, uVar, oVar);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
