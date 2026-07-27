package e8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class B extends AbstractC4469a {

    /* renamed from: a, reason: collision with root package name */
    public final A f37242a;

    public B() {
        T t6 = T.f37266a;
        f8.p pVar = f8.p.f37573a;
        this.f37242a = new A(T.f37267b, f8.p.f37574b);
    }

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        g(obj);
        A descriptor = this.f37242a;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        g8.q a9 = qVar.a(descriptor);
        Iterator f3 = f(obj);
        int i = 0;
        while (f3.hasNext()) {
            Map.Entry entry = (Map.Entry) f3.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i6 = i + 1;
            a9.l(descriptor, i, T.f37266a, key);
            i += 2;
            a9.l(descriptor, i6, f8.p.f37573a, value);
        }
        a9.p(descriptor);
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return this.f37242a;
    }

    @Override // e8.AbstractC4469a
    public final Object d() {
        return new LinkedHashMap();
    }

    @Override // e8.AbstractC4469a
    public final int e(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.h.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // e8.AbstractC4469a
    public final Iterator f(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.h.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.h.e(map, "<this>");
        return map.size();
    }

    @Override // e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        Object i6;
        Map builder = (Map) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        T t6 = T.f37266a;
        A a9 = this.f37242a;
        Object i9 = aVar.i(a9, i, t6, null);
        int c9 = aVar.c(a9);
        if (c9 != i + 1) {
            throw new IllegalArgumentException(u1.h.c(i, c9, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        if (builder.containsKey(i9)) {
            f8.p pVar = f8.p.f37573a;
            if (!(f8.p.f37574b.f5638b instanceof c8.d)) {
                i6 = aVar.i(a9, c9, pVar, v7.t.O(i9, builder));
                builder.put(i9, i6);
            }
        }
        i6 = aVar.i(a9, c9, f8.p.f37573a, null);
        builder.put(i9, i6);
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        kotlin.jvm.internal.h.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // e8.AbstractC4469a
    public final Object k(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.h.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
