package a8;

/* renamed from: a8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0439f implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0439f f4475a = new C0439f();

    /* renamed from: b, reason: collision with root package name */
    public static final N f4476b = new N("kotlin.Boolean", Y7.c.f4034g);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.b(((Boolean) obj).booleanValue());
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Boolean.valueOf(decoder.c());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4476b;
    }
}
