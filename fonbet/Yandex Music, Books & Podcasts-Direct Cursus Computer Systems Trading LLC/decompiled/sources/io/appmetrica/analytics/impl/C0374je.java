package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.je, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0374je {
    public final Map a;
    public final Object b;

    public C0374je(Object obj) {
        this(new HashMap(), obj);
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        return obj2 == null ? this.b : obj2;
    }

    public C0374je(HashMap hashMap, Object obj) {
        this.a = hashMap;
        this.b = obj;
    }

    public final void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }
}
