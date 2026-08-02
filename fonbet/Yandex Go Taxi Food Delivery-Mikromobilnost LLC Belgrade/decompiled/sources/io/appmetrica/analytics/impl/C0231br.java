package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.appmetrica.analytics.impl.br, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0231br {
    public final InterfaceC0202ar a;
    public final BiFunction b;
    public final InterfaceC0626pi c;

    public C0231br() {
        this(new Yq(), new Eb(), V4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Zq());
        try {
            map = this.a.c();
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
                arrayList.add((Uq) this.b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public C0231br(InterfaceC0202ar interfaceC0202ar, Eb eb, C0615p7 c0615p7) {
        this.a = interfaceC0202ar;
        this.b = eb;
        this.c = c0615p7;
    }
}
