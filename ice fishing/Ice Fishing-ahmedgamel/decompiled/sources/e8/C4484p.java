package e8;

import b8.InterfaceC0529a;

/* renamed from: e8.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4484p implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4484p f37310a = new C4484p();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37311b = new N("kotlin.Double", c8.c.f5632e);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.e(((Number) obj).doubleValue());
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Double.valueOf(decoder.v());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37311b;
    }
}
