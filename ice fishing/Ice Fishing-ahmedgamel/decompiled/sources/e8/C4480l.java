package e8;

import b8.InterfaceC0529a;

/* renamed from: e8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4480l implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4480l f37304a = new C4480l();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37305b = new N("kotlin.Char", c8.c.f5631d);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.d(((Character) obj).charValue());
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Character.valueOf(decoder.b());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37305b;
    }
}
