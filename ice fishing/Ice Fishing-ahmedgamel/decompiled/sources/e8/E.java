package e8;

/* loaded from: classes2.dex */
public final class E extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final E f37322c = new E(F.f37323a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.h.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        D builder = (D) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        long w3 = aVar.w(this.f37333b, i);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f37320a;
        int i4 = builder.f37321b;
        builder.f37321b = i4 + 1;
        jArr[i4] = w3;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.h.e(jArr, "<this>");
        D d9 = new D();
        d9.f37320a = jArr;
        d9.f37321b = jArr.length;
        d9.b(10);
        return d9;
    }

    @Override // e8.M
    public final Object m() {
        return new long[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        long[] content = (long[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            long j6 = content[i4];
            L descriptor = this.f37333b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.k(j6);
        }
    }
}
