package f8;

import a.AbstractC0422a;
import b8.InterfaceC0529a;
import e8.C4471c;
import java.util.List;

/* loaded from: classes2.dex */
public final class g implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f37546a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f37547b = f.f37543b;

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        e value = (e) obj;
        kotlin.jvm.internal.h.e(value, "value");
        AbstractC0422a.e(qVar);
        p pVar = p.f37573a;
        new C4471c().a(qVar, value);
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        AbstractC0422a.g(decoder);
        p pVar = p.f37573a;
        return new e((List) new C4471c().b(decoder));
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37547b;
    }
}
