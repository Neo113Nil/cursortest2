package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5154a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5155b;

    public C0484b(HashMap hashMap) {
        this.f5155b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0496n enumC0496n = (EnumC0496n) entry.getValue();
            List list = (List) this.f5154a.get(enumC0496n);
            if (list == null) {
                list = new ArrayList();
                this.f5154a.put(enumC0496n, list);
            }
            list.add((C0485c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n, InterfaceC0502u interfaceC0502u) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0485c c0485c = (C0485c) list.get(size);
                c0485c.getClass();
                try {
                    int i = c0485c.f5156a;
                    Method method = c0485c.f5157b;
                    if (i == 0) {
                        method.invoke(interfaceC0502u, new Object[0]);
                    } else if (i == 1) {
                        method.invoke(interfaceC0502u, interfaceC0503v);
                    } else if (i == 2) {
                        method.invoke(interfaceC0502u, interfaceC0503v, enumC0496n);
                    }
                } catch (IllegalAccessException e9) {
                    throw new RuntimeException(e9);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
