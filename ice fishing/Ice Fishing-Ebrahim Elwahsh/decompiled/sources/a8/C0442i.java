package a8;

/* renamed from: a8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0442i implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0442i f4484a = new C0442i();

    /* renamed from: b, reason: collision with root package name */
    public static final N f4485b = new N("kotlin.Byte", Y7.c.f4035h);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.c(((Number) obj).byteValue());
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Byte.valueOf(decoder.u());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4485b;
    }
}
