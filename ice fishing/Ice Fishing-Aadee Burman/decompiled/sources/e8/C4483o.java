package e8;

/* renamed from: e8.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4483o extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4483o f37309c = new C4483o(C4484p.f37310a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.h.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        C4482n builder = (C4482n) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        double s9 = aVar.s(this.f37257b, i);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f37307a;
        int i6 = builder.f37308b;
        builder.f37308b = i6 + 1;
        dArr[i6] = s9;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.h.e(dArr, "<this>");
        C4482n c4482n = new C4482n();
        c4482n.f37307a = dArr;
        c4482n.f37308b = dArr.length;
        c4482n.b(10);
        return c4482n;
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
        for (int i6 = 0; i6 < i; i6++) {
            double d2 = content[i6];
            L descriptor = this.f37257b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i6);
            encoder.e(d2);
        }
    }
}
