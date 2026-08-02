package e8;

import b8.InterfaceC0537a;
import u7.C5089o;

/* loaded from: classes2.dex */
public final class Z implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f37352a = new Z();

    /* renamed from: b, reason: collision with root package name */
    public static final C4506v f37353b = I.a("kotlin.UInt", C4510z.f37413a);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        qVar.h(f37353b).j(((C5089o) obj).f41066n);
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C5089o(decoder.d(f37353b).e());
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37353b;
    }
}
