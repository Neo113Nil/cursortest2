package e8;

import b8.InterfaceC0529a;

/* renamed from: e8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4477i implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4477i f37299a = new C4477i();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37300b = new N("kotlin.Byte", c8.c.f5630c);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        qVar.c(((Number) obj).byteValue());
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Byte.valueOf(decoder.r());
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37300b;
    }
}
