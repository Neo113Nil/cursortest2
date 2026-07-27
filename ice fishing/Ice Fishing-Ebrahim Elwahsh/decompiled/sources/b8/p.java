package b8;

/* loaded from: classes2.dex */
public final class p implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f5617a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final Y7.f f5618b = com.bumptech.glide.d.c("kotlinx.serialization.json.JsonElement", Y7.b.f4033g, new Y7.e[0], o.f5614u);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        l value = (l) obj;
        kotlin.jvm.internal.h.e(value, "value");
        p8.g.a(rVar);
        if (value instanceof C) {
            rVar.m(D.f5578a, value);
        } else if (value instanceof y) {
            rVar.m(A.f5576a, value);
        } else if (value instanceof e) {
            rVar.m(g.f5590a, value);
        }
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return p8.g.c(decoder).Y();
    }

    @Override // X7.a
    public final Y7.e c() {
        return f5618b;
    }
}
