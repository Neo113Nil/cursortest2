package e8;

/* renamed from: e8.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4500o extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4500o f37385c = new C4500o(C4501p.f37386a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.h.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        C4499n builder = (C4499n) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        double s9 = aVar.s(this.f37333b, i);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f37383a;
        int i4 = builder.f37384b;
        builder.f37384b = i4 + 1;
        dArr[i4] = s9;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.h.e(dArr, "<this>");
        C4499n c4499n = new C4499n();
        c4499n.f37383a = dArr;
        c4499n.f37384b = dArr.length;
        c4499n.b(10);
        return c4499n;
    }

    @Override // e8.M
    public final Object m() {
        return new double[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        double[] content = (double[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            double d9 = content[i4];
            L descriptor = this.f37333b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.e(d9);
        }
    }
}
