package a8;

/* renamed from: a8.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0453u implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0453u f4507a = new C0453u();

    /* renamed from: b, reason: collision with root package name */
    public static final N f4508b = new N("kotlin.Float", Y7.c.f4037k);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.g(((Number) obj).floatValue());
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Float.valueOf(decoder.w());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4508b;
    }
}
