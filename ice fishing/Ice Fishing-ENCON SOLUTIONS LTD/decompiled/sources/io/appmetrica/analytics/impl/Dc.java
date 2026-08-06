package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Dc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4298a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4299b;

    public Dc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f4298a.put(obj, obj2);
    }

    public Dc(HashMap hashMap, Object obj) {
        this.f4298a = hashMap;
        this.f4299b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f4298a.get(obj);
        return obj2 == null ? this.f4299b : obj2;
    }
}
