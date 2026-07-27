package a8;

/* loaded from: classes2.dex */
public final class Q extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final Q f4448c = new Q(S.f4449a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.h.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        P builder = (P) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        short d2 = aVar.d(this.f4442b, i);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f4446a;
        int i4 = builder.f4447b;
        builder.f4447b = i4 + 1;
        sArr[i4] = d2;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.h.e(sArr, "<this>");
        P p6 = new P();
        p6.f4446a = sArr;
        p6.f4447b = sArr.length;
        p6.b(10);
        return p6;
    }

    @Override // a8.M
    public final Object m() {
        return new short[0];
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        short[] content = (short[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            short s3 = content[i4];
            L descriptor = this.f4442b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.n(s3);
        }
    }
}
