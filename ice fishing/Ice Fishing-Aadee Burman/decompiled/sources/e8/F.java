package e8;

import b8.InterfaceC0529a;

/* loaded from: classes2.dex */
public final class F implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final F f37247a = new F();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37248b = new N("kotlin.Long", c8.c.f5635h);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.k(((Number) obj).longValue());
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Long.valueOf(decoder.j());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37248b;
    }
}
