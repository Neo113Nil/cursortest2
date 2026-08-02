package f8;

import b8.InterfaceC0537a;
import e8.C4488c;
import java.util.List;

/* loaded from: classes2.dex */
public final class g implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f37508a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f37509b = f.f37505b;

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        e value = (e) obj;
        kotlin.jvm.internal.h.e(value, "value");
        com.bumptech.glide.d.a(qVar);
        p pVar = p.f37535a;
        new C4488c().a(qVar, value);
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        com.bumptech.glide.d.c(decoder);
        p pVar = p.f37535a;
        return new e((List) new C4488c().b(decoder));
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37509b;
    }
}
