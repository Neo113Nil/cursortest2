package b8;

import r7.AbstractC4978i;

/* loaded from: classes2.dex */
public final class D implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final D f5578a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final Y7.f f5579b;

    static {
        Y7.c cVar = Y7.c.f4041o;
        Y7.e[] eVarArr = new Y7.e[0];
        if (M7.j.T("kotlinx.serialization.json.JsonPrimitive")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (cVar.equals(Y7.i.f4056g)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        Y7.a aVar = new Y7.a("kotlinx.serialization.json.JsonPrimitive");
        f5579b = new Y7.f("kotlinx.serialization.json.JsonPrimitive", cVar, aVar.f4028b.size(), AbstractC4978i.P(eVarArr), aVar);
    }

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        C value = (C) obj;
        kotlin.jvm.internal.h.e(value, "value");
        p8.g.a(rVar);
        if (value instanceof v) {
            rVar.m(w.f5625a, v.INSTANCE);
        } else {
            rVar.m(t.f5622a, (s) value);
        }
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        l Y = p8.g.c(decoder).Y();
        if (Y instanceof C) {
            return (C) Y;
        }
        throw c8.m.b(-1, Y.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.s.a(Y.getClass()));
    }

    @Override // X7.a
    public final Y7.e c() {
        return f5579b;
    }
}
