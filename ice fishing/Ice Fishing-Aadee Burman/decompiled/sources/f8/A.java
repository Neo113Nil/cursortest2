package f8;

import a.AbstractC0422a;
import b8.InterfaceC0529a;
import e8.T;
import java.util.Map;

/* loaded from: classes2.dex */
public final class A implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final A f37532a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final z f37533b = z.f37584b;

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        y value = (y) obj;
        kotlin.jvm.internal.h.e(value, "value");
        AbstractC0422a.e(qVar);
        T t6 = T.f37266a;
        p pVar = p.f37573a;
        new e8.B().a(qVar, value);
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        AbstractC0422a.g(decoder);
        T t6 = T.f37266a;
        p pVar = p.f37573a;
        return new y((Map) new e8.B().b(decoder));
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37533b;
    }
}
