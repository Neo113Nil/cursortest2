package f8;

import a.AbstractC0422a;
import b8.InterfaceC0529a;

/* loaded from: classes2.dex */
public final class p implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f37573a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final c8.f f37574b = d6.c.c("kotlinx.serialization.json.JsonElement", c8.b.f5628b, new c8.e[0], o.f37570u);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        l value = (l) obj;
        kotlin.jvm.internal.h.e(value, "value");
        AbstractC0422a.e(qVar);
        if (value instanceof C) {
            qVar.m(D.f37534a, value);
        } else if (value instanceof y) {
            qVar.m(A.f37532a, value);
        } else if (value instanceof e) {
            qVar.m(g.f37546a, value);
        }
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return AbstractC0422a.g(decoder).T();
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37574b;
    }
}
