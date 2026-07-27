package e8;

import b8.C0531c;
import b8.InterfaceC0529a;

/* loaded from: classes2.dex */
public final class H implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final H f37250a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final G f37251b = G.f37249a;

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        Void value = (Void) obj;
        kotlin.jvm.internal.h.e(value, "value");
        throw new C0531c("'kotlin.Nothing' cannot be serialized");
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        throw new C0531c("'kotlin.Nothing' does not have instances");
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37251b;
    }
}
