package b8;

import r7.AbstractC4978i;

/* loaded from: classes2.dex */
public final class w implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f5625a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final Y7.f f5626b;

    static {
        Y7.h hVar = Y7.h.f4055h;
        Y7.e[] eVarArr = new Y7.e[0];
        if (M7.j.T("kotlinx.serialization.json.JsonNull")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (hVar.equals(Y7.i.f4056g)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        Y7.a aVar = new Y7.a("kotlinx.serialization.json.JsonNull");
        f5626b = new Y7.f("kotlinx.serialization.json.JsonNull", hVar, aVar.f4028b.size(), AbstractC4978i.P(eVarArr), aVar);
    }

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        v value = (v) obj;
        kotlin.jvm.internal.h.e(value, "value");
        p8.g.a(rVar);
        rVar.f5795a.k("null");
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        p8.g.c(decoder);
        if (decoder.n()) {
            throw new c8.h("Expected 'null' literal");
        }
        return v.INSTANCE;
    }

    @Override // X7.a
    public final Y7.e c() {
        return f5626b;
    }
}
