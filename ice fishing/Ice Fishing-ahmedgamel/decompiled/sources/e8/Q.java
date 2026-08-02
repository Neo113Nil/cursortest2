package e8;

/* loaded from: classes2.dex */
public final class Q extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final Q f37339c = new Q(S.f37340a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.h.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        P builder = (P) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        short o4 = aVar.o(this.f37333b, i);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f37337a;
        int i4 = builder.f37338b;
        builder.f37338b = i4 + 1;
        sArr[i4] = o4;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.h.e(sArr, "<this>");
        P p9 = new P();
        p9.f37337a = sArr;
        p9.f37338b = sArr.length;
        p9.b(10);
        return p9;
    }

    @Override // e8.M
    public final Object m() {
        return new short[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        short[] content = (short[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            short s9 = content[i4];
            L descriptor = this.f37333b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.n(s9);
        }
    }
}
