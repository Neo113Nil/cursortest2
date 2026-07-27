package e8;

import b8.InterfaceC0529a;
import u7.C5095m;

/* loaded from: classes2.dex */
public final class W implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final W f37271a = new W();

    /* renamed from: b, reason: collision with root package name */
    public static final C4489v f37272b = I.a("kotlin.UByte", C4477i.f37299a);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.h(f37272b).c(((C5095m) obj).f41341n);
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C5095m(decoder.d(f37272b).r());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37272b;
    }
}
