package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5121a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5122b;

    public C0488b(HashMap hashMap) {
        this.f5122b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0500n enumC0500n = (EnumC0500n) entry.getValue();
            List list = (List) this.f5121a.get(enumC0500n);
            if (list == null) {
                list = new ArrayList();
                this.f5121a.put(enumC0500n, list);
            }
            list.add((C0489c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n, InterfaceC0506u interfaceC0506u) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0489c c0489c = (C0489c) list.get(size);
                c0489c.getClass();
                try {
                    int i = c0489c.f5123a;
                    Method method = c0489c.f5124b;
                    if (i == 0) {
                        method.invoke(interfaceC0506u, new Object[0]);
                    } else if (i == 1) {
                        method.invoke(interfaceC0506u, interfaceC0507v);
                    } else if (i == 2) {
                        method.invoke(interfaceC0506u, interfaceC0507v, enumC0500n);
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
