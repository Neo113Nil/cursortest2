package e8;

import b8.InterfaceC0537a;

/* renamed from: e8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4497l implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4497l f37380a = new C4497l();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37381b = new N("kotlin.Char", c8.c.f5807d);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        qVar.d(((Character) obj).charValue());
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Character.valueOf(decoder.b());
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37381b;
    }
}
