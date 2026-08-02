package e8;

import b8.InterfaceC0537a;

/* loaded from: classes2.dex */
public final class f0 implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f37368a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final C4506v f37369b = I.a("kotlin.UShort", S.f37340a);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        qVar.h(f37369b).n(((u7.t) obj).f41071n);
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new u7.t(decoder.d(f37369b).t());
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37369b;
    }
}
