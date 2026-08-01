package e8;

import b8.InterfaceC0529a;

/* renamed from: e8.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4493z implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4493z f37337a = new C4493z();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37338b = new N("kotlin.Int", c8.c.f5634g);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.j(((Number) obj).intValue());
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Integer.valueOf(decoder.e());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37338b;
    }
}
