package e8;

/* renamed from: e8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4496k extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4496k f37379c = new C4496k(C4497l.f37380a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.h.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        C4495j builder = (C4495j) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        char x9 = aVar.x(this.f37333b, i);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f37377a;
        int i4 = builder.f37378b;
        builder.f37378b = i4 + 1;
        cArr[i4] = x9;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.h.e(cArr, "<this>");
        C4495j c4495j = new C4495j();
        c4495j.f37377a = cArr;
        c4495j.f37378b = cArr.length;
        c4495j.b(10);
        return c4495j;
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
        for (int i4 = 0; i4 < i; i4++) {
            char c9 = content[i4];
            L descriptor = this.f37333b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.d(c9);
        }
    }
}
