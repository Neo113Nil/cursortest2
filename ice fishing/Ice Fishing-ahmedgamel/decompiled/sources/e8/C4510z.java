package e8;

import b8.InterfaceC0537a;

/* renamed from: e8.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4510z implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4510z f37413a = new C4510z();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37414b = new N("kotlin.Int", c8.c.f5810g);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        qVar.j(((Number) obj).intValue());
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Integer.valueOf(decoder.e());
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37414b;
    }
}
