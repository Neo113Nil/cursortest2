package e8;

/* renamed from: e8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4490e extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4490e f37364c = new C4490e(C4491f.f37366a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.h.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        C4489d builder = (C4489d) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        boolean n9 = aVar.n(this.f37333b, i);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f37360a;
        int i4 = builder.f37361b;
        builder.f37361b = i4 + 1;
        zArr[i4] = n9;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.h.e(zArr, "<this>");
        C4489d c4489d = new C4489d();
        c4489d.f37360a = zArr;
        c4489d.f37361b = zArr.length;
        c4489d.b(10);
        return c4489d;
    }

    @Override // e8.M
    public final Object m() {
        return new boolean[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            boolean z6 = content[i4];
            L descriptor = this.f37333b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.b(z6);
        }
    }
}
