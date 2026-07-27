package a8;

/* renamed from: a8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0445l implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0445l f4489a = new C0445l();

    /* renamed from: b, reason: collision with root package name */
    public static final N f4490b = new N("kotlin.Char", Y7.c.i);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.d(((Character) obj).charValue());
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Character.valueOf(decoder.e());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4490b;
    }
}
