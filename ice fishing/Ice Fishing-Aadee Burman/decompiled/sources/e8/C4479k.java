package e8;

/* renamed from: e8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4479k extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4479k f37303c = new C4479k(C4480l.f37304a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.h.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        C4478j builder = (C4478j) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        char x9 = aVar.x(this.f37257b, i);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f37301a;
        int i6 = builder.f37302b;
        builder.f37302b = i6 + 1;
        cArr[i6] = x9;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.h.e(cArr, "<this>");
        C4478j c4478j = new C4478j();
        c4478j.f37301a = cArr;
        c4478j.f37302b = cArr.length;
        c4478j.b(10);
        return c4478j;
    }

    @Override // e8.M
    public final Object m() {
        return new char[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        char[] content = (char[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i6 = 0; i6 < i; i6++) {
            char c9 = content[i6];
            L descriptor = this.f37257b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i6);
            encoder.d(c9);
        }
    }
}
