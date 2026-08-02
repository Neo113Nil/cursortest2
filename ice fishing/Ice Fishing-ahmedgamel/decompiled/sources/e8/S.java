package e8;

import b8.InterfaceC0537a;

/* loaded from: classes2.dex */
public final class S implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final S f37340a = new S();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37341b = new N("kotlin.Short", c8.c.i);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        qVar.n(((Number) obj).shortValue());
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Short.valueOf(decoder.t());
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37341b;
    }
}
