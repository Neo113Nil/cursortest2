package f8;

import b8.InterfaceC0537a;
import v7.AbstractC5118i;

/* loaded from: classes2.dex */
public final class D implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final D f37496a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final c8.f f37497b;

    static {
        c8.c cVar = c8.c.f5812j;
        c8.e[] eVarArr = new c8.e[0];
        if (Q7.j.s0("kotlinx.serialization.json.JsonPrimitive")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (cVar.equals(c8.i.f5827b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        c8.a aVar = new c8.a("kotlinx.serialization.json.JsonPrimitive");
        f37497b = new c8.f("kotlinx.serialization.json.JsonPrimitive", cVar, aVar.f5799b.size(), AbstractC5118i.B(eVarArr), aVar);
    }

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        C value = (C) obj;
        kotlin.jvm.internal.h.e(value, "value");
        com.bumptech.glide.d.a(qVar);
        if (value instanceof v) {
            qVar.m(w.f37543a, v.INSTANCE);
        } else {
            qVar.m(t.f37540a, (s) value);
        }
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        l X8 = com.bumptech.glide.d.c(decoder).X();
        if (X8 instanceof C) {
            return (C) X8;
        }
        throw g8.l.b(-1, X8.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.s.a(X8.getClass()));
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37497b;
    }
}
