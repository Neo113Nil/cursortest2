package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5266a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5267b;

    public C0494b(HashMap hashMap) {
        this.f5267b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0506n enumC0506n = (EnumC0506n) entry.getValue();
            List list = (List) this.f5266a.get(enumC0506n);
            if (list == null) {
                list = new ArrayList();
                this.f5266a.put(enumC0506n, list);
            }
            list.add((C0495c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n, InterfaceC0512u interfaceC0512u) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0495c c0495c = (C0495c) list.get(size);
                c0495c.getClass();
                try {
                    int i = c0495c.f5268a;
                    Method method = c0495c.f5269b;
                    if (i == 0) {
                        method.invoke(interfaceC0512u, new Object[0]);
                    } else if (i == 1) {
                        method.invoke(interfaceC0512u, interfaceC0513v);
                    } else if (i == 2) {
                        method.invoke(interfaceC0512u, interfaceC0513v, enumC0506n);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to call observer method", e9.getCause());
                }
            }
        }
    }
}
