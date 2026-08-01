package e8;

import b8.InterfaceC0529a;

/* loaded from: classes2.dex */
public final class f0 implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f37292a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final C4489v f37293b = I.a("kotlin.UShort", S.f37264a);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.h(f37293b).n(((u7.t) obj).f41351n);
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new u7.t(decoder.d(f37293b).t());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37293b;
    }
}
