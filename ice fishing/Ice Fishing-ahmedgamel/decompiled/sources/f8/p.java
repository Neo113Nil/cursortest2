package f8;

import b8.InterfaceC0537a;

/* loaded from: classes2.dex */
public final class p implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f37535a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final c8.f f37536b = com.bumptech.glide.g.d("kotlinx.serialization.json.JsonElement", c8.b.f5804b, new c8.e[0], o.f37532u);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        l value = (l) obj;
        kotlin.jvm.internal.h.e(value, "value");
        com.bumptech.glide.d.a(qVar);
        if (value instanceof C) {
            qVar.m(D.f37496a, value);
        } else if (value instanceof y) {
            qVar.m(A.f37494a, value);
        } else if (value instanceof e) {
            qVar.m(g.f37508a, value);
        }
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return com.bumptech.glide.d.c(decoder).X();
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37536b;
    }
}
