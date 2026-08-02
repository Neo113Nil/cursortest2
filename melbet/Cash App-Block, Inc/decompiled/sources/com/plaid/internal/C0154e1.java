package com.plaid.internal;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.plaid.internal.e1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0154e1 {
    public static final C0323x0 b;
    public static final C0154e1 c;
    public final LinkedHashMap a = new LinkedHashMap();

    static {
        W3 w3 = Z3.a;
        b = new C0323x0("features");
        c = new C0154e1();
    }

    public final C0154e1 a(HashMap hashMap) {
        C0154e1 c0154e1 = new C0154e1();
        LinkedHashMap linkedHashMap = this.a;
        c0154e1.a.clear();
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c0154e1.a((String) entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            c0154e1.a((String) entry2.getKey(), entry2.getValue());
        }
        return c0154e1;
    }

    public final boolean a(String str) {
        Object a = a(str, null, Object.class);
        if (a instanceof Boolean) {
            return Boolean.TRUE.equals(a);
        }
        return a instanceof Number ? ((Number) a).intValue() != 0 : a != null;
    }

    public final Object a(String str, Object obj, Class<?> cls) {
        Object obj2 = !str.startsWith("android.") ? this.a.get("android.".concat(str)) : null;
        if (obj2 == null) {
            obj2 = this.a.get(str);
        }
        return cls.isInstance(obj2) ? obj2 : obj;
    }

    public final void a(String str, Object obj) {
        if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
            b.a(W3.WARN, "ignore feature %s of type %s", str, obj == null ? "null" : obj.getClass().getSimpleName());
        } else {
            b.a(W3.INFO, "set feature %s=%s", str, obj);
            this.a.put(str, obj);
        }
    }
}
