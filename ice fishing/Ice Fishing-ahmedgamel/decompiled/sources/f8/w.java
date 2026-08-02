package f8;

import b8.InterfaceC0537a;
import v7.AbstractC5118i;

/* loaded from: classes2.dex */
public final class w implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f37543a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final c8.f f37544b;

    static {
        c8.h hVar = c8.h.f5826c;
        c8.e[] eVarArr = new c8.e[0];
        if (Q7.j.s0("kotlinx.serialization.json.JsonNull")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (hVar.equals(c8.i.f5827b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        c8.a aVar = new c8.a("kotlinx.serialization.json.JsonNull");
        f37544b = new c8.f("kotlinx.serialization.json.JsonNull", hVar, aVar.f5799b.size(), AbstractC5118i.B(eVarArr), aVar);
    }

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        v value = (v) obj;
        kotlin.jvm.internal.h.e(value, "value");
        com.bumptech.glide.d.a(qVar);
        qVar.f37763a.l("null");
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        com.bumptech.glide.d.c(decoder);
        if (decoder.m()) {
            throw new g8.g("Expected 'null' literal");
        }
        return v.INSTANCE;
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37544b;
    }
}
