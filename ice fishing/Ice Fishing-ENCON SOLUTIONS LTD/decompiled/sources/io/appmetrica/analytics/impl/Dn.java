package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class Dn {

    /* renamed from: a, reason: collision with root package name */
    public final Cn f4327a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction f4328b;

    /* renamed from: c, reason: collision with root package name */
    public final Cf f4329c;

    public Dn() {
        this(new An(), new C0558la(), C0294b4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Bn());
        try {
            map = this.f4327a.c();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C0856wn) this.f4328b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Dn(Cn cn, C0558la c0558la, C0709r6 c0709r6) {
        this.f4327a = cn;
        this.f4328b = c0558la;
        this.f4329c = c0709r6;
    }
}
