package e8;

import b8.InterfaceC0529a;
import u7.C5099q;

/* loaded from: classes2.dex */
public final class c0 implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f37282a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final C4489v f37283b = I.a("kotlin.ULong", F.f37247a);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.h(f37283b).k(((C5099q) obj).f41348n);
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C5099q(decoder.d(f37283b).j());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37283b;
    }
}
