package a8;

/* renamed from: a8.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0457y extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0457y f4521c = new C0457y(C0458z.f4522a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.h.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        C0456x builder = (C0456x) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        int t9 = aVar.t(this.f4442b, i);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f4519a;
        int i4 = builder.f4520b;
        builder.f4520b = i4 + 1;
        iArr[i4] = t9;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.h.e(iArr, "<this>");
        C0456x c0456x = new C0456x();
        c0456x.f4519a = iArr;
        c0456x.f4520b = iArr.length;
        c0456x.b(10);
        return c0456x;
    }

    @Override // a8.M
    public final Object m() {
        return new int[0];
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            int i9 = content[i4];
            L descriptor = this.f4442b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.j(i9);
        }
    }
}
