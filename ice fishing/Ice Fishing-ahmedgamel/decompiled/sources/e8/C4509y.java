package e8;

/* renamed from: e8.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4509y extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4509y f37412c = new C4509y(C4510z.f37413a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.h.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        C4508x builder = (C4508x) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        int f2 = aVar.f(this.f37333b, i);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f37410a;
        int i4 = builder.f37411b;
        builder.f37411b = i4 + 1;
        iArr[i4] = f2;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.h.e(iArr, "<this>");
        C4508x c4508x = new C4508x();
        c4508x.f37410a = iArr;
        c4508x.f37411b = iArr.length;
        c4508x.b(10);
        return c4508x;
    }

    @Override // e8.M
    public final Object m() {
        return new int[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            int i6 = content[i4];
            L descriptor = this.f37333b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.j(i6);
        }
    }
}
