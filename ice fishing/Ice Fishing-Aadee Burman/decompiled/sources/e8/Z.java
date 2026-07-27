package e8;

import b8.InterfaceC0529a;
import u7.C5097o;

/* loaded from: classes2.dex */
public final class Z implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f37276a = new Z();

    /* renamed from: b, reason: collision with root package name */
    public static final C4489v f37277b = I.a("kotlin.UInt", C4493z.f37337a);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.h(f37277b).j(((C5097o) obj).f41343n);
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C5097o(decoder.d(f37277b).e());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37277b;
    }
}
