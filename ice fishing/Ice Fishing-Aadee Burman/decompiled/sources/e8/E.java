package e8;

/* loaded from: classes2.dex */
public final class E extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final E f37246c = new E(F.f37247a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.h.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        D builder = (D) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        long w6 = aVar.w(this.f37257b, i);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f37244a;
        int i6 = builder.f37245b;
        builder.f37245b = i6 + 1;
        jArr[i6] = w6;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.h.e(jArr, "<this>");
        D d2 = new D();
        d2.f37244a = jArr;
        d2.f37245b = jArr.length;
        d2.b(10);
        return d2;
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
        for (int i6 = 0; i6 < i; i6++) {
            long j6 = content[i6];
            L descriptor = this.f37257b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i6);
            encoder.k(j6);
        }
    }
}
