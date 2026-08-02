package e8;

import b8.InterfaceC0537a;

/* renamed from: e8.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4505u implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4505u f37398a = new C4505u();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37399b = new N("kotlin.Float", c8.c.f5809f);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        qVar.g(((Number) obj).floatValue());
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Float.valueOf(decoder.u());
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37399b;
    }
}
