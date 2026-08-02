package e8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class B extends AbstractC4486a {

    /* renamed from: a, reason: collision with root package name */
    public final A f37318a;

    public B() {
        T t6 = T.f37342a;
        f8.p pVar = f8.p.f37535a;
        this.f37318a = new A(T.f37343b, f8.p.f37536b);
    }

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        g(obj);
        A descriptor = this.f37318a;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        g8.q a9 = qVar.a(descriptor);
        Iterator f2 = f(obj);
        int i = 0;
        while (f2.hasNext()) {
            Map.Entry entry = (Map.Entry) f2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i4 = i + 1;
            a9.l(descriptor, i, T.f37342a, key);
            i += 2;
            a9.l(descriptor, i4, f8.p.f37535a, value);
        }
        a9.p(descriptor);
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return this.f37318a;
    }

    @Override // e8.AbstractC4486a
    public final Object d() {
        return new LinkedHashMap();
    }

    @Override // e8.AbstractC4486a
    public final int e(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.h.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // e8.AbstractC4486a
    public final Iterator f(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.h.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.h.e(map, "<this>");
        return map.size();
    }

    @Override // e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        Object i4;
        Map builder = (Map) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        T t6 = T.f37342a;
        A a9 = this.f37318a;
        Object i6 = aVar.i(a9, i, t6, null);
        int c9 = aVar.c(a9);
        if (c9 != i + 1) {
            throw new IllegalArgumentException(AbstractC5128c.c(i, c9, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        if (builder.containsKey(i6)) {
            f8.p pVar = f8.p.f37535a;
            if (!(f8.p.f37536b.f5814b instanceof c8.d)) {
                i4 = aVar.i(a9, c9, pVar, v7.t.s(i6, builder));
                builder.put(i6, i4);
            }
        }
        i4 = aVar.i(a9, c9, f8.p.f37535a, null);
        builder.put(i6, i4);
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        kotlin.jvm.internal.h.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // e8.AbstractC4486a
    public final Object k(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.h.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
