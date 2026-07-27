package a8;

/* renamed from: a8.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0458z implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0458z f4522a = new C0458z();

    /* renamed from: b, reason: collision with root package name */
    public static final N f4523b = new N("kotlin.Int", Y7.c.f4038l);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.j(((Number) obj).intValue());
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Integer.valueOf(decoder.h());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4523b;
    }
}
