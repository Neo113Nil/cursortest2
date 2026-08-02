package e8;

import b8.InterfaceC0537a;
import u7.C5087m;

/* loaded from: classes2.dex */
public final class W implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final W f37347a = new W();

    /* renamed from: b, reason: collision with root package name */
    public static final C4506v f37348b = I.a("kotlin.UByte", C4494i.f37375a);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        qVar.h(f37348b).c(((C5087m) obj).f41064n);
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C5087m(decoder.d(f37348b).r());
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37348b;
    }
}
