package e8;

import b8.InterfaceC0529a;

/* loaded from: classes2.dex */
public final class T implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final T f37266a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37267b = new N("kotlin.String", c8.c.f5636j);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        String value = (String) obj;
        kotlin.jvm.internal.h.e(value, "value");
        qVar.o(value);
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return decoder.g();
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37267b;
    }
}
