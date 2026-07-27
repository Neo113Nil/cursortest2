package f8;

import a.AbstractC0422a;
import b8.InterfaceC0529a;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class w implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f37581a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final c8.f f37582b;

    static {
        c8.h hVar = c8.h.f5650c;
        c8.e[] eVarArr = new c8.e[0];
        if (Q7.j.c0("kotlinx.serialization.json.JsonNull")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (hVar.equals(c8.i.f5651b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        c8.a aVar = new c8.a("kotlinx.serialization.json.JsonNull");
        f37582b = new c8.f("kotlinx.serialization.json.JsonNull", hVar, aVar.f5623b.size(), AbstractC5128i.y(eVarArr), aVar);
    }

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        v value = (v) obj;
        kotlin.jvm.internal.h.e(value, "value");
        AbstractC0422a.e(qVar);
        qVar.f37737a.l("null");
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        AbstractC0422a.g(decoder);
        if (decoder.m()) {
            throw new g8.g("Expected 'null' literal");
        }
        return v.INSTANCE;
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37582b;
    }
}
