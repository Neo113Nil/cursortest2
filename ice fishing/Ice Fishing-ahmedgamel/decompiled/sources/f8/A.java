package f8;

import b8.InterfaceC0537a;
import e8.T;
import java.util.Map;

/* loaded from: classes2.dex */
public final class A implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final A f37494a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final z f37495b = z.f37546b;

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        y value = (y) obj;
        kotlin.jvm.internal.h.e(value, "value");
        com.bumptech.glide.d.a(qVar);
        T t6 = T.f37342a;
        p pVar = p.f37535a;
        new e8.B().a(qVar, value);
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        com.bumptech.glide.d.c(decoder);
        T t6 = T.f37342a;
        p pVar = p.f37535a;
        return new y((Map) new e8.B().b(decoder));
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37495b;
    }
}
