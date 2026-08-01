package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2026a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2027b;

    public C0085b(HashMap hashMap) {
        this.f2027b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0096m enumC0096m = (EnumC0096m) entry.getValue();
            List list = (List) this.f2026a.get(enumC0096m);
            if (list == null) {
                list = new ArrayList();
                this.f2026a.put(enumC0096m, list);
            }
            list.add((C0086c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m, r rVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0086c c0086c = (C0086c) list.get(size);
                c0086c.getClass();
                try {
                    int i = c0086c.f2028a;
                    Method method = c0086c.f2029b;
                    if (i == 0) {
                        method.invoke(rVar, null);
                    } else if (i == 1) {
                        method.invoke(rVar, interfaceC0101s);
                    } else if (i == 2) {
                        method.invoke(rVar, interfaceC0101s, enumC0096m);
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
