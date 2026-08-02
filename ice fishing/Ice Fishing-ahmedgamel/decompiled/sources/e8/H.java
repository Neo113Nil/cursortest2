package e8;

import b8.C0539c;
import b8.InterfaceC0537a;

/* loaded from: classes2.dex */
public final class H implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final H f37326a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final G f37327b = G.f37325a;

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        Void value = (Void) obj;
        kotlin.jvm.internal.h.e(value, "value");
        throw new C0539c("'kotlin.Nothing' cannot be serialized");
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        throw new C0539c("'kotlin.Nothing' does not have instances");
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37327b;
    }
}
