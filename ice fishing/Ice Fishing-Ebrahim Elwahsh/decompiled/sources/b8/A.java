package b8;

import a8.T;
import java.util.Map;

/* loaded from: classes2.dex */
public final class A implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final A f5576a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final z f5577b = z.f5628b;

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        y value = (y) obj;
        kotlin.jvm.internal.h.e(value, "value");
        p8.g.a(rVar);
        T t9 = T.f4451a;
        p pVar = p.f5617a;
        new a8.B().a(rVar, value);
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        p8.g.c(decoder);
        T t9 = T.f4451a;
        p pVar = p.f5617a;
        return new y((Map) new a8.B().b(decoder));
    }

    @Override // X7.a
    public final Y7.e c() {
        return f5577b;
    }
}
