package f8;

import a.AbstractC0422a;
import b8.InterfaceC0529a;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class D implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final D f37534a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final c8.f f37535b;

    static {
        c8.c cVar = c8.c.f5636j;
        c8.e[] eVarArr = new c8.e[0];
        if (Q7.j.c0("kotlinx.serialization.json.JsonPrimitive")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (cVar.equals(c8.i.f5651b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        c8.a aVar = new c8.a("kotlinx.serialization.json.JsonPrimitive");
        f37535b = new c8.f("kotlinx.serialization.json.JsonPrimitive", cVar, aVar.f5623b.size(), AbstractC5128i.y(eVarArr), aVar);
    }

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        C value = (C) obj;
        kotlin.jvm.internal.h.e(value, "value");
        AbstractC0422a.e(qVar);
        if (value instanceof v) {
            qVar.m(w.f37581a, v.INSTANCE);
        } else {
            qVar.m(t.f37578a, (s) value);
        }
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        l T8 = AbstractC0422a.g(decoder).T();
        if (T8 instanceof C) {
            return (C) T8;
        }
        throw g8.l.b(-1, T8.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.s.a(T8.getClass()));
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37535b;
    }
}
