package e8;

import b8.InterfaceC0537a;
import u7.C5091q;

/* loaded from: classes2.dex */
public final class c0 implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f37358a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final C4506v f37359b = I.a("kotlin.ULong", F.f37323a);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        qVar.h(f37359b).k(((C5091q) obj).f41068n);
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C5091q(decoder.d(f37359b).j());
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37359b;
    }
}
