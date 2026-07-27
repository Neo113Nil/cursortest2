package a8;

/* loaded from: classes2.dex */
public final class F implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final F f4432a = new F();

    /* renamed from: b, reason: collision with root package name */
    public static final N f4433b = new N("kotlin.Long", Y7.c.f4039m);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.k(((Number) obj).longValue());
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Long.valueOf(decoder.m());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4433b;
    }
}
