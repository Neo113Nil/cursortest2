package e8;

import b8.InterfaceC0537a;

/* loaded from: classes2.dex */
public final class T implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final T f37342a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37343b = new N("kotlin.String", c8.c.f5812j);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        String value = (String) obj;
        kotlin.jvm.internal.h.e(value, "value");
        qVar.o(value);
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return decoder.g();
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37343b;
    }
}
