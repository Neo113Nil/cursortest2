package e8;

import b8.InterfaceC0529a;

/* renamed from: e8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4474f implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4474f f37290a = new C4474f();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37291b = new N("kotlin.Boolean", c8.c.f5629b);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.b(((Boolean) obj).booleanValue());
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Boolean.valueOf(decoder.a());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37291b;
    }
}
